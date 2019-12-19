import * as React from 'react';
import {Frame} from "dressdiscover/cms/gui/core/components/frame/Frame";
import {ActiveNavbarItem} from "dressdiscover/cms/gui/core/components/navbar/ActiveNavbarItem";
import {Col, Container, Row} from "reactstrap";
import Card from "reactstrap/lib/Card";
import CardBody from "reactstrap/lib/CardBody";
import {CollectionsList} from "dressdiscover/cms/gui/core/components/collection/CollectionsList";

export const Home: React.FunctionComponent<{}> = () => (
    <Frame
        activeNavItem={ActiveNavbarItem.Home}
        id="home"
    >
      <Container className="mt-4" fluid>
        <Row>
          <Col xs={{size: 8, offset: 2}}>
            <Card>
              <CardBody>
                <Container fluid>
                  <CollectionsList/>
                  {/*<Row className="text-center">*/}
                  {/*  <Col xs="12">*/}
                  {/*    <a href="https://xkcd.com/356/"><img className="img-fluid"*/}
                  {/*                                         src="https://imgs.xkcd.com/comics/nerd_sniping.png"*/}
                  {/*                                         title="XKCD comic, Creative Commons Attribution-NonCommercial 2.5 License"/></a>*/}
                  {/*  </Col>*/}
                  {/*</Row>*/}
                  {/*<Row className="mt-4" style={{fontSize: "larger"}}>*/}
                  {/*  <Col xs="12">*/}
                  {/*    <p>*/}
                  {/*      NerdSwipe is a web application that presents users with random Wikipedia articles, book*/}
                  {/*      synopses,*/}
                  {/*      and other summaries from large corpuses. After reading a summary, the user can rate how*/}
                  {/*      interested*/}
                  {/*      he/she is in that topic.*/}
                  {/*    </p>*/}
                  {/*    <p>*/}
                  {/*      The system incorporates these ratings into an "anti-recommendation*/}
                  {/*      engine" for further summaries. The goal is to recommend things that are similar to what a user*/}
                  {/*      likes, but different enough to surprise and engage. People tend to live in bubbles of their own*/}
                  {/*      design. It's important to step outside occasionally, and give ourselves opportunities for*/}
                  {/*      serendipitous learning.*/}
                  {/*    </p>*/}
                  {/*  </Col>*/}
                  {/*</Row>*/}
                  {/*<Row className="text-center">*/}
                  {/*  <Col xs="12">*/}
                  {/*    <a href={Hrefs.nextResource} className="btn btn-info btn-lg">Start learning</a>*/}
                  {/*  </Col>*/}
                  {/*</Row>*/}
                </Container>
              </CardBody>
            </Card>
          </Col>
        </Row>
      </Container>
    </Frame>);
