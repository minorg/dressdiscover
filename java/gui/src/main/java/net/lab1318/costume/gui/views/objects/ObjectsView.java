package net.lab1318.costume.gui.views.objects;

import org.thryft.waf.gui.EventBus;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectFacets;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.user.UserBookmarkId;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class ObjectsView extends TopLevelView {
    @Inject
    public ObjectsView(final EventBus eventBus) {
        super(eventBus);

        final HorizontalLayout twoPaneLayout = new HorizontalLayout();
        twoPaneLayout.setSizeFull();
        // twoPaneLayout.setHeight(700, Unit.PIXELS);

        {
            leftPaneContentLayout = new ObjectFacetsLayout(_getEventBus());

            final Panel leftPanePanel = new Panel();
            leftPanePanel.addStyleName("borderless");
            leftPanePanel.setContent(leftPaneContentLayout);

            twoPaneLayout.addComponent(leftPanePanel);
            twoPaneLayout.setComponentAlignment(leftPanePanel, Alignment.TOP_LEFT);
            twoPaneLayout.setExpandRatio(leftPanePanel, 1);
        }

        {
            final Panel rightPanePanel = new Panel();
            rightPanePanel.addStyleName("borderless");
            rightPanePanel.setContent(rightPaneContentLayout);

            twoPaneLayout.addComponent(rightPanePanel);
            twoPaneLayout.setComponentAlignment(rightPanePanel, Alignment.TOP_CENTER);
            twoPaneLayout.setExpandRatio(rightPanePanel, 3);
        }

        setCompositionRoot(twoPaneLayout);
    }

    public void setBookmarkedObjectIds(final ImmutableMap<ObjectId, UserBookmarkId> bookmarkedObjectIds) {
        objectSummaryEntriesTable.setBookmarkedObjectIds(bookmarkedObjectIds);
    }

    public void setModels(final ObjectFacets availableObjectFacets,
            final ImmutableMap<ObjectId, UserBookmarkId> bookmarkedObjectIds,
            final ImmutableMap<CollectionId, Collection> collections, final Optional<UserId> currentUserId,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectQuery objectQuery,
            final LazyQueryContainer objectSummaries, final ObjectFacets resultObjectFacets) {
        if (objectQuery.getQueryString().isPresent()) {
            _getNavbar().getSearchTextField().setValue(objectQuery.getQueryString().get());
        }

        final int objectSummariesSize = objectSummaries.size();

        leftPaneContentLayout.setModels(availableObjectFacets, institutions, objectQuery, resultObjectFacets);

        rightPaneContentLayout.removeAllComponents();
        if (objectSummariesSize > 0) {
            final Label hitCountsLabel = new Label(
                    String.format("%d object(s) in %d collection(s)", objectSummariesSize, collections.size()));
            hitCountsLabel.setWidth(100, Unit.PERCENTAGE);
            rightPaneContentLayout.addComponent(hitCountsLabel);
            rightPaneContentLayout.setComponentAlignment(hitCountsLabel, Alignment.MIDDLE_CENTER);

            objectSummaryEntriesTable = new ObjectSummaryEntriesTable(bookmarkedObjectIds, collections, currentUserId,
                    _getEventBus(), institutions, availableObjectFacets, objectSummaries);
            rightPaneContentLayout.addComponent(objectSummaryEntriesTable);
        } else {
            rightPaneContentLayout.addComponent(new Label("No objects match your criteria."));
        }
    }

    private final ObjectFacetsLayout leftPaneContentLayout;
    private ObjectSummaryEntriesTable objectSummaryEntriesTable;
    private final VerticalLayout rightPaneContentLayout = new VerticalLayout();
    public final static String NAME = "objects";
}
