package org.dressdiscover.gui.views.wizard;

import org.dressdiscover.gui.models.wizard.WizardState;
import org.dressdiscover.gui.views.TopLevelView;
import org.thryft.waf.gui.EventBus;

@SuppressWarnings("serial")
public abstract class AbstractWizardSummaryView<StateT extends WizardState> extends TopLevelView {
    protected AbstractWizardSummaryView(final EventBus eventBus) {
        super(eventBus);
    }

    public abstract void setModels(StateT state);
}
