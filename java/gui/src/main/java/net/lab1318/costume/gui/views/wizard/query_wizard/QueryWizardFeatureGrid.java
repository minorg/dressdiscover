package net.lab1318.costume.gui.views.wizard.query_wizard;

import org.thryft.waf.gui.EventBus;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Link;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.gui.components.ImageWithRightsLayout;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureValue;

@SuppressWarnings("serial")
final class QueryWizardFeatureGrid extends GridLayout {
    private static int __getRowCount(final WizardFeature feature) {
        int rowCount = feature.getValues().size() / 4;
        if (feature.getValues().size() % 4 != 0) {
            rowCount++;
        }
        return rowCount;
    }

    QueryWizardFeatureGrid(final EventBus eventBus, final WizardFeature feature) {
        super(4, __getRowCount(feature));
        setSizeFull();
        setSpacing(true);
        int columnI = 0;
        int rowI = 0;
        for (final WizardFeatureValue featureValue : feature.getValues()) {
            final VerticalLayout availableFeatureLayout = new VerticalLayout();

            final ImageWithRightsLayout thumbnailImage = new ImageWithRightsLayout("",
                    featureValue.getImage().getSquareThumbnail().get(), featureValue.getImage().getRights());
            availableFeatureLayout.addComponent(thumbnailImage);
            availableFeatureLayout.setComponentAlignment(thumbnailImage, Alignment.MIDDLE_CENTER);

            final HorizontalLayout captionLayout = new HorizontalLayout();
            captionLayout.setSizeFull();
            final CheckBox checkBox = new CheckBox(featureValue.getName());
            checkBox.setValue(featureValue.isSelected());
            thumbnailImage.addClickListener(new ClickListener() {
                @Override
                public void click(final ClickEvent event) {
                    checkBox.setValue(!checkBox.getValue());
                    featureValue.setSelected(checkBox.getValue());
                    eventBus.post(new WizardFeatureRefreshRequest());
                }

            });
            captionLayout.addComponent(checkBox);
            captionLayout.setComponentAlignment(checkBox, Alignment.MIDDLE_CENTER);
            if (featureValue.getImage().getOriginal().isPresent()) {
                final Link originalLink = new Link("",
                        new ExternalResource(featureValue.getImage().getOriginal().get().getUrl().toString()));
                originalLink.setTargetName("_blank");
                originalLink.setIcon(FontAwesome.SEARCH_PLUS);
                captionLayout.addComponent(originalLink);
                captionLayout.setComponentAlignment(originalLink, Alignment.MIDDLE_CENTER);
            }
            availableFeatureLayout.addComponent(captionLayout);

            addComponent(availableFeatureLayout, columnI, rowI);
            if (++columnI == 4) {
                columnI = 0;
                rowI++;
            }
        }
    }
}
