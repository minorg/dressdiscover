from costume.etl.omeka.omeka_loader import OmekaLoader


class VcccOmekaLoader(OmekaLoader):
    def __init__(self, **kwds):
        OmekaLoader.__init__(
            self,
            endpoint_url='http://vcomeka.com/vccc',
            institution_id='vccc',
            institution_title="Vassar College Costume Collection",
            institution_url="http://vcomeka.com/vccc/",
            **kwds
        )

    @classmethod
    def _add_institution_arguments(cls, argument_parser):
        pass
