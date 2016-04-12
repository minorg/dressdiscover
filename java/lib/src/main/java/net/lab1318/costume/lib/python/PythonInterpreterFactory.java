package net.lab1318.costume.lib.python;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.util.Properties;

import org.python.util.PythonInterpreter;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

import net.lab1318.costume.lib.CostumeProperties;

@Singleton
public class PythonInterpreterFactory {
    public static PythonInterpreterFactory getInstance() {
        return instance;
    }

    @Inject
    public PythonInterpreterFactory(final Injector injector, final CostumeProperties properties) {
        final Properties pythonInterpreterProperties = new Properties();
        pythonInterpreterProperties.setProperty("python.path",
                new File(new File(new File(properties.getHomeDirectoryPath()), "py"), "src").toString());
        PythonInterpreter.initialize(System.getProperties(), pythonInterpreterProperties, new String[] { "" });
        this.injector = checkNotNull(injector);
        instance = this;
    }

    public final PythonInterpreter createPythonInterpreter() {
        return new PythonInterpreter();
    }

    public final Injector getInjector() {
        return injector;
    }

    private final Injector injector;
    private static PythonInterpreterFactory instance;
}
