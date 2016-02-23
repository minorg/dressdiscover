package net.lab1318.costume.gui.views.wizard.query_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.services.object.ObjectSummaryQueryService.Messages.GetObjectSummariesRequest;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.views.wizard.AbstractWizardSummaryView;
import net.lab1318.costume.gui.views.wizard.WizardFeatureSetLayout;

@SuppressWarnings("serial")
@SessionScoped
public class QueryWizardSummaryView extends AbstractWizardSummaryView {
    @DesignRoot("QueryWizardSummaryView.html")
    private final static class Design extends VerticalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Layout featureSetLayout;
        Button searchButton;
    }

    @Inject
    public QueryWizardSummaryView(final EventBus eventBus) {
        super(eventBus);
    }

    @Override
    public void setModels(final WizardFeatureSet featureSet) {
        final Design design = new Design();

        design.featureSetLayout.addComponent(new WizardFeatureSetLayout(Optional.absent(), _getEventBus(), featureSet));

        design.searchButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus()
                        .post(GetObjectSummariesRequest.builder().setQuery(featureSet.getSelectedAsQuery()).build());
            }
        });

        setCompositionRoot(design);
    }

    public final static String NAME = "query_wizard_summary";
}
