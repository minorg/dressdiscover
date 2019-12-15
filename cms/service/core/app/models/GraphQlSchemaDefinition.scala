package models

import org.collaborationnetworks.ontology.{Agent, Creation, Derivation, Iso6391LanguageCode, Labels, Organization, PartialDate, Person, References, Thing, Work}
import io.lemonlabs.uri.{Uri, Url}
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

  implicit val PartialDateType = deriveObjectType[Unit, PartialDate]()

  val WikipediaUrlType = ObjectType("WikipediaUrlType", fields[Unit, (Iso6391LanguageCode, Url)](
    Field("language", StringType, resolve = _.value._1.code),
    Field("url", UriType, resolve = _.value._2)
  ))

  implicit val ReferencesType = deriveObjectType[Unit, References](
    ReplaceField("wikipediaUrls", Field("wiki", OptionType(ListType(WikipediaUrlType)), resolve = _.value.wikipediaUrls.flatMap(map => Some(map.toList))))
  )

  // Interface types
  val AgentType: InterfaceType[GraphQlSchemaContext, Agent] = InterfaceType(
    "Agent",
    "Agent",

    fields[GraphQlSchemaContext, Agent](
      Field("id", StringType, resolve = _.value.id)
    )
  )

  val ThingType: InterfaceType[GraphQlSchemaContext, Thing] = InterfaceType(
    "Thing",
    "Thing",

    fields[GraphQlSchemaContext, Thing](
      Field("id", StringType, resolve = _.value.id),
      Field("labels", LabelsType, resolve = _.value.labels),
    )
  )

  // Entity types
  implicit val OrganizationType = deriveObjectType[Unit, Organization](
    Interfaces(AgentType, ThingType)
  )

  implicit val WorkType = deriveObjectType[Unit, Work](
    Interfaces(ThingType)
  )

  implicit val PersonType = deriveObjectType[GraphQlSchemaContext, Person](
    Interfaces[GraphQlSchemaContext, Person](AgentType, ThingType),
    AddFields(Field("agentOfWorks", ListType(WorkType), resolve = ctx => ctx.ctx.dataService.worksByAgentId(ctx.value.id).toList))
  )

  // Process types
  implicit val CreationType = deriveObjectType[Unit, Creation](
    Interfaces(ThingType),
    ReplaceField("agents", Field("agents", ListType(AgentType), resolve = _.value.agents.toList))
  )

  implicit val DerivationType = deriveObjectType[Unit, Derivation](
    Interfaces(ThingType),
    ReplaceField("agents", Field("agents", ListType(AgentType), resolve = _.value.agents.toList))
  )

  // Argument types
  val ThingIdArgument = Argument("id", StringType, description = "relation id")

  // Query types
  val RootQueryType = ObjectType("RootQuery",  fields[GraphQlSchemaContext, Unit](
    Field("exception", StringType, resolve = (ctx) => throw new RuntimeException("test")),
    Field("person", PersonType, arguments = ThingIdArgument :: Nil, resolve = (ctx) => ctx.ctx.dataService.personById(ctx.args.arg("id"))),
    Field("things", ListType(ThingType), resolve = _.ctx.dataService.things.toList),
  ))

  // Schema
  val schema = Schema(
    RootQueryType,
    additionalTypes = AgentType :: CreationType :: DerivationType :: OrganizationType :: PersonType :: WorkType :: Nil
  )
}
