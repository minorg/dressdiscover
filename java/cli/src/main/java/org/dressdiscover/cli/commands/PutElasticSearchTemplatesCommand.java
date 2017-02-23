package org.dressdiscover.cli.commands;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.lib.services.IoExceptions;
import org.dressdiscover.lib.stores.object.ObjectSummaryElasticSearchIndex;
import org.thryft.waf.cli.Command;
import org.thryft.waf.lib.stores.elasticsearch.ElasticSearchIndex;

import com.google.inject.Injector;

public final class PutElasticSearchTemplatesCommand extends Command<Command.Args> {
    public PutElasticSearchTemplatesCommand() {
        super(new Args());
    }

    @Override
    public void run(final Injector injector) {
        try {
            __putElasticSearchTemplate(injector.getInstance(ObjectSummaryElasticSearchIndex.class), "object_summary");
        } catch (final IoException e) {
            throw new RuntimeException(e);
        }
    }

    private void __putElasticSearchTemplate(final ElasticSearchIndex<IoException, ?, ?, ?, ?> index,
            final String indexNamePrefix) throws IoException {
        String template;
        try {
            template = IOUtils.toString(
                    getClass().getResourceAsStream("/elastic_search_templates/" + indexNamePrefix + "_template.json"));
        } catch (final IOException e) {
            throw IoExceptions.wrap(e, "");
        }
        index.putTemplate(indexNamePrefix, template);
    }
}
