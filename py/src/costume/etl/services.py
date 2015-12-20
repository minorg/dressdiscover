from costume.client.services.collection.collection_command_service_json_rpc_client import CollectionCommandServiceJsonRpcClient
from costume.client.services.institution.institution_command_service_json_rpc_client import InstitutionCommandServiceJsonRpcClient
from costume.client.services.object.object_command_service_json_rpc_client import ObjectCommandServiceJsonRpcClient
from costume.lib.costume_properties import CostumeProperties


class Services(object):
    def __init__(self, properties=None):
        if properties is None:
            properties = CostumeProperties.load()
        self.__collection_command_service = CollectionCommandServiceJsonRpcClient(api_url=properties.api_url)
        self.__institution_command_service = InstitutionCommandServiceJsonRpcClient(api_url=properties.api_url)
        self.__object_command_service = ObjectCommandServiceJsonRpcClient(api_url=properties.api_url)

    @property
    def collection_command_service(self):
        return self.__collection_command_service

    @property
    def institution_command_service(self):
        return self.__institution_command_service

    @property
    def object_command_service(self):
        return self.__object_command_service
