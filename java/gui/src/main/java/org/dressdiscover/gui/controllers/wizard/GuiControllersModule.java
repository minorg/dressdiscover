package org.dressdiscover.gui.controllers.wizard;

import org.dressdiscover.gui.controllers.CatalogWizardExportController;
import org.dressdiscover.gui.controllers.GuiServlet;
import org.dressdiscover.lib.CostumeProperties;

import com.google.common.collect.ImmutableMap;
import com.google.inject.servlet.ServletModule;

public final class GuiControllersModule extends ServletModule {
    public GuiControllersModule(final CostumeProperties properties) {
        this.productionMode = properties.getEnvironment().equals("production");
    }

    @Override
    protected void configureServlets() {
        final ImmutableMap<String, String> initParams = ImmutableMap.of("productionMode",
                productionMode ? "true" : "false", "widgetset", "net.lab1318.costume.gui.widgetset.GuiWidgetSet");
        serve("/catalog_wizard_export/*").with(CatalogWizardExportController.class);
        serve("/*").with(GuiServlet.class, initParams);
    }

    private final boolean productionMode;
}
