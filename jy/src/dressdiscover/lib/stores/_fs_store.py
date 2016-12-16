class _FsStore(object):
    def __init__(self, data_directory_path, **kwds):
        self.__data_dir_path = data_directory_path

    @property
    def _data_dir_path(self):
        return self.__data_dir_path
