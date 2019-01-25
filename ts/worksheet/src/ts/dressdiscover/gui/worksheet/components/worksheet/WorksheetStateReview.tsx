import {
    WorksheetFeatureSetStateTable,
} from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetFeatureSetStateTable';
import { CsvExporter } from 'dressdiscover/gui/worksheet/exporters/string/CsvExporter';
import { JsonExporter } from 'dressdiscover/gui/worksheet/exporters/string/JsonExporter';
import { StringExporter } from 'dressdiscover/gui/worksheet/exporters/string/StringExporter';
import { History } from 'history';
import * as React from 'react';
import Clipboard from 'react-clipboard.js';
import { RouteComponentProps } from 'react-router';
import { Button, Form, Input } from 'reactstrap';

import { WorksheetStateWrapper } from '../../models/worksheet/WorksheetStateWrapper';
import { WorksheetStateFrame } from './WorksheetStateFrame';
import { WorksheetStateGetter } from './WorksheetStateGetter';
import { WorksheetStateMarkParser } from './WorksheetStateMarkParser';


export class WorksheetStateReview extends React.Component<RouteComponentProps<WorksheetStateMarkRouteParams>> {
    render() {
        return (
            <WorksheetStateGetter
                render={(worksheetState: WorksheetStateWrapper) => <WorksheetStateReviewImpl history={this.props.history} worksheetState={worksheetState} />}
                worksheetStateMark={WorksheetStateMarkParser.parseRouteComponentProps(this.props)}
            />
        );
    }
}

interface WorksheetStateReviewImplProps {
    history: History;
    worksheetState: WorksheetStateWrapper;
}

class WorksheetStateReviewImpl extends React.Component<WorksheetStateReviewImplProps, { selectedFormatIndex: number }> {
    constructor(props: WorksheetStateReviewImplProps) {
        super(props);
        this.export = this.export.bind(this);
        this.onChangeFormat = this.onChangeFormat.bind(this);
        this.state = { selectedFormatIndex: 0 };
    }

    export(): string {
        const stringExporter = this.stringExporters[this.state.selectedFormatIndex];
        return stringExporter.export(this.props.worksheetState);
    }

    onChangeFormat(event: React.ChangeEvent<HTMLInputElement>) {
        const selectedFormatIndex = parseInt(event.target.value, 10);
        this.setState((prevState) => ({ selectedFormatIndex }));
    }

    render() {
        const { worksheetState } = this.props;

        return (
            <WorksheetStateFrame
                headline={"Worksheet: " + worksheetState.id.toString()}
                history={this.props.history}
                id="worksheet-state-edit"
                finishButtonEnabled={false}
                nextButtonEnabled={false}
                previousButtonEnabled={true}
                worksheetState={this.props.worksheetState}
            >
                <div className="w-100">
                    <div className="float-left">
                        <h3 className="card-title">Review</h3>
                    </div>
                    <div className="float-right">
                        <Form inline>
                            <Clipboard className="btn btn-secondary" component="a" option-text={this.export}>
                                Copy
                            </Clipboard>&nbsp;
                            <Button color="secondary">Email</Button>&nbsp;
                            <Button color="secondary">Download</Button>&nbsp;
                            <Input onChange={this.onChangeFormat} value={this.state.selectedFormatIndex} type="select">
                                {this.stringExporters.map((stringExporter, formatIndex) =>
                                    <option key={stringExporter.fileExtension} value={formatIndex.toString()}>{stringExporter.fileExtension.toUpperCase()}</option>
                                )}
                            </Input>
                        </Form>
                    </div>
                </div>
                <div className="clearfix"></div>
                {worksheetState.featureSetStates.map((featureSetState) => {
                    const featureSetDefinition = worksheetState.worksheetDefinition.featureSetById(featureSetState.id);
                    return (
                        <React.Fragment key={featureSetState.id.toString()}>
                            <h4 className="text-center">{featureSetDefinition.displayName}</h4>
                            <WorksheetFeatureSetStateTable
                                featureSetDefinition={featureSetDefinition}
                                featureSetState={featureSetState}
                                includeFeatureDescriptions={false}
                                worksheetState={worksheetState}
                            />
                        </React.Fragment>
                    );
                })}
                {worksheetState.text ? (
                    <React.Fragment>
                        <br />
                        <hr />
                        <br />
                        <h4>Freetext description</h4>
                        <p>{worksheetState.text}</p>
                    </React.Fragment>
                ) : null}
            </WorksheetStateFrame>);
    }

    private readonly stringExporters: StringExporter[] = [new CsvExporter(), new JsonExporter()];
}
