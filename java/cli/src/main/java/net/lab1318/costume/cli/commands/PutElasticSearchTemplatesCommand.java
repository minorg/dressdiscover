package net.lab1318.costume.cli.commands;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.thryft.waf.cli.Command;
import org.thryft.waf.lib.stores.ElasticSearchIndex;

import com.google.inject.Injector;

import net.lab1318.costume.lib.stores.object.ObjectSummaryElasticSearchIndex;

public final class PutElasticSearchTemplatesCommand extends Command {
    @Override
    public Args getArgs() {
        return args;
    }

    @Override
    public void run(final Injector injector) {
        try {
            __putElasticSearchTemplate(injector.getInstance(ObjectSummaryElasticSearchIndex.class), "object_summary");
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void __putElasticSearchTemplate(final ElasticSearchIndex<?, ?, ?> index, final String indexNamePrefix)
            throws IOException {
        final String template = IOUtils.toString(
                getClass().getResourceAsStream("/elastic_search_templates/" + indexNamePrefix + "_template.json"));
        index.putTemplate(indexNamePrefix, template);
    }

    private final Args args = new Args();
}
