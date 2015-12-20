class DescriptionType(object):
    CONDITION = None
    CREDIT = None
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
        elif name == 'CREDIT' or name == '1':
            return getattr(DescriptionType, 'CREDIT')
        elif name == 'EXHIBITION' or name == '2':
            return getattr(DescriptionType, 'EXHIBITION')
        elif name == 'HISTORY' or name == '3':
            return getattr(DescriptionType, 'HISTORY')
        elif name == 'PHYSICAL' or name == '4':
            return getattr(DescriptionType, 'PHYSICAL')
        elif name == 'PRIVATE' or name == '5':
            return getattr(DescriptionType, 'PRIVATE')
        elif name == 'PUBLIC' or name == '6':
            return getattr(DescriptionType, 'PUBLIC')
        elif name == 'SUMMARY' or name == '7':
            return getattr(DescriptionType, 'SUMMARY')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (DescriptionType.CONDITION, DescriptionType.CREDIT, DescriptionType.EXHIBITION, DescriptionType.HISTORY, DescriptionType.PHYSICAL, DescriptionType.PRIVATE, DescriptionType.PUBLIC, DescriptionType.SUMMARY,)

DescriptionType.CONDITION = DescriptionType('CONDITION', 0)
DescriptionType.CREDIT = DescriptionType('CREDIT', 1)
DescriptionType.EXHIBITION = DescriptionType('EXHIBITION', 2)
DescriptionType.HISTORY = DescriptionType('HISTORY', 3)
DescriptionType.PHYSICAL = DescriptionType('PHYSICAL', 4)
DescriptionType.PRIVATE = DescriptionType('PRIVATE', 5)
DescriptionType.PUBLIC = DescriptionType('PUBLIC', 6)
DescriptionType.SUMMARY = DescriptionType('SUMMARY', 7)
