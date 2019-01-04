import { GenericErrorHandler } from 'dressdiscover/gui/worksheet/components/error/GenericErrorHandler';
import { WorksheetStateStore } from 'dressdiscover/gui/worksheet/stores/worksheet/WorksheetStateStore';
import { inject } from 'mobx-react';
import * as React from 'react';
import { Table } from 'reactstrap';

import { WorksheetStatesTableRow } from './WorksheetStatesTableRow';

interface Props {
    worksheetStateStore: WorksheetStateStore;
}

@inject("worksheetStateStore")
export class WorksheetStatesTable extends React.Component<Props> {
    constructor(props: Props) {
        super(props);
    }

    render() {
        if (this.props.worksheetStateStore.error) {
            return <GenericErrorHandler error={this.props.worksheetStateStore.error}></GenericErrorHandler>;
        }

        return (
            <Table className="table table-bordered table-striped w-100">
                <tbody>
                    {this.props.worksheetStateStore.worksheetStateIds.map((worksheetStateId) => {
                        <WorksheetStatesTableRow onDeleteWorksheetState={this.props.worksheetStateStore.deleteWorksheetState} onRenameWorksheetState={this.props.worksheetStateStore.renameWorksheetState} worksheetStateId={worksheetStateId}></WorksheetStatesTableRow>
                    })}
                </tbody>
            </Table>
        );
    }
}