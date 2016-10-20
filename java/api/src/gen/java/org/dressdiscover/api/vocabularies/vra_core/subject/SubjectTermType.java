package org.dressdiscover.api.vocabularies.vra_core.subject;

/**
 * VRA Core 4.0 subject term type= attribute
 */
public enum SubjectTermType {
    CORPORATE_NAME(0),
    FAMILY_NAME(1),
    OTHER_NAME(2),
    PERSONAL_NAME(3),
    SCIENTIFIC_NAME(4),
    BUILTWORK_PLACE(5),
    GEOGRAPHIC_PLACE(6),
    OTHER_PLACE(7),
    CONCEPT_TOPIC(8),
    DESCRIPTIVE_TOPIC(9),
    ICONOGRAPHIC_TOPIC(10),
    OTHER_TOPIC(11);

    private SubjectTermType(int value) {
        this.value = value;
    }

    public static SubjectTermType valueOf(final int value) {
        switch (value) {
        case 0: return CORPORATE_NAME;
        case 1: return FAMILY_NAME;
        case 2: return OTHER_NAME;
        case 3: return PERSONAL_NAME;
        case 4: return SCIENTIFIC_NAME;
        case 5: return BUILTWORK_PLACE;
        case 6: return GEOGRAPHIC_PLACE;
        case 7: return OTHER_PLACE;
        case 8: return CONCEPT_TOPIC;
        case 9: return DESCRIPTIVE_TOPIC;
        case 10: return ICONOGRAPHIC_TOPIC;
        case 11: return OTHER_TOPIC;
        default: throw new IllegalArgumentException();
        }
    }

    public static SubjectTermType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
