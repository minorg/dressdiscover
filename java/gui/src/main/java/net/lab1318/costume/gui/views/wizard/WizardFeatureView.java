package net.lab1318.costume.gui.views.wizard;

import java.util.ArrayList;
import java.util.List;

import org.thryft.waf.gui.EventBus;

import com.google.common.collect.ImmutableList;
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
import net.lab1318.costume.gui.views.Image;
import net.lab1318.costume.gui.views.TopLevelView;

@SuppressWarnings("serial")
@SessionScoped
public class WizardFeatureView extends TopLevelView {
    @Inject
    public WizardFeatureView(final EventBus eventBus) {
        super(eventBus);

        buttonLayout = new HorizontalLayout();
        buttonLayout.addComponent(backButton);
        buttonLayout.setComponentAlignment(backButton, Alignment.MIDDLE_LEFT);
        buttonLayout.addComponent(nextButton);
        buttonLayout.setComponentAlignment(nextButton, Alignment.MIDDLE_RIGHT);
        buttonLayout.setSizeFull();
    }

    public Button getBackButton() {
        return backButton;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public ImmutableList<ObjectSummaryEntry> getSelectedModels() {
        return ImmutableList.copyOf(selectedModels);
    }

    public void setModels(final String featureName, final ImmutableList<ObjectSummaryEntry> objectSummaryEntries) {
        selectedModels.clear();

        final VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.setSizeFull();

        rootLayout.addComponent(buttonLayout);

        {
            final Label label = new Label("<h1>" + featureName + "</h1>", ContentMode.HTML);
            rootLayout.addComponent(label);
            rootLayout.setComponentAlignment(label, Alignment.MIDDLE_CENTER);
        }

        {
            final HorizontalLayout objectSummariesLayout = new HorizontalLayout();
            objectSummariesLayout.setSizeFull();
            for (final ObjectSummaryEntry objectSummaryEntry : objectSummaryEntries) {
                final VerticalLayout objectSummaryLayout = new VerticalLayout();

                final Image thumbnailImage = new Image("", objectSummaryEntry.getModel().getThumbnail().get());
                objectSummaryLayout.addComponent(thumbnailImage);
                objectSummaryLayout.setComponentAlignment(thumbnailImage, Alignment.MIDDLE_CENTER);

                final CheckBox checkBox = new CheckBox(objectSummaryEntry.getModel().getTitle());
                thumbnailImage.addClickListener(new ClickListener() {
                    @Override
                    public void click(final ClickEvent event) {
                        checkBox.setValue(!checkBox.getValue());
                        if (checkBox.getValue()) {
                            selectedModels.add(objectSummaryEntry);
                        } else {
                            selectedModels.remove(objectSummaryEntry);
                        }
                    }
                });
                objectSummaryLayout.addComponent(checkBox);
                objectSummaryLayout.setComponentAlignment(checkBox, Alignment.MIDDLE_CENTER);

                objectSummariesLayout.addComponent(objectSummaryLayout);
            }

            rootLayout.addComponent(objectSummariesLayout);
        }

        setCompositionRoot(rootLayout);
    }

    private final HorizontalLayout buttonLayout;
    private final Button backButton = new NativeButton("Back");
    private final Button nextButton = new NativeButton("Next");
    private final List<ObjectSummaryEntry> selectedModels = new ArrayList<>();
    public final static String NAME = "wizard_feature";
}
