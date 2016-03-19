package net.lab1318.costume.gui.presenters.wizard.catalog_wizard;

import java.util.HashMap;
import java.util.Map;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.UserError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.events.wizard.catalog_wizard.CatalogWizardFeatureSetSelectionRequest;
import net.lab1318.costume.gui.models.NameValuePairs;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardFeatureView;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardStartView;

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
