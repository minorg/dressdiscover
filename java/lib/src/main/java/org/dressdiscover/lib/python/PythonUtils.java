package org.dressdiscover.lib.python;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.python.core.PyException;
import org.slf4j.Logger;
import org.slf4j.Marker;

public final class PythonUtils {
    public static void log(final Logger logger, final Marker logMarker, final PyException e) {
        String pyStackTrace;
        {
            final StringWriter pyStackTraceStringWriter = new StringWriter();
            final PrintWriter pyStackTracePrintWriter = new PrintWriter(pyStackTraceStringWriter);
            e.printStackTrace(pyStackTracePrintWriter);
            pyStackTracePrintWriter.flush();
            pyStackTrace = pyStackTraceStringWriter.toString();
        }

        logger.error(logMarker, "Python exception: value={}\ntraceback=\n{}", e.value.toString(), pyStackTrace);
    }

    private PythonUtils() {
    }
}
