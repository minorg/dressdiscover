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

    @Override
    public final com.google.common.primitives.UnsignedInteger getObjectCount(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectCountParameters(query);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectCount(query), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectCount: missing returnValue");
    }

    protected void _validateGetObjectCountParameters(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
        com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectCount: missing query");
    }

    @Override
    public final net.lab1318.costume.api.services.object.ObjectFacets getObjectFacets(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectFacetsParameters(query);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectFacets(query), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectFacets: missing returnValue");
    }

    protected void _validateGetObjectFacetsParameters(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
        com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjectFacets: missing query");
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjects(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectsOptions> options, final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectsParameters(options, query);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjects(options, query), "net.lab1318.costume.api.services.object.ObjectQueryService.getObjects: missing returnValue");
    }

    protected void _validateGetObjectsParameters(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectsOptions> options, final com.google.common.base.Optional<net.lab1318.costume.api.services.object.ObjectQuery> query) {
        com.google.common.base.Preconditions.checkNotNull(options, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjects: missing options");
        com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.ObjectQueryService.getObjects: missing query");
    }

    private final net.lab1318.costume.api.services.object.ObjectQueryService delegate;
}
