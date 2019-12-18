package models.domain

import io.lemonlabs.uri.Uri
import org.apache.jena.rdf.model.Resource
import org.apache.jena.sparql.vocabulary.FOAF
import org.apache.jena.vocabulary.DC_11

trait DomainModel {
  val uri: Uri
}

trait DomainModelCompanion {

  implicit class ResourceWrapper(resource: Resource) {

    object dublinCore {
      def description(): Option[String] =
        Option(resource.getProperty(DC_11.description)).flatMap(statement => if (statement.getObject.isLiteral) Some(statement.getObject.asLiteral().getString) else None)

      def title(): Option[String] =
        Option(resource.getProperty(DC_11.title)).flatMap(statement => if (statement.getObject.isLiteral) Some(statement.getObject.asLiteral().getString) else None)
    }

    object foaf {
      def name(): Option[String] =
        Option(resource.getProperty(FOAF.name)).flatMap(statement => if (statement.getObject.isLiteral) Some(statement.getObject.asLiteral().getString) else None)
    }

    def uri: Uri = Uri.parse(resource.getURI)
  }

}