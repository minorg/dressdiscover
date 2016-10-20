class ColorType(object):
    PRIMARY = None
    SECONDARY = None

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
        if name == 'PRIMARY' or name == '0':
            return getattr(ColorType, 'PRIMARY')
        elif name == 'SECONDARY' or name == '1':
            return getattr(ColorType, 'SECONDARY')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (ColorType.PRIMARY, ColorType.SECONDARY,)

ColorType.PRIMARY = ColorType('PRIMARY', 0)
ColorType.SECONDARY = ColorType('SECONDARY', 1)
