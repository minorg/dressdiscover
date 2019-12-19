package models.graphql

import org.scalatest.{Matchers, WordSpec}
import play.api.libs.json.{JsArray, JsObject, JsString, Json}
import sangria.ast.Document
import sangria.execution.Executor
import sangria.macros._
import sangria.marshalling.playJson._
import stores.{TestData, TestStore}

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

class GraphQlSchemaDefinitionSpec extends WordSpec with Matchers {
  "GraphQL schema" should {
    "return the first institution" in {
      val query =
        graphql"""
         query InstitutionQuery {
           firstInstitution {
             uri
           }
         }
       """
      val institutionUri = executeQuery(query).as[JsObject].value("data").result.get.as[JsObject].value("firstInstitution").result.get.as[JsObject].value("uri").result.get.as[JsString].value
      institutionUri should equal(TestData.institution.uri.toString)
    }

    "return a list of institutions" in {
      val query =
        graphql"""
         query InstitutionsQuery {
           institutions {
             name
             uri
           }
         }
       """
      val institutions = executeQuery(query).as[JsObject].value("data").result.get.as[JsObject].value("institutions").result.get.as[JsArray].value
      institutions.size should equal(1)
    }

    "return institution collections" in {
      val query =
        graphql"""
         query CollectionsQuery {
           firstInstitution {
             collections {
               uri
             }
           }
         }
       """
      val collections = executeQuery(query).as[JsObject].value("data").result.get.as[JsObject].value("firstInstitution").result.get.as[JsObject].value("collections").result.get.as[JsArray].value
      collections.size should equal(1)
    }

    "return collection objects" in {
      val query =
        graphql"""
         query ObjectsQuery {
           firstInstitution {
             collections {
               objects {
                 uri
               }
             }
           }
         }
       """
      val objects = executeQuery(query).as[JsObject].value("data").result.get.as[JsObject].value("firstInstitution").result.get.as[JsObject].value("collections").result.get.as[JsArray].value.apply(0).result.get.as[JsObject].value.get("objects").get.as[JsArray].value
      objects.size should equal(1)
    }

    "return collection by URI" in {
      val query =
        graphql"""
         query CollectionByUriQuery($$collectionUri: String!) {
           collectionByUri(uri: $$collectionUri) {
               uri
           }
         }
       """
      executeQuery(query, vars = Json.obj("collectionUri" -> TestData.collection.uri.toString())) should be(Json.parse(
        s"""
           |{"data":{"collectionByUri":{"uri":"${TestData.collection.uri.toString()}"}}}
           |""".stripMargin))
    }

    ////    "allow to fetch Han Solo using his ID provided through variables" in {
    ////      val query =
    ////        graphql"""
    ////         query FetchSomeIDQuery($$humanId: String!) {
    ////           human(id: $$humanId) {
    ////             name
    ////             friends {
    ////               id
    ////               name
    ////             }
    ////           }
    ////         }
    ////       """
    ////
    ////      executeQuery(query, vars = Json.obj("humanId" → JsString("1002"))) should be (Json.parse(
    ////        """
    ////         {
    ////           "data": {
    ////             "human": {
    ////               "name": "Han Solo",
    ////               "friends": [
    ////                 {
    ////                   "id": "1000",
    ////                   "name": "Luke Skywalker"
    ////                 },
    ////                 {
    ////                   "id": "1003",
    ////                   "name": "Leia Organa"
    ////                 },
    ////                 {
    ////                   "id": "2001",
    ////                   "name": "R2-D2"
    ////                 }
    ////               ]
    ////             }
    ////           }
    ////         }
    ////        """))
    //    }
  }

  def executeQuery(query: Document, vars: JsObject = Json.obj()) = {
    val futureResult = Executor.execute(GraphQlSchemaDefinition.schema, query,
      variables = vars,
      userContext = new GraphQlSchemaContext(TestStore)
    )
    Await.result(futureResult, 10.seconds)
  }
}
