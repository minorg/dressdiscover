/* tslint:disable */
/* eslint-disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: CollectionOverviewQuery
// ====================================================

export interface CollectionOverviewQuery_collectionByUri_objects {
  __typename: "Object";
  description: string | null;
  title: string;
}

export interface CollectionOverviewQuery_collectionByUri {
  __typename: "Collection";
  objects: CollectionOverviewQuery_collectionByUri_objects[];
}

export interface CollectionOverviewQuery {
  collectionByUri: CollectionOverviewQuery_collectionByUri;
}

export interface CollectionOverviewQueryVariables {
  collectionUri: string;
}
