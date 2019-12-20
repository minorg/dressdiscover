/* tslint:disable */
/* eslint-disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: CollectionsListQuery
// ====================================================

export interface CollectionsListQuery_firstInstitution_collections {
  __typename: "Collection";
  description: string | null;
  name: string;
  uri: string;
}

export interface CollectionsListQuery_firstInstitution {
  __typename: "Institution";
  collections: CollectionsListQuery_firstInstitution_collections[];
}

export interface CollectionsListQuery {
  firstInstitution: CollectionsListQuery_firstInstitution;
}
