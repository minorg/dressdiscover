package net.lab1318.costume.gui.views.object_by_id;

import com.vaadin.ui.Label;

import net.lab1318.costume.api.models.rights.Rights;
import net.lab1318.costume.api.models.rights.RightsSet;

@SuppressWarnings("serial")
final class RightsLabel extends Label {
    public RightsLabel(final RightsSet model) {
        if (model.getDisplay().isPresent()) {
            setValue(model.getDisplay().get());
        }
        final Rights rights = model.getElements().get(0);
        setStyleName("small");
        setValue(rights.getText());
    }
}
