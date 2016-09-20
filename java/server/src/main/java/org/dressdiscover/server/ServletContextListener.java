package org.dressdiscover.server;

import static com.google.common.base.Preconditions.checkState;

import javax.servlet.ServletContextEvent;

import org.dressdiscover.lib.DressDiscoverProperties;
import org.dressdiscover.lib.python.PythonInterpreterFactory;
import org.dressdiscover.lib.services.ServicesModule;
import org.dressdiscover.server.controllers.ServerControllersModule;
import org.python.util.PythonInterpreter;
import org.thryft.waf.server.AbstractServletContextListener;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public final class ServletContextListener extends AbstractServletContextListener {
    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        properties = DressDiscoverProperties.load();
        checkState(!properties.getEnvironment().equals("dev"), "running in dev environment?");

        _configureLogging("dressdiscover");
        _createVaadinScssCache("dressdiscover", servletContextEvent);

        super.contextInitialized(servletContextEvent);

        final PythonInterpreter pythonInterpreter = injector.getInstance(PythonInterpreterFactory.class)
                .createPythonInterpreter();
        pythonInterpreter.exec("import ddsite");
    }

    @Override
    protected Injector getInjector() {
        if (injector == null) {
            injector = Guice.createInjector(
                    // Order is important
                    new AbstractModule() {
                        @Override
                        protected void configure() {
                            bind(DressDiscoverProperties.class).toInstance(properties);
                        }
                    }, new ServerControllersModule(properties), new ServicesModule(properties));// ,
                                                                                                // new
                                                                                                // GuiModule(properties));
        }
        return injector;
    }

    private Injector injector;
    private DressDiscoverProperties properties;
}
