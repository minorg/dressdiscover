/* tslint:disable */
/* eslint-disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: ObjectOverviewQuery
// ====================================================

export interface ObjectOverviewQuery_collectionByUri_rights {
  __typename: "Rights";
  text: string;
}

export interface ObjectOverviewQuery_collectionByUri {
  __typename: "Collection";
  name: string;
  rights: ObjectOverviewQuery_collectionByUri_rights | null;
}

export interface ObjectOverviewQuery_institutionByUri_rights {
  __typename: "Rights";
  text: string;
}

export interface ObjectOverviewQuery_institutionByUri {
  __typename: "Institution";
  name: string;
  rights: ObjectOverviewQuery_institutionByUri_rights | null;
}

export interface ObjectOverviewQuery_objectByUri_rights {
  __typename: "Rights";
  text: string;
}

export interface ObjectOverviewQuery_objectByUri {
  __typename: "Object";
  rights: ObjectOverviewQuery_objectByUri_rights | null;
  title: string;
}

export interface ObjectOverviewQuery {
  collectionByUri: ObjectOverviewQuery_collectionByUri;
  institutionByUri: ObjectOverviewQuery_institutionByUri;
  objectByUri: ObjectOverviewQuery_objectByUri;
}

export interface ObjectOverviewQueryVariables {
  collectionUri: string;
  institutionUri: string;
  objectUri: string;
}
