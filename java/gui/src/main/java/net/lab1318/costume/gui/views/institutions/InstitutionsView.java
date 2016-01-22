package net.lab1318.costume.gui.views.institutions;

import java.util.Collection;
import java.util.Map;

import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableMultimap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.data.Item;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.ui.AbstractSelect.ItemCaptionMode;
import com.vaadin.ui.Tree;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.work_type.WorkType;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class InstitutionsView extends TopLevelView {
    @Inject
    public InstitutionsView(final EventBus eventBus) {
        super(eventBus);
    }

    @SuppressWarnings("unchecked")
    public void setModels(final ImmutableMultimap<InstitutionEntry, CollectionEntry> modelTree) {
        final Tree viewTree = new Tree();
        viewTree.addContainerProperty("name", String.class, null);
        viewTree.setItemCaptionMode(ItemCaptionMode.PROPERTY);
        viewTree.setItemCaptionPropertyId("name");
        viewTree.addItemClickListener(new ItemClickListener() {
            @Override
            public void itemClick(final ItemClickEvent event) {
                if (event.getItemId() instanceof CollectionId) {
                    _getEventBus().post(new CollectionQueryService.Messages.GetCollectionByIdRequest(
                            (CollectionId) event.getItemId()));
                } else if (event.getItemId() instanceof InstitutionId) {
                    if (!viewTree.isExpanded(event.getItemId())) {
                        viewTree.expandItem(event.getItemId());
                    } else {
                        viewTree.collapseItem(event.getItemId());
                    }
                }
            }
        });

        for (final Map.Entry<InstitutionEntry, Collection<CollectionEntry>> modelTreeEntry : modelTree.asMap()
                .entrySet()) {
            final InstitutionEntry institutionEntry = modelTreeEntry.getKey();
            final Item institutionTreeItem = viewTree.addItem(institutionEntry.getId());
            institutionTreeItem.getItemProperty("name").setValue(institutionEntry.getModel().getTitle());

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

                final Item collectionTreeItem = viewTree.addItem(collectionEntry.getId());
                collectionTreeItem.getItemProperty("name").setValue(collectionEntry.getModel().getTitle());
                viewTree.setChildrenAllowed(collectionEntry.getId(), false);
                viewTree.setParent(collectionEntry.getId(), institutionEntry.getId());
            }
        }

        setCompositionRoot(viewTree);
    }

    public final static String NAME = "institutions";
}
