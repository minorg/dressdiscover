package net.lab1318.costume.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectCommandService implements net.lab1318.costume.api.services.object.ObjectCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.object.ValidatingObjectCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.object.ValidatingObjectCommandService.delegate") net.lab1318.costume.api.services.object.ObjectCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteObjects() throws net.lab1318.costume.api.services.IoException {
        delegate.deleteObjects();
    }

    @Override
    public final net.lab1318.costume.api.models.object.ObjectId postObject(final net.lab1318.costume.api.models.object.Object object) throws net.lab1318.costume.api.services.IoException {
        _validatePostObjectParameters(object);
        return com.google.common.base.Preconditions.checkNotNull(delegate.postObject(object), "net.lab1318.costume.api.services.object.ObjectCommandService.postObject: missing returnValue");
    }

    protected void _validatePostObjectParameters(final net.lab1318.costume.api.models.object.Object object) {
        com.google.common.base.Preconditions.checkNotNull(object, "net.lab1318.costume.api.services.object.ObjectCommandService.postObject: missing object");
    }

    private final net.lab1318.costume.api.services.object.ObjectCommandService delegate;
}
