package org.dressdiscover.gui;

import org.dressdiscover.gui.controllers.GuiServlet;
import org.dressdiscover.gui.converters.CustomConverterFactory;
import org.dressdiscover.gui.presenters.home.HomePresenter;
import org.dressdiscover.gui.presenters.institutions.InstitutionsPresenter;
import org.dressdiscover.gui.presenters.object_by_id.ObjectByIdPresenter;
import org.dressdiscover.gui.presenters.objects.ObjectsPresenter;
import org.dressdiscover.gui.presenters.user_bookmarks.UserBookmarksPresenter;
import org.dressdiscover.gui.presenters.wizard.catalog_wizard.CatalogWizardFeaturePresenter;
import org.dressdiscover.gui.presenters.wizard.catalog_wizard.CatalogWizardStartPresenter;
import org.dressdiscover.gui.presenters.wizard.catalog_wizard.CatalogWizardSummaryPresenter;
import org.dressdiscover.gui.presenters.wizard.query_wizard.QueryWizardFeaturePresenter;
import org.dressdiscover.gui.presenters.wizard.query_wizard.QueryWizardStartPresenter;
import org.dressdiscover.gui.presenters.wizard.query_wizard.QueryWizardSummaryPresenter;
import org.dressdiscover.gui.views.home.HomeView;
import org.dressdiscover.gui.views.institutions.InstitutionsView;
import org.dressdiscover.gui.views.object_by_id.ObjectByIdView;
import org.dressdiscover.gui.views.objects.ObjectsView;
import org.dressdiscover.gui.views.user_bookmarks.UserBookmarksView;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardFeatureView;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardStartView;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardSummaryView;
import org.dressdiscover.gui.views.wizard.query_wizard.QueryWizardFeatureView;
import org.dressdiscover.gui.views.wizard.query_wizard.QueryWizardStartView;
import org.dressdiscover.gui.views.wizard.query_wizard.QueryWizardSummaryView;

import com.google.inject.Injector;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServletRequest;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("costume")
@Title("DressDiscover")
@Widgetset("org.dressdiscover.gui.GuiWidgetSet")
public final class GuiUI extends UI {
    @Override
    protected void init(final VaadinRequest vaadinRequest) {
        final GuiServlet servlet = ((GuiServlet) ((VaadinServletRequest) vaadinRequest).getService().getServlet());
        final Injector injector = servlet.getInjector();

        // Create a navigator to control the views
        final Navigator navigator = new Navigator(this, this);

        {
            injector.getInstance(CatalogWizardFeaturePresenter.class);
            navigator.addView(CatalogWizardFeatureView.NAME, injector.getInstance(CatalogWizardFeatureView.class));
        }

        {
            injector.getInstance(CatalogWizardSummaryPresenter.class);
            navigator.addView(CatalogWizardSummaryView.NAME, injector.getInstance(CatalogWizardSummaryView.class));
        }

        {
            injector.getInstance(CatalogWizardStartPresenter.class);
            navigator.addView(CatalogWizardStartView.NAME, injector.getInstance(CatalogWizardStartView.class));
        }

        {
            injector.getInstance(HomePresenter.class);
            navigator.addView("", injector.getInstance(HomeView.class));
        }

        {
            injector.getInstance(InstitutionsPresenter.class);
            navigator.addView(InstitutionsView.NAME, injector.getInstance(InstitutionsView.class));
        }

        {
            injector.getInstance(ObjectByIdPresenter.class);
            navigator.addView(ObjectByIdView.NAME, injector.getInstance(ObjectByIdView.class));
        }

        {
            injector.getInstance(ObjectsPresenter.class);
            navigator.addView(ObjectsView.NAME, injector.getInstance(ObjectsView.class));
        }

        {
            injector.getInstance(UserBookmarksPresenter.class);
            navigator.addView(UserBookmarksView.NAME, injector.getInstance(UserBookmarksView.class));
        }

        {
            injector.getInstance(QueryWizardFeaturePresenter.class);
            navigator.addView(QueryWizardFeatureView.NAME, injector.getInstance(QueryWizardFeatureView.class));
        }

        {
            injector.getInstance(QueryWizardSummaryPresenter.class);
            navigator.addView(QueryWizardSummaryView.NAME, injector.getInstance(QueryWizardSummaryView.class));
        }

        {
            injector.getInstance(QueryWizardStartPresenter.class);
            navigator.addView(QueryWizardStartView.NAME, injector.getInstance(QueryWizardStartView.class));
        }

        VaadinSession.getCurrent().setConverterFactory(CustomConverterFactory.getInstance());
    }
}
