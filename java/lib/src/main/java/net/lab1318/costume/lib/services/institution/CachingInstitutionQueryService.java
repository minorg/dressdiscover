package net.lab1318.costume.lib.services.institution;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.stores.institution.InstitutionCache;

@Singleton
public class CachingInstitutionQueryService extends StoreInstitutionQueryService {
    @Inject
    public CachingInstitutionQueryService(final InstitutionCache store) {
        super(store);
    }
}
