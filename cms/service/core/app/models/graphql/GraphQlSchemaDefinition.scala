package models.graphql

import io.lemonlabs.uri.{Uri, Url}
import models.domain.{Collection, Institution, Object}
import sangria.macros.derive._
import sangria.schema.{Argument, Field, ListType, ScalarAlias, Schema, StringType, fields}

object GraphQlSchemaDefinition {
  // Scalar aliases
  implicit val UriType = ScalarAlias[Uri, String](
    StringType, _.toString, uri => Right(Uri.parse(uri))
  )

  implicit val UrlType = ScalarAlias[Url, String](
    StringType, _.toString, uri => Right(Url.parse(uri))
  )

  // Domain model types
  implicit val ObjectType = deriveObjectType[GraphQlSchemaContext, Object](
    ReplaceField("uri", Field("uri", UriType, resolve = _.value.uri))
  )

  implicit val CollectionType = deriveObjectType[GraphQlSchemaContext, Collection](
    AddFields(Field("objects", ListType(ObjectType), resolve = ctx => ctx.ctx.store.collectionObjects(ctx.value.uri))),
    ReplaceField("uri", Field("uri", UriType, resolve = _.value.uri))
  )

  implicit val InstitutionType = deriveObjectType[GraphQlSchemaContext, Institution](
    AddFields(
      Field("collections", ListType(CollectionType), resolve = ctx => ctx.ctx.store.institutionCollections(ctx.value.uri))
    ),
    ReplaceField("uri", Field("uri", UriType, resolve = _.value.uri))
  )

  //  implicit val ObjectType = deriveObjectType[Unit, Object](
  //  )

  // Argument types
  val UriArgument = Argument("uri", UriType, description = "URI")

  // Query types
  val RootQueryType = sangria.schema.ObjectType("RootQuery", fields[GraphQlSchemaContext, Unit](
    Field("collectionByUri", CollectionType, arguments = UriArgument :: Nil, resolve = (ctx) => ctx.ctx.store.collectionByUri(ctx.args.arg("uri"))),
    Field("firstInstitution", InstitutionType, resolve = _.ctx.store.firstInstitution),
    Field("institutions", ListType(InstitutionType), resolve = _.ctx.store.institutions)
  ))

  // Schema
  val schema = Schema(
    RootQueryType
  )
}
