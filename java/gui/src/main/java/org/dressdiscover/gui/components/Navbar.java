package org.dressdiscover.gui.components;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.gui.events.user.UserLogoutRequest;
import org.dressdiscover.gui.views.home.HomeView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.event.FieldEvents.BlurEvent;
import com.vaadin.event.FieldEvents.BlurListener;
import com.vaadin.event.FieldEvents.FocusEvent;
import com.vaadin.event.FieldEvents.FocusListener;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

import org.dressdiscover.api.models.object.ObjectQuery;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.services.object.ObjectSummaryQueryService.Messages.GetObjectSummariesRequest;
import org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserBookmarksByUserIdRequest;

@SuppressWarnings("serial")
public final class Navbar extends CustomComponent {
    @DesignRoot("Navbar.html")
    private final static class Design extends HorizontalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Button homeButton;
        Button searchButton;
        TextField searchTextField;
        MenuBar rightMenuBar;
    }

    public Navbar(final EventBus eventBus) {
        this.eventBus = checkNotNull(eventBus);

        final Design design = new Design();
        searchTextField = design.searchTextField;

        {
            design.homeButton.addClickListener(new ClickListener() {
                @Override
                public void buttonClick(final ClickEvent event) {
                    UI.getCurrent().getNavigator().navigateTo(HomeView.NAME);
                }
            });
            design.homeButton.setIcon(FontAwesome.HOME);
        }

        {
            design.searchButton.addClickListener(new ClickListener() {
                @Override
                public void buttonClick(final ClickEvent event) {
                    if (searchTextField.getValue().isEmpty()) {
                        eventBus.post(new GetObjectSummariesRequest());
                    } else {
                        eventBus.post(GetObjectSummariesRequest.builder().setQuery(ObjectQuery.builder()
                                .setQueryString(searchTextField.getValue()).setWorkTypeText("PhysicalObject").build())
                                .build());
                    }
                }
            });
            design.searchButton.setIcon(FontAwesome.SEARCH);

            searchTextField.addBlurListener(new BlurListener() {
                @Override
                public void blur(final BlurEvent event) {
                    design.searchButton.removeClickShortcut();
                }
            });
            searchTextField.addFocusListener(new FocusListener() {
                @Override
                public void focus(final FocusEvent event) {
                    design.searchButton.setClickShortcut(KeyCode.ENTER);
                }
            });
            searchTextField.setInputPrompt("Search all objects");
        }

        {
            bookmarksMenuItem = design.rightMenuBar.addItem("Bookmarks", new Command() {
                @Override
                public void menuSelected(final MenuItem selectedItem) {
                    eventBus.post(new GetUserBookmarksByUserIdRequest(currentUser.get().getId()));
                }
            });
            bookmarksMenuItem.setStyleName("bookmarks-menubar-menuitem");
            bookmarksMenuItem.setVisible(false);
            currentUserMenuItem = design.rightMenuBar.addItem("Guest user", null);
            currentUserMenuItem.setStyleName("current-user-menu-item");
        }

        setCompositionRoot(design);
    }

    public TextField getSearchTextField() {
        return searchTextField;
    }

    public void setCurrentUser(final Optional<UserEntry> currentUser) {
        this.currentUser = checkNotNull(currentUser);
        if (currentUser.isPresent()) {
            bookmarksMenuItem.setVisible(true);
            currentUserMenuItem.setCommand(null);
            currentUserMenuItem.setText(currentUser.get().getModel().getEmailAddress().toString());
            currentUserMenuItem.removeChildren();
            currentUserMenuItem.addItem("Logout", new Command() {
                @Override
                public void menuSelected(final MenuItem selectedItem) {
                    eventBus.post(new UserLogoutRequest());
                }
            });
        } else {
            bookmarksMenuItem.setVisible(false);
            currentUserMenuItem.setCommand(new Command() {
                @Override
                public void menuSelected(final MenuItem selectedItem) {
                    String redirectLocation = "/api/oauth2/google";
                    final String state = UI.getCurrent().getNavigator().getState();
                    if (!state.isEmpty()) {
                        redirectLocation += "?state=" + state;
                    }
                    UI.getCurrent().getPage().setLocation(redirectLocation);
                }
            });
            currentUserMenuItem.setText("Login");
        }
    }

    private MenuItem bookmarksMenuItem;
    private Optional<UserEntry> currentUser;
    private MenuItem currentUserMenuItem;
    private final EventBus eventBus;
    private final TextField searchTextField;
}
