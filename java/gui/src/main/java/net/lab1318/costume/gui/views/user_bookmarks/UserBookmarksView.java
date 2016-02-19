package net.lab1318.costume.gui.views.user_bookmarks;

import org.thryft.waf.gui.EventBus;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.user.UserBookmarkEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.gui.components.ObjectSummaryEntriesTable;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class UserBookmarksView extends TopLevelView {
    @DesignRoot("UserBookmarksView.html")
    private final static class Design extends VerticalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Layout bookmarksLayout;
    }

    @Inject
    public UserBookmarksView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final ImmutableMap<ObjectId, UserBookmarkEntry> bookmarks,
            final ImmutableMap<CollectionId, Collection> collections, final UserId currentUserId,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectQuery objectQuery,
            final LazyQueryContainer objectSummaries) {
        final Design design = new Design();
        design.bookmarksLayout.addComponent(new ObjectSummaryEntriesTable(bookmarks, collections,
                Optional.of(currentUserId), _getEventBus(), institutions, objectSummaries));
        setCompositionRoot(design);
    }

    public final static String NAME = "bookmarks";
}
