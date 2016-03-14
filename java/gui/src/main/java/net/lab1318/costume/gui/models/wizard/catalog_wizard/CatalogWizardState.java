package net.lab1318.costume.gui.models.wizard.catalog_wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap.Builder;

import net.lab1318.costume.api.models.object.InvalidObjectIdException;
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
            final WizardMode mode, final NameValuePairs nameValuePairs) throws InvalidObjectIdException, IoException,
            UnknownWizardFeatureException, UnknownWizardFeatureSetException {
        final WizardFeatureSet featureSet = _parseFeatureSet(featureSetFactories, mode, nameValuePairs);

        Optional<ObjectId> objectId;
        final Optional<String> objectIdString = nameValuePairs.getFirst("object_id");
        if (objectIdString.isPresent()) {
            objectId = Optional.of(ObjectId.parse(objectIdString.get()));
        } else {
            objectId = Optional.absent();
        }

        return new CatalogWizardState(Optional.of(_parseFeature(featureSet, nameValuePairs)), featureSet, objectId);
    }

    public CatalogWizardState(final Optional<WizardFeature> currentFeature, final WizardFeatureSet featureSet,
            final Optional<ObjectId> objectId) {
        super(currentFeature, featureSet);
        this.objectId = checkNotNull(objectId);
    }

    public Optional<ObjectId> getObjectId() {
        return objectId;
    }

    @Override
    protected void _toNameValuePairs(final Builder<String, String> builder) {
        super._toNameValuePairs(builder);
        if (objectId.isPresent()) {
            builder.put("object_id", objectId.get().toString());
        }
    }

    private final Optional<ObjectId> objectId;
}
