package net.lab1318.costume.gui.views.object;

import static com.google.common.base.Preconditions.checkState;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.vaadin.viritin.components.DisclosurePanel;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.UnsignedInteger;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
abstract class ObjectFacetPicker<KeyT> extends CustomComponent {
    public ObjectFacetPicker(final ImmutableMap<KeyT, UnsignedInteger> availableFacets, final String caption,
            final ImmutableSet<KeyT> excludeFacetKeys, final ImmutableSet<KeyT> includeFacetKeys) {
        final VerticalLayout checkBoxesLayout = new VerticalLayout();
        final Set<KeyT> currentlySelectedFacetKeys = new LinkedHashSet<>();

        final List<Map.Entry<KeyT, UnsignedInteger>> availableFacetsEntrySet = new ArrayList<>(
                availableFacets.entrySet());
        availableFacetsEntrySet.sort(new Comparator<Map.Entry<KeyT, UnsignedInteger>>() {
            @Override
            public int compare(final Entry<KeyT, UnsignedInteger> o1, final Entry<KeyT, UnsignedInteger> o2) {
                return _getCheckBoxCaption(o1.getKey()).compareTo(_getCheckBoxCaption(o2.getKey()));
            }
        });

        for (final Map.Entry<KeyT, UnsignedInteger> availableFacetsEntry : availableFacetsEntrySet) {
            final CheckBox checkBox = new CheckBox(String.format("%s (%s objects)",
                    _getCheckBoxCaption(availableFacetsEntry.getKey()), availableFacetsEntry.getValue()));

            if (!excludeFacetKeys.contains(availableFacetsEntry.getKey())
                    || includeFacetKeys.contains(availableFacetsEntry.getKey())) {
                checkBox.setValue(true);
                currentlySelectedFacetKeys.add(availableFacetsEntry.getKey());
            }

            checkBox.addValueChangeListener(new ValueChangeListener() {
                @Override
                public void valueChange(final ValueChangeEvent event) {
                    if (checkBox.getValue()) {
                        checkState(currentlySelectedFacetKeys.add(availableFacetsEntry.getKey()));
                    } else {
                        checkState(currentlySelectedFacetKeys.remove(availableFacetsEntry.getKey()));
                    }

                    if (currentlySelectedFacetKeys.size() < availableFacets.size() / 2) {
                        // Include only when number of selected < 50%
                        _valueChange(ImmutableSet.of(), ImmutableSet.copyOf(currentlySelectedFacetKeys));
                    } else {
                        // Exclude only when number of selected > 50%
                        final ImmutableSet.Builder<KeyT> excludeFacetKeysBuilder = ImmutableSet.builder();
                        for (final KeyT facetKey : availableFacets.keySet()) {
                            if (!currentlySelectedFacetKeys.contains(facetKey)) {
                                excludeFacetKeysBuilder.add(facetKey);
                            }
                        }
                        _valueChange(excludeFacetKeysBuilder.build(), ImmutableSet.of());
                    }
                }
            });
            checkBoxesLayout.addComponent(checkBox);
        }

        final DisclosurePanel disclosurePanel = new DisclosurePanel();
        disclosurePanel.setCaption(caption);
        disclosurePanel.setContent(checkBoxesLayout);
        disclosurePanel.setOpen(true);

        setCompositionRoot(disclosurePanel);
    }

    protected String _getCheckBoxCaption(final KeyT facetKey) {
        return facetKey.toString();
    }

    protected abstract void _valueChange(final ImmutableSet<KeyT> excludeFacetKeys,
            final ImmutableSet<KeyT> includeFacetKeys);
}
