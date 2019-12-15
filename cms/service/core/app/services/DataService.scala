package services

import org.apache.jena.rdf.model.{Model, Resource}
import org.apache.jena.vocabulary.RDF
import org.collaborationnetworks.ontology.vocabulary.CN
import org.collaborationnetworks.ontology.{Creation, Derivation, Organization, Person, Thing, ThingCompanion, Work}

import scala.collection.JavaConverters._

class DataService(model: Model) {
  private def creations = things(CN.Creation, Creation)
  private def derivations = things(CN.Derivation, Derivation)
  private def organizations = things(CN.Organization, Organization)

  def people: Set[Person] = things(CN.Person, Person)

  def personById(id: String): Person = {
    val person = people.find((person) => person.id == id)
    if (person.isDefined) person.get else throw new NoSuchElementException();
  }

  def things: Set[Thing] = creations ++ derivations ++ organizations ++ people ++ works
  private def things[ThingT <: Thing](rdfType: Resource, thingCompanion: ThingCompanion[ThingT]): Set[ThingT] =
    model.listStatements(null, RDF.`type`, rdfType).asScala.map(statement => thingCompanion.fromResource(statement.getSubject)).toSet

  private def works = things(CN.Work, Work)

  def worksByAgentId(id: String): Set[Work] = {
    var createdWorks =
      for (
        creation <- creations
        if (creation.agents.exists(agent => agent.id == id))
      )
        yield creation.work

    val derivedWorks =
      (
        for (
          derivation <- derivations
          if (derivation.agents.exists(agent => agent.id == id))
        )
          yield (derivation.from, derivation.to)
        ).flatMap(item => List(item._1, item._2))

    createdWorks.union(derivedWorks)
  }

}
