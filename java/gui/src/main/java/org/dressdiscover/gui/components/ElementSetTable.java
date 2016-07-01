package org.dressdiscover.gui.components;

import org.dressdiscover.api.models.ElementSet;

import com.vaadin.ui.Table;

@SuppressWarnings("serial")
abstract class ElementSetTable extends Table {
    protected ElementSetTable(final String captionPrefix, final ElementSet<?> elementSet) {
        if (elementSet.getDisplay().isPresent()) {
            setCaption(captionPrefix + ": " + elementSet.getDisplay().get());
        } else {
            setCaption(captionPrefix);
        }
        addStyleName("element-set-table");
    }
}
