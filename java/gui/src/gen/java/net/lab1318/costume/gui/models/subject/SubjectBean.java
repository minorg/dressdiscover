package net.lab1318.costume.gui.models.subject;

/**
 * VRA Core 4.0 subject element
 */
public class SubjectBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TERMS("terms", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.subject.SubjectTermBean>>() {}, true, 1, "terms", org.thryft.protocol.Type.LIST);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public int getThriftId() {
            return thriftId;
        }

        @Override
        public String getThriftProtocolKey() {
            return thriftProtocolKey;
        }

        @Override
        public org.thryft.protocol.Type getThriftProtocolType() {
            return thriftProtocolType;
        }

        @Override
        public String getThriftName() {
            return thriftName;
        }

        @Override
        public boolean hasThriftId() {
            return thriftId != org.thryft.protocol.FieldBegin.ABSENT_ID;
        }

        @Override
        public boolean isRequired()  {
            return required;
        }

        public static FieldMetadata valueOfJavaName(final String javaName) {
            switch (javaName) {
            case "terms": return TERMS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "terms": return TERMS;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final int thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            if (thriftId != org.thryft.protocol.FieldBegin.ABSENT_ID) {
                this.thriftProtocolKey = Integer.toString(thriftId) + ":" + thriftName;
            } else {
                this.thriftProtocolKey = thriftName;
            }
            this.thriftProtocolType = thriftProtocolType;
        }

        private final String javaName;
        private final com.google.common.reflect.TypeToken<?> javaType;
        private final boolean required;
        private final int thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public SubjectBean() {
        terms = null;
    }

    public SubjectBean(final net.lab1318.costume.api.models.subject.Subject other) {
        this.terms = (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.SubjectTerm>, java.util.List<net.lab1318.costume.gui.models.subject.SubjectTermBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.subject.SubjectTermBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.SubjectTerm> other) {
                final java.util.List<net.lab1318.costume.gui.models.subject.SubjectTermBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.subject.SubjectTermBean>();
                for (final net.lab1318.costume.api.models.subject.SubjectTerm element : other) {
                    copy.add(new net.lab1318.costume.gui.models.subject.SubjectTermBean(element));
                }
                return copy;
            }
        }).apply(other.getTerms());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof SubjectBean)) {
            return false;
        }

        final SubjectBean other = (SubjectBean)otherObject;
        return
            getTerms().equals(other.getTerms());
    }

    @Override
    public java.lang.Object get(final String fieldThriftName) {
        return get(FieldMetadata.valueOfThriftName(fieldThriftName));
    }

    @Override
    public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
        if (!(fieldMetadata instanceof FieldMetadata)) {
            throw new IllegalArgumentException();
        }
        return get((FieldMetadata)fieldMetadata);
    }

    public java.lang.Object get(final FieldMetadata fieldMetadata) {
        switch (fieldMetadata) {
        case TERMS: return getTerms();
        default:
            throw new IllegalStateException();
        }
    }

    public java.util.List<net.lab1318.costume.gui.models.subject.SubjectTermBean> getTerms() {
        return terms;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTerms().hashCode();
        return hashCode;
    }

    public void setTerms(final java.util.List<net.lab1318.costume.gui.models.subject.SubjectTermBean> terms) {
        this.terms = terms;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("terms", getTerms()).toString();
    }

    private java.util.List<net.lab1318.costume.gui.models.subject.SubjectTermBean> terms;
}
