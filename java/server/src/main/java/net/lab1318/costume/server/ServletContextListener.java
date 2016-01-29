package net.lab1318.costume.server;

import static com.google.common.base.Preconditions.checkState;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletContextEvent;

import org.thryft.waf.lib.LoggingConfigurator;
import org.thryft.waf.lib.PropertiesModule;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

import net.lab1318.costume.gui.GuiModule;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.services.ServicesModule;
import net.lab1318.costume.server.controllers.ServerControllersModule;

public final class ServletContextListener extends GuiceServletContextListener {
    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        properties = CostumeProperties.load();
        checkState(!properties.getEnvironment().equals("dev"), "running in dev environment?");

        LoggingConfigurator.configureSlf4j();
        LoggingConfigurator.configureLogback(new File("/etc/costume/middleware-logback.xml"));

        final String root = servletContextEvent.getServletContext().getRealPath("/");
        if (root != null && Files.isDirectory(Paths.get(root))) {
            // workaround for https://dev.vaadin.com/ticket/18463
            try {
                Files.createDirectories(
                        Paths.get(servletContextEvent.getServletContext().getRealPath("/VAADIN/themes/costume")));
            } catch (final IOException e) {
            }
        }

        super.contextInitialized(servletContextEvent);
    }

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(
                // Order is important
                new PropertiesModule<CostumeProperties>(properties), new ServerControllersModule(),
                new ServicesModule(), new GuiModule());
    }

    private CostumeProperties properties;
}
