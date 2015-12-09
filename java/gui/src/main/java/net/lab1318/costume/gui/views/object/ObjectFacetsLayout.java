package net.lab1318.costume.gui.views.object;

import org.notaweb.gui.EventBus;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.object.ObjectFacetFilters;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectQueryService;

@SuppressWarnings("serial")
final class ObjectFacetsLayout extends CustomComponent {
    public ObjectFacetsLayout(final EventBus eventBus, final ImmutableMap<InstitutionId, Institution> institutions,
            final ObjectFacets objectFacets, final ObjectQuery objectQuery) {
        final VerticalLayout rootLayout = new VerticalLayout();

        if (!objectFacets.getAgentNameTexts().isEmpty()) {
            rootLayout.addComponent(new ObjectFacetPicker<String>(objectFacets.getAgentNameTexts(), "Agent names",
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getExcludeAgentNameTexts().isPresent()
                                    ? objectQuery.getFacetFilters().get().getExcludeAgentNameTexts().get()
                                    : ImmutableSet.of(),
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getIncludeAgentNameTexts().isPresent()
                                    ? objectQuery.getFacetFilters().get().getIncludeAgentNameTexts().get()
                                    : ImmutableSet.of()) {
                @Override
                protected void _valueChange(final ImmutableSet<String> excludeFacetKeys,
                        final ImmutableSet<String> includeFacetKeys) {
                    final ObjectFacetFilters.Builder filtersBuilder = ObjectFacetFilters
                            .builder(objectQuery.getFacetFilters());
                    if (!excludeFacetKeys.isEmpty()) {
                        filtersBuilder.setExcludeAgentNameTexts(excludeFacetKeys);
                    } else {
                        filtersBuilder.unsetExcludeAgentNameTexts();
                    }
                    if (!includeFacetKeys.isEmpty()) {
                        filtersBuilder.setIncludeAgentNameTexts(includeFacetKeys);
                    } else {
                        filtersBuilder.unsetIncludeAgentNameTexts();
                    }
                    eventBus.post(ObjectQueryService.Messages.GetObjectsRequest.builder()
                            .setQuery(ObjectQuery.builder().setFacetFilters(filtersBuilder.build()).build()).build());
                }
            });
        }

        if (!objectFacets.getCategories().isEmpty()) {
            rootLayout.addComponent(new ObjectFacetPicker<String>(objectFacets.getCategories(), "Categories",
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getExcludeCategories().isPresent()
                                    ? objectQuery.getFacetFilters().get().getExcludeCategories().get()
                                    : ImmutableSet.of(),
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getIncludeCategories().isPresent()
                                    ? objectQuery.getFacetFilters().get().getIncludeCategories().get()
                                    : ImmutableSet.of()) {
                @Override
                protected void _valueChange(final ImmutableSet<String> excludeFacetKeys,
                        final ImmutableSet<String> includeFacetKeys) {
                    final ObjectFacetFilters.Builder filtersBuilder = ObjectFacetFilters
                            .builder(objectQuery.getFacetFilters());
                    if (!excludeFacetKeys.isEmpty()) {
                        filtersBuilder.setExcludeCategories(excludeFacetKeys);
                    } else {
                        filtersBuilder.unsetExcludeCategories();
                    }
                    if (!includeFacetKeys.isEmpty()) {
                        filtersBuilder.setIncludeCategories(includeFacetKeys);
                    } else {
                        filtersBuilder.unsetIncludeCategories();
                    }
                    eventBus.post(ObjectQueryService.Messages.GetObjectsRequest.builder()
                            .setQuery(ObjectQuery.builder().setFacetFilters(filtersBuilder.build()).build()).build());
                }
            });
        }

        if (!objectFacets.getInstitutionHits().isEmpty()) {
            rootLayout.addComponent(
                    new ObjectFacetPicker<InstitutionId>(objectFacets.getInstitutionHits(), "Institutions",
                            objectQuery.getFacetFilters().isPresent()
                                    && objectQuery.getFacetFilters().get().getExcludeInstitutionIds().isPresent()
                                            ? objectQuery.getFacetFilters().get().getExcludeInstitutionIds().get()
                                            : ImmutableSet.of(),
                            objectQuery.getFacetFilters().isPresent()
                                    && objectQuery.getFacetFilters().get().getIncludeInstitutionIds().isPresent()
                                            ? objectQuery.getFacetFilters().get().getIncludeInstitutionIds().get()
                                            : ImmutableSet.of()) {
                        @Override
                        protected String _getCheckBoxCaption(final InstitutionId facetKey) {
                            return institutions.get(facetKey).getTitle();
                        }

                        @Override
                        protected void _valueChange(final ImmutableSet<InstitutionId> excludeFacetKeys,
                                final ImmutableSet<InstitutionId> includeFacetKeys) {
                            final ObjectFacetFilters.Builder filtersBuilder = ObjectFacetFilters
                                    .builder(objectQuery.getFacetFilters());
                            if (!excludeFacetKeys.isEmpty()) {
                                filtersBuilder.setExcludeInstitutionIds(excludeFacetKeys);
                            } else {
                                filtersBuilder.unsetExcludeInstitutionIds();
                            }
                            if (!includeFacetKeys.isEmpty()) {
                                filtersBuilder.setIncludeInstitutionIds(includeFacetKeys);
                            } else {
                                filtersBuilder.unsetIncludeInstitutionIds();
                            }
                            eventBus.post(ObjectQueryService.Messages.GetObjectsRequest.builder()
                                    .setQuery(ObjectQuery.builder().setFacetFilters(filtersBuilder.build()).build())
                                    .build());
                        }
                    });
        }

        if (!objectFacets.getSubjectTermTexts().isEmpty()) {
            rootLayout.addComponent(new ObjectFacetPicker<String>(objectFacets.getSubjectTermTexts(), "Subject terms",
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getExcludeSubjectTermTexts().isPresent()
                                    ? objectQuery.getFacetFilters().get().getExcludeSubjectTermTexts().get()
                                    : ImmutableSet.of(),
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getIncludeSubjectTermTexts().isPresent()
                                    ? objectQuery.getFacetFilters().get().getIncludeSubjectTermTexts().get()
                                    : ImmutableSet.of()) {
                @Override
                protected void _valueChange(final ImmutableSet<String> excludeFacetKeys,
                        final ImmutableSet<String> includeFacetKeys) {
                    final ObjectFacetFilters.Builder filtersBuilder = ObjectFacetFilters
                            .builder(objectQuery.getFacetFilters());
                    if (!excludeFacetKeys.isEmpty()) {
                        filtersBuilder.setExcludeSubjectTermTexts(excludeFacetKeys);
                    } else {
                        filtersBuilder.unsetExcludeSubjectTermTexts();
                    }
                    if (!includeFacetKeys.isEmpty()) {
                        filtersBuilder.setIncludeSubjectTermTexts(includeFacetKeys);
                    } else {
                        filtersBuilder.unsetIncludeSubjectTermTexts();
                    }
                    eventBus.post(ObjectQueryService.Messages.GetObjectsRequest.builder()
                            .setQuery(ObjectQuery.builder().setFacetFilters(filtersBuilder.build()).build()).build());
                }
            });
        }

        setCompositionRoot(rootLayout);
    }
}
