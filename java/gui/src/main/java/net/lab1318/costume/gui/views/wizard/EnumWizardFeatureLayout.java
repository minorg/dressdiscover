package net.lab1318.costume.gui.views.wizard;

import org.thryft.native_.Url;
import org.thryft.waf.gui.EventBus;

import com.google.common.primitives.UnsignedInteger;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.image.Image;
import net.lab1318.costume.api.models.image.ImageVersion;
import net.lab1318.costume.gui.components.ImageWithRightsLayout;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.models.wizard.EnumWizardFeature;
import net.lab1318.costume.gui.models.wizard.EnumWizardFeatureValue;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;

@SuppressWarnings("serial")
public final class EnumWizardFeatureLayout extends VerticalLayout {
    private static int __getRowCount(final EnumWizardFeature feature) {
        int rowCount = feature.getValues().size() / 4;
        if (feature.getValues().size() % 4 != 0) {
            rowCount++;
        }
        return rowCount;
    }

    public EnumWizardFeatureLayout(final EventBus eventBus, final EnumWizardFeature feature,
            final WizardFeatureSet featureSet) {
        setStyleName("enum-wizard-feature-layout");

        final Button resetButton = new Button("Reset", new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                feature.resetSelected();
                eventBus.post(new WizardFeatureRefreshRequest(feature, featureSet));
            }
        });
        resetButton.setStyleName("reset-button");
        addComponent(resetButton);

        final GridLayout grid = new GridLayout(4, __getRowCount(feature));
        grid.setSpacing(true);
        grid.setStyleName("grid");
        int columnI = 0;
        int rowI = 0;
        for (final EnumWizardFeatureValue featureValue : feature.getValues()) {
            final VerticalLayout featureValueLayout = new VerticalLayout();
            featureValueLayout.setSpacing(true);
            featureValueLayout.setStyleName("feature-value-layout");

            final Image image = featureValue.getImage().or(placeholderImage);

            final ImageWithRightsLayout thumbnailImage = new ImageWithRightsLayout("", image.getOriginal(),
                    image.getSquareThumbnail().get(), image.getRights());
            thumbnailImage.setStyleName("thumbnail");
            featureValueLayout.addComponent(thumbnailImage);

            final HorizontalLayout captionLayout = new HorizontalLayout();
            captionLayout.setStyleName("caption-layout");
            final CheckBox checkBox = new CheckBox(featureValue.getName(), featureValue.isSelected());
            checkBox.setStyleName("caption-checkbox");
            thumbnailImage.addClickListener(new ClickListener() {
                @Override
                public void click(final ClickEvent event) {
                    checkBox.setValue(!checkBox.getValue());
                    featureValue.setSelected(checkBox.getValue());
                    eventBus.post(new WizardFeatureRefreshRequest(feature, featureSet));
                }
            });
            captionLayout.addComponent(checkBox);
            featureValueLayout.addComponent(captionLayout);

            grid.addComponent(featureValueLayout, columnI, rowI);
            if (++columnI == 4) {
                columnI = 0;
                rowI++;
            }
        }
        addComponent(grid);
    }

    private final static Image placeholderImage = Image.builder()
            .setSquareThumbnail(ImageVersion.builder().setHeightPx(UnsignedInteger.valueOf(200))
                    .setUrl(Url.parse("http://placehold.it/200x200?text=Missing%20image"))
                    .setWidthPx(UnsignedInteger.valueOf(200)).build())
            .build();
}
