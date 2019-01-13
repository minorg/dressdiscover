import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/worksheet_feature_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import * as _ from 'lodash';
import * as React from 'react';
import { Link } from 'react-router-dom';
import { Table } from 'reactstrap';

import { Hrefs } from '../../Hrefs';
import { WorksheetDefinitionWrapper } from '../../models/worksheet/WorksheetDefinitionWrapper';
import { WorksheetFeatureDefinitionWrapper } from '../../models/worksheet/WorksheetFeatureDefinitionWrapper';
import { WorksheetFeatureSetDefinitionWrapper } from '../../models/worksheet/WorksheetFeatureSetDefinitionWrapper';
import { WorksheetFeatureValueDefinitionWrapper } from '../../models/worksheet/WorksheetFeatureValueDefinitionWrapper';
import { WorksheetDescriptionComponent } from './WorksheetDescriptionComponent';

interface Props {
    featureSetDefinition: WorksheetFeatureSetDefinitionWrapper;
    featureSetState?: WorksheetFeatureSetState;
    includeFeatureDescriptions: boolean;
    worksheetDefinition: WorksheetDefinitionWrapper;
    worksheetStateId: WorksheetStateId;
}

export class WorksheetFeatureSetStateTable extends React.Component<Props> {
    render() {
        const rows: WorksheetFeatureSetStateTableRow[] = [];
        for (let featureDefinition of this.props.featureSetDefinition.features) {
            let featureState: WorksheetFeatureState | undefined = undefined;
            if (this.props.featureSetState) {
                for (let checkFeatureState of this.props.featureSetState.features) {
                    if (checkFeatureState.id.equals(featureDefinition.id)) {
                        featureState = checkFeatureState;
                        break;
                    }
                }
            }

            const featureStateMark = new WorksheetStateMark({
                featureId: featureDefinition.id,
                featureSetId: this.props.featureSetDefinition.id,
                worksheetStateId: this.props.worksheetStateId
            });

            rows.push(new WorksheetFeatureSetStateTableRow(featureDefinition, featureStateMark, this.props.worksheetDefinition, featureState))
        }

        return (
            <Table className="table-bordered">
                <thead>
                    <tr>
                        <th className="text-center">Feature</th>
                        {this.props.includeFeatureDescriptions ?
                            (<th className="text-center">Description</th>) : null}
                        <th className="text-center">Value(s)</th>
                    </tr>
                </thead>
                <tbody>
                    {_.map(rows, (row) => {
                        return (
                            <tr>
                                <td className="text-center w-25">
                                    <Link className="btn btn-lg btn-secondary w-100" to={Hrefs.worksheetState(row.featureStateMark)}>{row.featureDefinition.displayName}</Link>
                                </td>
                                {this.props.includeFeatureDescriptions ? (
                                    <td>
                                        {row.featureDefinition.description ? <WorksheetDescriptionComponent description={row.featureDefinition.description} /> : null}
                                    </td>) : null}
                                <td className="align-middle">
                                    {_.map(row.values, (value) => {
                                        <span className="border border-info h4 m-2 p-2" data-bind="text: displayName" style={{ borderWidth: "8px !important" }}>{value.displayName}</span>
                                    })}
                                </td>
                            </tr>
                        );
                    })}
                </tbody>
            </Table>
        );
    }
}

class WorksheetFeatureSetStateTableRow {
    constructor(readonly featureDefinition: WorksheetFeatureDefinitionWrapper, readonly featureStateMark: WorksheetStateMark, worksheetDefinition: WorksheetDefinitionWrapper, featureState?: WorksheetFeatureState, ) {
        if (featureState && featureState.selectedValueIds) {
            for (let valueId of featureState.selectedValueIds) {
                this.values.push(worksheetDefinition.getFeatureValueById(valueId));
            }
        }
    }

    readonly values: WorksheetFeatureValueDefinitionWrapper[] = [];
}
