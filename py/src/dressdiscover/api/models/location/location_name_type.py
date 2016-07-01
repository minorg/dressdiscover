class LocationNameType(object):
    CORPORATE = None
    GEOGRAPHIC = None
    OTHER = None
    PERSONAL = None

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
        if name == 'CORPORATE' or name == '0':
            return getattr(LocationNameType, 'CORPORATE')
        elif name == 'GEOGRAPHIC' or name == '1':
            return getattr(LocationNameType, 'GEOGRAPHIC')
        elif name == 'OTHER' or name == '2':
            return getattr(LocationNameType, 'OTHER')
        elif name == 'PERSONAL' or name == '3':
            return getattr(LocationNameType, 'PERSONAL')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (LocationNameType.CORPORATE, LocationNameType.GEOGRAPHIC, LocationNameType.OTHER, LocationNameType.PERSONAL,)

LocationNameType.CORPORATE = LocationNameType('CORPORATE', 0)
LocationNameType.GEOGRAPHIC = LocationNameType('GEOGRAPHIC', 1)
LocationNameType.OTHER = LocationNameType('OTHER', 2)
LocationNameType.PERSONAL = LocationNameType('PERSONAL', 3)
