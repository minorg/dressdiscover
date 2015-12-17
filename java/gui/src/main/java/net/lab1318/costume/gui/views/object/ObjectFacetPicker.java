package net.lab1318.costume.gui.views.object;

import static com.google.common.base.Preconditions.checkState;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.vaadin.viritin.components.DisclosurePanel;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
abstract class ObjectFacetPicker<KeyT> extends CustomComponent {
    public ObjectFacetPicker(final ImmutableSet<KeyT> availableFacetKeys, final String caption,
            final Optional<ImmutableSet<KeyT>> excludeFacetKeys, final Optional<ImmutableSet<KeyT>> includeFacetKeys,
            final ImmutableSet<KeyT> resultFacetKeys) {
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

        final CheckBox allCheckBox = new CheckBox("Select all");
        checkBoxesLayout.addComponent(allCheckBox);

        for (final KeyT availableFacetKey : availableFacetKeyList) {
            final CheckBox checkBox;
            if (resultFacetKeys.contains(availableFacetKey)) {
                checkState((includeFacetKeys.isPresent() && includeFacetKeys.get().contains(availableFacetKey))
                        || !excludeFacetKeys.isPresent() || !excludeFacetKeys.get().contains(availableFacetKey));
                checkBox = new CheckBox(_getCheckBoxCaption(availableFacetKey));
                checkBox.setValue(true);
                currentlySelectedFacetKeys.add(availableFacetKey);
            } else if (excludeFacetKeys.isPresent() && excludeFacetKeys.get().contains(availableFacetKey)) {
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
                        // Exclude all
                        _valueChange(Optional.of(availableFacetKeys), Optional.absent());
                    } else if (currentlySelectedFacetKeys.size() == currentlyDisplayedFacetKeys.size()) {
                        // Include all
                        _valueChange(Optional.absent(), Optional.absent());
                    } else if (currentlySelectedFacetKeys.size() < currentlyDisplayedFacetKeys.size() / 2) {
                        // Include only when number of selected < 50%
                        _valueChange(Optional.absent(), Optional.of(ImmutableSet.copyOf(currentlySelectedFacetKeys)));
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
                        _valueChange(Optional.of(tempExcludeFacetKeys), Optional.absent());
                    }
                }
            });
            checkBoxesLayout.addComponent(checkBox);
        }

        if (currentlyDisplayedFacetKeys.isEmpty()) {
            return;
        }

        if (currentlySelectedFacetKeys.size() == currentlyDisplayedFacetKeys.size()) {
            allCheckBox.setValue(true);
        }
        // Add ValueChangeListener after setting the initial value
        allCheckBox.addValueChangeListener(new ValueChangeListener() {
            @Override
            public void valueChange(final ValueChangeEvent event) {
                currentlySelectedFacetKeys.clear();
                _valueChange(Optional.absent(), Optional.absent());
            }
        });

        final DisclosurePanel disclosurePanel = new DisclosurePanel();
        disclosurePanel.setCaption(caption);
        disclosurePanel.setContent(checkBoxesLayout);
        disclosurePanel.setOpen(true);

        setCompositionRoot(disclosurePanel);
    }

    public final boolean isEmpty() {
        return getCompositionRoot() == null;
    }

    protected String _getCheckBoxCaption(final KeyT facetKey) {
        return facetKey.toString();
    }

    protected abstract void _valueChange(final Optional<ImmutableSet<KeyT>> excludeFacetKeys,
            final Optional<ImmutableSet<KeyT>> includeFacetKeys);
}
