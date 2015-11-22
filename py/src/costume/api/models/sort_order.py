class SortOrder(object):
    ASC = None
    DESC = None

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
        if name == 'ASC' or name == '0':
            return getattr(SortOrder, 'ASC')
        elif name == 'DESC' or name == '1':
            return getattr(SortOrder, 'DESC')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (SortOrder.ASC, SortOrder.DESC,)

SortOrder.ASC = SortOrder('ASC', 0)
SortOrder.DESC = SortOrder('DESC', 1)
