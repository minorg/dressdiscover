package net.lab1318.costume.gui.views.object;

import org.notaweb.gui.EventBus;

import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.collection.CollectionEntry;
import net.lab1318.costume.api.models.institution.InstitutionEntry;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.object.ObjectQueryService;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class ObjectByIdView extends TopLevelView {
	@Inject
	public ObjectByIdView(final EventBus eventBus) {
		super(eventBus);
	}

	public void setModels(final CollectionEntry collectionEntry, final InstitutionEntry institutionEntry,
			final ObjectEntry objectEntry) {
		final VerticalLayout rootLayout = new VerticalLayout();

		{
			final HorizontalLayout headerLayout = new HorizontalLayout();
			headerLayout.setSizeFull();

			{
				final VerticalLayout leftHeaderLayout = new VerticalLayout();
				leftHeaderLayout.setSpacing(true);
				{
					final Button institutionButton = new NativeButton(
							"Institution: " + institutionEntry.getModel().getTitle(), new Button.ClickListener() {
								@Override
								public void buttonClick(final ClickEvent event) {
									_getEventBus().post(new InstitutionQueryService.Messages.GetInstitutionByIdRequest(
											institutionEntry.getId()));
								}
							});
					leftHeaderLayout.addComponent(institutionButton);
				}
				{
					final Button collectionButton = new NativeButton(
							"Collection: " + collectionEntry.getModel().getTitle(), new Button.ClickListener() {
								@Override
								public void buttonClick(final ClickEvent event) {
									_getEventBus().post(new CollectionQueryService.Messages.GetCollectionByIdRequest(
											collectionEntry.getId()));
								}
							});
					leftHeaderLayout.addComponent(collectionButton);
				}

				headerLayout.addComponent(leftHeaderLayout);
				headerLayout.setExpandRatio(leftHeaderLayout, 1);
			}

			{
				final Button moreLikeThisButton = new NativeButton("More like this", new Button.ClickListener() {
					@Override
					public void buttonClick(final ClickEvent event) {
						_getEventBus().post(ObjectQueryService.Messages.GetObjectsRequest.builder()
								.setQuery(ObjectQuery.builder().setMoreLikeObjectId(objectEntry.getId()).build())
								.build());
					}
				});
				headerLayout.addComponent(moreLikeThisButton);
				headerLayout.setComponentAlignment(moreLikeThisButton, Alignment.MIDDLE_CENTER);
				headerLayout.setExpandRatio(moreLikeThisButton, 1);
			}

			rootLayout.addComponent(headerLayout);
		}

		rootLayout.addComponent(new ObjectForm(objectEntry, institutionEntry.getModel()));

		setCompositionRoot(rootLayout);
	}

	public final static String NAME = "object_by_id";
}
