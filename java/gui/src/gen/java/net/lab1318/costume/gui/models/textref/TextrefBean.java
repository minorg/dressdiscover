package net.lab1318.costume.gui.models.textref;

/**
 * VRA Core 4.0 textref element
 */
public class TextrefBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        NAME("name", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.textref.TextrefNameBean>() {}, true, 1, "name", org.thryft.protocol.Type.STRUCT),
        REFID("refid", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.textref.TextrefRefidBean>() {}, true, 2, "refid", org.thryft.protocol.Type.STRUCT);

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
            case "name": return NAME;
            case "refid": return REFID;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "name": return NAME;
            case "refid": return REFID;
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

    public TextrefBean() {
        name = null;
        refid = null;
    }

    public TextrefBean(final net.lab1318.costume.api.models.textref.Textref other) {
        this.name = new net.lab1318.costume.gui.models.textref.TextrefNameBean(other.getName());
        this.refid = new net.lab1318.costume.gui.models.textref.TextrefRefidBean(other.getRefid());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof TextrefBean)) {
            return false;
        }

        final TextrefBean other = (TextrefBean)otherObject;
        return
            getName().equals(other.getName()) &&
            getRefid().equals(other.getRefid());
    }

    public net.lab1318.costume.gui.models.textref.TextrefNameBean getName() {
        return name;
    }

    public net.lab1318.costume.gui.models.textref.TextrefRefidBean getRefid() {
        return refid;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getName().hashCode();
        hashCode = 31 * hashCode + getRefid().hashCode();
        return hashCode;
    }

    public void setName(final net.lab1318.costume.gui.models.textref.TextrefNameBean name) {
        this.name = name;
    }

    public void setRefid(final net.lab1318.costume.gui.models.textref.TextrefRefidBean refid) {
        this.refid = refid;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("name", getName()).add("refid", getRefid()).toString();
    }

    private net.lab1318.costume.gui.models.textref.TextrefNameBean name;

    private net.lab1318.costume.gui.models.textref.TextrefRefidBean refid;
}
