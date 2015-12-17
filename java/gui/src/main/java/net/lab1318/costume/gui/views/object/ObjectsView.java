package net.lab1318.costume.gui.views.object;

import org.thryft.waf.gui.EventBus;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class ObjectsView extends TopLevelView {
    @Inject
    public ObjectsView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final ObjectFacets availableObjectFacets,
            final ImmutableMap<CollectionId, Collection> collections,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectQuery objectQuery,
            final LazyQueryContainer objectSummaries, final ObjectFacets resultObjectFacets) {
        if (objectQuery.getQueryString().isPresent()) {
            _getNavbar().getSearchTextField().setValue(objectQuery.getQueryString().get());
        }

        final int objectSummariesSize = objectSummaries.size();

        final HorizontalLayout twoPaneLayout = new HorizontalLayout();
        twoPaneLayout.setSizeFull();
        // twoPaneLayout.setHeight(700, Unit.PIXELS);

        {
            final Component leftPaneContentLayout = new ObjectFacetsLayout(availableObjectFacets, _getEventBus(),
                    institutions, objectQuery, resultObjectFacets);

            final Panel leftPanePanel = new Panel();
            leftPanePanel.addStyleName("borderless");
            leftPanePanel.setContent(leftPaneContentLayout);

            twoPaneLayout.addComponent(leftPanePanel);
            twoPaneLayout.setComponentAlignment(leftPanePanel, Alignment.TOP_LEFT);
            twoPaneLayout.setExpandRatio(leftPanePanel, 1);
        }

        {
            final VerticalLayout rightPaneContentLayout = new VerticalLayout();

            if (objectSummariesSize > 0) {
                final Label hitCountsLabel = new Label(
                        String.format("%d object(s) in %d collection(s)", objectSummariesSize, collections.size()));
                hitCountsLabel.setWidth(100, Unit.PERCENTAGE);
                rightPaneContentLayout.addComponent(hitCountsLabel);
                rightPaneContentLayout.setComponentAlignment(hitCountsLabel, Alignment.MIDDLE_CENTER);

                rightPaneContentLayout.addComponent(
                        new ObjectSummaryEntriesTable(collections, _getEventBus(), institutions, availableObjectFacets, objectSummaries));
            } else {
                rightPaneContentLayout.addComponent(new Label("No objects match your criteria."));
            }

            final Panel rightPanePanel = new Panel();
            rightPanePanel.addStyleName("borderless");
            rightPanePanel.setContent(rightPaneContentLayout);

            twoPaneLayout.addComponent(rightPanePanel);
            twoPaneLayout.setComponentAlignment(rightPanePanel, Alignment.TOP_CENTER);
            twoPaneLayout.setExpandRatio(rightPanePanel, 3);
        }

        setCompositionRoot(twoPaneLayout);
    }

    public final static String NAME = "objects";
}
