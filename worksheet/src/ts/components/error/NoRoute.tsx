import * as React from "react";
import {RouteComponentProps} from "react-router";
import {Col, Container, Row} from "reactstrap";

import {Frame} from "../frame/Frame";
import {ActiveNavbarItem} from "../navbar/ActiveNavbarItem";

export class NoRoute extends React.Component<RouteComponentProps> {
  render() {
    return (
      <Frame activeNavItem={ActiveNavbarItem.Home} id="no-route">
        <Container fluid>
          <Row>
            <Col className="text-center" xs="12">
              <h3>
                Not Found: <code>{this.props.location.pathname}</code>
              </h3>
            </Col>
          </Row>
        </Container>
      </Frame>
    );
  }
}
