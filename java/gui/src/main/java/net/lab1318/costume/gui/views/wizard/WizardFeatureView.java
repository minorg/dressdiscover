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
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.object.ObjectSummaryEntry;
import net.lab1318.costume.gui.events.wizard.WizardFeatureBackRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureGotoRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureNextRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.views.Image;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class WizardFeatureView extends TopLevelView {
    @Inject
    public WizardFeatureView(final EventBus eventBus) {
        super(eventBus);

        buttonLayout = new HorizontalLayout();
        {
            final Button backButton = new NativeButton("Back", new Button.ClickListener() {
                @Override
                public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                    eventBus.post(new WizardFeatureBackRequest());
                }
            });
            buttonLayout.addComponent(backButton);
            buttonLayout.setComponentAlignment(backButton, Alignment.MIDDLE_LEFT);
        }
        {
            final Button nextButton = new NativeButton("Next", new Button.ClickListener() {
                @Override
                public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                    eventBus.post(new WizardFeatureNextRequest());
                }
            });
            buttonLayout.addComponent(nextButton);
            buttonLayout.setComponentAlignment(nextButton, Alignment.MIDDLE_RIGHT);
        }
        buttonLayout.setSizeFull();
    }

    public ImmutableSet<String> getSelectedFeatureValues() {
        return ImmutableSet.copyOf(selectedFeatureValues);
    }

    public void setModels(final ImmutableMap<String, ImmutableList<String>> allSelectedFeatureValuesByFeatureName,
            final ImmutableList<ObjectSummaryEntry> availableFeatureModels, final String currentFeatureName,
            final ImmutableSet<String> currentSelectedFeatureValues) {
        this.selectedFeatureValues.clear();
        this.selectedFeatureValues.addAll(currentSelectedFeatureValues);

        final VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.setSizeFull();

        rootLayout.addComponent(buttonLayout);

        if (!allSelectedFeatureValuesByFeatureName.isEmpty()) {
            final Label label = new Label("<h3>Currently selected:</h3>", ContentMode.HTML);
            rootLayout.addComponent(label);

            final VerticalLayout allSelectedFeaturesLayout = new VerticalLayout();
            allSelectedFeaturesLayout.setSizeFull();
            for (final Map.Entry<String, ImmutableList<String>> entry : allSelectedFeatureValuesByFeatureName
                    .entrySet()) {
                final HorizontalLayout entryLayout = new HorizontalLayout();
                checkState(!entry.getValue().isEmpty());
                final StringBuilder joinedValueBuilder = new StringBuilder();
                for (int valueI = 0; valueI < entry.getValue().size(); valueI++) {
                    if (valueI > 0) {
                        joinedValueBuilder.append(" OR ");
                    }
                    joinedValueBuilder.append('"');
                    joinedValueBuilder.append(entry.getValue().get(valueI));
                    joinedValueBuilder.append('"');
                }
                entryLayout.addComponent(new NativeButton(entry.getKey(), new Button.ClickListener() {
                    @Override
                    public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                        _getEventBus().post(new WizardFeatureGotoRequest(entry.getKey()));
                    }
                }));
                final Label valueLabel = new Label(joinedValueBuilder.toString());
                entryLayout.addComponent(valueLabel);
                allSelectedFeaturesLayout.addComponent(entryLayout);
            }
            rootLayout.addComponent(allSelectedFeaturesLayout);
            rootLayout.addComponent(new Label("<br/>", ContentMode.HTML));
        }

        {
            final Label label = new Label("<h1>Selecting: " + currentFeatureName + "</h1>", ContentMode.HTML);
            rootLayout.addComponent(label);
            rootLayout.setComponentAlignment(label, Alignment.MIDDLE_CENTER);
        }

        {
            final HorizontalLayout availableFeaturesLayout = new HorizontalLayout();
            availableFeaturesLayout.setSizeFull();
            for (final ObjectSummaryEntry availableFeatureModel : availableFeatureModels) {
                checkState(availableFeatureModel.getModel().getStructureTexts().isPresent());
                checkState(availableFeatureModel.getModel().getStructureTexts().get().size() == 1);
                final String availableFeatureValue = checkNotNull(
                        availableFeatureModel.getModel().getStructureTexts().get().get(currentFeatureName));

                final VerticalLayout availableFeatureLayout = new VerticalLayout();

                final Image thumbnailImage = new Image("", availableFeatureModel.getModel().getThumbnail().get());
                availableFeatureLayout.addComponent(thumbnailImage);
                availableFeatureLayout.setComponentAlignment(thumbnailImage, Alignment.MIDDLE_CENTER);

                final CheckBox checkBox = new CheckBox(availableFeatureModel.getModel().getTitle());
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

                availableFeaturesLayout.addComponent(availableFeatureLayout);
            }

            rootLayout.addComponent(availableFeaturesLayout);
        }

        setCompositionRoot(rootLayout);
    }

    private final HorizontalLayout buttonLayout;
    private final Set<String> selectedFeatureValues = new LinkedHashSet<>();
    public final static String NAME = "wizard_feature";
}
