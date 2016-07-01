package org.dressdiscover.gui.views.institutions;

import java.util.Collection;
import java.util.Map;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableMultimap;
import com.vaadin.data.Item;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.ui.Tree;

import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.work_type.WorkType;
import org.dressdiscover.api.services.collection.CollectionQueryService;

@SuppressWarnings("serial")
final class InstitutionTree extends Tree {
    @SuppressWarnings("unchecked")
    public InstitutionTree(final EventBus eventBus,
            final ImmutableMultimap<InstitutionEntry, CollectionEntry> modelTree) {
        addContainerProperty("name", String.class, null);
        setItemCaptionMode(ItemCaptionMode.PROPERTY);
        setItemCaptionPropertyId("name");
        addItemClickListener(new ItemClickListener() {
            @Override
            public void itemClick(final ItemClickEvent event) {
                if (event.getItemId() instanceof CollectionId) {
                    eventBus.post(new CollectionQueryService.Messages.GetCollectionByIdRequest(
                            (CollectionId) event.getItemId()));
                } else if (event.getItemId() instanceof InstitutionId) {
                    if (!isExpanded(event.getItemId())) {
                        expandItem(event.getItemId());
                    } else {
                        collapseItem(event.getItemId());
                    }
                }
            }
        });

        for (final Map.Entry<InstitutionEntry, Collection<CollectionEntry>> modelTreeEntry : modelTree.asMap()
                .entrySet()) {
            final InstitutionEntry institutionEntry = modelTreeEntry.getKey();
            final Item institutionTreeItem = addItem(institutionEntry.getId());
            institutionTreeItem.getItemProperty("name")
                    .setValue("Institution: " + institutionEntry.getModel().getTitle());

            for (final CollectionEntry collectionEntry : modelTreeEntry.getValue()) {
                boolean excludeCollection;
                if (collectionEntry.getModel().getWorkTypes().isPresent()) {
                    excludeCollection = true;
                    for (final WorkType workType : collectionEntry.getModel().getWorkTypes().get().getElements()) {
                        if (workType.getText().equalsIgnoreCase("PhysicalObject")) {
                            excludeCollection = false;
                            break;
                        }
                    }
                } else {
                    excludeCollection = false;
                }

                if (excludeCollection) {
                    continue;
                }

                final Object collectionTreeItemId = collectionEntry.getModel().getExternal().or(Boolean.FALSE)
                        ? collectionEntry.getId().toString() : collectionEntry.getId();
                final Item collectionTreeItem = addItem(collectionTreeItemId);
                collectionTreeItem.getItemProperty("name")
                        .setValue("Collection: " + collectionEntry.getModel().getTitle());
                setChildrenAllowed(collectionTreeItemId, false);
                setParent(collectionTreeItemId, institutionEntry.getId());
            }
        }
    }
}
