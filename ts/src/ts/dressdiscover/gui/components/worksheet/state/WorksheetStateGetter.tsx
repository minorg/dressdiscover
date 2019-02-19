import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/state/worksheet_state_mark';
import { GenericErrorHandler } from 'dressdiscover/gui/components/error/GenericErrorHandler';
import { WorksheetStateWrapper } from 'dressdiscover/gui/models/worksheet/state/WorksheetStateWrapper';
import { WorksheetStore } from 'dressdiscover/gui/stores/worksheet/WorksheetStore';
import { inject, observer } from 'mobx-react';
import * as React from 'react';
import * as ReactLoader from 'react-loader';

interface Props {
    render: (worksheetState: WorksheetStateWrapper) => React.ReactNode;
    worksheetStateMark: WorksheetStateMark;
    worksheetStore?: WorksheetStore;
}

@inject("worksheetStore")
@observer
export class WorksheetStateGetter extends React.Component<Props> {
    componentDidMount() {
        const { worksheetStore } = this.props;
        worksheetStore!.getWorksheetDefinition();
        worksheetStore!.getWorksheetState({ id: this.props.worksheetStateMark.worksheetStateId });
    }

    render() {
        const { worksheetStore } = this.props;

        if (worksheetStore!.exception) {
            return <GenericErrorHandler exception={worksheetStore!.exception}></GenericErrorHandler>;
        }

        const worksheetDefinition = worksheetStore!.worksheetDefinition;
        if (!worksheetDefinition) {
            return <ReactLoader loaded={false} />;
        }

        const worksheetStatesById = worksheetStore!.worksheetStatesById;
        const worksheetState = worksheetStatesById ? worksheetStatesById[this.props.worksheetStateMark.worksheetStateId.toString()] : undefined;
        if (!worksheetState) {
            return <ReactLoader loaded={false} />;
        }

        return this.props.render(new WorksheetStateWrapper(this.props.worksheetStateMark, worksheetDefinition, worksheetState, worksheetStore!));
    }
}
