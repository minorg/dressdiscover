package net.lab1318.costume.gui.views;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
class Navbar extends HorizontalLayout {
    public Navbar() {
        final Button institutionsButton = new Button();
        institutionsButton.setIcon(FontAwesome.HOME);
        institutionsButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo("institutions");
            }
        });
        addComponent(institutionsButton);
        setComponentAlignment(institutionsButton, Alignment.MIDDLE_LEFT);

        setSizeFull();
    }
}
