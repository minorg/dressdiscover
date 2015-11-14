package net.lab1318.costume.gui.models.rights;

/**
 * VRA Core 4.0 rightsSet element
 */
public class RightsSetBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        RIGHTS("rights", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.rights.RightsBean>>() {}, true, 1, "rights", org.thryft.protocol.Type.LIST),
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
            case "rights": return RIGHTS;
            case "display": return DISPLAY;
            case "notes": return NOTES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "rights": return RIGHTS;
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

    public RightsSetBean() {
        rights = null;
        display = null;
        notes = null;
    }

    public RightsSetBean(final net.lab1318.costume.api.models.rights.RightsSet other) {
        this.rights = (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights>, java.util.List<net.lab1318.costume.gui.models.rights.RightsBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.rights.RightsBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.rights.Rights> other) {
                final java.util.List<net.lab1318.costume.gui.models.rights.RightsBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.rights.RightsBean>();
                for (final net.lab1318.costume.api.models.rights.Rights element : other) {
                    copy.add(new net.lab1318.costume.gui.models.rights.RightsBean(element));
                }
                return copy;
            }
        }).apply(other.getRights());
        this.display = other.getDisplay().isPresent() ? other.getDisplay().get() : null;
        this.notes = other.getNotes().isPresent() ? other.getNotes().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof RightsSetBean)) {
            return false;
        }

        final RightsSetBean other = (RightsSetBean)otherObject;
        return
            getRights().equals(other.getRights()) &&
            getDisplay().equals(other.getDisplay()) &&
            getNotes().equals(other.getNotes());
    }

    public String getDisplay() {
        return display;
    }

    public String getNotes() {
        return notes;
    }

    public java.util.List<net.lab1318.costume.gui.models.rights.RightsBean> getRights() {
        return rights;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getRights().hashCode();
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

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    public void setRights(final java.util.List<net.lab1318.costume.gui.models.rights.RightsBean> rights) {
        this.rights = rights;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("rights", getRights()).add("display", getDisplay()).add("notes", getNotes()).toString();
    }

    private java.util.List<net.lab1318.costume.gui.models.rights.RightsBean> rights;

    private String display;

    private String notes;
}
