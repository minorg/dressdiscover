package net.lab1318.costume.gui.views.wizard;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.util.LinkedHashSet;
import java.util.Set;

import org.thryft.waf.gui.EventBus;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Link;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.object.ObjectSummary;
import net.lab1318.costume.gui.events.wizard.WizardFeatureBackRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureFinishRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureNextRequest;
import net.lab1318.costume.gui.events.wizard.WizardFeatureRefreshRequest;
import net.lab1318.costume.gui.views.ImageWithRightsView;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class QueryWizardFeatureView extends TopLevelView {
    @DesignRoot("QueryWizardFeatureView.html")
    private final static class Design extends HorizontalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        Layout availableFeaturesLayout;
        Button bottomBackButton;
        Button bottomFinishButton;
        Button bottomNextButton;
        Label currentFeatureNameLabel;
        Layout leftPaneLayout;
        Button resetButton;
        Button topBackButton;
        Button topFinishButton;
        Button topNextButton;
    }

    @Inject
    public QueryWizardFeatureView(final EventBus eventBus) {
        super(eventBus);

        final com.vaadin.ui.Button.ClickListener backButtonClickListener = new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                eventBus.post(new WizardFeatureBackRequest());
            }
        };
        design.bottomBackButton.addClickListener(backButtonClickListener);
        design.topBackButton.addClickListener(backButtonClickListener);

        final com.vaadin.ui.Button.ClickListener finishButtonClickListener = new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                eventBus.post(new WizardFeatureFinishRequest());
            }
        };
        design.bottomFinishButton.addClickListener(finishButtonClickListener);
        design.topFinishButton.addClickListener(finishButtonClickListener);

        final com.vaadin.ui.Button.ClickListener nextButtonClickListener = new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                eventBus.post(new WizardFeatureNextRequest());
            }
        };
        design.bottomNextButton.addClickListener(nextButtonClickListener);
        design.topNextButton.addClickListener(nextButtonClickListener);

        design.resetButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final com.vaadin.ui.Button.ClickEvent event) {
                selectedFeatureValues.clear();
                eventBus.post(new WizardFeatureRefreshRequest());
            }
        });
    }

    public ImmutableSet<String> getSelectedFeatureValues() {
        return ImmutableSet.copyOf(selectedFeatureValues);
    }

    public void setModels(final ImmutableList<String> allFeatureNames, final String currentFeatureName,
            final ImmutableList<ObjectSummary> currentFeatureValues,
            final ImmutableMap<String, ImmutableList<String>> selectedFeatureValuesByFeatureName,
            final UnsignedInteger selectedObjectCount) {
        this.selectedFeatureValues.clear();
        final ImmutableList<String> currentSelectedFeatureValues = selectedFeatureValuesByFeatureName
                .get(currentFeatureName);
        if (currentSelectedFeatureValues != null) {
            this.selectedFeatureValues.addAll(currentSelectedFeatureValues);
        }

        {
            design.leftPaneLayout.removeAllComponents();
            design.leftPaneLayout.addComponent(
                    new QueryWizardSelectedFeaturesLayout(allFeatureNames, Optional.of(currentFeatureName),
                            _getEventBus(), selectedFeatureValuesByFeatureName, selectedObjectCount));
        }

        {
            design.currentFeatureNameLabel.setCaptionAsHtml(true);
            design.currentFeatureNameLabel.setCaption("<h1>Selecting: " + currentFeatureName + "</h1>");

            {
                int rowCount = currentFeatureValues.size() / 4;
                if (currentFeatureValues.size() % 4 != 0) {
                    rowCount++;
                }
                final GridLayout availableFeaturesLayout = new GridLayout(4, rowCount);
                availableFeaturesLayout.setSizeFull();
                availableFeaturesLayout.setSpacing(true);
                int columnI = 0;
                int rowI = 0;
                for (final ObjectSummary availableFeatureModel : currentFeatureValues) {
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

                    final HorizontalLayout captionLayout = new HorizontalLayout();
                    captionLayout.setSizeFull();
                    final CheckBox checkBox = new CheckBox(availableFeatureModel.getTitle());
                    checkBox.setValue(this.selectedFeatureValues.contains(availableFeatureValue));
                    thumbnailImage.addClickListener(new ClickListener() {
                        @Override
                        public void click(final ClickEvent event) {
                            checkBox.setValue(!checkBox.getValue());

                            if (checkBox.getValue()) {
                                QueryWizardFeatureView.this.selectedFeatureValues.add(availableFeatureValue);
                            } else {
                                QueryWizardFeatureView.this.selectedFeatureValues.remove(availableFeatureValue);
                            }

                            _getEventBus().post(new WizardFeatureRefreshRequest());
                        }

                    });
                    captionLayout.addComponent(checkBox);
                    captionLayout.setComponentAlignment(checkBox, Alignment.MIDDLE_CENTER);
                    if (availableFeatureModel.getImage().get().getOriginal().isPresent()) {
                        final Link originalLink = new Link("", new ExternalResource(
                                availableFeatureModel.getImage().get().getOriginal().get().getUrl().toString()));
                        originalLink.setTargetName("_blank");
                        originalLink.setIcon(FontAwesome.SEARCH_PLUS);
                        captionLayout.addComponent(originalLink);
                        captionLayout.setComponentAlignment(originalLink, Alignment.MIDDLE_CENTER);
                    }
                    availableFeatureLayout.addComponent(captionLayout);

                    availableFeaturesLayout.addComponent(availableFeatureLayout, columnI, rowI);
                    if (++columnI == 4) {
                        columnI = 0;
                        rowI++;
                    }
                }

                design.availableFeaturesLayout.removeAllComponents();
                design.availableFeaturesLayout.addComponent(availableFeaturesLayout);
            }
        }

        setCompositionRoot(design);
    }

    private final Design design = new Design();
    private final Set<String> selectedFeatureValues = new LinkedHashSet<>();
    public final static String NAME = "query_wizard_feature";
}
