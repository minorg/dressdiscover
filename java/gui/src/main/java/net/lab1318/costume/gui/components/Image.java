package net.lab1318.costume.gui.components;

import org.thryft.native_.Url;

import com.vaadin.server.ExternalResource;

@SuppressWarnings("serial")
public final class Image extends com.vaadin.ui.Image {
    public Image(final String caption, final Url url) {
        super(caption, new ExternalResource(url.toString()));
        setHeight(160, Unit.PIXELS);
        setWidth(160, Unit.PIXELS);
    }
}
