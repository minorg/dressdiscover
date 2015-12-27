package net.lab1318.costume.gui.views.object;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import javax.annotation.Nullable;

import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableMap;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;

import net.lab1318.costume.api.models.gender.Gender;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.gui.models.gender.Genders;

@SuppressWarnings("serial")
final class ObjectFacetsLayout extends CustomComponent {
    public ObjectFacetsLayout(final EventBus eventBus) {
        this.eventBus = checkNotNull(eventBus);
        setCompositionRoot(rootLayout);
    }

    public void setModels(final ObjectFacets availableObjectFacets,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectQuery objectQuery,
            final ObjectFacets resultObjectFacets) {
        int rowI = 0;

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Agent names", eventBus,
                        objectQuery.getFacetFilters(), ObjectFacets.FieldMetadata.AGENT_NAME_TEXTS, resultObjectFacets),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Categories", eventBus,
                        objectQuery.getFacetFilters(), ObjectFacets.FieldMetadata.CATEGORIES, resultObjectFacets),
                rowI++);

        __addFacetPicker(availableObjectFacets, new ObjectFacetPicker<Gender>(availableObjectFacets, "Genders",
                eventBus, objectQuery.getFacetFilters(), ObjectFacets.FieldMetadata.GENDERS, resultObjectFacets) {
            @Override
            protected String _getCheckBoxCaption(final Gender facetKey) {
                return Genders.getCaption(facetKey);
            }
        }, rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<InstitutionId>(availableObjectFacets, "Institutions", eventBus,
                        objectQuery.getFacetFilters(), ObjectFacets.FieldMetadata.INSTITUTIONS, resultObjectFacets) {
                    @Override
                    protected String _getCheckBoxCaption(final InstitutionId facetKey) {
                        return institutions.get(facetKey).getTitle();
                    }
                }, rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Materials", eventBus,
                        objectQuery.getFacetFilters(), ObjectFacets.FieldMetadata.MATERIAL_TEXTS, resultObjectFacets),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Subjects", eventBus,
                        objectQuery.getFacetFilters(), ObjectFacets.FieldMetadata.SUBJECT_TERM_TEXTS,
                        resultObjectFacets),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Techniques", eventBus,
                        objectQuery.getFacetFilters(), ObjectFacets.FieldMetadata.TECHNIQUE_TEXTS, resultObjectFacets),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Work types", eventBus,
                        objectQuery.getFacetFilters(), ObjectFacets.FieldMetadata.WORK_TYPE_TEXTS, resultObjectFacets),
                rowI++);

        rootLayout.setSizeFull();
    }

    private void __addFacetPicker(final ObjectFacets availableObjectFacets, final ObjectFacetPicker<?> facetPicker,
            final int rowI) {
        @Nullable
        final ObjectFacetPicker<?> existingFacetPicker = (ObjectFacetPicker<?>) rootLayout.getComponent(0, rowI);
        if (existingFacetPicker != null) {
            checkState(existingFacetPicker.getField().equals(facetPicker.getField()));
        }

        if (facetPicker.isEmpty()) {
            rootLayout.removeComponent(0, rowI);
        }

        if (existingFacetPicker != null) {
            if (existingFacetPicker.equivalent(facetPicker)) {
                return;
            }
        }

        if (existingFacetPicker != null) {
            rootLayout.removeComponent(0, rowI);
        }
        rootLayout.addComponent(facetPicker, 0, rowI);
    }

    private final EventBus eventBus;
    private final GridLayout rootLayout = new GridLayout(1, 8);
}
