package models.domain

import io.lemonlabs.uri.Uri

trait DomainModel {
  val labels: Labels
  val uri: Uri
}
