package net.lab1318.costume.gui.views.object;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import org.notaweb.gui.EventBus;
import org.thryft.native_.Url;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.collect.ImmutableMap;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.gui.models.image.ImageBean;

@SuppressWarnings("serial")
final class ObjectsTable extends CustomComponent {
    public ObjectsTable(final ImmutableMap<CollectionId, Collection> collections, final EventBus eventBus,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectFacets objectFacets,
            final LazyQueryContainer objects) {
        final Map<String, String> columns = new LinkedHashMap<>();
        {
            columns.put(Object.FieldMetadata.IMAGES.getJavaName(), "");
            columns.put(Object.FieldMetadata.TITLE.getJavaName(), "Title");
            columns.put(Object.FieldMetadata.DATE_TEXT.getJavaName(), "Date");
            columns.put(Object.FieldMetadata.INSTITUTION_ID.getJavaName(), "Institution");
            columns.put(Object.FieldMetadata.COLLECTION_ID.getJavaName(), "Collection");
            if (objectFacets.getUrlExists()) {
                columns.put(Object.FieldMetadata.URL.getJavaName(), "URL");
            }
        }

        final Table table = new Table();
        table.setContainerDataSource(objects);
        table.setPageLength(6);
        table.setSizeFull();
        table.setVisibleColumns(columns.keySet().toArray());
        {
            final String[] columnHeaders = new String[columns.size()];
            columns.values().toArray(columnHeaders);
            table.setColumnHeaders(columnHeaders);
        }

        table.addGeneratedColumn(Object.FieldMetadata.COLLECTION_ID.getJavaName(), new ColumnGenerator() {
            @Override
            public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                    final java.lang.Object columnId) {
                final CollectionId collectionId = (CollectionId) source.getContainerDataSource()
                        .getContainerProperty(itemId, columnId).getValue();
                return new NativeButton(collections.get(collectionId).getTitle(), new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(new CollectionQueryService.Messages.GetCollectionByIdRequest(collectionId));
                    }
                });
            }
        });

        table.addGeneratedColumn(Object.FieldMetadata.IMAGES.getJavaName(), new ColumnGenerator() {
            @Override
            public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                    final java.lang.Object columnId) {
                @SuppressWarnings("unchecked")
                final List<ImageBean> images = (List<ImageBean>) source.getContainerDataSource()
                        .getContainerProperty(itemId, columnId).getValue();
                if (images == null || images.isEmpty()) {
                    return new Label(); // TODO: return an empty image
                }
                @Nullable
                ImageBean squareThumbnailModel = null;
                @Nullable
                ImageBean thumbnailModel = null;
                for (final ImageBean imageModel : images) {
                    if (imageModel.getType() == null) {
                        continue;
                    }
                    switch (imageModel.getType()) {
                    case SQUARE_THUMBNAIL:
                        squareThumbnailModel = imageModel;
                        break;
                    case THUMBNAIL:
                        thumbnailModel = imageModel;
                        break;
                    default:
                        break;
                    }
                }

                @Nullable
                ImageBean selectedThumbnailModel;
                if (squareThumbnailModel != null) {
                    selectedThumbnailModel = squareThumbnailModel;
                } else if (thumbnailModel != null) {
                    selectedThumbnailModel = thumbnailModel;
                } else {
                    selectedThumbnailModel = null;
                }

                if (selectedThumbnailModel != null) {
                    final Image thumbnailView = new Image("", selectedThumbnailModel);
                    thumbnailView.addStyleName("thumbnail");
                    return thumbnailView;
                } else {
                    return new Label(); // TODO: return empty image
                }
            }
        });

        table.setCellStyleGenerator(new Table.CellStyleGenerator() {
            @Override
            public String getStyle(final Table source, final java.lang.Object itemId,
                    final java.lang.Object propertyId) {
                if (propertyId == null) {
                    return null;
                } else if (propertyId.equals(Object.FieldMetadata.IMAGES.getJavaName())) {
                    return "thumbnail";
                } else {
                    return null;
                }
            }
        });

        table.addGeneratedColumn(Object.FieldMetadata.INSTITUTION_ID.getJavaName(), new ColumnGenerator() {

            @Override
            public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                    final java.lang.Object columnId) {
                final InstitutionId institutionId = (InstitutionId) source.getContainerDataSource()
                        .getContainerProperty(itemId, columnId).getValue();
                return new NativeButton(institutions.get(institutionId).getTitle(), new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        eventBus.post(new InstitutionQueryService.Messages.GetInstitutionByIdRequest(institutionId));
                    }
                });
            }
        });

        table.addGeneratedColumn(Object.FieldMetadata.TITLE.getJavaName(), new ColumnGenerator() {

            @Override
            public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                    final java.lang.Object columnId) {
                final String title = (String) source.getContainerDataSource().getContainerProperty(itemId, columnId)
                        .getValue();
                return new NativeButton(title, new Button.ClickListener() {
                    @Override
                    public void buttonClick(final ClickEvent event) {
                        final ObjectId objectId = (ObjectId) source.getContainerDataSource()
                                .getContainerProperty(itemId, "id").getValue();
                        eventBus.post(new ObjectQueryService.Messages.GetObjectByIdRequest(objectId));
                    }
                });
            }
        });

        if (columns.containsKey(Object.FieldMetadata.URL.getJavaName())) {
            table.addGeneratedColumn(Object.FieldMetadata.URL.getJavaName(), new ColumnGenerator() {

                @Override
                public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                        final java.lang.Object columnId) {
                    final Url url = (Url) source.getContainerDataSource().getContainerProperty(itemId, columnId)
                            .getValue();
                    if (url == null) {
                        return new Label();
                    }
                    final Link link = new Link("Institution object page", new ExternalResource(url.toString()));
                    link.setTargetName("_blank");
                    return link;
                }
            });
        }

        setCompositionRoot(table);
    }
}
