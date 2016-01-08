package net.lab1318.costume.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectQueryService implements net.lab1318.costume.api.services.object.ObjectQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.object.ValidatingObjectQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.object.ValidatingObjectQueryService.delegate") net.lab1318.costume.api.services.object.ObjectQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final net.lab1318.costume.api.models.object.Object getObjectById(final net.lab1318.costume.api.models.object.ObjectId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.object.NoSuchObjectException {
        _validateGetObjectByIdParameters(id);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectById(id), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectById: missing returnValue");
    }

    protected void _validateGetObjectByIdParameters(final net.lab1318.costume.api.models.object.ObjectId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectById: missing id");
    }

    private final net.lab1318.costume.api.services.object.ObjectQueryService delegate;
}
