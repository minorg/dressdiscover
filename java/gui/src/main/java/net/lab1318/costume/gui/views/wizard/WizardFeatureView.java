package net.lab1318.costume.gui.views.wizard;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.object.ObjectSummary;
import net.lab1318.costume.gui.events.wizard.WizardFeatureBackRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureNextRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.views.ImageWithRightsView;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class WizardFeatureView extends TopLevelView {
	@Inject
	public WizardFeatureView(final EventBus eventBus) {
		super(eventBus);

		bottomButtonLayout = new HorizontalLayout();
		bottomButtonLayout.setSizeFull();
		topButtonLayout = new HorizontalLayout();
		topButtonLayout.setSizeFull();
		{
			final Button backButton = new NativeButton("Back", new Button.ClickListener() {
				@Override
				public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
					eventBus.post(new WizardFeatureBackRequest());
				}
			});
			bottomButtonLayout.addComponent(backButton);
			bottomButtonLayout.setComponentAlignment(backButton, Alignment.MIDDLE_LEFT);
			topButtonLayout.addComponent(backButton);
			topButtonLayout.setComponentAlignment(backButton, Alignment.MIDDLE_LEFT);
		}
		{
			final Button nextButton = new NativeButton("Next", new Button.ClickListener() {
				@Override
				public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
					eventBus.post(new WizardFeatureNextRequest());
				}
			});
			bottomButtonLayout.addComponent(nextButton);
			bottomButtonLayout.setComponentAlignment(nextButton, Alignment.MIDDLE_RIGHT);
			topButtonLayout.addComponent(nextButton);
			topButtonLayout.setComponentAlignment(nextButton, Alignment.MIDDLE_RIGHT);
		}
	}

	public ImmutableSet<String> getSelectedFeatureValues() {
		return ImmutableSet.copyOf(selectedFeatureValues);
	}

	public void setModels(final ImmutableMap<String, ImmutableList<String>> allSelectedFeatureValuesByFeatureName,
			final ImmutableList<ObjectSummary> availableFeatureModels, final String currentFeatureName,
			final ImmutableSet<String> currentSelectedFeatureValues) {
		this.selectedFeatureValues.clear();
		this.selectedFeatureValues.addAll(currentSelectedFeatureValues);

		final HorizontalLayout twoPaneLayout = new HorizontalLayout();
		twoPaneLayout.setSizeFull();

		{
			final VerticalLayout leftPaneLayout = new VerticalLayout();

			final Label label = new Label("<h3>Currently selected:</h3>", ContentMode.HTML);
			leftPaneLayout.addComponent(label);

			if (!allSelectedFeatureValuesByFeatureName.isEmpty()) {
				final VerticalLayout allSelectedFeaturesLayout = new VerticalLayout();
				for (final Map.Entry<String, ImmutableList<String>> entry : allSelectedFeatureValuesByFeatureName
						.entrySet()) {
					final VerticalLayout entryLayout = new VerticalLayout();
					checkState(!entry.getValue().isEmpty());
					entryLayout.addComponent(new NativeButton(entry.getKey(), new Button.ClickListener() {
						@Override
						public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
							_getEventBus().post(new WizardFeatureGotoRequest(entry.getKey()));
						}
					}));
					for (int valueI = 0; valueI < entry.getValue().size(); valueI++) {
						String value = entry.getValue().get(valueI);
						value = '"' + value + '"';
						if (valueI + 1 < entry.getValue().size()) {
							value += " OR";
						}
						final Label valueLabel = new Label(value);
						entryLayout.addComponent(valueLabel);
					}
					allSelectedFeaturesLayout.addComponent(entryLayout);
				}
				leftPaneLayout.addComponent(allSelectedFeaturesLayout);
			}

			twoPaneLayout.addComponent(leftPaneLayout);
			twoPaneLayout.setExpandRatio(leftPaneLayout, (float) 2.0);
		}

		{
			final VerticalLayout rightPaneLayout = new VerticalLayout();
			rightPaneLayout.setSizeFull();

			rightPaneLayout.addComponent(topButtonLayout);

			{
				final Label label = new Label("<h1>Selecting: " + currentFeatureName + "</h1>", ContentMode.HTML);
				rightPaneLayout.addComponent(label);
				rightPaneLayout.setComponentAlignment(label, Alignment.MIDDLE_CENTER);
			}

			{
				int rowCount = availableFeatureModels.size() / 4;
				if (availableFeatureModels.size() % 4 != 0) {
					rowCount++;
				}
				final GridLayout availableFeaturesLayout = new GridLayout(4, rowCount);
				availableFeaturesLayout.setSizeFull();
				availableFeaturesLayout.setSpacing(true);
				int columnI = 0;
				int rowI = 0;
				for (final ObjectSummary availableFeatureModel : availableFeatureModels) {
					checkState(availableFeatureModel.getStructureTexts().isPresent());
					checkState(availableFeatureModel.getStructureTexts().get().size() == 1);
					final String availableFeatureValue = checkNotNull(
							availableFeatureModel.getStructureTexts().get().get(currentFeatureName));

					final VerticalLayout availableFeatureLayout = new VerticalLayout();

					final ImageWithRightsView thumbnailImage = new ImageWithRightsView("",
							availableFeatureModel.getImage().get().getSquareThumbnail().get(),
							availableFeatureModel.getImage().get().getRights());
					availableFeatureLayout.addComponent(thumbnailImage);
					availableFeatureLayout.setComponentAlignment(thumbnailImage, Alignment.MIDDLE_CENTER);

					final CheckBox checkBox = new CheckBox(availableFeatureModel.getTitle());
					checkBox.setValue(this.selectedFeatureValues.contains(availableFeatureValue));
					thumbnailImage.addClickListener(new ClickListener() {
						@Override
						public void click(final ClickEvent event) {
							checkBox.setValue(!checkBox.getValue());

							if (checkBox.getValue()) {
								WizardFeatureView.this.selectedFeatureValues.add(availableFeatureValue);
							} else {
								WizardFeatureView.this.selectedFeatureValues.remove(availableFeatureValue);
							}

							_getEventBus().post(new WizardFeatureRefreshRequest());
						}
					});
					availableFeatureLayout.addComponent(checkBox);
					availableFeatureLayout.setComponentAlignment(checkBox, Alignment.MIDDLE_CENTER);

					availableFeaturesLayout.addComponent(availableFeatureLayout, columnI, rowI);
					if (++columnI == 4) {
						columnI = 0;
						rowI++;
					}
				}

				rightPaneLayout.addComponent(availableFeaturesLayout);
			}

			rightPaneLayout.addComponent(bottomButtonLayout);

			twoPaneLayout.addComponent(rightPaneLayout);
			twoPaneLayout.setExpandRatio(rightPaneLayout, (float) 8.0);
		}

		setCompositionRoot(twoPaneLayout);
	}

	private final HorizontalLayout bottomButtonLayout;

	private final HorizontalLayout topButtonLayout;
	private final Set<String> selectedFeatureValues = new LinkedHashSet<>();
	public final static String NAME = "wizard_feature";
}
