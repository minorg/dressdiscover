from urlparse import urlparse
import base64
import costume.api.services.io_exception  # @UnusedImport
import costume.api.services.object.object_command_service
import json
import thryft.protocol.builtins_input_protocol
import thryft.protocol.builtins_output_protocol
import urllib2


class ObjectCommandServiceJsonRpcClient(costume.api.services.object.object_command_service.ObjectCommandService):
    def __init__(self, api_url, headers=None):
        costume.api.services.object.object_command_service.ObjectCommandService.__init__(self)

        if headers is None:
            headers = {}
        else:
            if not isinstance(headers, dict):
                raise TypeError(headers)
            headers = headers.copy()

        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/object_command'):
            api_url += '/jsonrpc/object_command'
        self.__api_url = api_url.rstrip('/')
        parsed_api_url = urlparse(api_url)
        parsed_api_url_netloc = parsed_api_url.netloc.split('@', 1)
        if len(parsed_api_url_netloc) == 2:
            username_password = parsed_api_url_netloc[0].split(':', 1)
            if len(username_password) == 2:
                username, password = username_password
                netloc = parsed_api_url_netloc[1]
                headers['Authorization'] = \
                    'Basic ' + \
                        base64.b64encode(
                            "%s:%s" % (
                                username,
                                password
                            )
                        )
                self.__api_url = \
                    parsed_api_url.scheme + '://' + netloc + \
                        parsed_api_url.path + \
                        parsed_api_url.query

        self.__headers = headers

        self.__next_id = 1

    def __request(self, method, params, headers=None):
        request = {'jsonrpc': '2.0', 'method': method, 'params': params}
        request['id'] = id(request)
        request_json = json.dumps(request)

        if headers is not None:
            headers = headers.copy()
            headers.update(self.__headers)
        else:
            headers = self.__headers

        http_request = urllib2.Request(self.__api_url, request_json, headers)
        http_request.get_method = lambda: 'POST'

        http_response = urllib2.urlopen(http_request)

        response_json = []
        while True:
            response_datum = http_response.read()
            if len(response_datum) == 0:
                break
            response_json.append(response_datum)
        response_json = ''.join(response_json)

        response = json.loads(response_json)
        if str(response.get('id')) != str(request['id']):
            raise RuntimeError("JSON-RPC: mismatched id: got %s, expected %s" % (response.get('id'), request['id']))
        if response.get('jsonrpc') != '2.0':
            raise RuntimeError("JSON-RPC: unexpected version: " + str(response.get('jsonrpc')))

        error = response.get('error')
        if error is not None:
            code = error.get('code')
            if code is None:
                raise RuntimeError("JSON-RPC: error response is missing code")
            message = error.get('message')
            if message is None:
                raise RuntimeError("JSON-RPC: error response is missing message")

            exception_class_qname = error.get('@class')
            if exception_class_qname is not None:
                try:
                    exception_class = None
                    for exception_class_qname_component in exception_class_qname.split('.'):
                        if exception_class is None:
                            exception_class = globals()[exception_class_qname_component]
                        else:
                            exception_class = getattr(exception_class, exception_class_qname_component)
                except (AttributeError, KeyError):
                    exception_class = None

                if exception_class is not None and issubclass(exception_class, Exception):
                    data = error.get('data')
                    if isinstance(data, dict):
                        data_iprot = thryft.protocol.builtins_input_protocol.BuiltinsInputProtocol(data)
                        exception_ = exception_class.read(data_iprot)
                        raise exception_
                    else:
                        raise exception_class()

            raise RuntimeError("JSON-RPC error: code=%s, message='%s'" % (code, message))

        return response.get('result')

    def _delete_objects(
        self,
    ):
        self.__request(method='delete_objects', params={})

    def _delete_objects_by_collection_id(
        self,
        collection_id,
    ):
        oprot = thryft.protocol.builtins_output_protocol.BuiltinsOutputProtocol()
        oprot.write_struct_begin()
        oprot.write_field_begin(name='collection_id', type=11, id=None)
        oprot.write_string(collection_id)
        oprot.write_field_end()
        oprot.write_struct_end()

        self.__request(method='delete_objects_by_collection_id', params=oprot.value)

    def _delete_objects_by_institution_id(
        self,
        institution_id,
    ):
        oprot = thryft.protocol.builtins_output_protocol.BuiltinsOutputProtocol()
        oprot.write_struct_begin()
        oprot.write_field_begin(name='institution_id', type=11, id=None)
        oprot.write_string(institution_id)
        oprot.write_field_end()
        oprot.write_struct_end()

        self.__request(method='delete_objects_by_institution_id', params=oprot.value)

    def _put_object(
        self,
        id,  # @ReservedAssignment
        object,  # @ReservedAssignment
    ):
        oprot = thryft.protocol.builtins_output_protocol.BuiltinsOutputProtocol()
        oprot.write_struct_begin()
        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(id)
        oprot.write_field_end()
        oprot.write_field_begin(name='object', type=12, id=None)
        object.write(oprot)
        oprot.write_field_end()
        oprot.write_struct_end()

        self.__request(method='put_object', params=oprot.value)

    def _put_objects(
        self,
        objects,
    ):
        oprot = thryft.protocol.builtins_output_protocol.BuiltinsOutputProtocol()
        oprot.write_struct_begin()
        oprot.write_field_begin(name='objects', type=15, id=None)
        oprot.write_list_begin(12, len(objects))
        for _0 in objects:
            _0.write(oprot)
        oprot.write_list_end()
        oprot.write_field_end()
        oprot.write_struct_end()

        self.__request(method='put_objects', params=oprot.value)

