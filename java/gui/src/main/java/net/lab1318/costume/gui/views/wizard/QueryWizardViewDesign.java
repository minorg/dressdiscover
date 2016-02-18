package net.lab1318.costume.gui.views.wizard;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@SuppressWarnings("serial")
@DesignRoot
final class QueryWizardViewDesign extends VerticalLayout {
    public QueryWizardViewDesign() {
        Design.read(this);
    }

    Button startButton = null;
}
