/* tslint:disable */
/* eslint-disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: SearchResultsQuery
// ====================================================

export interface SearchResultsQuery_searchObjects_collection_rights {
  __typename: "Rights";
  text: string;
}

export interface SearchResultsQuery_searchObjects_collection {
  __typename: "Collection";
  name: string;
  rights: SearchResultsQuery_searchObjects_collection_rights | null;
  uri: string;
}

export interface SearchResultsQuery_searchObjects_institution_rights {
  __typename: "Rights";
  text: string;
}

export interface SearchResultsQuery_searchObjects_institution {
  __typename: "Institution";
  name: string;
  rights: SearchResultsQuery_searchObjects_institution_rights | null;
  uri: string;
}

export interface SearchResultsQuery_searchObjects_object_thumbnail {
  __typename: "Image";
  url: string;
}

export interface SearchResultsQuery_searchObjects_object_rights {
  __typename: "Rights";
  text: string;
}

export interface SearchResultsQuery_searchObjects_object {
  __typename: "Object";
  description: string | null;
  title: string;
  thumbnail: SearchResultsQuery_searchObjects_object_thumbnail | null;
  uri: string;
  rights: SearchResultsQuery_searchObjects_object_rights | null;
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
