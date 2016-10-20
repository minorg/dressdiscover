import __builtin__
import os.path


class DressDiscoverProperties(object):
    class Builder(object):
        def __init__(
            self,
            api_url="http://middleware:8082/api/",
            cache_collections=True,
            cache_institutions=True,
            elastic_search_host="elasticsearch",
            elastic_search_port=9300,
            environment=None,
            google_api_key=None,
            google_oauth_key=None,
            google_oauth_secret=None,
            home_directory_path=None,
            object_summaries_result_cache_size=1024,
            object_summary_cache_size=1024,
            resummarize_objects_bulk_request_size=1000,
        ):
            '''
            :type api_url: str
            :type cache_collections: bool
            :type cache_institutions: bool
            :type elastic_search_host: str
            :type elastic_search_port: int
            :type environment: str
            :type google_api_key: str
            :type google_oauth_key: str
            :type google_oauth_secret: str
            :type home_directory_path: str
            :type object_summaries_result_cache_size: int
            :type object_summary_cache_size: int
            :type resummarize_objects_bulk_request_size: int
            '''

            self.__api_url = api_url
            self.__cache_collections = cache_collections
            self.__cache_institutions = cache_institutions
            self.__elastic_search_host = elastic_search_host
            self.__elastic_search_port = elastic_search_port
            self.__environment = environment
            self.__google_api_key = google_api_key
            self.__google_oauth_key = google_oauth_key
            self.__google_oauth_secret = google_oauth_secret
            self.__home_directory_path = home_directory_path
            self.__object_summaries_result_cache_size = object_summaries_result_cache_size
            self.__object_summary_cache_size = object_summary_cache_size
            self.__resummarize_objects_bulk_request_size = resummarize_objects_bulk_request_size

        def build(self):
            return DressDiscoverProperties(api_url=self.__api_url, cache_collections=self.__cache_collections, cache_institutions=self.__cache_institutions, elastic_search_host=self.__elastic_search_host, elastic_search_port=self.__elastic_search_port, environment=self.__environment, google_api_key=self.__google_api_key, google_oauth_key=self.__google_oauth_key, google_oauth_secret=self.__google_oauth_secret, home_directory_path=self.__home_directory_path, object_summaries_result_cache_size=self.__object_summaries_result_cache_size, object_summary_cache_size=self.__object_summary_cache_size, resummarize_objects_bulk_request_size=self.__resummarize_objects_bulk_request_size)

        @property
        def api_url(self):
            '''
            :rtype: str
            '''

            return self.__api_url

        @property
        def cache_collections(self):
            '''
            :rtype: bool
            '''

            return self.__cache_collections

        @property
        def cache_institutions(self):
            '''
            :rtype: bool
            '''

            return self.__cache_institutions

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
        def google_api_key(self):
            '''
            :rtype: str
            '''

            return self.__google_api_key

        @property
        def google_oauth_key(self):
            '''
            :rtype: str
            '''

            return self.__google_oauth_key

        @property
        def google_oauth_secret(self):
            '''
            :rtype: str
            '''

            return self.__google_oauth_secret

        @property
        def home_directory_path(self):
            '''
            :rtype: str
            '''

            return self.__home_directory_path

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

        @property
        def resummarize_objects_bulk_request_size(self):
            '''
            :rtype: int
            '''

            return self.__resummarize_objects_bulk_request_size

        def set_api_url(self, api_url):
            '''
            :type api_url: str
            '''

            if api_url is None:
                raise ValueError('api_url is required')
            if not isinstance(api_url, basestring):
                raise TypeError("expected api_url to be a str but it is a %s" % getattr(__builtin__, 'type')(api_url))
            self.__api_url = api_url
            return self

        def set_cache_collections(self, cache_collections):
            '''
            :type cache_collections: bool
            '''

            if cache_collections is None:
                raise ValueError('cache_collections is required')
            if not isinstance(cache_collections, bool):
                raise TypeError("expected cache_collections to be a bool but it is a %s" % getattr(__builtin__, 'type')(cache_collections))
            self.__cache_collections = cache_collections
            return self

        def set_cache_institutions(self, cache_institutions):
            '''
            :type cache_institutions: bool
            '''

            if cache_institutions is None:
                raise ValueError('cache_institutions is required')
            if not isinstance(cache_institutions, bool):
                raise TypeError("expected cache_institutions to be a bool but it is a %s" % getattr(__builtin__, 'type')(cache_institutions))
            self.__cache_institutions = cache_institutions
            return self

        def set_elastic_search_host(self, elastic_search_host):
            '''
            :type elastic_search_host: str
            '''

            if elastic_search_host is None:
                raise ValueError('elastic_search_host is required')
            if not isinstance(elastic_search_host, basestring):
                raise TypeError("expected elastic_search_host to be a str but it is a %s" % getattr(__builtin__, 'type')(elastic_search_host))
            self.__elastic_search_host = elastic_search_host
            return self

        def set_elastic_search_port(self, elastic_search_port):
            '''
            :type elastic_search_port: int
            '''

            if elastic_search_port is None:
                raise ValueError('elastic_search_port is required')
            if not isinstance(elastic_search_port, int):
                raise TypeError("expected elastic_search_port to be a int but it is a %s" % getattr(__builtin__, 'type')(elastic_search_port))
            self.__elastic_search_port = elastic_search_port
            return self

        def set_environment(self, environment):
            '''
            :type environment: str
            '''

            if environment is None:
                raise ValueError('environment is required')
            if not isinstance(environment, basestring):
                raise TypeError("expected environment to be a str but it is a %s" % getattr(__builtin__, 'type')(environment))
            self.__environment = environment
            return self

        def set_google_api_key(self, google_api_key):
            '''
            :type google_api_key: str
            '''

            if google_api_key is None:
                raise ValueError('google_api_key is required')
            if not isinstance(google_api_key, basestring):
                raise TypeError("expected google_api_key to be a str but it is a %s" % getattr(__builtin__, 'type')(google_api_key))
            if len(google_api_key) < 1:
                raise ValueError("expected len(google_api_key) to be >= 1, was %d" % len(google_api_key))
            self.__google_api_key = google_api_key
            return self

        def set_google_oauth_key(self, google_oauth_key):
            '''
            :type google_oauth_key: str
            '''

            if google_oauth_key is None:
                raise ValueError('google_oauth_key is required')
            if not isinstance(google_oauth_key, basestring):
                raise TypeError("expected google_oauth_key to be a str but it is a %s" % getattr(__builtin__, 'type')(google_oauth_key))
            if len(google_oauth_key) < 1:
                raise ValueError("expected len(google_oauth_key) to be >= 1, was %d" % len(google_oauth_key))
            self.__google_oauth_key = google_oauth_key
            return self

        def set_google_oauth_secret(self, google_oauth_secret):
            '''
            :type google_oauth_secret: str
            '''

            if google_oauth_secret is None:
                raise ValueError('google_oauth_secret is required')
            if not isinstance(google_oauth_secret, basestring):
                raise TypeError("expected google_oauth_secret to be a str but it is a %s" % getattr(__builtin__, 'type')(google_oauth_secret))
            if len(google_oauth_secret) < 1:
                raise ValueError("expected len(google_oauth_secret) to be >= 1, was %d" % len(google_oauth_secret))
            self.__google_oauth_secret = google_oauth_secret
            return self

        def set_home_directory_path(self, home_directory_path):
            '''
            :type home_directory_path: str
            '''

            if home_directory_path is None:
                raise ValueError('home_directory_path is required')
            if not isinstance(home_directory_path, basestring):
                raise TypeError("expected home_directory_path to be a str but it is a %s" % getattr(__builtin__, 'type')(home_directory_path))
            self.__home_directory_path = home_directory_path
            return self

        def set_object_summaries_result_cache_size(self, object_summaries_result_cache_size):
            '''
            :type object_summaries_result_cache_size: int
            '''

            if object_summaries_result_cache_size is None:
                raise ValueError('object_summaries_result_cache_size is required')
            if not isinstance(object_summaries_result_cache_size, int):
                raise TypeError("expected object_summaries_result_cache_size to be a int but it is a %s" % getattr(__builtin__, 'type')(object_summaries_result_cache_size))
            self.__object_summaries_result_cache_size = object_summaries_result_cache_size
            return self

        def set_object_summary_cache_size(self, object_summary_cache_size):
            '''
            :type object_summary_cache_size: int
            '''

            if object_summary_cache_size is None:
                raise ValueError('object_summary_cache_size is required')
            if not isinstance(object_summary_cache_size, int):
                raise TypeError("expected object_summary_cache_size to be a int but it is a %s" % getattr(__builtin__, 'type')(object_summary_cache_size))
            self.__object_summary_cache_size = object_summary_cache_size
            return self

        def set_resummarize_objects_bulk_request_size(self, resummarize_objects_bulk_request_size):
            '''
            :type resummarize_objects_bulk_request_size: int
            '''

            if resummarize_objects_bulk_request_size is None:
                raise ValueError('resummarize_objects_bulk_request_size is required')
            if not isinstance(resummarize_objects_bulk_request_size, int):
                raise TypeError("expected resummarize_objects_bulk_request_size to be a int but it is a %s" % getattr(__builtin__, 'type')(resummarize_objects_bulk_request_size))
            self.__resummarize_objects_bulk_request_size = resummarize_objects_bulk_request_size
            return self

        def update(self, dress_discover_properties):
            '''
            :type api_url: str
            :type cache_collections: bool
            :type cache_institutions: bool
            :type elastic_search_host: str
            :type elastic_search_port: int
            :type environment: str
            :type google_api_key: str
            :type google_oauth_key: str
            :type google_oauth_secret: str
            :type home_directory_path: str
            :type object_summaries_result_cache_size: int
            :type object_summary_cache_size: int
            :type resummarize_objects_bulk_request_size: int
            '''

            if isinstance(dress_discover_properties, DressDiscoverProperties):
                self.set_api_url(dress_discover_properties.api_url)
                self.set_cache_collections(dress_discover_properties.cache_collections)
                self.set_cache_institutions(dress_discover_properties.cache_institutions)
                self.set_elastic_search_host(dress_discover_properties.elastic_search_host)
                self.set_elastic_search_port(dress_discover_properties.elastic_search_port)
                self.set_environment(dress_discover_properties.environment)
                self.set_google_api_key(dress_discover_properties.google_api_key)
                self.set_google_oauth_key(dress_discover_properties.google_oauth_key)
                self.set_google_oauth_secret(dress_discover_properties.google_oauth_secret)
                self.set_home_directory_path(dress_discover_properties.home_directory_path)
                self.set_object_summaries_result_cache_size(dress_discover_properties.object_summaries_result_cache_size)
                self.set_object_summary_cache_size(dress_discover_properties.object_summary_cache_size)
                self.set_resummarize_objects_bulk_request_size(dress_discover_properties.resummarize_objects_bulk_request_size)
            elif isinstance(dress_discover_properties, dict):
                for key, value in dress_discover_properties.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(dress_discover_properties)
            return self

        @api_url.setter
        def api_url(self, api_url):
            '''
            :type api_url: str
            '''

            self.set_api_url(api_url)

        @cache_collections.setter
        def cache_collections(self, cache_collections):
            '''
            :type cache_collections: bool
            '''

            self.set_cache_collections(cache_collections)

        @cache_institutions.setter
        def cache_institutions(self, cache_institutions):
            '''
            :type cache_institutions: bool
            '''

            self.set_cache_institutions(cache_institutions)

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

        @google_api_key.setter
        def google_api_key(self, google_api_key):
            '''
            :type google_api_key: str
            '''

            self.set_google_api_key(google_api_key)

        @google_oauth_key.setter
        def google_oauth_key(self, google_oauth_key):
            '''
            :type google_oauth_key: str
            '''

            self.set_google_oauth_key(google_oauth_key)

        @google_oauth_secret.setter
        def google_oauth_secret(self, google_oauth_secret):
            '''
            :type google_oauth_secret: str
            '''

            self.set_google_oauth_secret(google_oauth_secret)

        @home_directory_path.setter
        def home_directory_path(self, home_directory_path):
            '''
            :type home_directory_path: str
            '''

            self.set_home_directory_path(home_directory_path)

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

        @resummarize_objects_bulk_request_size.setter
        def resummarize_objects_bulk_request_size(self, resummarize_objects_bulk_request_size):
            '''
            :type resummarize_objects_bulk_request_size: int
            '''

            self.set_resummarize_objects_bulk_request_size(resummarize_objects_bulk_request_size)

    class FieldMetadata(object):
        API_URL = None
        CACHE_COLLECTIONS = None
        CACHE_INSTITUTIONS = None
        ELASTIC_SEARCH_HOST = None
        ELASTIC_SEARCH_PORT = None
        ENVIRONMENT = None
        GOOGLE_API_KEY = None
        GOOGLE_OAUTH_KEY = None
        GOOGLE_OAUTH_SECRET = None
        HOME_DIRECTORY_PATH = None
        OBJECT_SUMMARIES_RESULT_CACHE_SIZE = None
        OBJECT_SUMMARY_CACHE_SIZE = None
        RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE = None

        def __init__(self, name, type_, validation):
            object.__init__(self)
            self.__name = name
            self.__type = type_
            self.__validation = validation

        def __repr__(self):
            return self.__name

        @property
        def type(self):
            return self.__type

        @property
        def validation(self):
            return self.__validation

        @classmethod
        def values(cls):
            return (cls.API_URL, cls.CACHE_COLLECTIONS, cls.CACHE_INSTITUTIONS, cls.ELASTIC_SEARCH_HOST, cls.ELASTIC_SEARCH_PORT, cls.ENVIRONMENT, cls.GOOGLE_API_KEY, cls.GOOGLE_OAUTH_KEY, cls.GOOGLE_OAUTH_SECRET, cls.HOME_DIRECTORY_PATH, cls.OBJECT_SUMMARIES_RESULT_CACHE_SIZE, cls.OBJECT_SUMMARY_CACHE_SIZE, cls.RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE,)

    FieldMetadata.API_URL = FieldMetadata('api_url', str, None)
    FieldMetadata.CACHE_COLLECTIONS = FieldMetadata('cache_collections', bool, None)
    FieldMetadata.CACHE_INSTITUTIONS = FieldMetadata('cache_institutions', bool, None)
    FieldMetadata.ELASTIC_SEARCH_HOST = FieldMetadata('elastic_search_host', str, None)
    FieldMetadata.ELASTIC_SEARCH_PORT = FieldMetadata('elastic_search_port', int, None)
    FieldMetadata.ENVIRONMENT = FieldMetadata('environment', str, None)
    FieldMetadata.GOOGLE_API_KEY = FieldMetadata('google_api_key', str, {u'minLength': 1})
    FieldMetadata.GOOGLE_OAUTH_KEY = FieldMetadata('google_oauth_key', str, {u'minLength': 1})
    FieldMetadata.GOOGLE_OAUTH_SECRET = FieldMetadata('google_oauth_secret', str, {u'minLength': 1})
    FieldMetadata.HOME_DIRECTORY_PATH = FieldMetadata('home_directory_path', str, None)
    FieldMetadata.OBJECT_SUMMARIES_RESULT_CACHE_SIZE = FieldMetadata('object_summaries_result_cache_size', int, None)
    FieldMetadata.OBJECT_SUMMARY_CACHE_SIZE = FieldMetadata('object_summary_cache_size', int, None)
    FieldMetadata.RESUMMARIZE_OBJECTS_BULK_REQUEST_SIZE = FieldMetadata('resummarize_objects_bulk_request_size', int, None)

    def __init__(
        self,
        environment,
        google_api_key,
        google_oauth_key,
        google_oauth_secret,
        home_directory_path,
        api_url="http://middleware:8082/api/",
        cache_collections=True,
        cache_institutions=True,
        elastic_search_host="elasticsearch",
        elastic_search_port=9300,
        object_summaries_result_cache_size=1024,
        object_summary_cache_size=1024,
        resummarize_objects_bulk_request_size=1000,
    ):
        '''
        :type api_url: str
        :type cache_collections: bool
        :type cache_institutions: bool
        :type elastic_search_host: str
        :type elastic_search_port: int
        :type environment: str
        :type google_api_key: str
        :type google_oauth_key: str
        :type google_oauth_secret: str
        :type home_directory_path: str
        :type object_summaries_result_cache_size: int
        :type object_summary_cache_size: int
        :type resummarize_objects_bulk_request_size: int
        '''

        if api_url is None:
            raise ValueError('api_url is required')
        if not isinstance(api_url, basestring):
            raise TypeError("expected api_url to be a str but it is a %s" % getattr(__builtin__, 'type')(api_url))
        self.__api_url = api_url

        if cache_collections is None:
            raise ValueError('cache_collections is required')
        if not isinstance(cache_collections, bool):
            raise TypeError("expected cache_collections to be a bool but it is a %s" % getattr(__builtin__, 'type')(cache_collections))
        self.__cache_collections = cache_collections

        if cache_institutions is None:
            raise ValueError('cache_institutions is required')
        if not isinstance(cache_institutions, bool):
            raise TypeError("expected cache_institutions to be a bool but it is a %s" % getattr(__builtin__, 'type')(cache_institutions))
        self.__cache_institutions = cache_institutions

        if elastic_search_host is None:
            raise ValueError('elastic_search_host is required')
        if not isinstance(elastic_search_host, basestring):
            raise TypeError("expected elastic_search_host to be a str but it is a %s" % getattr(__builtin__, 'type')(elastic_search_host))
        self.__elastic_search_host = elastic_search_host

        if elastic_search_port is None:
            raise ValueError('elastic_search_port is required')
        if not isinstance(elastic_search_port, int):
            raise TypeError("expected elastic_search_port to be a int but it is a %s" % getattr(__builtin__, 'type')(elastic_search_port))
        self.__elastic_search_port = elastic_search_port

        if environment is None:
            raise ValueError('environment is required')
        if not isinstance(environment, basestring):
            raise TypeError("expected environment to be a str but it is a %s" % getattr(__builtin__, 'type')(environment))
        self.__environment = environment

        if google_api_key is None:
            raise ValueError('google_api_key is required')
        if not isinstance(google_api_key, basestring):
            raise TypeError("expected google_api_key to be a str but it is a %s" % getattr(__builtin__, 'type')(google_api_key))
        if len(google_api_key) < 1:
            raise ValueError("expected len(google_api_key) to be >= 1, was %d" % len(google_api_key))
        self.__google_api_key = google_api_key

        if google_oauth_key is None:
            raise ValueError('google_oauth_key is required')
        if not isinstance(google_oauth_key, basestring):
            raise TypeError("expected google_oauth_key to be a str but it is a %s" % getattr(__builtin__, 'type')(google_oauth_key))
        if len(google_oauth_key) < 1:
            raise ValueError("expected len(google_oauth_key) to be >= 1, was %d" % len(google_oauth_key))
        self.__google_oauth_key = google_oauth_key

        if google_oauth_secret is None:
            raise ValueError('google_oauth_secret is required')
        if not isinstance(google_oauth_secret, basestring):
            raise TypeError("expected google_oauth_secret to be a str but it is a %s" % getattr(__builtin__, 'type')(google_oauth_secret))
        if len(google_oauth_secret) < 1:
            raise ValueError("expected len(google_oauth_secret) to be >= 1, was %d" % len(google_oauth_secret))
        self.__google_oauth_secret = google_oauth_secret

        if home_directory_path is None:
            raise ValueError('home_directory_path is required')
        if not isinstance(home_directory_path, basestring):
            raise TypeError("expected home_directory_path to be a str but it is a %s" % getattr(__builtin__, 'type')(home_directory_path))
        self.__home_directory_path = home_directory_path

        if object_summaries_result_cache_size is None:
            raise ValueError('object_summaries_result_cache_size is required')
        if not isinstance(object_summaries_result_cache_size, int):
            raise TypeError("expected object_summaries_result_cache_size to be a int but it is a %s" % getattr(__builtin__, 'type')(object_summaries_result_cache_size))
        self.__object_summaries_result_cache_size = object_summaries_result_cache_size

        if object_summary_cache_size is None:
            raise ValueError('object_summary_cache_size is required')
        if not isinstance(object_summary_cache_size, int):
            raise TypeError("expected object_summary_cache_size to be a int but it is a %s" % getattr(__builtin__, 'type')(object_summary_cache_size))
        self.__object_summary_cache_size = object_summary_cache_size

        if resummarize_objects_bulk_request_size is None:
            raise ValueError('resummarize_objects_bulk_request_size is required')
        if not isinstance(resummarize_objects_bulk_request_size, int):
            raise TypeError("expected resummarize_objects_bulk_request_size to be a int but it is a %s" % getattr(__builtin__, 'type')(resummarize_objects_bulk_request_size))
        self.__resummarize_objects_bulk_request_size = resummarize_objects_bulk_request_size

    def __eq__(self, other):
        if self.api_url != other.api_url:
            return False
        if self.cache_collections != other.cache_collections:
            return False
        if self.cache_institutions != other.cache_institutions:
            return False
        if self.elastic_search_host != other.elastic_search_host:
            return False
        if self.elastic_search_port != other.elastic_search_port:
            return False
        if self.environment != other.environment:
            return False
        if self.google_api_key != other.google_api_key:
            return False
        if self.google_oauth_key != other.google_oauth_key:
            return False
        if self.google_oauth_secret != other.google_oauth_secret:
            return False
        if self.home_directory_path != other.home_directory_path:
            return False
        if self.object_summaries_result_cache_size != other.object_summaries_result_cache_size:
            return False
        if self.object_summary_cache_size != other.object_summary_cache_size:
            return False
        if self.resummarize_objects_bulk_request_size != other.resummarize_objects_bulk_request_size:
            return False
        return True

    def __hash__(self):
        return hash((self.api_url,self.cache_collections,self.cache_institutions,self.elastic_search_host,self.elastic_search_port,self.environment,self.google_api_key,self.google_oauth_key,self.google_oauth_secret,self.home_directory_path,self.object_summaries_result_cache_size,self.object_summary_cache_size,self.resummarize_objects_bulk_request_size,))

    def __iter__(self):
        return iter(self.as_tuple())

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('api_url=' + "'" + self.api_url.encode('ascii', 'replace') + "'")
        field_reprs.append('cache_collections=' + repr(self.cache_collections))
        field_reprs.append('cache_institutions=' + repr(self.cache_institutions))
        field_reprs.append('elastic_search_host=' + "'" + self.elastic_search_host.encode('ascii', 'replace') + "'")
        field_reprs.append('elastic_search_port=' + repr(self.elastic_search_port))
        field_reprs.append('environment=' + "'" + self.environment.encode('ascii', 'replace') + "'")
        field_reprs.append('google_api_key=' + "'" + self.google_api_key.encode('ascii', 'replace') + "'")
        field_reprs.append('google_oauth_key=' + "'" + self.google_oauth_key.encode('ascii', 'replace') + "'")
        field_reprs.append('google_oauth_secret=' + "'" + self.google_oauth_secret.encode('ascii', 'replace') + "'")
        field_reprs.append('home_directory_path=' + "'" + self.home_directory_path.encode('ascii', 'replace') + "'")
        field_reprs.append('object_summaries_result_cache_size=' + repr(self.object_summaries_result_cache_size))
        field_reprs.append('object_summary_cache_size=' + repr(self.object_summary_cache_size))
        field_reprs.append('resummarize_objects_bulk_request_size=' + repr(self.resummarize_objects_bulk_request_size))
        return 'DressDiscoverProperties(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('api_url=' + "'" + self.api_url.encode('ascii', 'replace') + "'")
        field_reprs.append('cache_collections=' + repr(self.cache_collections))
        field_reprs.append('cache_institutions=' + repr(self.cache_institutions))
        field_reprs.append('elastic_search_host=' + "'" + self.elastic_search_host.encode('ascii', 'replace') + "'")
        field_reprs.append('elastic_search_port=' + repr(self.elastic_search_port))
        field_reprs.append('environment=' + "'" + self.environment.encode('ascii', 'replace') + "'")
        field_reprs.append('google_api_key=' + "'" + self.google_api_key.encode('ascii', 'replace') + "'")
        field_reprs.append('google_oauth_key=' + "'" + self.google_oauth_key.encode('ascii', 'replace') + "'")
        field_reprs.append('google_oauth_secret=' + "'" + self.google_oauth_secret.encode('ascii', 'replace') + "'")
        field_reprs.append('home_directory_path=' + "'" + self.home_directory_path.encode('ascii', 'replace') + "'")
        field_reprs.append('object_summaries_result_cache_size=' + repr(self.object_summaries_result_cache_size))
        field_reprs.append('object_summary_cache_size=' + repr(self.object_summary_cache_size))
        field_reprs.append('resummarize_objects_bulk_request_size=' + repr(self.resummarize_objects_bulk_request_size))
        return 'DressDiscoverProperties(' + ', '.join(field_reprs) + ')'

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

        return {'api_url': self.api_url, 'cache_collections': self.cache_collections, 'cache_institutions': self.cache_institutions, 'elastic_search_host': self.elastic_search_host, 'elastic_search_port': self.elastic_search_port, 'environment': self.environment, 'google_api_key': self.google_api_key, 'google_oauth_key': self.google_oauth_key, 'google_oauth_secret': self.google_oauth_secret, 'home_directory_path': self.home_directory_path, 'object_summaries_result_cache_size': self.object_summaries_result_cache_size, 'object_summary_cache_size': self.object_summary_cache_size, 'resummarize_objects_bulk_request_size': self.resummarize_objects_bulk_request_size}

    def as_tuple(self):
        '''
        Return the fields of this object in declaration order as a tuple.

        :rtype: tuple
        '''

        return (self.api_url, self.cache_collections, self.cache_institutions, self.elastic_search_host, self.elastic_search_port, self.environment, self.google_api_key, self.google_oauth_key, self.google_oauth_secret, self.home_directory_path, self.object_summaries_result_cache_size, self.object_summary_cache_size, self.resummarize_objects_bulk_request_size,)

    @property
    def cache_collections(self):
        '''
        :rtype: bool
        '''

        return self.__cache_collections

    @property
    def cache_institutions(self):
        '''
        :rtype: bool
        '''

        return self.__cache_institutions

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
    def google_api_key(self):
        '''
        :rtype: str
        '''

        return self.__google_api_key

    @property
    def google_oauth_key(self):
        '''
        :rtype: str
        '''

        return self.__google_oauth_key

    @property
    def google_oauth_secret(self):
        '''
        :rtype: str
        '''

        return self.__google_oauth_secret

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
        1 - The user's home directory: ~/.dressdiscover/dress_discover.properties
        2 - The system properties file: /etc/dressdiscover/server.properties
        3 - Environment variables (DRESSDISCOVER_{property_name_upper})
        '''

        properties = {}

        for property_name in ('api_url', 'cache_collections', 'cache_institutions', 'elastic_search_host', 'elastic_search_port', 'environment', 'google_api_key', 'google_oauth_key', 'google_oauth_secret', 'home_directory_path', 'object_summaries_result_cache_size', 'object_summary_cache_size', 'resummarize_objects_bulk_request_size',):
            property_value = os.getenv('DRESSDISCOVER_' + property_name.upper())
            if property_value is not None and len(property_value) > 0:
                properties[property_name] = property_value

        properties_file_paths = []
        properties_file_paths.append(os.path.join('/', 'etc', 'dressdiscover', 'dress_discover.properties'))
        properties_file_paths.append(os.path.join(os.path.expanduser('~'), '.dressdiscover', 'dress_discover.properties'))
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

        if 'cache_collections' in properties:
            properties['cache_collections'] = (properties['cache_collections'].lower() == 'true')

        if 'cache_institutions' in properties:
            properties['cache_institutions'] = (properties['cache_institutions'].lower() == 'true')

        if 'elastic_search_port' in properties:
            properties['elastic_search_port'] = int(properties['elastic_search_port'])

        if 'object_summaries_result_cache_size' in properties:
            properties['object_summaries_result_cache_size'] = int(properties['object_summaries_result_cache_size'])

        if 'object_summary_cache_size' in properties:
            properties['object_summary_cache_size'] = int(properties['object_summary_cache_size'])

        if 'resummarize_objects_bulk_request_size' in properties:
            properties['resummarize_objects_bulk_request_size'] = int(properties['resummarize_objects_bulk_request_size'])

        return cls(**properties)

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
        :rtype: dressdiscover.lib.dress_discover_properties.DressDiscoverProperties
        '''

        init_kwds = {}

        iprot.read_struct_begin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.read_field_begin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'api_url':
                init_kwds['api_url'] = iprot.read_string()
            elif ifield_name == 'cache_collections':
                init_kwds['cache_collections'] = iprot.read_bool()
            elif ifield_name == 'cache_institutions':
                init_kwds['cache_institutions'] = iprot.read_bool()
            elif ifield_name == 'elastic_search_host':
                init_kwds['elastic_search_host'] = iprot.read_string()
            elif ifield_name == 'elastic_search_port':
                init_kwds['elastic_search_port'] = iprot.read_i32()
            elif ifield_name == 'environment':
                init_kwds['environment'] = iprot.read_string()
            elif ifield_name == 'google_api_key':
                init_kwds['google_api_key'] = iprot.read_string()
            elif ifield_name == 'google_oauth_key':
                init_kwds['google_oauth_key'] = iprot.read_string()
            elif ifield_name == 'google_oauth_secret':
                init_kwds['google_oauth_secret'] = iprot.read_string()
            elif ifield_name == 'home_directory_path':
                init_kwds['home_directory_path'] = iprot.read_string()
            elif ifield_name == 'object_summaries_result_cache_size':
                init_kwds['object_summaries_result_cache_size'] = iprot.read_i32()
            elif ifield_name == 'object_summary_cache_size':
                init_kwds['object_summary_cache_size'] = iprot.read_i32()
            elif ifield_name == 'resummarize_objects_bulk_request_size':
                init_kwds['resummarize_objects_bulk_request_size'] = iprot.read_i32()
            iprot.read_field_end()
        iprot.read_struct_end()

        return cls(**init_kwds)

    def replace(
        self,
        api_url="http://middleware:8082/api/",
        cache_collections=True,
        cache_institutions=True,
        elastic_search_host="elasticsearch",
        elastic_search_port=9300,
        environment=None,
        google_api_key=None,
        google_oauth_key=None,
        google_oauth_secret=None,
        home_directory_path=None,
        object_summaries_result_cache_size=1024,
        object_summary_cache_size=1024,
        resummarize_objects_bulk_request_size=1000,
    ):
        '''
        Copy this object, replace one or more fields, and return the copy.

        :type api_url: str or None
        :type cache_collections: bool or None
        :type cache_institutions: bool or None
        :type elastic_search_host: str or None
        :type elastic_search_port: int or None
        :type environment: str or None
        :type google_api_key: str or None
        :type google_oauth_key: str or None
        :type google_oauth_secret: str or None
        :type home_directory_path: str or None
        :type object_summaries_result_cache_size: int or None
        :type object_summary_cache_size: int or None
        :type resummarize_objects_bulk_request_size: int or None
        :rtype: dressdiscover.lib.dress_discover_properties.DressDiscoverProperties
        '''

        if api_url is None:
            api_url = self.api_url
        if cache_collections is None:
            cache_collections = self.cache_collections
        if cache_institutions is None:
            cache_institutions = self.cache_institutions
        if elastic_search_host is None:
            elastic_search_host = self.elastic_search_host
        if elastic_search_port is None:
            elastic_search_port = self.elastic_search_port
        if environment is None:
            environment = self.environment
        if google_api_key is None:
            google_api_key = self.google_api_key
        if google_oauth_key is None:
            google_oauth_key = self.google_oauth_key
        if google_oauth_secret is None:
            google_oauth_secret = self.google_oauth_secret
        if home_directory_path is None:
            home_directory_path = self.home_directory_path
        if object_summaries_result_cache_size is None:
            object_summaries_result_cache_size = self.object_summaries_result_cache_size
        if object_summary_cache_size is None:
            object_summary_cache_size = self.object_summary_cache_size
        if resummarize_objects_bulk_request_size is None:
            resummarize_objects_bulk_request_size = self.resummarize_objects_bulk_request_size
        return self.__class__(api_url=api_url, cache_collections=cache_collections, cache_institutions=cache_institutions, elastic_search_host=elastic_search_host, elastic_search_port=elastic_search_port, environment=environment, google_api_key=google_api_key, google_oauth_key=google_oauth_key, google_oauth_secret=google_oauth_secret, home_directory_path=home_directory_path, object_summaries_result_cache_size=object_summaries_result_cache_size, object_summary_cache_size=object_summary_cache_size, resummarize_objects_bulk_request_size=resummarize_objects_bulk_request_size)

    @property
    def resummarize_objects_bulk_request_size(self):
        '''
        :rtype: int
        '''

        return self.__resummarize_objects_bulk_request_size

    def write(self, oprot):
        '''
        Write this object to the given output protocol and return self.

        :type oprot: thryft.protocol._output_protocol._OutputProtocol
        :rtype: dressdiscover.lib.dress_discover_properties.DressDiscoverProperties
        '''

        oprot.write_struct_begin('DressDiscoverProperties')

        oprot.write_field_begin(name='api_url', type=11, id=None)
        oprot.write_string(self.api_url)
        oprot.write_field_end()

        oprot.write_field_begin(name='cache_collections', type=2, id=None)
        oprot.write_bool(self.cache_collections)
        oprot.write_field_end()

        oprot.write_field_begin(name='cache_institutions', type=2, id=None)
        oprot.write_bool(self.cache_institutions)
        oprot.write_field_end()

        oprot.write_field_begin(name='elastic_search_host', type=11, id=None)
        oprot.write_string(self.elastic_search_host)
        oprot.write_field_end()

        oprot.write_field_begin(name='elastic_search_port', type=8, id=None)
        oprot.write_i32(self.elastic_search_port)
        oprot.write_field_end()

        oprot.write_field_begin(name='environment', type=11, id=None)
        oprot.write_string(self.environment)
        oprot.write_field_end()

        oprot.write_field_begin(name='google_api_key', type=11, id=None)
        oprot.write_string(self.google_api_key)
        oprot.write_field_end()

        oprot.write_field_begin(name='google_oauth_key', type=11, id=None)
        oprot.write_string(self.google_oauth_key)
        oprot.write_field_end()

        oprot.write_field_begin(name='google_oauth_secret', type=11, id=None)
        oprot.write_string(self.google_oauth_secret)
        oprot.write_field_end()

        oprot.write_field_begin(name='home_directory_path', type=11, id=None)
        oprot.write_string(self.home_directory_path)
        oprot.write_field_end()

        oprot.write_field_begin(name='object_summaries_result_cache_size', type=8, id=None)
        oprot.write_i32(self.object_summaries_result_cache_size)
        oprot.write_field_end()

        oprot.write_field_begin(name='object_summary_cache_size', type=8, id=None)
        oprot.write_i32(self.object_summary_cache_size)
        oprot.write_field_end()

        oprot.write_field_begin(name='resummarize_objects_bulk_request_size', type=8, id=None)
        oprot.write_i32(self.resummarize_objects_bulk_request_size)
        oprot.write_field_end()

        oprot.write_field_stop()

        oprot.write_struct_end()

        return self
