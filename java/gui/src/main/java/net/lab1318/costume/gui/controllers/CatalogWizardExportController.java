package net.lab1318.costume.gui.controllers;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.thryft.waf.lib.logging.LoggingUtils;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureSetException;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;

@Singleton
@SuppressWarnings("serial")
public class CatalogWizardExportController extends HttpServlet {
    @Inject
    public CatalogWizardExportController(final WizardFeatureSetFactories featureSetFactories) {
        this.featureSetFactories = checkNotNull(featureSetFactories);
    }

    @Override
    protected final void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        // Don't use getPathInfo(), since it decodes
        final String pathInfo = req.getRequestURI();
        final String[] pathInfoSplit = pathInfo.split("/", 5);
        if (pathInfoSplit.length != 5) {
            logger.warn(logMarker, "invalid request path: {}", req.getPathInfo());
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        final String format = pathInfoSplit[2];
        final String featureSetString = pathInfoSplit[3];
        if (format.isEmpty() || featureSetString.isEmpty()) {
            logger.warn(logMarker, "invalid request path: {}", req.getPathInfo());
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        final WizardFeatureSet featureSet;
        try {
            featureSet = featureSetFactories.createFeatureSetFromUrlString(WizardMode.CATALOG, featureSetString);
        } catch (final IoException e) {
            logger.error(logMarker, "I/O exception: ", e);
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            return;
        } catch (final UnknownWizardFeatureSetException e) {
            logger.warn(logMarker, "unknown feature set '{}'", featureSetString);
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        switch (format) {
        case "csv":
            resp.setContentType("text/csv");
            resp.getWriter().write(featureSet.toCsv());
            break;
        default:
            logger.warn(logMarker, "unknown format '{}'", format);
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
    }

    private final WizardFeatureSetFactories featureSetFactories;
    private final static Logger logger = LoggerFactory.getLogger(CatalogWizardExportController.class);
    private final static Marker logMarker = LoggingUtils.getMarker(CatalogWizardExportController.class);
}
