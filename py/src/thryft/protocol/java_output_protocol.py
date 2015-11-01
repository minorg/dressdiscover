from time import mktime
import thryft.protocol._abstract_output_protocol
from thryft.protocol._stacked_output_protocol import _StackedOutputProtocol


def _upper_camelize(name):
    return ''.join([name_part.capitalize() for name_part in name.split('_')])


class JavaOutputProtocol(_StackedOutputProtocol):
    class _OutputProtocol(thryft.protocol._abstract_output_protocol._AbstractOutputProtocol):
        def __init__(self, output_protocol_stack, output_str_list):
            thryft.protocol._output_protocol._OutputProtocol.__init__(self)
            self.__output_protocol_stack = output_protocol_stack
            self._output_str_list = output_str_list

        def write_bool(self, value):
            self._write_value("true" if value else "false")

        def write_date_time(self, value):
            self._write_value("new java.util.Date(%sl)" % (long(mktime(value.timetuple())) * 1000l))

        def write_i32(self, value):
            self._write_value(str(value))

        def write_i64(self, value):
            self._write_value(str(value))

        def write_list_begin(self, *args, **kwds):
            self._output_str_list.append('com.google.common.collect.ImmutableList.of(')
            self.__output_protocol_stack.append(JavaOutputProtocol._ListOutputProtocol(self.__output_protocol_stack, self._output_str_list))

        def write_list_end(self):
            self._output_str_list.pop()
            self._output_str_list.append(')')

        def write_map_begin(self, *args, **kwds):
            self._output_str_list.append('com.google.common.collect.ImmutableMap.of(')
            self.__output_protocol_stack.append(JavaOutputProtocol._MapOutputProtocol(self.__output_protocol_stack, self._output_str_list))

        def write_map_end(self):
            self._output_str_list.pop()
            self._output_str_list.append(')')

        def write_null(self):
            raise NotImplementedError

        def write_string(self, value):
            ascii_value = value.encode('ascii', 'ignore')
            escaped_value = ascii_value.encode('string-escape').replace('"', '\\"')
            self._write_value("\"" + escaped_value + "\"")

        def write_struct_begin(self, name):
            self._output_str_list.append("%(name)s.builder()." % locals())
            self.__output_protocol_stack.append(JavaOutputProtocol._StructOutputProtocol(self.__output_protocol_stack, self._output_str_list))

        def write_struct_end(self):
            self._output_str_list.append('build()')

        def _write_value(self, value):
            raise NotImplementedError

    class _ListOutputProtocol(_OutputProtocol):
        def _write_value(self, value):
            self._output_str_list.append(value)
            self._output_str_list.append(', ')

    class _MapOutputProtocol(_OutputProtocol):
        def __init__(self, *args, **kwds):
            JavaOutputProtocol._OutputProtocol.__init__(self, *args, **kwds)
            self.__next_key = None

        def _write_value(self, value):
            if self.__next_key is None:
                self.__output_str_list.append(value)
            else:
                self.__output_str_list.append(value)
                self.__next_key = None
            self.__output_str_list.append(', ')

    class _RootOutputProtocol(_OutputProtocol):
        def __init__(self, *args, **kwds):
            JavaOutputProtocol._OutputProtocol.__init__(self, *args, **kwds)
            self.__value = None

        @property
        def value(self):
            return self.__value

        def _write_value(self, value):
            self.__value = value

    class _StructOutputProtocol(_OutputProtocol):
        def __init__(self, *args, **kwds):
            JavaOutputProtocol._OutputProtocol.__init__(self, *args, **kwds)
            self.__next_field_name = None

        def write_field_begin(self, name, *args, **kwds):
            self.__next_field_name = name

        def write_field_end(self):
            self.__next_field_name = None

        def write_field_stop(self):
            pass

        def _write_value(self, value):
            self._output_str_list.append("set%s(%s)." % (_upper_camelize(self.__next_field_name), value))

    def __init__(self):
        _StackedOutputProtocol.__init__(self)
        self.__output_str_list = []
        self._output_protocol_stack.append(JavaOutputProtocol._RootOutputProtocol(self._output_protocol_stack, self.__output_str_list))

    def __str__(self):
        return ''.join(self.__output_str_list)
