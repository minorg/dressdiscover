package net.lab1318.costume.gui.presenters;

import org.notaweb.gui.EventBus;
import org.notaweb.gui.views.View;

import com.google.common.collect.ImmutableSet;
import com.google.common.eventbus.Subscribe;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.collection.CollectionQueryService.Messages.GetCollectionByIdRequest;
import net.lab1318.costume.api.services.institution.InstitutionQueryService.Messages.GetInstitutionByIdRequest;
import net.lab1318.costume.api.services.object.ObjectQueryService.Messages.GetObjectByIdRequest;
import net.lab1318.costume.api.services.object.ObjectQueryService.Messages.GetObjectsRequest;
import net.lab1318.costume.gui.GuiUI;
import net.lab1318.costume.gui.views.object.ObjectByIdView;

public abstract class Presenter<ViewT extends View> extends org.notaweb.gui.presenters.Presenter<ViewT> {
	protected Presenter(final EventBus eventBus, final ViewT view) {
		super(eventBus, view);
	}

	@Subscribe
	public void onGetCollectionByIdRequest(final GetCollectionByIdRequest request) {
		GuiUI.navigateTo(ObjectQuery.builder().setIncludeCollectionIds(ImmutableSet.of(request.getId())).build());
	}

	@Subscribe
	public void onGetInstitutionByIdRequest(final GetInstitutionByIdRequest request) {
		GuiUI.navigateTo(ObjectQuery.builder().setIncludeInstitutionIds(ImmutableSet.of(request.getId())).build());
	}

	@Subscribe
	public void onGetObjectByIdRequest(final GetObjectByIdRequest request) {
		UI.getCurrent().getNavigator().navigateTo(ObjectByIdView.NAME + "/" + request.getId().toString());
	}

	@Subscribe
	public void onGetObjectsRequest(final GetObjectsRequest request) {
		GuiUI.navigateTo(request.getQuery().get());
	}
}
