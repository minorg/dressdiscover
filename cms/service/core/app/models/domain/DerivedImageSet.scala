package models.domain

final case class ImagePair(original: Image, thumbnail: Option[Image])

object ImagePair extends DomainModelCompanion {
  def apply(originalResource: ResourceWrapper): ImagePair =
}