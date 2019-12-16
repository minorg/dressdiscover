package models.domain

import io.lemonlabs.uri.Uri

final case class Institution(
                              labels: Labels,
                              uri: Uri
                            ) extends DomainModel
