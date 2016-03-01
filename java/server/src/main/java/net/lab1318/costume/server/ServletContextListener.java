package net.lab1318.costume.server;

import static com.google.common.base.Preconditions.checkState;

import javax.servlet.ServletContextEvent;

import org.thryft.waf.lib.PropertiesModule;
import org.thryft.waf.server.AbstractServletContextListener;

import com.google.inject.Guice;
import com.google.inject.Injector;

import net.lab1318.costume.gui.GuiModule;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.services.ServicesModule;
import net.lab1318.costume.server.controllers.ServerControllersModule;

public final class ServletContextListener extends AbstractServletContextListener {
    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        properties = CostumeProperties.load();
        checkState(!properties.getEnvironment().equals("dev"), "running in dev environment?");

        _configureLogging("costume");
        _createVaadinScssCache("costume", servletContextEvent);

        super.contextInitialized(servletContextEvent);
    }

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(
                // Order is important
                new PropertiesModule<CostumeProperties>(properties), new ServerControllersModule(),
                new ServicesModule(), new GuiModule(properties));
    }

    private CostumeProperties properties;
}
