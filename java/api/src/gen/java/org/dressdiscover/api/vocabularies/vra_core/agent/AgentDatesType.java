package org.dressdiscover.api.vocabularies.vra_core.agent;

/**
 * VRA Core 4.0 agent.dates.type values
 */
public enum AgentDatesType implements org.thryft.ThryftEnum {
    LIFE(0),
    ACTIVITY(1),
    OTHER(2);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<AgentDatesType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final AgentDatesType valueOf(final String name) {
            return AgentDatesType.valueOf(name);
        }

        public final AgentDatesType valueOf(final int value) {
            return AgentDatesType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

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

    public final int value() {
        return value;
    }

    private final int value;
}
