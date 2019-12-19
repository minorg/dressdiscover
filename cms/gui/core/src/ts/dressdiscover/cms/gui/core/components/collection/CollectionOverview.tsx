import {RouteComponentProps} from "react-router";
import * as React from "react";
import {ApolloQueryWrapper} from "dressdiscover/cms/gui/core/api/ApolloQueryWrapper";
import * as collectionOverviewQuery from "dressdiscover/cms/gui/core/api/queries/collectionOverviewQuery.graphql";
import {
    CollectionOverviewQuery,
    CollectionOverviewQueryVariables
} from "dressdiscover/cms/gui/core/api/queries/types/CollectionOverviewQuery";
import {ObjectCard} from "dressdiscover/cms/gui/core/components/object/ObjectCard";
import {Container, Row} from "reactstrap";


export const CollectionOverview: React.FunctionComponent<RouteComponentProps> = ({location}) => {
    const collectionUri = decodeURIComponent(location.pathname.split("/").pop() as string);
    return (
        <ApolloQueryWrapper<CollectionOverviewQuery, CollectionOverviewQueryVariables> query={collectionOverviewQuery}
                                                                                       variables={{collectionUri}}>
            {({data}) =>
                <Container fluid>
                    <Row>
                        {data.collectionByUri.objects.map(object => <ObjectCard object={object}/>)}
                    </Row>
                </Container>
            }
        </ApolloQueryWrapper>);
}
