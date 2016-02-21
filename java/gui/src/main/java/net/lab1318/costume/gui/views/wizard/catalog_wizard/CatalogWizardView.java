package net.lab1318.costume.gui.views.wizard.catalog_wizard;

import org.thryft.waf.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class CatalogWizardView extends TopLevelView {
    @DesignRoot("QueryWizardView.html")
    private final static class Design extends VerticalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Button costumeCoreButton = null;
    }

    @Inject
    public CatalogWizardView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels() {
        final Design design = new Design();
        design.costumeCoreButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                // UI.getCurrent().getNavigator()
                // .navigateTo(QueryWizardFeatureView.NAME + "/" +
                // CostumeCoreWizardFeatureSet.URL_NAME);
            }
        });
        setCompositionRoot(design);
    }

    public final static String NAME = "catalog_wizard";
}
