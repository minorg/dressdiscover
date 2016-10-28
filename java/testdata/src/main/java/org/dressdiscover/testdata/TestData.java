package org.dressdiscover.testdata;

import java.util.Date;

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.collection.InvalidCollectionIdException;
import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.models.institution.InvalidInstitutionIdException;
import org.dressdiscover.api.models.object.InvalidObjectIdException;
import org.dressdiscover.api.models.object.Object;
import org.dressdiscover.api.models.object.ObjectEntry;
import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.models.user.User;
import org.dressdiscover.api.vocabularies.vra_core.VraCoreObject;
import org.dressdiscover.api.vocabularies.vra_core.agent.Agent;
import org.dressdiscover.api.vocabularies.vra_core.agent.AgentName;
import org.dressdiscover.api.vocabularies.vra_core.agent.AgentNameType;
import org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet;
import org.dressdiscover.api.vocabularies.vra_core.rights.Rights;
import org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet;
import org.dressdiscover.api.vocabularies.vra_core.rights.RightsType;
import org.dressdiscover.api.vocabularies.vra_core.subject.Subject;
import org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet;
import org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm;
import org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTermType;
import org.dressdiscover.api.vocabularies.vra_core.title.Title;
import org.dressdiscover.api.vocabularies.vra_core.title.TitleSet;
import org.dressdiscover.api.vocabularies.vra_core.title.TitleType;
import org.thryft.native_.EmailAddress;
import org.thryft.native_.Url;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableTable;

public final class TestData {
    public static synchronized TestData getInstance() {
        if (instance == null) {
            instance = new TestData();
        }
        return instance;
    }

    private TestData() {
        final ImmutableList.Builder<InstitutionEntry> institutionsBuilder = ImmutableList.builder();
        final ImmutableMultimap.Builder<InstitutionId, CollectionEntry> collectionsBuilder = ImmutableMultimap
                .builder();
        final ImmutableTable.Builder<InstitutionId, CollectionId, ObjectEntry> objectsBuilder = ImmutableTable
                .builder();

        {
            agents = ImmutableList.<Agent>builder().add(Agent.builder()
                    .setName(AgentName.builder().setText("Test agent").setType(AgentNameType.PERSONAL).build()).build())
                    .build();
        }

        {
            categories = ImmutableList.of("Textiles", "Clothing");
        }

        {
            subjects = ImmutableList.<Subject>builder()
                    .add(Subject.builder().setTerms(ImmutableList.of(
                            SubjectTerm.builder().setText("Test subject").setType(SubjectTermType.FAMILY_NAME).build()))
                            .build())
                    .build();
        }

        try {
            for (final InstitutionId institutionId : new InstitutionId[] { InstitutionId.parse("test_institution") }) {
                institutionsBuilder.add(InstitutionEntry.create(institutionId,
                        Institution.builder().setDataRights(RightsSet.builder().setDisplay("Copyright notice")
                                .setElements(ImmutableList.of(Rights.builder().setRightsHolder("Test rights holder")
                                        .setText("Test rights text").setType(RightsType.COPYRIGHTED).build()))
                                .build()).setTitle("Test institution").setUrl(Url.parse("http://example.com"))
                                .build()));

                final Collection collection = Collection.builder().setTitle("Test collection").build();
                final CollectionId collectionId = CollectionId.parse(institutionId.toString() + "/test_collection");

                collectionsBuilder.put(institutionId, CollectionEntry.create(collectionId, collection));

                {
                    final Object.Builder objectBuilder = Object.builder()
                            .setVraCore(
                                    VraCoreObject.builder().setAgentSets(ImmutableList.of(AgentSet.create(agents)))
                                            .setSubjectSets(ImmutableList.of(SubjectSet.create(subjects)))
                                            .setTitleSets(ImmutableList.of(TitleSet.builder()
                                                    .setElements(ImmutableList.of(Title.builder().setText("Test object")
                                                            .setType(TitleType.DESCRIPTIVE).build()))
                                                    .build()))
                                            .build());

                    objectsBuilder.put(institutionId, collectionId, ObjectEntry
                            .create(ObjectId.parse(collectionId.toString() + "/test_object"), objectBuilder.build()));
                }
            }
        } catch (final InvalidCollectionIdException | InvalidInstitutionIdException | InvalidObjectIdException e) {
            throw new IllegalStateException(e);
        }
        collections = collectionsBuilder.build();
        institutions = institutionsBuilder.build();
        objects = objectsBuilder.build();

        final ImmutableList.Builder<User> usersBuilder = ImmutableList.builder();
        for (int i = 0; i < 2; i++) {
            usersBuilder.add(User.builder().setCtime(new Date())
                    .setEmailAddress(new EmailAddress("testuser" + i + "@example.com")).build());
        }
        users = usersBuilder.build();
    }

    public ImmutableList<Agent> getAgents() {
        return agents;
    }

    public ImmutableList<String> getCategories() {
        return categories;
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

    public ImmutableList<User> getUsers() {
        return users;
    }

    private final ImmutableList<Agent> agents;
    private ImmutableList<String> categories;
    private final ImmutableMultimap<InstitutionId, CollectionEntry> collections;
    private final ImmutableList<InstitutionEntry> institutions;
    private final ImmutableTable<InstitutionId, CollectionId, ObjectEntry> objects;
    private final ImmutableList<Subject> subjects;
    private final ImmutableList<User> users;
    private static TestData instance = null;
}
