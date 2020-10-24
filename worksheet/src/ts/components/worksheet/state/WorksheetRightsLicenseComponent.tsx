import {WorksheetRightsLicense} from "~/models/worksheet/definition/WorksheetRightsLicense";
import * as React from "react";

export class WorksheetRightsLicenseComponent extends React.Component<{
  license: WorksheetRightsLicense;
}> {
  render() {
    const {license} = this.props;
    return (
      <a href={license.uri} target="_blank">
        {license.statement} ({license.nickname})
      </a>
    );
  }
}
