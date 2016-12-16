class MaterialType(object):
    MEDIUM = None
    SUPPORT = None
    OTHER = None
    WARP = None
    WEFT = None

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
        if name == 'MEDIUM' or name == '0':
            return getattr(MaterialType, 'MEDIUM')
        elif name == 'SUPPORT' or name == '1':
            return getattr(MaterialType, 'SUPPORT')
        elif name == 'OTHER' or name == '2':
            return getattr(MaterialType, 'OTHER')
        elif name == 'WARP' or name == '3':
            return getattr(MaterialType, 'WARP')
        elif name == 'WEFT' or name == '4':
            return getattr(MaterialType, 'WEFT')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (MaterialType.MEDIUM, MaterialType.SUPPORT, MaterialType.OTHER, MaterialType.WARP, MaterialType.WEFT,)

MaterialType.MEDIUM = MaterialType('MEDIUM', 0)
MaterialType.SUPPORT = MaterialType('SUPPORT', 1)
MaterialType.OTHER = MaterialType('OTHER', 2)
MaterialType.WARP = MaterialType('WARP', 3)
MaterialType.WEFT = MaterialType('WEFT', 4)
