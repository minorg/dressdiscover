import {RouteComponentProps} from "react-router";
import * as React from "react";
import {Frame} from "dressdiscover/cms/gui/core/components/frame/Frame";
import {CollectionsList} from "dressdiscover/cms/gui/core/components/collection/CollectionsList";
import {ApolloQueryWrapper} from "dressdiscover/cms/gui/core/api/ApolloQueryWrapper";
import * as institutionOverviewQuery from "dressdiscover/cms/gui/core/api/queries/institutionOverviewQuery.graphql";
import {
    InstitutionOverviewQuery,
    InstitutionOverviewQueryVariables
} from "dressdiscover/cms/gui/core/api/queries/types/InstitutionOverviewQuery";
import {Card, CardBody, CardHeader, CardTitle, Col, Container, Row} from "reactstrap";

export const InstitutionOverview: React.FunctionComponent<RouteComponentProps<{ institutionUri: string; }>> = ({match}) => {
    const institutionUri = decodeURIComponent(match.params.institutionUri);
    return (
        <ApolloQueryWrapper<InstitutionOverviewQuery, InstitutionOverviewQueryVariables>
            query={institutionOverviewQuery}
            variables={{institutionUri}}>
            {({data}) =>
                <Frame id="institution-overview">
                    <Container fluid>
                        <Row>
                            <Col xs={{size: 8, offset: 2}}>
                                <Card>
                                    <CardHeader>
                                        <CardTitle><h2>{data.institutionByUri.name} - Collections</h2></CardTitle>
                                    </CardHeader>
                                    <CardBody>
                                        <CollectionsList
                                            collections={data.institutionByUri.collections.map(collection => ({institutionUri, ...collection}))}/>
                                    </CardBody>
                                </Card>
                            </Col>
                        </Row>
                    </Container>
                </Frame>
            }
        </ApolloQueryWrapper>);
}
