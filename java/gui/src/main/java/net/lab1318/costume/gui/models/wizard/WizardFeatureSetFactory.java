package net.lab1318.costume.gui.models.wizard;

import net.lab1318.costume.api.services.IoException;

public interface WizardFeatureSetFactory {
    public WizardFeatureSet createFeatureSet() throws IoException;

    public String getDisplayName();

    public String getUrlName();
}
