package net.lab1318.costume.gui.presenters.wizard.catalog_wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.object.InvalidObjectIdException;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.api.services.object.NoSuchObjectException;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.models.NameValuePairs;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureException;
import net.lab1318.costume.gui.models.wizard.UnknownWizardFeatureSetException;
import net.lab1318.costume.gui.models.wizard.WizardFeature;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.models.wizard.WizardMode;
import net.lab1318.costume.gui.models.wizard.catalog_wizard.CatalogWizardState;
import net.lab1318.costume.gui.presenters.wizard.AbstractWizardFeaturePresenter;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardFeatureView;
import net.lab1318.costume.gui.views.wizard.catalog_wizard.CatalogWizardSummaryView;

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
