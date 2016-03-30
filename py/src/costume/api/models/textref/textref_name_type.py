class TextrefNameType(object):
    BOOK = None
    CATALOG = None
    CORPUS = None
    ELECTRONIC = None
    OTHER = None
    SERIAL = None

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
        if name == 'BOOK' or name == '0':
            return getattr(TextrefNameType, 'BOOK')
        elif name == 'CATALOG' or name == '1':
            return getattr(TextrefNameType, 'CATALOG')
        elif name == 'CORPUS' or name == '2':
            return getattr(TextrefNameType, 'CORPUS')
        elif name == 'ELECTRONIC' or name == '3':
            return getattr(TextrefNameType, 'ELECTRONIC')
        elif name == 'OTHER' or name == '4':
            return getattr(TextrefNameType, 'OTHER')
        elif name == 'SERIAL' or name == '5':
            return getattr(TextrefNameType, 'SERIAL')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (TextrefNameType.BOOK, TextrefNameType.CATALOG, TextrefNameType.CORPUS, TextrefNameType.ELECTRONIC, TextrefNameType.OTHER, TextrefNameType.SERIAL,)

TextrefNameType.BOOK = TextrefNameType('BOOK', 0)
TextrefNameType.CATALOG = TextrefNameType('CATALOG', 1)
TextrefNameType.CORPUS = TextrefNameType('CORPUS', 2)
TextrefNameType.ELECTRONIC = TextrefNameType('ELECTRONIC', 3)
TextrefNameType.OTHER = TextrefNameType('OTHER', 4)
TextrefNameType.SERIAL = TextrefNameType('SERIAL', 5)
