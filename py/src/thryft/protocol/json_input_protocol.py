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

from datetime import datetime
from decimal import Decimal

from ..protocol.builtins_input_protocol import BuiltinsInputProtocol


try:
    import json
except ImportError:
    import simplejson as json  # @UnusedImport


class JsonInputProtocol(BuiltinsInputProtocol):
    class _JsonInputProtocol(object):
        def read_date_time(self):
            obj = self._read_value()
            if isinstance(obj, (int, long)):
                return datetime.fromtimestamp(obj / 1000.0)
            elif isinstance(obj, basestring):
                import iso8601
                return iso8601.parse_date(obj, default_timezone=None)
            else:
                raise TypeError(type(obj))

    class _ListInputProtocol(BuiltinsInputProtocol._ListInputProtocol, _JsonInputProtocol):
        def read_date_time(self):
            return JsonInputProtocol._JsonInputProtocol.read_date_time(self)

    class _MapInputProtocol(BuiltinsInputProtocol._MapInputProtocol, _JsonInputProtocol):
        def read_date_time(self):
            return JsonInputProtocol._JsonInputProtocol.read_date_time(self)

    class _RootInputProtocol(BuiltinsInputProtocol._RootInputProtocol, _JsonInputProtocol):
        def read_date_time(self):
            return JsonInputProtocol._JsonInputProtocol.read_date_time(self)

    class _StructInputProtocol(BuiltinsInputProtocol._StructInputProtocol, _JsonInputProtocol):
        def read_date_time(self):
            return JsonInputProtocol._JsonInputProtocol.read_date_time(self)

    def __init__(self, json):
        if isinstance(json, str):
            builtin_object = globals()['json'].loads(json, parse_float=Decimal, strict=False)  # @UndefinedVariable
        elif json is not None:
            builtin_object = json
        else:
            raise TypeError(type(json))
        BuiltinsInputProtocol.__init__(self, builtin_object)
