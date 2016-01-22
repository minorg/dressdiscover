package net.lab1318.costume.gui.views.object_by_id;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.image.ImageVersion;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.object.ObjectQueryService;

@SuppressWarnings("serial")
public final class ObjectSummaryEntriesCarousel extends CustomComponent {
    public ObjectSummaryEntriesCarousel(final String caption, final EventBus eventBus,
            final ImmutableList<ObjectSummaryEntry> objectSummaryEntries) {
        final HorizontalLayout carousel = new HorizontalLayout();
        carousel.setSpacing(true);

        for (final ObjectSummaryEntry objectSummaryEntry : objectSummaryEntries) {
            final Button titleButton = new NativeButton(objectSummaryEntry.getModel().getTitle(),
                    new Button.ClickListener() {
                        @Override
                        public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                            eventBus.post(
                                    new ObjectQueryService.Messages.GetObjectByIdRequest(objectSummaryEntry.getId()));
                        }
                    });

            if (objectSummaryEntry.getModel().getImage().isPresent()) {
                final net.lab1318.costume.api.models.image.Image imageModel = objectSummaryEntry.getModel().getImage()
                        .get();
                final Optional<ImageVersion> imageVersionModel = imageModel.getSquareThumbnail()
                        .or(imageModel.getThumbnail());
                if (imageVersionModel.isPresent()) {
                    final VerticalLayout imageLayout = new VerticalLayout();
                    final Image imageView = new Image("",
                            new ExternalResource(imageVersionModel.get().getUrl().toString()));
                    if (imageVersionModel.get().getHeightPx().isPresent()) {
                        imageView.setHeight(imageVersionModel.get().getHeightPx().get().floatValue(), Unit.PIXELS);
                    }
                    if (imageVersionModel.get().getWidthPx().isPresent()) {
                        imageView.setWidth(imageVersionModel.get().getWidthPx().get().floatValue(), Unit.PIXELS);
                    }
                    imageView.addClickListener(new ClickListener() {
                        @Override
                        public void click(final ClickEvent event) {
                            eventBus.post(
                                    new ObjectQueryService.Messages.GetObjectByIdRequest(objectSummaryEntry.getId()));
                        }
                    });
                    imageLayout.addComponent(imageView);
                    imageLayout.addComponent(titleButton);
                    carousel.addComponent(imageLayout);
                    continue;
                }
            }

            carousel.addComponent(titleButton);
        }

        final Panel panel = new Panel(caption, carousel);
        panel.setSizeFull();
        setCompositionRoot(panel);
    }
}
