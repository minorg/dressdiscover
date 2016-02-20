package net.lab1318.costume.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import net.lab1318.costume.api.models.image.Image;

public final class WizardFeatureValue {
    WizardFeatureValue(final Image image, final String name) {
        this.image = checkNotNull(image);
        this.name = checkNotNull(name);
        this.selected = false;
    }

    public Image getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(final boolean selected) {
        this.selected = selected;
    }

    private final Image image;
    private boolean selected;
    private final String name;
}
