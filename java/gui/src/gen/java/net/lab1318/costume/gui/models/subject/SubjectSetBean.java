package net.lab1318.costume.gui.models.subject;

/**
 * VRA Core 4.0 subjectSet element
 */
public class SubjectSetBean {
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
