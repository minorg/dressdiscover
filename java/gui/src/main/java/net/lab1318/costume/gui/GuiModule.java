package net.lab1318.costume.gui;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.gui.EventBusModule;

import com.google.inject.AbstractModule;

import net.lab1318.costume.gui.controllers.GuiControllersModule;
import net.lab1318.costume.lib.CostumeProperties;

public final class GuiModule extends AbstractModule {
    public GuiModule(final CostumeProperties properties) {
        this.properties = checkNotNull(properties);
    }

    @Override
    protected void configure() {
        install(new EventBusModule());
        install(new GuiControllersModule(properties));
    }

    private final CostumeProperties properties;
}
