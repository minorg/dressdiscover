from costume.etl._main import _Main


class _Extractor(_Main):
    def __init__(self, clean=False, **kwds):
        _Main.__init__(self, **kwds)
        self.__clean = clean

    @classmethod
    def _add_arguments(cls, argument_parser):
        argument_parser.add_argument('--clean', action='store_true')

    def _clean(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__)

    def _extract(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__)

    def _run(self):
        if self.__clean:
            self._clean()
        self._extract()
