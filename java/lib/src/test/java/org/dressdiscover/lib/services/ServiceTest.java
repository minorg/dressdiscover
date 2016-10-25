package org.dressdiscover.lib.services;

import org.dressdiscover.lib.AbstractTest;
import org.dressdiscover.lib.properties.StoreProperties;

import com.google.inject.Guice;
import com.google.inject.Injector;

public abstract class ServiceTest extends AbstractTest {
    protected ServiceTest() {
        this(false);
    }

    protected ServiceTest(final boolean readOnly) {
        super(readOnly);

        injector = Guice.createInjector(_getLibPropertiesModule(),
                _newServicesModule(_getLibPropertiesModule().getStoreProperties()));
    }

    protected final Injector _getInjector() {
        return injector;
    }

    protected ServicesModule _newServicesModule(final StoreProperties storeProperties) {
        return new ServicesModule(storeProperties);
    }

    private final Injector injector;
}
