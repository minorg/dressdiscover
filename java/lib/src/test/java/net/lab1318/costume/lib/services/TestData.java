package net.lab1318.costume.lib.services;

import java.util.Date;

import org.thryft.native_.Url;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableTable;

import net.lab1318.costume.api.models.ModelMetadata;
import net.lab1318.costume.api.models.agent.Agent;
import net.lab1318.costume.api.models.agent.AgentName;
import net.lab1318.costume.api.models.agent.AgentNameType;
import net.lab1318.costume.api.models.agent.AgentSet;
import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.institution.InvalidInstitutionIdException;
import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.rights.Rights;
import net.lab1318.costume.api.models.rights.RightsSet;
import net.lab1318.costume.api.models.rights.RightsType;
import net.lab1318.costume.api.models.subject.Subject;
import net.lab1318.costume.api.models.subject.SubjectSet;
import net.lab1318.costume.api.models.subject.SubjectTerm;
import net.lab1318.costume.api.models.subject.SubjectTermType;

public final class TestData {
    public static synchronized TestData getInstance() {
        if (instance == null) {
            instance = new TestData();
        }
        return instance;
    }

    private static ModelMetadata __newModelMetadata() {
        final Date current = new Date();
        return ModelMetadata.builder().setCtime(current).setMtime(current).build();
    }

    private TestData() {
        final ImmutableList.Builder<InstitutionEntry> institutionsBuilder = ImmutableList.builder();
        final ImmutableMultimap.Builder<InstitutionId, CollectionEntry> collectionsBuilder = ImmutableMultimap
                .builder();
        final ImmutableTable.Builder<InstitutionId, CollectionId, ObjectEntry> objectsBuilder = ImmutableTable
                .builder();

        {
            agents = ImmutableList.<Agent> builder()
                    .add(Agent.builder()
                            .setName(AgentName.builder().setText("Test agent").setType(AgentNameType.PERSONAL).build())
                            .build())
                    .build();
        }

        {
            subjects = ImmutableList.<Subject> builder()
                    .add(Subject.builder().setTerms(ImmutableList.of(
                            SubjectTerm.builder().setText("Test subject").setType(SubjectTermType.FAMILY_NAME).build()))
                    .build()).build();
        }

        try {
            for (final InstitutionId institutionId : new InstitutionId[] { InstitutionId.parse("test_institution") }) {
                institutionsBuilder.add(new InstitutionEntry(institutionId,
                        Institution.builder().setDataRights(RightsSet.builder().setDisplay("Copyright notice")
                                .setRights(ImmutableList.of(Rights.builder().setRightsHolder("Test rights holder")
                                        .setText("Test rights text").setType(RightsType.COPYRIGHTED).build()))
                                .build()).setModelMetadata(__newModelMetadata()).setTitle("Test institution")
                        .setUrl(Url.parse("http://example.com")).build()));

                final Collection collection = Collection.builder().setInstitutionId(institutionId)
                        .setModelMetadata(__newModelMetadata()).setTitle("Test collection").build();
                final CollectionId collectionId = CollectionId.parse(institutionId.toString() + "/test_collection");

                collectionsBuilder.put(institutionId, new CollectionEntry(collectionId, collection));

                {
                    final Object.Builder objectBuilder = Object.builder().setAgents(new AgentSet(agents))
                            .setCollectionId(collectionId).setInstitutionId(institutionId)
                            .setModelMetadata(__newModelMetadata()).setSubjects(new SubjectSet(subjects))
                            .setTitle("Test object");

                    objectsBuilder.put(institutionId, collectionId, new ObjectEntry(
                            ObjectId.parse(collectionId.toString() + "/test_object"), objectBuilder.build()));
                }
            }
        } catch (final InvalidCollectionIdException | InvalidInstitutionIdException | InvalidObjectIdException e) {
            throw new IllegalStateException();
        }
        collections = collectionsBuilder.build();
        institutions = institutionsBuilder.build();
        objects = objectsBuilder.build();
    }

    public ImmutableList<Agent> getAgents() {
        return agents;
    }

    public ImmutableMultimap<InstitutionId, CollectionEntry> getCollections() {
        return collections;
    }

    public ImmutableList<InstitutionEntry> getInstitutions() {
        return institutions;
    }

    public ImmutableTable<InstitutionId, CollectionId, ObjectEntry> getObjects() {
        return objects;
    }

    public ImmutableList<Subject> getSubjects() {
        return subjects;
    }

    private final ImmutableList<Agent> agents;
    private final ImmutableMultimap<InstitutionId, CollectionEntry> collections;
    private final ImmutableList<InstitutionEntry> institutions;
    private final ImmutableTable<InstitutionId, CollectionId, ObjectEntry> objects;
    private final ImmutableList<Subject> subjects;
    private static TestData instance = null;
}
