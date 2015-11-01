package net.lab1318.costume.lib.services.institution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.lib.services.TestData;

public final class ElasticSearchInstitutionQueryServiceTest extends InstitutionServiceTest {
    @Test
    public void testGetInstitutionById() throws Exception {
        _putInstitutions();
        for (final InstitutionEntry entry : TestData.getInstance().getInstitutions()) {
            assertEquals(entry.getModel(), institutionQueryService.getInstitutionById(entry.getId()));
        }
    }

    @Test
    public void testGetInstitutions() throws Exception {
        _putInstitutions();
        final ImmutableList<InstitutionEntry> actual = institutionQueryService.getInstitutions();
        assertEquals(TestData.getInstance().getInstitutions().size(), actual.size());
        for (final InstitutionEntry expectedEntry : TestData.getInstance().getInstitutions()) {
            boolean found = false;
            for (final InstitutionEntry actualEntry : actual) {
                if (actualEntry.getId().equals(expectedEntry.getId())) {
                    found = true;
                    assertEquals(expectedEntry.getModel(), actualEntry.getModel());
                    break;
                }
            }
            assertTrue(found);
        }
    }
}
