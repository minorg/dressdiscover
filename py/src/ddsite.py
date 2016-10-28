from datetime import datetime
import java.lang
from os.path import os
import urllib

from com.google.common.base import Optional
from com.google.common.collect import ImmutableMap, ImmutableList
from org.dressdiscover.api.models.collection import CollectionId, Collection
from org.dressdiscover.api.models.configuration import CollectionConfiguration, \
    ObjectStoreConfiguration, InstitutionConfiguration, \
    CollectionStoreConfiguration
from org.dressdiscover.api.models.institution import Institution, \
    InstitutionId
from org.dressdiscover.api.vocabularies.vra_core.rights import RightsSet, Rights, \
    RightsType
from org.dressdiscover.lib.python import PythonApi
from org.thryft.native_ import Url

from dressdiscover.lib.mappers.historic_dress.historic_dress_omeka_resource_mapper import HistoricDressOmekaResourceMapper
from dressdiscover.lib.mappers.txfc.txfc_oai_pmh_record_mapper import TxfcOaiPmhRecordMapper
from dressdiscover.lib.mappers.vccc.vccc_omeka_resource_mapper import VcccOmekaResourceMapper
from dressdiscover.lib.mappers.wizard.wizard_omeka_resource_mapper import WizardOmekaResourceMapper  # @UnusedImport
from dressdiscover.lib.stores.collection.omeka.omeka_api_collection_store import OmekaApiCollectionStore  # @UnusedImport
from dressdiscover.lib.stores.collection.omeka.omeka_fs_collection_store import OmekaFsCollectionStore
from dressdiscover.lib.stores.object.oai_pmh.oai_pmh_fs_object_store import OaiPmhFsObjectStore
from dressdiscover.lib.stores.object.omeka.omeka_api_object_store import OmekaApiObjectStore  # Force registration # @UnusedImport
from dressdiscover.lib.stores.object.omeka.omeka_fs_object_store import OmekaFsObjectStore  # Force registration # @UnusedImport


data_dir_path = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data', 'extracted'))
assert os.path.isdir(data_dir_path), data_dir_path
print 'Data directory path:', data_dir_path


def put_historic_dress(self):
    institution_id = InstitutionId.parse('historicdress')
    institution_title = 'historicdress.org'

    PythonApi.getInstance().getInstitutionCommandService().putInstitution(
        institution_id,
        Institution.builder()
            .setDataRights(
                RightsSet.builder()\
                    .setElements(ImmutableList.of(
                        Rights.builder()
                            .setRightsHolder(institution_title)
                            .setText("Copyright %s %s" % (datetime.now().year, institution_title))
                            .setType(RightsType.COPYRIGHTED)
                            .build()

                    ))\
                    .build()
            )
            .setTitle(institution_title)
            .setUrl(Url.parse('http://historicdress.org'))
            .build()
    )

    store_parameters = ImmutableMap.of(  # @UndefinedVariable
        'data_directory_path', data_dir_path,
        'endpoint_url', 'http://historicdress.org/omeka2',
        'resource_mapper', HistoricDressOmekaResourceMapper.__module__ + '.' + HistoricDressOmekaResourceMapper.__name__  # @UndefinedVariable
    )

    PythonApi.getInstance().getConfigurationCommandService().putInstitutionConfiguration(
        institution_id,
        InstitutionConfiguration.builder()
            .setCollectionStoreConfiguration(
                CollectionStoreConfiguration.builder()
                    .setType(OmekaFsCollectionStore.TYPE_STRING)
                    .setParameters(store_parameters)
                    .build()
            )
            .setDefaultCollectionConfiguration(
                CollectionConfiguration.builder()
                    .setObjectStoreConfiguration(
                        ObjectStoreConfiguration.builder()
                            .setType(OmekaFsCollectionStore.TYPE_STRING)
                            .setParameters(store_parameters)
                            .build()
                    )
                    .build()
            )
            .build()
    )


def put_txfc():
    institution_id = InstitutionId.parse('untvca')
    PythonApi.getInstance().getInstitutionCommandService().putInstitution(
        institution_id,
        Institution.builder()
            .setDataRights(RightsSet.builder()
                .setElements(ImmutableList.of(
                    Rights.builder()
                        .setRightsHolder('University of North Texas')
                        .setText("The contents of Texas Fashion Collection, hosted by the University of North Texas Libraries (digital content including images, text, and sound and video recordings) are made publicly available by the collection-holding partners for use in research, teaching, and private study. For the full terms of use, see http://digital.library.unt.edu/terms-of-use/")
                        .setType(RightsType.COPYRIGHTED)
                        .build()
                ))
                .build())
            .setTitle('Texas Fashion Collection')
            .setUrl(Url.parse('http://digital.library.unt.edu/explore/collections/TXFC/'))
            .build()
    )

    collection_id = CollectionId.parse('untvca/txfc')
    PythonApi.getInstance().getCollectionCommandService().putCollection(
        collection_id,
        Collection.builder()
            .setTitle('Texas Fashion Collection')
            .build()
    )
    PythonApi.getInstance().getConfigurationCommandService().putCollectionConfiguration(
        collection_id,
        CollectionConfiguration.builder()
            .setObjectStoreConfiguration(
                ObjectStoreConfiguration.builder()
                    .setType(OaiPmhFsObjectStore.TYPE_STRING)
                    .setParameters(ImmutableMap.of(# @UndefinedVariable
                        'data_directory_path',
                        os.path.join(data_dir_path, 'untvca', 'txfc'),
                        'record_mapper',
                        TxfcOaiPmhRecordMapper.__module__ + '.' + TxfcOaiPmhRecordMapper.__name__  # @UndefinedVariable
                    ))
                    .build()
            )
            .build()
    )


def put_vccc():
    institution_id = InstitutionId.parse('vccc')
    institution_title = 'Vassar College Costume Collection'

    PythonApi.getInstance().getInstitutionCommandService().putInstitution(
        institution_id,
        Institution.builder()
            .setDataRights(
                RightsSet.builder()\
                    .setElements(ImmutableList.of(
                        Rights.builder()
                            .setRightsHolder(institution_title)
                            .setText("Copyright %s %s" % (datetime.now().year, institution_title))
                            .setType(RightsType.COPYRIGHTED)
                            .build()

                    ))\
                    .build()
            )
            .setTitle(institution_title)
            .setUrl(Url.parse('http://vcomeka.com/vccc/'))
            .build()
    )

    store_parameters = ImmutableMap.of(  # @UndefinedVariable
        'data_directory_path', data_dir_path,
        'endpoint_url', 'http://vcomeka.com/vccc',
        'resource_mapper', VcccOmekaResourceMapper.__module__ + '.' + VcccOmekaResourceMapper.__name__  # @UndefinedVariable
    )

    PythonApi.getInstance().getConfigurationCommandService().putInstitutionConfiguration(
        institution_id,
        InstitutionConfiguration.builder()
            .setCollectionStoreConfiguration(
                CollectionStoreConfiguration.builder()
                    .setType(OmekaFsCollectionStore.TYPE_STRING)
                    .setParameters(store_parameters)
                    .build()
            )
            .setDefaultCollectionConfiguration(
                CollectionConfiguration.builder()
                    .setObjectStoreConfiguration(
                        ObjectStoreConfiguration.builder()
                            .setType(OmekaFsCollectionStore.TYPE_STRING)
                            .setParameters(store_parameters)
                            .build()
                    )
                    .build()
            )
            .build()
    )


# put_institution(
#     collection_store_uri=Uri.parse(OmekaApiCollectionStore.TYPE_STRING + '://historicdress.org/omeka2/'),
#     institution_id=InstitutionId.parse('wizard'),
#     institution_title='Wizard',
#     institution_url=Url.parse('http://historicdress.org/omeka2/'),
#     store_parameters=ImmutableMap.of(
#         'api_key', open(os.path.join(os.path.dirname(__file__), 'historicdress.org-api-key.txt')).read().strip(),
#         'square_thumbnail_height_px', '200',
#         'square_thumbnail_width_px', '200',
#         'resource_mapper', WizardOmekaResourceMapper.__module__ + '.' + WizardOmekaResourceMapper.__name__  # @UndefinedVariable
#     )
# )


put_historic_dress()
put_txfc()
put_vccc()
