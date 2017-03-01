class QuestionType(object):
    COLORS = None
    DATE_RANGE = None
    SELECT_MULTIPLE = None
    SELECT_ONE = None
    TEXT = None

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
        if name == 'COLORS' or name == '0':
            return getattr(QuestionType, 'COLORS')
        elif name == 'DATE_RANGE' or name == '1':
            return getattr(QuestionType, 'DATE_RANGE')
        elif name == 'SELECT_MULTIPLE' or name == '2':
            return getattr(QuestionType, 'SELECT_MULTIPLE')
        elif name == 'SELECT_ONE' or name == '3':
            return getattr(QuestionType, 'SELECT_ONE')
        elif name == 'TEXT' or name == '4':
            return getattr(QuestionType, 'TEXT')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (QuestionType.COLORS, QuestionType.DATE_RANGE, QuestionType.SELECT_MULTIPLE, QuestionType.SELECT_ONE, QuestionType.TEXT,)

QuestionType.COLORS = QuestionType('COLORS', 0)
QuestionType.DATE_RANGE = QuestionType('DATE_RANGE', 1)
QuestionType.SELECT_MULTIPLE = QuestionType('SELECT_MULTIPLE', 2)
QuestionType.SELECT_ONE = QuestionType('SELECT_ONE', 3)
QuestionType.TEXT = QuestionType('TEXT', 4)
