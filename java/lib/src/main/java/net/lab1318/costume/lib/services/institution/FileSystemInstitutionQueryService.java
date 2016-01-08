package net.lab1318.costume.lib.services.institution;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.stores.institution.InstitutionFileSystem;

@Singleton
public class FileSystemInstitutionQueryService extends StoreInstitutionQueryService {
    @Inject
    public FileSystemInstitutionQueryService(final InstitutionFileSystem store) {
        super(store);
    }
}
