package net.lab1318.costume.gui.presenters.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.thryft.protocol.InputProtocolException;
import org.thryft.protocol.JacksonJsonInputProtocol;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;

import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSet;
import net.lab1318.costume.gui.models.wizard.WizardFeatureSetFactories;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.query_wizard.QueryWizardSummaryView;

@SessionScoped
public class QueryWizardSummaryPresenter extends Presenter<QueryWizardSummaryView> {
    @Inject
    public QueryWizardSummaryPresenter(final EventBus eventBus, final WizardFeatureSetFactories featureSetFactories,
            final ObjectSummaryQueryService objectSummaryQueryService, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final QueryWizardSummaryView view) {
        super(eventBus, userCommandService, userQueryService, view);
        this.featureSetFactories = checkNotNull(featureSetFactories);
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        final ObjectQuery objectQuery;
        try {
            objectQuery = ObjectQuery.readAsStruct(
                    new JacksonJsonInputProtocol(URLDecoder.decode(event.getParameters(), Charsets.UTF_8.toString())));
        } catch (final InputProtocolException | UnsupportedEncodingException e) {
            _getView().setComponentError(new UserError("invalid query " + event.getParameters()));
            return;
        }

        WizardFeatureSet featureSet;
        try {
            featureSet = featureSetFactories.getFeatureSetFactoryByName("costume_core").createFeatureSet();
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }
        featureSet.setSelectedFromQuery(objectQuery);

        final UnsignedInteger selectedObjectCount;
        try {
            selectedObjectCount = objectSummaryQueryService
                    .getObjectSummaries(QueryWizardFeaturePresenter.GET_OBJECT_COUNT_OPTIONS, Optional.of(objectQuery))
                    .getTotalHits();
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

        _getView().setModels(featureSet, objectQuery, selectedObjectCount);
    }

    private final WizardFeatureSetFactories featureSetFactories;
    private final ObjectSummaryQueryService objectSummaryQueryService;
}
