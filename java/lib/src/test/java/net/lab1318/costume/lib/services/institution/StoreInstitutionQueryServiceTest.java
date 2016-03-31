package net.lab1318.costume.lib.services.institution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.testdata.TestData;

public final class StoreInstitutionQueryServiceTest extends InstitutionServiceTest {
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

    @Test
    public void testGetInstitutionsByIds() throws Exception {
        final ImmutableList<InstitutionEntry> expected = _putInstitutions();
        final ImmutableList.Builder<InstitutionId> idsBuilder = ImmutableList.builder();
        for (final InstitutionEntry entry : expected) {
            idsBuilder.add(entry.getId());
        }
        final ImmutableList<Institution> actual = institutionQueryService.getInstitutionsByIds(idsBuilder.build());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).getModel(), actual.get(i));
        }
    }
}
