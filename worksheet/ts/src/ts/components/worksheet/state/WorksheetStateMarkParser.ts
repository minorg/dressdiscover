import {WorksheetStateId} from "~/models/worksheet/state/WorksheetStateId";
import {WorksheetStateMark} from "~/models/worksheet/state/WorksheetStateMark";
import {WorksheetFeatureId} from "~/models/worksheet/WorksheetFeatureId";
import {WorksheetFeatureSetId} from "~/models/worksheet/WorksheetFeatureSetId";
import {RouteComponentProps} from "react-router";

export class WorksheetStateMarkParser {
  static parseRouteComponentProps(
    props: RouteComponentProps<WorksheetStateMarkRouteParams>
  ): WorksheetStateMark {
    let review: boolean;
    if (props.match.path.endsWith("/edit")) {
      review = false;
    } else if (props.match.path.endsWith("/review")) {
      review = true;
    } else {
      throw new RangeError(props.match.path);
    }

    return {
      featureId: props.match.params.featureId
        ? WorksheetFeatureId.parse(props.match.params.featureId)
        : undefined,
      featureSetId: props.match.params.featureSetId
        ? WorksheetFeatureSetId.parse(props.match.params.featureSetId)
        : undefined,
      review: review ? review : undefined,
      worksheetStateId: WorksheetStateId.parse(
        props.match.params.worksheetStateId
      ),
    };
  }
}
