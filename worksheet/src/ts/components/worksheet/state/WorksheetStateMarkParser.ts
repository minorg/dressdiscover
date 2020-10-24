import {WorksheetStateMark} from "~/models/worksheet/state/WorksheetStateMark";
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
      featureId: props.match.params.featureId,
      featureSetId: props.match.params.featureSetId,
      review: review ? review : undefined,
      worksheetStateId: props.match.params.worksheetStateId,
    };
  }
}
