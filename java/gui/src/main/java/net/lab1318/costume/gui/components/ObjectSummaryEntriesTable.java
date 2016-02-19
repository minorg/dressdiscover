package net.lab1318.costume.gui.components;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Nullable;

import org.thryft.native_.Url;
import org.thryft.waf.gui.EventBus;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectSummary;
import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.api.models.user.UserBookmark;
import net.lab1318.costume.api.models.user.UserBookmarkEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.api.services.user.UserCommandService.Messages.DeleteUserBookmarkByIdRequest;
import net.lab1318.costume.api.services.user.UserCommandService.Messages.PostUserBookmarkRequest;
import net.lab1318.costume.gui.models.image.ImageBean;
import net.lab1318.costume.gui.models.image.ImageVersionBean;

@SuppressWarnings("serial")
public final class ObjectSummaryEntriesTable extends CustomComponent {
    public ObjectSummaryEntriesTable(final ImmutableMap<ObjectId, UserBookmarkEntry> bookmarks,
            final ImmutableMap<CollectionId, Collection> collections, final Optional<UserId> currentUserId,
            final EventBus eventBus, final ImmutableMap<InstitutionId, Institution> institutions,
            final LazyQueryContainer objects) {
        this.bookmarks = checkNotNull(bookmarks);

        final Map<String, String> columns = new LinkedHashMap<>();
        {
            if (currentUserId.isPresent()) {
                columns.put("bookmark", "Bookmark");
            }
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.IMAGE.getJavaName(), "");
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.TITLE.getJavaName(), "Title");
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.DATE.getJavaName(), "Date");
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.INSTITUTION_ID.getJavaName(), "Institution");
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.COLLECTION_ID.getJavaName(), "Collection");
            columns.put(ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                    + ObjectSummary.FieldMetadata.URL.getJavaName(), "URL");
        }

        table.setContainerDataSource(objects);
        table.setPageLength(6);
        table.setSizeFull();

        if (currentUserId.isPresent()) {
            table.addGeneratedColumn("bookmark", new ColumnGenerator() {
                @Override
                public Object generateCell(final Table source, final Object itemId, final Object columnId) {
                    final ObjectId objectId = (ObjectId) source.getContainerDataSource()
                            .getContainerProperty(itemId, "id").getValue();
                    final String objectTitle = (String) source.getContainerDataSource()
                            .getContainerProperty(itemId, ObjectSummaryEntry.FieldMetadata.MODEL.getJavaName() + '.'
                                    + ObjectSummary.FieldMetadata.TITLE.getJavaName())
                            .getValue();
                    final Button button = new NativeButton();
                    @Nullable
                    final UserBookmarkEntry bookmarkEntry = ObjectSummaryEntriesTable.this.bookmarks.get(objectId);
                    if (bookmarkEntry != null) {
                        button.addClickListener(new Button.ClickListener() {
                            @Override
                            public void buttonClick(final ClickEvent event) {
                                eventBus.post(new DeleteUserBookmarkByIdRequest(bookmarkEntry.getId()));
                            }
                        });
                        button.setIcon(FontAwesome.STAR);
                    } else {
                        button.addClickListener(new Button.ClickListener() {
                            @Override
                            public void buttonClick(final ClickEvent event) {
                                UI.getCurrent().addWindow(new BookmarkNameDialog(Optional.of(objectTitle)) {
                                    @Override
                                    protected void _save(final String name) {
                                        eventBus.post(
                                                PostUserBookmarkRequest.builder()
                                                        .setUserBookmark(UserBookmark.builder().setObjectId(objectId)
                                                                .setName(name).setUserId(currentUserId.get()).build())
                                                .build());
                                    }
                                });
                            }
                        });
                        button.setIcon(FontAwesome.STAR_O);
                    }
                    return button;
                }
            });
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
                + ObjectSummary.FieldMetadata.IMAGE.getJavaName(), new ColumnGenerator() {

                    @Override
                    public java.lang.Object generateCell(final Table source, final java.lang.Object itemId,
                            final java.lang.Object columnId) {
                        final ImageBean imageModel = (ImageBean) source.getContainerDataSource()
                                .getContainerProperty(itemId, columnId).getValue();
                        if (imageModel == null) {
                            return new Label(); // TODO: return an empty image
                        }
                        ImageVersionBean thumbnailModel = null;
                        if (imageModel.getSquareThumbnail() != null) {
                            thumbnailModel = imageModel.getSquareThumbnail();
                        } else if (imageModel.getThumbnail() != null) {
                            thumbnailModel = imageModel.getThumbnail();
                        } else {
                            return new Label(); // TODO: return an empty image
                        }

                        final ImageWithRightsLayout thumbnailView = new ImageWithRightsLayout("", thumbnailModel,
                                Optional.fromNullable(imageModel.getRights()));
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
                        + ObjectSummary.FieldMetadata.IMAGE.getJavaName())) {
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
                        final ObjectId objectId = (ObjectId) source.getContainerDataSource()
                                .getContainerProperty(itemId, "id").getValue();
                        String title = (String) source.getContainerDataSource().getContainerProperty(itemId, columnId)
                                .getValue();
                        @Nullable
                        final UserBookmarkEntry bookmarkEntry = ObjectSummaryEntriesTable.this.bookmarks.get(objectId);
                        if (bookmarkEntry != null && !bookmarkEntry.getModel().getName().equals(title)) {
                            title = String.format("%s (%s)", bookmarkEntry.getModel().getName(), title);
                        }
                        return new NativeButton(title, new Button.ClickListener() {
                            @Override
                            public void buttonClick(final ClickEvent event) {
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

        table.setVisibleColumns(columns.keySet().toArray());
        {
            final String[] columnHeaders = new String[columns.size()];
            columns.values().toArray(columnHeaders);
            table.setColumnHeaders(columnHeaders);
        }

        setCompositionRoot(table);
    }

    public void setBookmarks(final ImmutableMap<ObjectId, UserBookmarkEntry> bookmarks) {
        this.bookmarks = checkNotNull(bookmarks);
        table.refreshRowCache();
    }

    private ImmutableMap<ObjectId, UserBookmarkEntry> bookmarks;
    private final Table table = new Table();
}
