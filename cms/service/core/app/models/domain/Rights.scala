package models.domain

final case class Rights(
                         holder: Option[String],
                         text: String
                       )

object Rights extends DomainModelCompanion {
  def apply(resource: ResourceWrapper): Option[Rights] =
    resource.dublinCore.rights.map(text =>
      Rights(
        holder = resource.dublinCore.rightsHolder(),
        text = text
      )
    )
}

