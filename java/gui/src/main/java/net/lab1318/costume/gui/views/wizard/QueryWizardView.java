package net.lab1318.costume.gui.views.wizard;

import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;

import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class QueryWizardView extends TopLevelView {
    @Inject
    public QueryWizardView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels() {
    }

    public final static String NAME = "query_wizard";
}
