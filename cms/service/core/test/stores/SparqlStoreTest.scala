package stores

import java.net.UnknownHostException

import io.lemonlabs.uri.Url
import org.apache.jena.query.QueryException
import org.scalatest.{Matchers, WordSpec}

// The SparqlStore is populated out-of-band. These tests are meant to be run on a populated store.
class SparqlStoreTest extends WordSpec with Matchers {
  "SPARQL store" should {
    val store = new SparqlStore(Url.parse("http://fuseki:3030/ds/sparql"))

    "return the first institution" in {
      try {
        val institution = store.firstInstitution()
        institution should not equal (None)
      } catch {
        case e: QueryException => e.getCause match { case e1: UnknownHostException => }
        }
      }
    }
  }
}
