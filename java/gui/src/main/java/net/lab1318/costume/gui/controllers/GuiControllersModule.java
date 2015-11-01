package net.lab1318.costume.gui.controllers;

import com.google.inject.servlet.ServletModule;

public final class GuiControllersModule extends ServletModule {
    @Override
    protected void configureServlets() {
        serve("/VAADIN/*").with(GuiServlet.class);
        serve("/*").with(GuiServlet.class);
    }
}
