package net.lab1318.costume.gui.views.wizard.catalog_wizard;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Link;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.gui.models.wizard.catalog_wizard.CatalogWizardState;
import net.lab1318.costume.gui.views.wizard.AbstractWizardSummaryView;
import net.lab1318.costume.gui.views.wizard.WizardFeatureSetLayout;

@SuppressWarnings("serial")
@SessionScoped
public class CatalogWizardSummaryView extends AbstractWizardSummaryView<CatalogWizardState> {
    @DesignRoot("CatalogWizardSummaryView.html")
    private final static class Design extends VerticalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Link exportAsCsvLink;
        Layout featureSetLayout;
    }

    @Inject
    public CatalogWizardSummaryView(final EventBus eventBus) {
        super(eventBus);
    }

    @Override
    public void setModels(final CatalogWizardState state) {
        final Design design = new Design();

        design.exportAsCsvLink.setCaptionAsHtml(true);
        try {
            design.exportAsCsvLink.setResource(new ExternalResource(
                    "/catalog_wizard_export/csv/" + state.getFeatureSet().getSelectedAsUrlEncodedString() + "/"
                            + URLEncoder.encode(state.getFeatureSet().getExportFileBaseName(), Charsets.UTF_8.name())
                                    .replace("+", "%20")
                            + ".csv"));
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
        design.exportAsCsvLink.setTargetName("_blank");
        design.featureSetLayout.addComponent(new WizardFeatureSetLayout(Optional.absent(), _getEventBus(), state));

        setCompositionRoot(design);
    }

    public final static String NAME = "catalog_wizard_summary";
}
