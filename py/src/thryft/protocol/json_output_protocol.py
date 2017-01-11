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

try:
    import json
except ImportError:
    import simplejson as json  # @UnusedImport
from time import mktime

from ..protocol.builtins_output_protocol import BuiltinsOutputProtocol


class JsonOutputProtocol(BuiltinsOutputProtocol):
    class _JsonOutputProtocol(object):
        def write_date_time(self, value):
            try:
                self._write_value(long(mktime(value.timetuple())) * 1000l)
            except (OverflowError, ValueError):
                self._write_value(value.isoformat())

    class _ListOutputProtocol(BuiltinsOutputProtocol._ListOutputProtocol, _JsonOutputProtocol):
        def write_date_time(self, value):
            JsonOutputProtocol._JsonOutputProtocol.write_date_time(self, value)

    class _MapOutputProtocol(BuiltinsOutputProtocol._MapOutputProtocol, _JsonOutputProtocol):
        def write_date_time(self, value):
            JsonOutputProtocol._JsonOutputProtocol.write_date_time(self, value)

    class _RootOutputProtocol(BuiltinsOutputProtocol._RootOutputProtocol, _JsonOutputProtocol):
        def write_date_time(self, value):
            JsonOutputProtocol._JsonOutputProtocol.write_date_time(self, value)

    class _StructOutputProtocol(BuiltinsOutputProtocol._StructOutputProtocol, _JsonOutputProtocol):
        def write_date_time(self, value):
            JsonOutputProtocol._JsonOutputProtocol.write_date_time(self, value)

    def __str__(self):
        return json.dumps(self._output_protocol_stack[0].value)  # @UndefinedVariable
