package org.dressdiscover.api.services.object;

public interface ObjectSummaryQueryService {
    public enum FunctionMetadata {
        GET_OBJECT_SUMMARIES("get_object_summaries");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public default org.dressdiscover.api.services.object.GetObjectSummariesResult getObjectSummaries() throws org.dressdiscover.api.services.IoException {
        return getObjectSummaries(com.google.common.base.Optional.<org.dressdiscover.api.services.object.GetObjectSummariesOptions> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent());
    }

    public default org.dressdiscover.api.services.object.GetObjectSummariesResult getObjectSummaries(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options) throws org.dressdiscover.api.services.IoException {
        return getObjectSummaries(options, com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectQuery> absent());
    }

    public org.dressdiscover.api.services.object.GetObjectSummariesResult getObjectSummaries(final com.google.common.base.Optional<org.dressdiscover.api.services.object.GetObjectSummariesOptions> options, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectQuery> query) throws org.dressdiscover.api.services.IoException;
}
