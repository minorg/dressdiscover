package org.dressdiscover.gui.models.wizard;

import org.dressdiscover.api.services.IoException;

public interface WizardFeatureSetFactory {
    public WizardFeatureSet createFeatureSet(WizardMode mode) throws IoException;

    public String getDisplayName();

    public String getUrlName();
}
