import { WorksheetRightsLicense } from 'dressdiscover/gui/models/worksheet/definition/worksheet_rights_license';
import * as React from 'react';

export class WorksheetRightsLicenseComponent extends React.Component<{ license: WorksheetRightsLicense }> {
    render() {
        const { license } = this.props;
        return (<a href={license.uri} target="_blank">{license.statement} ({license.nickname})</a>);
    }
}