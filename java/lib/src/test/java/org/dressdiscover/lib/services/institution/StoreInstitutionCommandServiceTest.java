package org.dressdiscover.lib.services.institution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.testdata.TestData;
import org.junit.Test;

import org.dressdiscover.api.services.institution.NoSuchInstitutionException;

public final class StoreInstitutionCommandServiceTest extends InstitutionServiceTest {
    @Test
    public void testDeleteInstitutionById() throws Exception {
        assertEquals(0, institutionQueryService.getInstitutions().size());
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
        assertEquals(0, institutionQueryService.getInstitutions().size());
        _putInstitutions();
        assertEquals(TestData.getInstance().getInstitutions().size(), institutionQueryService.getInstitutions().size());
    }
}
