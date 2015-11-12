package net.lab1318.costume.gui;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.thryft.protocol.JacksonJsonOutputProtocol;
import org.thryft.protocol.OutputProtocolException;

import com.google.common.base.Charsets;
import com.google.inject.Injector;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServletRequest;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.gui.controllers.GuiServlet;
import net.lab1318.costume.gui.presenters.institution.InstitutionsPresenter;
import net.lab1318.costume.gui.presenters.object.ObjectByIdPresenter;
import net.lab1318.costume.gui.presenters.object.ObjectsPresenter;
import net.lab1318.costume.gui.views.institution.InstitutionsView;
import net.lab1318.costume.gui.views.object.ObjectByIdView;
import net.lab1318.costume.gui.views.object.ObjectsView;

@SuppressWarnings("serial")
@Theme("costume")
public final class GuiUI extends UI {
    public static void navigateTo(final ObjectQuery query) {
        String queryJson;
        try {
            final StringWriter jsonStringWriter = new StringWriter();
            final JacksonJsonOutputProtocol oprot = new JacksonJsonOutputProtocol(jsonStringWriter);
            query.writeAsStruct(oprot);
            oprot.flush();
            queryJson = jsonStringWriter.toString();
        } catch (final OutputProtocolException e) {
            throw new IllegalStateException();
        }
        try {
            UI.getCurrent().getNavigator()
                    .navigateTo(ObjectsView.NAME + "/" + URLEncoder.encode(queryJson, Charsets.UTF_8.toString()));
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    protected void init(final VaadinRequest vaadinRequest) {
        final GuiServlet servlet = ((GuiServlet) ((VaadinServletRequest) vaadinRequest).getService().getServlet());
        final Injector injector = servlet.getInjector();

        // Create a navigator to control the views
        final Navigator navigator = new Navigator(this, this);

        {
            injector.getInstance(InstitutionsPresenter.class);
            navigator.addView("", injector.getInstance(InstitutionsView.class));
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
    }
}
