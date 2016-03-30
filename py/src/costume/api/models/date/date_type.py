class DateType(object):
    ACCESSION = None
    ALTERATION = None
    BROADCAST = None
    BULK = None
    COMMISSION = None
    CREATION = None
    DESIGN = None
    DESTRUCTION = None
    DISCOVERY = None
    DONATION = None
    EXHIBITION = None
    INCLUSIVE = None
    PERFORMANCE = None
    PUBLICATION = None
    RESTORATION = None
    VIEW = None
    OTHER = None

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
        if name == 'ACCESSION' or name == '0':
            return getattr(DateType, 'ACCESSION')
        elif name == 'ALTERATION' or name == '1':
            return getattr(DateType, 'ALTERATION')
        elif name == 'BROADCAST' or name == '2':
            return getattr(DateType, 'BROADCAST')
        elif name == 'BULK' or name == '3':
            return getattr(DateType, 'BULK')
        elif name == 'COMMISSION' or name == '4':
            return getattr(DateType, 'COMMISSION')
        elif name == 'CREATION' or name == '5':
            return getattr(DateType, 'CREATION')
        elif name == 'DESIGN' or name == '6':
            return getattr(DateType, 'DESIGN')
        elif name == 'DESTRUCTION' or name == '7':
            return getattr(DateType, 'DESTRUCTION')
        elif name == 'DISCOVERY' or name == '8':
            return getattr(DateType, 'DISCOVERY')
        elif name == 'DONATION' or name == '9':
            return getattr(DateType, 'DONATION')
        elif name == 'EXHIBITION' or name == '10':
            return getattr(DateType, 'EXHIBITION')
        elif name == 'INCLUSIVE' or name == '11':
            return getattr(DateType, 'INCLUSIVE')
        elif name == 'PERFORMANCE' or name == '12':
            return getattr(DateType, 'PERFORMANCE')
        elif name == 'PUBLICATION' or name == '13':
            return getattr(DateType, 'PUBLICATION')
        elif name == 'RESTORATION' or name == '14':
            return getattr(DateType, 'RESTORATION')
        elif name == 'VIEW' or name == '15':
            return getattr(DateType, 'VIEW')
        elif name == 'OTHER' or name == '16':
            return getattr(DateType, 'OTHER')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (DateType.ACCESSION, DateType.ALTERATION, DateType.BROADCAST, DateType.BULK, DateType.COMMISSION, DateType.CREATION, DateType.DESIGN, DateType.DESTRUCTION, DateType.DISCOVERY, DateType.DONATION, DateType.EXHIBITION, DateType.INCLUSIVE, DateType.PERFORMANCE, DateType.PUBLICATION, DateType.RESTORATION, DateType.VIEW, DateType.OTHER,)

DateType.ACCESSION = DateType('ACCESSION', 0)
DateType.ALTERATION = DateType('ALTERATION', 1)
DateType.BROADCAST = DateType('BROADCAST', 2)
DateType.BULK = DateType('BULK', 3)
DateType.COMMISSION = DateType('COMMISSION', 4)
DateType.CREATION = DateType('CREATION', 5)
DateType.DESIGN = DateType('DESIGN', 6)
DateType.DESTRUCTION = DateType('DESTRUCTION', 7)
DateType.DISCOVERY = DateType('DISCOVERY', 8)
DateType.DONATION = DateType('DONATION', 9)
DateType.EXHIBITION = DateType('EXHIBITION', 10)
DateType.INCLUSIVE = DateType('INCLUSIVE', 11)
DateType.PERFORMANCE = DateType('PERFORMANCE', 12)
DateType.PUBLICATION = DateType('PUBLICATION', 13)
DateType.RESTORATION = DateType('RESTORATION', 14)
DateType.VIEW = DateType('VIEW', 15)
DateType.OTHER = DateType('OTHER', 16)
