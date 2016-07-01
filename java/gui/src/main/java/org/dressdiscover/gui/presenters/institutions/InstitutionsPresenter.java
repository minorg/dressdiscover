package org.dressdiscover.gui.presenters.institutions;

import static com.google.common.base.Preconditions.checkNotNull;

import org.dressdiscover.gui.presenters.Presenter;
import org.dressdiscover.gui.views.institutions.InstitutionsView;
import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;

import org.dressdiscover.api.models.collection.CollectionEntry;
import org.dressdiscover.api.models.institution.InstitutionEntry;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.CollectionQueryService;
import org.dressdiscover.api.services.institution.InstitutionQueryService;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.api.services.user.UserCommandService;
import org.dressdiscover.api.services.user.UserQueryService;

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
        final boolean includeExternal = event.getParameters().equals("include_external");

        final ImmutableList<CollectionEntry> collectionEntries;
        final ImmutableList<InstitutionEntry> institutionEntries;
        try {
            institutionEntries = institutionQueryService.getInstitutions();

            final ImmutableList.Builder<CollectionEntry> collectionEntriesBuilder = ImmutableList.builder();
            for (final InstitutionEntry institutionEntry : institutionEntries) {
                try {
                    collectionEntriesBuilder
                            .addAll(collectionQueryService.getCollectionsByInstitutionId(institutionEntry.getId()));
                } catch (final NoSuchInstitutionException e) {
                    _getView().setComponentError(new SystemError("Error retrieving collections", e));
                    return;
                }
            }
            collectionEntries = collectionEntriesBuilder.build();
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
                if (!includeExternal && institutionEntry.getModel().getExternal().or(Boolean.FALSE)) {
                    continue;
                }
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
