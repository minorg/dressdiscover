package org.dressdiscover.lib.python;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.dressdiscover.lib.properties.GlobalProperties;
import org.python.util.PythonInterpreter;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

@Singleton
public class PythonInterpreterFactory {
    @Inject
    public PythonInterpreterFactory(final Injector injector, final GlobalProperties properties) {
        injector.getInstance(PythonApi.class); // Force instantiation
        final Properties pythonInterpreterProperties = new Properties();
        final List<String> pythonPath = new ArrayList<>();
        if (properties.getPythonPath().isPresent()) {
            pythonPath.addAll(properties.getPythonPath().get());
        }
        final String jythonpath = System.getenv("JYTHONPATH");
        if (jythonpath != null) {
            pythonPath.add(jythonpath);
        }
        pythonInterpreterProperties.setProperty("python.path", StringUtils.join(pythonPath, File.pathSeparator));
        PythonInterpreter.initialize(System.getProperties(), pythonInterpreterProperties, new String[] { "" });
    }

    public final PythonInterpreter createPythonInterpreter() {
        return new PythonInterpreter();
    }
}
