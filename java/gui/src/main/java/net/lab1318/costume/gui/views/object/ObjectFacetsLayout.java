package net.lab1318.costume.gui.views.object;

import org.notaweb.gui.EventBus;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.gender.Gender;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.object.ObjectFacetFilters;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.gui.models.gender.Genders;

@SuppressWarnings("serial")
final class ObjectFacetsLayout extends CustomComponent {
    public ObjectFacetsLayout(final ObjectFacets availableObjectFacets, final EventBus eventBus,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectQuery objectQuery,
            final ObjectFacets resultObjectFacets) {
        final VerticalLayout rootLayout = new VerticalLayout();

        if (!availableObjectFacets.getAgentNameTexts().isEmpty()) {
            final ObjectFacetPicker<String> agentNameTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets.getAgentNameTexts().keySet(), "Agent names",
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getExcludeAgentNameTexts().isPresent()
                                    ? objectQuery.getFacetFilters().get().getExcludeAgentNameTexts().get()
                                    : ImmutableSet.of(),
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getIncludeAgentNameTexts().isPresent()
                                    ? objectQuery.getFacetFilters().get().getIncludeAgentNameTexts().get()
                                    : ImmutableSet.of(),
                    resultObjectFacets.getAgentNameTexts().keySet()) {
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
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder().setFacetFilters(filtersBuilder.build()).build()).build());
                }
            };
            if (!agentNameTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(agentNameTextFacetPicker);
            }
        }

        if (!availableObjectFacets.getCategories().isEmpty()) {
            final ObjectFacetPicker<String> categoryFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets.getCategories().keySet(), "Categories",
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getExcludeCategories().isPresent()
                                    ? objectQuery.getFacetFilters().get().getExcludeCategories().get()
                                    : ImmutableSet.of(),
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getIncludeCategories().isPresent()
                                    ? objectQuery.getFacetFilters().get().getIncludeCategories().get()
                                    : ImmutableSet.of(),
                    resultObjectFacets.getCategories().keySet()) {
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
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder().setFacetFilters(filtersBuilder.build()).build()).build());
                }
            };
            if (!categoryFacetPicker.isEmpty()) {
                rootLayout.addComponent(categoryFacetPicker);
            }
        }

        if (!availableObjectFacets.getGenders().isEmpty()) {
            final ObjectFacetPicker<Gender> genderFacetPicker = new ObjectFacetPicker<Gender>(
                    availableObjectFacets.getGenders().keySet(), "Gender",
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getExcludeGenders().isPresent()
                                    ? objectQuery.getFacetFilters().get().getExcludeGenders().get() : ImmutableSet.of(),
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getIncludeGenders().isPresent()
                                    ? objectQuery.getFacetFilters().get().getIncludeGenders().get() : ImmutableSet.of(),
                    resultObjectFacets.getGenders().keySet()) {
                @Override
                protected String _getCheckBoxCaption(final Gender facetKey) {
                    return Genders.getCaption(facetKey);
                }

                @Override
                protected void _valueChange(final ImmutableSet<Gender> excludeFacetKeys,
                        final ImmutableSet<Gender> includeFacetKeys) {
                    final ObjectFacetFilters.Builder filtersBuilder = ObjectFacetFilters
                            .builder(objectQuery.getFacetFilters());
                    if (!excludeFacetKeys.isEmpty()) {
                        filtersBuilder.setExcludeGenders(excludeFacetKeys);
                    } else {
                        filtersBuilder.unsetExcludeGenders();
                    }
                    if (!includeFacetKeys.isEmpty()) {
                        filtersBuilder.setIncludeGenders(includeFacetKeys);
                    } else {
                        filtersBuilder.unsetIncludeGenders();
                    }
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder().setFacetFilters(filtersBuilder.build()).build()).build());
                }
            };
            if (!genderFacetPicker.isEmpty()) {
                rootLayout.addComponent(genderFacetPicker);
            }
        }

        if (!availableObjectFacets.getInstitutionHits().isEmpty()) {
            final ObjectFacetPicker<InstitutionId> institutionFacetPicker = new ObjectFacetPicker<InstitutionId>(
                    availableObjectFacets.getInstitutionHits().keySet(), "Institutions",
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getExcludeInstitutionIds().isPresent()
                                    ? objectQuery.getFacetFilters().get().getExcludeInstitutionIds().get()
                                    : ImmutableSet.of(),
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getIncludeInstitutionIds().isPresent()
                                    ? objectQuery.getFacetFilters().get().getIncludeInstitutionIds().get()
                                    : ImmutableSet.of(),
                    resultObjectFacets.getInstitutionHits().keySet()) {
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
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder().setFacetFilters(filtersBuilder.build()).build()).build());
                }
            };
            if (!institutionFacetPicker.isEmpty()) {
                rootLayout.addComponent(institutionFacetPicker);
            }
        }

        if (!availableObjectFacets.getSubjectTermTexts().isEmpty()) {
            final ObjectFacetPicker<String> subjectTermTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets.getSubjectTermTexts().keySet(), "Subject terms",
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getExcludeSubjectTermTexts().isPresent()
                                    ? objectQuery.getFacetFilters().get().getExcludeSubjectTermTexts().get()
                                    : ImmutableSet.of(),
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getIncludeSubjectTermTexts().isPresent()
                                    ? objectQuery.getFacetFilters().get().getIncludeSubjectTermTexts().get()
                                    : ImmutableSet.of(),
                    resultObjectFacets.getSubjectTermTexts().keySet()) {
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
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder().setFacetFilters(filtersBuilder.build()).build()).build());
                }
            };
            if (!subjectTermTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(subjectTermTextFacetPicker);
            }
        }

        if (!availableObjectFacets.getWorkTypeTexts().isEmpty()) {
            final ObjectFacetPicker<String> workTypeTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets.getWorkTypeTexts().keySet(), "Work type",
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getExcludeWorkTypeTexts().isPresent()
                                    ? objectQuery.getFacetFilters().get().getExcludeWorkTypeTexts().get()
                                    : ImmutableSet.of(),
                    objectQuery.getFacetFilters().isPresent()
                            && objectQuery.getFacetFilters().get().getIncludeWorkTypeTexts().isPresent()
                                    ? objectQuery.getFacetFilters().get().getIncludeWorkTypeTexts().get()
                                    : ImmutableSet.of(),
                    resultObjectFacets.getWorkTypeTexts().keySet()) {
                @Override
                protected void _valueChange(final ImmutableSet<String> excludeFacetKeys,
                        final ImmutableSet<String> includeFacetKeys) {
                    final ObjectFacetFilters.Builder filtersBuilder = ObjectFacetFilters
                            .builder(objectQuery.getFacetFilters());
                    if (!excludeFacetKeys.isEmpty()) {
                        filtersBuilder.setExcludeWorkTypeTexts(excludeFacetKeys);
                    } else {
                        filtersBuilder.unsetExcludeWorkTypeTexts();
                    }
                    if (!includeFacetKeys.isEmpty()) {
                        filtersBuilder.setIncludeWorkTypeTexts(includeFacetKeys);
                    } else {
                        filtersBuilder.unsetIncludeWorkTypeTexts();
                    }
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder().setFacetFilters(filtersBuilder.build()).build()).build());
                }
            };
            if (!workTypeTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(workTypeTextFacetPicker);
            }
        }

        setCompositionRoot(rootLayout);
    }
}
