class InstitutionId(object):
    POWERHOUSE_MUSEUM = None

    def __init__(self, name, value):
        object.__init__(self)
        self.__name = name
        self.__value = value

    def __int__(self):
        return self.__value

    def __repr__(self):
        return self.__name

    def __str__(self):
        return self.__name

    @classmethod
    def value_of(cls, name):
        if name == 'POWERHOUSE_MUSEUM' or name == '0':
            return getattr(InstitutionId, 'POWERHOUSE_MUSEUM')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (InstitutionId.POWERHOUSE_MUSEUM,)

InstitutionId.POWERHOUSE_MUSEUM = InstitutionId('POWERHOUSE_MUSEUM', 0)
