package net.lab1318.costume.gui.views.user_bookmarks;

import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;

import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class UserBookmarksView extends TopLevelView {
    @Inject
    public UserBookmarksView(final EventBus eventBus) {
        super(eventBus);
    }

    public final static String NAME = "bookmarks";
}
