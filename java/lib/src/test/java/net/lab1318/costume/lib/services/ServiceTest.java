package net.lab1318.costume.lib.services;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.notaweb.lib.PropertiesModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.services.ServicesModule;

public abstract class ServiceTest {
    protected ServiceTest() {
        this(false);
    }

    protected ServiceTest(final boolean readOnly) {
        this.readOnly = readOnly;

        properties = CostumeProperties.load();

        injector = Guice.createInjector(new PropertiesModule<CostumeProperties>(properties), _newServicesModule());
    }

    @Before
    public final void checkReadWrite() {
        if (!readOnly) {
            assertEquals("dev", properties.getEnvironment());
        }
    }

    protected Injector _getInjector() {
        return injector;
    }

    protected ServicesModule _newServicesModule() {
        return new ServicesModule();
    }

    private final boolean readOnly;
    private final Injector injector;
    private final CostumeProperties properties;
}