package org.dressdiscover.api.vocabularies.vra_core.agent;

/**
 * VRA Core 4.0 agent.name.type values
 */
public enum AgentNameType implements org.thryft.ThryftEnum {
    PERSONAL(0),
    CORPORATE(1),
    FAMILY(2),
    OTHER(3);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<AgentNameType> {
        public final static Factory getInstance() {
            return instance;
        }

        public final AgentNameType valueOf(final String name) {
            return AgentNameType.valueOf(name);
        }

        public final AgentNameType valueOf(final int value) {
            return AgentNameType.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

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

    public final int value() {
        return value;
    }

    private final int value;
}
