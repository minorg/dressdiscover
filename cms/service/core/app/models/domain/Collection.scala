package models.domain

import io.lemonlabs.uri.Uri

final case class Collection(
                             description: Option[String] = None,
                             name: String,
                             rights: Option[Rights] = None,
                             uri: Uri
                           ) extends DomainModel

object Collection extends DomainModelCompanion {
  def apply(resource: ResourceWrapper): Collection =
    Collection(
      description = resource.dublinCore.description,
      name = resource.dublinCore.title.get,
      rights = Rights(resource.resource),
      uri = resource.uri
    )
}
