import { WorksheetStateStore } from 'dressdiscover/gui/worksheet/stores/worksheet/WorksheetStateStore';
import { inject, observer } from 'mobx-react';
import * as React from 'react';
import { Table } from 'reactstrap';

import { WorksheetStatesTableRow } from './WorksheetStatesTableRow';

interface Props {
    worksheetStateStore?: WorksheetStateStore;
}

@inject("worksheetStateStore")
@observer
export class WorksheetStatesTable extends React.Component<Props> {
    render() {
        return (
            <Table className="table table-bordered w-100 worksheet-states">
                <tbody>
                    {this.props.worksheetStateStore!.worksheetStateIds!.map(worksheetStateId =>
                        <WorksheetStatesTableRow onDeleteWorksheetState={this.props.worksheetStateStore!.deleteWorksheetState.bind(this.props.worksheetStateStore)} onRenameWorksheetState={this.props.worksheetStateStore!.renameWorksheetState.bind(this.props.worksheetStateStore)} worksheetStateId={worksheetStateId}></WorksheetStatesTableRow>
                    )}
                </tbody>
            </Table>
        );
    }
}