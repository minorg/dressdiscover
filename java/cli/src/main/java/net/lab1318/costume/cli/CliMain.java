
package net.lab1318.costume.cli;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.thryft.waf.cli.Command;
import org.thryft.waf.cli.CommandParser;
import org.thryft.waf.lib.PropertiesModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import net.lab1318.costume.cli.commands.PutElasticSearchTemplatesCommand;
import net.lab1318.costume.cli.commands.ResummarizeObjectsCommand;
import net.lab1318.costume.lib.AbstractMain;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.services.ServicesModule;

public final class CliMain extends AbstractMain {
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

        final CostumeProperties properties = _parseArgs(args);

        final Injector injector = Guice.createInjector(new PropertiesModule<CostumeProperties>(properties),
                new ServicesModule());

        argParser.getCommand().run(injector);
    }

    private final Command[] commands = { new PutElasticSearchTemplatesCommand(), new ResummarizeObjectsCommand() };
    private final static Marker LOG_MARKER = MarkerFactory.getMarker("CLI_MAIN");
}
