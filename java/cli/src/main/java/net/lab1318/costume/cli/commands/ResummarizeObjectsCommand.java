package net.lab1318.costume.cli.commands;

import java.io.IOException;

import org.thryft.waf.cli.Command;

import com.google.common.collect.ImmutableList;
import com.google.inject.Injector;

import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.lib.services.object.ObjectSummarizer;
import net.lab1318.costume.lib.stores.object.ObjectFileSystem;
import net.lab1318.costume.lib.stores.object.ObjectSummaryElasticSearchIndex;

public final class ResummarizeObjectsCommand extends Command {
    @Override
    public Args getArgs() {
        return args;
    }

    @Override
    public void run(final Injector injector) {
        final ObjectFileSystem objectFileSystem = injector.getInstance(ObjectFileSystem.class);
        final ObjectSummaryElasticSearchIndex objectSummaryElasticSearchIndex = injector
                .getInstance(ObjectSummaryElasticSearchIndex.class);

        try {
            objectSummaryElasticSearchIndex.deleteModels(logger, logMarker);

            while (true) {
                final ImmutableList.Builder<ObjectSummaryEntry> objectSummariesBuilder = ImmutableList.builder();
                for (final ObjectEntry objectEntry : objectFileSystem.getObjects(logger, logMarker)) {
                    objectSummariesBuilder.add(new ObjectSummaryEntry(objectEntry.getId(),
                            ObjectSummarizer.getInstance().summarizeObject(objectEntry.getModel())));
                }
                final ImmutableList<ObjectSummaryEntry> objectSummaries = objectSummariesBuilder.build();
                objectSummaryElasticSearchIndex.putModels(logger, logMarker, objectSummaries);
                logger.info(logMarker, "put {} object summaries", objectSummaries.size());
            }
        } catch (final IOException e) {
            logger.error(logMarker, "I/O exception: ", e);
        }
    }

    private final Args args = new Args();
}
