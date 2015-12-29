package net.lab1318.costume.gui.models.inscription;

/**
 * VRA Core 4.0 inscription element
 */
public class InscriptionBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TEXTS("texts", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionTextBean>>() {}, true, 1, "texts", org.thryft.protocol.Type.LIST),
        AUTHOR("author", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.inscription.InscriptionAuthorBean>() {}, false, 2, "author", org.thryft.protocol.Type.STRUCT),
        POSITION("position", new com.google.common.reflect.TypeToken<String>() {}, false, 3, "position", org.thryft.protocol.Type.STRING);

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
            case "texts": return TEXTS;
            case "author": return AUTHOR;
            case "position": return POSITION;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "texts": return TEXTS;
            case "author": return AUTHOR;
            case "position": return POSITION;
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

    public InscriptionBean() {
        texts = null;
        author = null;
        position = null;
    }

    public InscriptionBean(final net.lab1318.costume.api.models.inscription.Inscription other) {
        this.texts = (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText>, java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionTextBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionTextBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.inscription.InscriptionText> other) {
                final java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionTextBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.inscription.InscriptionTextBean>();
                for (final net.lab1318.costume.api.models.inscription.InscriptionText element : other) {
                    copy.add(new net.lab1318.costume.gui.models.inscription.InscriptionTextBean(element));
                }
                return copy;
            }
        }).apply(other.getTexts());
        this.author = other.getAuthor().isPresent() ? new net.lab1318.costume.gui.models.inscription.InscriptionAuthorBean(other.getAuthor().get()) : null;
        this.position = other.getPosition().isPresent() ? other.getPosition().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InscriptionBean)) {
            return false;
        }

        final InscriptionBean other = (InscriptionBean)otherObject;
        return
            getTexts().equals(other.getTexts()) &&
            (getAuthor() != null ? getAuthor().equals(other.getAuthor()) : other.getAuthor() == null) &&
            (getPosition() != null ? getPosition().equals(other.getPosition()) : other.getPosition() == null);
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "texts": return getTexts();
        case "author": return getAuthor();
        case "position": return getPosition();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public net.lab1318.costume.gui.models.inscription.InscriptionAuthorBean getAuthor() {
        return author;
    }

    public String getPosition() {
        return position;
    }

    public java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionTextBean> getTexts() {
        return texts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTexts().hashCode();
        if (getAuthor() != null) {
            hashCode = 31 * hashCode + getAuthor().hashCode();
        }
        if (getPosition() != null) {
            hashCode = 31 * hashCode + getPosition().hashCode();
        }
        return hashCode;
    }

    public void setAuthor(final net.lab1318.costume.gui.models.inscription.InscriptionAuthorBean author) {
        this.author = author;
    }

    public void setPosition(final String position) {
        this.position = position;
    }

    public void setTexts(final java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionTextBean> texts) {
        this.texts = texts;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("texts", getTexts()).add("author", getAuthor()).add("position", getPosition()).toString();
    }

    private java.util.List<net.lab1318.costume.gui.models.inscription.InscriptionTextBean> texts;

    private net.lab1318.costume.gui.models.inscription.InscriptionAuthorBean author;

    private String position;
}
