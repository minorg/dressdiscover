import { WorksheetRightsLicense } from 'dressdiscover/api/models/worksheet/definition/worksheet_rights_license';
import * as React from 'react';

export class WorksheetRightsLicenseComponent extends React.Component<{ license: WorksheetRightsLicense }> {
    render() {
        const { license } = this.props;
        return (<a href={license.uri}>{license.statement} ({license.nickname})</a>);
    }
}