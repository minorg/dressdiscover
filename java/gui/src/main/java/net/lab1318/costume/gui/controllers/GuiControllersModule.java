package net.lab1318.costume.gui.controllers;

import com.google.common.collect.ImmutableMap;
import com.google.inject.servlet.ServletModule;

import net.lab1318.costume.lib.CostumeProperties;

public final class GuiControllersModule extends ServletModule {
    public GuiControllersModule(final CostumeProperties properties) {
        this.productionMode = properties.getEnvironment().equals("production");
    }

    @Override
    protected void configureServlets() {
        final ImmutableMap<String, String> initParams = ImmutableMap.of("productionMode",
                productionMode ? "true" : "false", "widgetset", "net.lab1318.costume.gui.widgetset.GuiWidgetSet");
        serve("/*").with(GuiServlet.class, initParams);
    }

    private final boolean productionMode;
}
