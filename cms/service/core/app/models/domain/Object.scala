package models.domain

import io.lemonlabs.uri.Uri

case class Object(
                   labels: Labels,
                   uri: Uri
                 ) extends DomainModel
