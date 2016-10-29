import os.path

from dressdiscover.cli._main import _Main


class _Extractor(_Main):
    def __init__(self, data_dir_path, clean=False, **kwds):
        _Main.__init__(self, **kwds)
        self.__clean = clean
        self.__data_dir_path = data_dir_path

    @classmethod
    def _add_arguments(cls, argument_parser):
        argument_parser.add_argument('--clean', action='store_true')
        data_dir_path_default = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', '..', '..', 'data'))
        assert os.path.isdir(data_dir_path_default), data_dir_path_default
        argument_parser.add_argument('--data-dir-path', action='store', default=data_dir_path_default)

    def _clean(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__)

    @property
    def _data_dir_path(self):
        return self.__data_dir_path

    def _extract(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__)

    def _run(self):
        if self.__clean:
            self._clean()
        self._extract()
