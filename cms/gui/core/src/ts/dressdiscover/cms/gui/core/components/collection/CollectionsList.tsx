import * as React from "react";
import {ApolloQueryWrapper} from "dressdiscover/cms/gui/core/api/ApolloQueryWrapper";
import {ListGroup, ListGroupItem} from "reactstrap";
import {Hrefs} from "dressdiscover/cms/gui/core/Hrefs";
import {Link} from "react-router-dom";
import {
    CollectionsListQuery,
    CollectionsListQueryVariables
} from "dressdiscover/cms/gui/core/api/queries/types/CollectionsListQuery";
import * as collectionsListQuery from "dressdiscover/cms/gui/core/api/queries/collectionsListQuery.graphql";

export const CollectionsList: React.FunctionComponent<{ institutionUri: string }> = ({institutionUri}) =>
    <ApolloQueryWrapper<CollectionsListQuery, CollectionsListQueryVariables> query={collectionsListQuery}
                                                                             variables={{institutionUri}}>
        {({data}) =>
            <ListGroup>
                {data.institutionByUri.collections.map(collection =>
                    <ListGroupItem key={collection.uri}><Link
                        to={Hrefs.collection({collectionUri: collection.uri, institutionUri})}>{collection.name}</Link></ListGroupItem>
                )}
            </ListGroup>
        }
    </ApolloQueryWrapper>
