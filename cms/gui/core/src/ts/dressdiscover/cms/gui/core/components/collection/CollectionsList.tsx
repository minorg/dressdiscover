import * as React from "react";
import {ApolloQueryWrapper} from "dressdiscover/cms/gui/core/api/ApolloQueryWrapper";
import {ListGroup, ListGroupItem} from "reactstrap";
import {Hrefs} from "dressdiscover/cms/gui/core/Hrefs";
import {Link} from "react-router-dom";
import {CollectionsListQuery} from "dressdiscover/cms/gui/core/api/queries/types/CollectionsListQuery";
import * as collectionsListQuery from "dressdiscover/cms/gui/core/api/queries/collectionsListQuery.graphql";

export const CollectionsList: React.FunctionComponent<{}> = () =>
    <ApolloQueryWrapper<CollectionsListQuery> query={collectionsListQuery}>
        {({data}) =>
            <ListGroup>
                {data.firstInstitution.collections.map(collection =>
                    <ListGroupItem key={collection.uri}><Link
                        to={Hrefs.collection(collection.uri)}>${collection.name}</Link></ListGroupItem>
                )}
            </ListGroup>
        }
    </ApolloQueryWrapper>
