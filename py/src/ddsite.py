from datetime import datetime

from com.google.common.collect import ImmutableMap
from net.lab1318.costume.api.models.institution import Institution
from net.lab1318.costume.api.models.rights import RightsSet, Rights, RightsType
from net.lab1318.costume.api.services.institution import InstitutionCommandService, \
    InstitutionQueryService

from net.lab1318.costume.lib.python import PythonInterpreterFactory
from org.thryft.native_ import Url


injector = PythonInterpreterFactory.getInstance().getInjector()


institution_command_service = injector.getInstance(InstitutionCommandService)
institution_query_service = injector.getInstance(InstitutionQueryService)


def put_institution(institution_id, institution_title, institution_url, store_parameters):
    institution_command_service.putInstitution(
        institution_id,
        Institution.Builder()
            .set_data_rights(
                RightsSet.Builder()
                    .set_elements((
                        Rights.Builder()
                            .set_rights_holder(institution_title)
                            .set_text("Copyright %s %s" % (datetime.now().year, institution_title))
                            .set_type(RightsType.COPYRIGHTED)
                            .build()

                    ,))
                    .build()
            )
            .set_store_parameters(store_parameters)
            .set_title(institution_title)
            .set_url(institution_url)
            .build()
    )


put_institution(
    institution_id='vccc',
    institution_title='Vassar College Costume Collection',
    institution_url=Url.parse('http://vcomeka.com/vccc/'),
    store_parameters=ImmutableMap.of(
        'endpoint_url', 'http://vcomeka.com/vccc',
        'mapper', 'costume.lib.stores.vccc.vccc_omeka_item_to_object_mapper.VcccOmekaItemToObjectMapper'
    )
)
