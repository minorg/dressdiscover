package net.lab1318.costume.lib.services.institution;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.collection.CollectionCommandService;
import net.lab1318.costume.lib.stores.institution.InstitutionFileSystem;

@Singleton
public class FileSystemInstitutionCommandService extends StoreInstitutionCommandService {
    @Inject
    public FileSystemInstitutionCommandService(final CollectionCommandService collectionCommandService,
            final InstitutionFileSystem store) {
        super(collectionCommandService, store);
    }
}
