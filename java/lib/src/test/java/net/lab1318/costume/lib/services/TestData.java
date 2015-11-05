package net.lab1318.costume.lib.services;

import org.thryft.native_.Url;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableTable;

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

public final class TestData {
    public static TestData getInstance() {
        return instance;
    }

    private TestData() {
        final ImmutableList.Builder<InstitutionEntry> institutionsBuilder = ImmutableList.builder();
        final ImmutableMultimap.Builder<InstitutionId, CollectionEntry> collectionsBuilder = ImmutableMultimap
                .builder();
        final ImmutableTable.Builder<InstitutionId, CollectionId, ObjectEntry> objectsBuilder = ImmutableTable
                .builder();

        try {
            for (final InstitutionId institutionId : new InstitutionId[] { InstitutionId.parse("test_institution") }) {
                institutionsBuilder.add(
                        new InstitutionEntry(institutionId, Institution.builder().setCopyrightNotice("Copyright notice")
                                .setTitle("Test institution").setUrl(Url.parse("http://example.com")).build()));
                final Collection collection = Collection.builder().setInstitutionId(institutionId)
                        .setTitle("Test collection").build();
                final CollectionId collectionId = CollectionId.parse(institutionId.toString() + "/test_collection");
                collectionsBuilder.put(institutionId, new CollectionEntry(collectionId, collection));
                objectsBuilder.put(institutionId, collectionId,
                        new ObjectEntry(ObjectId.parse(collectionId.toString() + "/test_object"),
                                Object.builder().setCollectionId(collectionId).setInstitutionId(institutionId)
                                        .setTitle("Test object").build()));
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
