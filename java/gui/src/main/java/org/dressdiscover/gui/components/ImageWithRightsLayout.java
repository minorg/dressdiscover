package org.dressdiscover.gui.components;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Link;
import com.vaadin.ui.VerticalLayout;

import org.dressdiscover.api.models.image.ImageVersion;
import org.dressdiscover.api.models.rights.RightsSet;
import org.dressdiscover.gui.models.image.ImageVersionBean;
import org.dressdiscover.gui.models.rights.RightsSetBean;

@SuppressWarnings("serial")
public final class ImageWithRightsLayout extends CustomComponent {
    public ImageWithRightsLayout(final String caption, final Optional<ImageVersion> largerModel,
            final ImageVersion model, final Optional<RightsSet> rights) {
        this(caption,
                largerModel.isPresent() ? Optional.of(new ImageVersionBean(largerModel.get())) : Optional.absent(),
                new ImageVersionBean(model),
                rights.isPresent() ? Optional.of(new RightsSetBean(rights.get())) : Optional.absent());
    }

    public ImageWithRightsLayout(final String caption, final Optional<ImageVersionBean> largerModel,
            final ImageVersionBean model, final Optional<RightsSetBean> rights) {
        checkNotNull(model);

        final VerticalLayout rootLayout = new VerticalLayout();

        image = new Image(caption, new ExternalResource(model.getUrl().toString()));
        if (model.getHeightPx() != null) {
            image.setHeight(model.getHeightPx().floatValue(), Unit.PIXELS);
        }
        if (model.getWidthPx() != null) {
            image.setWidth(model.getWidthPx().floatValue(), Unit.PIXELS);
            setWidth(model.getWidthPx().floatValue(), Unit.PIXELS);
        }
        rootLayout.addComponent(image);

        if (largerModel.isPresent()) {
            final Link originalLink = new Link("", new ExternalResource(largerModel.get().getUrl().toString()));
            originalLink.setTargetName("_blank");
            originalLink.setIcon(FontAwesome.SEARCH_PLUS);
            rootLayout.addComponent(originalLink);
            rootLayout.setComponentAlignment(originalLink, Alignment.MIDDLE_LEFT);
        }

        if (rights.isPresent()) {
            final RightsLayout rightsLayout = new RightsLayout("Image", rights.get());
            if (!rightsLayout.isEmpty()) {
                rootLayout.addComponent(rightsLayout);
            }
        }

        setCompositionRoot(rootLayout);
    }

    public void addClickListener(final ClickListener clickListener) {
        image.addClickListener(clickListener);
    }

    private final Image image;
}
