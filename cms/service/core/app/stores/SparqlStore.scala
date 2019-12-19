package stores

import io.lemonlabs.uri.{Uri, Url}
import models.domain.vocabulary.CMS
import models.domain.{Collection, Institution}
import org.apache.jena.query.{QueryExecutionFactory, QueryFactory}
import org.apache.jena.vocabulary.RDF

import scala.collection.JavaConverters._

class SparqlStore(endpointUrl: Url) extends Store {
  private val institutionsQuery = QueryFactory.create(
    s"""
       |PREFIX cms: <${CMS.URI}>
       |PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
       |CONSTRUCT WHERE {
       |  ?institution rdf:type cms:Institution .
       |  ?institution ?p ?o .
       |}
       |""".stripMargin)

  def collectionObjects(collectionUri: Uri): List[Object] = List()

  def institutionCollections(institutionUri: Uri): List[Collection] = List()

  def institutions(): List[Institution] = {
    val queryExecution = QueryExecutionFactory.sparqlService(endpointUrl.toString(), institutionsQuery)
    try {
      val model = queryExecution.execConstruct()
      model.listSubjectsWithProperty(RDF.`type`, CMS.Institution).asScala.toList.map(resource => Institution(resource))
    } finally {
      queryExecution.close()
    }
  }
}
