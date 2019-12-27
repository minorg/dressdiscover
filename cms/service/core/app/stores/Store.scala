package stores

import io.lemonlabs.uri.Uri
import models.domain.{Collection, Institution, Object, ObjectSearchResult}

trait Store {
  def collectionByUri(collectionUri: Uri): Collection

  def collectionObjects(collectionUri: Uri, limit: Int, offset: Int): List[Object]

  def collectionObjectsCount(collectionUri: Uri): Int

  def institutionByUri(institutionUri: Uri): Institution

  def institutionCollections(institutionUri: Uri): List[Collection]

  def institutions(): List[Institution]

  def objectByUri(objectUri: Uri): Object

  def searchObjects(limit: Int, text: String): List[ObjectSearchResult]
}
