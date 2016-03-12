package net.lab1318.costume.gui.models.wizard.catalog_wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;

import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardState;

public final class CatalogWizardState extends WizardState {
    public CatalogWizardState(final Optional<WizardFeature> currentFeature, final WizardFeatureSet featureSet,
            final Optional<ObjectId> objectId) {
        super(currentFeature, featureSet);
        this.objectId = checkNotNull(objectId);
    }

    public Optional<ObjectId> getObjectId() {
        return objectId;
    }

    private final Optional<ObjectId> objectId;
}
