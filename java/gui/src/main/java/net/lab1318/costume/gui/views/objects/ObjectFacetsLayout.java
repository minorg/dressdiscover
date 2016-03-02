package net.lab1318.costume.gui.views.objects;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import javax.annotation.Nullable;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;

import net.lab1318.costume.api.models.gender.Gender;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectFacets;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.gui.models.gender.Genders;

@SuppressWarnings("serial")
final class ObjectFacetsLayout extends CustomComponent {
    public ObjectFacetsLayout(final EventBus eventBus) {
        this.eventBus = checkNotNull(eventBus);
        setCompositionRoot(rootLayout);
        setStyleName("object-facets-layout");
    }

    public void setModels(final ObjectFacets availableObjectFacets,
            final ImmutableMap<InstitutionId, Institution> institutions, final ObjectQuery objectQuery,
            final ObjectFacets resultObjectFacets) {
        int rowI = 0;

        final Button resetButton = new Button("Reset filters", new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                eventBus.post(ObjectSummaryQueryService.Messages.GetObjectSummariesRequest.builder()
                        .setQuery(ObjectQuery.builder(objectQuery).unsetFacetFilters().build()).build());
            }
        });
        resetButton.setStyleName("reset-button");
        if (rootLayout.getComponent(0, rowI) != null) {
            rootLayout.removeComponent(0, rowI);
        }
        rootLayout.addComponent(resetButton, 0, rowI++);

        final Optional<String> UNKNOWN_TEXT_FACET_KEY = Optional.of("");

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Categories", eventBus,
                        ObjectFacets.FieldMetadata.CATEGORIES, objectQuery, resultObjectFacets, UNKNOWN_TEXT_FACET_KEY),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Colors", eventBus,
                        ObjectFacets.FieldMetadata.COLOR_TEXTS, objectQuery, resultObjectFacets,
                        UNKNOWN_TEXT_FACET_KEY),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Cultural contexts", eventBus,
                        ObjectFacets.FieldMetadata.CULTURAL_CONTEXT_TEXTS, objectQuery, resultObjectFacets,
                        UNKNOWN_TEXT_FACET_KEY),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<Gender>(availableObjectFacets, "Genders", eventBus,
                        ObjectFacets.FieldMetadata.GENDERS, objectQuery, resultObjectFacets,
                        Optional.of(Gender.UNKNOWN)) {
                    @Override
                    protected String _getCheckBoxCaption(final Gender facetKey) {
                        return Genders.getCaption(facetKey);
                    }
                }, rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<InstitutionId>(availableObjectFacets, "Institutions", eventBus,
                        ObjectFacets.FieldMetadata.INSTITUTIONS, objectQuery, resultObjectFacets, Optional.absent()) {
                    @Override
                    protected String _getCheckBoxCaption(final InstitutionId facetKey) {
                        return institutions.get(facetKey).getTitle();
                    }
                }, rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Locations", eventBus,
                        ObjectFacets.FieldMetadata.LOCATION_NAME_TEXTS, objectQuery, resultObjectFacets,
                        UNKNOWN_TEXT_FACET_KEY),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Materials", eventBus,
                        ObjectFacets.FieldMetadata.MATERIAL_TEXTS, objectQuery, resultObjectFacets,
                        UNKNOWN_TEXT_FACET_KEY),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Subjects", eventBus,
                        ObjectFacets.FieldMetadata.SUBJECT_TERM_TEXTS, objectQuery, resultObjectFacets,
                        UNKNOWN_TEXT_FACET_KEY),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Techniques", eventBus,
                        ObjectFacets.FieldMetadata.TECHNIQUE_TEXTS, objectQuery, resultObjectFacets,
                        UNKNOWN_TEXT_FACET_KEY),
                rowI++);

        __addFacetPicker(availableObjectFacets,
                new ObjectFacetPicker<String>(availableObjectFacets, "Work types", eventBus,
                        ObjectFacets.FieldMetadata.WORK_TYPE_TEXTS, objectQuery, resultObjectFacets,
                        UNKNOWN_TEXT_FACET_KEY),
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
    private final GridLayout rootLayout = new GridLayout(1, 12);
}
