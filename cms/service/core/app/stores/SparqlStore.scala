package stores

import io.lemonlabs.uri.{Uri, Url}
import models.domain.vocabulary.CMS
import models.domain.{Collection, Institution, Object}
import org.apache.jena.query.{Query, QueryExecution, QueryExecutionFactory, QueryFactory}
import org.apache.jena.vocabulary.RDF

import scala.collection.JavaConverters._

class SparqlStore(endpointUrl: Url) extends Store {
  private val institutionsQuery = QueryFactory.create(
    s"""
       |PREFIX cms: <${CMS.URI}>
       |PREFIX rdf: <${RDF.getURI}>
       |CONSTRUCT WHERE {
       |  ?institution rdf:type cms:Institution .
       |  ?institution ?p ?o .
       |}
       |""".stripMargin)

  override def collectionByUri(collectionUri: Uri): Collection = {
    val query = QueryFactory.create(
      s"""
         |PREFIX cms: <${CMS.URI}>
         |PREFIX rdf: <${RDF.getURI}>
         |CONSTRUCT WHERE {
         |  <${collectionUri.toString()}> rdf:type cms:Collection .
         |  <${collectionUri.toString()}> ?p ?o .
         |}
         |""".stripMargin)
    withQueryExecution(query) { queryExecution =>
      val model = queryExecution.execConstruct()
      val collections = model.listSubjectsWithProperty(RDF.`type`, CMS.Collection).asScala.toList.map(resource => Collection(resource))
      if (!collections.isEmpty) collections(0) else throw new NoSuchElementException
    }
  }

  override def collectionObjects(collectionUri: Uri): List[Object] = {
    val query = QueryFactory.create(
      s"""
         |PREFIX cms: <${CMS.URI}>
         |PREFIX rdf: <${RDF.getURI}>
         |CONSTRUCT WHERE {
         |  <${collectionUri.toString()}> cms:object ?object .
         |  ?object rdf:type cms:Object .
         |  ?object ?p ?o .
         |}
         |""".stripMargin)
    withQueryExecution(query) { queryExecution =>
      val model = queryExecution.execConstruct()
      model.listSubjectsWithProperty(RDF.`type`, CMS.Object).asScala.toList.map(resource => Object(resource))
    }
  }

  override def institutionCollections(institutionUri: Uri): List[Collection] = {
    val query = QueryFactory.create(
      s"""
         |PREFIX cms: <${CMS.URI}>
         |PREFIX rdf: <${RDF.getURI}>
         |CONSTRUCT WHERE {
         |  <${institutionUri.toString()}> cms:collection ?collection .
         |  ?collection rdf:type cms:Collection .
         |  ?collection ?p ?o .
         |}
         |""".stripMargin)
    withQueryExecution(query) { queryExecution =>
      val model = queryExecution.execConstruct()
      model.listSubjectsWithProperty(RDF.`type`, CMS.Collection).asScala.toList.map(resource => Collection(resource))
    }
  }

  override def institutions(): List[Institution] = {
    withQueryExecution(institutionsQuery) { queryExecution =>
      val model = queryExecution.execConstruct()
      model.listSubjectsWithProperty(RDF.`type`, CMS.Institution).asScala.toList.map(resource => Institution(resource))
    }
  }

  private def withQueryExecution[T](query: Query)(f: (QueryExecution) => T): T = {
    val queryExecution = QueryExecutionFactory.sparqlService(endpointUrl.toString(), query)
    try {
      f(queryExecution)
    } finally {
      queryExecution.close()
    }
  }
}
