package org.dressdiscover.gui.views.wizard.query_wizard;

import org.dressdiscover.gui.models.wizard.EnumWizardFeature;
import org.dressdiscover.gui.models.wizard.WizardFeature;
import org.dressdiscover.gui.models.wizard.query_wizard.QueryWizardState;
import org.dressdiscover.gui.views.TopLevelView;
import org.dressdiscover.gui.views.wizard.EnumWizardFeatureLayout;
import org.dressdiscover.gui.views.wizard.WizardFeatureNavigationLayout;
import org.dressdiscover.gui.views.wizard.WizardFeatureSetLayout;
import org.thryft.waf.gui.EventBus;

import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;

import net.lab1318.costume.api.services.object.ObjectSummaryQueryService.Messages.GetObjectSummariesRequest;

@SuppressWarnings("serial")
@SessionScoped
public class QueryWizardFeatureView extends TopLevelView {
    @DesignRoot("QueryWizardFeatureView.html")
    private final static class Design extends HorizontalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Layout bottomNavigationLayout;
        Layout currentFeatureLayout;
        Label currentFeatureNameLabel;
        Layout featureSetLayout;
        Button selectedObjectCountButton;
        Layout topNavigationLayout;
    }

    @Inject
    public QueryWizardFeatureView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final UnsignedInteger selectedObjectCount, final QueryWizardState state) {
        final WizardFeature currentFeature = state.getCurrentFeature().get();

        if (!(currentFeature instanceof EnumWizardFeature)) {
            throw new UnsupportedOperationException();
        }

        final Design design = new Design();

        design.currentFeatureLayout
                .addComponent(new EnumWizardFeatureLayout(_getEventBus(), (EnumWizardFeature) currentFeature, state));

        design.currentFeatureNameLabel.setCaptionAsHtml(true);
        design.currentFeatureNameLabel.setCaption("<h1>Selecting: " + currentFeature.getName() + "</h1>");

        design.bottomNavigationLayout
                .addComponent(new WizardFeatureNavigationLayout(currentFeature, _getEventBus(), state));

        design.featureSetLayout
                .addComponent(new WizardFeatureSetLayout(state.getCurrentFeature(), _getEventBus(), state));

        design.selectedObjectCountButton.setCaption(selectedObjectCount + " objects");
        design.selectedObjectCountButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus().post(GetObjectSummariesRequest.builder()
                        .setQuery(state.getFeatureSet().getSelectedAsQuery()).build());
            }
        });

        design.topNavigationLayout
                .addComponent(new WizardFeatureNavigationLayout(currentFeature, _getEventBus(), state));

        setCompositionRoot(design);
    }

    public final static String NAME = "query_wizard_feature";
}
