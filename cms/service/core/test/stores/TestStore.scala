package stores

import io.lemonlabs.uri.Uri
import models.domain.{Collection, Institution, Object}

object TestStore extends Store {
  override def collectionByUri(collectionUri: Uri): Collection = if (collectionUri == TestData.collection.uri) TestData.collection else throw new NoSuchElementException

  override def collectionObjects(collectionUri: Uri): List[Object] = List(TestData.object_)

  override def institutionCollections(institutionUri: Uri): List[Collection] = List(TestData.collection)

  override def institutions(): List[Institution] = List(TestData.institution)
}
