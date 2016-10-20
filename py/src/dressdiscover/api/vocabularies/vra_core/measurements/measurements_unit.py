class MeasurementsUnit(object):
    CM = None
    IN = None

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
        if name == 'CM' or name == '0':
            return getattr(MeasurementsUnit, 'CM')
        elif name == 'IN' or name == '1':
            return getattr(MeasurementsUnit, 'IN')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (MeasurementsUnit.CM, MeasurementsUnit.IN,)

MeasurementsUnit.CM = MeasurementsUnit('CM', 0)
MeasurementsUnit.IN = MeasurementsUnit('IN', 1)