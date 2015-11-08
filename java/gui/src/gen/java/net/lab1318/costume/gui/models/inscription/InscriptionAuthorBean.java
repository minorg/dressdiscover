package net.lab1318.costume.gui.models.inscription;

public class InscriptionAuthorBean {
    public InscriptionAuthorBean() {
        title = null;
        refid = null;
        vocab = null;
    }

    public InscriptionAuthorBean(final net.lab1318.costume.api.models.inscription.InscriptionAuthor other) {
        this.title = other.getTitle();
        this.refid = other.getRefid().isPresent() ? other.getRefid().get() : null;
        this.vocab = other.getVocab().isPresent() ? other.getVocab().get() : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof InscriptionAuthorBean)) {
            return false;
        }

        final InscriptionAuthorBean other = (InscriptionAuthorBean)otherObject;
        return
            getTitle().equals(other.getTitle()) &&
            getRefid().equals(other.getRefid()) &&
            getVocab().equals(other.getVocab());
    }

    public String getRefid() {
        return refid;
    }

    public String getTitle() {
        return title;
    }

    public net.lab1318.costume.api.models.Vocab getVocab() {
        return vocab;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getRefid() != null) {
            hashCode = 31 * hashCode + getRefid().hashCode();
        }
        if (getVocab() != null) {
            hashCode = 31 * hashCode + getVocab().ordinal();
        }
        return hashCode;
    }

    public void setRefid(final String refid) {
        this.refid = refid;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setVocab(final net.lab1318.costume.api.models.Vocab vocab) {
        this.vocab = vocab;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("title", getTitle()).add("refid", getRefid()).add("vocab", getVocab()).toString();
    }

    private String title;

    private String refid;

    private net.lab1318.costume.api.models.Vocab vocab;
}
