from thryft.generator.string_type import StringType


class _Id(object):
    def __init__(self, *args, **kwds):
        pass

    def elastic_search_mapping_dict(self):
        return {'index': 'not_analyzed', 'type': 'string'}

    def java_default_value(self):
        return 'null'

    def java_name(self, boxed=False):
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
