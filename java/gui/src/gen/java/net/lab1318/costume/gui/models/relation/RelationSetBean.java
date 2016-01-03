package net.lab1318.costume.gui.models.relation;

/**
 * VRA Core 4.0 relationSet element
 */
public class RelationSetBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ELEMENTS("elements", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.relation.RelationBean>>() {}, true, 1, "elements", org.thryft.protocol.Type.LIST),
        DISPLAY("display", new com.google.common.reflect.TypeToken<String>() {}, false, 2, "display", org.thryft.protocol.Type.STRING),
        NOTES("notes", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "notes", org.thryft.protocol.Type.STRING);

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
            case "elements": return ELEMENTS;
            case "display": return DISPLAY;
            case "notes": return NOTES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "elements": return ELEMENTS;
            case "display": return DISPLAY;
            case "notes": return NOTES;
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

    public RelationSetBean() {
        elements = null;
        display = null;
        notes = null;
    }

    public RelationSetBean(final net.lab1318.costume.api.models.relation.RelationSet other) {
        this.elements = (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.relation.Relation>, java.util.List<net.lab1318.costume.gui.models.relation.RelationBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.relation.RelationBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.relation.Relation> other) {
                final java.util.List<net.lab1318.costume.gui.models.relation.RelationBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.relation.RelationBean>();
                for (final net.lab1318.costume.api.models.relation.Relation element : other) {
                    copy.add(new net.lab1318.costume.gui.models.relation.RelationBean(element));
                }
                return copy;
            }
        }).apply(other.getElements());
        this.display = other.getDisplay().isPresent() ? other.getDisplay().get() : null;
        this.notes = other.getNotes().isPresent() ? other.getNotes().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof RelationSetBean)) {
            return false;
        }

        final RelationSetBean other = (RelationSetBean)otherObject;
        return
            getElements().equals(other.getElements()) &&
            (getDisplay() != null ? getDisplay().equals(other.getDisplay()) : other.getDisplay() == null) &&
            (getNotes() != null ? getNotes().equals(other.getNotes()) : other.getNotes() == null);
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
        case ELEMENTS: return getElements();
        case DISPLAY: return getDisplay();
        case NOTES: return getNotes();
        default:
            throw new IllegalStateException();
        }
    }

    public String getDisplay() {
        return display;
    }

    public java.util.List<net.lab1318.costume.gui.models.relation.RelationBean> getElements() {
        return elements;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getElements().hashCode();
        if (getDisplay() != null) {
            hashCode = 31 * hashCode + getDisplay().hashCode();
        }
        if (getNotes() != null) {
            hashCode = 31 * hashCode + getNotes().hashCode();
        }
        return hashCode;
    }

    public void setDisplay(final String display) {
        this.display = display;
    }

    public void setElements(final java.util.List<net.lab1318.costume.gui.models.relation.RelationBean> elements) {
        this.elements = elements;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("elements", getElements()).add("display", getDisplay()).add("notes", getNotes()).toString();
    }

    private java.util.List<net.lab1318.costume.gui.models.relation.RelationBean> elements;

    private String display;

    private String notes;
}
