package org.dressdiscover.gui.presenters.wizard.catalog_wizard;

import java.util.HashMap;
import java.util.Map;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.gui.events.wizard.catalog_wizard.CatalogWizardFeatureSetSelectionRequest;
import org.dressdiscover.gui.models.NameValuePairs;
import org.dressdiscover.gui.presenters.Presenter;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardFeatureView;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardStartView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.UserError;
import com.vaadin.ui.UI;

import org.dressdiscover.api.models.object.InvalidObjectIdException;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.services.user.UserCommandService;
import org.dressdiscover.api.services.user.UserQueryService;

@SessionScoped
public class CatalogWizardStartPresenter extends Presenter<CatalogWizardStartView> {
    @Inject
    public CatalogWizardStartPresenter(final EventBus eventBus, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final CatalogWizardStartView view) {
        super(eventBus, userCommandService, userQueryService, view);
    }

    @Subscribe
    public void onCatalogWizardFeatureSetSelectionRequest(final CatalogWizardFeatureSetSelectionRequest event) {
        final Map<String, String> parameters = new HashMap<>();
        parameters.put("feature_set", event.getFeatureSetUrlName());
        if (event.getObjectId().isPresent()) {
            parameters.put("object_id", event.getObjectId().get().toString());
        }
        UI.getCurrent().getNavigator()
                .navigateTo(CatalogWizardFeatureView.NAME + '/' + new NameValuePairs(parameters).toUrlEncodedString());
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        final NameValuePairs parameters = NameValuePairs.fromUrlEncodedString(event.getParameters());

        Optional<ObjectId> objectId;
        {
            final Optional<String> objectIdString = parameters.getFirst("object_id");
            if (objectIdString.isPresent()) {
                try {
                    objectId = Optional.of(ObjectId.parse(objectIdString.get()));
                } catch (final InvalidObjectIdException e) {
                    _getView().setComponentError(new UserError("invalid object ID"));
                    return;
                }
            } else {
                objectId = Optional.absent();
            }
        }

        _getView().setModels(objectId);
    }
}
