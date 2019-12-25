package models.domain

import io.lemonlabs.uri.Uri
import org.apache.jena.sparql.vocabulary.FOAF

import scala.collection.JavaConverters._

final case class Object(
                         alternativeTitles: List[String] = List(),
                         creators: List[String] = List(),
                         description: Option[String] = None,
                         descriptions: List[String] = List(),
                         images: List[DerivedImageSet] = List(),
                         rights: Option[Rights] = None,
                         provenances: List[String] = List(),
                         publishers: List[String] = List(),
                         sources: List[String] = List(),
                         subjects: List[String] = List(),
                         title: String,
                         titles: List[String],
                         uri: Uri
                       ) extends DomainModel

object Object extends DomainModelCompanion {
  def apply(resource: ResourceWrapper): Object = {
    val descriptions = resource.dublinCore.descriptions()
    Object(
      alternativeTitles = resource.dublinCore.alternativeTitles,
      creators = resource.dublinCore.creators,
      //      dates = resource.d
      description = if (!descriptions.isEmpty) Some(descriptions(0)) else None,
      descriptions = descriptions,
      images = resource.resource.listProperties(FOAF.depiction).asScala.toList.map(statement => DerivedImageSet(statement.getObject.asResource())),
      provenances = resource.dublinCore.provenances,
      publishers = resource.dublinCore.publishers,
      rights = Rights(resource.resource),
      sources = resource.dublinCore.sources(),
      subjects = resource.dublinCore.subjects(),
      title = (resource.dublinCore.titles() ::: resource.dublinCore.alternativeTitles()) (0),
      titles = resource.dublinCore.titles,
      uri = resource.uri
    )
  }
}
