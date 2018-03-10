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
        {
            if (options == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.ValidatingObjectSummaryQueryService.getObjectSummaries: options is null");
            }
        }
        {
            if (query == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.ValidatingObjectSummaryQueryService.getObjectSummaries: query is null");
            }
        }
        final org.dressdiscover.api.services.object.GetObjectSummariesResult __returnValue = delegate.getObjectSummaries(options, query);
        {
            if (__returnValue == null) {
                throw new NullPointerException("org.dressdiscover.api.services.object.ValidatingObjectSummaryQueryService.getObjectSummaries: __returnValue is null");
            }
        }
        return __returnValue;
    }

    private final org.dressdiscover.api.services.object.ObjectSummaryQueryService delegate;
}
