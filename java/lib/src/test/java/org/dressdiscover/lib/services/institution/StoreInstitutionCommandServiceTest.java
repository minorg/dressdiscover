package org.dressdiscover.lib.services.institution;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.testdata.TestData;
import org.junit.Test;

public final class StoreInstitutionCommandServiceTest extends InstitutionServiceTest {
    @Test
    public void testDeleteInstitutionById() throws Exception {
        _putInstitutions();
        for (final InstitutionEntry institutionEntry : TestData.getInstance().getInstitutions()) {
            institutionQueryService.getInstitutionById(institutionEntry.getId());
            institutionCommandService.deleteInstitutionById(institutionEntry.getId());
            try {
                institutionQueryService.getInstitutionById(institutionEntry.getId());
                fail();
            } catch (final NoSuchInstitutionException e) {
            }
        }
    }

    @Test
    public void testPutInstitutions() throws Exception {
        _putInstitutions();
        assertThat(institutionQueryService.getInstitutions().size(),
                greaterThanOrEqualTo(TestData.getInstance().getInstitutions().size()));
    }
}
