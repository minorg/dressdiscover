class DescriptionType(object):
    CONDITION = None
    EXHIBITION = None
    HISTORY = None
    PHYSICAL = None
    PRIVATE = None
    PUBLIC = None
    SUMMARY = None

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
        if name == 'CONDITION' or name == '0':
            return getattr(DescriptionType, 'CONDITION')
        elif name == 'EXHIBITION' or name == '1':
            return getattr(DescriptionType, 'EXHIBITION')
        elif name == 'HISTORY' or name == '2':
            return getattr(DescriptionType, 'HISTORY')
        elif name == 'PHYSICAL' or name == '3':
            return getattr(DescriptionType, 'PHYSICAL')
        elif name == 'PRIVATE' or name == '4':
            return getattr(DescriptionType, 'PRIVATE')
        elif name == 'PUBLIC' or name == '5':
            return getattr(DescriptionType, 'PUBLIC')
        elif name == 'SUMMARY' or name == '6':
            return getattr(DescriptionType, 'SUMMARY')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (DescriptionType.CONDITION, DescriptionType.EXHIBITION, DescriptionType.HISTORY, DescriptionType.PHYSICAL, DescriptionType.PRIVATE, DescriptionType.PUBLIC, DescriptionType.SUMMARY,)

DescriptionType.CONDITION = DescriptionType('CONDITION', 0)
DescriptionType.EXHIBITION = DescriptionType('EXHIBITION', 1)
DescriptionType.HISTORY = DescriptionType('HISTORY', 2)
DescriptionType.PHYSICAL = DescriptionType('PHYSICAL', 3)
DescriptionType.PRIVATE = DescriptionType('PRIVATE', 4)
DescriptionType.PUBLIC = DescriptionType('PUBLIC', 5)
DescriptionType.SUMMARY = DescriptionType('SUMMARY', 6)
