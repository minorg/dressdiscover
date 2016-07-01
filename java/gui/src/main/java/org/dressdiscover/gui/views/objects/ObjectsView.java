package org.dressdiscover.gui.views.objects;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.models.user.UserId;
import org.dressdiscover.gui.components.ObjectSummaryEntriesTable;
import org.dressdiscover.gui.views.TopLevelView;
import org.thryft.waf.gui.EventBus;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.object.ObjectFacets;
import org.dressdiscover.api.models.object.ObjectQuery;
import org.dressdiscover.api.models.user.UserBookmarkEntry;

@SuppressWarnings("serial")
@SessionScoped
public class ObjectsView extends TopLevelView {
    @DesignRoot("ObjectsView.html")
    private final static class Design extends HorizontalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        VerticalLayout leftPaneLayout;
        VerticalLayout rightPaneLayout;
    }

    @Inject
    public ObjectsView(final EventBus eventBus) {
        super(eventBus);

        objectFacetsLayout = new ObjectFacetsLayout(_getEventBus());
        design.leftPaneLayout.addComponent(objectFacetsLayout);
        setCompositionRoot(design);
    }

    public void setBookmarks(final ImmutableMap<ObjectId, UserBookmarkEntry> bookmarks) {
        objectSummaryEntriesTable.setBookmarks(bookmarks);
    }

    public void setModels(final ObjectFacets availableObjectFacets,
            final ImmutableMap<ObjectId, UserBookmarkEntry> bookmarks,
            final ImmutableMap<CollectionId, Collection> collections, final Optional<UserId> currentUserId,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectQuery objectQuery,
            final LazyQueryContainer objectSummaries, final ObjectFacets resultObjectFacets) {
        if (objectQuery.getQueryString().isPresent()) {
            _getNavbar().getSearchTextField().setValue(objectQuery.getQueryString().get());
        }

        final int objectSummariesSize = objectSummaries.size();

        objectFacetsLayout.setModels(availableObjectFacets, institutions, objectQuery, resultObjectFacets);

        design.rightPaneLayout.removeAllComponents();
        if (objectSummariesSize > 0) {
            final Label hitCountsLabel = new Label(
                    String.format("%d object(s) in %d collection(s)", objectSummariesSize, collections.size()));
            hitCountsLabel.setStyleName("hit-counts-label");
            design.rightPaneLayout.addComponent(hitCountsLabel);

            objectSummaryEntriesTable = new ObjectSummaryEntriesTable(bookmarks, collections, currentUserId,
                    _getEventBus(), institutions, objectSummaries);
            design.rightPaneLayout.addComponent(objectSummaryEntriesTable);
        } else {
            design.rightPaneLayout.addComponent(new Label("No objects match your criteria."));
        }
    }

    private final Design design = new Design();
    private final ObjectFacetsLayout objectFacetsLayout;
    private ObjectSummaryEntriesTable objectSummaryEntriesTable;
    public final static String NAME = "objects";
}
