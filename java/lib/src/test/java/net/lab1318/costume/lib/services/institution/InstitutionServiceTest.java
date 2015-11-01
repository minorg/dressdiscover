package net.lab1318.costume.lib.services.institution;

import org.junit.After;
import org.junit.Before;

import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.lib.services.ServiceTest;
import net.lab1318.costume.lib.services.TestData;

public abstract class InstitutionServiceTest extends ServiceTest {
    public static void putInstitutions(final InstitutionCommandService institutionCommandService) throws Exception {
        for (final InstitutionEntry entry : TestData.getInstance().getInstitutions()) {
            institutionCommandService.putInstitution(entry.getId(), entry.getModel());
        }
        Thread.sleep(1000); // Let writes settle
    }

    @Before
    public void setUp() throws Exception {
        institutionCommandService = _getInjector().getInstance(InstitutionCommandService.class);
        institutionQueryService = _getInjector().getInstance(InstitutionQueryService.class);
        tearDown();
    }

    @After
    public void tearDown() throws Exception {
        institutionCommandService.deleteInstitutions();
    }

    protected final void _putInstitutions() throws Exception {
        putInstitutions(institutionCommandService);
    }

    protected InstitutionCommandService institutionCommandService;
    protected InstitutionQueryService institutionQueryService;
}
