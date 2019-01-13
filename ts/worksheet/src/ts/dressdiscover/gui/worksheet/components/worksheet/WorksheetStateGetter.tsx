import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { inject, observer } from 'mobx-react';
import * as React from 'react';
import * as ReactLoader from 'react-loader';

import { WorksheetDefinitionWrapper } from '../../models/worksheet/WorksheetDefinitionWrapper';
import { WorksheetStore } from '../../stores/worksheet/WorksheetStore';
import { GenericErrorHandler } from '../error/GenericErrorHandler';

interface Props {
    render: (worksheetDefinition: WorksheetDefinitionWrapper, worksheetState: WorksheetState) => React.ReactNode;
    worksheetStateId: WorksheetStateId;
    worksheetStore?: WorksheetStore;
}

@inject("worksheetStore")
@observer
export class WorksheetStateGetter extends React.Component<Props> {
    componentDidMount() {
        this.props.worksheetStore!.getWorksheetDefinition();
        this.props.worksheetStore!.getWorksheetState({ id: this.props.worksheetStateId });
    }

    render() {
        if (this.props.worksheetStore!.error) {
            return <GenericErrorHandler error={this.props.worksheetStore!.error}></GenericErrorHandler>;
        }

        const worksheetDefinition = this.props.worksheetStore!.worksheetDefinition;
        if (!worksheetDefinition) {
            return <ReactLoader loaded={false} />;
        }

        const worksheetStatesById = this.props.worksheetStore!.worksheetStatesById;
        const worksheetState = worksheetStatesById ? worksheetStatesById[this.props.worksheetStateId.toString()] : undefined;
        if (!worksheetState) {
            return <ReactLoader loaded={false} />;
        }

        return this.props.render(worksheetDefinition, worksheetState);
    }
}
