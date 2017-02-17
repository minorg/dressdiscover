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

from ..protocol.builtins_output_protocol import BuiltinsOutputProtocol
from urllib import urlencode


class StringMapOutputProtocol(BuiltinsOutputProtocol):
    def to_string_map(self):
        if len(self._output_protocol_stack) > 0:
            return self.__to_string_map(self._output_protocol_stack[0].value)
        else:
            return {}

    def __to_string_map(self, in_value, in_key=None, out_string_map=None):
        if in_key is not None:
            child_key_prefix = in_key + '.'
        else:
            child_key_prefix = ''
        if out_string_map is None:
            out_string_map = {}
        if isinstance(in_value, dict):
            for child_key, child_value in in_value.iteritems():
                self.__to_string_map(child_value, child_key_prefix + child_key, out_string_map)
        elif isinstance(in_value, (list, tuple)):
            for child_key, child_value in enumerate(in_value):
                self.__to_string_map(child_value, child_key_prefix + str(child_key), out_string_map)
        else:
            out_string_map[in_key] = str(in_value)
        return out_string_map

    def __str__(self):
        return urlencode(self.to_string_map(), True)
