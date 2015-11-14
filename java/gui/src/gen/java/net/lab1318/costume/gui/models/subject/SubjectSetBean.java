package net.lab1318.costume.gui.models.subject;

/**
 * VRA Core 4.0 subjectSet element
 */
public class SubjectSetBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        SUBJECTS("subjects", new com.google.common.reflect.TypeToken<java.util.List<net.lab1318.costume.gui.models.subject.SubjectBean>>() {}, true, 1, "subjects", org.thryft.protocol.Type.LIST),
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
            case "subjects": return SUBJECTS;
            case "display": return DISPLAY;
            case "notes": return NOTES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "subjects": return SUBJECTS;
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

    public SubjectSetBean() {
        subjects = null;
        display = null;
        notes = null;
    }

    public SubjectSetBean(final net.lab1318.costume.api.models.subject.SubjectSet other) {
        this.subjects = (new com.google.common.base.Function<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject>, java.util.List<net.lab1318.costume.gui.models.subject.SubjectBean>>() {
            @Override
            public java.util.List<net.lab1318.costume.gui.models.subject.SubjectBean> apply(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.subject.Subject> other) {
                final java.util.List<net.lab1318.costume.gui.models.subject.SubjectBean> copy = new java.util.ArrayList<net.lab1318.costume.gui.models.subject.SubjectBean>();
                for (final net.lab1318.costume.api.models.subject.Subject element : other) {
                    copy.add(new net.lab1318.costume.gui.models.subject.SubjectBean(element));
                }
                return copy;
            }
        }).apply(other.getSubjects());
        this.display = other.getDisplay().isPresent() ? other.getDisplay().get() : null;
        this.notes = other.getNotes().isPresent() ? other.getNotes().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof SubjectSetBean)) {
            return false;
        }

        final SubjectSetBean other = (SubjectSetBean)otherObject;
        return
            getSubjects().equals(other.getSubjects()) &&
            getDisplay().equals(other.getDisplay()) &&
            getNotes().equals(other.getNotes());
    }

    public String getDisplay() {
        return display;
    }

    public String getNotes() {
        return notes;
    }

    public java.util.List<net.lab1318.costume.gui.models.subject.SubjectBean> getSubjects() {
        return subjects;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getSubjects().hashCode();
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

    public void setSubjects(final java.util.List<net.lab1318.costume.gui.models.subject.SubjectBean> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("subjects", getSubjects()).add("display", getDisplay()).add("notes", getNotes()).toString();
    }

    private java.util.List<net.lab1318.costume.gui.models.subject.SubjectBean> subjects;

    private String display;

    private String notes;
}
