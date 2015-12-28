package net.lab1318.costume.gui.views.objects;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.thryft.native_.Url;
import org.thryft.waf.gui.EventBus;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.collect.ImmutableMap;
import com.vaadin.event.MouseEvents.ClickListener;
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
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectSummary;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.gui.models.image.ImageVersionBean;
import net.lab1318.costume.gui.views.Image;

@SuppressWarnings("serial")
final class ObjectSummaryEntriesTable extends CustomComponent {
    public ObjectSummaryEntriesTable(final ImmutableMap<CollectionId, Collection> collections, final EventBus eventBus,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectFacets objectFacets,
            final LazyQueryContainer objects) {
        final Map<String, String> columns = new LinkedHashMap<>();
        {
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.THUMBNAIL.getJavaName(), "");
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.TITLE.getJavaName(), "Title");
            if (!objectFacets.getWorkTypeTexts().isEmpty()) {
                columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                        + ObjectSummary.FieldMetadata.WORK_TYPE_TEXTS.getJavaName(), "Type");
            }
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.DATE.getJavaName(), "Date");
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.INSTITUTION_ID.getJavaName(), "Institution");
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.COLLECTION_ID.getJavaName(), "Collection");
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.URL.getJavaName(), "URL");
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

        table.addGeneratedColumn(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                + ObjectSummary.FieldMetadata.COLLECTION_ID.getJavaName(), new ColumnGenerator() {
                    @Override
                    public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                            final java.lang.Object columnId) {
                        final CollectionId collectionId = (CollectionId) source.getContainerDataSource()
                                .getContainerProperty(itemId, columnId).getValue();
                        return new NativeButton(collections.get(collectionId).getTitle(), new Button.ClickListener() {
                            @Override
                            public void buttonClick(final ClickEvent event) {
                                eventBus.post(
                                        new CollectionQueryService.Messages.GetCollectionByIdRequest(collectionId));
                            }
                        });
                    }
                });

        table.addGeneratedColumn(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                + ObjectSummary.FieldMetadata.INSTITUTION_ID.getJavaName(), new ColumnGenerator() {
                    @Override
                    public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                            final java.lang.Object columnId) {
                        final InstitutionId institutionId = (InstitutionId) source.getContainerDataSource()
                                .getContainerProperty(itemId, columnId).getValue();
                        return new NativeButton(institutions.get(institutionId).getTitle(), new Button.ClickListener() {
                            @Override
                            public void buttonClick(final ClickEvent event) {
                                eventBus.post(
                                        new InstitutionQueryService.Messages.GetInstitutionByIdRequest(institutionId));
                            }
                        });
                    }
                });

        table.addGeneratedColumn(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                + ObjectSummary.FieldMetadata.THUMBNAIL.getJavaName(), new ColumnGenerator() {
                    @Override
                    public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                            final java.lang.Object columnId) {
                        final ImageVersionBean thumbnailModel = (ImageVersionBean) source.getContainerDataSource()
                                .getContainerProperty(itemId, columnId).getValue();
                        if (thumbnailModel == null) {
                            return new Label(); // TODO: return an empty image
                        }
                        final Image thumbnailView = new Image("", thumbnailModel);
                        thumbnailView.addStyleName("thumbnail");
                        thumbnailView.addClickListener(new ClickListener() {
                            @Override
                            public void click(final com.vaadin.event.MouseEvents.ClickEvent event) {
                                final ObjectId objectId = (ObjectId) source.getContainerDataSource()
                                        .getContainerProperty(itemId, "id").getValue();
                                eventBus.post(new ObjectQueryService.Messages.GetObjectByIdRequest(objectId));
                            }
                        });
                        return thumbnailView;
                    }
                });

        table.setCellStyleGenerator(new Table.CellStyleGenerator() {
            @Override
            public String getStyle(final Table source, final java.lang.Object itemId,
                    final java.lang.Object propertyId) {
                if (propertyId == null) {
                    return null;
                } else if (propertyId.equals(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                        + ObjectSummary.FieldMetadata.THUMBNAIL.getJavaName())) {
                    return "thumbnail";
                } else {
                    return null;
                }
            }
        });

        table.addGeneratedColumn(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                + ObjectSummary.FieldMetadata.TITLE.getJavaName(), new ColumnGenerator() {
                    @Override
                    public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                            final java.lang.Object columnId) {
                        final String title = (String) source.getContainerDataSource()
                                .getContainerProperty(itemId, columnId).getValue();
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

        if (columns.containsKey(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                + ObjectSummary.FieldMetadata.URL.getJavaName())) {
            table.addGeneratedColumn(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.URL.getJavaName(), new ColumnGenerator() {
                        @Override
                        public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                                final java.lang.Object columnId) {
                            final Url url = (Url) source.getContainerDataSource().getContainerProperty(itemId, columnId)
                                    .getValue();
                            if (url == null) {
                                return new Label();
                            }
                            final Link link = new Link(url.toString(), new ExternalResource(url.toString()));
                            link.setTargetName("_blank");
                            return link;
                        }
                    });
        }

        if (!objectFacets.getWorkTypeTexts().isEmpty()) {
            table.addGeneratedColumn(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.WORK_TYPE_TEXTS.getJavaName(), new ColumnGenerator() {
                        @Override
                        public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                                final java.lang.Object columnId) {
                            @SuppressWarnings("unchecked")
                            final List<String> workTypeTexts = (List<String>) source.getContainerDataSource()
                                    .getContainerProperty(itemId, columnId).getValue();
                            return new Label(workTypeTexts.get(0));
                        }
                    });
        }

        setCompositionRoot(table);
    }
}
