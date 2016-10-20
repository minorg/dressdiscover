class RelationType(object):
    BASED_ON = None
    CARTOON_FOR = None
    CARTOON_IS = None
    COMPONENT_IS = None
    COMPONENT_OF = None
    CONTEXT_IS = None
    COPY_AFTER = None
    COPY_IS = None
    COUNTER_PROOF_FOR = None
    COUNTER_PROOF_IS = None
    DEPICTED_IN = None
    DEPICTS = None
    DERIVED_FROM = None
    DESIGNED_FOR = None
    EXHIBITED_AT = None
    FACSIMILE_IS = None
    FACSIMILE_OF = None
    FORMERLY_LARGER_CONTEXT_FOR = None
    FORMERLY_PART_OF = None
    IMAGE_IS = None
    IMAGE_OF = None
    IMPRESSION_IS = None
    LARGER_CONTEXT_FOR = None
    MATE_OF = None
    MODEL_FOR = None
    MODEL_IS = None
    PART_OF = None
    PARTNER_IN_SET_WITH = None
    PENDANT_OF = None
    PLAN_FOR = None
    PLAN_IS = None
    PREPARATORY_FOR = None
    PRINTING_PLATE_FOR = None
    PRINTING_PLATE_IS = None
    RELATED_TO = None
    RELIEF_FOR = None
    REPLICA_IS = None
    REPLICA_OF = None
    SOURCE_FOR = None
    STUDY_FOR = None
    STUDY_IS = None
    VENUE_FOR = None
    VERSION_IS = None
    VERSION_OF = None

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
        if name == 'BASED_ON' or name == '0':
            return getattr(RelationType, 'BASED_ON')
        elif name == 'CARTOON_FOR' or name == '1':
            return getattr(RelationType, 'CARTOON_FOR')
        elif name == 'CARTOON_IS' or name == '2':
            return getattr(RelationType, 'CARTOON_IS')
        elif name == 'COMPONENT_IS' or name == '3':
            return getattr(RelationType, 'COMPONENT_IS')
        elif name == 'COMPONENT_OF' or name == '4':
            return getattr(RelationType, 'COMPONENT_OF')
        elif name == 'CONTEXT_IS' or name == '5':
            return getattr(RelationType, 'CONTEXT_IS')
        elif name == 'COPY_AFTER' or name == '6':
            return getattr(RelationType, 'COPY_AFTER')
        elif name == 'COPY_IS' or name == '7':
            return getattr(RelationType, 'COPY_IS')
        elif name == 'COUNTER_PROOF_FOR' or name == '8':
            return getattr(RelationType, 'COUNTER_PROOF_FOR')
        elif name == 'COUNTER_PROOF_IS' or name == '9':
            return getattr(RelationType, 'COUNTER_PROOF_IS')
        elif name == 'DEPICTED_IN' or name == '10':
            return getattr(RelationType, 'DEPICTED_IN')
        elif name == 'DEPICTS' or name == '11':
            return getattr(RelationType, 'DEPICTS')
        elif name == 'DERIVED_FROM' or name == '12':
            return getattr(RelationType, 'DERIVED_FROM')
        elif name == 'DESIGNED_FOR' or name == '13':
            return getattr(RelationType, 'DESIGNED_FOR')
        elif name == 'EXHIBITED_AT' or name == '14':
            return getattr(RelationType, 'EXHIBITED_AT')
        elif name == 'FACSIMILE_IS' or name == '15':
            return getattr(RelationType, 'FACSIMILE_IS')
        elif name == 'FACSIMILE_OF' or name == '16':
            return getattr(RelationType, 'FACSIMILE_OF')
        elif name == 'FORMERLY_LARGER_CONTEXT_FOR' or name == '17':
            return getattr(RelationType, 'FORMERLY_LARGER_CONTEXT_FOR')
        elif name == 'FORMERLY_PART_OF' or name == '18':
            return getattr(RelationType, 'FORMERLY_PART_OF')
        elif name == 'IMAGE_IS' or name == '19':
            return getattr(RelationType, 'IMAGE_IS')
        elif name == 'IMAGE_OF' or name == '20':
            return getattr(RelationType, 'IMAGE_OF')
        elif name == 'IMPRESSION_IS' or name == '21':
            return getattr(RelationType, 'IMPRESSION_IS')
        elif name == 'LARGER_CONTEXT_FOR' or name == '22':
            return getattr(RelationType, 'LARGER_CONTEXT_FOR')
        elif name == 'MATE_OF' or name == '23':
            return getattr(RelationType, 'MATE_OF')
        elif name == 'MODEL_FOR' or name == '24':
            return getattr(RelationType, 'MODEL_FOR')
        elif name == 'MODEL_IS' or name == '25':
            return getattr(RelationType, 'MODEL_IS')
        elif name == 'PART_OF' or name == '26':
            return getattr(RelationType, 'PART_OF')
        elif name == 'PARTNER_IN_SET_WITH' or name == '27':
            return getattr(RelationType, 'PARTNER_IN_SET_WITH')
        elif name == 'PENDANT_OF' or name == '28':
            return getattr(RelationType, 'PENDANT_OF')
        elif name == 'PLAN_FOR' or name == '29':
            return getattr(RelationType, 'PLAN_FOR')
        elif name == 'PLAN_IS' or name == '30':
            return getattr(RelationType, 'PLAN_IS')
        elif name == 'PREPARATORY_FOR' or name == '31':
            return getattr(RelationType, 'PREPARATORY_FOR')
        elif name == 'PRINTING_PLATE_FOR' or name == '32':
            return getattr(RelationType, 'PRINTING_PLATE_FOR')
        elif name == 'PRINTING_PLATE_IS' or name == '33':
            return getattr(RelationType, 'PRINTING_PLATE_IS')
        elif name == 'RELATED_TO' or name == '34':
            return getattr(RelationType, 'RELATED_TO')
        elif name == 'RELIEF_FOR' or name == '35':
            return getattr(RelationType, 'RELIEF_FOR')
        elif name == 'REPLICA_IS' or name == '36':
            return getattr(RelationType, 'REPLICA_IS')
        elif name == 'REPLICA_OF' or name == '37':
            return getattr(RelationType, 'REPLICA_OF')
        elif name == 'SOURCE_FOR' or name == '38':
            return getattr(RelationType, 'SOURCE_FOR')
        elif name == 'STUDY_FOR' or name == '39':
            return getattr(RelationType, 'STUDY_FOR')
        elif name == 'STUDY_IS' or name == '40':
            return getattr(RelationType, 'STUDY_IS')
        elif name == 'VENUE_FOR' or name == '41':
            return getattr(RelationType, 'VENUE_FOR')
        elif name == 'VERSION_IS' or name == '42':
            return getattr(RelationType, 'VERSION_IS')
        elif name == 'VERSION_OF' or name == '43':
            return getattr(RelationType, 'VERSION_OF')
        raise ValueError(name)

    @classmethod
    def values(cls):
        return (RelationType.BASED_ON, RelationType.CARTOON_FOR, RelationType.CARTOON_IS, RelationType.COMPONENT_IS, RelationType.COMPONENT_OF, RelationType.CONTEXT_IS, RelationType.COPY_AFTER, RelationType.COPY_IS, RelationType.COUNTER_PROOF_FOR, RelationType.COUNTER_PROOF_IS, RelationType.DEPICTED_IN, RelationType.DEPICTS, RelationType.DERIVED_FROM, RelationType.DESIGNED_FOR, RelationType.EXHIBITED_AT, RelationType.FACSIMILE_IS, RelationType.FACSIMILE_OF, RelationType.FORMERLY_LARGER_CONTEXT_FOR, RelationType.FORMERLY_PART_OF, RelationType.IMAGE_IS, RelationType.IMAGE_OF, RelationType.IMPRESSION_IS, RelationType.LARGER_CONTEXT_FOR, RelationType.MATE_OF, RelationType.MODEL_FOR, RelationType.MODEL_IS, RelationType.PART_OF, RelationType.PARTNER_IN_SET_WITH, RelationType.PENDANT_OF, RelationType.PLAN_FOR, RelationType.PLAN_IS, RelationType.PREPARATORY_FOR, RelationType.PRINTING_PLATE_FOR, RelationType.PRINTING_PLATE_IS, RelationType.RELATED_TO, RelationType.RELIEF_FOR, RelationType.REPLICA_IS, RelationType.REPLICA_OF, RelationType.SOURCE_FOR, RelationType.STUDY_FOR, RelationType.STUDY_IS, RelationType.VENUE_FOR, RelationType.VERSION_IS, RelationType.VERSION_OF,)

RelationType.BASED_ON = RelationType('BASED_ON', 0)
RelationType.CARTOON_FOR = RelationType('CARTOON_FOR', 1)
RelationType.CARTOON_IS = RelationType('CARTOON_IS', 2)
RelationType.COMPONENT_IS = RelationType('COMPONENT_IS', 3)
RelationType.COMPONENT_OF = RelationType('COMPONENT_OF', 4)
RelationType.CONTEXT_IS = RelationType('CONTEXT_IS', 5)
RelationType.COPY_AFTER = RelationType('COPY_AFTER', 6)
RelationType.COPY_IS = RelationType('COPY_IS', 7)
RelationType.COUNTER_PROOF_FOR = RelationType('COUNTER_PROOF_FOR', 8)
RelationType.COUNTER_PROOF_IS = RelationType('COUNTER_PROOF_IS', 9)
RelationType.DEPICTED_IN = RelationType('DEPICTED_IN', 10)
RelationType.DEPICTS = RelationType('DEPICTS', 11)
RelationType.DERIVED_FROM = RelationType('DERIVED_FROM', 12)
RelationType.DESIGNED_FOR = RelationType('DESIGNED_FOR', 13)
RelationType.EXHIBITED_AT = RelationType('EXHIBITED_AT', 14)
RelationType.FACSIMILE_IS = RelationType('FACSIMILE_IS', 15)
RelationType.FACSIMILE_OF = RelationType('FACSIMILE_OF', 16)
RelationType.FORMERLY_LARGER_CONTEXT_FOR = RelationType('FORMERLY_LARGER_CONTEXT_FOR', 17)
RelationType.FORMERLY_PART_OF = RelationType('FORMERLY_PART_OF', 18)
RelationType.IMAGE_IS = RelationType('IMAGE_IS', 19)
RelationType.IMAGE_OF = RelationType('IMAGE_OF', 20)
RelationType.IMPRESSION_IS = RelationType('IMPRESSION_IS', 21)
RelationType.LARGER_CONTEXT_FOR = RelationType('LARGER_CONTEXT_FOR', 22)
RelationType.MATE_OF = RelationType('MATE_OF', 23)
RelationType.MODEL_FOR = RelationType('MODEL_FOR', 24)
RelationType.MODEL_IS = RelationType('MODEL_IS', 25)
RelationType.PART_OF = RelationType('PART_OF', 26)
RelationType.PARTNER_IN_SET_WITH = RelationType('PARTNER_IN_SET_WITH', 27)
RelationType.PENDANT_OF = RelationType('PENDANT_OF', 28)
RelationType.PLAN_FOR = RelationType('PLAN_FOR', 29)
RelationType.PLAN_IS = RelationType('PLAN_IS', 30)
RelationType.PREPARATORY_FOR = RelationType('PREPARATORY_FOR', 31)
RelationType.PRINTING_PLATE_FOR = RelationType('PRINTING_PLATE_FOR', 32)
RelationType.PRINTING_PLATE_IS = RelationType('PRINTING_PLATE_IS', 33)
RelationType.RELATED_TO = RelationType('RELATED_TO', 34)
RelationType.RELIEF_FOR = RelationType('RELIEF_FOR', 35)
RelationType.REPLICA_IS = RelationType('REPLICA_IS', 36)
RelationType.REPLICA_OF = RelationType('REPLICA_OF', 37)
RelationType.SOURCE_FOR = RelationType('SOURCE_FOR', 38)
RelationType.STUDY_FOR = RelationType('STUDY_FOR', 39)
RelationType.STUDY_IS = RelationType('STUDY_IS', 40)
RelationType.VENUE_FOR = RelationType('VENUE_FOR', 41)
RelationType.VERSION_IS = RelationType('VERSION_IS', 42)
RelationType.VERSION_OF = RelationType('VERSION_OF', 43)
