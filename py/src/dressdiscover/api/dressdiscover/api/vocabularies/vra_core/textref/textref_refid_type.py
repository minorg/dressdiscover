class TextrefRefidType(object):
    CITATION = None
    ISBN = None
    ISSN = None
    OPEN_URL = None
    OTHER = None
    URI = None
    VENDOR = None

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
        if name == 'CITATION' or name == '0':
            return getattr(TextrefRefidType, 'CITATION')
        elif name == 'ISBN' or name == '1':
            return getattr(TextrefRefidType, 'ISBN')
        elif name == 'ISSN' or name == '2':
            return getattr(TextrefRefidType, 'ISSN')
        elif name == 'OPEN_URL' or name == '3':
            return getattr(TextrefRefidType, 'OPEN_URL')
        elif name == 'OTHER' or name == '4':
            return getattr(TextrefRefidType, 'OTHER')
        elif name == 'URI' or name == '5':
            return getattr(TextrefRefidType, 'URI')
        elif name == 'VENDOR' or name == '6':
            return getattr(TextrefRefidType, 'VENDOR')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (TextrefRefidType.CITATION, TextrefRefidType.ISBN, TextrefRefidType.ISSN, TextrefRefidType.OPEN_URL, TextrefRefidType.OTHER, TextrefRefidType.URI, TextrefRefidType.VENDOR,)

TextrefRefidType.CITATION = TextrefRefidType('CITATION', 0)
TextrefRefidType.ISBN = TextrefRefidType('ISBN', 1)
TextrefRefidType.ISSN = TextrefRefidType('ISSN', 2)
TextrefRefidType.OPEN_URL = TextrefRefidType('OPEN_URL', 3)
TextrefRefidType.OTHER = TextrefRefidType('OTHER', 4)
TextrefRefidType.URI = TextrefRefidType('URI', 5)
TextrefRefidType.VENDOR = TextrefRefidType('VENDOR', 6)
