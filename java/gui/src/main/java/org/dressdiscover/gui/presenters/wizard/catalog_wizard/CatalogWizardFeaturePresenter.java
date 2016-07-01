package org.dressdiscover.gui.presenters.wizard.catalog_wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.gui.models.NameValuePairs;
import org.dressdiscover.gui.models.wizard.UnknownWizardFeatureException;
import org.dressdiscover.gui.models.wizard.UnknownWizardFeatureSetException;
import org.dressdiscover.gui.models.wizard.WizardFeature;
import org.dressdiscover.gui.models.wizard.WizardFeatureSetFactories;
import org.dressdiscover.gui.models.wizard.WizardMode;
import org.dressdiscover.gui.models.wizard.catalog_wizard.CatalogWizardState;
import org.dressdiscover.gui.presenters.wizard.AbstractWizardFeaturePresenter;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardFeatureView;
import org.dressdiscover.gui.views.wizard.catalog_wizard.CatalogWizardSummaryView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;
import com.vaadin.ui.UI;

import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.object.InvalidObjectIdException;
import org.dressdiscover.api.models.object.Object;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.NoSuchCollectionException;
import org.dressdiscover.api.services.institution.InstitutionQueryService;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.api.services.object.NoSuchObjectException;
import org.dressdiscover.api.services.object.ObjectQueryService;
import org.dressdiscover.api.services.user.UserCommandService;
import org.dressdiscover.api.services.user.UserQueryService;

@SessionScoped
public class CatalogWizardFeaturePresenter
        extends AbstractWizardFeaturePresenter<CatalogWizardState, CatalogWizardFeatureView> {
    @Inject
    public CatalogWizardFeaturePresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final InstitutionQueryService institutionQueryService, final ObjectQueryService objectQueryService,
            final UserCommandService userCommandService, final UserQueryService userQueryService,
            final CatalogWizardFeatureView view) {
        super(eventBus, featureSetFactories, WizardMode.CATALOG, userCommandService, userQueryService, view);
        this.institutionQueryService = checkNotNull(institutionQueryService);
        this.objectQueryService = checkNotNull(objectQueryService);
    }

    @Override
    protected final void _navigateToFeature(final WizardFeature feature, final CatalogWizardState state) {
        state.setCurrentFeature(feature);
        UI.getCurrent().getNavigator()
                .navigateTo(CatalogWizardFeatureView.NAME + '/' + state.toNameValuePairs().toUrlEncodedString());
    }

    @Override
    protected final void _navigateToSummary(final CatalogWizardState state) {
        state.setCurrentFeature(Optional.absent());
        UI.getCurrent().getNavigator()
                .navigateTo(CatalogWizardSummaryView.NAME + "/" + state.toNameValuePairs().toUrlEncodedString());
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final CatalogWizardState state) {
        final Optional<Object> object;
        final Optional<Institution> objectInstitution;
        if (state.getObjectId().isPresent()) {
            try {
                try {
                    object = Optional.of(objectQueryService.getObjectById(state.getObjectId().get()));
                } catch (final NoSuchCollectionException e) {
                    _getView().setComponentError(new UserError("No such collection"));
                    return;
                } catch (final NoSuchInstitutionException e) {
                    _getView().setComponentError(new UserError("No such institution"));
                    return;
                } catch (final NoSuchObjectException e) {
                    _getView().setComponentError(new UserError("No such object"));
                    return;
                }

                try {
                    objectInstitution = Optional
                            .of(institutionQueryService.getInstitutionById(object.get().getInstitutionId()));
                } catch (final NoSuchInstitutionException e) {
                    _getView().setComponentError(new SystemError("No such institution"));
                    return;
                }
            } catch (final IoException e) {
                _getView().setComponentError(new SystemError("I/O exception", e));
                return;
            }
        } else {
            object = Optional.absent();
            objectInstitution = Optional.absent();
        }

        _getView().setModels(state, object, objectInstitution);
    }

    @Override
    protected CatalogWizardState _parseParameters(final NameValuePairs parameters) throws InvalidObjectIdException,
            IoException, UnknownWizardFeatureException, UnknownWizardFeatureSetException {
        return CatalogWizardState.fromNameValuePairs(_getFeatureSetFactories(), _getMode(), parameters);
    }

    private final InstitutionQueryService institutionQueryService;
    private final ObjectQueryService objectQueryService;
}
