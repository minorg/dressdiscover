class Vocab(object):
    AAT = None
    DC = None
    DCMI_TYPE = None
    KWD = None
    LCSH = None
    OTH = None
    QUILT_INDEX = None

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
        if name == 'AAT' or name == '0':
            return getattr(Vocab, 'AAT')
        elif name == 'DC' or name == '1':
            return getattr(Vocab, 'DC')
        elif name == 'DCMI_TYPE' or name == '2':
            return getattr(Vocab, 'DCMI_TYPE')
        elif name == 'KWD' or name == '3':
            return getattr(Vocab, 'KWD')
        elif name == 'LCSH' or name == '4':
            return getattr(Vocab, 'LCSH')
        elif name == 'OTH' or name == '5':
            return getattr(Vocab, 'OTH')
        elif name == 'QUILT_INDEX' or name == '6':
            return getattr(Vocab, 'QUILT_INDEX')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (Vocab.AAT, Vocab.DC, Vocab.DCMI_TYPE, Vocab.KWD, Vocab.LCSH, Vocab.OTH, Vocab.QUILT_INDEX,)

Vocab.AAT = Vocab('AAT', 0)
Vocab.DC = Vocab('DC', 1)
Vocab.DCMI_TYPE = Vocab('DCMI_TYPE', 2)
Vocab.KWD = Vocab('KWD', 3)
Vocab.LCSH = Vocab('LCSH', 4)
Vocab.OTH = Vocab('OTH', 5)
Vocab.QUILT_INDEX = Vocab('QUILT_INDEX', 6)
