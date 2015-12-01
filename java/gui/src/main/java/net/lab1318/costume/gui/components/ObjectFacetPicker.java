package net.lab1318.costume.gui.components;

import static com.google.common.base.Preconditions.checkState;

import java.util.LinkedHashSet;
import java.util.Map;
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
public abstract class ObjectFacetPicker<KeyT> extends CustomComponent {
	public ObjectFacetPicker(final ImmutableMap<KeyT, UnsignedInteger> availableFacets, final String caption,
			final ImmutableSet<KeyT> excludeFacetKeys, final ImmutableSet<KeyT> includeFacetKeys) {
		final VerticalLayout checkBoxesLayout = new VerticalLayout();
		final Set<KeyT> currentlySelectedFacetKeys = new LinkedHashSet<>();
		for (final Map.Entry<KeyT, UnsignedInteger> entry : availableFacets.entrySet()) {
			final CheckBox checkBox = new CheckBox(
					String.format("%s (%s objects)", _getCheckBoxCaption(entry.getKey()), entry.getValue()));

			if (!excludeFacetKeys.contains(entry.getKey()) || includeFacetKeys.contains(entry.getKey())) {
				checkBox.setValue(true);
				currentlySelectedFacetKeys.add(entry.getKey());
			}

			checkBox.addValueChangeListener(new ValueChangeListener() {
				@Override
				public void valueChange(final ValueChangeEvent event) {
					if (checkBox.getValue()) {
						checkState(currentlySelectedFacetKeys.add(entry.getKey()));
					} else {
						checkState(currentlySelectedFacetKeys.remove(entry.getKey()));
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
