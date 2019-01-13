import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { inject } from 'mobx-react';
import * as React from 'react';
import * as ReactLoader from 'react-loader';

import { WorksheetStateStore } from '../../stores/worksheet/WorksheetStateStore';
import { GenericErrorHandler } from '../error/GenericErrorHandler';

interface Props {
    render: (worksheetState: WorksheetState) => React.ReactNode;
    worksheetStateId: WorksheetStateId;
    worksheetStateStore?: WorksheetStateStore;
}

@inject("worksheetStateStore")
export class WorksheetStateGetter extends React.Component<Props> {
    componentDidMount() {
        this.props.worksheetStateStore!.getWorksheetState({ id: this.props.worksheetStateId });
    }

    render() {
        if (this.props.worksheetStateStore!.error) {
            return <GenericErrorHandler error={this.props.worksheetStateStore!.error}></GenericErrorHandler>;
        }

        const worksheetStatesById = this.props.worksheetStateStore!.worksheetStatesById;
        const worksheetState = worksheetStatesById ? worksheetStatesById[this.props.worksheetStateId.toString()] : undefined;
        if (!worksheetState) {
            return <ReactLoader loaded={false} />;
        }

        return this.props.render(worksheetState);
    }
}
