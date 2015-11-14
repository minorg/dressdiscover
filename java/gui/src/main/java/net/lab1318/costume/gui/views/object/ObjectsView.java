package net.lab1318.costume.gui.views.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Locale;
import java.util.Map;

import org.notaweb.gui.EventBus;
import org.notaweb.gui.utils.StringToUrlConverter;
import org.thryft.native_.Url;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.CellReference;
import com.vaadin.ui.Grid.Column;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.renderers.ButtonRenderer;
import com.vaadin.ui.renderers.ClickableRenderer.RendererClickEvent;
import com.vaadin.ui.renderers.ClickableRenderer.RendererClickListener;
import com.vaadin.ui.renderers.HtmlRenderer;
import com.vaadin.ui.renderers.ImageRenderer;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.gui.components.InstitutionButton;
import net.lab1318.costume.gui.models.image.ImageBean;
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
            final ObjectQuery objectQuery, final LazyQueryContainer objects) {
        if (objectQuery.getQueryString().isPresent()) {
            _getNavbar().getSearchTextField().setValue(objectQuery.getQueryString().get());
        }

        final int objectsSize = objects.size();
        if (objectsSize == 0) {
            setCompositionRoot(new Label("No objects found."));
            return;
        }

        final HorizontalLayout twoPaneLayout = new HorizontalLayout();
        twoPaneLayout.setSizeFull();
        twoPaneLayout.setHeight(700, Unit.PIXELS);

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
            twoPaneLayout.setExpandRatio(facetsLayout, 1);
        }

        {
            final Grid grid = new Grid(objects);
            grid.setHeightMode(HeightMode.ROW);
            grid.setHeightByRows(4.0);
            grid.setSizeFull();
            grid.setCellStyleGenerator(new Grid.CellStyleGenerator() {
                @Override
                public String getStyle(final CellReference cellReference) {
                    return cellReference.getPropertyId().equals(Object.FieldMetadata.THUMBNAIL.getJavaName())
                            ? "thumbnailGridCell" : "borderlessButton";
                }
            });
            grid.setStyleName("objectGrid");

            final RendererClickListener getObjectByIdClickListener = new RendererClickListener() {
                @Override
                public void click(final RendererClickEvent event) {
                    _getEventBus()
                            .post(new ObjectQueryService.Messages.GetObjectByIdRequest((ObjectId) event.getItemId()));
                }
            };

            grid.setColumns(Object.FieldMetadata.THUMBNAIL.getJavaName(), Object.FieldMetadata.TITLE.getJavaName(),
                    Object.FieldMetadata.DATE_TEXT.getJavaName(), Object.FieldMetadata.INSTITUTION_ID.getJavaName(),
                    Object.FieldMetadata.COLLECTION_ID.getJavaName(), Object.FieldMetadata.URL.getJavaName());
            {
                final Column collectionIdColumn = grid.getColumn(Object.FieldMetadata.COLLECTION_ID.getJavaName());
                collectionIdColumn.setHeaderCaption("Collection");
                collectionIdColumn.setRenderer(new ButtonRenderer(new RendererClickListener() {
                    @Override
                    public void click(final RendererClickEvent event) {
                        final CollectionId collectionId = (CollectionId) objects.getItem(event.getItemId())
                                .getItemProperty(Object.FieldMetadata.COLLECTION_ID.getJavaName()).getValue();
                        _getEventBus().post(new CollectionQueryService.Messages.GetCollectionByIdRequest(collectionId));
                    }
                }), new Converter<String, CollectionId>() {
                    @Override
                    public CollectionId convertToModel(final String value,
                            final Class<? extends CollectionId> targetType, final Locale locale)
                                    throws com.vaadin.data.util.converter.Converter.ConversionException {
                        throw new UnsupportedOperationException();
                    }

                    @Override
                    public String convertToPresentation(final CollectionId value,
                            final Class<? extends String> targetType, final Locale locale)
                                    throws com.vaadin.data.util.converter.Converter.ConversionException {
                        return checkNotNull(collections.get(value)).getTitle();
                    }

                    @Override
                    public Class<CollectionId> getModelType() {
                        return CollectionId.class;
                    }

                    @Override
                    public Class<String> getPresentationType() {
                        return String.class;
                    }
                });
            }
            {
                grid.getColumn(Object.FieldMetadata.DATE_TEXT.getJavaName()).setHeaderCaption("Date");
            }
            {
                final Column institutionIdColumn = grid.getColumn(Object.FieldMetadata.INSTITUTION_ID.getJavaName());
                institutionIdColumn.setHeaderCaption("Institution");
                institutionIdColumn.setRenderer(new ButtonRenderer(new RendererClickListener() {
                    @Override
                    public void click(final RendererClickEvent event) {
                        final InstitutionId institutionId = (InstitutionId) objects.getItem(event.getItemId())
                                .getItemProperty(Object.FieldMetadata.INSTITUTION_ID.getJavaName()).getValue();
                        _getEventBus()
                                .post(new InstitutionQueryService.Messages.GetInstitutionByIdRequest(institutionId));
                    }
                }), new Converter<String, InstitutionId>() {
                    @Override
                    public InstitutionId convertToModel(final String value,
                            final Class<? extends InstitutionId> targetType, final Locale locale)
                                    throws com.vaadin.data.util.converter.Converter.ConversionException {
                        throw new UnsupportedOperationException();
                    }

                    @Override
                    public String convertToPresentation(final InstitutionId value,
                            final Class<? extends String> targetType, final Locale locale)
                                    throws com.vaadin.data.util.converter.Converter.ConversionException {
                        return checkNotNull(institutions.get(value)).getTitle();
                    }

                    @Override
                    public Class<InstitutionId> getModelType() {
                        return InstitutionId.class;
                    }

                    @Override
                    public Class<String> getPresentationType() {
                        return String.class;
                    }
                });
            }
            {
                grid.getColumn(Object.FieldMetadata.TITLE.getJavaName())
                        .setRenderer(new ButtonRenderer(getObjectByIdClickListener));
            }
            {
                final Column thumbnailColumn = grid.getColumn(Object.FieldMetadata.THUMBNAIL.getJavaName());
                thumbnailColumn.setHeaderCaption("");
                thumbnailColumn.setRenderer(new ImageRenderer(getObjectByIdClickListener),
                        new Converter<Resource, ImageBean>() {
                            @Override
                            public ImageBean convertToModel(final Resource value,
                                    final Class<? extends ImageBean> targetType, final Locale locale)
                                            throws com.vaadin.data.util.converter.Converter.ConversionException {
                                throw new UnsupportedOperationException();
                            }

                            @Override
                            public Resource convertToPresentation(final ImageBean value,
                                    final Class<? extends Resource> targetType, final Locale locale)
                                            throws com.vaadin.data.util.converter.Converter.ConversionException {
                                return new ExternalResource(value.getUrl().toString());
                            }

                            @Override
                            public Class<ImageBean> getModelType() {
                                return ImageBean.class;
                            }

                            @Override
                            public Class<Resource> getPresentationType() {
                                return Resource.class;
                            }
                        });
            }
            {
                final Column urlColumn = grid.getColumn(Object.FieldMetadata.URL.getJavaName());
                urlColumn.setHeaderCaption("URL");
                urlColumn.setRenderer(new HtmlRenderer(), new StringToUrlConverter() {
                    @Override
                    public String convertToPresentation(final Url value, final Class<? extends String> targetType,
                            final Locale locale) throws com.vaadin.data.util.converter.Converter.ConversionException {
                        return String.format("<a href=\"%s\">%s</a>", value.toString(), value.toString());
                    }
                });
            }

            twoPaneLayout.addComponent(grid);
            twoPaneLayout.setComponentAlignment(grid, Alignment.MIDDLE_CENTER);
            twoPaneLayout.setExpandRatio(grid, 9);
        }

        setCompositionRoot(twoPaneLayout);
    }

    public final static String NAME = "objects";
}
