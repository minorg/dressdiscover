/* tslint:disable */
/* eslint-disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: CollectionsListQuery
// ====================================================

export interface CollectionsListQuery_institutionByUri_collections {
  __typename: "Collection";
  description: string | null;
  name: string;
  uri: string;
}

export interface CollectionsListQuery_institutionByUri {
  __typename: "Institution";
  collections: CollectionsListQuery_institutionByUri_collections[];
}

export interface CollectionsListQuery {
  institutionByUri: CollectionsListQuery_institutionByUri;
}

export interface CollectionsListQueryVariables {
  institutionUri: string;
}
