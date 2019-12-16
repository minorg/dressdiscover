package stores

import io.lemonlabs.uri.Uri
import models.domain.{Collection, Institution}

trait Store {
  def collectionObjects(collectionUri: Uri): List[Object]

  def firstInstitution(): Option[Institution] = institutions().headOption

  def institutionCollections(institutionUri: Uri): List[Collection]

  def institutions(): List[Institution]
}
