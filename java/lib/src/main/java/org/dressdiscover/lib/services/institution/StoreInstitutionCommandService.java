package org.dressdiscover.lib.services.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.lib.services.IoExceptions;
import org.dressdiscover.lib.services.institution.LoggingInstitutionCommandService.Markers;
import org.dressdiscover.lib.stores.institution.InstitutionStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;

@Singleton
public class StoreInstitutionCommandService implements InstitutionCommandService {
    @Inject
    public StoreInstitutionCommandService(final CollectionCommandService collectionCommandService,
            final InstitutionStore store) {
        this.collectionCommandService = checkNotNull(collectionCommandService);
        this.store = checkNotNull(store);
    }

    @Override
    public final void deleteInstitutionById(final InstitutionId id) throws IoException, NoSuchInstitutionException {
        // Delete collections first so they can resolve the institution to get
        // its collection store
        collectionCommandService.deleteCollectionsByInstitutionId(id);

        try {
            if (!store.deleteInstitutionById(id, logger, Markers.DELETE_INSTITUTION_BY_ID)) {
                throw new NoSuchInstitutionException();
            }
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error deleting institution by id");
        }
    }

    @Override
    public final void putInstitution(final InstitutionId id, final Institution institution) throws IoException {
        try {
            store.putInstitution(institution, id, logger, Markers.PUT_INSTITUTION);
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "error putting institution");
        }
    }

    private final InstitutionStore store;
    private final CollectionCommandService collectionCommandService;
    private final static Logger logger = LoggerFactory.getLogger(StoreInstitutionCommandService.class);
}