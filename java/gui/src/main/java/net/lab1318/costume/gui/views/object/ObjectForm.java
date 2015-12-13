package net.lab1318.costume.gui.views.object;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import net.lab1318.costume.api.models.image.ImageVersion;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.title.Title;
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
            Title preferredTitle = objectEntry.getModel().getTitles().getElements().get(0);
            for (final Title title : objectEntry.getModel().getTitles().getElements()) {
                if (title.getPref().or(Boolean.FALSE)) {
                    preferredTitle = title;
                    break;
                }
            }
            final Label titleLabel = new Label(preferredTitle.getText());
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

            if (objectEntry.getModel().getTitles().getElements().size() > 1) {
                formLayout.addComponent(new TitleSetTable(objectEntry.getModel().getTitles()));
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
            for (final net.lab1318.costume.api.models.image.Image imageModel : objectEntry.getModel().getImages()
                    .get()) {
                final ImageVersion bestImageModel;
                if (imageModel.getFullSize().isPresent()) {
                    bestImageModel = imageModel.getFullSize().get();
                } else if (imageModel.getThumbnail().isPresent()) {
                    bestImageModel = imageModel.getThumbnail().get();
                } else if (imageModel.getSquareThumbnail().isPresent()) {
                    bestImageModel = imageModel.getSquareThumbnail().get();
                } else {
                    continue;
                }
                final Image imageView = new Image("", bestImageModel);
                if (imageModel.getOriginal().isPresent()) {
                    imageView.addClickListener(new ClickListener() {
                        @Override
                        public void click(final ClickEvent event) {
                            getUI().getPage().open(imageModel.getFullSize().get().getUrl().toString(), "_blank");
                        }
                    });
                }
                rightPaneLayout.addComponent(imageView);
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
