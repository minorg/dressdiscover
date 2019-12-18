package models.domain

import io.lemonlabs.uri.Uri

final case class Object(
                         description: Option[String] = None,
                         title: String,
                         uri: Uri
                       ) extends DomainModel

object Object extends DomainModelCompanion {
  def apply(resource: ResourceWrapper): Object = {
    Object(
      description = resource.dublinCore.description,
      title = resource.dublinCore.title.orElse(resource.foaf.name).get,
      uri = resource.uri
    )
  }
}
