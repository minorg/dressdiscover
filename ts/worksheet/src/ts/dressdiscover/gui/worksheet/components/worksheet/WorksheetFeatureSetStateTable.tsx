import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/worksheet_feature_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { WorksheetStateWrapper } from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetStateWrapper';
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
    worksheetState: WorksheetStateWrapper;
}

export class WorksheetFeatureSetStateTable extends React.Component<Props> {
    render() {
        const rows = this.props.featureSetDefinition.features.map((featureDefinition) => {
            const featureState: WorksheetFeatureState | undefined = (this.props.featureSetState) ? this.props.featureSetState.features.find((featureState) => featureState.id.equals(featureDefinition.id)) : undefined;

            const featureStateMark = new WorksheetStateMark({
                featureId: featureDefinition.id,
                featureSetId: this.props.featureSetDefinition.id,
                worksheetStateId: this.props.worksheetState.id
            });

            return new WorksheetFeatureSetStateTableRow(featureDefinition, featureStateMark, this.props.worksheetState.worksheetDefinition, featureState);
        });

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
                    {rows.map((row) => {
                        return (
                            <tr key={row.featureDefinition.id.toString()}>
                                <td className="text-center w-25">
                                    <Link className="btn btn-lg btn-secondary w-100" to={Hrefs.worksheetState(row.featureStateMark)}>{row.featureDefinition.displayName}</Link>
                                </td>
                                {this.props.includeFeatureDescriptions ? (
                                    <td>
                                        {row.featureDefinition.description ? <WorksheetDescriptionComponent description={row.featureDefinition.description} /> : null}
                                    </td>) : null}
                                <td className="align-middle">
                                    {row.values.map((value) =>
                                        <span className="border border-info h4 m-2 p-2" key={value.id.toString()} style={{ borderWidth: "8px !important" }}>{value.displayName}</span>
                                    )}
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
            for (const valueId of featureState.selectedValueIds) {
                this.values.push(worksheetDefinition.getFeatureValueById(valueId));
            }
        }
    }

    readonly values: WorksheetFeatureValueDefinitionWrapper[] = [];
}
