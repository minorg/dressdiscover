package net.lab1318.costume.gui.views.object;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.notaweb.gui.EventBus;
import org.notaweb.gui.utils.StringToUrlConverter;
import org.thryft.native_.Url;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.collect.ImmutableMap;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.CellReference;
import com.vaadin.ui.Grid.Column;
import com.vaadin.ui.renderers.ButtonRenderer;
import com.vaadin.ui.renderers.ClickableRenderer.RendererClickEvent;
import com.vaadin.ui.renderers.ClickableRenderer.RendererClickListener;
import com.vaadin.ui.renderers.HtmlRenderer;
import com.vaadin.ui.renderers.ImageRenderer;

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
		final List<String> gridColumns = new ArrayList<>();
		{
			if (objectFacets.getThumbnailExists()) {
				gridColumns.add(Object.FieldMetadata.THUMBNAIL.getJavaName());
			}
			gridColumns.add(Object.FieldMetadata.TITLE.getJavaName());
			gridColumns.add(Object.FieldMetadata.DATE_TEXT.getJavaName());
			gridColumns.add(Object.FieldMetadata.INSTITUTION_ID.getJavaName());
			gridColumns.add(Object.FieldMetadata.COLLECTION_ID.getJavaName());
			gridColumns.add(Object.FieldMetadata.URL.getJavaName());
		}

		final Grid grid = new Grid(objects);
		grid.setColumns(gridColumns.toArray());
		grid.setHeightMode(HeightMode.ROW);
		grid.setHeightByRows(4.0);
		grid.setSizeFull();
		if (gridColumns.contains(Object.FieldMetadata.THUMBNAIL.getJavaName())) {
			grid.setCellStyleGenerator(new Grid.CellStyleGenerator() {
				@Override
				public String getStyle(final CellReference cellReference) {
					return cellReference.getPropertyId().equals(Object.FieldMetadata.THUMBNAIL.getJavaName())
							? "thumbnailGridCell" : "borderless";
				}
			});
		}
		grid.setStyleName("objectGrid");
		final RendererClickListener getObjectByIdClickListener = new RendererClickListener() {
			@Override
			public void click(final RendererClickEvent event) {
				eventBus.post(new ObjectQueryService.Messages.GetObjectByIdRequest((ObjectId) event.getItemId()));
			}
		};
		{
			final Column collectionIdColumn = grid.getColumn(Object.FieldMetadata.COLLECTION_ID.getJavaName());
			collectionIdColumn.setHeaderCaption("Collection");
			collectionIdColumn.setRenderer(new ButtonRenderer(new RendererClickListener() {
				@Override
				public void click(final RendererClickEvent event) {
					final CollectionId collectionId = (CollectionId) objects.getItem(event.getItemId())
							.getItemProperty(Object.FieldMetadata.COLLECTION_ID.getJavaName()).getValue();
					eventBus.post(new CollectionQueryService.Messages.GetCollectionByIdRequest(collectionId));
				}
			}), new Converter<String, CollectionId>() {
				@Override
				public CollectionId convertToModel(final String value, final Class<? extends CollectionId> targetType,
						final Locale locale) throws com.vaadin.data.util.converter.Converter.ConversionException {
					throw new UnsupportedOperationException();
				}

				@Override
				public String convertToPresentation(final CollectionId value, final Class<? extends String> targetType,
						final Locale locale) throws com.vaadin.data.util.converter.Converter.ConversionException {
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
					eventBus.post(new InstitutionQueryService.Messages.GetInstitutionByIdRequest(institutionId));
				}
			}), new Converter<String, InstitutionId>() {
				@Override
				public InstitutionId convertToModel(final String value, final Class<? extends InstitutionId> targetType,
						final Locale locale) throws com.vaadin.data.util.converter.Converter.ConversionException {
					throw new UnsupportedOperationException();
				}

				@Override
				public String convertToPresentation(final InstitutionId value, final Class<? extends String> targetType,
						final Locale locale) throws com.vaadin.data.util.converter.Converter.ConversionException {
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
		if (gridColumns.contains(Object.FieldMetadata.THUMBNAIL.getJavaName())) {
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
							if (value == null) {
								return null;
							}
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
					if (value == null) {
						return null;
					}
					return String.format("<a href=\"%s\" target=\"_blank\">%s</a>", value.toString(), value.toString());
				}
			});
		}

		setCompositionRoot(grid);
	}
}
