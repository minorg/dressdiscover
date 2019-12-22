package stores

import io.lemonlabs.uri.Uri
import models.domain.{Collection, Institution, Object}

object TestStore extends Store {
  override def collectionByUri(collectionUri: Uri): Collection = if (collectionUri == TestData.collection.uri) TestData.collection else throw new NoSuchElementException

  override def collectionObjects(collectionUri: Uri, limit: Int, offset: Int): List[Object] = if (offset == 0) List(TestData.object_) else List()

  override def collectObjectsCount(collectionUri: Uri): Int = 1

  override def institutionByUri(institutionUri: Uri): Institution = if (institutionUri == TestData.institution.uri) TestData.institution else throw new NoSuchElementException

  override def institutionCollections(institutionUri: Uri): List[Collection] = List(TestData.collection)

  override def institutions(): List[Institution] = List(TestData.institution)
}
