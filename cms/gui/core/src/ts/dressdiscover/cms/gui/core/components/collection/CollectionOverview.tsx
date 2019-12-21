import {RouteComponentProps} from "react-router";
import * as React from "react";
import {ApolloQueryWrapper} from "dressdiscover/cms/gui/core/api/ApolloQueryWrapper";
import * as collectionOverviewQuery from "dressdiscover/cms/gui/core/api/queries/collectionOverviewQuery.graphql";
import {
    CollectionOverviewQuery,
    CollectionOverviewQueryVariables
} from "dressdiscover/cms/gui/core/api/queries/types/CollectionOverviewQuery";
import {ObjectCard} from "dressdiscover/cms/gui/core/components/object/ObjectCard";
import {Col, Container, Row} from "reactstrap";
import {Frame} from "dressdiscover/cms/gui/core/components/frame/Frame";


export const CollectionOverview: React.FunctionComponent<RouteComponentProps> = ({location}) => {
    const collectionUri = decodeURIComponent(location.pathname.split("/").pop() as string);
    const stripHtml = (html: string) => {
        var tmp = document.createElement("DIV");
        tmp.innerHTML = html;
        return tmp.textContent || tmp.innerText || "";
    }
    return (
        <ApolloQueryWrapper<CollectionOverviewQuery, CollectionOverviewQueryVariables> query={collectionOverviewQuery}
                                                                                       variables={{collectionUri}}>
            {({data}) =>
                <Frame id="collection-overview">
                    <Container className="mt-4" fluid>
                        <Row>
                            <Col xs={{offset: 1, size: 10}}>
                                <h2 className="text-center">{data.collectionByUri.name}</h2>
                                {data.collectionByUri.description ?
                                    <p>{stripHtml(data.collectionByUri.description)}<br/><br/></p> : null}
                            </Col>
                        </Row>
                        <Row>
                            <Col className="p-0" xs={{offset: 1, size: 10}}>
                                <Container fluid>
                                    <Row>
                                        {data.collectionByUri.objects.map(object =>
                                            <div className="mr-4 mb-4" key={object.uri}>
                                                <ObjectCard object={object}/>
                                            </div>)}
                                    </Row>
                                </Container>
                            </Col>
                        </Row>
                    </Container>
                </Frame>
            }
        </ApolloQueryWrapper>);
}
