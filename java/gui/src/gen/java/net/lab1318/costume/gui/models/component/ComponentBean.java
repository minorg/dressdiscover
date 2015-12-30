package net.lab1318.costume.gui.models.component;

/**
 * Costume Core component element
 */
public class ComponentBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TERM("term", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.component.ComponentTermBean>() {}, true, 1, "term", org.thryft.protocol.Type.STRUCT),
        STRUCTURES("structures", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.structure.StructureSetBean>() {}, false, 2, "structures", org.thryft.protocol.Type.STRUCT);

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
            case "term": return TERM;
            case "structures": return STRUCTURES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "term": return TERM;
            case "structures": return STRUCTURES;
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

    public ComponentBean() {
        term = null;
        structures = null;
    }

    public ComponentBean(final net.lab1318.costume.api.models.component.Component other) {
        this.term = new net.lab1318.costume.gui.models.component.ComponentTermBean(other.getTerm());
        this.structures = other.getStructures().isPresent() ? new net.lab1318.costume.gui.models.structure.StructureSetBean(other.getStructures().get()) : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ComponentBean)) {
            return false;
        }

        final ComponentBean other = (ComponentBean)otherObject;
        return
            getTerm().equals(other.getTerm()) &&
            (getStructures() != null ? getStructures().equals(other.getStructures()) : other.getStructures() == null);
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "term": return getTerm();
        case "structures": return getStructures();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public net.lab1318.costume.gui.models.structure.StructureSetBean getStructures() {
        return structures;
    }

    public net.lab1318.costume.gui.models.component.ComponentTermBean getTerm() {
        return term;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTerm().hashCode();
        if (getStructures() != null) {
            hashCode = 31 * hashCode + getStructures().hashCode();
        }
        return hashCode;
    }

    public void setStructures(final net.lab1318.costume.gui.models.structure.StructureSetBean structures) {
        this.structures = structures;
    }

    public void setTerm(final net.lab1318.costume.gui.models.component.ComponentTermBean term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("term", getTerm()).add("structures", getStructures()).toString();
    }

    private net.lab1318.costume.gui.models.component.ComponentTermBean term;

    private net.lab1318.costume.gui.models.structure.StructureSetBean structures;
}
