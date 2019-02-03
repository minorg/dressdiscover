import {
    WorksheetFeatureSetStateTable,
} from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetFeatureSetStateTable';
import { CsvStringExporter } from 'dressdiscover/gui/worksheet/exporters/string/CsvStringExporter';
import { JsonStringExporter } from 'dressdiscover/gui/worksheet/exporters/string/JsonStringExporter';
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
        this.onClickDownloadButton = this.onClickDownloadButton.bind(this);
        this.onClickEmailButton = this.onClickEmailButton.bind(this);
        this.state = { selectedFormatIndex: 0 };
    }

    export(): string {
        return this.selectedStringStringExporter.export(this.props.worksheetState);
    }

    onChangeFormat(event: React.ChangeEvent<HTMLInputElement>) {
        const selectedFormatIndex = parseInt(event.target.value, 10);
        this.setState((prevState) => ({ selectedFormatIndex }));
    }

    onClickDownloadButton(event: React.MouseEvent): void {
        const content = this.export();
        const selectedStringStringExporter = this.selectedStringStringExporter;

        const a = document.createElement('a')
        const fileName = this.props.worksheetState.id + '.' + selectedStringStringExporter.fileExtension;
        const mimeType = selectedStringStringExporter.mimeType;

        if (navigator.msSaveBlob) { // IE10
            if (!navigator.msSaveBlob(new Blob([content], { type: mimeType }), fileName)) {
                event.stopPropagation();
            }
        } else if ('download' in a) { //html5 A[download]
            a.href = 'data:' + mimeType + ',' + encodeURIComponent(content);
            a.setAttribute('download', fileName);
            document.body.appendChild(a);
            a.click();
            document.body.removeChild(a);
        } else { //do iframe dataURL download (old ch+FF):
            const f = document.createElement('iframe');
            document.body.appendChild(f);
            f.src = 'data:' + mimeType + ',' + encodeURIComponent(content);
            setTimeout(() => {
                document.body.removeChild(f);
            }, 333);
        }
    }

    onClickEmailButton() {
        window.open("mailto:?to=&subject=" + encodeURIComponent(this.props.worksheetState.id.toString()) + "&body=" + encodeURIComponent(this.export()));
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
                            <Button color="secondary" onClick={this.onClickEmailButton}>Email</Button>&nbsp;
                            <Button color="secondary" onClick={this.onClickDownloadButton}>Download</Button>&nbsp;
                            <Input onChange={this.onChangeFormat} value={this.state.selectedFormatIndex} type="select">
                                {this.stringStringExporters.map((stringStringExporter, formatIndex) =>
                                    <option key={stringStringExporter.fileExtension} value={formatIndex.toString()}>{stringStringExporter.fileExtension.toUpperCase()}</option>
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

    private get selectedStringStringExporter(): StringStringExporter {
        return this.stringStringExporters[this.state.selectedFormatIndex];
    }

    private readonly stringStringExporters: StringStringExporter[] = [new CsvStringExporter(), new JsonStringExporter()];
}
