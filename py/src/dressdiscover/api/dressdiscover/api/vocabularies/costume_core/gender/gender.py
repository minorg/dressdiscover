class Gender(object):
    FEMALE = None
    MALE = None
    UNKNOWN = None

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
        if name == 'FEMALE' or name == '0':
            return getattr(Gender, 'FEMALE')
        elif name == 'MALE' or name == '1':
            return getattr(Gender, 'MALE')
        elif name == 'UNKNOWN' or name == '2':
            return getattr(Gender, 'UNKNOWN')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (Gender.FEMALE, Gender.MALE, Gender.UNKNOWN,)

Gender.FEMALE = Gender('FEMALE', 0)
Gender.MALE = Gender('MALE', 1)
Gender.UNKNOWN = Gender('UNKNOWN', 2)
