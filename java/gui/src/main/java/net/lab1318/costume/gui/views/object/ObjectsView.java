package net.lab1318.costume.gui.views.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Map;

import org.notaweb.gui.EventBus;
import org.thryft.native_.Url;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;
import com.vaadin.ui.Table.ColumnHeaderMode;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.gui.components.CollectionButton;
import net.lab1318.costume.gui.components.Image;
import net.lab1318.costume.gui.components.InstitutionButton;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class ObjectsView extends TopLevelView {
    @Inject
    public ObjectsView(final EventBus eventBus) {
        super(eventBus);
    }

    public void setModels(final ImmutableMap<CollectionId, Collection> collections,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectFacets objectFacets,
            final LazyQueryContainer objects) {
        final HorizontalLayout twoPaneLayout = new HorizontalLayout();
        twoPaneLayout.setSizeFull();

        {
            final VerticalLayout facetsLayout = new VerticalLayout();
            facetsLayout.setSizeFull();

            if (!objectFacets.getInstitutionHits().isEmpty()) {
                final VerticalLayout institutionFacetsLayout = new VerticalLayout();
                institutionFacetsLayout.addComponent(new Label("Institutions"));
                for (final Map.Entry<InstitutionId, UnsignedInteger> institutionHitsEntry : objectFacets
                        .getInstitutionHits().entrySet()) {
                    institutionFacetsLayout.addComponent(new InstitutionButton("", _getEventBus(), new InstitutionEntry(
                            institutionHitsEntry.getKey(), institutions.get(institutionHitsEntry.getKey()))));
                }
                facetsLayout.addComponent(institutionFacetsLayout);
            }

            twoPaneLayout.addComponent(facetsLayout);
            twoPaneLayout.setComponentAlignment(facetsLayout, Alignment.TOP_LEFT);
        }

        {
            final Table table = new Table();
            table.setContainerDataSource(objects);
            table.addGeneratedColumn(Object.FieldMetadata.TITLE.getJavaName(), new ColumnGenerator() {
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
                            _getEventBus().post(new ObjectQueryService.Messages.GetObjectByIdRequest(objectId));
                        }
                    });
                    objectTitleButton.addStyleName("borderlessButton");
                    layout.addComponent(objectTitleButton);
                    layout.addComponent(new InstitutionButton("Institution: ", _getEventBus(),
                            new InstitutionEntry(institutionId, institution)));
                    layout.addComponent(new CollectionButton("Collection: ",
                            new CollectionEntry(collectionId, collection), _getEventBus()));
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
            table.addGeneratedColumn(Object.FieldMetadata.THUMBNAIL.getJavaName(), new ColumnGenerator() {
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
                                _getEventBus().post(new ObjectQueryService.Messages.GetObjectByIdRequest(objectId));
                            }
                        });
                        return image;
                    } else {
                        return new Label();
                    }
                }
            });
            table.setColumnHeaderMode(ColumnHeaderMode.HIDDEN);
            table.setVisibleColumns(Object.FieldMetadata.THUMBNAIL.getJavaName(),
                    Object.FieldMetadata.TITLE.getJavaName());
            twoPaneLayout.addComponent(table);
            twoPaneLayout.setComponentAlignment(table, Alignment.MIDDLE_CENTER);
        }

        setCompositionRoot(twoPaneLayout);
    }

    public final static String NAME = "objects";
}
