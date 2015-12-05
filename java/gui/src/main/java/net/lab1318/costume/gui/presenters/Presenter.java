package net.lab1318.costume.gui.presenters;

import org.notaweb.gui.EventBus;
import org.notaweb.gui.views.View;

import com.google.common.collect.ImmutableSet;
import com.google.common.eventbus.Subscribe;

import net.lab1318.costume.api.models.object.ObjectFilters;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.collection.CollectionQueryService.Messages.GetCollectionByIdRequest;
import net.lab1318.costume.api.services.institution.InstitutionQueryService.Messages.GetInstitutionByIdRequest;
import net.lab1318.costume.api.services.object.ObjectQueryService.Messages.GetObjectsRequest;
import net.lab1318.costume.gui.GuiUI;

public abstract class Presenter<ViewT extends View> extends org.notaweb.gui.presenters.Presenter<ViewT> {
	protected Presenter(final EventBus eventBus, final ViewT view) {
		super(eventBus, view);
	}

	@Subscribe
	public void onGetCollectionByIdRequest(final GetCollectionByIdRequest request) {
		GuiUI.navigateTo(ObjectQuery.builder()
				.setFilters(ObjectFilters.builder().setIncludeCollectionIds(ImmutableSet.of(request.getId()))
						.setIncludeInstitutionIds(ImmutableSet.of(request.getId().getInstitutionId())).build())
				.build());
	}

	@Subscribe
	public void onGetInstitutionByIdRequest(final GetInstitutionByIdRequest request) {
		GuiUI.navigateTo(ObjectQuery.builder()
				.setFilters(ObjectFilters.builder().setIncludeInstitutionIds(ImmutableSet.of(request.getId())).build())
				.build());
	}

	@Subscribe
	public void onGetObjectsRequest(final GetObjectsRequest request) {
		GuiUI.navigateTo(request.getQuery().get());
	}
}
