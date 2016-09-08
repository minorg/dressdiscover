package org.dressdiscover.cli.commands;

import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.object.ObjectCommandService;
import org.thryft.waf.cli.Command;

import com.google.inject.Injector;

public final class ResummarizeObjectsCommand extends Command<Command.Args> {
    public ResummarizeObjectsCommand() {
        super(new Args());
    }

    @Override
    public void run(final Injector injector) {
        try {
            injector.getInstance(ObjectCommandService.class).resummarizeObjects();
        } catch (final IoException e) {
            logger.error(logMarker, "I/O exception: ", e);
        }
    }
}
