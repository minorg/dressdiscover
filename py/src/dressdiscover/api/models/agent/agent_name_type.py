class AgentNameType(object):
    PERSONAL = None
    CORPORATE = None
    FAMILY = None
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
        if name == 'PERSONAL' or name == '0':
            return getattr(AgentNameType, 'PERSONAL')
        elif name == 'CORPORATE' or name == '1':
            return getattr(AgentNameType, 'CORPORATE')
        elif name == 'FAMILY' or name == '2':
            return getattr(AgentNameType, 'FAMILY')
        elif name == 'OTHER' or name == '3':
            return getattr(AgentNameType, 'OTHER')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (AgentNameType.PERSONAL, AgentNameType.CORPORATE, AgentNameType.FAMILY, AgentNameType.OTHER,)

AgentNameType.PERSONAL = AgentNameType('PERSONAL', 0)
AgentNameType.CORPORATE = AgentNameType('CORPORATE', 1)
AgentNameType.FAMILY = AgentNameType('FAMILY', 2)
AgentNameType.OTHER = AgentNameType('OTHER', 3)
