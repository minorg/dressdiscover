package net.lab1318.costume.lib.services.user;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.stores.user.UserFileSystem;

@Singleton
public class FileSystemUserCommandService extends StoreUserCommandService {
    @Inject
    public FileSystemUserCommandService(final UserFileSystem store) {
        super(store);
    }
}
