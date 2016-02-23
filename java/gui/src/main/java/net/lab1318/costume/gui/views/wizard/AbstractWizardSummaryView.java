package net.lab1318.costume.gui.views.wizard;

import org.thryft.waf.gui.EventBus;

import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
public abstract class AbstractWizardSummaryView extends TopLevelView {
    protected AbstractWizardSummaryView(final EventBus eventBus) {
        super(eventBus);
    }

    public abstract void setModels(final WizardFeatureSet featureSet);
}
