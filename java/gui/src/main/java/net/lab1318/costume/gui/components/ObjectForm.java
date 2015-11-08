package net.lab1318.costume.gui.components;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.object.ObjectEntry;

@SuppressWarnings("serial")
public final class ObjectForm extends CustomComponent {
    public ObjectForm(final ObjectEntry objectEntry, final Institution institution) {
        final VerticalLayout rootLayout = new VerticalLayout();

        final Label titleLabel = new Label(objectEntry.getModel().getTitle());
        titleLabel.setStyleName("h3");
        rootLayout.addComponent(titleLabel);

        rootLayout.addComponent(new RightsLabel(institution.getDataRights()));

        final HorizontalLayout twoPaneLayout = new HorizontalLayout();
        twoPaneLayout.setSizeFull();

        final VerticalLayout leftPaneLayout = new VerticalLayout();
        twoPaneLayout.addComponent(leftPaneLayout);
        twoPaneLayout.setComponentAlignment(leftPaneLayout, Alignment.TOP_LEFT);
        final VerticalLayout rightPaneLayout = new VerticalLayout();
        twoPaneLayout.addComponent(rightPaneLayout);
        twoPaneLayout.setComponentAlignment(rightPaneLayout, Alignment.TOP_CENTER);

        {
            final FormLayout formLayout = new FormLayout();
            formLayout.setSpacing(true);
            formLayout.setSizeFull();

            if (objectEntry.getModel().getDateText().isPresent()) {
                formLayout.addComponent(__createTextField("Date", objectEntry.getModel().getDateText().get()));
            } else if (objectEntry.getModel().getDate().isPresent()) {
                formLayout.addComponent(__createTextField("Date", objectEntry.getModel().getDate().get().toString()));
            }

            if (objectEntry.getModel().getDescription().isPresent()) {
                formLayout.addComponent(__createTextArea("Description", objectEntry.getModel().getDescription().get()));
            }

            if (objectEntry.getModel().getInscriptions().isPresent()) {
                formLayout.addComponent(new InscriptionsTable(objectEntry.getModel().getInscriptions().get()));
            }

            if (objectEntry.getModel().getMaterials().isPresent()) {
                formLayout.addComponent(new MaterialsTable(objectEntry.getModel().getMaterials().get()));
            }

            if (objectEntry.getModel().getProvenance().isPresent()) {
                formLayout.addComponent(__createTextField("Provenance", objectEntry.getModel().getProvenance().get()));
            }

            if (objectEntry.getModel().getSummary().isPresent()) {
                formLayout.addComponent(__createTextArea("Summary", objectEntry.getModel().getSummary().get()));
            }

            if (objectEntry.getModel().getTechniques().isPresent()) {
                formLayout.addComponent(new TechniquesTable(objectEntry.getModel().getTechniques().get()));
            }

            if (objectEntry.getModel().getUrl().isPresent()) {
                formLayout.addComponent(new Link(objectEntry.getModel().getUrl().get().toString(),
                        new ExternalResource(objectEntry.getModel().getUrl().get().toString())));
            }

            leftPaneLayout.addComponent(formLayout);
        }

        if (objectEntry.getModel().getThumbnail().isPresent()) {
            final Image thumbnail = new Image("", objectEntry.getModel().getThumbnail().get());
            rightPaneLayout.addComponent(thumbnail);
        }

        rootLayout.addComponent(twoPaneLayout);

        setCompositionRoot(rootLayout);
    }

    private TextArea __createTextArea(final String caption, final String value) {
        final TextArea textArea = new TextArea(caption, value);
        textArea.addStyleName("borderlessTextField");
        textArea.setReadOnly(true);
        textArea.setHeight((float) value.length() / (float) 80 * (float) 2.0, Unit.EM);
        textArea.setWidth((float) ((value.length() <= 80 ? value.length() : 80) * 0.5), Unit.EM);
        return textArea;
    }

    private TextField __createTextField(final String caption, final String value) {
        final TextField textField = new TextField(caption, value);
        textField.addStyleName("borderlessTextField");
        textField.setReadOnly(true);
        textField.setWidth((float) (value.length() * 1.0), Unit.EM);
        return textField;
    }
}
