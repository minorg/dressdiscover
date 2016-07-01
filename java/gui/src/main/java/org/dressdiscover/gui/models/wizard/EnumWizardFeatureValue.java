package org.dressdiscover.gui.models.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;

import net.lab1318.costume.api.models.image.Image;

public final class EnumWizardFeatureValue {
    EnumWizardFeatureValue(final Optional<Image> image, final String name) {
        this.image = checkNotNull(image);
        this.name = checkNotNull(name);
        this.selected = false;
    }

    public Optional<Image> getImage() {
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

    private final Optional<Image> image;
    private boolean selected;
    private final String name;
}
