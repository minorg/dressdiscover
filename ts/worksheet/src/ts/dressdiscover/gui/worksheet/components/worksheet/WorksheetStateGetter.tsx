import { inject, observer } from 'mobx-react';
import * as React from 'react';
import * as ReactLoader from 'react-loader';

import { WorksheetStateWrapper } from '../../models/worksheet/WorksheetStateWrapper';
import { WorksheetStore } from '../../stores/worksheet/WorksheetStore';
import { GenericErrorHandler } from '../error/GenericErrorHandler';

interface Props {
    render: (worksheetState: WorksheetStateWrapper) => React.ReactNode;
    worksheetStateMark: WorksheetStateMark;
    worksheetStore?: WorksheetStore;
}

@inject("worksheetStore")
@observer
export class WorksheetStateGetter extends React.Component<Props> {
    componentDidMount() {
        this.props.worksheetStore!.getWorksheetDefinition();
        this.props.worksheetStore!.getWorksheetState({ id: this.props.worksheetStateMark.worksheetStateId });
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
        const worksheetState = worksheetStatesById ? worksheetStatesById[this.props.worksheetStateMark.worksheetStateId.toString()] : undefined;
        if (!worksheetState) {
            return <ReactLoader loaded={false} />;
        }

        return this.props.render(new WorksheetStateWrapper(this.props.worksheetStateMark, worksheetDefinition, worksheetState));
    }
}
