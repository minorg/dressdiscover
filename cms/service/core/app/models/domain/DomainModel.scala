package models.domain

import io.lemonlabs.uri.Uri
import org.apache.jena.rdf.model.{Literal, Property, RDFNode, Resource}
import org.apache.jena.sparql.vocabulary.FOAF
import org.apache.jena.vocabulary.{DCTerms, DC_11}

import scala.collection.JavaConverters._

trait DomainModel {
  val uri: Uri
}

trait DomainModelCompanion {

  implicit class ResourceWrapper(val resource: Resource) {

    object dublinCore {
      def description(): Option[String] = getPropertyObjectString(DCTerms.description).orElse(getPropertyObjectString(DC_11.description))

      def rights(): Option[String] = getPropertyObjectString(DCTerms.rights).orElse(getPropertyObjectString(DC_11.rights))

      def rightsHolder(): Option[String] = getPropertyObjectString(DCTerms.rightsHolder)

      def subjects(): List[String] = getPropertyObjectStrings(DCTerms.subject)

      def title(): Option[String] = getPropertyObjectString(DCTerms.title).orElse(getPropertyObjectString(DC_11.title))
    }

    object foaf {
      def name(): Option[String] = getPropertyObjectString(FOAF.name)
    }

    def getPropertyObject(property: Property): Option[RDFNode] =
      Option(resource.getProperty(property)).map(statement => statement.getObject)

    def getPropertyObjects(property: Property): List[RDFNode] =
      resource.listProperties(property).asScala.toList.map(statement => statement.getObject)

    def getPropertyObjectInt(property: Property): Option[Int] =
      getPropertyObjectLiteral(property).map(literal => literal.getInt)

    def getPropertyObjectLiteral(property: Property): Option[Literal] =
      getPropertyObject(property).flatMap(object_ => if (object_.isLiteral) Some(object_.asLiteral()) else None)

    def getPropertyObjectLiterals(property: Property): List[Literal] =
      getPropertyObjects(property).flatMap(object_ => if (object_.isLiteral) Some(object_.asLiteral()) else None)

    def getPropertyObjectString(property: Property): Option[String] =
      getPropertyObjectLiteral(property).map(literal => literal.getString)

    def getPropertyObjectStrings(property: Property): List[String] =
      getPropertyObjectLiterals(property).map(literal => literal.getString)

    def uri: Uri = Uri.parse(resource.getURI)
  }

}