package org.dressdiscover.gui.views.wizard.query_wizard;

import org.dressdiscover.gui.models.wizard.query_wizard.QueryWizardState;
import org.dressdiscover.gui.views.wizard.AbstractWizardSummaryView;
import org.dressdiscover.gui.views.wizard.WizardFeatureSetLayout;
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

@SuppressWarnings("serial")
@SessionScoped
public class QueryWizardSummaryView extends AbstractWizardSummaryView<QueryWizardState> {
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
    public void setModels(final QueryWizardState state) {
        final Design design = new Design();

        design.featureSetLayout.addComponent(new WizardFeatureSetLayout(Optional.absent(), _getEventBus(), state));

        design.searchButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus().post(GetObjectSummariesRequest.builder()
                        .setQuery(state.getFeatureSet().getSelectedAsQuery()).build());
            }
        });

        setCompositionRoot(design);
    }

    public final static String NAME = "query_wizard_summary";
}
