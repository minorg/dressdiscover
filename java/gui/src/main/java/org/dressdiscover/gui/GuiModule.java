package org.dressdiscover.gui;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.gui.controllers.wizard.GuiControllersModule;
import org.dressdiscover.lib.DressDiscoverProperties;
import org.thryft.waf.gui.EventBusModule;

import com.google.inject.AbstractModule;

public final class GuiModule extends AbstractModule {
    public GuiModule(final DressDiscoverProperties properties) {
        this.properties = checkNotNull(properties);
    }

    @Override
    protected void configure() {
        install(new EventBusModule());
        install(new GuiControllersModule(properties));
    }

    private final DressDiscoverProperties properties;
}
