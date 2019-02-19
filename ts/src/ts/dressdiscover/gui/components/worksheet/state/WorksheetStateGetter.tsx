import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/state/worksheet_state_mark';
import { GenericErrorHandler } from 'dressdiscover/gui/components/error/GenericErrorHandler';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/models/worksheet/definition/WorksheetDefinitionWrapper';
import { WorksheetStateWrapper } from 'dressdiscover/gui/models/worksheet/state/WorksheetStateWrapper';
import { CurrentUserStore } from 'dressdiscover/gui/stores/current_user/CurrentUserStore';
import { inject, observer } from 'mobx-react';
import * as React from 'react';
import * as ReactLoader from 'react-loader';

interface Props {
    currentUserStore?: CurrentUserStore;
    render: (worksheetState: WorksheetStateWrapper) => React.ReactNode;
    worksheetStateMark: WorksheetStateMark;
}

interface State {
    exception?: Exception;
    worksheetDefinition?: WorksheetDefinition;
    worksheetState?: WorksheetState;
}

@inject("currentUserStore")
@observer
export class WorksheetStateGetter extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.state = {};
    }

    async componentDidMount() {
        const { currentUserStore } = this.props;
        const worksheetStateId = this.props.worksheetStateMark.worksheetStateId;
        const self = this;
        const services = currentUserStore!.currentUserServices;

        try {
            const worksheetDefinition = await services.worksheetDefinitionQueryService.getWorksheetDefinition();
            this.setState((prevState) => ({ worksheetDefinition }));
        } catch (exception) {
            self.setState((prevState) => ({ exception }));
            return;
        }

        try {
            const worksheetState = await services.worksheetStateQueryService.getWorksheetState({ id: worksheetStateId });
            this.setState((prevState) => ({ worksheetState }));
        } catch (exception) {
            self.setState((prevState) => ({ exception }));
            return;
        }
    }

    render() {
        const { exception, worksheetDefinition, worksheetState } = this.state;

        if (exception) {
            return <GenericErrorHandler exception={exception}></GenericErrorHandler>;
        }

        if (!worksheetDefinition) {
            return <ReactLoader loaded={false} />;
        }

        if (!worksheetState) {
            return <ReactLoader loaded={false} />;
        }

        return this.props.render(new WorksheetStateWrapper(this.props.worksheetStateMark, new WorksheetDefinitionWrapper(worksheetDefinition), worksheetState));
    }
}
