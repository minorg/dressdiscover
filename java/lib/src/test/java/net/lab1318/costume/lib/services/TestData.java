package net.lab1318.costume.lib.services;

import java.util.Date;

import org.thryft.native_.Url;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableTable;

import net.lab1318.costume.api.models.ModelMetadata;
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

public final class TestData {
    public static TestData getInstance() {
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
                objectsBuilder
                        .put(institutionId, collectionId,
                                new ObjectEntry(ObjectId.parse(collectionId.toString() + "/test_object"),
                                        Object.builder().setCollectionId(collectionId).setInstitutionId(institutionId)
                                                .setModelMetadata(__newModelMetadata()).setTitle("Test object")
                                                .build()));
            }
        } catch (final InvalidCollectionIdException | InvalidInstitutionIdException | InvalidObjectIdException e) {
            throw new IllegalStateException();
        }
        collections = collectionsBuilder.build();
        institutions = institutionsBuilder.build();
        objects = objectsBuilder.build();
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

    private final ImmutableMultimap<InstitutionId, CollectionEntry> collections;
    private final ImmutableList<InstitutionEntry> institutions;
    private final ImmutableTable<InstitutionId, CollectionId, ObjectEntry> objects;
    private final static TestData instance = new TestData();
}
