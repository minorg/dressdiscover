/* tslint:disable */
/* eslint-disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: CollectionOverviewQuery
// ====================================================

export interface CollectionOverviewQuery_firstInstitution {
  __typename: "Institution";
  name: string;
  uri: string;
}

export interface CollectionOverviewQuery_collectionByUri_objects {
  __typename: "Object";
  description: string | null;
  title: string;
}

export interface CollectionOverviewQuery_collectionByUri {
  __typename: "Collection";
  description: string | null;
  name: string;
  objects: CollectionOverviewQuery_collectionByUri_objects[];
}

export interface CollectionOverviewQuery {
  firstInstitution: CollectionOverviewQuery_firstInstitution;
  collectionByUri: CollectionOverviewQuery_collectionByUri;
}

export interface CollectionOverviewQueryVariables {
  collectionUri: string;
}
