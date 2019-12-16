package models.domain

import io.lemonlabs.uri.Uri

final case class Collection(
                             labels: Labels,
                             uri: Uri
                           ) extends DomainModel
