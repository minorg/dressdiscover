package org.dressdiscover.lib.stores;

import org.dressdiscover.lib.AbstractTest;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class StoreTest extends AbstractTest {
    protected StoreTest() {
        this(false);
    }

    protected StoreTest(final boolean readOnly) {
        super(readOnly);
        injector = Guice.createInjector(_getLibPropertiesModule());
    }

    protected final Injector _getInjector() {
        return injector;
    }

    private final Injector injector;
}
