package net.lab1318.costume.gui.views.object;

import javax.annotation.Nullable;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.image.ImageType;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.gui.models.gender.Genders;

@SuppressWarnings("serial")
final class ObjectForm extends CustomComponent {
    public ObjectForm(final ObjectEntry objectEntry, final Institution institution) {
        final VerticalLayout rootLayout = new VerticalLayout();
        rootLayout.setSizeFull();

        final HorizontalLayout twoPaneLayout = new HorizontalLayout();
        twoPaneLayout.setSizeFull();

        final VerticalLayout leftPaneLayout = new VerticalLayout();
        leftPaneLayout.setSpacing(false);
        twoPaneLayout.addComponent(leftPaneLayout);
        twoPaneLayout.setComponentAlignment(leftPaneLayout, Alignment.TOP_LEFT);

        {
            final Label titleLabel = new Label(objectEntry.getModel().getTitle());
            titleLabel.setStyleName("h3");
            leftPaneLayout.addComponent(titleLabel);
        }

        {
            final FormLayout formLayout = new FormLayout();
            formLayout.setSpacing(true);
            formLayout.setSizeFull();

            if (objectEntry.getModel().getDateText().isPresent()) {
                formLayout.addComponent(__createTextField("Date", objectEntry.getModel().getDateText().get()));
            } else if (objectEntry.getModel().getDate().isPresent()) {
                formLayout.addComponent(__createTextField("Date", objectEntry.getModel().getDate().get().toString()));
            }

            if (objectEntry.getModel().getAgents().isPresent()) {
                formLayout.addComponent(new AgentSetTable(objectEntry.getModel().getAgents().get()));
            }

            if (objectEntry.getModel().getCategories().isPresent()) {
                formLayout.addComponent(new CategoriesTable(objectEntry.getModel().getCategories().get()));
            }

            if (objectEntry.getModel().getDescriptions().isPresent()) {
                formLayout.addComponent(new DescriptionSetTable(objectEntry.getModel().getDescriptions().get()));
            }

            if (objectEntry.getModel().getGender().isPresent()) {
                formLayout.addComponent(
                        __createTextField("Gender", Genders.getCaption(objectEntry.getModel().getGender().get())));
            }

            if (objectEntry.getModel().getInscriptions().isPresent()) {
                formLayout.addComponent(new InscriptionSetTable(objectEntry.getModel().getInscriptions().get()));
            }

            if (objectEntry.getModel().getMaterials().isPresent()) {
                formLayout.addComponent(new MaterialSetTable(objectEntry.getModel().getMaterials().get()));
            }

            if (objectEntry.getModel().getProvenance().isPresent()) {
                formLayout.addComponent(__createTextField("Provenance", objectEntry.getModel().getProvenance().get()));
            }

            if (objectEntry.getModel().getQuantity().isPresent()) {
                formLayout.addComponent(
                        __createTextField("Quantity", objectEntry.getModel().getQuantity().get().toString()));
            }

            if (objectEntry.getModel().getSubjects().isPresent()) {
                formLayout.addComponent(new SubjectSetTable(objectEntry.getModel().getSubjects().get()));
            }

            if (objectEntry.getModel().getTechniques().isPresent()) {
                formLayout.addComponent(new TechniqueSetTable(objectEntry.getModel().getTechniques().get()));
            }

            if (objectEntry.getModel().getTextrefs().isPresent()) {
                formLayout.addComponent(new TextrefsTable(objectEntry.getModel().getTextrefs().get()));
            }

            if (objectEntry.getModel().getWorkTypes().isPresent()) {
                formLayout.addComponent(new WorkTypeSetTable(objectEntry.getModel().getWorkTypes().get()));
            }
            //
            // if (objectEntry.getModel().getUrl().isPresent()) {
            // final Link link = new
            // Link(objectEntry.getModel().getUrl().get().toString(),
            // new
            // ExternalResource(objectEntry.getModel().getUrl().get().toString()));
            // link.setTargetName("_blank");
            // formLayout.addComponent(link);
            // }

            leftPaneLayout.addComponent(formLayout);

            if (objectEntry.getModel().getRights().isPresent()) {
                leftPaneLayout.addComponent(new RightsLabel(objectEntry.getModel().getRights().get()));
            }
            leftPaneLayout.addComponent(new RightsLabel(institution.getDataRights()));
        }

        final VerticalLayout rightPaneLayout = new VerticalLayout();
        twoPaneLayout.addComponent(rightPaneLayout);
        twoPaneLayout.setComponentAlignment(rightPaneLayout, Alignment.TOP_CENTER);

        if (objectEntry.getModel().getImages().isPresent()) {
            @Nullable
            net.lab1318.costume.api.models.image.Image bestImageModel = null;
            for (final net.lab1318.costume.api.models.image.Image imageModel : objectEntry.getModel().getImages()
                    .get()) {
                if (bestImageModel == null) {
                    bestImageModel = imageModel;
                    continue;
                }

                // if (imageModel.getHeightPx().isPresent() &&
                // imageModel.getWidthPx().isPresent()
                // && (!bestImageModel.getHeightPx().isPresent() ||
                // !bestImageModel.getWidthPx().isPresent())) {
                // bestImageModel = imageModel;
                // continue;
                // }

                if (imageModel.getType().isPresent()) {
                    if (!bestImageModel.getType().isPresent()) {
                        bestImageModel = imageModel;
                        continue;
                    }

                    if (imageModel.getType().get() == ImageType.FULL_SIZE
                            && bestImageModel.getType().get() != ImageType.FULL_SIZE) {
                        bestImageModel = imageModel;
                        continue;
                    }
                }
            }

            if (bestImageModel != null) {
                rightPaneLayout.addComponent(new Image("", bestImageModel));
            }
        }

        rootLayout.addComponent(twoPaneLayout);

        setCompositionRoot(rootLayout);
    }

    // private TextArea __createTextArea(final String caption, final String
    // value) {
    // final TextArea textArea = new TextArea(caption, value);
    // textArea.addStyleName("borderlessTextField");
    // textArea.setReadOnly(true);
    // textArea.setHeight((float) value.length() / (float) 80 * (float) 2.0,
    // Unit.EM);
    // textArea.setWidth((float) ((value.length() <= 80 ? value.length() : 80) *
    // 0.5), Unit.EM);
    // return textArea;
    // }

    private TextField __createTextField(final String caption, final String value) {
        final TextField textField = new TextField(caption, value);
        textField.addStyleName("borderlessTextField");
        textField.setReadOnly(true);
        if (value.length() > 1) {
            textField.setWidth((float) (value.length() * 1.0), Unit.EM);
        } else {
            textField.setWidth((float) 2.0, Unit.EM);
        }
        return textField;
    }
}
