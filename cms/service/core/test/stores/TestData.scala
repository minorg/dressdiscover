package stores

import io.lemonlabs.uri.Uri
import models.domain.{Collection, Institution, Labels, Object}

object TestData {
  val institution = Institution(uri = Uri.parse("http://example.com/institution"), labels = Labels("Test institution"))
  val collection = Collection(uri = Uri.parse("http://example.com/collection"), labels = Labels("Test collection"))
  val object_ = Object(uri = Uri.parse("http://example.com/object"), labels = Labels("Test object"))
}
