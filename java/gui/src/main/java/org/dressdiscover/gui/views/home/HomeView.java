package org.dressdiscover.gui.views.home;

import org.dressdiscover.gui.views.TopLevelView;
import org.dressdiscover.gui.views.institutions.InstitutionsView;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardStartView;
import org.dressdiscover.gui.views.wizard.query_wizard.QueryWizardStartView;
import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@SessionScoped
public class HomeView extends TopLevelView {
    @DesignRoot("HomeView.html")
    private final static class Design extends HorizontalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Button browseObjectsByInstitutionButton;
        Button collectionDirectoryButton;
        Button catalogWizardButton;
        Button queryWizardButton;
    }

    @Inject
    public HomeView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels() {
        final Design design = new Design();

        design.browseObjectsByInstitutionButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(InstitutionsView.NAME);
            }
        });

        design.collectionDirectoryButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(InstitutionsView.NAME + "/include_external");
            }
        });

        design.catalogWizardButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(CatalogWizardStartView.NAME);
            }
        });

        design.queryWizardButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                UI.getCurrent().getNavigator().navigateTo(QueryWizardStartView.NAME);
            }
        });

        setCompositionRoot(design);
    }

    public final static String NAME = "";
}