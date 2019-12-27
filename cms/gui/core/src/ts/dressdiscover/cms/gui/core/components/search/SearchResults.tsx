import {RouteComponentProps} from "react-router";
import * as React from "react";
import {ApolloQueryWrapper} from "dressdiscover/cms/gui/core/api/ApolloQueryWrapper";
import * as searchResultsQuery from "dressdiscover/cms/gui/core/api/queries/searchResultsQuery.graphql";
import {
    SearchResultsQuery,
    SearchResultsQueryVariables
} from "dressdiscover/cms/gui/core/api/queries/types/SearchResultsQuery";

export const SearchResults: React.FunctionComponent<RouteComponentProps<{ text: string }>> = ({match}) => {
    const searchText = decodeURIComponent(match.params.text);

    return (
        <ApolloQueryWrapper<SearchResultsQuery, SearchResultsQueryVariables>
            query={searchResultsQuery}
            variables={{limit: 10, text: searchText}}>
            {({data}) => {
                return <div></div>;
            }}
        </ApolloQueryWrapper>);
}
