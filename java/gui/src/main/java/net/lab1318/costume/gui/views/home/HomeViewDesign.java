package net.lab1318.costume.gui.views.home;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.declarative.Design;

@SuppressWarnings("serial")
@DesignRoot
final class HomeViewDesign extends HorizontalLayout {
    public HomeViewDesign() {
        Design.read(this);
    }

    Button institutionsButton = null;
    Button queryWizardButton = null;
}
