package net.lab1318.costume.gui.views.objects;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.thryft.waf.gui.EventBus;
import org.vaadin.viritin.components.DisclosurePanel;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.UnsignedInteger;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.services.object.ObjectFacetFilters;
import net.lab1318.costume.api.services.object.ObjectFacets;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectQueryService;

@SuppressWarnings("serial")
class ObjectFacetPicker<KeyT> extends CustomComponent {
    private final class CheckBoxValueChangeListener implements ValueChangeListener {
        public CheckBoxValueChangeListener(final KeyT facetKey) {
            this.facetKey = checkNotNull(facetKey);
        }

        @Override
        public void valueChange(final ValueChangeEvent event) {
            final LinkedHashSet<KeyT> newSelectedFacetKeys = new LinkedHashSet<>(currentlySelectedFacetKeys);
            if ((Boolean) event.getProperty().getValue()) {
                checkState(newSelectedFacetKeys.add(facetKey));
            } else {
                checkState(newSelectedFacetKeys.remove(facetKey));
            }

            excludeFacetKeys.clear();
            includeFacetKeys.clear();

            if (newSelectedFacetKeys.isEmpty()) {
                excludeAll = true;
            } else if (newSelectedFacetKeys.size() == currentlyDisplayedFacetKeys.size()) {
                excludeAll = false;
            } else if (newSelectedFacetKeys.size() < currentlyDisplayedFacetKeys.size() / 2) {
                excludeAll = false;
                // Include only when number of selected < 50%
                includeFacetKeys.addAll(newSelectedFacetKeys);
            } else {
                excludeAll = false;
                // Exclude only when number of selected > 50%
                for (final KeyT facetKey : currentlyDisplayedFacetKeys) {
                    if (!newSelectedFacetKeys.contains(facetKey)) {
                        excludeFacetKeys.add(facetKey);
                    }
                }
                checkState(!excludeFacetKeys.isEmpty());
            }
            __refresh();
        }

        private final KeyT facetKey;
    }

    @SuppressWarnings("unchecked")
    public ObjectFacetPicker(final ObjectFacets availableFacets, final String caption, final EventBus eventBus,
            final ObjectFacets.FieldMetadata field, final ObjectQuery objectQuery, final ObjectFacets resultFacets,
            final Optional<KeyT> unknownFacetKey) {
        this.eventBus = checkNotNull(eventBus);
        this.field = checkNotNull(field);
        this.objectQuery = checkNotNull(objectQuery);

        final ImmutableSet<KeyT> availableFacetKeys = ((ImmutableMap<KeyT, UnsignedInteger>) availableFacets
                .get(field.getThriftName())).keySet();
        if (availableFacetKeys.size() <= 1) {
            allCheckBoxValue = false;
            currentlyDisplayedFacetKeys = currentlySelectedFacetKeys = ImmutableSet.of();
            setCompositionRoot(null);
            return;
        }
        final ImmutableSet<KeyT> resultFacetKeys = ((ImmutableMap<KeyT, UnsignedInteger>) resultFacets
                .get(field.getThriftName())).keySet();
        // checkState(resultFacetKeys.size() <= availableFacetKeys.size());
        // for (final KeyT resultFacetKey : resultFacetKeys) {
        // checkState(availableFacetKeys.contains(resultFacetKey));
        // }
        if (objectQuery.getFacetFilters().isPresent()) {
            excludeAll = objectQuery.getFacetFilters().get().getExcludeAll().or(Boolean.FALSE);
            final Optional<ImmutableSet<KeyT>> currentExcludeFacetKeys = ((Optional<ImmutableSet<KeyT>>) objectQuery
                    .getFacetFilters().get().get("exclude_" + field.getThriftName()));
            if (currentExcludeFacetKeys.isPresent()) {
                excludeFacetKeys.addAll(currentExcludeFacetKeys.get());
            }
            final Optional<ImmutableSet<KeyT>> currentIncludeFacetKeys = ((Optional<ImmutableSet<KeyT>>) objectQuery
                    .getFacetFilters().get().get("include_" + field.getThriftName()));
            if (currentIncludeFacetKeys.isPresent()) {
                includeFacetKeys.addAll(currentIncludeFacetKeys.get());
            }
        } else {
            excludeAll = false;
        }

        final VerticalLayout checkBoxesLayout = new VerticalLayout();

        final List<KeyT> availableFacetKeyList = new ArrayList<>(availableFacetKeys);
        availableFacetKeyList.sort(new Comparator<KeyT>() {
            @Override
            public int compare(final KeyT o1, final KeyT o2) {
                return _getCheckBoxCaption(o1).compareTo(_getCheckBoxCaption(o2));
            }
        });

        final CheckBox allCheckBox = new CheckBox("All");
        allCheckBox.addStyleName("all");
        checkBoxesLayout.addComponent(allCheckBox);

        final ImmutableSet.Builder<KeyT> currentlyDisplayedFacetKeysBuilder = ImmutableSet.builder();
        final ImmutableSet.Builder<KeyT> currentlySelectedFacetKeysBuilder = ImmutableSet.builder();

        if (unknownFacetKey.isPresent()) {
            boolean displayUnknownCheckBox = true;
            final CheckBox unknownCheckBox = new CheckBox("Unknown");
            if (excludeAll || (!excludeFacetKeys.isEmpty() && excludeFacetKeys.contains(unknownFacetKey.get()))) {
                unknownCheckBox.setValue(false);
            } else if (includeFacetKeys.isEmpty() || includeFacetKeys.contains(unknownFacetKey.get())) {
                unknownCheckBox.setValue(true);
                currentlySelectedFacetKeysBuilder.add(unknownFacetKey.get());
            } else {
                displayUnknownCheckBox = false;
            }
            if (displayUnknownCheckBox) {
                unknownCheckBox.addStyleName("unknown");
                checkBoxesLayout.addComponent(unknownCheckBox);
                currentlyDisplayedFacetKeysBuilder.add(unknownFacetKey.get());
                unknownCheckBox.addValueChangeListener(new CheckBoxValueChangeListener(unknownFacetKey.get()));
            }
        }

        for (final KeyT availableFacetKey : availableFacetKeyList) {
            final CheckBox checkBox;
            if (resultFacetKeys.contains(availableFacetKey)) {
                checkState((includeFacetKeys.contains(availableFacetKey)) || excludeFacetKeys.isEmpty()
                        || !excludeFacetKeys.contains(availableFacetKey));
                checkBox = new CheckBox(_getCheckBoxCaption(availableFacetKey));
                checkBox.setValue(true);
                currentlySelectedFacetKeysBuilder.add(availableFacetKey);
            } else if (excludeAll || (!excludeFacetKeys.isEmpty() && excludeFacetKeys.contains(availableFacetKey))) {
                checkBox = new CheckBox(_getCheckBoxCaption(availableFacetKey));
            } else {
                continue;
            }
            currentlyDisplayedFacetKeysBuilder.add(availableFacetKey);

            checkBox.addValueChangeListener(new CheckBoxValueChangeListener(availableFacetKey));
            checkBoxesLayout.addComponent(checkBox);
        }
        currentlyDisplayedFacetKeys = currentlyDisplayedFacetKeysBuilder.build();
        currentlySelectedFacetKeys = currentlySelectedFacetKeysBuilder.build();
        if (currentlyDisplayedFacetKeys.isEmpty()) {
            allCheckBoxValue = false;
            return;
        }

        allCheckBoxValue = !excludeAll && excludeFacetKeys.isEmpty() && includeFacetKeys.isEmpty();
        allCheckBox.setValue(allCheckBoxValue);
        // Add ValueChangeListener after setting the initial value
        allCheckBox.addValueChangeListener(new ValueChangeListener() {
            @Override
            public void valueChange(final ValueChangeEvent event) {
                excludeFacetKeys.clear();
                includeFacetKeys.clear();
                excludeAll = !allCheckBox.getValue();
                __refresh();
            }
        });

        final Panel contentPanel = new Panel();
        contentPanel.setContent(checkBoxesLayout);
        if (currentlyDisplayedFacetKeys.size() > 5) {
            contentPanel.setHeight((float) 10.0, Unit.EM);
        }

        final DisclosurePanel disclosurePanel = new DisclosurePanel();
        disclosurePanel.setCaption(caption);
        disclosurePanel.setContent(contentPanel);
        disclosurePanel.setOpen(true);
        disclosurePanel.getContentWrapper().addStyleName("disclosure-panel-content-wrapper-object-facet-picker");

        setCompositionRoot(disclosurePanel);
    }

    public boolean equivalent(final ObjectFacetPicker<?> newVersion) {
        checkState(field == newVersion.field);
        if (allCheckBoxValue != newVersion.allCheckBoxValue) {
            return false;
        }
        if (!currentlyDisplayedFacetKeys.equals(newVersion.currentlyDisplayedFacetKeys)) {
            return false;
        }
        if (!currentlySelectedFacetKeys.equals(newVersion.currentlySelectedFacetKeys)) {
            return false;
        }
        return true;
    }

    public final ObjectFacets.FieldMetadata getField() {
        return field;
    }

    public final boolean isEmpty() {
        return getCompositionRoot() == null;
    }

    protected String _getCheckBoxCaption(final KeyT facetKey) {
        return facetKey.toString();
    }

    private void __refresh() {
        final ObjectFacetFilters.Builder filtersBuilder = ObjectFacetFilters.builder(objectQuery.getFacetFilters())
                .unsetExcludeAll();

        if (excludeAll) {
            filtersBuilder.setExcludeAll(true);
        } else {
            filtersBuilder.unsetExcludeAll();
        }

        if (!excludeFacetKeys.isEmpty() && !excludeAll) {
            filtersBuilder.set("exclude_" + field.getThriftName(), ImmutableSet.copyOf(excludeFacetKeys));
        } else {
            filtersBuilder.unset("exclude_" + field.getThriftName());
        }

        if (!includeFacetKeys.isEmpty() && !excludeAll) {
            filtersBuilder.set("include_" + field.getThriftName(), ImmutableSet.copyOf(includeFacetKeys));
        } else {
            filtersBuilder.unset("include_" + field.getThriftName());
        }

        final ObjectFacetFilters filters = filtersBuilder.build();

        final ObjectQuery.Builder queryBuilder = ObjectQuery.builder(objectQuery);
        if (!filters.isEmpty()) {
            queryBuilder.setFacetFilters(filters);
        } else {
            queryBuilder.unsetFacetFilters();
        }

        eventBus.post(
                ObjectQueryService.Messages.GetObjectSummariesRequest.builder().setQuery(queryBuilder.build()).build());
    }

    // Immutable view state
    private final boolean allCheckBoxValue;
    private final ImmutableSet<KeyT> currentlyDisplayedFacetKeys;
    private final ImmutableSet<KeyT> currentlySelectedFacetKeys;

    // Mutable model state
    private boolean excludeAll = false;
    private final Set<KeyT> excludeFacetKeys = new LinkedHashSet<>();
    private final Set<KeyT> includeFacetKeys = new LinkedHashSet<>();

    // Immutable model state
    private final EventBus eventBus;
    private final ObjectFacets.FieldMetadata field;
    private final ObjectQuery objectQuery;
}
