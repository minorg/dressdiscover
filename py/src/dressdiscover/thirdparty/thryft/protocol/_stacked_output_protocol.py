from ..protocol._abstract_output_protocol import _AbstractOutputProtocol
from ..protocol._output_protocol import _OutputProtocol


class _StackedOutputProtocol(_OutputProtocol):
    def __init__(self):
        _AbstractOutputProtocol.__init__(self)
        self._output_protocol_stack = []

    def write_binary(self, value):
        self._output_protocol_stack[-1].write_binary(value)

    def write_bool(self, value):
        self._output_protocol_stack[-1].write_bool(value)

    def write_byte(self, value):
        self._output_protocol_stack[-1].write_byte(value)

    def write_date_time(self, value):
        self._output_protocol_stack[-1].write_date_time(value)

    def write_decimal(self, value):
        self._output_protocol_stack[-1].write_decimal(value)

    def write_double(self, value):
        self._output_protocol_stack[-1].write_double(value)

    def write_field_begin(self, name, *args, **kwds):
        self._output_protocol_stack[-1].write_field_begin(name, *args, **kwds)

    def write_field_end(self):
        self._output_protocol_stack[-1].write_field_end()

    def write_field_stop(self):
        self._output_protocol_stack[-1].write_field_stop()

    def write_i16(self, value):
        self._output_protocol_stack[-1].write_i16(value)

    def write_i32(self, value):
        self._output_protocol_stack[-1].write_i32(value)

    def write_i64(self, value):
        self._output_protocol_stack[-1].write_i16(value)

    def write_list_begin(self, *args, **kwds):
        self._output_protocol_stack[-1].write_list_begin(*args, **kwds)

    def write_list_end(self):
        self._output_protocol_stack.pop(-1)
        self._output_protocol_stack[-1].write_list_end()

    def write_map_begin(self, *args, **kwds):
        self._output_protocol_stack[-1].write_map_begin(*args, **kwds)

    def write_map_end(self):
        self._output_protocol_stack.pop(-1)
        self._output_protocol_stack[-1].write_list_end()

    def write_null(self):
        self._output_protocol_stack[-1].write_null()

    def write_set_begin(self, *args, **kwds):
        self._output_protocol_stack[-1].write_set_begin(*args, **kwds)

    def write_set_end(self):
        self._output_protocol_stack.pop(-1)
        self._output_protocol_stack[-1].write_set_end()

    def write_string(self, value):
        self._output_protocol_stack[-1].write_string(value)

    def write_struct_begin(self, *args, **kwds):
        self._output_protocol_stack[-1].write_struct_begin(*args, **kwds)

    def write_struct_end(self):
        self._output_protocol_stack.pop(-1)
        self._output_protocol_stack[-1].write_struct_end()

    def write_u32(self, value):
        self._output_protocol_stack[-1].write_u32(value)

    def write_u64(self, value):
        self._output_protocol_stack[-1].write_u64(value)

    def write_variant(self, value):
        self._output_protocol_stack[-1].write_variant(value)
