package net.lab1318.costume.gui.presenters;

import org.thryft.waf.gui.EventBus;
import org.thryft.waf.gui.views.View;

import com.google.common.eventbus.Subscribe;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.services.collection.CollectionQueryService.Messages.GetCollectionByIdRequest;
import net.lab1318.costume.api.services.institution.InstitutionQueryService.Messages.GetInstitutionByIdRequest;
import net.lab1318.costume.api.services.object.ObjectQuery;
import net.lab1318.costume.api.services.object.ObjectQueryService.Messages.GetObjectByIdRequest;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService.Messages.GetObjectSummariesRequest;
import net.lab1318.costume.gui.GuiUI;
import net.lab1318.costume.gui.views.object_by_id.ObjectByIdView;

public abstract class Presenter<ViewT extends View> extends org.thryft.waf.gui.presenters.Presenter<ViewT> {
    protected Presenter(final EventBus eventBus, final ViewT view) {
        super(eventBus, view);
    }

    @Subscribe
    public void onGetCollectionByIdRequest(final GetCollectionByIdRequest request) {
        GuiUI.navigateTo(ObjectQuery.builder().setCollectionId(request.getId())
                .setInstitutionId(request.getId().getInstitutionId()).build());
    }

    @Subscribe
    public void onGetInstitutionByIdRequest(final GetInstitutionByIdRequest request) {
        GuiUI.navigateTo(ObjectQuery.builder().setInstitutionId(request.getId()).build());
    }

    @Subscribe
    public void onGetObjectByIdRequest(final GetObjectByIdRequest request) {
        UI.getCurrent().getNavigator().navigateTo(ObjectByIdView.NAME + "/" + request.getId().toString());
    }

    @Subscribe
    public void onGetObjectSummariesRequest(final GetObjectSummariesRequest request) {
        GuiUI.navigateTo(request.getQuery().get());
    }
}
