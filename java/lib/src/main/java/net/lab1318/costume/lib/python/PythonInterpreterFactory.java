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
    @Inject
    public PythonInterpreterFactory(final Injector injector, final CostumeProperties properties) {
        final Properties pythonInterpreterProperties = new Properties();
        pythonInterpreterProperties.setProperty("python.path",
                new File(new File(new File(properties.getHomeDirectoryPath()), "py"), "src").toString());
        PythonInterpreter.initialize(System.getProperties(), pythonInterpreterProperties, new String[] { "" });
        this.injector = checkNotNull(injector);
    }

    public final PythonInterpreter createPythonInterpreter() {
        final PythonInterpreter pythonInterpreter = new PythonInterpreter();
        pythonInterpreter.set("injector", injector);
        return pythonInterpreter;
    }

    private final Injector injector;
}
