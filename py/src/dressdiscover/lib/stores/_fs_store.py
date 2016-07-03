import urllib


class _FsStore(object):
    def __init__(self, uri):
        self.__data_dir_path = urllib.url2pathname(uri.path.get())
        print 'URI %s -> file path %s' % (uri, self.__data_dir_path)

    @property
    def _data_dir_path(self):
        return self.__data_dir_path
