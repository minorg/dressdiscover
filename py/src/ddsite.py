from datetime import datetime
from os.path import os

from com.google.common.base import Optional
from com.google.common.collect import ImmutableMap, ImmutableList
from net.lab1318.costume.api.models.institution import Institution, \
    InstitutionId
from net.lab1318.costume.api.models.rights import RightsSet, Rights, RightsType
from org.thryft.native_ import Url, Uri


from costume.lib.stores.collection.omeka.omeka_fs_collection_store import OmekaFsCollectionStore
from costume.lib.stores.object.omeka.omeka_fs_object_store import OmekaFsObjectStore  # Force registration # @UnusedImport
from costume.lib.stores.object.vccc.vccc_omeka_resource_mapper import VcccOmekaResourceMapper
from net.lab1318.costume.lib.python import PythonApi


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
put_institution(
    collection_store_uri=Uri.parse(OmekaFsCollectionStore.URI_SCHEME + ':/' + data_dir_path.replace(os.path.sep, '/')),
    institution_id=InstitutionId.parse('vccc'),
    institution_title='Vassar College Costume Collection',
    institution_url=Url.parse('http://vcomeka.com/vccc/'),
    store_parameters=ImmutableMap.of(
        'endpoint_url', 'http://vcomeka.com/vccc',
        'resource_mapper', VcccOmekaResourceMapper.__module__ + '.' + VcccOmekaResourceMapper.__name__  # @UndefinedVariable
    ),
)
