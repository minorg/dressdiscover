/* tslint:disable */
/* eslint-disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL fragment: ObjectsGalleryObjectFragment
// ====================================================

export interface ObjectsGalleryObjectFragment_thumbnail {
  __typename: "Image";
  url: string;
}

export interface ObjectsGalleryObjectFragment {
  __typename: "Object";
  description: string | null;
  title: string;
  thumbnail: ObjectsGalleryObjectFragment_thumbnail | null;
  uri: string;
}
