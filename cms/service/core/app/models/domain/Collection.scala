package models.domain

import io.lemonlabs.uri.Uri

final case class Collection(
                             name: String,
                             uri: Uri
                           ) extends DomainModel

object Collection extends DomainModelCompanion {
  def apply(resource: ResourceWrapper): Collection =
    Collection(
      name = resource.dublinCore.title.get,
      uri = resource.uri
    )
}
