package stores

import io.lemonlabs.uri.{Uri, Url}
import models.domain.{Collection, Institution}

class SparqlStore(endpointUrl: Url) extends Store {
  def collectionObjects(collectionUri: Uri): List[Object] = List()

  def institutionCollections(institutionUri: Uri): List[Collection] = List()

  def institutions(): List[Institution] = List()
}
