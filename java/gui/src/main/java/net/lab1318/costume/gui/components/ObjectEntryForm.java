package net.lab1318.costume.gui.components;

import org.apache.commons.lang3.StringUtils;
import org.thryft.waf.gui.EventBus;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.TextField;

import net.lab1318.costume.api.models.image.ImageVersion;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.object.ObjectEntry;
import net.lab1318.costume.api.models.title.Title;
import net.lab1318.costume.gui.models.gender.Genders;

@SuppressWarnings("serial")
public final class ObjectEntryForm extends CustomComponent {
    @DesignRoot("ObjectEntryForm.html")
    private final static class Design extends HorizontalLayout {
        public Design() {
            com.vaadin.ui.declarative.Design.read(this);
        }

        FormLayout formLayout;
        Layout rightPaneLayout;
        Layout rightsLayout;
        Label titleLabel;
    }

    public ObjectEntryForm(final EventBus eventBus, final ObjectEntry objectEntry, final Institution institution) {
        final Design design = new Design();

        {
            Title preferredTitle = objectEntry.getModel().getTitles().getElements().get(0);
            for (final Title title : objectEntry.getModel().getTitles().getElements()) {
                if (title.getPref().or(Boolean.FALSE)) {
                    preferredTitle = title;
                    break;
                }
            }
            design.titleLabel.setCaptionAsHtml(true);
            design.titleLabel.setCaption("<h3>" + preferredTitle.getText() + "</h3>");
        }

        {
            final FormLayout formLayout = design.formLayout;

            if (objectEntry.getModel().getDates().isPresent()) {
                formLayout.addComponent(new DateSetTable(objectEntry.getModel().getDates().get()));
            }

            if (objectEntry.getModel().getAgents().isPresent()) {
                formLayout.addComponent(new AgentSetTable(objectEntry.getModel().getAgents().get()));
            }

            if (objectEntry.getModel().getCategories().isPresent()) {
                formLayout.addComponent(new CategoriesTable(objectEntry.getModel().getCategories().get(), eventBus,
                        objectEntry.getId()));
            }

            if (objectEntry.getModel().getClosures().isPresent()) {
                formLayout.addComponent(new ClosureSetTable(objectEntry.getModel().getClosures().get()));
            }

            if (objectEntry.getModel().getComponents().isPresent()) {
                formLayout.addComponent(new ComponentSetTable(objectEntry.getModel().getComponents().get()));
            }

            if (objectEntry.getModel().getColors().isPresent()) {
                formLayout.addComponent(new ColorSetTable(objectEntry.getModel().getColors().get()));
            }

            if (objectEntry.getModel().getCondition().isPresent()) {
                String condition = objectEntry.getModel().getCondition().get().name();
                condition = condition.replace('_', ' ');
                condition = StringUtils.capitalize(condition.toLowerCase());
                formLayout.addComponent(__createTextField("Condition", condition));
            }

            if (objectEntry.getModel().getCulturalContexts().isPresent()) {
                formLayout
                        .addComponent(new CulturalContextSetTable(objectEntry.getModel().getCulturalContexts().get()));
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

            if (objectEntry.getModel().getLocations().isPresent()) {
                formLayout.addComponent(new LocationSetTable(eventBus, objectEntry.getModel().getLocations().get(),
                        objectEntry.getId()));
            }

            if (objectEntry.getModel().getMaterials().isPresent()) {
                formLayout.addComponent(new MaterialSetTable(eventBus, objectEntry.getModel().getMaterials().get(),
                        objectEntry.getId()));
            }

            if (objectEntry.getModel().getMeasurements().isPresent()) {
                formLayout.addComponent(new MeasurementsSetTable(objectEntry.getModel().getMeasurements().get()));
            }

            if (objectEntry.getModel().getProvenance().isPresent()) {
                formLayout.addComponent(__createTextField("Provenance", objectEntry.getModel().getProvenance().get()));
            }

            if (objectEntry.getModel().getQuantity().isPresent()) {
                formLayout.addComponent(
                        __createTextField("Quantity", objectEntry.getModel().getQuantity().get().toString()));
            }

            if (objectEntry.getModel().getSubjects().isPresent()) {
                formLayout.addComponent(
                        new SubjectSetTable(eventBus, objectEntry.getId(), objectEntry.getModel().getSubjects().get()));
            }

            if (objectEntry.getModel().getRelations().isPresent()) {
                formLayout.addComponent(new RelationSetTable(eventBus, objectEntry.getModel().getInstitutionId(),
                        objectEntry.getModel().getRelations().get()));
            }

            if (objectEntry.getModel().getStructures().isPresent()) {
                formLayout.addComponent(new StructureSetTable(objectEntry.getModel().getStructures().get()));
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

            if (objectEntry.getModel().getViewType().isPresent()) {
                formLayout.addComponent(
                        __createTextField("View type", objectEntry.getModel().getViewType().get().name()));
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

            if (objectEntry.getModel().getRights().isPresent()) {
                final RightsLayout objectRightsLayout = new RightsLayout("Object metadata",
                        objectEntry.getModel().getRights().get());
                if (!objectRightsLayout.isEmpty()) {
                    design.rightsLayout.addComponent(objectRightsLayout);
                }
            }
            if (institution.getDataRights().isPresent()) {
                final RightsLayout institutionRightsLayout = new RightsLayout("Institution metadata",
                        institution.getDataRights().get());
                if (!institutionRightsLayout.isEmpty()) {
                    design.rightsLayout.addComponent(institutionRightsLayout);
                }
            }
        }

        {
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
                    design.rightPaneLayout.addComponent(new ImageWithRightsLayout("", imageModel.getOriginal(),
                            bestImageModel, imageModel.getRights().or(objectEntry.getModel().getRights())));
                }
            }
        }

        setCompositionRoot(design);
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
        textField.addStyleName("borderless");
        textField.setReadOnly(true);
        if (value.length() > 1) {
            textField.setWidth((float) (value.length() * 1.0), Unit.EM);
        } else {
            textField.setWidth((float) 2.0, Unit.EM);
        }
        return textField;
    }
}
