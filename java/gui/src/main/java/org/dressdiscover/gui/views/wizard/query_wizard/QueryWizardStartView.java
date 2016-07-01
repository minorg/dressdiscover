package org.dressdiscover.gui.views.wizard.query_wizard;

import org.dressdiscover.gui.events.wizard.WizardFeatureSetSelectionRequest;
import org.dressdiscover.gui.models.wizard.CostumeCoreWizardFeatureSet;
import org.dressdiscover.gui.views.TopLevelView;
import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@SessionScoped
public class QueryWizardStartView extends TopLevelView {
    @DesignRoot("QueryWizardStartView.html")
    private final static class Design extends VerticalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Button costumeCoreButton = null;
    }

    @Inject
    public QueryWizardStartView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels() {
        final Design design = new Design();
        design.costumeCoreButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus().post(new WizardFeatureSetSelectionRequest(CostumeCoreWizardFeatureSet.URL_NAME));
            }
        });
        setCompositionRoot(design);
    }

    public final static String NAME = "query_wizard";
}