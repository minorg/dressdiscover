package net.lab1318.costume.gui.views;

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
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.gui.GuiUI;

@SuppressWarnings("serial")
public final class Navbar extends HorizontalLayout {
    public Navbar() {
        setSizeFull();

        {
            final Button homeButton = new NativeButton();
            homeButton.setIcon(FontAwesome.HOME);
            homeButton.addClickListener(new ClickListener() {
                @Override
                public void buttonClick(final ClickEvent event) {
                    UI.getCurrent().getNavigator().navigateTo("");
                }
            });
            homeButton.addStyleName("icon-button");
            addComponent(homeButton);
            setComponentAlignment(homeButton, Alignment.TOP_LEFT);
        }

        {
            final HorizontalLayout searchLayout = new HorizontalLayout();

            final Button searchButton = new NativeButton();
            searchButton.addClickListener(new ClickListener() {
                @Override
                public void buttonClick(final ClickEvent event) {
                    if (searchTextField.getValue().isEmpty()) {
                        GuiUI.navigateTo(new ObjectQuery());
                    } else {
                        GuiUI.navigateTo(ObjectQuery.builder().setQueryString(searchTextField.getValue()).build());
                    }
                }
            });
            searchButton.setIcon(FontAwesome.SEARCH);
            searchButton.addStyleName("icon-button");

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
            setComponentAlignment(searchLayout, Alignment.MIDDLE_RIGHT);
        }
    }

    public TextField getSearchTextField() {
        return searchTextField;
    }

    private final TextField searchTextField = new TextField();
}
