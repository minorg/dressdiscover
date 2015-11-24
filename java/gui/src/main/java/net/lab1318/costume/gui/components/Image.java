package net.lab1318.costume.gui.components;

import com.google.common.base.Optional;
import com.google.common.primitives.UnsignedInteger;
import com.vaadin.server.ExternalResource;

@SuppressWarnings("serial")
public final class Image extends com.vaadin.ui.Image {
    public Image(final String caption, final Optional<UnsignedInteger> heightPxDefault,
            final net.lab1318.costume.api.models.image.Image model, final Optional<UnsignedInteger> widthPxDefault) {
        super(caption, new ExternalResource(model.getUrl().toString()));

        final Optional<UnsignedInteger> heightPx = model.getHeightPx().or(heightPxDefault);
        if (heightPx.isPresent()) {
            setHeight(heightPx.get().floatValue(), Unit.PIXELS);
        }

        final Optional<UnsignedInteger> widthPx = model.getHeightPx().or(widthPxDefault);
        if (widthPx.isPresent()) {
            setWidth(widthPx.get().floatValue(), Unit.PIXELS);
        }
    }
}
