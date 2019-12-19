package stores

import io.lemonlabs.uri.Url
import org.scalatest.{Matchers, WordSpec}

// The SparqlStore is populated out-of-band. These tests are meant to be run on a populated store.
class SparqlStoreTest extends WordSpec with Matchers {
  "SPARQL store" should {
    val store = new SparqlStore(Url.parse("http://fuseki:3030/ds/sparql"))

    "return the first institution" in {
      val institution = store.firstInstitution()
      institution should not equal (None)
    }
  }
}
