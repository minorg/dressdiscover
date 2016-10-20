from urlparse import urlparse
import base64
import dressdiscover.api.models.user.user
import dressdiscover.api.models.user.user_entry
import dressdiscover.api.services.io_exception  # @UnusedImport
import dressdiscover.api.services.user.no_such_user_exception  # @UnusedImport
import dressdiscover.api.services.user.user_query_service
import json
import thryft.protocol.json_input_protocol
import thryft.protocol.json_output_protocol
import urllib2


class UserQueryServiceJsonRpcClient(dressdiscover.api.services.user.user_query_service.UserQueryService):
    def __init__(self, api_url, headers=None):
        dressdiscover.api.services.user.user_query_service.UserQueryService.__init__(self)

        if headers is None:
            headers = {}
        else:
            if not isinstance(headers, dict):
                raise TypeError(headers)
            headers = headers.copy()

        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/user_query'):
            api_url += '/jsonrpc/user_query'
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
                        data_iprot = thryft.protocol.json_input_protocol.JsonInputProtocol(data)
                        exception_ = exception_class.read(data_iprot)
                        raise exception_
                    else:
                        raise exception_class()

            raise RuntimeError("JSON-RPC error: code=%s, message='%s'" % (code, message))

        return response.get('result')

    def _get_user_bookmarks_by_user_id(
        self,
        user_id,
        object_ids_only,
    ):
        oprot = thryft.protocol.json_output_protocol.JsonOutputProtocol()
        oprot.write_struct_begin()
        oprot.write_field_begin(name='user_id', type=11, id=None)
        oprot.write_string(user_id)
        oprot.write_field_end()
        if object_ids_only is not None:
            oprot.write_field_begin(name='object_ids_only', type=2, id=None)
            oprot.write_bool(object_ids_only)
            oprot.write_field_end()
        oprot.write_struct_end()

        return_value = self.__request(method='get_user_bookmarks_by_user_id', params=oprot.value)
        iprot = thryft.protocol.json_input_protocol.JsonInputProtocol(return_value)
        return tuple([dressdiscover.api.models.user.user_bookmark_entry.UserBookmarkEntry.read(iprot) for _ in xrange(iprot.read_list_begin()[1])] + (iprot.read_list_end() is None and []))

    def _get_user_by_email_address(
        self,
        email_address,
    ):
        oprot = thryft.protocol.json_output_protocol.JsonOutputProtocol()
        oprot.write_struct_begin()
        oprot.write_field_begin(name='email_address', type=11, id=None)
        oprot.write_string(email_address)
        oprot.write_field_end()
        oprot.write_struct_end()

        return_value = self.__request(method='get_user_by_email_address', params=oprot.value)
        iprot = thryft.protocol.json_input_protocol.JsonInputProtocol(return_value)
        return dressdiscover.api.models.user.user_entry.UserEntry.read(iprot)

    def _get_user_by_id(
        self,
        id,  # @ReservedAssignment
    ):
        oprot = thryft.protocol.json_output_protocol.JsonOutputProtocol()
        oprot.write_struct_begin()
        oprot.write_field_begin(name='id', type=11, id=None)
        oprot.write_string(id)
        oprot.write_field_end()
        oprot.write_struct_end()

        return_value = self.__request(method='get_user_by_id', params=oprot.value)
        iprot = thryft.protocol.json_input_protocol.JsonInputProtocol(return_value)
        return dressdiscover.api.models.user.user.User.read(iprot)
