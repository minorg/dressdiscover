/* tslint:disable */
/* eslint-disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: CollectionListQuery
// ====================================================

export interface CollectionListQuery_firstInstitution_collections_labels {
  __typename: "Labels";
  prefLabel: string;
}

export interface CollectionListQuery_firstInstitution_collections {
  __typename: "Collection";
  uri: string;
  labels: CollectionListQuery_firstInstitution_collections_labels;
}

export interface CollectionListQuery_firstInstitution {
  __typename: "Institution";
  collections: CollectionListQuery_firstInstitution_collections[];
}

export interface CollectionListQuery {
  firstInstitution: CollectionListQuery_firstInstitution | null;
}
