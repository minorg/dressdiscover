package models.domain

import io.lemonlabs.uri.Uri

final case class Institution(
                              name: String,
                              uri: Uri
                            ) extends DomainModel

object Institution extends DomainModelCompanion {
  def apply(resource: ResourceWrapper): Institution =
    Institution(
      name = resource.dublinCore.title.get,
      uri = resource.uri
    )
}
