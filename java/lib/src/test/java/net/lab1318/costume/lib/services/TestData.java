package net.lab1318.costume.lib.services;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.Object;

public final class TestData {
    public static TestData getInstance() {
        return instance;
    }

    private TestData() {
        final ImmutableList.Builder<InstitutionEntry> institutionsBuilder = ImmutableList.builder();
        final ImmutableMap.Builder<InstitutionId, Collection> collectionsBuilder = ImmutableMap.builder();
        final ImmutableTable.Builder<InstitutionId, Collection, Object> objectsBuilder = ImmutableTable.builder();
        for (final InstitutionId institutionId : InstitutionId.values()) {
            String institutionTitle;
            switch (institutionId) {
            case POWERHOUSE_MUSEUM:
                institutionTitle = "Powerhouse Museum";
                break;
            default:
                throw new UnsupportedOperationException();
            }

            institutionsBuilder
                    .add(new InstitutionEntry(institutionId, Institution.builder().setTitle(institutionTitle).build()));
            final Collection collection = Collection.builder().setInstitutionId(institutionId)
                    .setTitle("Test collection").build();
            collectionsBuilder.put(institutionId, collection);
            objectsBuilder.put(institutionId, collection,
                    Object.builder().setInstitutionId(institutionId).setTitle("Test object").build());
        }
        collections = collectionsBuilder.build();
        institutions = institutionsBuilder.build();
        objects = objectsBuilder.build();
    }

    public ImmutableMap<InstitutionId, Collection> getCollections() {
        return collections;
    }

    public ImmutableList<InstitutionEntry> getInstitutions() {
        return institutions;
    }

    public ImmutableTable<InstitutionId, Collection, Object> getObjects() {
        return objects;
    }

    private final ImmutableMap<InstitutionId, Collection> collections;
    private final ImmutableList<InstitutionEntry> institutions;
    private final ImmutableTable<InstitutionId, Collection, Object> objects;
    private final static TestData instance = new TestData();
}
