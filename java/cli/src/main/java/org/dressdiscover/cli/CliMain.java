package org.dressdiscover.cli;

import org.dressdiscover.cli.commands.PutElasticSearchTemplatesCommand;
import org.dressdiscover.cli.commands.ResummarizeObjectsCommand;
import org.dressdiscover.lib.DressDiscoverProperties;
import org.dressdiscover.lib.python.PythonInterpreterFactory;
import org.dressdiscover.lib.services.ServicesModule;
import org.python.util.PythonInterpreter;
import org.slf4j.Marker;
import org.thryft.waf.cli.Command;
import org.thryft.waf.cli.CommandParser;
import org.thryft.waf.lib.logging.LoggingUtils;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public final class CliMain extends org.thryft.waf.cli.CliMain {
    public static void main(final String[] argv) throws Exception {
        new CliMain().__main(argv);
    }

    private CliMain() {
        super(LOG_MARKER);
    }

    private void __main(final String[] argv) throws Exception {
        final Args args = new Args();
        final CommandParser argParser = new CommandParser(args, commands);

        argParser.parse(argv);

        _configureLogging(args, "dressdiscover");

        final DressDiscoverProperties properties = DressDiscoverProperties.load();
        _getLogger().debug(_getLogMarker(), "properties: {}", properties);

        final Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(DressDiscoverProperties.class).toInstance(properties);
            }
        }, new ServicesModule(properties));

        final PythonInterpreter pythonInterpreter = injector.getInstance(PythonInterpreterFactory.class)
                .createPythonInterpreter();
        pythonInterpreter.exec("import ddsite");

        argParser.getCommand().run(injector);
    }

    private final Command<?>[] commands = { new PutElasticSearchTemplatesCommand(), new ResummarizeObjectsCommand() };
    private final static Marker LOG_MARKER = LoggingUtils.getMarker(CliMain.class);
}
