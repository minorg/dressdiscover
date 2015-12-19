from costume.etl._main import _Main


class _Extractor(_Main):
    def _extract(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__)

    def _run(self):
        self._extract()
