package net.lab1318.costume.gui.presenters;

import org.thryft.waf.gui.EventBus;
import org.thryft.waf.gui.views.View;

import com.google.common.collect.ImmutableSet;
import com.google.common.eventbus.Subscribe;

import net.lab1318.costume.api.services.collection.CollectionQueryService.Messages.GetCollectionByIdRequest;
import net.lab1318.costume.api.services.institution.InstitutionQueryService.Messages.GetInstitutionByIdRequest;
import net.lab1318.costume.api.services.object.ObjectFacetFilters;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectQueryService.Messages.GetObjectSummariesRequest;
import net.lab1318.costume.gui.GuiUI;

public abstract class Presenter<ViewT extends View> extends org.thryft.waf.gui.presenters.Presenter<ViewT> {
    protected Presenter(final EventBus eventBus, final ViewT view) {
        super(eventBus, view);
    }

    @Subscribe
    public void onGetCollectionByIdRequest(final GetCollectionByIdRequest request) {
        GuiUI.navigateTo(ObjectQuery.builder().setCollectionId(request.getId())
                .setInstitutionId(request.getId().getInstitutionId())
                .setFacetFilters(ObjectFacetFilters.builder().setIncludeCollectionIds(ImmutableSet.of(request.getId()))
                        .setIncludeInstitutionIds(ImmutableSet.of(request.getId().getInstitutionId())).build())
                .build());
    }

    @Subscribe
    public void onGetInstitutionByIdRequest(final GetInstitutionByIdRequest request) {
        GuiUI.navigateTo(ObjectQuery.builder().setInstitutionId(request.getId())
                .setFacetFilters(
                        ObjectFacetFilters.builder().setIncludeInstitutionIds(ImmutableSet.of(request.getId())).build())
                .build());
    }

    @Subscribe
    public void onGetObjectSummariesRequest(final GetObjectSummariesRequest request) {
        GuiUI.navigateTo(request.getQuery().get());
    }
}
