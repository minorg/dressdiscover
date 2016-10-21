from ..protocol._input_protocol import _InputProtocol


class _StackedInputProtocol(_InputProtocol):
    def __init__(self):
        _InputProtocol.__init__(self)
        self._input_protocol_stack = []

    def read_binary(self):
        return self._input_protocol_stack[-1].read_binary()

    def read_bool(self):
        return self._input_protocol_stack[-1].read_bool()

    def read_byte(self):
        return self._input_protocol_stack[-1].read_byte()

    def read_date_time(self):
        return self._input_protocol_stack[-1].read_date_time()

    def read_decimal(self):
        return self._input_protocol_stack[-1].read_decimal()

    def read_double(self):
        return self._input_protocol_stack[-1].read_double()

    def read_field_begin(self):
        return self._input_protocol_stack[-1].read_field_begin()

    def read_field_end(self):
        return self._input_protocol_stack[-1].read_field_end()

    def read_field_stop(self):
        return self._input_protocol_stack[-1].read_field_stop()

    def read_float(self):
        return self._input_protocol_stack[-1].read_float()

    def read_i16(self):
        return self._input_protocol_stack[-1].read_i16()

    def read_i32(self):
        return self._input_protocol_stack[-1].read_i32()

    def read_i64(self):
        return self._input_protocol_stack[-1].read_i16()

    def read_list_begin(self):
        return self._input_protocol_stack[-1].read_list_begin()

    def read_list_end(self):
        self._input_protocol_stack.pop(-1)
        return self._input_protocol_stack[-1].read_list_end()

    def read_map_begin(self):
        return self._input_protocol_stack[-1].read_map_begin()

    def read_map_end(self):
        self._input_protocol_stack.pop(-1)
        return self._input_protocol_stack[-1].read_list_end()

    def read_null(self):
        return self._input_protocol_stack[-1].read_null()

    def read_set_begin(self):
        return self._input_protocol_stack[-1].read_set_begin()

    def read_set_end(self):
        self._input_protocol_stack.pop(-1)
        return self._input_protocol_stack[-1].read_set_end()

    def read_string(self):
        return self._input_protocol_stack[-1].read_string()

    def read_struct_begin(self):
        return self._input_protocol_stack[-1].read_struct_begin()

    def read_struct_end(self):
        self._input_protocol_stack.pop(-1)
        return self._input_protocol_stack[-1].read_struct_end()

    def read_u32(self):
        return self._input_protocol_stack[-1].read_u32()

    def read_u64(self):
        return self._input_protocol_stack[-1].read_u64()

    def read_variant(self):
        return self._input_protocol_stack[-1].read_variant()
