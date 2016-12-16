class ViewType(object):
    ACTION = None
    BACK = None
    CONDITION = None
    CONDITION_DETAIL = None
    DETAIL = None
    DOCUMENT = None
    DRAWING = None
    FRONT = None
    GROUP = None
    INTERIOR = None
    INTERIOR_CONSTRUCTION = None
    LABEL = None
    OTHER = None
    PATTERN = None
    PHOTOGRAPH = None
    REFERENCE = None
    SIDE = None
    SUPPORTING_DOCUMENT = None
    VIDEO = None

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
        if name == 'ACTION' or name == '0':
            return getattr(ViewType, 'ACTION')
        elif name == 'BACK' or name == '1':
            return getattr(ViewType, 'BACK')
        elif name == 'CONDITION' or name == '2':
            return getattr(ViewType, 'CONDITION')
        elif name == 'CONDITION_DETAIL' or name == '3':
            return getattr(ViewType, 'CONDITION_DETAIL')
        elif name == 'DETAIL' or name == '4':
            return getattr(ViewType, 'DETAIL')
        elif name == 'DOCUMENT' or name == '5':
            return getattr(ViewType, 'DOCUMENT')
        elif name == 'DRAWING' or name == '6':
            return getattr(ViewType, 'DRAWING')
        elif name == 'FRONT' or name == '7':
            return getattr(ViewType, 'FRONT')
        elif name == 'GROUP' or name == '8':
            return getattr(ViewType, 'GROUP')
        elif name == 'INTERIOR' or name == '9':
            return getattr(ViewType, 'INTERIOR')
        elif name == 'INTERIOR_CONSTRUCTION' or name == '10':
            return getattr(ViewType, 'INTERIOR_CONSTRUCTION')
        elif name == 'LABEL' or name == '11':
            return getattr(ViewType, 'LABEL')
        elif name == 'OTHER' or name == '12':
            return getattr(ViewType, 'OTHER')
        elif name == 'PATTERN' or name == '13':
            return getattr(ViewType, 'PATTERN')
        elif name == 'PHOTOGRAPH' or name == '14':
            return getattr(ViewType, 'PHOTOGRAPH')
        elif name == 'REFERENCE' or name == '15':
            return getattr(ViewType, 'REFERENCE')
        elif name == 'SIDE' or name == '16':
            return getattr(ViewType, 'SIDE')
        elif name == 'SUPPORTING_DOCUMENT' or name == '17':
            return getattr(ViewType, 'SUPPORTING_DOCUMENT')
        elif name == 'VIDEO' or name == '18':
            return getattr(ViewType, 'VIDEO')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (ViewType.ACTION, ViewType.BACK, ViewType.CONDITION, ViewType.CONDITION_DETAIL, ViewType.DETAIL, ViewType.DOCUMENT, ViewType.DRAWING, ViewType.FRONT, ViewType.GROUP, ViewType.INTERIOR, ViewType.INTERIOR_CONSTRUCTION, ViewType.LABEL, ViewType.OTHER, ViewType.PATTERN, ViewType.PHOTOGRAPH, ViewType.REFERENCE, ViewType.SIDE, ViewType.SUPPORTING_DOCUMENT, ViewType.VIDEO,)

ViewType.ACTION = ViewType('ACTION', 0)
ViewType.BACK = ViewType('BACK', 1)
ViewType.CONDITION = ViewType('CONDITION', 2)
ViewType.CONDITION_DETAIL = ViewType('CONDITION_DETAIL', 3)
ViewType.DETAIL = ViewType('DETAIL', 4)
ViewType.DOCUMENT = ViewType('DOCUMENT', 5)
ViewType.DRAWING = ViewType('DRAWING', 6)
ViewType.FRONT = ViewType('FRONT', 7)
ViewType.GROUP = ViewType('GROUP', 8)
ViewType.INTERIOR = ViewType('INTERIOR', 9)
ViewType.INTERIOR_CONSTRUCTION = ViewType('INTERIOR_CONSTRUCTION', 10)
ViewType.LABEL = ViewType('LABEL', 11)
ViewType.OTHER = ViewType('OTHER', 12)
ViewType.PATTERN = ViewType('PATTERN', 13)
ViewType.PHOTOGRAPH = ViewType('PHOTOGRAPH', 14)
ViewType.REFERENCE = ViewType('REFERENCE', 15)
ViewType.SIDE = ViewType('SIDE', 16)
ViewType.SUPPORTING_DOCUMENT = ViewType('SUPPORTING_DOCUMENT', 17)
ViewType.VIDEO = ViewType('VIDEO', 18)
