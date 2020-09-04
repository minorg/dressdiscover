import { WorksheetDescription } from '~/models/worksheet/definition/WorksheetDescription';
import {
    WorksheetRightsLicenseComponent,
} from '~/components/worksheet/state/WorksheetRightsLicenseComponent';
import * as React from 'react';
import { Container } from 'reactstrap';

export class WorksheetDescriptionComponent extends React.Component<{ description: WorksheetDescription }> {
    render() {
        const { description } = this.props;
        const rights = description.rights;

        return (
            <Container fluid>
                <div style={{ fontSize: "small" }}>{description.textEn}</div>
                <br />
                <div style={{ fontSize: "xx-small" }}>
                    Description&nbsp;&copy;&nbsp;
            <span>{rights.author}</span>
                    <br /> License:&nbsp;
            <span><WorksheetRightsLicenseComponent license={rights.license}></WorksheetRightsLicenseComponent></span>
                </div>
            </Container>
        );
    }
}
