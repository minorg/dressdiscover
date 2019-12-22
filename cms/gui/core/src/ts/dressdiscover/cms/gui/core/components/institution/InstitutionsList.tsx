import * as React from "react";
import {ApolloQueryWrapper} from "dressdiscover/cms/gui/core/api/ApolloQueryWrapper";
import {ListGroup, ListGroupItem} from "reactstrap";
import {Hrefs} from "dressdiscover/cms/gui/core/Hrefs";
import {Link} from "react-router-dom";
import {InstitutionsListQuery} from "dressdiscover/cms/gui/core/api/queries/types/InstitutionsListQuery";
import * as institutionsListQuery from "dressdiscover/cms/gui/core/api/queries/institutionsListQuery.graphql";

export const InstitutionsList: React.FunctionComponent = () =>
    <ApolloQueryWrapper<InstitutionsListQuery> query={institutionsListQuery}>
        {({data}) =>
            <ListGroup>
                {data.institutions.map(institution =>
                    <ListGroupItem key={institution.uri}>
                        <Link to={Hrefs.institution(institution.uri)}>{institution.name}</Link>
                    </ListGroupItem>
                )}
            </ListGroup>
        }
    </ApolloQueryWrapper>
