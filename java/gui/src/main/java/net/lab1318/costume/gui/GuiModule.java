package net.lab1318.costume.gui;

import org.notaweb.gui.EventBusModule;

import com.google.inject.AbstractModule;

import net.lab1318.costume.gui.controllers.GuiControllersModule;

public final class GuiModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new EventBusModule());
        install(new GuiControllersModule());
    }
}
