package net.lab1318.g2f.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.notaweb.lib.PropertiesModule;
import org.notaweb.server.GuiceServletContextHandler;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import com.beust.jcommander.JCommander;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

import net.lab1318.costume.gui.GuiModule;
import net.lab1318.costume.lib.AbstractMain;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.services.ServicesModule;
import net.lab1318.g2f.server.controllers.ServerControllersModule;

public final class ServerMain extends AbstractMain {
    public static void main(final String[] argv) throws Exception {
        new ServerMain().__main(argv);
    }

    private ServerMain() {
        super(LOG_MARKER);
    }

    private void __main(final String[] argv) throws Exception {
        final Args args = new Args();
        new JCommander(args, argv);
        final CostumeProperties properties = _parseArgs(args);

        final Server server = new Server();
        {
            final ServerConnector apiServerConnector = new ServerConnector(server);
            apiServerConnector.setPort(properties.getApiUrl().getAuthority().get().getPort().get());
            server.addConnector(apiServerConnector);
        }
        new GuiceServletContextHandler(new GuiceServletContextListener() {
            @Override
            protected Injector getInjector() {
                return Guice.createInjector(
                        // Order is important
                        new PropertiesModule<CostumeProperties>(properties), new ServerControllersModule(),
                        new ServicesModule(), new GuiModule());
            }
        }, server);
        server.start();
        server.join();
    }

    private final static Marker LOG_MARKER = MarkerFactory.getMarker("SERVER_MAIN");
}
