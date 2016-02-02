package net.lab1318.costume.lib.services.institution;

import net.lab1318.costume.api.services.institution.InstitutionCommandService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.services.ServicesModule;

public final class CachingInstitutionCommandServiceTest extends InstitutionCommandServiceTest {
    @Override
    protected ServicesModule _newServicesModule(final CostumeProperties properties) {
        return new ServicesModule() {
            @Override
            protected void _configureInstitutionCommandService() {
                bind(InstitutionCommandService.class).to(CachingInstitutionCommandService.class);
            }

            @Override
            protected void _configureInstitutionQueryService() {
                bind(InstitutionQueryService.class).to(CachingInstitutionQueryService.class);
            }
        };
    }
}
