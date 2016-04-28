from net.lab1318.costume.lib.stores.object import ObjectStore

from costume.lib.stores.omeka_resource_mapper import OmekaResourceMapper


class _OmekaObjectStore(ObjectStore):
    def __init__(self, endpoint_url, properties, uri, resource_mapper=None, square_thumbnail_height_px=150, square_thumbnail_width_px=150):
        self.__endpoint_url = endpoint_url
        if resource_mapper is None:
            resource_mapper = OmekaResourceMapper()
        elif isinstance(resource_mapper, basestring):
            resource_mapper_class_qname_split = resource_mapper.split('.')
            resource_mapper_class = __import__('.'.join(resource_mapper_class_qname_split[:-1]))
            for component in resource_mapper_class_qname_split[1:]:
                resource_mapper_class = getattr(resource_mapper_class, component)
            resource_mapper = resource_mapper_class()
        self.__resource_mapper = resource_mapper
        self.__square_thumbnail_height_px = int(square_thumbnail_height_px)
        self.__square_thumbnail_width_px = int(square_thumbnail_width_px)
        self.__uri = uri

    @property
    def _endpoint_url(self):
        return self.__endpoint_url

    def _map_omeka_item(self, collection_id, omeka_item, omeka_item_files):
        return \
            self._resource_mapper.map_omeka_item(
                collection_id=collection_id,
                endpoint_url=self._endpoint_url,
                omeka_item=omeka_item,
                omeka_item_files=omeka_item_files,
                square_thumbnail_height_px=self.__square_thumbnail_height_px,
                square_thumbnail_width_px=self.__square_thumbnail_width_px
            )

    @property
    def _resource_mapper(self):
        return self.__resource_mapper

    @property
    def _uri(self):
        return self.__uri
