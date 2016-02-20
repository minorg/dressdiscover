package net.lab1318.costume.gui.views.wizard;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService.Messages.GetObjectSummariesRequest;
import net.lab1318.costume.gui.models.wizard.FeatureSet;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class QueryWizardSummaryView extends TopLevelView {
    @DesignRoot("QueryWizardSummaryView.html")
    private final static class Design extends VerticalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Layout currentlySelectedFeaturesLayout;
        Button searchButton;
    }

    @Inject
    public QueryWizardSummaryView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final FeatureSet featureSet, final ObjectQuery query,
            final UnsignedInteger selectedObjectCount) {
        final Design design = new Design();

        design.currentlySelectedFeaturesLayout.addComponent(
                new QueryWizardFeatureSetLayout(Optional.absent(), _getEventBus(), featureSet, selectedObjectCount));

        design.searchButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus().post(GetObjectSummariesRequest.builder().setQuery(query).build());
            }
        });

        setCompositionRoot(design);
    }

    public final static String NAME = "query_wizard_summary";
}
