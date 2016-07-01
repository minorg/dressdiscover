package org.dressdiscover.gui.events.wizard.catalog_wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.gui.events.wizard.WizardFeatureSetSelectionRequest;

import com.google.common.base.Optional;

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
