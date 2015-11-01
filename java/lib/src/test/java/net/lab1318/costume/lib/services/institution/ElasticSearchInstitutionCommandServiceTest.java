package net.lab1318.costume.lib.services.institution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.lib.services.TestData;

public final class ElasticSearchInstitutionCommandServiceTest extends InstitutionServiceTest {
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
    public void testDeleteInstitutions() throws Exception {
        assertEquals(0, institutionQueryService.getInstitutions().size());
        _putInstitutions();
        assertNotEquals(0, institutionQueryService.getInstitutions().size());
        institutionCommandService.deleteInstitutions();
        assertEquals(0, institutionQueryService.getInstitutions().size());
    }

    @Test
    public void testPutInstitutions() throws Exception {
        assertEquals(0, institutionQueryService.getInstitutions().size());
        _putInstitutions();
        assertEquals(TestData.getInstance().getInstitutions().size(), institutionQueryService.getInstitutions().size());
    }
}
