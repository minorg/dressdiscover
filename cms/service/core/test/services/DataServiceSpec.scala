package services

import org.collaborationnetworks.data.hopl.HoplDataSet
import org.collaborationnetworks.data.hopl.person.JohnBackus
import org.scalatest.{Matchers, WordSpec}
import play.api.libs.json.{JsArray, JsObject, Json}
import sangria.ast.Document
import sangria.execution.Executor
import sangria.macros._
import sangria.marshalling.playJson._

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

class DataServiceSpec extends WordSpec with Matchers {
  "DataService" should {
    val sut = new DataService(HoplDataSet.toModel())

    "get a person by ID" in {
      val expected = HoplDataSet.people.toList.apply(0)
      val actual = sut.personById(expected.id)
      actual should equal(expected)
    }

    "throw an exception when a person ID doesn't exist" in {
      assertThrows[NoSuchElementException] {
        sut.personById("nonextant")
      }
    }

    "get the works associated with an agent" in {
      val agent = JohnBackus
      val actual = sut.worksByAgentId(agent.id)
      actual.size should be > 0
    }

    "return a set of people" in {
      val actual = sut.people
      actual should equal(HoplDataSet.people)
    }

    "return a set of things" in {
      val actual = sut.things
      actual should equal(HoplDataSet.things)
    }
  }
}
