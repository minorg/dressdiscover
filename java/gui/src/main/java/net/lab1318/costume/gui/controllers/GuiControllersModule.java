package net.lab1318.costume.gui.controllers;

import com.google.common.collect.ImmutableMap;
import com.google.inject.servlet.ServletModule;

public final class GuiControllersModule extends ServletModule {
    @Override
    protected void configureServlets() {
        final ImmutableMap<String, String> initParams = ImmutableMap.of("widgetset",
                "net.lab1318.costume.gui.widgetset.GuiWidgetSet");
        serve("/VAADIN/*").with(GuiServlet.class, initParams);
        serve("/*").with(GuiServlet.class);
    }
}
