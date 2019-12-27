import {RouteComponentProps} from "react-router";
import * as React from "react";
import {ApolloQueryWrapper} from "dressdiscover/cms/gui/core/api/ApolloQueryWrapper";
import * as searchResultsQuery from "dressdiscover/cms/gui/core/api/queries/searchResultsQuery.graphql";
import {
    SearchResultsQuery,
    SearchResultsQueryVariables
} from "dressdiscover/cms/gui/core/api/queries/types/SearchResultsQuery";
import {ObjectsGallery} from "dressdiscover/cms/gui/core/components/object/ObjectsGallery";
import {Frame} from "dressdiscover/cms/gui/core/components/frame/Frame";

export const SearchResults: React.FunctionComponent<RouteComponentProps<{ text: string }>> = ({match}) => {
    const searchText = decodeURIComponent(match.params.text);

    return (
        <ApolloQueryWrapper<SearchResultsQuery, SearchResultsQueryVariables>
            query={searchResultsQuery}
            variables={{limit: 10, text: searchText}}>
            {({data}) => {
                const objects = data.searchObjects.map(result => ({
                    collectionName: result.collection.name,
                    collectionUri: result.collection.uri,
                    institutionName: result.institution.name,
                    institutionUri: result.institution.uri,
                    ...result.object
                }));
                return (
                    <Frame documentTitle={"Search results: " + searchText}>
                        <ObjectsGallery objects={objects} currentPage={0} maxPage={0} onPageRequest={() => {
                        }}/>
                    </Frame>
                );
            }}
        </ApolloQueryWrapper>);
}
