package net.lab1318.costume.gui.views.wizard.query_wizard;

import org.thryft.native_.Url;
import org.thryft.waf.gui.EventBus;

import com.google.common.primitives.UnsignedInteger;
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

import net.lab1318.costume.api.models.image.Image;
import net.lab1318.costume.api.models.image.ImageVersion;
import net.lab1318.costume.gui.components.ImageWithRightsLayout;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.models.wizard.EnumWizardFeature;
import net.lab1318.costume.gui.models.wizard.EnumWizardFeatureValue;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;

@SuppressWarnings("serial")
final class QueryEnumWizardFeatureGrid extends GridLayout {
    private static int __getRowCount(final EnumWizardFeature feature) {
        int rowCount = feature.getValues().size() / 4;
        if (feature.getValues().size() % 4 != 0) {
            rowCount++;
        }
        return rowCount;
    }

    QueryEnumWizardFeatureGrid(final EventBus eventBus, final EnumWizardFeature feature,
            final WizardFeatureSet featureSet) {
        super(4, __getRowCount(feature));
        setSizeFull();
        setSpacing(true);
        int columnI = 0;
        int rowI = 0;
        for (final EnumWizardFeatureValue featureValue : feature.getValues()) {
            final VerticalLayout availableFeatureLayout = new VerticalLayout();

            final Image image = featureValue.getImage().or(placeholderImage);

            final ImageWithRightsLayout thumbnailImage = new ImageWithRightsLayout("", image.getSquareThumbnail().get(),
                    image.getRights());
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
                    eventBus.post(new WizardFeatureRefreshRequest(feature, featureSet));
                }

            });
            captionLayout.addComponent(checkBox);
            captionLayout.setComponentAlignment(checkBox, Alignment.MIDDLE_CENTER);
            if (image.getOriginal().isPresent()) {
                final Link originalLink = new Link("",
                        new ExternalResource(image.getOriginal().get().getUrl().toString()));
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

    private final static Image placeholderImage = Image.builder()
            .setSquareThumbnail(ImageVersion.builder().setHeightPx(UnsignedInteger.valueOf(200))
                    .setUrl(Url.parse("http://placehold.it/200x200?text=Missing%20image"))
                    .setWidthPx(UnsignedInteger.valueOf(200)).build())
            .build();
}
