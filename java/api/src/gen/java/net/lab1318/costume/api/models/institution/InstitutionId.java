package net.lab1318.costume.api.models.institution;

public enum InstitutionId implements org.notaweb.api.models.ModelId {
    POWERHOUSE_MUSEUM(0);

    private InstitutionId(int value) {
        this.value = value;
    }

    public static InstitutionId valueOf(final int value) {
        switch (value) {
        case 0: return POWERHOUSE_MUSEUM;
        default: throw new IllegalArgumentException();
        }
    }

    public static InstitutionId valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
