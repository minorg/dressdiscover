class LocationType(object):
    CREATION = None
    DISCOVERY = None
    EXHIBITION = None
    FORMER_OWNER = None
    FORMER_REPOSITORY = None
    FORMER_SITE = None
    INSTALLATION = None
    INTENDED = None
    OTHER = None
    OWNER = None
    PERFORMANCE = None
    PUBLICATION = None
    REPOSITORY = None
    SITE = None

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
        if name == 'CREATION' or name == '0':
            return getattr(LocationType, 'CREATION')
        elif name == 'DISCOVERY' or name == '1':
            return getattr(LocationType, 'DISCOVERY')
        elif name == 'EXHIBITION' or name == '2':
            return getattr(LocationType, 'EXHIBITION')
        elif name == 'FORMER_OWNER' or name == '3':
            return getattr(LocationType, 'FORMER_OWNER')
        elif name == 'FORMER_REPOSITORY' or name == '4':
            return getattr(LocationType, 'FORMER_REPOSITORY')
        elif name == 'FORMER_SITE' or name == '5':
            return getattr(LocationType, 'FORMER_SITE')
        elif name == 'INSTALLATION' or name == '6':
            return getattr(LocationType, 'INSTALLATION')
        elif name == 'INTENDED' or name == '7':
            return getattr(LocationType, 'INTENDED')
        elif name == 'OTHER' or name == '8':
            return getattr(LocationType, 'OTHER')
        elif name == 'OWNER' or name == '9':
            return getattr(LocationType, 'OWNER')
        elif name == 'PERFORMANCE' or name == '10':
            return getattr(LocationType, 'PERFORMANCE')
        elif name == 'PUBLICATION' or name == '11':
            return getattr(LocationType, 'PUBLICATION')
        elif name == 'REPOSITORY' or name == '12':
            return getattr(LocationType, 'REPOSITORY')
        elif name == 'SITE' or name == '13':
            return getattr(LocationType, 'SITE')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (LocationType.CREATION, LocationType.DISCOVERY, LocationType.EXHIBITION, LocationType.FORMER_OWNER, LocationType.FORMER_REPOSITORY, LocationType.FORMER_SITE, LocationType.INSTALLATION, LocationType.INTENDED, LocationType.OTHER, LocationType.OWNER, LocationType.PERFORMANCE, LocationType.PUBLICATION, LocationType.REPOSITORY, LocationType.SITE,)

LocationType.CREATION = LocationType('CREATION', 0)
LocationType.DISCOVERY = LocationType('DISCOVERY', 1)
LocationType.EXHIBITION = LocationType('EXHIBITION', 2)
LocationType.FORMER_OWNER = LocationType('FORMER_OWNER', 3)
LocationType.FORMER_REPOSITORY = LocationType('FORMER_REPOSITORY', 4)
LocationType.FORMER_SITE = LocationType('FORMER_SITE', 5)
LocationType.INSTALLATION = LocationType('INSTALLATION', 6)
LocationType.INTENDED = LocationType('INTENDED', 7)
LocationType.OTHER = LocationType('OTHER', 8)
LocationType.OWNER = LocationType('OWNER', 9)
LocationType.PERFORMANCE = LocationType('PERFORMANCE', 10)
LocationType.PUBLICATION = LocationType('PUBLICATION', 11)
LocationType.REPOSITORY = LocationType('REPOSITORY', 12)
LocationType.SITE = LocationType('SITE', 13)
