package net.lab1318.costume.gui.views.home;

import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.UI;

import net.lab1318.costume.gui.views.TopLevelView;
import net.lab1318.costume.gui.views.institutions.InstitutionsView;
import net.lab1318.costume.gui.views.wizard.WizardFeatureView;

@SuppressWarnings("serial")
@SessionScoped
public class HomeView extends TopLevelView {
    @Inject
    public HomeView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels() {
        final HomeViewDesign design = new HomeViewDesign();
        design.institutionsButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(InstitutionsView.NAME);
            }
        });
        design.queryWizardButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(WizardFeatureView.NAME);
            }
        });
        setCompositionRoot(design);
    }

    public final static String NAME = "";
}
