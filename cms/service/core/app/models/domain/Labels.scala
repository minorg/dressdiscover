package models.domain

import org.apache.jena.rdf.model.Resource
import org.apache.jena.vocabulary.{RDFS, SKOS}

case class Labels(prefLabel: String, acronym: Option[String] = None, altLabel: Option[String] = None)

object Labels {
  def apply(resource: Resource): Labels =
    Labels(
      altLabel = Option(resource.getProperty(SKOS.altLabel)).map(_.getObject.asLiteral().getString),
      //      acronym = Option(resource.getProperty(CN.acronym)).map(_.getObject.asLiteral().getString),
      prefLabel = resource.getProperty(RDFS.label).getObject.asLiteral().getString
    )
}
