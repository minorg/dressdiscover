package org.dressdiscover.lib.services;

import org.dressdiscover.lib.CostumeProperties;
import org.dressdiscover.lib.services.ServicesModule;
import org.junit.Before;
import org.thryft.waf.lib.PropertiesModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

public abstract class ServiceTest {
    protected ServiceTest() {
        this(false);
    }

    protected ServiceTest(final boolean readOnly) {
        this.readOnly = readOnly;

        properties = CostumeProperties.load();

        injector = Guice.createInjector(new PropertiesModule<CostumeProperties>(properties),
                _newServicesModule(properties));
    }

    @Before
    public final void checkReadWrite() {
        if (!readOnly) {
            if (!properties.getEnvironment().equals("dev") && !properties.getEnvironment().equals("jenkins")) {
                throw new AssertionError();
            }
        }
    }

    protected Injector _getInjector() {
        return injector;
    }

    protected ServicesModule _newServicesModule(final CostumeProperties properties) {
        return new ServicesModule(properties);
    }

    private final boolean readOnly;
    private final Injector injector;
    private final CostumeProperties properties;
}