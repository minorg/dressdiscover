package net.lab1318.costume.gui.views;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.vaadin.event.FieldEvents.BlurEvent;
import com.vaadin.event.FieldEvents.BlurListener;
import com.vaadin.event.FieldEvents.FocusEvent;
import com.vaadin.event.FieldEvents.FocusListener;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService.Messages.GetObjectSummariesRequest;
import net.lab1318.costume.api.services.user.UserQueryService.Messages.GetUserBookmarksByUserIdRequest;
import net.lab1318.costume.gui.events.user.UserLogoutRequest;

@SuppressWarnings("serial")
public final class Navbar extends HorizontalLayout {
    public Navbar(final EventBus eventBus) {
        this.eventBus = checkNotNull(eventBus);

        setSizeFull();

        {
            final MenuBar leftMenuBar = new MenuBar();
            final MenuItem homeMenuItem = leftMenuBar.addItem("", FontAwesome.HOME, new MenuBar.Command() {
                @Override
                public void menuSelected(final MenuItem selectedItem) {
                    UI.getCurrent().getNavigator().navigateTo("");
                }
            });
            homeMenuItem.setStyleName("home");
            addComponent(leftMenuBar);
            setComponentAlignment(leftMenuBar, Alignment.TOP_LEFT);
        }

        {
            final HorizontalLayout searchLayout = new HorizontalLayout();

            final Button searchButton = new NativeButton();
            searchButton.addClickListener(new ClickListener() {
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
            searchButton.setIcon(FontAwesome.SEARCH);
            searchButton.setSizeFull();
            searchButton.setStyleName("search");

            searchTextField.setWidth((float) 32.0, Unit.EM);
            searchTextField.addBlurListener(new BlurListener() {
                @Override
                public void blur(final BlurEvent event) {
                    searchButton.removeClickShortcut();
                }
            });
            searchTextField.addFocusListener(new FocusListener() {
                @Override
                public void focus(final FocusEvent event) {
                    searchButton.setClickShortcut(KeyCode.ENTER);
                }
            });
            searchTextField.setInputPrompt("Search all objects");

            searchLayout.addComponent(searchTextField);
            searchLayout.addComponent(searchButton);

            addComponent(searchLayout);
            setComponentAlignment(searchLayout, Alignment.MIDDLE_CENTER);
        }

        {
            final MenuBar rightMenuBar = new MenuBar();
            bookmarksMenuItem = rightMenuBar.addItem("Bookmarks", new Command() {
                @Override
                public void menuSelected(final MenuItem selectedItem) {
                    eventBus.post(new GetUserBookmarksByUserIdRequest(currentUser.get().getId()));
                }
            });
            bookmarksMenuItem.setVisible(false);
            currentUserMenuItem = rightMenuBar.addItem("Guest user", null);
            addComponent(rightMenuBar);
            setComponentAlignment(rightMenuBar, Alignment.MIDDLE_RIGHT);
        }
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
    private final TextField searchTextField = new TextField();
}
