package net.lab1318.costume.gui.models.relation;

/**
 * VRA Core 4.0 relation element
 */
public class RelationBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TYPE("type", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.relation.RelationType>() {}, true, 1, "type", org.thryft.protocol.Type.STRING),
        HREF("href", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 2, "href", org.thryft.protocol.Type.STRING),
        RELIDS("relids", new com.google.common.reflect.TypeToken<java.util.Set<org.dressdiscover.api.models.object.ObjectId>>() {}, false, 3, "relids", org.thryft.protocol.Type.SET),
        TEXT("text", new com.google.common.reflect.TypeToken<String>() {}, false, 4, "text", org.thryft.protocol.Type.STRING);

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
            case "type": return TYPE;
            case "href": return HREF;
            case "relids": return RELIDS;
            case "text": return TEXT;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "type": return TYPE;
            case "href": return HREF;
            case "relids": return RELIDS;
            case "text": return TEXT;
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

    public RelationBean() {
        type = null;
        href = null;
        relids = null;
        text = null;
    }

    public RelationBean(final net.lab1318.costume.api.models.relation.Relation other) {
        this.type = other.getType();
        this.href = other.getHref().isPresent() ? other.getHref().get() : null;
        this.relids = other.getRelids().isPresent() ? new java.util.LinkedHashSet<org.dressdiscover.api.models.object.ObjectId>(other.getRelids().get()) : null;
        this.text = other.getText().isPresent() ? other.getText().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof RelationBean)) {
            return false;
        }

        final RelationBean other = (RelationBean)otherObject;
        return
            getType().equals(other.getType()) &&
            ((getHref() != null && other.getHref() != null) ? (getHref().equals(other.getHref())) : (getHref() == null && other.getHref() == null)) &&
            ((getRelids() != null && other.getRelids() != null) ? (getRelids().equals(other.getRelids())) : (getRelids() == null && other.getRelids() == null)) &&
            ((getText() != null && other.getText() != null) ? (getText().equals(other.getText())) : (getText() == null && other.getText() == null));
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
        case TYPE: return getType();
        case HREF: return getHref();
        case RELIDS: return getRelids();
        case TEXT: return getText();
        default:
            throw new IllegalStateException();
        }
    }

    public org.thryft.native_.Url getHref() {
        return href;
    }

    public java.util.Set<org.dressdiscover.api.models.object.ObjectId> getRelids() {
        return relids;
    }

    public String getText() {
        return text;
    }

    public net.lab1318.costume.api.models.relation.RelationType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getType().ordinal();
        if (getHref() != null) {
            hashCode = 31 * hashCode + getHref().hashCode();
        }
        if (getRelids() != null) {
            hashCode = 31 * hashCode + getRelids().hashCode();
        }
        if (getText() != null) {
            hashCode = 31 * hashCode + getText().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void setHref(final org.thryft.native_.Url href) {
        this.href = href;
    }

    public void setRelids(final java.util.Set<org.dressdiscover.api.models.object.ObjectId> relids) {
        this.relids = relids;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setType(final net.lab1318.costume.api.models.relation.RelationType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("type", getType()).add("href", getHref()).add("relids", getRelids()).add("text", getText()).toString();
    }

    private net.lab1318.costume.api.models.relation.RelationType type;

    private org.thryft.native_.Url href;

    private java.util.Set<org.dressdiscover.api.models.object.ObjectId> relids;

    private String text;
}
