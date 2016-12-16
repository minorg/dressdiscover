class AgentDatesType(object):
    LIFE = None
    ACTIVITY = None
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
        if name == 'LIFE' or name == '0':
            return getattr(AgentDatesType, 'LIFE')
        elif name == 'ACTIVITY' or name == '1':
            return getattr(AgentDatesType, 'ACTIVITY')
        elif name == 'OTHER' or name == '2':
            return getattr(AgentDatesType, 'OTHER')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (AgentDatesType.LIFE, AgentDatesType.ACTIVITY, AgentDatesType.OTHER,)

AgentDatesType.LIFE = AgentDatesType('LIFE', 0)
AgentDatesType.ACTIVITY = AgentDatesType('ACTIVITY', 1)
AgentDatesType.OTHER = AgentDatesType('OTHER', 2)
