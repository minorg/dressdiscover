package net.lab1318.costume.gui.models.wizard.catalog_wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;

import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.gui.models.NameValuePairs;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureException;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureSetException;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.models.wizard.WizardState;

public final class CatalogWizardState extends WizardState {
    public static CatalogWizardState fromNameValuePairs(final WizardFeatureSetFactories featureSetFactories,
            final WizardMode mode, final NameValuePairs nameValuePairs)
            throws IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException {
        final WizardFeatureSet featureSet = _parseFeatureSet(featureSetFactories, mode, nameValuePairs);
        return new CatalogWizardState(Optional.of(_parseFeature(featureSet, nameValuePairs)), featureSet,
                Optional.absent());
    }

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
