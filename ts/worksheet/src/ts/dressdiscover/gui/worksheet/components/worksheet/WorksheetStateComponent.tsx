import * as invariant from 'invariant';
import { inject } from 'mobx-react';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';

import { WorksheetStateStore } from '../../stores/worksheet/WorksheetStateStore';
import { WorksheetStateMarkParser } from './WorksheetStateMarkParser';

interface WorksheetStateComponentProps extends RouteComponentProps<WorksheetStateMarkRouteParams> {
    worksheetStateStore?: WorksheetStateStore;
}

@inject("worksheetStateStore")
export class WorksheetStateComponent extends React.Component<WorksheetStateComponentProps> {
    componentDidMount() {
        const mark = this.parseMark();
        this.props.worksheetStateStore!.getWorksheetState({ id: mark.worksheetStateId });
    }

    private parseMark() {
        const mark = WorksheetStateMarkParser.parseRouteComponentProps(this.props);
        invariant(!mark.featureId, "unexpected feature id");
        invariant(!mark.featureSetId, "unexpected feature set id");
        return mark;
    }

    render() {
        const mark = this.parseMark();
    }
}

TODO need to use composition to reuse all this common code
// Have an outer component do all the ajax calls, then pass props with data down to this component

class WorksheetStateReview extends React.Component<{ state: WorksheetState }> {
}

class WorksheetStateStart exetensd React.Component < { state: WorksheetState } > {
}