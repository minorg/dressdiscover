import os.path

from thryft.generator.string_type import StringType
from thryft.generator.typedef import Typedef


class _Id(object):
    def __init__(self, overridden_construct):
        self.__overridden_construct = overridden_construct
        assert isinstance(overridden_construct, Typedef)

    def elastic_search_mapping_dict(self):
        return {'index': 'not_analyzed', 'type': 'string'}

    def java_bean_boxed_name(self):
        return self.java_qname()

    def java_bean_boxed_qname(self):
        return self.java_qname()

    def java_boxed_name(self):
        return self.java_qname()

    def java_boxed_qname(self):
        return self.java_qname()

    def java_default_value(self):
        return 'null'

    def java_name(self):
        return self.java_qname()

    def java_is_reference(self):
        return True

    def java_read_protocol(self):
        return "%s.parse(iprot.readString())" % self.java_qname()

    def java_write_protocol(self, value, depth=0):
        return "oprot.writeString(%(value)s.toString());" % locals()

    def thrift_ttype_id(self):
        return StringType.THRIFT_TTYPE_ID

    def thrift_ttype_name(self):
        return StringType.THRIFT_TTYPE_NAME

    def ts_from_json(self, value):
        name = self.ts_name()
        return "%(name)s.parse(%(value)s)" % locals()

    def ts_imports_use(self, caller_file_abspath, caller_stack):
        module_path = os.path.relpath(self.__overridden_construct._parent_document().ts_path(), os.path.dirname(caller_file_abspath)).replace(os.path.sep, '/')[:-3]
        if not module_path.startswith('.'):
            module_path = './' + module_path
        return ['import { %s } from "%s";' % (self.ts_name(), module_path)]

    def ts_name(self):
        return self.__class__.__name__

    def ts_to_json(self, value):
        return "%(value)s.toString()" % locals()

