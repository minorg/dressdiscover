import {Frame} from "~/components/frame/Frame";
import {Headline} from "~/components/frame/Headline";
import {ActiveNavbarItem} from "~/components/navbar/ActiveNavbarItem";
import * as React from "react";
import {Col, Container, Row} from "reactstrap";
import Card from "reactstrap/lib/Card";
import CardBody from "reactstrap/lib/CardBody";

export class Credits extends React.Component {
  render() {
    return (
      <Frame activeNavItem={ActiveNavbarItem.Home} id="credits">
        <Container fluid>
          <Row>
            <Col md="12">
              <Headline>Credits</Headline>
            </Col>
          </Row>
          <Row />
          <Row>
            <Col sm={{size: 8, offset: 2}}>
              <Card>
                <CardBody>
                  <Container fluid>
                    <p>
                      <b>
                        <a href="https://www.ardenkirkland.com">
                          Arden Kirkland, MSLIS, MFA
                        </a>
                      </b>
                      : project manager, domain expert
                      <ul>
                        <li>
                          Adjunct Instructor for the iSchool at Syracuse
                          University
                        </li>
                        <li>
                          Project Manager, focusing on educational engagement
                          with digital collections such as ArtOneida.org,
                          HistoricDress.org, and HVVACC.org (the Hudson Valley
                          Visual Arts Collections Consortium)
                        </li>
                        <li>
                          Project Coordinator for the IMLS-funded Design for
                          Learning program - led the development of a series of
                          online modules about online teaching
                        </li>
                      </ul>
                    </p>
                    <p>
                      <b>
                        <a href="https://minorgordon.net">
                          Minor Gordon, Ph.D.
                        </a>
                      </b>
                      : full-stack software engineer
                      <ul>
                        <li>
                          Freelance software consultant with 10 years of
                          professional experience in industry
                        </li>
                        <li>
                          Specializations:
                          <ul>
                            <li>
                              complex web sites and web applications, such as
                              Notablist.com
                            </li>
                            <li>
                              software-as-a-service (SaaS) implementations
                            </li>
                            <li>
                              programming tools, such as compilers and runtimes
                              for domain-specific languages
                            </li>
                          </ul>
                        </li>
                      </ul>
                    </p>
                  </Container>
                </CardBody>
              </Card>
            </Col>
          </Row>
        </Container>
      </Frame>
    );
  }
}
