package org.dressdiscover.gui.models.wizard;

import net.lab1318.costume.api.services.IoException;

public interface WizardFeatureSetFactory {
    public WizardFeatureSet createFeatureSet(WizardMode mode) throws IoException;

    public String getDisplayName();

    public String getUrlName();
}
