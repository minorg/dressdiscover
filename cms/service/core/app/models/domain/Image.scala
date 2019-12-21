package models.domain

import io.lemonlabs.uri.Url
import models.domain.vocabulary.EXIF

final case class Image(
                        height: Int,
                        url: Url,
                        width: Int
                      ) extends DomainModel {
  val uri = url
}

object Image extends DomainModelCompanion {
  def apply(resource: ResourceWrapper): Image = {
    Image(
      height = resource.getPropertyObjectInt(EXIF.height).get,
      url = resource.uri.asInstanceOf[Url],
      width = resource.getPropertyObjectInt(EXIF.width).get
    )
  }
}
