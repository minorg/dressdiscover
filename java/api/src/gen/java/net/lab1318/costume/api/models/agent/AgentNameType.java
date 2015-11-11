package net.lab1318.costume.api.models.agent;

/**
 * VRA Core 4.0 agent.name.type values
 */
public enum AgentNameType {
    PERSONAL(0),
    CORPORATE(1),
    FAMILY(2),
    OTHER(3);

    private AgentNameType(int value) {
        this.value = value;
    }

    public static AgentNameType valueOf(final int value) {
        switch (value) {
        case 0: return PERSONAL;
        case 1: return CORPORATE;
        case 2: return FAMILY;
        case 3: return OTHER;
        default: throw new IllegalArgumentException();
        }
    }

    public static AgentNameType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
