package net.lab1318.costume.gui.views;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

import net.lab1318.costume.gui.views.institution.InstitutionsView;

@SuppressWarnings("serial")
class Navbar extends HorizontalLayout {
    public Navbar() {
        __addLink("Institutions", InstitutionsView.NAME);
    }

    private void __addLink(final String description, final String navigationState) {
        final Button button = new Button(description);
        button.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(navigationState);
            }
        });
        addComponent(button);
    }
}
