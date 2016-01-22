package net.lab1318.costume.gui.views.object_by_id;

import org.vaadin.virkki.carousel.HorizontalCarousel;
import org.vaadin.virkki.carousel.client.widget.gwt.ArrowKeysMode;
import org.vaadin.virkki.carousel.client.widget.gwt.CarouselLoadMode;

import com.google.common.collect.ImmutableList;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

import net.lab1318.costume.api.models.object.ObjectSummaryEntry;

@SuppressWarnings("serial")
public final class ObjectSummaryEntriesCarousel extends CustomComponent {
    public ObjectSummaryEntriesCarousel(final String caption,
            final ImmutableList<ObjectSummaryEntry> objectSummaryEntries) {
        final HorizontalCarousel carousel = new HorizontalCarousel();
        carousel.setArrowKeysMode(ArrowKeysMode.FOCUS);
        carousel.setLoadMode(CarouselLoadMode.LAZY);
        carousel.setTransitionDuration(500);

        carousel.addComponent(new Button("First child"));
        carousel.addComponent(new Label("Second child"));
        carousel.addComponent(new TextField("Third child"));

        setCompositionRoot(carousel);
    }
}
