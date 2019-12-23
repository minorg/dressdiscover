package models.domain

import io.lemonlabs.uri.Uri
import org.apache.jena.sparql.vocabulary.FOAF

import scala.collection.JavaConverters._

final case class Object(
                         description: Option[String] = None,
                         images: List[DerivedImageSet] = List(),
                         rights: Option[Rights] = None,
                         title: String,
                         uri: Uri
                       ) extends DomainModel

object Object extends DomainModelCompanion {
  def apply(resource: ResourceWrapper): Object = {
    Object(
      description = resource.dublinCore.description,
      images = resource.resource.listProperties(FOAF.depiction).asScala.toList.map(statement => DerivedImageSet(statement.getObject.asResource())),
      rights = Rights(resource.resource),
      title = resource.dublinCore.title.orElse(resource.foaf.name).get,
      uri = resource.uri
    )
  }
}
