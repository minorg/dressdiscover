package org.dressdiscover.lib.services.object;

@com.google.inject.Singleton
public class ValidatingObjectSummaryQueryService implements org.dressdiscover.api.services.object.ObjectSummaryQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.object.ValidatingObjectSummaryQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingObjectSummaryQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.object.ValidatingObjectSummaryQueryService.delegate") org.dressdiscover.api.services.object.ObjectSummaryQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.services.object.GetObjectSummariesResult getObjectSummaries(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) throws org.dressdiscover.api.services.IoException {
        _validateGetObjectSummariesParameters(options, query);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getObjectSummaries(options, query), "org.dressdiscover.api.services.object.ObjectSummaryQueryService.getObjectSummaries: missing returnValue");
    }

    protected void _validateGetObjectSummariesParameters(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) {
        com.google.common.base.Preconditions.checkNotNull(options, "org.dressdiscover.api.services.object.ObjectSummaryQueryService.getObjectSummaries: missing options");
        com.google.common.base.Preconditions.checkNotNull(query, "org.dressdiscover.api.services.object.ObjectSummaryQueryService.getObjectSummaries: missing query");
    }

    private final org.dressdiscover.api.services.object.ObjectSummaryQueryService delegate;
}
