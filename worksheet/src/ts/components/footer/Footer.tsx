import {Hrefs} from "~/Hrefs";
import * as React from "react";
import {Link} from "react-router-dom";
import {Col, Container, Row} from "reactstrap";

export class Footer extends React.Component {
  render() {
    return (
      <footer>
        <Container fluid>
          <Row>&nbsp;</Row>
          <Row>
            <Col className="text-center" md="12">
              <a href={Hrefs.contact}>Contact</a>&nbsp;|&nbsp;
              <Link to={Hrefs.credits}>Credits</Link>&nbsp;|&nbsp;
              <Link to={Hrefs.privacy}>Privacy</Link>&nbsp;|&nbsp;
              <a href={Hrefs.gitHub}>GitHub</a>
            </Col>
          </Row>
        </Container>
      </footer>
    );
  }
}
