class RightsType(object):
    COPYRIGHTED = None
    PUBLIC_DOMAIN = None
    UNDETERMINED = None
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
        if name == 'COPYRIGHTED' or name == '0':
            return getattr(RightsType, 'COPYRIGHTED')
        elif name == 'PUBLIC_DOMAIN' or name == '1':
            return getattr(RightsType, 'PUBLIC_DOMAIN')
        elif name == 'UNDETERMINED' or name == '2':
            return getattr(RightsType, 'UNDETERMINED')
        elif name == 'OTHER' or name == '3':
            return getattr(RightsType, 'OTHER')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (RightsType.COPYRIGHTED, RightsType.PUBLIC_DOMAIN, RightsType.UNDETERMINED, RightsType.OTHER,)

RightsType.COPYRIGHTED = RightsType('COPYRIGHTED', 0)
RightsType.PUBLIC_DOMAIN = RightsType('PUBLIC_DOMAIN', 1)
RightsType.UNDETERMINED = RightsType('UNDETERMINED', 2)
RightsType.OTHER = RightsType('OTHER', 3)
