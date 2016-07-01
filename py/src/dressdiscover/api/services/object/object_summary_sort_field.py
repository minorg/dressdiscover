class ObjectSummarySortField(object):
    COLLECTION_ID = None
    DATE = None
    INSTITUTION_ID = None
    TITLE = None
    WORK_TYPE_TEXTS = None

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
        if name == 'COLLECTION_ID' or name == '0':
            return getattr(ObjectSummarySortField, 'COLLECTION_ID')
        elif name == 'DATE' or name == '1':
            return getattr(ObjectSummarySortField, 'DATE')
        elif name == 'INSTITUTION_ID' or name == '2':
            return getattr(ObjectSummarySortField, 'INSTITUTION_ID')
        elif name == 'TITLE' or name == '3':
            return getattr(ObjectSummarySortField, 'TITLE')
        elif name == 'WORK_TYPE_TEXTS' or name == '4':
            return getattr(ObjectSummarySortField, 'WORK_TYPE_TEXTS')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (ObjectSummarySortField.COLLECTION_ID, ObjectSummarySortField.DATE, ObjectSummarySortField.INSTITUTION_ID, ObjectSummarySortField.TITLE, ObjectSummarySortField.WORK_TYPE_TEXTS,)

ObjectSummarySortField.COLLECTION_ID = ObjectSummarySortField('COLLECTION_ID', 0)
ObjectSummarySortField.DATE = ObjectSummarySortField('DATE', 1)
ObjectSummarySortField.INSTITUTION_ID = ObjectSummarySortField('INSTITUTION_ID', 2)
ObjectSummarySortField.TITLE = ObjectSummarySortField('TITLE', 3)
ObjectSummarySortField.WORK_TYPE_TEXTS = ObjectSummarySortField('WORK_TYPE_TEXTS', 4)
