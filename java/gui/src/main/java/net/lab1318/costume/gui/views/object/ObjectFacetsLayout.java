package net.lab1318.costume.gui.views.object;

import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableMap;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.gender.Gender;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.gui.models.gender.Genders;

@SuppressWarnings("serial")
final class ObjectFacetsLayout extends CustomComponent {
    public ObjectFacetsLayout(final ObjectFacets availableObjectFacets, final EventBus eventBus,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectQuery objectQuery,
            final ObjectFacets resultObjectFacets) {
        final VerticalLayout rootLayout = new VerticalLayout();

        if (!availableObjectFacets.getAgentNameTexts().isEmpty()) {
            final ObjectFacetPicker<String> agentNameTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets, "Agent names", eventBus, objectQuery.getFacetFilters(),
                    ObjectFacets.FieldMetadata.AGENT_NAME_TEXTS, resultObjectFacets);
            if (!agentNameTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(agentNameTextFacetPicker);
            }
        }

        if (!availableObjectFacets.getCategories().isEmpty()) {
            final ObjectFacetPicker<String> categoryFacetPicker = new ObjectFacetPicker<String>(availableObjectFacets,
                    "Categories", eventBus, objectQuery.getFacetFilters(), ObjectFacets.FieldMetadata.CATEGORIES,
                    resultObjectFacets);
            if (!categoryFacetPicker.isEmpty()) {
                rootLayout.addComponent(categoryFacetPicker);
            }
        }

        if (!availableObjectFacets.getGenders().isEmpty()) {
            final ObjectFacetPicker<Gender> genderFacetPicker = new ObjectFacetPicker<Gender>(availableObjectFacets,
                    "Genders", eventBus, objectQuery.getFacetFilters(), ObjectFacets.FieldMetadata.GENDERS,
                    resultObjectFacets) {
                @Override
                protected String _getCheckBoxCaption(final Gender facetKey) {
                    return Genders.getCaption(facetKey);
                }
            };

            if (!genderFacetPicker.isEmpty()) {
                rootLayout.addComponent(genderFacetPicker);
            }
        }

        if (!availableObjectFacets.getInstitutions().isEmpty()) {
            final ObjectFacetPicker<InstitutionId> institutionFacetPicker = new ObjectFacetPicker<InstitutionId>(
                    availableObjectFacets, "Institutions", eventBus, objectQuery.getFacetFilters(),
                    ObjectFacets.FieldMetadata.INSTITUTIONS, resultObjectFacets) {
                @Override
                protected String _getCheckBoxCaption(final InstitutionId facetKey) {
                    return institutions.get(facetKey).getTitle();
                }
            };
            if (!institutionFacetPicker.isEmpty()) {
                rootLayout.addComponent(institutionFacetPicker);
            }
        }

        if (!availableObjectFacets.getMaterialTexts().isEmpty()) {
            final ObjectFacetPicker<String> materialTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets, "Materials", eventBus, objectQuery.getFacetFilters(),
                    ObjectFacets.FieldMetadata.MATERIAL_TEXTS, resultObjectFacets);
            if (!materialTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(materialTextFacetPicker);
            }
        }

        if (!availableObjectFacets.getSubjectTermTexts().isEmpty()) {
            final ObjectFacetPicker<String> subjectTermTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets, "Subjects", eventBus, objectQuery.getFacetFilters(),
                    ObjectFacets.FieldMetadata.SUBJECT_TERM_TEXTS, resultObjectFacets);
            if (!subjectTermTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(subjectTermTextFacetPicker);
            }
        }

        if (!availableObjectFacets.getTechniqueTexts().isEmpty()) {
            final ObjectFacetPicker<String> techniqueTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets, "Techniques", eventBus, objectQuery.getFacetFilters(),
                    ObjectFacets.FieldMetadata.TECHNIQUE_TEXTS, resultObjectFacets);
            if (!techniqueTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(techniqueTextFacetPicker);
            }
        }

        if (!availableObjectFacets.getWorkTypeTexts().isEmpty()) {
            final ObjectFacetPicker<String> workTypeTextFacetPicker = new ObjectFacetPicker<String>(
                    availableObjectFacets, "Work types", eventBus, objectQuery.getFacetFilters(),
                    ObjectFacets.FieldMetadata.WORK_TYPE_TEXTS, resultObjectFacets);
            if (!workTypeTextFacetPicker.isEmpty()) {
                rootLayout.addComponent(workTypeTextFacetPicker);
            }
        }

        setCompositionRoot(rootLayout);
    }
}
