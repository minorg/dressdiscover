package net.lab1318.costume.gui.views.object;

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
    @SuppressWarnings("unchecked")
    public ObjectFacetPicker(final ObjectFacets availableFacets, final String caption, final EventBus eventBus,
            final Optional<ObjectFacetFilters> facetFilters, final ObjectFacets.FieldMetadata field,
            final ObjectFacets resultFacets) {
        this.eventBus = checkNotNull(eventBus);
        this.facetFilters = checkNotNull(facetFilters);
        this.field = checkNotNull(field);

        final ImmutableSet<KeyT> availableFacetKeys = ((ImmutableMap<KeyT, UnsignedInteger>) availableFacets
                .get(field.getThriftName())).keySet();
        if (availableFacetKeys.size() <= 1) {
            setCompositionRoot(null);
            return;
        }
        final ImmutableSet<KeyT> resultFacetKeys = ((ImmutableMap<KeyT, UnsignedInteger>) resultFacets
                .get(field.getThriftName())).keySet();
        // checkState(resultFacetKeys.size() <= availableFacetKeys.size());
        // for (final KeyT resultFacetKey : resultFacetKeys) {
        // checkState(availableFacetKeys.contains(resultFacetKey));
        // }
        if (facetFilters.isPresent()) {
            excludeAll = facetFilters.get().getExcludeAll().or(Boolean.FALSE);
            final Optional<ImmutableSet<KeyT>> currentExcludeFacetKeys = ((Optional<ImmutableSet<KeyT>>) facetFilters
                    .get().get("exclude_" + field.getThriftName()));
            if (currentExcludeFacetKeys.isPresent()) {
                excludeFacetKeys.addAll(currentExcludeFacetKeys.get());
            }
            final Optional<ImmutableSet<KeyT>> currentIncludeFacetKeys = ((Optional<ImmutableSet<KeyT>>) facetFilters
                    .get().get("include_" + field.getThriftName()));
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

        try {
            ObjectFacetFilters.FieldMetadata.valueOfThriftName("exclude_missing_" + field.getThriftName());
            haveExcludeMissingFilter = true;
        } catch (final IllegalArgumentException e) {
            haveExcludeMissingFilter = false;
        }
        if (haveExcludeMissingFilter) {
            final CheckBox unknownCheckBox = new CheckBox("Unknown");
            unknownCheckBox.addStyleName("unknown");
            checkBoxesLayout.addComponent(unknownCheckBox);
            if (facetFilters.isPresent()) {
                final Optional<Boolean> excludeMissingFilter = (Optional<Boolean>) facetFilters.get()
                        .get("exclude_missing_" + field.getThriftName());
                excludeMissing = excludeMissingFilter.or(Boolean.FALSE);
            } else {
                excludeMissing = false;
            }
            unknownCheckBox.setValue(!excludeMissing);
            unknownCheckBox.addValueChangeListener(new ValueChangeListener() {
                @Override
                public void valueChange(final ValueChangeEvent event) {
                    excludeMissing = !unknownCheckBox.getValue();
                    __refresh();
                }
            });
        } else {
            excludeMissing = false;
        }

        for (final KeyT availableFacetKey : availableFacetKeyList) {
            final CheckBox checkBox;
            if (resultFacetKeys.contains(availableFacetKey)) {
                checkState((includeFacetKeys.contains(availableFacetKey)) || excludeFacetKeys.isEmpty()
                        || !excludeFacetKeys.contains(availableFacetKey));
                checkBox = new CheckBox(_getCheckBoxCaption(availableFacetKey));
                checkBox.setValue(true);
                currentlySelectedFacetKeys.add(availableFacetKey);
            } else if (excludeAll || (!excludeFacetKeys.isEmpty() && excludeFacetKeys.contains(availableFacetKey))) {
                checkBox = new CheckBox(_getCheckBoxCaption(availableFacetKey));
            } else {
                continue;
            }
            currentlyDisplayedFacetKeys.add(availableFacetKey);

            checkBox.addValueChangeListener(new ValueChangeListener() {
                @Override
                public void valueChange(final ValueChangeEvent event) {
                    if (checkBox.getValue()) {
                        checkState(currentlySelectedFacetKeys.add(availableFacetKey));
                    } else {
                        checkState(currentlySelectedFacetKeys.remove(availableFacetKey));
                    }

                    excludeFacetKeys.clear();
                    includeFacetKeys.clear();

                    if (currentlySelectedFacetKeys.isEmpty()) {
                        excludeAll = true;
                    } else if (currentlySelectedFacetKeys.size() == currentlyDisplayedFacetKeys.size()) {
                        excludeAll = false;
                    } else if (currentlySelectedFacetKeys.size() < currentlyDisplayedFacetKeys.size() / 2) {
                        // Include only when number of selected < 50%
                        includeFacetKeys.addAll(currentlySelectedFacetKeys);
                    } else {
                        // Exclude only when number of selected > 50%
                        for (final KeyT facetKey : currentlyDisplayedFacetKeys) {
                            if (!currentlySelectedFacetKeys.contains(facetKey)) {
                                excludeFacetKeys.add(facetKey);
                            }
                        }
                        checkState(!excludeFacetKeys.isEmpty());
                    }
                    __refresh();
                }
            });
            checkBoxesLayout.addComponent(checkBox);
        }

        if (currentlyDisplayedFacetKeys.isEmpty()) {
            return;
        }

        allCheckBox
                .setValue(!excludeAll && !excludeMissing && excludeFacetKeys.isEmpty() && includeFacetKeys.isEmpty());
        // Add ValueChangeListener after setting the initial value
        allCheckBox.addValueChangeListener(new ValueChangeListener() {
            @Override
            public void valueChange(final ValueChangeEvent event) {
                currentlySelectedFacetKeys.clear();
                excludeFacetKeys.clear();
                excludeMissing = false;
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

    public boolean equivalent(final ObjectFacetPicker<?> other) {
        if (!currentlyDisplayedFacetKeys.equals(other.currentlyDisplayedFacetKeys)) {
            return false;
        }
        if (!currentlySelectedFacetKeys.equals(other.currentlySelectedFacetKeys)) {
            return false;
        }
        if (excludeAll != other.excludeAll) {
            return false;
        }
        if (!excludeFacetKeys.equals(other.excludeFacetKeys)) {
            return false;
        }
        if (excludeMissing != other.excludeMissing) {
            return false;
        }
        if (field != other.field) {
            return false;
        }
        if (haveExcludeMissingFilter != other.haveExcludeMissingFilter) {
            return false;
        }
        if (!includeFacetKeys.equals(other.includeFacetKeys)) {
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
        final ObjectFacetFilters.Builder filters = ObjectFacetFilters.builder(facetFilters).unsetExcludeAll();

        if (excludeAll) {
            filters.setExcludeAll(true);
        } else {
            filters.unsetExcludeAll();
        }

        if (!excludeFacetKeys.isEmpty() && !excludeAll) {
            filters.set("exclude_" + field.getThriftName(), ImmutableSet.copyOf(excludeFacetKeys));
        } else {
            filters.unset("exclude_" + field.getThriftName());
        }

        if (excludeMissing && !excludeAll) {
            filters.set("exclude_missing_" + field.getThriftName(), true);
        } else if (haveExcludeMissingFilter) {
            filters.unset("exclude_missing_" + field.getThriftName());
        }

        if (!includeFacetKeys.isEmpty() && !excludeAll) {
            filters.set("include_" + field.getThriftName(), ImmutableSet.copyOf(includeFacetKeys));
        } else {
            filters.unset("include_" + field.getThriftName());
        }

        eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                .setQuery(ObjectQuery.builder().setFacetFilters(filters.build()).build()).build());
    }

    private final Set<KeyT> currentlyDisplayedFacetKeys = new LinkedHashSet<>();
    private final Set<KeyT> currentlySelectedFacetKeys = new LinkedHashSet<>();
    private EventBus eventBus;
    private boolean excludeAll = false;
    private final Set<KeyT> excludeFacetKeys = new LinkedHashSet<>();
    private boolean excludeMissing = false;
    private ObjectFacets.FieldMetadata field;
    private final Set<KeyT> includeFacetKeys = new LinkedHashSet<>();
    private Optional<ObjectFacetFilters> facetFilters;
    private boolean haveExcludeMissingFilter;
}
