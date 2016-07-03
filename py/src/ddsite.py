from datetime import datetime
from os.path import os
import sys
import urllib

from com.google.common.base import Optional
from com.google.common.collect import ImmutableMap, ImmutableList
from org.dressdiscover.api.models.collection import CollectionId, Collection
from org.dressdiscover.api.models.institution import Institution, \
    InstitutionId
from org.dressdiscover.api.models.rights import RightsSet, Rights, RightsType
from org.dressdiscover.lib.python import PythonApi
from org.thryft.native_ import Url, Uri

from dressdiscover.lib.stores.collection.omeka.omeka_api_collection_store import OmekaApiCollectionStore  # @UnusedImport
from dressdiscover.lib.stores.collection.omeka.omeka_fs_collection_store import OmekaFsCollectionStore
from dressdiscover.lib.stores.object.oai_pmh.oai_pmh_fs_object_store import OaiPmhFsObjectStore
from dressdiscover.lib.stores.object.omeka.omeka_api_object_store import OmekaApiObjectStore  # Force registration # @UnusedImport
from dressdiscover.lib.stores.object.omeka.omeka_fs_object_store import OmekaFsObjectStore  # Force registration # @UnusedImport
from dressdiscover.lib.stores.object.txfc.txfc_oai_pmh_record_mapper import TxfcOaiPmhRecordMapper
from dressdiscover.lib.stores.object.vccc.vccc_omeka_resource_mapper import VcccOmekaResourceMapper
from dressdiscover.lib.stores.object.wizard.wizard_omeka_resource_mapper import WizardOmekaResourceMapper  # @UnusedImport


def put_collection(collection_id, institution_id, title, hidden=None, object_store_uri=None):
    PythonApi.getInstance().getCollectionCommandService().putCollection(
        collection_id,
        Collection.builder()
            .setHidden(Optional.fromNullable(hidden))
            .setInstitutionId(institution_id)
            .setObjectStoreUri(Optional.fromNullable(object_store_uri))
            .setTitle(title)
            .build()
    )

def put_institution(institution_id, institution_title, institution_url, store_parameters, collection_store_uri=None, data_rights=None):
    if data_rights is None:
        data_rights = \
            RightsSet.builder()\
                .setElements(ImmutableList.of(
                    Rights.builder()
                        .setRightsHolder(institution_title)
                        .setText("Copyright %s %s" % (datetime.now().year, institution_title))
                        .setType(RightsType.COPYRIGHTED)
                        .build()

                ))\
                .build()

    PythonApi.getInstance().getInstitutionCommandService().putInstitution(
        institution_id,
        Institution.builder()
            .setCollectionStoreUri(Optional.fromNullable(collection_store_uri))
            .setDataRights(data_rights)
            .setStoreParameters(store_parameters)
            .setTitle(institution_title)
            .setUrl(institution_url)
            .build()
    )

data_dir_path = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data', 'extracted'))
assert os.path.isdir(data_dir_path), data_dir_path
data_file_uri_authority_base = urllib.pathname2url(data_dir_path)
# if sys.platform.startswith('win'):
#     data_file_uri_authority_base = '///' + data_file_uri_authority_base
# else:
#     data_file_uri_authority_base = '//' + data_file_uri_authority_base
print 'Data directory path:', data_dir_path
print 'Data file URI base:', data_file_uri_authority_base

put_institution(
    data_rights=\
        RightsSet.builder()
            .setElements(ImmutableList.of(
                Rights.builder()
                    .setRightsHolder('University of North Texas')
                    .setText("The contents of Texas Fashion Collection, hosted by the University of North Texas Libraries (digital content including images, text, and sound and video recordings) are made publicly available by the collection-holding partners for use in research, teaching, and private study. For the full terms of use, see http://digital.library.unt.edu/terms-of-use/")
                    .setType(RightsType.COPYRIGHTED)
                    .build()
            ))
            .build(),
    institution_id=InstitutionId.parse('untvca'),
    institution_title='Texas Fashion Collection',
    institution_url=Url.parse('http://digital.library.unt.edu/explore/collections/TXFC/'),
    store_parameters=ImmutableMap.of(
        'record_mapper', TxfcOaiPmhRecordMapper.__module__ + '.' + TxfcOaiPmhRecordMapper.__name__  # @UndefinedVariable
    ),
)
put_collection(
    collection_id=CollectionId.parse('untvca/txfc'),
    institution_id=InstitutionId.parse('untvca'),
    object_store_uri=Uri.parse(OaiPmhFsObjectStore.URI_SCHEME + ':' + data_file_uri_authority_base + '/untvca/txfc'),
    title='Texas Fashion Collection'
)

put_institution(
    collection_store_uri=Uri.parse(OmekaFsCollectionStore.URI_SCHEME + ':' + data_file_uri_authority_base),
    institution_id=InstitutionId.parse('vccc'),
    institution_title='Vassar College Costume Collection',
    institution_url=Url.parse('http://vcomeka.com/vccc/'),
    store_parameters=ImmutableMap.of(
        'endpoint_url', 'http://vcomeka.com/vccc',
        'resource_mapper', VcccOmekaResourceMapper.__module__ + '.' + VcccOmekaResourceMapper.__name__  # @UndefinedVariable
    ),
)
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
    )
)
