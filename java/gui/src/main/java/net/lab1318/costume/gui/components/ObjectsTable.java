package net.lab1318.costume.gui.components;

import org.notaweb.gui.EventBus;
import org.thryft.native_.Url;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.vaadin.data.Container;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
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
                final String title = (String) source.getItem(itemId)
                        .getItemProperty(Object.FieldMetadata.TITLE.getJavaName()).getValue();
                final Button button = new Button(title, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(new ObjectQueryService.Messages.GetObjectByIdRequest(objectId));
                    }
                });
                button.addStyleName("borderlessButton");
                return button;
            }
        });
        addGeneratedColumn(Object.FieldMetadata.THUMBNAIL_URL.getJavaName(), new ColumnGenerator() {
            @Override
            public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                    final java.lang.Object columnId) {
                final ObjectId objectId = (ObjectId) source.getItem(itemId).getItemProperty("id").getValue();
                @SuppressWarnings("unchecked")
                final Optional<Url> thumbnailUrl = (Optional<Url>) source.getItem(itemId)
                        .getItemProperty(Object.FieldMetadata.THUMBNAIL_URL.getJavaName()).getValue();
                if (thumbnailUrl.isPresent()) {
                    final Image image = new Image("thumbnail", thumbnailUrl.get());
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
        setVisibleColumns(Object.FieldMetadata.THUMBNAIL_URL.getJavaName(), Object.FieldMetadata.TITLE.getJavaName());
    }
}
