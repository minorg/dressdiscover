package org.dressdiscover.api.models.agent;

/**
 * VRA Core 4.0 agent.dates.type values
 */
public enum AgentDatesType {
    LIFE(0),
    ACTIVITY(1),
    OTHER(2);

    private AgentDatesType(int value) {
        this.value = value;
    }

    public static AgentDatesType valueOf(final int value) {
        switch (value) {
        case 0: return LIFE;
        case 1: return ACTIVITY;
        case 2: return OTHER;
        default: throw new IllegalArgumentException();
        }
    }

    public static AgentDatesType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
