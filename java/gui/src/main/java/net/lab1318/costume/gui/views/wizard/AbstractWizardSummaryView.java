package net.lab1318.costume.gui.views.wizard;

import org.thryft.waf.gui.EventBus;

import net.lab1318.costume.gui.models.wizard.WizardState;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
public abstract class AbstractWizardSummaryView<StateT extends WizardState> extends TopLevelView {
    protected AbstractWizardSummaryView(final EventBus eventBus) {
        super(eventBus);
    }

    public abstract void setModels(StateT state);
}
