from paradicms_etl._transformer import _Transformer


class CostumeCoreAirtableTransformer(_Transformer):
    def __init__(self, **kwds):
        _Transformer.__init__(self, **kwds)
        self.__collection_kwds = kwds
        self.__institution_kwds = kwds

    def transform(self, *, records_by_table, **kwds):
        institution = self._transform_institution_from_arguments(
            **self.__institution_kwds
        )
        yield institution

        collection = self._transform_collection_from_arguments(**self.__collection_kwds)
        yield collection
