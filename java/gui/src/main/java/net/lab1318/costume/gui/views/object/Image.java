package net.lab1318.costume.gui.views.object;

import org.thryft.native_.Url;

import com.google.common.base.Optional;
import com.google.common.primitives.UnsignedInteger;
import com.vaadin.server.ExternalResource;

@SuppressWarnings("serial")
final class Image extends com.vaadin.ui.Image {
	public Image(final String caption, final Optional<UnsignedInteger> heightPx, final Url url,
			final Optional<UnsignedInteger> widthPx) {
		super(caption, new ExternalResource(url.toString()));

		if (heightPx.isPresent()) {
			setHeight(heightPx.get().floatValue(), Unit.PIXELS);
		}

		if (widthPx.isPresent()) {
			setWidth(widthPx.get().floatValue(), Unit.PIXELS);
		}
	}
}
