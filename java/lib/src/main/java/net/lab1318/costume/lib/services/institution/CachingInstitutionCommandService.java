package net.lab1318.costume.lib.services.institution;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.lib.stores.institution.InstitutionCache;

@Singleton
public class CachingInstitutionCommandService extends StoreInstitutionCommandService {
    @Inject
    public CachingInstitutionCommandService(final CollectionCommandService collectionCommandService,
            final InstitutionCache store) {
        super(collectionCommandService, store);
    }
}
