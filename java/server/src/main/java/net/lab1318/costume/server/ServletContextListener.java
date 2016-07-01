package net.lab1318.costume.server;

import static com.google.common.base.Preconditions.checkState;

import javax.servlet.ServletContextEvent;

import org.dressdiscover.gui.GuiModule;
import org.dressdiscover.lib.CostumeProperties;
import org.dressdiscover.lib.python.PythonInterpreterFactory;
import org.dressdiscover.lib.services.ServicesModule;
import org.python.util.PythonInterpreter;
import org.thryft.waf.lib.PropertiesModule;
import org.thryft.waf.server.AbstractServletContextListener;

import com.google.inject.Guice;
import com.google.inject.Injector;

import net.lab1318.costume.server.controllers.ServerControllersModule;

public final class ServletContextListener extends AbstractServletContextListener {
    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        properties = CostumeProperties.load();
        checkState(!properties.getEnvironment().equals("dev"), "running in dev environment?");

        _configureLogging("costume");
        _createVaadinScssCache("costume", servletContextEvent);

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
                    new PropertiesModule<CostumeProperties>(properties), new ServerControllersModule(),
                    new ServicesModule(properties), new GuiModule(properties));
        }
        return injector;
    }

    private Injector injector;
    private CostumeProperties properties;
}
