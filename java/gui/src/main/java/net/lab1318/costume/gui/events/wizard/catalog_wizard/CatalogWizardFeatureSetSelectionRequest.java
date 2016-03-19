package net.lab1318.costume.gui.events.wizard.catalog_wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;

import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.gui.events.wizard.WizardFeatureSetSelectionRequest;

public final class CatalogWizardFeatureSetSelectionRequest extends WizardFeatureSetSelectionRequest {
    public CatalogWizardFeatureSetSelectionRequest(final String featureSetUrlName, final Optional<ObjectId> objectId) {
        super(featureSetUrlName);
        this.objectId = checkNotNull(objectId);
    }

    public final Optional<ObjectId> getObjectId() {
        return objectId;
    }

    private final Optional<ObjectId> objectId;
}
