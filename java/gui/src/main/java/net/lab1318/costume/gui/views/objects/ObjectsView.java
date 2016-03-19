package net.lab1318.costume.gui.views.objects;

import org.thryft.waf.gui.EventBus;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectFacets;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.user.UserBookmarkEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.gui.components.ObjectSummaryEntriesTable;
import net.lab1318.costume.gui.views.TopLevelView;

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
            hitCountsLabel.setWidth(100, Unit.PERCENTAGE);
            design.rightPaneLayout.addComponent(hitCountsLabel);
            design.rightPaneLayout.setComponentAlignment(hitCountsLabel, Alignment.MIDDLE_CENTER);

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
