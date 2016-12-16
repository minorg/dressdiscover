class DateTimeGranularity(object):
    DAY = None
    MONTH = None
    YEAR = None

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
        if name == 'DAY' or name == '0':
            return getattr(DateTimeGranularity, 'DAY')
        elif name == 'MONTH' or name == '1':
            return getattr(DateTimeGranularity, 'MONTH')
        elif name == 'YEAR' or name == '2':
            return getattr(DateTimeGranularity, 'YEAR')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (DateTimeGranularity.DAY, DateTimeGranularity.MONTH, DateTimeGranularity.YEAR,)

DateTimeGranularity.DAY = DateTimeGranularity('DAY', 0)
DateTimeGranularity.MONTH = DateTimeGranularity('MONTH', 1)
DateTimeGranularity.YEAR = DateTimeGranularity('YEAR', 2)
