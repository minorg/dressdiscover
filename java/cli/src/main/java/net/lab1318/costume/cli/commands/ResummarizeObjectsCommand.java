package net.lab1318.costume.cli.commands;

import org.thryft.waf.cli.Command;

import com.google.inject.Injector;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.ObjectCommandService;

public final class ResummarizeObjectsCommand extends Command {
    @Override
    public Args getArgs() {
        return args;
    }

    @Override
    public void run(final Injector injector) {
        try {
            injector.getInstance(ObjectCommandService.class).resummarizeObjects();
        } catch (final IoException e) {
            logger.error(logMarker, "I/O exception: ", e);
        }
    }

    private final Args args = new Args();
}
