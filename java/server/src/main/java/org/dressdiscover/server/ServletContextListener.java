package org.dressdiscover.server;

import javax.servlet.ServletContextEvent;

import org.dressdiscover.lib.Site;
import org.dressdiscover.lib.properties.LibPropertiesModule;
import org.dressdiscover.lib.services.ServicesModule;
import org.dressdiscover.server.controllers.ServerControllersModule;
import org.dressdiscover.server.properties.ServerProperties;
import org.thryft.waf.server.AbstractServletContextListener;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public final class ServletContextListener extends AbstractServletContextListener {
    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        libPropertiesModule = new LibPropertiesModule();
        serverProperties = ServerProperties.load();

        _configureLogging("dressdiscover");

        super.contextInitialized(servletContextEvent);

        injector.getInstance(Site.class).init();
    }

    @Override
    protected Injector getInjector() {
        if (injector == null) {
            injector = Guice.createInjector(
                    // Order is important
                    libPropertiesModule, new AbstractModule() {
                        @Override
                        protected void configure() {
                            bind(ServerProperties.class).toInstance(serverProperties);
                        }
                    }, new ServerControllersModule(), new ServicesModule(libPropertiesModule.getStoreProperties()));
        }
        return injector;
    }

    private Injector injector;
    private LibPropertiesModule libPropertiesModule;
    private ServerProperties serverProperties;
}
