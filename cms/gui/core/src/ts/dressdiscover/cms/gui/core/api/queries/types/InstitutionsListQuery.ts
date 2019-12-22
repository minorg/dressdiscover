/* tslint:disable */
/* eslint-disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: InstitutionsListQuery
// ====================================================

export interface InstitutionsListQuery_institutions {
  __typename: "Institution";
  name: string;
  uri: string;
}

export interface InstitutionsListQuery {
  institutions: InstitutionsListQuery_institutions[];
}
