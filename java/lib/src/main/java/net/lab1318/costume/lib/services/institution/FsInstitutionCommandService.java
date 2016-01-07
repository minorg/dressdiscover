package net.lab1318.costume.lib.services.institution;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.lib.services.ServiceExceptionHelper;
import net.lab1318.costume.lib.services.institution.LoggingInstitutionCommandService.Markers;
import net.lab1318.costume.lib.stores.institution.InstitutionStore;

@Singleton
public class FsInstitutionCommandService implements InstitutionCommandService {
    @Inject
    public FsInstitutionCommandService(final CollectionCommandService collectionCommandService,
            final InstitutionStore store) {
        this.collectionCommandService = checkNotNull(collectionCommandService);
        this.store = checkNotNull(store);
    }

    @Override
    public void deleteInstitutionById(final InstitutionId id) throws IoException, NoSuchInstitutionException {
        try {
            if (!store.deleteInstitutionById(id, logger, Markers.DELETE_INSTITUTION_BY_ID)) {
                throw new NoSuchInstitutionException();
            }
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting institution by id");
        }

        collectionCommandService.deleteCollectionsByInstitutionId(id);
    }

    @Override
    public void deleteInstitutions() throws IoException {
        try {
            store.deleteInstitutions(logger, Markers.DELETE_INSTITUTIONS);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error deleting institutions");
        }

        collectionCommandService.deleteCollections();
    }

    @Override
    public void putInstitution(final InstitutionId id, final Institution institution) throws IoException {
        try {
            store.putInstitution(institution, id, logger, Markers.PUT_INSTITUTION);
        } catch (final IOException e) {
            throw ServiceExceptionHelper.wrapException(e, "error putting institution");
        }
    }

    private final InstitutionStore store;
    private final CollectionCommandService collectionCommandService;
    private final static Logger logger = LoggerFactory.getLogger(FsInstitutionCommandService.class);
}
