package net.lab1318.costume.gui.components;

import com.vaadin.server.ExternalResource;

@SuppressWarnings("serial")
public final class Image extends com.vaadin.ui.Image {
    public Image(final String caption, final net.lab1318.costume.api.models.image.Image model) {
        super(caption, new ExternalResource(model.getUrl().toString()));
        setHeight(model.getHeightPx().isPresent() ? model.getHeightPx().get().floatValue() : (float) 160.0,
                Unit.PIXELS);
        setWidth(model.getWidthPx().isPresent() ? model.getWidthPx().get().floatValue() : (float) 160.0, Unit.PIXELS);
    }
}
