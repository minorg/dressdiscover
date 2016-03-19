package net.lab1318.costume.gui.views.object_by_id;

import org.apache.commons.lang3.StringUtils;
import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.models.relation.Relation;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.gui.events.object_by_id.ObjectAddMetadataRequest;
import net.lab1318.costume.gui.events.object_by_id.ObjectMoreLikeThisRequest;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class ObjectByIdView extends TopLevelView {
    @DesignRoot("ObjectByIdView.html")
    private final static class Design extends VerticalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Button addMetadataButton;
        Layout carouselLayout;
        Button collectionButton;
        Button institutionButton;
        Button moreLikeThisButton;
        Layout objectEntryFormLayout;
    }

    @Inject
    public ObjectByIdView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final CollectionEntry collectionEntry, final InstitutionEntry institutionEntry,
            final ObjectEntry objectEntry,
            final ImmutableMap<ObjectId, ObjectSummaryEntry> relatedObjectSummaryEntries) {
        final Design design = new Design();

        design.addMetadataButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus().post(new ObjectAddMetadataRequest(objectEntry.getId()));
            }
        });

        design.collectionButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus()
                        .post(new CollectionQueryService.Messages.GetCollectionByIdRequest(collectionEntry.getId()));
            }
        });
        design.collectionButton.setCaption("Collection: " + collectionEntry.getModel().getTitle());

        design.institutionButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus()
                        .post(new InstitutionQueryService.Messages.GetInstitutionByIdRequest(institutionEntry.getId()));
            }
        });
        design.institutionButton.setCaption("Institution: " + institutionEntry.getModel().getTitle());

        design.moreLikeThisButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                _getEventBus().post(new ObjectMoreLikeThisRequest(objectEntry.getId()));
            }
        });

        design.objectEntryFormLayout
                .addComponent(new ObjectEntryForm(_getEventBus(), objectEntry, institutionEntry.getModel()));

        if (objectEntry.getModel().getRelations().isPresent()) {
            design.carouselLayout.addComponent(new Label("&nbsp;", ContentMode.HTML));

            for (final Relation relation : objectEntry.getModel().getRelations().get().getElements()) {
                if (!relation.getRelids().isPresent()) {
                    continue;
                }
                final ImmutableList.Builder<ObjectSummaryEntry> relationObjectSummaryEntriesBuilder = ImmutableList
                        .builder();
                for (final ObjectId relid : relation.getRelids().get()) {
                    final ObjectSummaryEntry relatedObjectSummaryEntry = relatedObjectSummaryEntries.get(relid);
                    if (relatedObjectSummaryEntry != null) {
                        relationObjectSummaryEntriesBuilder.add(relatedObjectSummaryEntry);
                    }
                }
                final ImmutableList<ObjectSummaryEntry> relationObjectSummaryEntries = relationObjectSummaryEntriesBuilder
                        .build();
                if (!relationObjectSummaryEntries.isEmpty()) {
                    final StringBuilder relationTypeDisplayNameBuilder = new StringBuilder();
                    int wordI = 0;
                    for (final String word : relation.getType().name().split("_")) {
                        if (wordI++ > 0) {
                            relationTypeDisplayNameBuilder.append(' ');
                        }
                        relationTypeDisplayNameBuilder.append(StringUtils.capitalize(word.toLowerCase()));
                    }
                    design.carouselLayout.addComponent(new ObjectSummaryEntriesCarousel(
                            relationTypeDisplayNameBuilder.toString() + ' ' + relation.getText().or(""), _getEventBus(),
                            relationObjectSummaryEntries));
                }
            }
        }

        setCompositionRoot(design);
    }

    public final static String NAME = "object_by_id";
}
