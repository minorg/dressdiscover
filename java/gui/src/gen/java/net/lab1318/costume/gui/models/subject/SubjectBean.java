package net.lab1318.costume.gui.models.subject;

/**
 * VRA Core 4.0 subject element
 */
public class SubjectBean {
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
