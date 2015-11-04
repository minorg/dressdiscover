package net.lab1318.costume.gui.components;

import static com.google.common.base.Preconditions.checkNotNull;

import org.notaweb.gui.EventBus;
import org.thryft.native_.Url;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.vaadin.data.Container;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.object.ObjectQueryService;

@SuppressWarnings("serial")
public final class ObjectsTable extends Table {
    public ObjectsTable(final ImmutableMap<CollectionId, Collection> collections, final EventBus eventBus,
            final ImmutableMap<InstitutionId, Institution> institutions, final Container objects) {
        setContainerDataSource(objects);
        addGeneratedColumn(Object.FieldMetadata.TITLE.getJavaName(), new ColumnGenerator() {
            @Override
            public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                    final java.lang.Object columnId) {
                final ObjectId objectId = (ObjectId) source.getItem(itemId).getItemProperty("id").getValue();
                final CollectionId collectionId = (CollectionId) source.getItem(itemId)
                        .getItemProperty(Object.FieldMetadata.COLLECTION_ID.getJavaName()).getValue();
                final Collection collection = checkNotNull(collections.get(collectionId));
                final InstitutionId institutionId = (InstitutionId) source.getItem(itemId)
                        .getItemProperty(Object.FieldMetadata.INSTITUTION_ID.getJavaName()).getValue();
                final Institution institution = checkNotNull(institutions.get(institutionId));
                final String objectTitle = (String) source.getItem(itemId)
                        .getItemProperty(Object.FieldMetadata.TITLE.getJavaName()).getValue();
                @SuppressWarnings("unchecked")
                final Optional<Url> objectUrl = (Optional<Url>) source.getItem(itemId)
                        .getItemProperty(Object.FieldMetadata.URL.getJavaName()).getValue();

                final VerticalLayout layout = new VerticalLayout();
                layout.setSpacing(true);
                layout.setSizeFull();

                final Button objectTitleButton = new Button(objectTitle, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(new ObjectQueryService.Messages.GetObjectByIdRequest(objectId));
                    }
                });
                objectTitleButton.addStyleName("borderlessButton");
                layout.addComponent(objectTitleButton);
                layout.addComponent(new CollectionHeader(new CollectionEntry(collectionId, collection), eventBus,
                        new InstitutionEntry(institutionId, institution)));
                if (objectUrl.isPresent()) {
                    final Link objectLink = new Link(objectUrl.get().toString(),
                            new ExternalResource(objectUrl.get().toString()));
                    layout.addComponent(objectLink);
                    layout.setComponentAlignment(objectLink, Alignment.MIDDLE_CENTER);
                    layout.addComponent(new Label("&nbsp", ContentMode.HTML));
                }
                return layout;
            }
        });
        addGeneratedColumn(Object.FieldMetadata.THUMBNAIL.getJavaName(), new ColumnGenerator() {
            @Override
            public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                    final java.lang.Object columnId) {
                final ObjectId objectId = (ObjectId) source.getItem(itemId).getItemProperty("id").getValue();
                @SuppressWarnings("unchecked")
                final Optional<net.lab1318.costume.api.models.image.Image> thumbnail = (Optional<net.lab1318.costume.api.models.image.Image>) source
                        .getItem(itemId).getItemProperty(Object.FieldMetadata.THUMBNAIL.getJavaName()).getValue();
                if (thumbnail.isPresent()) {
                    final Image image = new Image("", thumbnail.get());
                    image.addClickListener(new ClickListener() {
                        @Override
                        public void click(final com.vaadin.event.MouseEvents.ClickEvent event) {
                            eventBus.post(new ObjectQueryService.Messages.GetObjectByIdRequest(objectId));
                        }
                    });
                    return image;
                } else {
                    return new Label();
                }
            }
        });
        setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        setVisibleColumns(Object.FieldMetadata.THUMBNAIL.getJavaName(), Object.FieldMetadata.TITLE.getJavaName());
    }
}
