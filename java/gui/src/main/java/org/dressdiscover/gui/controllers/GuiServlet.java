package org.dressdiscover.gui.controllers;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.gui.GuiUI;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@Singleton
@SuppressWarnings("serial")
@VaadinServletConfiguration(ui = GuiUI.class, productionMode = false)
public class GuiServlet extends VaadinServlet {
    @Inject
    public GuiServlet(final Injector injector) {
        this.injector = checkNotNull(injector);
    }

    public final Injector getInjector() {
        return injector;
    }

    private final Injector injector;
}