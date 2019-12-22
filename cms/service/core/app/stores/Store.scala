package stores

import io.lemonlabs.uri.Uri
import models.domain.{Collection, Institution, Object}

trait Store {
  def collectionByUri(collectionUri: Uri): Collection

  def collectionObjects(collectionUri: Uri): List[Object]

  def institutionByUri(institutionUri: Uri): Institution

  def institutionCollections(institutionUri: Uri): List[Collection]

  def institutions(): List[Institution]
}
