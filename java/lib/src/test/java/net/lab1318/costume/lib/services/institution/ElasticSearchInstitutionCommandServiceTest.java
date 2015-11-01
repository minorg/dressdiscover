package net.lab1318.costume.lib.services.institution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import net.lab1318.costume.lib.services.TestData;

public final class ElasticSearchInstitutionCommandServiceTest extends InstitutionServiceTest {
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
