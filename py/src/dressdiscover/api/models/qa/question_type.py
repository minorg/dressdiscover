class QuestionType(object):
    DATE = None
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
        if name == 'DATE' or name == '0':
            return getattr(QuestionType, 'DATE')
        elif name == 'SELECT_MULTIPLE' or name == '1':
            return getattr(QuestionType, 'SELECT_MULTIPLE')
        elif name == 'SELECT_ONE' or name == '2':
            return getattr(QuestionType, 'SELECT_ONE')
        elif name == 'TEXT' or name == '3':
            return getattr(QuestionType, 'TEXT')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (QuestionType.DATE, QuestionType.SELECT_MULTIPLE, QuestionType.SELECT_ONE, QuestionType.TEXT,)

QuestionType.DATE = QuestionType('DATE', 0)
QuestionType.SELECT_MULTIPLE = QuestionType('SELECT_MULTIPLE', 1)
QuestionType.SELECT_ONE = QuestionType('SELECT_ONE', 2)
QuestionType.TEXT = QuestionType('TEXT', 3)
