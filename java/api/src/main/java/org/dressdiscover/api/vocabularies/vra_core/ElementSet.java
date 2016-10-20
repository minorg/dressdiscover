package org.dressdiscover.api.vocabularies.vra_core;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

public interface ElementSet<ElementT extends Element> {
    public Optional<String> getDisplay();

    public ImmutableList<ElementT> getElements();

    public Optional<String> getNotes();
}
