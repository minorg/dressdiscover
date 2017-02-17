# -----------------------------------------------------------------------------
# Copyright (c) 2017, Minor Gordon
# All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions
# are met:
#
#     * Redistributions of source code must retain the above copyright
#       notice, this list of conditions and the following disclaimer.
#
#     * Redistributions in binary form must reproduce the above copyright
#       notice, this list of conditions and the following disclaimer in
#       the documentation and/or other materials provided with the
#       distribution.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
# CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
# INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
# MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
# CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
# SPECIAL, EXEMPLARY, OR CONSEQUENTIAL  DAMAGES (INCLUDING,
# BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
# INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
# LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
# (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
# OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
# OF SUCH DAMAGE.
# -----------------------------------------------------------------------------

from decimal import Decimal
from ..protocol._input_protocol import _InputProtocol
from ..protocol.type import Type


class _AbstractInputProtocol(_InputProtocol):
    @classmethod
    def infer_type(cls, value):
        if value is None:
            return Type.VOID_
        elif isinstance(value, Decimal):
            return Type.DOUBLE
        elif isinstance(value, dict):
            return Type.MAP
        elif isinstance(value, float):
            return Type.DOUBLE
        elif isinstance(value, frozenset):
            return Type.SET
        elif isinstance(value, int):
            return Type.I32
        elif isinstance(value, (list, tuple)):
            return Type.LIST
        elif isinstance(value, long):
            return Type.I64
        elif isinstance(value, basestring):
            return Type.STRING
        elif hasattr(value, 'write'):
            return Type.STRUCT
        else:
            raise TypeError(type(value))

    def read_binary(self):
        return self.read_string()

    def read_byte(self):
        return self.read_i16()

    def read_decimal(self):
        return Decimal(self.read_string())

    def read_float(self):
        return self.read_double()

    def read_i16(self):
        return self.read_i32()

    def read_list_end(self):
        pass

    def read_set_begin(self):
        return self.read_list_begin()

    def read_set_end(self):
        return self.read_list_end()

    def read_struct_end(self):
        pass

    def read_u32(self):
        value = self.read_i32()
        if value < 0:
            raise ValueError('u32 value is < 0')
        return value

    def read_u64(self):
        value = self.read_i64()
        if value < 0:
            raise ValueError('u64 value is < 0')
        return value

