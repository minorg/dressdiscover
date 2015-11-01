package net.lab1318.costume.lib.stores.institution;

import org.notaweb.lib.clients.ElasticSearchClient;
import org.notaweb.lib.stores.ElasticSearchIndex;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;

@Singleton
public class InstitutionElasticSearchIndex extends ElasticSearchIndex<Institution, InstitutionEntry, InstitutionId> {
    @Inject
    public InstitutionElasticSearchIndex(final ElasticSearchClient client,
            @Named("environment") final String environment) {
        super(client, DOCUMENT_TYPE, INDEX_NAME_PREFIX + '_' + environment);
    }

    public final static String DOCUMENT_TYPE = "institution";
    public final static String INDEX_NAME_PREFIX = "institution";
}
