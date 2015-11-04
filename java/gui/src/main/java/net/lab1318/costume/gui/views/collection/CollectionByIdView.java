package net.lab1318.costume.gui.views.collection;

import org.notaweb.gui.EventBus;
import org.thryft.native_.Url;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.data.Container;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;
import com.vaadin.ui.Table.ColumnHeaderMode;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class CollectionByIdView extends TopLevelView {
    @Inject
    public CollectionByIdView(final EventBus eventBus) {
        super(eventBus);
        final VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.addComponent(headerLayout);
        rootLayout.addComponent(objectsLayout);
        setCompositionRoot(rootLayout);
    }

    public void setCollection(final CollectionEntry collectionEntry) {
        headerLayout.removeAllComponents();
        headerLayout.addComponent(new Label(collectionEntry.getModel().getTitle()));
    }

    public void setInstitution(final InstitutionEntry institutionEntry) {
    }

    public void setObjects(final Container objects) {
        objectsLayout.removeAllComponents();
        final Table objectsTable = new Table();
        objectsTable.setContainerDataSource(objects);
        objectsTable.addGeneratedColumn(Object.FieldMetadata.TITLE.getJavaName(), new ColumnGenerator() {
            @Override
            public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                    final java.lang.Object columnId) {
                final ObjectId objectId = (ObjectId) source.getItem(itemId).getItemProperty("id").getValue();
                final String title = (String) source.getItem(itemId)
                        .getItemProperty(Object.FieldMetadata.TITLE.getJavaName()).getValue();
                final Button button = new Button(title, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        _getEventBus().post(new ObjectQueryService.Messages.GetObjectByIdRequest(objectId));
                    }
                });
                button.addStyleName("borderlessButton");
                return button;
            }
        });
        objectsTable.addGeneratedColumn(Object.FieldMetadata.THUMBNAIL_URL.getJavaName(), new ColumnGenerator() {
            @Override
            public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                    final java.lang.Object columnId) {
                final ObjectId objectId = (ObjectId) source.getItem(itemId).getItemProperty("id").getValue();
                @SuppressWarnings("unchecked")
                final Optional<Url> thumbnailUrl = (Optional<Url>) source.getItem(itemId)
                        .getItemProperty(Object.FieldMetadata.THUMBNAIL_URL.getJavaName()).getValue();
                if (thumbnailUrl.isPresent()) {
                    final Image image = new Image("thumbnail", new ExternalResource(thumbnailUrl.get().toString()));
                    image.addClickListener(new ClickListener() {
                        @Override
                        public void click(final com.vaadin.event.MouseEvents.ClickEvent event) {
                            _getEventBus().post(new ObjectQueryService.Messages.GetObjectByIdRequest(objectId));
                        }
                    });
                    image.setHeight(160, Unit.PIXELS);
                    image.setWidth(160, Unit.PIXELS);
                    return image;
                } else {
                    return new Label();
                }
            }
        });
        objectsTable.setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
        objectsTable.setVisibleColumns(Object.FieldMetadata.THUMBNAIL_URL.getJavaName(),
                Object.FieldMetadata.TITLE.getJavaName());
        objectsLayout.addComponent(objectsTable);
    }

    private final GridLayout objectsLayout = new GridLayout();
    private final VerticalLayout headerLayout = new VerticalLayout();
    public final static String NAME = "collection_by_id";
}
