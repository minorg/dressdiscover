class InscriptionTextType(object):
    SIGNATURE = None
    MARK = None
    CAPTION = None
    DATE = None
    LABEL = None
    TEXT = None
    TRANSLATION = None
    OTHER = None

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
        if name == 'SIGNATURE' or name == '0':
            return getattr(InscriptionTextType, 'SIGNATURE')
        elif name == 'MARK' or name == '1':
            return getattr(InscriptionTextType, 'MARK')
        elif name == 'CAPTION' or name == '2':
            return getattr(InscriptionTextType, 'CAPTION')
        elif name == 'DATE' or name == '3':
            return getattr(InscriptionTextType, 'DATE')
        elif name == 'LABEL' or name == '4':
            return getattr(InscriptionTextType, 'LABEL')
        elif name == 'TEXT' or name == '5':
            return getattr(InscriptionTextType, 'TEXT')
        elif name == 'TRANSLATION' or name == '6':
            return getattr(InscriptionTextType, 'TRANSLATION')
        elif name == 'OTHER' or name == '7':
            return getattr(InscriptionTextType, 'OTHER')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (InscriptionTextType.SIGNATURE, InscriptionTextType.MARK, InscriptionTextType.CAPTION, InscriptionTextType.DATE, InscriptionTextType.LABEL, InscriptionTextType.TEXT, InscriptionTextType.TRANSLATION, InscriptionTextType.OTHER,)

InscriptionTextType.SIGNATURE = InscriptionTextType('SIGNATURE', 0)
InscriptionTextType.MARK = InscriptionTextType('MARK', 1)
InscriptionTextType.CAPTION = InscriptionTextType('CAPTION', 2)
InscriptionTextType.DATE = InscriptionTextType('DATE', 3)
InscriptionTextType.LABEL = InscriptionTextType('LABEL', 4)
InscriptionTextType.TEXT = InscriptionTextType('TEXT', 5)
InscriptionTextType.TRANSLATION = InscriptionTextType('TRANSLATION', 6)
InscriptionTextType.OTHER = InscriptionTextType('OTHER', 7)
