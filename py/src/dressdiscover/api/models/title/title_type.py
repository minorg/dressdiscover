class TitleType(object):
    BRAND_NAME = None
    CITED = None
    CREATOR = None
    DESCRIPTIVE = None
    FORMER = None
    INSCRIBED = None
    OWNER = None
    POPULAR = None
    REPOSITORY = None
    TRANSLATED = None
    OTHER = None
    GENERAL_VIEW = None
    PARTIAL_VIEW = None

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
        if name == 'BRAND_NAME' or name == '0':
            return getattr(TitleType, 'BRAND_NAME')
        elif name == 'CITED' or name == '1':
            return getattr(TitleType, 'CITED')
        elif name == 'CREATOR' or name == '2':
            return getattr(TitleType, 'CREATOR')
        elif name == 'DESCRIPTIVE' or name == '3':
            return getattr(TitleType, 'DESCRIPTIVE')
        elif name == 'FORMER' or name == '4':
            return getattr(TitleType, 'FORMER')
        elif name == 'INSCRIBED' or name == '5':
            return getattr(TitleType, 'INSCRIBED')
        elif name == 'OWNER' or name == '6':
            return getattr(TitleType, 'OWNER')
        elif name == 'POPULAR' or name == '7':
            return getattr(TitleType, 'POPULAR')
        elif name == 'REPOSITORY' or name == '8':
            return getattr(TitleType, 'REPOSITORY')
        elif name == 'TRANSLATED' or name == '9':
            return getattr(TitleType, 'TRANSLATED')
        elif name == 'OTHER' or name == '10':
            return getattr(TitleType, 'OTHER')
        elif name == 'GENERAL_VIEW' or name == '11':
            return getattr(TitleType, 'GENERAL_VIEW')
        elif name == 'PARTIAL_VIEW' or name == '12':
            return getattr(TitleType, 'PARTIAL_VIEW')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (TitleType.BRAND_NAME, TitleType.CITED, TitleType.CREATOR, TitleType.DESCRIPTIVE, TitleType.FORMER, TitleType.INSCRIBED, TitleType.OWNER, TitleType.POPULAR, TitleType.REPOSITORY, TitleType.TRANSLATED, TitleType.OTHER, TitleType.GENERAL_VIEW, TitleType.PARTIAL_VIEW,)

TitleType.BRAND_NAME = TitleType('BRAND_NAME', 0)
TitleType.CITED = TitleType('CITED', 1)
TitleType.CREATOR = TitleType('CREATOR', 2)
TitleType.DESCRIPTIVE = TitleType('DESCRIPTIVE', 3)
TitleType.FORMER = TitleType('FORMER', 4)
TitleType.INSCRIBED = TitleType('INSCRIBED', 5)
TitleType.OWNER = TitleType('OWNER', 6)
TitleType.POPULAR = TitleType('POPULAR', 7)
TitleType.REPOSITORY = TitleType('REPOSITORY', 8)
TitleType.TRANSLATED = TitleType('TRANSLATED', 9)
TitleType.OTHER = TitleType('OTHER', 10)
TitleType.GENERAL_VIEW = TitleType('GENERAL_VIEW', 11)
TitleType.PARTIAL_VIEW = TitleType('PARTIAL_VIEW', 12)
