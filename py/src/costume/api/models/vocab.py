class Vocab(object):
    AAT = None
    DC = None
    KWD = None
    OTH = None
    LCSH = None

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
        elif name == 'KWD' or name == '2':
            return getattr(Vocab, 'KWD')
        elif name == 'OTH' or name == '3':
            return getattr(Vocab, 'OTH')
        elif name == 'LCSH' or name == '4':
            return getattr(Vocab, 'LCSH')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (Vocab.AAT, Vocab.DC, Vocab.KWD, Vocab.OTH, Vocab.LCSH,)

Vocab.AAT = Vocab('AAT', 0)
Vocab.DC = Vocab('DC', 1)
Vocab.KWD = Vocab('KWD', 2)
Vocab.OTH = Vocab('OTH', 3)
Vocab.LCSH = Vocab('LCSH', 4)
