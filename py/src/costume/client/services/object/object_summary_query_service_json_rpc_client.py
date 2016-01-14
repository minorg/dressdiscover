from urlparse import urlparse
import base64
import costume.api.services.io_exception  # @UnusedImport
import costume.api.services.object.get_object_summaries_result
import costume.api.services.object.object_summary_query_service
import json
import thryft.protocol.json_input_protocol
import thryft.protocol.json_output_protocol
import urllib2


class ObjectSummaryQueryServiceJsonRpcClient(costume.api.services.object.object_summary_query_service.ObjectSummaryQueryService):
    def __init__(self, api_url, headers=None):
        costume.api.services.object.object_summary_query_service.ObjectSummaryQueryService.__init__(self)

        if headers is None:
            headers = {}
        else:
            if not isinstance(headers, dict):
                raise TypeError(headers)
            headers = headers.copy()

        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/object_summary_query'):
            api_url += '/jsonrpc/object_summary_query'
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

    def _get_object_summaries(
        self,
        options,
        query,
    ):
        oprot = thryft.protocol.json_output_protocol.JsonOutputProtocol()
        oprot.write_struct_begin()
        if options is not None:
            oprot.write_field_begin(name='options', type=12, id=None)
            options.write(oprot)
            oprot.write_field_end()
        if query is not None:
            oprot.write_field_begin(name='query', type=12, id=None)
            query.write(oprot)
            oprot.write_field_end()
        oprot.write_struct_end()

        return_value = self.__request(method='get_object_summaries', params=oprot.value)
        iprot = thryft.protocol.json_input_protocol.JsonInputProtocol(return_value)
        return costume.api.services.object.get_object_summaries_result.GetObjectSummariesResult.read(iprot)
