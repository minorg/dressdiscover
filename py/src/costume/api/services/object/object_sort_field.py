class ObjectSortField(object):
    COLLECTION_ID = None
    DATE_TEXT = None
    INSTITUTION_ID = None
    TITLE = None
    WORK_TYPES = None

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
            return getattr(ObjectSortField, 'COLLECTION_ID')
        elif name == 'DATE_TEXT' or name == '1':
            return getattr(ObjectSortField, 'DATE_TEXT')
        elif name == 'INSTITUTION_ID' or name == '2':
            return getattr(ObjectSortField, 'INSTITUTION_ID')
        elif name == 'TITLE' or name == '3':
            return getattr(ObjectSortField, 'TITLE')
        elif name == 'WORK_TYPES' or name == '4':
            return getattr(ObjectSortField, 'WORK_TYPES')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (ObjectSortField.COLLECTION_ID, ObjectSortField.DATE_TEXT, ObjectSortField.INSTITUTION_ID, ObjectSortField.TITLE, ObjectSortField.WORK_TYPES,)

ObjectSortField.COLLECTION_ID = ObjectSortField('COLLECTION_ID', 0)
ObjectSortField.DATE_TEXT = ObjectSortField('DATE_TEXT', 1)
ObjectSortField.INSTITUTION_ID = ObjectSortField('INSTITUTION_ID', 2)
ObjectSortField.TITLE = ObjectSortField('TITLE', 3)
ObjectSortField.WORK_TYPES = ObjectSortField('WORK_TYPES', 4)
