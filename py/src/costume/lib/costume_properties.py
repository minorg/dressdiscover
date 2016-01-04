import __builtin__
import os.path


class CostumeProperties(object):
    class Builder(object):
        def __init__(
            self,
            api_url="http://middleware:8082/api/",
            environment=None,
            elastic_search_host="elasticsearch",
            elastic_search_port=9300,
            home_directory_path=None,
            object_summaries_result_cache_size=1024,
            object_summary_cache_size=1024,
            logback_xml_file_path=None,
        ):
            '''
            :type api_url: str
            :type environment: str
            :type elastic_search_host: str
            :type elastic_search_port: int
            :type home_directory_path: str
            :type object_summaries_result_cache_size: int
            :type object_summary_cache_size: int
            :type logback_xml_file_path: str or None
            '''

            self.__api_url = api_url
            self.__environment = environment
            self.__elastic_search_host = elastic_search_host
            self.__elastic_search_port = elastic_search_port
            self.__home_directory_path = home_directory_path
            self.__object_summaries_result_cache_size = object_summaries_result_cache_size
            self.__object_summary_cache_size = object_summary_cache_size
            self.__logback_xml_file_path = logback_xml_file_path

        def build(self):
            return CostumeProperties(api_url=self.__api_url, environment=self.__environment, elastic_search_host=self.__elastic_search_host, elastic_search_port=self.__elastic_search_port, home_directory_path=self.__home_directory_path, object_summaries_result_cache_size=self.__object_summaries_result_cache_size, object_summary_cache_size=self.__object_summary_cache_size, logback_xml_file_path=self.__logback_xml_file_path)

        @property
        def api_url(self):
            '''
            :rtype: str
            '''

            return self.__api_url

        @property
        def elastic_search_host(self):
            '''
            :rtype: str
            '''

            return self.__elastic_search_host

        @property
        def elastic_search_port(self):
            '''
            :rtype: int
            '''

            return self.__elastic_search_port

        @property
        def environment(self):
            '''
            :rtype: str
            '''

            return self.__environment

        @property
        def home_directory_path(self):
            '''
            :rtype: str
            '''

            return self.__home_directory_path

        @property
        def logback_xml_file_path(self):
            '''
            :rtype: str
            '''

            return self.__logback_xml_file_path

        @property
        def object_summaries_result_cache_size(self):
            '''
            :rtype: int
            '''

            return self.__object_summaries_result_cache_size

        @property
        def object_summary_cache_size(self):
            '''
            :rtype: int
            '''

            return self.__object_summary_cache_size

        def set_api_url(self, api_url):
            '''
            :type api_url: str
            '''

            self.__api_url = api_url
            return self

        def set_elastic_search_host(self, elastic_search_host):
            '''
            :type elastic_search_host: str
            '''

            self.__elastic_search_host = elastic_search_host
            return self

        def set_elastic_search_port(self, elastic_search_port):
            '''
            :type elastic_search_port: int
            '''

            self.__elastic_search_port = elastic_search_port
            return self

        def set_environment(self, environment):
            '''
            :type environment: str
            '''

            self.__environment = environment
            return self

        def set_home_directory_path(self, home_directory_path):
            '''
            :type home_directory_path: str
            '''

            self.__home_directory_path = home_directory_path
            return self

        def set_logback_xml_file_path(self, logback_xml_file_path):
            '''
            :type logback_xml_file_path: str or None
            '''

            self.__logback_xml_file_path = logback_xml_file_path
            return self

        def set_object_summaries_result_cache_size(self, object_summaries_result_cache_size):
            '''
            :type object_summaries_result_cache_size: int
            '''

            self.__object_summaries_result_cache_size = object_summaries_result_cache_size
            return self

        def set_object_summary_cache_size(self, object_summary_cache_size):
            '''
            :type object_summary_cache_size: int
            '''

            self.__object_summary_cache_size = object_summary_cache_size
            return self

        def update(self, costume_properties):
            '''
            :type api_url: str
            :type environment: str
            :type elastic_search_host: str
            :type elastic_search_port: int
            :type home_directory_path: str
            :type object_summaries_result_cache_size: int
            :type object_summary_cache_size: int
            :type logback_xml_file_path: str or None
            '''

            if isinstance(costume_properties, CostumeProperties):
                self.set_api_url(costume_properties.api_url)
                self.set_environment(costume_properties.environment)
                self.set_elastic_search_host(costume_properties.elastic_search_host)
                self.set_elastic_search_port(costume_properties.elastic_search_port)
                self.set_home_directory_path(costume_properties.home_directory_path)
                self.set_object_summaries_result_cache_size(costume_properties.object_summaries_result_cache_size)
                self.set_object_summary_cache_size(costume_properties.object_summary_cache_size)
                self.set_logback_xml_file_path(costume_properties.logback_xml_file_path)
            elif isinstance(costume_properties, dict):
                for key, value in costume_properties.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(costume_properties)
            return self

        @api_url.setter
        def api_url(self, api_url):
            '''
            :type api_url: str
            '''

            self.set_api_url(api_url)

        @elastic_search_host.setter
        def elastic_search_host(self, elastic_search_host):
            '''
            :type elastic_search_host: str
            '''

            self.set_elastic_search_host(elastic_search_host)

        @elastic_search_port.setter
        def elastic_search_port(self, elastic_search_port):
            '''
            :type elastic_search_port: int
            '''

            self.set_elastic_search_port(elastic_search_port)

        @environment.setter
        def environment(self, environment):
            '''
            :type environment: str
            '''

            self.set_environment(environment)

        @home_directory_path.setter
        def home_directory_path(self, home_directory_path):
            '''
            :type home_directory_path: str
            '''

            self.set_home_directory_path(home_directory_path)

        @logback_xml_file_path.setter
        def logback_xml_file_path(self, logback_xml_file_path):
            '''
            :type logback_xml_file_path: str or None
            '''

            self.set_logback_xml_file_path(logback_xml_file_path)

        @object_summaries_result_cache_size.setter
        def object_summaries_result_cache_size(self, object_summaries_result_cache_size):
            '''
            :type object_summaries_result_cache_size: int
            '''

            self.set_object_summaries_result_cache_size(object_summaries_result_cache_size)

        @object_summary_cache_size.setter
        def object_summary_cache_size(self, object_summary_cache_size):
            '''
            :type object_summary_cache_size: int
            '''

            self.set_object_summary_cache_size(object_summary_cache_size)

    def __init__(
        self,
        environment,
        home_directory_path,
        api_url="http://middleware:8082/api/",
        elastic_search_host="elasticsearch",
        elastic_search_port=9300,
        object_summaries_result_cache_size=1024,
        object_summary_cache_size=1024,
        logback_xml_file_path=None,
    ):
        '''
        :type api_url: str
        :type environment: str
        :type elastic_search_host: str
        :type elastic_search_port: int
        :type home_directory_path: str
        :type object_summaries_result_cache_size: int
        :type object_summary_cache_size: int
        :type logback_xml_file_path: str or None
        '''

        if api_url is None:
            raise ValueError('api_url is required')
        if not isinstance(api_url, basestring):
            raise TypeError("expected api_url to be a str but it is a %s" % getattr(__builtin__, 'type')(api_url))
        self.__api_url = api_url

        if environment is None:
            raise ValueError('environment is required')
        if not isinstance(environment, basestring):
            raise TypeError("expected environment to be a str but it is a %s" % getattr(__builtin__, 'type')(environment))
        self.__environment = environment

        if elastic_search_host is None:
            raise ValueError('elastic_search_host is required')
        if not isinstance(elastic_search_host, basestring):
            raise TypeError("expected elastic_search_host to be a str but it is a %s" % getattr(__builtin__, 'type')(elastic_search_host))
        self.__elastic_search_host = elastic_search_host

        if elastic_search_port is None:
            raise ValueError('elastic_search_port is required')
        if not isinstance(elastic_search_port, (int, long)) and elastic_search_port >= 0:
            raise TypeError("expected elastic_search_port to be a int but it is a %s" % getattr(__builtin__, 'type')(elastic_search_port))
        self.__elastic_search_port = elastic_search_port

        if home_directory_path is None:
            raise ValueError('home_directory_path is required')
        if not isinstance(home_directory_path, basestring):
            raise TypeError("expected home_directory_path to be a str but it is a %s" % getattr(__builtin__, 'type')(home_directory_path))
        self.__home_directory_path = home_directory_path

        if object_summaries_result_cache_size is None:
            raise ValueError('object_summaries_result_cache_size is required')
        if not isinstance(object_summaries_result_cache_size, (int, long)) and object_summaries_result_cache_size >= 0:
            raise TypeError("expected object_summaries_result_cache_size to be a int but it is a %s" % getattr(__builtin__, 'type')(object_summaries_result_cache_size))
        self.__object_summaries_result_cache_size = object_summaries_result_cache_size

        if object_summary_cache_size is None:
            raise ValueError('object_summary_cache_size is required')
        if not isinstance(object_summary_cache_size, (int, long)) and object_summary_cache_size >= 0:
            raise TypeError("expected object_summary_cache_size to be a int but it is a %s" % getattr(__builtin__, 'type')(object_summary_cache_size))
        self.__object_summary_cache_size = object_summary_cache_size

        if logback_xml_file_path is not None:
            if not isinstance(logback_xml_file_path, basestring):
                raise TypeError("expected logback_xml_file_path to be a str but it is a %s" % getattr(__builtin__, 'type')(logback_xml_file_path))
        self.__logback_xml_file_path = logback_xml_file_path

    def __eq__(self, other):
        if self.api_url != other.api_url:
            return False
        if self.environment != other.environment:
            return False
        if self.elastic_search_host != other.elastic_search_host:
            return False
        if self.elastic_search_port != other.elastic_search_port:
            return False
        if self.home_directory_path != other.home_directory_path:
            return False
        if self.object_summaries_result_cache_size != other.object_summaries_result_cache_size:
            return False
        if self.object_summary_cache_size != other.object_summary_cache_size:
            return False
        if self.logback_xml_file_path != other.logback_xml_file_path:
            return False
        return True

    def __hash__(self):
        return hash((self.api_url,self.environment,self.elastic_search_host,self.elastic_search_port,self.home_directory_path,self.object_summaries_result_cache_size,self.object_summary_cache_size,self.logback_xml_file_path,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('api_url=' + "'" + self.api_url.encode('ascii', 'replace') + "'")
        field_reprs.append('environment=' + "'" + self.environment.encode('ascii', 'replace') + "'")
        field_reprs.append('elastic_search_host=' + "'" + self.elastic_search_host.encode('ascii', 'replace') + "'")
        field_reprs.append('elastic_search_port=' + repr(self.elastic_search_port))
        field_reprs.append('home_directory_path=' + "'" + self.home_directory_path.encode('ascii', 'replace') + "'")
        field_reprs.append('object_summaries_result_cache_size=' + repr(self.object_summaries_result_cache_size))
        field_reprs.append('object_summary_cache_size=' + repr(self.object_summary_cache_size))
        if self.logback_xml_file_path is not None:
            field_reprs.append('logback_xml_file_path=' + "'" + self.logback_xml_file_path.encode('ascii', 'replace') + "'")
        return 'CostumeProperties(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('api_url=' + "'" + self.api_url.encode('ascii', 'replace') + "'")
        field_reprs.append('environment=' + "'" + self.environment.encode('ascii', 'replace') + "'")
        field_reprs.append('elastic_search_host=' + "'" + self.elastic_search_host.encode('ascii', 'replace') + "'")
        field_reprs.append('elastic_search_port=' + repr(self.elastic_search_port))
        field_reprs.append('home_directory_path=' + "'" + self.home_directory_path.encode('ascii', 'replace') + "'")
        field_reprs.append('object_summaries_result_cache_size=' + repr(self.object_summaries_result_cache_size))
        field_reprs.append('object_summary_cache_size=' + repr(self.object_summary_cache_size))
        if self.logback_xml_file_path is not None:
            field_reprs.append('logback_xml_file_path=' + "'" + self.logback_xml_file_path.encode('ascii', 'replace') + "'")
        return 'CostumeProperties(' + ', '.join(field_reprs) + ')'

    @property
    def api_url(self):
        '''
        :rtype: str
        '''

        return self.__api_url

    def as_dict(self):
        '''
        Return the fields of this object as a dictionary.

        :rtype: dict
        '''

        return {'api_url': self.api_url, 'environment': self.environment, 'elastic_search_host': self.elastic_search_host, 'elastic_search_port': self.elastic_search_port, 'home_directory_path': self.home_directory_path, 'object_summaries_result_cache_size': self.object_summaries_result_cache_size, 'object_summary_cache_size': self.object_summary_cache_size, 'logback_xml_file_path': self.logback_xml_file_path}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.api_url, self.environment, self.elastic_search_host, self.elastic_search_port, self.home_directory_path, self.object_summaries_result_cache_size, self.object_summary_cache_size, self.logback_xml_file_path,)

    @property
    def elastic_search_host(self):
        '''
        :rtype: str
        '''

        return self.__elastic_search_host

    @property
    def elastic_search_port(self):
        '''
        :rtype: int
        '''

        return self.__elastic_search_port

    @property
    def environment(self):
        '''
        :rtype: str
        '''

        return self.__environment

    @property
    def home_directory_path(self):
        '''
        :rtype: str
        '''

        return self.__home_directory_path

    @classmethod
    def load(cls, command_line_properties_file_path=None):
        '''
        Load properties, in order of precedence, from one of four places:
        1 - Those specified on the command line via the --properties option
        1 - The user's home directory: ~/.costume/costume.properties
        2 - The system properties file: /etc/costume/server.properties
        3 - Environment variables (COSTUME_{property_name_upper})
        '''

        properties = {}

        for property_name in ('api_url', 'environment', 'elastic_search_host', 'elastic_search_port', 'home_directory_path', 'object_summaries_result_cache_size', 'object_summary_cache_size', 'logback_xml_file_path',):
            property_value = os.getenv('COSTUME_' + property_name.upper())
            if property_value is not None and len(property_value) > 0:
                properties[property_name] = property_value

        properties_file_paths = []
        properties_file_paths.append(os.path.join('/', 'etc', 'costume', 'costume.properties'))
        properties_file_paths.append(os.path.join(os.path.expanduser('~'), '.costume', 'costume.properties'))
        if command_line_properties_file_path is not None:
            properties_file_paths.append(command_line_properties_file_path)
        for properties_file_path in properties_file_paths:
            if not os.path.isfile(properties_file_path):
                continue
            try:
                with open(properties_file_path, 'r') as properties_file:
                    for line in properties_file.readlines():
                        line = line.strip()
                        if len(line) == 0:
                            continue
                        property_name, property_value = line.split('=', 1)
                        property_name = property_name.strip()
                        property_value = property_value.strip().replace("\:", ':')
                        properties[property_name] = property_value
            except IOError:
                raise IOError("failed to load properties file %s" % properties_file_path)

        if 'elastic_search_port' in properties:
            properties['elastic_search_port'] = int(properties['elastic_search_port'])

        if 'object_summaries_result_cache_size' in properties:
            properties['object_summaries_result_cache_size'] = int(properties['object_summaries_result_cache_size'])

        if 'object_summary_cache_size' in properties:
            properties['object_summary_cache_size'] = int(properties['object_summary_cache_size'])

        return cls(**properties)

    @property
    def logback_xml_file_path(self):
        '''
        :rtype: str
        '''

        return self.__logback_xml_file_path

    @property
    def object_summaries_result_cache_size(self):
        '''
        :rtype: int
        '''

        return self.__object_summaries_result_cache_size

    @property
    def object_summary_cache_size(self):
        '''
        :rtype: int
        '''

        return self.__object_summary_cache_size

    @classmethod
    def read(cls, iprot):
        '''
        Read a new object from the given input protocol and return the object.

        :type iprot: thryft.protocol._input_protocol._InputProtocol
        :rtype: costume.lib.costume_properties.CostumeProperties
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'api_url':
                init_kwds['api_url'] = iprot.read_string()
            elif ifield_name == 'environment':
                init_kwds['environment'] = iprot.read_string()
            elif ifield_name == 'elastic_search_host':
                init_kwds['elastic_search_host'] = iprot.read_string()
            elif ifield_name == 'elastic_search_port':
                init_kwds['elastic_search_port'] = iprot.read_u32()
            elif ifield_name == 'home_directory_path':
                init_kwds['home_directory_path'] = iprot.read_string()
            elif ifield_name == 'object_summaries_result_cache_size':
                init_kwds['object_summaries_result_cache_size'] = iprot.read_u32()
            elif ifield_name == 'object_summary_cache_size':
                init_kwds['object_summary_cache_size'] = iprot.read_u32()
            elif ifield_name == 'logback_xml_file_path':
                try:
                    init_kwds['logback_xml_file_path'] = iprot.read_string()
                except (TypeError, ValueError,):
                    pass
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        api_url="http://middleware:8082/api/",
        environment=None,
        elastic_search_host="elasticsearch",
        elastic_search_port=9300,
        home_directory_path=None,
        object_summaries_result_cache_size=1024,
        object_summary_cache_size=1024,
        logback_xml_file_path=None,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type api_url: str or None
        :type environment: str or None
        :type elastic_search_host: str or None
        :type elastic_search_port: int or None
        :type home_directory_path: str or None
        :type object_summaries_result_cache_size: int or None
        :type object_summary_cache_size: int or None
        :type logback_xml_file_path: str or None
        :rtype: costume.lib.costume_properties.CostumeProperties
        '''

        if api_url is None:
            api_url = self.api_url
        if environment is None:
            environment = self.environment
        if elastic_search_host is None:
            elastic_search_host = self.elastic_search_host
        if elastic_search_port is None:
            elastic_search_port = self.elastic_search_port
        if home_directory_path is None:
            home_directory_path = self.home_directory_path
        if object_summaries_result_cache_size is None:
            object_summaries_result_cache_size = self.object_summaries_result_cache_size
        if object_summary_cache_size is None:
            object_summary_cache_size = self.object_summary_cache_size
        if logback_xml_file_path is None:
            logback_xml_file_path = self.logback_xml_file_path
        return self.__class__(api_url=api_url, environment=environment, elastic_search_host=elastic_search_host, elastic_search_port=elastic_search_port, home_directory_path=home_directory_path, object_summaries_result_cache_size=object_summaries_result_cache_size, object_summary_cache_size=object_summary_cache_size, logback_xml_file_path=logback_xml_file_path)

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: costume.lib.costume_properties.CostumeProperties
        '''

        oprot.write_struct_begin('CostumeProperties')

        oprot.write_field_begin(name='api_url', type=11, id=None)
        oprot.write_string(self.api_url)
        oprot.write_field_end()

        oprot.write_field_begin(name='environment', type=11, id=None)
        oprot.write_string(self.environment)
        oprot.write_field_end()

        oprot.write_field_begin(name='elastic_search_host', type=11, id=None)
        oprot.write_string(self.elastic_search_host)
        oprot.write_field_end()

        oprot.write_field_begin(name='elastic_search_port', type=8, id=None)
        oprot.write_u32(self.elastic_search_port)
        oprot.write_field_end()

        oprot.write_field_begin(name='home_directory_path', type=11, id=None)
        oprot.write_string(self.home_directory_path)
        oprot.write_field_end()

        oprot.write_field_begin(name='object_summaries_result_cache_size', type=8, id=None)
        oprot.write_u32(self.object_summaries_result_cache_size)
        oprot.write_field_end()

        oprot.write_field_begin(name='object_summary_cache_size', type=8, id=None)
        oprot.write_u32(self.object_summary_cache_size)
        oprot.write_field_end()

        if self.logback_xml_file_path is not None:
            oprot.write_field_begin(name='logback_xml_file_path', type=11, id=None)
            oprot.write_string(self.logback_xml_file_path)
            oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
