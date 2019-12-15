package models.graphql

import io.lemonlabs.uri.{Uri, Url}
import models.domain.{Collection, Institution, Labels}
import sangria.macros.derive._
import sangria.schema._

object GraphQlSchemaDefinition {
  // Scalar aliases
  implicit val UriType = ScalarAlias[Uri, String](
    StringType, _.toString, uri => Right(Uri.parse(uri))
  )

  implicit val UrlType = ScalarAlias[Url, String](
    StringType, _.toString, uri => Right(Url.parse(uri))
  )

  // Helper Object types, must be first
  implicit val LabelsType = deriveObjectType[Unit, Labels](
  )

  // Domain model types
  implicit val CollectionType = deriveObjectType[Unit, Collection](
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
  val RootQueryType = ObjectType("RootQuery", fields[GraphQlSchemaContext, Unit](
    //    Field("person", PersonType, arguments = ThingIdArgument :: Nil, resolve = (ctx) => ctx.ctx.dataService.personById(ctx.args.arg("id"))),
    Field("institutions", ListType(InstitutionType), resolve = _.ctx.store.institutions)
  ))

  // Schema
  val schema = Schema(
    RootQueryType
  )
}
