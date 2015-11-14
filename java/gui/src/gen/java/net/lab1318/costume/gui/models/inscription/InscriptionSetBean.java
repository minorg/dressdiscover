package net.lab1318.costume.gui.models.inscription;

/**
 * VRA Core 4.0 inscriptionSet element
 */
public class InscriptionSetBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        INSCRIPTIONS("inscriptions", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionBean>>() {}, true, 1, "inscriptions", org.thryft.protocol.Type.LIST),
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
            case "inscriptions": return INSCRIPTIONS;
            case "display": return DISPLAY;
            case "notes": return NOTES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "inscriptions": return INSCRIPTIONS;
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

    public InscriptionSetBean() {
        inscriptions = null;
        display = null;
        notes = null;
    }

    public InscriptionSetBean(final net.lab1318.costume.api.models.inscription.InscriptionSet other) {
        this.inscriptions = (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.Inscription>, java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.Inscription> other) {
                final java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.inscription.InscriptionBean>();
                for (final net.lab1318.costume.api.models.inscription.Inscription element : other) {
                    copy.add(new net.lab1318.costume.gui.models.inscription.InscriptionBean(element));
                }
                return copy;
            }
        }).apply(other.getInscriptions());
        this.display = other.getDisplay().isPresent() ? other.getDisplay().get() : null;
        this.notes = other.getNotes().isPresent() ? other.getNotes().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InscriptionSetBean)) {
            return false;
        }

        final InscriptionSetBean other = (InscriptionSetBean)otherObject;
        return
            getInscriptions().equals(other.getInscriptions()) &&
            getDisplay().equals(other.getDisplay()) &&
            getNotes().equals(other.getNotes());
    }

    public String getDisplay() {
        return display;
    }

    public java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionBean> getInscriptions() {
        return inscriptions;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getInscriptions().hashCode();
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

    public void setInscriptions(final java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionBean> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("inscriptions", getInscriptions()).add("display", getDisplay()).add("notes", getNotes()).toString();
    }

    private java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionBean> inscriptions;

    private String display;

    private String notes;
}
