package net.lab1318.costume.gui.views.object_by_id;

import org.apache.commons.lang3.StringUtils;
import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.models.relation.Relation;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.gui.events.object_by_id.ObjectMoreLikeThisRequest;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class ObjectByIdView extends TopLevelView {
    @Inject
    public ObjectByIdView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final CollectionEntry collectionEntry, final InstitutionEntry institutionEntry,
            final ObjectEntry objectEntry,
            final ImmutableMap<ObjectId, ObjectSummaryEntry> relatedObjectSummaryEntries) {
        final VerticalLayout rootLayout = new VerticalLayout();

        {
            final HorizontalLayout headerLayout = new HorizontalLayout();
            headerLayout.setSizeFull();

            {
                final VerticalLayout leftHeaderLayout = new VerticalLayout();
                leftHeaderLayout.setSpacing(true);
                {
                    final Button institutionButton = new NativeButton(
                            "Institution: " + institutionEntry.getModel().getTitle(), new Button.ClickListener() {
                                @Override
                                public void buttonClick(final ClickEvent event) {
                                    _getEventBus().post(new InstitutionQueryService.Messages.GetInstitutionByIdRequest(
                                            institutionEntry.getId()));
                                }
                            });
                    leftHeaderLayout.addComponent(institutionButton);
                }
                {
                    final Button collectionButton = new NativeButton(
                            "Collection: " + collectionEntry.getModel().getTitle(), new Button.ClickListener() {
                                @Override
                                public void buttonClick(final ClickEvent event) {
                                    _getEventBus().post(new CollectionQueryService.Messages.GetCollectionByIdRequest(
                                            collectionEntry.getId()));
                                }
                            });
                    leftHeaderLayout.addComponent(collectionButton);
                }

                headerLayout.addComponent(leftHeaderLayout);
                headerLayout.setExpandRatio(leftHeaderLayout, 1);
            }

            {
                final Button moreLikeThisButton = new NativeButton("More like this", new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        _getEventBus().post(new ObjectMoreLikeThisRequest());
                    }
                });
                headerLayout.addComponent(moreLikeThisButton);
                headerLayout.setComponentAlignment(moreLikeThisButton, Alignment.MIDDLE_CENTER);
                headerLayout.setExpandRatio(moreLikeThisButton, 1);
            }

            rootLayout.addComponent(headerLayout);
        }

        rootLayout.addComponent(new ObjectEntryForm(_getEventBus(), objectEntry, institutionEntry.getModel()));

        if (objectEntry.getModel().getRelations().isPresent()) {
            rootLayout.addComponent(new Label("&nbsp;", ContentMode.HTML));

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
                    rootLayout.addComponent(new ObjectSummaryEntriesCarousel(
                            relationTypeDisplayNameBuilder.toString() + ' ' + relation.getText().or(""), _getEventBus(),
                            relationObjectSummaryEntries));
                }
            }
        }

        setCompositionRoot(rootLayout);
    }

    public final static String NAME = "object_by_id";
}
