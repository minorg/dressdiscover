package net.lab1318.costume.gui.components;

import com.vaadin.ui.Label;

import net.lab1318.costume.api.models.rights.Rights;
import net.lab1318.costume.api.models.rights.RightsSet;

@SuppressWarnings("serial")
public final class RightsLabel extends Label {
    public RightsLabel(final RightsSet model) {
        if (model.getDisplay().isPresent()) {
            setValue(model.getDisplay().get());
        }
        final Rights rights = model.getRights().get(0);
        setValue(rights.getText());
    }
}
