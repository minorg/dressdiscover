package net.lab1318.costume.gui.presenters.institutions;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.institutions.InstitutionsView;

@SessionScoped
public class InstitutionsPresenter extends Presenter<InstitutionsView> {
    @Inject
    public InstitutionsPresenter(final CollectionQueryService collectionQueryService, final EventBus eventBus,
            final InstitutionQueryService institutionQueryService, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final InstitutionsView view) {
        super(eventBus, userCommandService, userQueryService, view);
        this.collectionQueryService = checkNotNull(collectionQueryService);
        this.institutionQueryService = checkNotNull(institutionQueryService);
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        final ImmutableList<CollectionEntry> collectionEntries;
        final ImmutableList<InstitutionEntry> institutionEntries;
        try {
            collectionEntries = collectionQueryService.getCollections();
            institutionEntries = institutionQueryService.getInstitutions();
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

        final ImmutableMultimap.Builder<InstitutionEntry, CollectionEntry> institutionTreeBuilder = ImmutableMultimap
                .builder();

        for (final CollectionEntry collectionEntry : collectionEntries) {
            if (collectionEntry.getModel().getHidden().or(Boolean.FALSE)) {
                continue;
            }
            for (final InstitutionEntry institutionEntry : institutionEntries) {
                if (institutionEntry.getModel().getHidden().or(Boolean.FALSE)) {
                    continue;
                }
                if (institutionEntry.getId().equals(collectionEntry.getModel().getInstitutionId())) {
                    institutionTreeBuilder.put(institutionEntry, collectionEntry);
                    break;
                }
            }
        }

        _getView().setModels(institutionTreeBuilder.build());
    }

    private final CollectionQueryService collectionQueryService;
    private final InstitutionQueryService institutionQueryService;
}
