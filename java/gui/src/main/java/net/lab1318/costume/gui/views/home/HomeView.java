package net.lab1318.costume.gui.views.home;

import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

import net.lab1318.costume.gui.views.TopLevelView;
import net.lab1318.costume.gui.views.institutions.InstitutionsView;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardView;
import net.lab1318.costume.gui.views.wizard.query_wizard.QueryWizardView;

@SuppressWarnings("serial")
@SessionScoped
public class HomeView extends TopLevelView {
    @DesignRoot("HomeView.html")
    private final static class Design extends HorizontalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Button catalogWizardButton;
        Button institutionsButton;
        Button queryWizardButton;
    }

    @Inject
    public HomeView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels() {
        final Design design = new Design();
        design.catalogWizardButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(CatalogWizardView.NAME);
            }
        });
        design.institutionsButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(InstitutionsView.NAME);
            }
        });
        design.queryWizardButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(QueryWizardView.NAME);
            }
        });
        setCompositionRoot(design);
    }

    public final static String NAME = "";
}