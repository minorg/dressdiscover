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
            final Optional<ObjectFacetFilters> facetFilters, final String facetThriftName,
            final ObjectFacets resultFacets) {
        this.eventBus = checkNotNull(eventBus);
        this.facetFilters = checkNotNull(facetFilters);
        this.facetThriftName = checkNotNull(facetThriftName);

        final ImmutableSet<KeyT> availableFacetKeys = ((ImmutableMap<KeyT, UnsignedInteger>) availableFacets
                .get(facetThriftName)).keySet();
        if (availableFacetKeys.size() <= 1) {
            return;
        }
        final ImmutableSet<KeyT> resultFacetKeys = ((ImmutableMap<KeyT, UnsignedInteger>) resultFacets
                .get(facetThriftName)).keySet();
        // checkState(resultFacetKeys.size() <= availableFacetKeys.size());
        // for (final KeyT resultFacetKey : resultFacetKeys) {
        // checkState(availableFacetKeys.contains(resultFacetKey));
        // }
        boolean excludeAll;
        Optional<ImmutableSet<KeyT>> excludeFacetKeys;
        Optional<ImmutableSet<KeyT>> includeFacetKeys;
        if (facetFilters.isPresent()) {
            excludeAll = facetFilters.get().getExcludeAll().or(Boolean.FALSE);
            excludeFacetKeys = ((Optional<ImmutableSet<KeyT>>) facetFilters.get().get("exclude_" + facetThriftName));
            includeFacetKeys = ((Optional<ImmutableSet<KeyT>>) facetFilters.get().get("include_" + facetThriftName));
        } else {
            excludeAll = false;
            excludeFacetKeys = includeFacetKeys = Optional.absent();
        }

        final VerticalLayout checkBoxesLayout = new VerticalLayout();

        final Set<KeyT> currentlyDisplayedFacetKeys = new LinkedHashSet<>();
        final Set<KeyT> currentlySelectedFacetKeys = new LinkedHashSet<>();

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

        for (final KeyT availableFacetKey : availableFacetKeyList) {
            final CheckBox checkBox;
            if (resultFacetKeys.contains(availableFacetKey)) {
                checkState((includeFacetKeys.isPresent() && includeFacetKeys.get().contains(availableFacetKey))
                        || !excludeFacetKeys.isPresent() || !excludeFacetKeys.get().contains(availableFacetKey));
                checkBox = new CheckBox(_getCheckBoxCaption(availableFacetKey));
                checkBox.setValue(true);
                currentlySelectedFacetKeys.add(availableFacetKey);
            } else if (excludeAll
                    || (excludeFacetKeys.isPresent() && excludeFacetKeys.get().contains(availableFacetKey))) {
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

                    if (currentlySelectedFacetKeys.isEmpty()) {
                        __excludeAll();
                    } else if (currentlySelectedFacetKeys.size() == currentlyDisplayedFacetKeys.size()) {
                        __includeAll();
                    } else if (currentlySelectedFacetKeys.size() < currentlyDisplayedFacetKeys.size() / 2) {
                        // Include only when number of selected < 50%
                        __includeSome(ImmutableSet.copyOf(currentlySelectedFacetKeys));
                    } else {
                        // Exclude only when number of selected > 50%
                        final ImmutableSet.Builder<KeyT> excludeFacetKeysBuilder = ImmutableSet.builder();
                        for (final KeyT facetKey : currentlyDisplayedFacetKeys) {
                            if (!currentlySelectedFacetKeys.contains(facetKey)) {
                                excludeFacetKeysBuilder.add(facetKey);
                            }
                        }
                        final ImmutableSet<KeyT> tempExcludeFacetKeys = excludeFacetKeysBuilder.build();
                        checkState(!tempExcludeFacetKeys.isEmpty());
                        __excludeSome(tempExcludeFacetKeys);
                    }
                }
            });
            checkBoxesLayout.addComponent(checkBox);
        }

        if (currentlyDisplayedFacetKeys.isEmpty()) {
            return;
        }

        if (!excludeAll && !excludeFacetKeys.isPresent() && !includeFacetKeys.isPresent()) {
            allCheckBox.setValue(true);
        }
        // Add ValueChangeListener after setting the initial value
        allCheckBox.addValueChangeListener(new ValueChangeListener() {
            @Override
            public void valueChange(final ValueChangeEvent event) {
                currentlySelectedFacetKeys.clear();
                if (allCheckBox.getValue()) {
                    __includeAll();
                } else {
                    __excludeAll();
                }
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

    public final boolean isEmpty() {
        return getCompositionRoot() == null;
    }

    protected String _getCheckBoxCaption(final KeyT facetKey) {
        return facetKey.toString();
    }

    private void __excludeAll() {
        eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                .setQuery(ObjectQuery.builder()
                        .setFacetFilters(ObjectFacetFilters.builder(facetFilters).setExcludeAll(true)
                                .unset("exclude_" + facetThriftName).unset("include_" + facetThriftName).build())
                .build()).build());
    }

    private void __excludeSome(final ImmutableSet<KeyT> excludeFacetKeys) {
        eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                .setQuery(ObjectQuery.builder()
                        .setFacetFilters(ObjectFacetFilters.builder(facetFilters).unsetExcludeAll()
                                .set("exclude_" + facetThriftName, excludeFacetKeys).unset("include_" + facetThriftName)
                                .build())
                        .build())
                .build());
    }

    private void __includeAll() {
        eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                .setQuery(ObjectQuery.builder()
                        .setFacetFilters(ObjectFacetFilters.builder(facetFilters).unsetExcludeAll()
                                .unset("exclude_" + facetThriftName).unset("include_" + facetThriftName).build())
                .build()).build());
    }

    private void __includeSome(final ImmutableSet<KeyT> includeFacetKeys) {
        eventBus.post(ObjectQueryService.Messages.GetObjectSummariesRequest.builder()
                .setQuery(ObjectQuery.builder()
                        .setFacetFilters(ObjectFacetFilters.builder(facetFilters).unsetExcludeAll()
                                .unset("exclude_" + facetThriftName).set("include_" + facetThriftName, includeFacetKeys)
                                .build())
                        .build())
                .build());
    }

    private EventBus eventBus;
    private Optional<ObjectFacetFilters> facetFilters;
    private String facetThriftName;
}
