import { WorksheetDescription } from 'dressdiscover/api/models/worksheet/worksheet_description';
import * as React from 'react';
import { Container } from 'reactstrap';

export class WorksheetDescriptionComponent extends React.Component<{ description: WorksheetDescription }> {
    render() {
        return (
            <Container fluid>
                <div style={{ fontSize: "small" }}>{this.props.description.text}</div>
                <br />
                <div style={{ fontSize: "xx-small" }}>
                    Description&nbsp;&copy;&nbsp;
            <span>{this.props.description.rights.author}</span>
                    <br /> License:&nbsp;
            <span>{this.props.description.rights.license}</span>
                </div>
            </Container>
        )
    }
}
