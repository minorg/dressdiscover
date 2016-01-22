package net.lab1318.costume.gui;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.thryft.protocol.JacksonJsonOutputProtocol;
import org.thryft.protocol.OutputProtocolException;

import com.google.common.base.Charsets;
import com.google.inject.Injector;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServletRequest;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.gui.controllers.GuiServlet;
import net.lab1318.costume.gui.converters.CustomConverterFactory;
import net.lab1318.costume.gui.presenters.institutions.InstitutionsPresenter;
import net.lab1318.costume.gui.presenters.object_by_id.ObjectByIdPresenter;
import net.lab1318.costume.gui.presenters.objects.ObjectsPresenter;
import net.lab1318.costume.gui.presenters.wizard.WizardFeaturePresenter;
import net.lab1318.costume.gui.views.institutions.InstitutionsView;
import net.lab1318.costume.gui.views.object_by_id.ObjectByIdView;
import net.lab1318.costume.gui.views.objects.ObjectsView;
import net.lab1318.costume.gui.views.wizard.WizardFeatureView;

@SuppressWarnings("serial")
@Theme("costume")
@Title("Costume Explorer")
@Widgetset("net.lab1318.costume.gui.GuiWidgetSet")
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

        {
            injector.getInstance(WizardFeaturePresenter.class);
            navigator.addView(WizardFeatureView.NAME, injector.getInstance(WizardFeatureView.class));
        }

        VaadinSession.getCurrent().setConverterFactory(CustomConverterFactory.getInstance());
    }
}
