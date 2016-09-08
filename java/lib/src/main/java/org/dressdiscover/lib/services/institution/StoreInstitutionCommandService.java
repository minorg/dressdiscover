package org.dressdiscover.lib.services.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.CollectionCommandService;
import org.dressdiscover.api.services.institution.InstitutionCommandService;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.lib.services.institution.LoggingInstitutionCommandService.Markers;
import org.dressdiscover.lib.stores.institution.InstitutionStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

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

        if (!store.deleteInstitutionById(id, logger, Markers.DELETE_INSTITUTION_BY_ID)) {
            throw new NoSuchInstitutionException();
        }
    }

    @Override
    public final void putInstitution(final InstitutionId id, final Institution institution) throws IoException {
        store.putInstitution(institution, id, logger, Markers.PUT_INSTITUTION);
    }

    private final InstitutionStore store;
    private final CollectionCommandService collectionCommandService;
    private final static Logger logger = LoggerFactory.getLogger(StoreInstitutionCommandService.class);
}
