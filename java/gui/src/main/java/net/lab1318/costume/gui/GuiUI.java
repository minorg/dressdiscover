package net.lab1318.costume.gui;

import com.google.inject.Injector;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServletRequest;
import com.vaadin.ui.UI;

import net.lab1318.costume.gui.controllers.GuiServlet;
import net.lab1318.costume.gui.presenters.collection.CollectionByIdPresenter;
import net.lab1318.costume.gui.presenters.institution.InstitutionByIdPresenter;
import net.lab1318.costume.gui.presenters.institution.InstitutionsPresenter;
import net.lab1318.costume.gui.presenters.object.ObjectByIdPresenter;
import net.lab1318.costume.gui.views.collection.CollectionByIdView;
import net.lab1318.costume.gui.views.institution.InstitutionByIdView;
import net.lab1318.costume.gui.views.institution.InstitutionsView;
import net.lab1318.costume.gui.views.object.ObjectByIdView;

@SuppressWarnings("serial")
@Theme("costume")
public final class GuiUI extends UI {
    @Override
    protected void init(final VaadinRequest vaadinRequest) {
        final GuiServlet servlet = ((GuiServlet) ((VaadinServletRequest) vaadinRequest).getService().getServlet());
        final Injector injector = servlet.getInjector();

        // Create a navigator to control the views
        final Navigator navigator = new Navigator(this, this);

        {
            injector.getInstance(CollectionByIdPresenter.class);
            navigator.addView(CollectionByIdView.NAME, injector.getInstance(CollectionByIdView.class));
        }

        {
            injector.getInstance(InstitutionByIdPresenter.class);
            navigator.addView(InstitutionByIdView.NAME, injector.getInstance(InstitutionByIdView.class));
        }

        {
            injector.getInstance(InstitutionsPresenter.class);
            navigator.addView("", injector.getInstance(InstitutionsView.class));
            navigator.addView(InstitutionsView.NAME, injector.getInstance(InstitutionsView.class));
        }

        {
            injector.getInstance(ObjectByIdPresenter.class);
            navigator.addView(ObjectByIdView.NAME, injector.getInstance(ObjectByIdView.class));
        }
    }
}
