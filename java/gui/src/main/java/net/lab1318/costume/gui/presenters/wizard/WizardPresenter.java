package net.lab1318.costume.gui.presenters.wizard;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.UserError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.collection.InvalidCollectionIdException;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.gui.models.wizard.CostumeCore;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.wizard.WizardView;

@SessionScoped
public class WizardPresenter extends Presenter<WizardView> {
	private static CollectionId __createCollectionId() {
		try {
			return CollectionId.parse("wizard/wizard");
		} catch (final InvalidCollectionIdException e) {
			throw new RuntimeException(e);
		}
	}

	@Inject
	public WizardPresenter(final EventBus eventBus, final ObjectSummaryQueryService objectSummaryQueryService,
			final WizardView view) {
		super(eventBus, view);
		this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
	}

	@Override
	protected void _onViewEnter(final ViewChangeEvent event) {
		if (event.getParameters().isEmpty()) {
			__navigateToFeature(CostumeCore.FEATURES.keySet().iterator().next());
			return;
		}

		final int featureIndex;
		final String featureName;
		try {
			featureName = URLDecoder.decode(event.getParameters(), "UTF-8");
		} catch (final UnsupportedEncodingException e) {
			throw new IllegalStateException(e);
		}
		featureIndex = FEATURE_NAMES.indexOf(featureName);
		if (featureIndex == -1) {
			_getView().setComponentError(new UserError("no such feature " + featureName));
			return;
		}

		// final ObjectQuery objectQuery;
		// try {
		// objectQuery = ObjectQuery.readAsStruct(
		// new JacksonJsonInputProtocol(URLDecoder.decode(event.getParameters(),
		// Charsets.UTF_8.toString())));
		// } catch (final InputProtocolException | UnsupportedEncodingException
		// e) {
		// _getView().setComponentError(new UserError("invalid query " +
		// event.getParameters()));
		// return;
		// }
		//
		// final ObjectFacets availableObjectFacets;
		// try {
		// availableObjectFacets = objectSummaryQueryService
		// .getObjectSummaries(GET_AVAILABLE_OBJECT_FACETS_OPTIONS,
		// Optional.of(ObjectQuery.builder(objectQuery).unsetFacetFilters().build()))
		// .getFacets().get();
		// } catch (final IoException e) {
		// _getView().setComponentError(new SystemError("I/O exception", e));
		// return;
		// }
		//
		// GetObjectSummariesResult firstResult;
		// try {
		// firstResult =
		// objectSummaryQueryService.getObjectSummaries(GET_FIRST_RESULT_OPTIONS,
		// Optional.of(objectQuery));
		// } catch (final IoException e) {
		// _getView().setComponentError(new SystemError("I/O exception", e));
		// return;
		// }
		//
		// ImmutableMap<CollectionId, Collection> collectionMap;
		// {
		// final ImmutableList<CollectionId> collectionIds = ImmutableList
		// .copyOf(availableObjectFacets.getCollections().keySet());
		// final ImmutableList<Collection> collections;
		// try {
		// collections =
		// collectionQueryService.getCollectionsByIds(collectionIds);
		// } catch (final IoException e) {
		// _getView().setComponentError(new SystemError("I/O exception", e));
		// return;
		// } catch (final NoSuchCollectionException e) {
		// _getView().setComponentError(new SystemError("no such collection " +
		// e.getId().get(), e));
		// return;
		// }
		// checkState(collectionIds.size() == collections.size());
		// final ImmutableMap.Builder<CollectionId, Collection>
		// collectionMapBuilder = ImmutableMap.builder();
		// for (int collectionI = 0; collectionI < collectionIds.size();
		// collectionI++) {
		// collectionMapBuilder.put(collectionIds.get(collectionI),
		// collections.get(collectionI));
		// }
		// collectionMap = collectionMapBuilder.build();
		// }
		//
		// ImmutableMap<InstitutionId, Institution> institutionMap;
		// {
		// final ImmutableList<InstitutionId> institutionIds = ImmutableList
		// .copyOf(availableObjectFacets.getInstitutions().keySet());
		// final ImmutableList<Institution> institutions;
		// try {
		// institutions =
		// institutionQueryService.getInstitutionsByIds(institutionIds);
		// } catch (final IoException e) {
		// _getView().setComponentError(new SystemError("I/O exception", e));
		// return;
		// } catch (final NoSuchInstitutionException e) {
		// _getView().setComponentError(new SystemError("no such institution " +
		// e.getId().get(), e));
		// return;
		// }
		// checkState(institutionIds.size() == institutions.size());
		// final ImmutableMap.Builder<InstitutionId, Institution>
		// institutionMapBuilder = ImmutableMap.builder();
		// for (int institutionI = 0; institutionI < institutionIds.size();
		// institutionI++) {
		// institutionMapBuilder.put(institutionIds.get(institutionI),
		// institutions.get(institutionI));
		// }
		// institutionMap = institutionMapBuilder.build();
		// }
		//
		// _getView().setModels(availableObjectFacets, collectionMap,
		// institutionMap, objectQuery,
		// new
		// LazyQueryContainer(ObjectSummaryEntryBeanQueryDefinition.getInstance(),
		// ObjectSummaryEntryBeanQueryFactory.create(firstResult, objectQuery,
		// objectSummaryQueryService)),
		// firstResult.getFacets().get());
	}

	private void __navigateToFeature(final String featureName) {
		try {
			UI.getCurrent().getNavigator()
					.navigateTo(WizardView.NAME + '/' + URLEncoder.encode(featureName, Charsets.UTF_8.toString()));
		} catch (final UnsupportedEncodingException e) {
			throw new IllegalStateException(e);
		}
	}

	private final ObjectSummaryQueryService objectSummaryQueryService;
	private final static CollectionId COLLECTION_ID = __createCollectionId();
	private final static ImmutableList<String> FEATURE_NAMES = ImmutableList.copyOf(CostumeCore.FEATURES.keySet());
}
