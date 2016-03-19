package net.lab1318.costume.gui.views.object_by_id;

import com.vaadin.ui.Table;

import net.lab1318.costume.api.models.ElementSet;

@SuppressWarnings("serial")
abstract class ElementSetTable extends Table {
    protected ElementSetTable(final String captionPrefix, final ElementSet<?> elementSet) {
        if (elementSet.getDisplay().isPresent()) {
            setCaption(captionPrefix + ": " + elementSet.getDisplay().get());
        } else {
            setCaption(captionPrefix);
        }
        setWidth("100%");
    }
}
