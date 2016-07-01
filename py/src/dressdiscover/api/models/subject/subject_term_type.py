class SubjectTermType(object):
    CORPORATE_NAME = None
    FAMILY_NAME = None
    OTHER_NAME = None
    PERSONAL_NAME = None
    SCIENTIFIC_NAME = None
    BUILTWORK_PLACE = None
    GEOGRAPHIC_PLACE = None
    OTHER_PLACE = None
    CONCEPT_TOPIC = None
    DESCRIPTIVE_TOPIC = None
    ICONOGRAPHIC_TOPIC = None
    OTHER_TOPIC = None

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
        if name == 'CORPORATE_NAME' or name == '0':
            return getattr(SubjectTermType, 'CORPORATE_NAME')
        elif name == 'FAMILY_NAME' or name == '1':
            return getattr(SubjectTermType, 'FAMILY_NAME')
        elif name == 'OTHER_NAME' or name == '2':
            return getattr(SubjectTermType, 'OTHER_NAME')
        elif name == 'PERSONAL_NAME' or name == '3':
            return getattr(SubjectTermType, 'PERSONAL_NAME')
        elif name == 'SCIENTIFIC_NAME' or name == '4':
            return getattr(SubjectTermType, 'SCIENTIFIC_NAME')
        elif name == 'BUILTWORK_PLACE' or name == '5':
            return getattr(SubjectTermType, 'BUILTWORK_PLACE')
        elif name == 'GEOGRAPHIC_PLACE' or name == '6':
            return getattr(SubjectTermType, 'GEOGRAPHIC_PLACE')
        elif name == 'OTHER_PLACE' or name == '7':
            return getattr(SubjectTermType, 'OTHER_PLACE')
        elif name == 'CONCEPT_TOPIC' or name == '8':
            return getattr(SubjectTermType, 'CONCEPT_TOPIC')
        elif name == 'DESCRIPTIVE_TOPIC' or name == '9':
            return getattr(SubjectTermType, 'DESCRIPTIVE_TOPIC')
        elif name == 'ICONOGRAPHIC_TOPIC' or name == '10':
            return getattr(SubjectTermType, 'ICONOGRAPHIC_TOPIC')
        elif name == 'OTHER_TOPIC' or name == '11':
            return getattr(SubjectTermType, 'OTHER_TOPIC')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (SubjectTermType.CORPORATE_NAME, SubjectTermType.FAMILY_NAME, SubjectTermType.OTHER_NAME, SubjectTermType.PERSONAL_NAME, SubjectTermType.SCIENTIFIC_NAME, SubjectTermType.BUILTWORK_PLACE, SubjectTermType.GEOGRAPHIC_PLACE, SubjectTermType.OTHER_PLACE, SubjectTermType.CONCEPT_TOPIC, SubjectTermType.DESCRIPTIVE_TOPIC, SubjectTermType.ICONOGRAPHIC_TOPIC, SubjectTermType.OTHER_TOPIC,)

SubjectTermType.CORPORATE_NAME = SubjectTermType('CORPORATE_NAME', 0)
SubjectTermType.FAMILY_NAME = SubjectTermType('FAMILY_NAME', 1)
SubjectTermType.OTHER_NAME = SubjectTermType('OTHER_NAME', 2)
SubjectTermType.PERSONAL_NAME = SubjectTermType('PERSONAL_NAME', 3)
SubjectTermType.SCIENTIFIC_NAME = SubjectTermType('SCIENTIFIC_NAME', 4)
SubjectTermType.BUILTWORK_PLACE = SubjectTermType('BUILTWORK_PLACE', 5)
SubjectTermType.GEOGRAPHIC_PLACE = SubjectTermType('GEOGRAPHIC_PLACE', 6)
SubjectTermType.OTHER_PLACE = SubjectTermType('OTHER_PLACE', 7)
SubjectTermType.CONCEPT_TOPIC = SubjectTermType('CONCEPT_TOPIC', 8)
SubjectTermType.DESCRIPTIVE_TOPIC = SubjectTermType('DESCRIPTIVE_TOPIC', 9)
SubjectTermType.ICONOGRAPHIC_TOPIC = SubjectTermType('ICONOGRAPHIC_TOPIC', 10)
SubjectTermType.OTHER_TOPIC = SubjectTermType('OTHER_TOPIC', 11)
