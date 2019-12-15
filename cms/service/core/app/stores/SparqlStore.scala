package stores

import io.lemonlabs.uri.Uri
import models.domain.{Collection, Institution}

class SparqlStore {
  def collectionObjects(collectionUri: Uri): List[Object] = List()

  def institutionCollections(institutionUri: Uri): List[Collection] = List()

  def institutions(): List[Institution] = List()
}
