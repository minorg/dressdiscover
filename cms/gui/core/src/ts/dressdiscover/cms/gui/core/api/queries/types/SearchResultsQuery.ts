/* tslint:disable */
/* eslint-disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: SearchResultsQuery
// ====================================================

export interface SearchResultsQuery_searchObjects_collection {
  __typename: "Collection";
  name: string;
  uri: string;
}

export interface SearchResultsQuery_searchObjects_institution {
  __typename: "Institution";
  name: string;
  uri: string;
}

export interface SearchResultsQuery_searchObjects_object_thumbnail {
  __typename: "Image";
  url: string;
}

export interface SearchResultsQuery_searchObjects_object {
  __typename: "Object";
  description: string | null;
  title: string;
  thumbnail: SearchResultsQuery_searchObjects_object_thumbnail | null;
  uri: string;
}

export interface SearchResultsQuery_searchObjects {
  __typename: "ObjectSearchResult";
  collection: SearchResultsQuery_searchObjects_collection;
  institution: SearchResultsQuery_searchObjects_institution;
  object: SearchResultsQuery_searchObjects_object;
}

export interface SearchResultsQuery {
  searchObjects: SearchResultsQuery_searchObjects[];
}

export interface SearchResultsQueryVariables {
  limit: number;
  text: string;
}
