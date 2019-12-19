package stores

import io.lemonlabs.uri.Uri
import models.domain.{Collection, Institution, Object}

trait Store {
  def collectionObjects(collectionUri: Uri): List[Object]

  def firstInstitution(): Institution = institutions().head

  def institutionCollections(institutionUri: Uri): List[Collection]

  def institutions(): List[Institution]
}
