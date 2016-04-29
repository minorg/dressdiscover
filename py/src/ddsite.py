from datetime import datetime
from os.path import os

from com.google.common.base import Optional
from com.google.common.collect import ImmutableMap, ImmutableList
from net.lab1318.costume.api.models.institution import Institution, \
    InstitutionId
from net.lab1318.costume.api.models.rights import RightsSet, Rights, RightsType
from org.thryft.native_ import Url, Uri

from costume.lib.stores.collection.omeka.omeka_api_collection_store import OmekaApiCollectionStore
# from costume.lib.stores.collection.omeka.omeka_fs_collection_store import OmekaFsCollectionStore
from costume.lib.stores.object.omeka.omeka_api_object_store import OmekaApiObjectStore  # Force registration # @UnusedImport
from costume.lib.stores.object.omeka.omeka_fs_object_store import OmekaFsObjectStore  # Force registration # @UnusedImport
from costume.lib.stores.object.wizard.wizard_omeka_resource_mapper import WizardOmekaResourceMapper
from net.lab1318.costume.lib.python import PythonApi


# from costume.lib.stores.object.vccc.vccc_omeka_resource_mapper import VcccOmekaResourceMapper
def put_institution(collection_store_uri, institution_id, institution_title, institution_url, store_parameters):
    PythonApi.getInstance().getInstitutionCommandService().putInstitution(
        institution_id,
        Institution.Builder()
            .setCollectionStoreUri(Optional.of(collection_store_uri))
            .setDataRights(
                RightsSet.Builder()
                    .setElements(ImmutableList.of(
                        Rights.Builder()
                            .setRightsHolder(institution_title)
                            .setText("Copyright %s %s" % (datetime.now().year, institution_title))
                            .setType(RightsType.COPYRIGHTED)
                            .build()

                    ))
                    .build()
            )
            .setStoreParameters(store_parameters)
            .setTitle(institution_title)
            .setUrl(institution_url)
            .build()
    )

data_dir_path = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data', 'extracted'))
assert os.path.isdir(data_dir_path)
# put_institution(
#     collection_store_uri=Uri.parse(OmekaFsCollectionStore.URI_SCHEME + ':/' + data_dir_path.replace(os.path.sep, '/')),
#     institution_id=InstitutionId.parse('vccc'),
#     institution_title='Vassar College Costume Collection',
#     institution_url=Url.parse('http://vcomeka.com/vccc/'),
#     store_parameters=ImmutableMap.of(
#         'endpoint_url', 'http://vcomeka.com/vccc',
#         'resource_mapper', VcccOmekaResourceMapper.__module__ + '.' + VcccOmekaResourceMapper.__name__  # @UndefinedVariable
#     ),
# )
put_institution(
    collection_store_uri=Uri.parse(OmekaApiCollectionStore.URI_SCHEME + '://historicdress.org/omeka2/'),
    institution_id=InstitutionId.parse('wizard'),
    institution_title='Wizard',
    institution_url=Url.parse('http://historicdress.org/omeka2/'),
    store_parameters=ImmutableMap.of(
        'api_key', open(os.path.join(os.path.dirname(__file__), 'historicdress.org-api-key.txt')).read(),
        'square_thumbnail_height_px', '200',
        'square_thumbnail_width_px', '200',
        'resource_mapper', WizardOmekaResourceMapper.__module__ + '.' + WizardOmekaResourceMapper.__name__  # @UndefinedVariable
    ),
)