class Condition(object):
    EXCELLENT = None
    FAIR = None
    GOOD = None
    POOR = None
    VERY_GOOD = None

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
        if name == 'EXCELLENT' or name == '0':
            return getattr(Condition, 'EXCELLENT')
        elif name == 'FAIR' or name == '1':
            return getattr(Condition, 'FAIR')
        elif name == 'GOOD' or name == '2':
            return getattr(Condition, 'GOOD')
        elif name == 'POOR' or name == '3':
            return getattr(Condition, 'POOR')
        elif name == 'VERY_GOOD' or name == '4':
            return getattr(Condition, 'VERY_GOOD')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (Condition.EXCELLENT, Condition.FAIR, Condition.GOOD, Condition.POOR, Condition.VERY_GOOD,)

Condition.EXCELLENT = Condition('EXCELLENT', 0)
Condition.FAIR = Condition('FAIR', 1)
Condition.GOOD = Condition('GOOD', 2)
Condition.POOR = Condition('POOR', 3)
Condition.VERY_GOOD = Condition('VERY_GOOD', 4)
