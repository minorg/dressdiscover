package net.lab1318.costume.gui.views.wizard.catalog_wizard;

import org.apache.commons.codec.binary.Base64;
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

import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.views.wizard.AbstractWizardSummaryView;
import net.lab1318.costume.gui.views.wizard.WizardFeatureSetLayout;

@SuppressWarnings("serial")
@SessionScoped
public class CatalogWizardSummaryView extends AbstractWizardSummaryView {
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
    public void setModels(final WizardFeatureSet featureSet) {
        final Design design = new Design();

        design.exportAsCsvLink.setCaptionAsHtml(true);
        // try {
        design.exportAsCsvLink.setResource(new ExternalResource("data:text/csv;charset=utf-8;base64,"
                + Base64.encodeBase64URLSafeString(featureSet.toCsv().getBytes(Charsets.UTF_8))));
        // } catch (final UnsupportedEncodingException e) {
        // setComponentError(new SystemError("error constructing CSV data URI",
        // e));
        // return;
        // }

        design.featureSetLayout.addComponent(new WizardFeatureSetLayout(Optional.absent(), _getEventBus(), featureSet));

        setCompositionRoot(design);
    }

    public final static String NAME = "catalog_wizard_summary";
}
