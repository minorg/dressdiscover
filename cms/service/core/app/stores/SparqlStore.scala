package stores

import io.lemonlabs.uri.{Uri, Url}
import models.domain.vocabulary.CMS
import models.domain.{Collection, Institution, Object}
import org.apache.jena.query.{Query, QueryExecution, QueryExecutionFactory, QueryFactory}
import org.apache.jena.sparql.vocabulary.FOAF
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

  override def collectionObjects(collectionUri: Uri, limit: Int, offset: Int): List[Object] = {
    objectsByUris(collectionObjectUris(collectionUri = collectionUri, limit = limit, offset = offset))
  }

  override def collectionObjectsCount(collectionUri: Uri): Int = {
    val query = QueryFactory.create(
      s"""
         |PREFIX cms: <${CMS.URI}>
         |PREFIX rdf: <${RDF.getURI}>
         |SELECT (COUNT(DISTINCT ?object) AS ?count)
         |WHERE {
         |  <${collectionUri.toString()}> cms:object ?object .
         |  ?object rdf:type cms:Object .
         |}
         |""".stripMargin)
    withQueryExecution(query) { queryExecution =>
      queryExecution.execSelect().next().get("count").asLiteral().getInt
    }
  }

  private def collectionObjectUris(collectionUri: Uri, limit: Int, offset: Int): List[Uri] = {
    val query = QueryFactory.create(
      s"""
         |PREFIX cms: <${CMS.URI}>
         |PREFIX rdf: <${RDF.getURI}>
         |SELECT DISTINCT ?object WHERE {
         |  <${collectionUri.toString()}> cms:object ?object .
         |  ?object rdf:type cms:Object .
         |} LIMIT ${limit} OFFSET ${offset}
         |""".stripMargin)
    withQueryExecution(query) { queryExecution =>
      queryExecution.execSelect().asScala.toList.map(querySolution => Uri.parse(querySolution.get("object").asResource().getURI))
    }
  }

  override def institutionByUri(institutionUri: Uri): Institution = {
    val query = QueryFactory.create(
      s"""
         |PREFIX cms: <${CMS.URI}>
         |PREFIX rdf: <${RDF.getURI}>
         |CONSTRUCT WHERE {
         |  <${institutionUri.toString()}> rdf:type cms:Institution .
         |  <${institutionUri.toString()}> ?p ?o .
         |}
         |""".stripMargin)
    withQueryExecution(query) { queryExecution =>
      val model = queryExecution.execConstruct()
      val institutions = model.listSubjectsWithProperty(RDF.`type`, CMS.Institution).asScala.toList.map(resource => Institution(resource))
      if (!institutions.isEmpty) institutions(0) else throw new NoSuchElementException
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

  private def objectsByUris(objectUris: List[Uri]): List[Object] = {
    val query = QueryFactory.create(
      s"""
         |PREFIX cms: <${CMS.URI}>
         |PREFIX foaf: <${FOAF.getURI}>
         |PREFIX rdf: <${RDF.getURI}>
         |CONSTRUCT {
         |  ?object ?objectP ?objectO .
         |  ?object foaf:depiction ?originalImage .
         |  ?originalImage ?originalImageP ?originalImageO .
         |  ?originalImage foaf:thumbnail ?thumbnailImage .
         |  ?thumbnailImage ?thumbnailImageP ?thumbnailImageO .
         |} WHERE {
         |  VALUES ?object { ${objectUris.map(objectUri => "<" + objectUri.toString() + ">").mkString(" ")} }
         |  ?object rdf:type cms:Object .
         |  ?object ?objectP ?objectO .
         |  OPTIONAL {
         |    ?object foaf:depiction ?originalImage .
         |    ?originalImage rdf:type cms:Image .
         |    ?originalImage ?originalImageP ?originalImageO .
         |    OPTIONAL {
         |      ?originalImage foaf:thumbnail ?thumbnailImage .
         |      ?thumbnailImage rdf:type cms:Image .
         |      ?thumbnailImage ?thumbnailImageP ?thumbnailImageO .
         |    }
         |  }
         |}
         |""".stripMargin)
    withQueryExecution(query) { queryExecution =>
      val model = queryExecution.execConstruct()
      //      model.listSubjectsWithProperty(RDF.`type`, CMS.Object).asScala.toList.foreach(resource => model.listStatements(resource, null, null).asScala.foreach(System.out.println(_)))
      model.listSubjectsWithProperty(RDF.`type`, CMS.Object).asScala.toList.map(resource => Object(resource))
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
