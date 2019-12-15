package models

import org.collaborationnetworks.data.hopl.HoplDataSet
import org.scalatest.{Matchers, WordSpec}
import play.api.libs.json.{JsArray, JsObject, JsString, Json}
import sangria.ast.Document
import sangria.execution.Executor
import sangria.execution.deferred.DeferredResolver
import sangria.macros._
import sangria.marshalling.playJson._
import services.DataService

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

class GraphQlSchemaDefinitionSpec extends WordSpec with Matchers {
  "GraphQL schema" should {
    "return a list of things" in {
      val query =
        graphql"""
         query ThingsQuery {
           things {
             id
             labels {
               prefLabel
             }
           }
         }
       """
      val things = executeQuery(query).as[JsObject].value("data").result.get.as[JsObject].value("things").result.get.as[JsArray].value
      things.size should be > 0
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
      userContext = new GraphQlSchemaContext(new DataService(HoplDataSet.toModel()))
//      deferredResolver = DeferredResolver.fetchers(SchemaDefinition.characters)
    )

    Await.result(futureResult, 10.seconds)
  }
}
