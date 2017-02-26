package org.dressdiscover.lib;

import org.dressdiscover.lib.properties.LibPropertiesModule;
import org.junit.Before;

public abstract class AbstractTest {
    protected AbstractTest(final boolean readOnly) {
        this.readOnly = readOnly;
        libPropertiesModule = new LibPropertiesModule();
    }

    @Before
    public final void checkReadWrite() {
        if (!readOnly) {
            switch (libPropertiesModule.getGlobalProperties().getEnvironment()) {
            case DEV:
            case JENKINS:
                break;
            default:
                throw new AssertionError();
            }
        }
    }

    protected final LibPropertiesModule _getLibPropertiesModule() {
        return libPropertiesModule;
    }

    private final LibPropertiesModule libPropertiesModule;
    private final boolean readOnly;
}
