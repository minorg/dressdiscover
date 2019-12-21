package stores

import java.net.UnknownHostException

import io.lemonlabs.uri.Url
import org.apache.jena.query.QueryException
import org.scalatest.{Assertion, Matchers, WordSpec}

// The SparqlStore is populated out-of-band. These tests are meant to be run on a populated store.
class SparqlStoreTest extends WordSpec with Matchers {
  "SPARQL store" should {
    val store = new SparqlStore(Url.parse("http://fuseki:3030/ds/sparql"))

    def withUnknownHostExceptionCatch(test: () => Assertion): Assertion =
      try {
        test()
      } catch {
        case e: QueryException => e.getCause match {
          case _: UnknownHostException => assert(true)
          case _ => throw e
        }
      }

    "return the first institution" in {
      withUnknownHostExceptionCatch { () =>
        val institution = store.firstInstitution()
        institution should not equal (None)
      }
    }

    "return all institutions" in {
      withUnknownHostExceptionCatch { () =>
        val institutions = store.institutions()
        institutions.size should be > 0
      }
    }

    "institution collections" in {
      withUnknownHostExceptionCatch { () =>
        val collections = store.institutionCollections(store.firstInstitution().uri)
        collections.size should be > 0
      }
    }

    "collection objects" in {
      withUnknownHostExceptionCatch { () =>
        val institution = store.firstInstitution()
        val collection = store.institutionCollections(institution.uri)(0)
        val objects = store.collectionObjects(collection.uri)
        val objectWithImages = objects.find(object_ => !object_.images.isEmpty)
        objectWithImages should not be (null)
        val objectWithThumbnail = objects.find(object_ => object_.images.exists(image => image.thumbnail.isDefined))
        objectWithThumbnail should not be (null)
        objects.size should be > 0
      }
    }
  }
}
