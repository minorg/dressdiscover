package net.lab1318.costume.gui.views.object;

import org.notaweb.gui.EventBus;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectFilters;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQueryService;

@SuppressWarnings("serial")
final class ObjectFacetsLayout extends CustomComponent {
	public ObjectFacetsLayout(final EventBus eventBus, final ImmutableMap<InstitutionId, Institution> institutions,
			final ObjectFacets objectFacets, final ObjectQuery objectQuery) {
		final VerticalLayout rootLayout = new VerticalLayout();

		if (!objectFacets.getAgentNameTexts().isEmpty()) {
			rootLayout.addComponent(new ObjectFacetPicker<String>(objectFacets.getAgentNameTexts(), "Agent names",
					objectQuery.getFilters().isPresent()
							&& objectQuery.getFilters().get().getExcludeAgentNameTexts().isPresent()
									? objectQuery.getFilters().get().getExcludeAgentNameTexts().get()
									: ImmutableSet.of(),
					objectQuery.getFilters().isPresent()
							&& objectQuery.getFilters().get().getIncludeAgentNameTexts().isPresent()
									? objectQuery.getFilters().get().getIncludeAgentNameTexts().get()
									: ImmutableSet.of()) {
				@Override
				protected void _valueChange(final ImmutableSet<String> excludeFacetKeys,
						final ImmutableSet<String> includeFacetKeys) {
					final ObjectFilters.Builder filtersBuilder = ObjectFilters.builder();
					if (!excludeFacetKeys.isEmpty()) {
						filtersBuilder.setExcludeAgentNameTexts(excludeFacetKeys);
					}
					if (!includeFacetKeys.isEmpty()) {
						filtersBuilder.setIncludeAgentNameTexts(includeFacetKeys);
					}
					eventBus.post(ObjectQueryService.Messages.GetObjectsRequest.builder()
							.setQuery(ObjectQuery.builder().setFilters(filtersBuilder.build()).build()).build());
				}
			});
		}

		if (!objectFacets.getCategories().isEmpty()) {
			rootLayout.addComponent(new ObjectFacetPicker<String>(objectFacets.getCategories(), "Categories",
					objectQuery.getFilters().isPresent()
							&& objectQuery.getFilters().get().getExcludeCategories().isPresent()
									? objectQuery.getFilters().get().getExcludeCategories().get() : ImmutableSet.of(),
					objectQuery.getFilters().isPresent()
							&& objectQuery.getFilters().get().getIncludeCategories().isPresent()
									? objectQuery.getFilters().get().getIncludeCategories().get() : ImmutableSet.of()) {
				@Override
				protected void _valueChange(final ImmutableSet<String> excludeFacetKeys,
						final ImmutableSet<String> includeFacetKeys) {
					final ObjectFilters.Builder filtersBuilder = ObjectFilters.builder();
					if (!excludeFacetKeys.isEmpty()) {
						filtersBuilder.setExcludeCategories(excludeFacetKeys);
					}
					if (!includeFacetKeys.isEmpty()) {
						filtersBuilder.setIncludeCategories(includeFacetKeys);
					}
					eventBus.post(ObjectQueryService.Messages.GetObjectsRequest.builder()
							.setQuery(ObjectQuery.builder().setFilters(filtersBuilder.build()).build()).build());
				}
			});
		}

		if (!objectFacets.getInstitutionHits().isEmpty()) {
			rootLayout.addComponent(
					new ObjectFacetPicker<InstitutionId>(objectFacets.getInstitutionHits(), "Institutions",
							objectQuery.getFilters().isPresent()
									&& objectQuery.getFilters().get().getExcludeInstitutionIds().isPresent()
											? objectQuery.getFilters().get().getExcludeInstitutionIds().get()
											: ImmutableSet.of(),
							objectQuery.getFilters().isPresent()
									&& objectQuery.getFilters().get().getIncludeInstitutionIds().isPresent()
											? objectQuery.getFilters().get().getIncludeInstitutionIds().get()
											: ImmutableSet.of()) {
						@Override
						protected String _getCheckBoxCaption(final InstitutionId facetKey) {
							return institutions.get(facetKey).getTitle();
						}

						@Override
						protected void _valueChange(final ImmutableSet<InstitutionId> excludeFacetKeys,
								final ImmutableSet<InstitutionId> includeFacetKeys) {
							final ObjectFilters.Builder filtersBuilder = ObjectFilters.builder();
							if (!excludeFacetKeys.isEmpty()) {
								filtersBuilder.setExcludeInstitutionIds(excludeFacetKeys);
							}
							if (!includeFacetKeys.isEmpty()) {
								filtersBuilder.setIncludeInstitutionIds(includeFacetKeys);
							}
							eventBus.post(ObjectQueryService.Messages.GetObjectsRequest.builder()
									.setQuery(ObjectQuery.builder().setFilters(filtersBuilder.build()).build())
									.build());
						}
					});
		}

		if (!objectFacets.getSubjectTermTexts().isEmpty()) {
			rootLayout.addComponent(new ObjectFacetPicker<String>(objectFacets.getSubjectTermTexts(), "Subject terms",
					objectQuery.getFilters().isPresent()
							&& objectQuery.getFilters().get().getExcludeSubjectTermTexts().isPresent()
									? objectQuery.getFilters().get().getExcludeSubjectTermTexts().get()
									: ImmutableSet.of(),
					objectQuery.getFilters().isPresent()
							&& objectQuery.getFilters().get().getIncludeSubjectTermTexts().isPresent()
									? objectQuery.getFilters().get().getIncludeSubjectTermTexts().get()
									: ImmutableSet.of()) {
				@Override
				protected void _valueChange(final ImmutableSet<String> excludeFacetKeys,
						final ImmutableSet<String> includeFacetKeys) {
					final ObjectFilters.Builder filtersBuilder = ObjectFilters.builder();
					if (!excludeFacetKeys.isEmpty()) {
						filtersBuilder.setExcludeSubjectTermTexts(excludeFacetKeys);
					}
					if (!includeFacetKeys.isEmpty()) {
						filtersBuilder.setIncludeSubjectTermTexts(includeFacetKeys);
					}
					eventBus.post(ObjectQueryService.Messages.GetObjectsRequest.builder()
							.setQuery(ObjectQuery.builder().setFilters(filtersBuilder.build()).build()).build());
				}
			});
		}

		setCompositionRoot(rootLayout);
	}
}
