package net.lab1318.costume.gui.views;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.native_.Url;

import com.google.common.base.Optional;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.image.ImageVersion;
import net.lab1318.costume.api.models.rights.RightsSet;
import net.lab1318.costume.gui.models.image.ImageVersionBean;
import net.lab1318.costume.gui.models.rights.RightsBean;
import net.lab1318.costume.gui.models.rights.RightsSetBean;

@SuppressWarnings("serial")
public final class ImageWithRightsView extends CustomComponent {
	public ImageWithRightsView(final String caption, final ImageVersion model, final Optional<RightsSet> rights) {
		this(caption, new ImageVersionBean(model),
				rights.isPresent() ? Optional.of(new RightsSetBean(rights.get())) : Optional.absent());
	}

	public ImageWithRightsView(final String caption, final ImageVersionBean model,
			final Optional<RightsSetBean> rights) {
		checkNotNull(model);

		final VerticalLayout rootLayout = new VerticalLayout();
		rootLayout.setSizeFull();
		setSizeFull();

		image = new Image(caption, new ExternalResource(model.getUrl().toString()));
		if (model.getHeightPx() != null) {
			image.setHeight(model.getHeightPx().floatValue(), Unit.PIXELS);
		}
		if (model.getWidthPx() != null) {
			image.setWidth(model.getWidthPx().floatValue(), Unit.PIXELS);
			setWidth(model.getWidthPx().floatValue(), Unit.PIXELS);
		}
		rootLayout.addComponent(image);

		if (rights.isPresent()) {
			for (final RightsBean rights_ : rights.get().getElements()) {
				final VerticalLayout rightsLayout = new VerticalLayout();
				final Component typeLabel;
				switch (rights_.getType()) {
				case COPYRIGHTED:
					typeLabel = new Label("Image copyright: " + rights_.getText());
					break;
				case LICENSED:
					final String typeLabelText = "Image license: " + rights_.getText();
					if (rights_.getLicenseVocabRef() != null && rights_.getLicenseVocabRef().getUri() instanceof Url) {
						typeLabel = new Link(typeLabelText,
								new ExternalResource(rights_.getLicenseVocabRef().getUri().toString()));
					} else {
						typeLabel = new Label(typeLabelText);
					}
					break;
				case OTHER:
					continue;
				case PUBLIC_DOMAIN:
					typeLabel = new Label("Image license: public domain");
					break;
				case UNDETERMINED:
					continue;
				default:
					throw new UnsupportedOperationException();
				}
				typeLabel.setStyleName("small");
				rightsLayout.addComponent(typeLabel);

				if (rights_.getRightsHolder() != null) {
					final Label rightsHolderLabel = new Label("Image rights holder: " + rights_.getRightsHolder());
					rightsHolderLabel.setStyleName("small");
					rightsLayout.addComponent(rightsHolderLabel);
				}

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
