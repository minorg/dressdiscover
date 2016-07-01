package org.dressdiscover.api.models.relation;

/**
 * VRA Core 4.0 relation type= attribute
 */
public enum RelationType {
    BASED_ON(0),
    CARTOON_FOR(1),
    CARTOON_IS(2),
    COMPONENT_IS(3),
    COMPONENT_OF(4),
    CONTEXT_IS(5),
    COPY_AFTER(6),
    COPY_IS(7),
    COUNTER_PROOF_FOR(8),
    COUNTER_PROOF_IS(9),
    DEPICTED_IN(10),
    DEPICTS(11),
    DERIVED_FROM(12),
    DESIGNED_FOR(13),
    EXHIBITED_AT(14),
    FACSIMILE_IS(15),
    FACSIMILE_OF(16),
    FORMERLY_LARGER_CONTEXT_FOR(17),
    FORMERLY_PART_OF(18),
    IMAGE_IS(19),
    IMAGE_OF(20),
    IMPRESSION_IS(21),
    LARGER_CONTEXT_FOR(22),
    MATE_OF(23),
    MODEL_FOR(24),
    MODEL_IS(25),
    PART_OF(26),
    PARTNER_IN_SET_WITH(27),
    PENDANT_OF(28),
    PLAN_FOR(29),
    PLAN_IS(30),
    PREPARATORY_FOR(31),
    PRINTING_PLATE_FOR(32),
    PRINTING_PLATE_IS(33),
    RELATED_TO(34),
    RELIEF_FOR(35),
    REPLICA_IS(36),
    REPLICA_OF(37),
    SOURCE_FOR(38),
    STUDY_FOR(39),
    STUDY_IS(40),
    VENUE_FOR(41),
    VERSION_IS(42),
    VERSION_OF(43);

    private RelationType(int value) {
        this.value = value;
    }

    public static RelationType valueOf(final int value) {
        switch (value) {
        case 0: return BASED_ON;
        case 1: return CARTOON_FOR;
        case 2: return CARTOON_IS;
        case 3: return COMPONENT_IS;
        case 4: return COMPONENT_OF;
        case 5: return CONTEXT_IS;
        case 6: return COPY_AFTER;
        case 7: return COPY_IS;
        case 8: return COUNTER_PROOF_FOR;
        case 9: return COUNTER_PROOF_IS;
        case 10: return DEPICTED_IN;
        case 11: return DEPICTS;
        case 12: return DERIVED_FROM;
        case 13: return DESIGNED_FOR;
        case 14: return EXHIBITED_AT;
        case 15: return FACSIMILE_IS;
        case 16: return FACSIMILE_OF;
        case 17: return FORMERLY_LARGER_CONTEXT_FOR;
        case 18: return FORMERLY_PART_OF;
        case 19: return IMAGE_IS;
        case 20: return IMAGE_OF;
        case 21: return IMPRESSION_IS;
        case 22: return LARGER_CONTEXT_FOR;
        case 23: return MATE_OF;
        case 24: return MODEL_FOR;
        case 25: return MODEL_IS;
        case 26: return PART_OF;
        case 27: return PARTNER_IN_SET_WITH;
        case 28: return PENDANT_OF;
        case 29: return PLAN_FOR;
        case 30: return PLAN_IS;
        case 31: return PREPARATORY_FOR;
        case 32: return PRINTING_PLATE_FOR;
        case 33: return PRINTING_PLATE_IS;
        case 34: return RELATED_TO;
        case 35: return RELIEF_FOR;
        case 36: return REPLICA_IS;
        case 37: return REPLICA_OF;
        case 38: return SOURCE_FOR;
        case 39: return STUDY_FOR;
        case 40: return STUDY_IS;
        case 41: return VENUE_FOR;
        case 42: return VERSION_IS;
        case 43: return VERSION_OF;
        default: throw new IllegalArgumentException();
        }
    }

    public static RelationType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
