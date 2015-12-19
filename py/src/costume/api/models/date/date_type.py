class DateType(object):
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
        if name == 'ALTERATION' or name == '0':
            return getattr(DateType, 'ALTERATION')
        elif name == 'BROADCAST' or name == '1':
            return getattr(DateType, 'BROADCAST')
        elif name == 'BULK' or name == '2':
            return getattr(DateType, 'BULK')
        elif name == 'COMMISSION' or name == '3':
            return getattr(DateType, 'COMMISSION')
        elif name == 'CREATION' or name == '4':
            return getattr(DateType, 'CREATION')
        elif name == 'DESIGN' or name == '5':
            return getattr(DateType, 'DESIGN')
        elif name == 'DESTRUCTION' or name == '6':
            return getattr(DateType, 'DESTRUCTION')
        elif name == 'DISCOVERY' or name == '7':
            return getattr(DateType, 'DISCOVERY')
        elif name == 'DONATION' or name == '8':
            return getattr(DateType, 'DONATION')
        elif name == 'EXHIBITION' or name == '9':
            return getattr(DateType, 'EXHIBITION')
        elif name == 'INCLUSIVE' or name == '10':
            return getattr(DateType, 'INCLUSIVE')
        elif name == 'PERFORMANCE' or name == '11':
            return getattr(DateType, 'PERFORMANCE')
        elif name == 'PUBLICATION' or name == '12':
            return getattr(DateType, 'PUBLICATION')
        elif name == 'RESTORATION' or name == '13':
            return getattr(DateType, 'RESTORATION')
        elif name == 'VIEW' or name == '14':
            return getattr(DateType, 'VIEW')
        elif name == 'OTHER' or name == '15':
            return getattr(DateType, 'OTHER')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (DateType.ALTERATION, DateType.BROADCAST, DateType.BULK, DateType.COMMISSION, DateType.CREATION, DateType.DESIGN, DateType.DESTRUCTION, DateType.DISCOVERY, DateType.DONATION, DateType.EXHIBITION, DateType.INCLUSIVE, DateType.PERFORMANCE, DateType.PUBLICATION, DateType.RESTORATION, DateType.VIEW, DateType.OTHER,)

DateType.ALTERATION = DateType('ALTERATION', 0)
DateType.BROADCAST = DateType('BROADCAST', 1)
DateType.BULK = DateType('BULK', 2)
DateType.COMMISSION = DateType('COMMISSION', 3)
DateType.CREATION = DateType('CREATION', 4)
DateType.DESIGN = DateType('DESIGN', 5)
DateType.DESTRUCTION = DateType('DESTRUCTION', 6)
DateType.DISCOVERY = DateType('DISCOVERY', 7)
DateType.DONATION = DateType('DONATION', 8)
DateType.EXHIBITION = DateType('EXHIBITION', 9)
DateType.INCLUSIVE = DateType('INCLUSIVE', 10)
DateType.PERFORMANCE = DateType('PERFORMANCE', 11)
DateType.PUBLICATION = DateType('PUBLICATION', 12)
DateType.RESTORATION = DateType('RESTORATION', 13)
DateType.VIEW = DateType('VIEW', 14)
DateType.OTHER = DateType('OTHER', 15)
