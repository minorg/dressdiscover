from net.lab1318.costume.api.services.institution import InstitutionCommandService, \
    InstitutionQueryService

from net.lab1318.costume.lib.python import PythonInterpreterFactory


injector = PythonInterpreterFactory.getInstance().getInjector()


institution_command_service = injector.getInstance(InstitutionCommandService)
institution_query_service = injector.getInstance(InstitutionQueryService)

print institution_query_service.getInstitutions()
