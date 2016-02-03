package net.lab1318.costume.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectSummaryQueryService implements net.lab1318.costume.api.services.object.ObjectSummaryQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.object.ValidatingObjectSummaryQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectSummaryQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.object.ValidatingObjectSummaryQueryService.delegate") net.lab1318.costume.api.services.object.ObjectSummaryQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final net.lab1318.costume.api.services.object.GetObjectSummariesResult getObjectSummaries(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query) throws net.lab1318.costume.api.services.IoException {
        _validateGetObjectSummariesParameters(options, query);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectSummaries(options, query), "net.lab1318.costume.api.services.object.ObjectSummaryQueryService.getObjectSummaries: missing returnValue");
    }

    protected void _validateGetObjectSummariesParameters(final com.google.common.base.Optional<net.lab1318.costume.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectQuery> query) {
        com.google.common.base.Preconditions.checkNotNull(options, "net.lab1318.costume.api.services.object.ObjectSummaryQueryService.getObjectSummaries: missing options");
        com.google.common.base.Preconditions.checkNotNull(query, "net.lab1318.costume.api.services.object.ObjectSummaryQueryService.getObjectSummaries: missing query");
    }

    private final net.lab1318.costume.api.services.object.ObjectSummaryQueryService delegate;
}
