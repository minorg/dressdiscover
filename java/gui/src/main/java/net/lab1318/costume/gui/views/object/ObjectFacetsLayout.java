package net.lab1318.costume.gui.views.object;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
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

        final ObjectFacetFilters facetFilters = objectQuery.getFacetFilters().isPresent()
                ? objectQuery.getFacetFilters().get() : new ObjectFacetFilters();

        if (!availableObjectFacets.getAgentNameTexts().isEmpty()) {
            final ObjectFacetPicker<String> agentNameTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets.getAgentNameTexts().keySet(), "Agent names",
                    facetFilters.getExcludeAgentNameTexts(), facetFilters.getIncludeAgentNameTexts(),
                    resultObjectFacets.getAgentNameTexts().keySet()) {
                @Override
                protected void _valueChange(final Optional<ImmutableSet<String>> excludeFacetKeys,
                        final Optional<ImmutableSet<String>> includeFacetKeys) {
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder()
                                    .setFacetFilters(ObjectFacetFilters.builder(objectQuery.getFacetFilters())
                                            .setExcludeAgentNameTexts(excludeFacetKeys)
                                            .setIncludeAgentNameTexts(includeFacetKeys).build())
                                    .build())
                            .build());
                }
            };
            if (!agentNameTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(agentNameTextFacetPicker);
            }
        }

        if (!availableObjectFacets.getCategories().isEmpty()) {
            final ObjectFacetPicker<String> categoryFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets.getCategories().keySet(), "Categories", facetFilters.getExcludeCategories(),
                    facetFilters.getIncludeCategories(), resultObjectFacets.getCategories().keySet()) {
                @Override
                protected void _valueChange(final Optional<ImmutableSet<String>> excludeFacetKeys,
                        final Optional<ImmutableSet<String>> includeFacetKeys) {
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder()
                                    .setFacetFilters(ObjectFacetFilters.builder(objectQuery.getFacetFilters())
                                            .setExcludeCategories(excludeFacetKeys)
                                            .setIncludeCategories(includeFacetKeys).build())
                                    .build())
                            .build());
                }
            };
            if (!categoryFacetPicker.isEmpty()) {
                rootLayout.addComponent(categoryFacetPicker);
            }
        }

        if (!availableObjectFacets.getGenders().isEmpty()) {
            final ObjectFacetPicker<Gender> genderFacetPicker = new ObjectFacetPicker<Gender>(
                    availableObjectFacets.getGenders().keySet(), "Gender", facetFilters.getExcludeGenders(),
                    facetFilters.getIncludeGenders(), resultObjectFacets.getGenders().keySet()) {
                @Override
                protected String _getCheckBoxCaption(final Gender facetKey) {
                    return Genders.getCaption(facetKey);
                }

                @Override
                protected void _valueChange(final Optional<ImmutableSet<Gender>> excludeFacetKeys,
                        final Optional<ImmutableSet<Gender>> includeFacetKeys) {
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder().setQuery(ObjectQuery
                            .builder()
                            .setFacetFilters(ObjectFacetFilters.builder(objectQuery.getFacetFilters())
                                    .setExcludeGenders(excludeFacetKeys).setIncludeGenders(includeFacetKeys).build())
                            .build()).build());
                }
            };
            if (!genderFacetPicker.isEmpty()) {
                rootLayout.addComponent(genderFacetPicker);
            }
        }

        if (!availableObjectFacets.getInstitutionHits().isEmpty()) {
            final ObjectFacetPicker<InstitutionId> institutionFacetPicker = new ObjectFacetPicker<InstitutionId>(
                    availableObjectFacets.getInstitutionHits().keySet(), "Institutions",
                    facetFilters.getExcludeInstitutionIds(), facetFilters.getIncludeInstitutionIds(),
                    resultObjectFacets.getInstitutionHits().keySet()) {
                @Override
                protected String _getCheckBoxCaption(final InstitutionId facetKey) {
                    return institutions.get(facetKey).getTitle();
                }

                @Override
                protected void _valueChange(final Optional<ImmutableSet<InstitutionId>> excludeFacetKeys,
                        final Optional<ImmutableSet<InstitutionId>> includeFacetKeys) {
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder()
                                    .setFacetFilters(ObjectFacetFilters.builder(objectQuery.getFacetFilters())
                                            .setExcludeInstitutionIds(excludeFacetKeys)
                                            .setIncludeInstitutionIds(includeFacetKeys).build())
                                    .build())
                            .build());
                }
            };
            if (!institutionFacetPicker.isEmpty()) {
                rootLayout.addComponent(institutionFacetPicker);
            }
        }

        if (!availableObjectFacets.getMaterialTexts().isEmpty()) {
            final ObjectFacetPicker<String> materialTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets.getMaterialTexts().keySet(), "Materials",
                    facetFilters.getExcludeMaterialTexts(), facetFilters.getIncludeMaterialTexts(),
                    resultObjectFacets.getMaterialTexts().keySet()) {
                @Override
                protected void _valueChange(final Optional<ImmutableSet<String>> excludeFacetKeys,
                        final Optional<ImmutableSet<String>> includeFacetKeys) {
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder()
                                    .setFacetFilters(ObjectFacetFilters.builder(objectQuery.getFacetFilters())
                                            .setExcludeMaterialTexts(excludeFacetKeys)
                                            .setIncludeMaterialTexts(includeFacetKeys).build())
                                    .build())
                            .build());
                }
            };
            if (!materialTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(materialTextFacetPicker);
            }
        }

        if (!availableObjectFacets.getSubjectTermTexts().isEmpty()) {
            final ObjectFacetPicker<String> subjectTermTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets.getSubjectTermTexts().keySet(), "Subject terms",
                    facetFilters.getExcludeSubjectTermTexts(), facetFilters.getIncludeSubjectTermTexts(),
                    resultObjectFacets.getSubjectTermTexts().keySet()) {
                @Override
                protected void _valueChange(final Optional<ImmutableSet<String>> excludeFacetKeys,
                        final Optional<ImmutableSet<String>> includeFacetKeys) {
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder()
                                    .setFacetFilters(ObjectFacetFilters.builder(objectQuery.getFacetFilters())
                                            .setExcludeSubjectTermTexts(excludeFacetKeys)
                                            .setIncludeSubjectTermTexts(includeFacetKeys).build())
                                    .build())
                            .build());
                }
            };
            if (!subjectTermTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(subjectTermTextFacetPicker);
            }
        }

        if (!availableObjectFacets.getTechniqueTexts().isEmpty()) {
            final ObjectFacetPicker<String> techniqueTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets.getTechniqueTexts().keySet(), "Techniques",
                    facetFilters.getExcludeTechniqueTexts(), facetFilters.getIncludeTechniqueTexts(),
                    resultObjectFacets.getTechniqueTexts().keySet()) {
                @Override
                protected void _valueChange(final Optional<ImmutableSet<String>> excludeFacetKeys,
                        final Optional<ImmutableSet<String>> includeFacetKeys) {
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder()
                                    .setFacetFilters(ObjectFacetFilters.builder(objectQuery.getFacetFilters())
                                            .setExcludeTechniqueTexts(excludeFacetKeys)
                                            .setIncludeTechniqueTexts(includeFacetKeys).build())
                                    .build())
                            .build());
                }
            };
            if (!techniqueTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(techniqueTextFacetPicker);
            }
        }

        if (!availableObjectFacets.getWorkTypeTexts().isEmpty()) {
            final ObjectFacetPicker<String> workTypeTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets.getWorkTypeTexts().keySet(), "Work type",
                    facetFilters.getExcludeWorkTypeTexts(), facetFilters.getIncludeWorkTypeTexts(),
                    resultObjectFacets.getWorkTypeTexts().keySet()) {
                @Override
                protected void _valueChange(final Optional<ImmutableSet<String>> excludeFacetKeys,
                        final Optional<ImmutableSet<String>> includeFacetKeys) {
                    eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                            .setQuery(ObjectQuery.builder()
                                    .setFacetFilters(ObjectFacetFilters.builder(objectQuery.getFacetFilters())
                                            .setExcludeWorkTypeTexts(excludeFacetKeys)
                                            .setIncludeWorkTypeTexts(includeFacetKeys).build())
                                    .build())
                            .build());
                }
            };
            if (!workTypeTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(workTypeTextFacetPicker);
            }
        }

        setCompositionRoot(rootLayout);
    }
}
