package net.lab1318.costume.lib.services;

import org.junit.Before;
import org.thryft.waf.lib.PropertiesModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import net.lab1318.costume.lib.CostumeProperties;

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
        return new ServicesModule();
    }

    private final boolean readOnly;
    private final Injector injector;
    private final CostumeProperties properties;
}
