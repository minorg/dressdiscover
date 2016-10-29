from com.google.common.collect import ImmutableList
from org.dressdiscover.api.models.object import Object
from org.dressdiscover.api.vocabularies.vra_core import VraCoreObject
from org.dressdiscover.api.vocabularies.vra_core.relation import RelationSet

from org.dressdiscover.api.vocabularies.dublin_core import DublinCoreObject


class _Mapper(object):
    class _ObjectBuilder(object):
        def __init__(self, logger, log_marker):
            self.__object_builder = Object.builder()
            self.__logger = logger
            self.__log_marker = log_marker

            self.dc = {}
            self.images = []
            self.relation_builders = []
            self.vra = {}

        def build(self):
            if len(self.dc) > 0:
                dc_builder = DublinCoreObject.builder()
                for name, values in self.dc.iteritems():
                    unique_values = []
                    for value in values:
                        if not value in unique_values:
                            unique_values.append(value)
                    dc_builder.set(name if name == 'rights' else name + 's', ImmutableList.copyOf(unique_values))
                self._object_builder.setDublinCore(dc_builder.build())

            if len(self.images) > 0:
                self._object_builder.setImages(ImmutableList.copyOf(self.images))

            if len(self.relation_builders) > 0:
                unique_relation_builders_by_text = {}
                for relation_builder in self.relation_builders:
                    assert relation_builder.text is not None
                    existing_relation_builders = unique_relation_builders_by_text.setdefault(relation_builder.text, [])
                    unique = True
                    for existing_relation_builder in existing_relation_builders:
                        if existing_relation_builder.type == relation_builder.type:
                            unique = False
                            break
                    if unique:
                        existing_relation_builders.append(relation_builder)
                    else:
                        self.__logger.warn(self.__log_marker, "item {} has duplicate relation type={}, text={}", (self.__omeka_item.id, relation_builder.type, relation_builder.text))
                unique_relation_builders = []
                for relation_builders in unique_relation_builders_by_text.values():
                    unique_relation_builders.extend(relation_builders)
                self.vra.setdefault('relation', []).extend(relation_builder.build()
                                                for relation_builder in unique_relation_builders)

            if len(self.vra) > 0:
                vra_builder = VraCoreObject.builder()

                for name, values in self.vra.iteritems():
                    field_metadata = VraCoreObject.FieldMetadata.valueOfThriftName(name + '_sets')  # @UndefinedVariable
                    set_class_name = field_metadata.getJavaName()[0].upper() + field_metadata.getJavaName()[1:-4] + 'Set'
                    set_class_qname = 'org.dressdiscover.api.vocabularies.vra_core.' + name + '.' + set_class_name
                    set_class = __import__(set_class_qname)
                    for component in set_class_qname.split('.')[1:]:
                        set_class = getattr(set_class, component)
                    vra_builder.set(field_metadata, ImmutableList.of(set_class.builder().setElements(ImmutableList.copyOf(values)).build()))

                self._object_builder.setVraCore(vra_builder.build())

            return self._object_builder.build()

        @property
        def _object_builder(self):
            return self.__object_builder

        @property
        def logger(self):
            return self.__logger

        @property
        def log_marker(self):
            return self.__log_marker

