package net.lab1318.costume.lib.services.object;

import javax.annotation.Nullable;

import org.thryft.native_.Url;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.agent.Agent;
import net.lab1318.costume.api.models.color.Color;
import net.lab1318.costume.api.models.cultural_context.CulturalContext;
import net.lab1318.costume.api.models.date.Date;
import net.lab1318.costume.api.models.date.DateType;
import net.lab1318.costume.api.models.description.Description;
import net.lab1318.costume.api.models.description.DescriptionType;
import net.lab1318.costume.api.models.image.Image;
import net.lab1318.costume.api.models.image.ImageVersion;
import net.lab1318.costume.api.models.material.Material;
import net.lab1318.costume.api.models.object.Object;
import net.lab1318.costume.api.models.object.ObjectSummary;
import net.lab1318.costume.api.models.relation.Relation;
import net.lab1318.costume.api.models.subject.Subject;
import net.lab1318.costume.api.models.subject.SubjectTerm;
import net.lab1318.costume.api.models.technique.Technique;
import net.lab1318.costume.api.models.textref.Textref;
import net.lab1318.costume.api.models.textref.TextrefRefidType;
import net.lab1318.costume.api.models.title.Title;
import net.lab1318.costume.api.models.work_type.WorkType;

public final class ObjectSummarizer {
    public static ObjectSummarizer getInstance() {
        return instance;
    }

    private ObjectSummarizer() {
    }

    public ObjectSummary summarizeObject(final Object object) {
        final ObjectSummary.Builder builder = ObjectSummary.builder();

        if (object.getAgents().isPresent()) {
            final ImmutableList.Builder<String> agentNameTextsBuilder = ImmutableList.builder();
            for (final Agent agent : object.getAgents().get().getElements()) {
                agentNameTextsBuilder.add(agent.getName().getText());
            }
            builder.setAgentNameTexts(agentNameTextsBuilder.build());
        }

        builder.setCategories(object.getCategories());

        builder.setCollectionId(object.getCollectionId());

        if (object.getColors().isPresent()) {
            final ImmutableList.Builder<String> colorTextsBuilder = ImmutableList.builder();
            for (final Color color : object.getColors().get().getElements()) {
                colorTextsBuilder.add(color.getText());
            }
            builder.setColorTexts(colorTextsBuilder.build());
        }

        if (object.getCulturalContexts().isPresent()) {
            final ImmutableList.Builder<String> culturalContextTextsBuilder = ImmutableList.builder();
            for (final CulturalContext culturalContext : object.getCulturalContexts().get().getElements()) {
                culturalContextTextsBuilder.add(culturalContext.getText());
            }
            builder.setCulturalContextTexts(culturalContextTextsBuilder.build());
        }

        if (object.getDates().isPresent()) {
            @Nullable
            Date representativeDate = null;
            for (final Date date : object.getDates().get().getElements()) {
                if (date.getType() == DateType.CREATION) {
                    representativeDate = date;
                    break;
                }
            }
            if (representativeDate == null) {
                representativeDate = object.getDates().get().getElements().get(0);
            }
            String representativeDateString;
            if (representativeDate.getEarliestDate().getText().equals(representativeDate.getLatestDate().getText())) {
                representativeDateString = representativeDate.getEarliestDate().getText();
            } else {
                representativeDateString = representativeDate.getEarliestDate().getText() + '-'
                        + representativeDate.getLatestDate().getText();
            }
            builder.setDate(representativeDateString);
        }

        if (object.getDescriptions().isPresent()) {
            @Nullable
            String descriptionText = null;
            for (final Description description : object.getDescriptions().get().getElements()) {
                if (description.getType().isPresent() && description.getType().get() == DescriptionType.SUMMARY) {
                    descriptionText = description.getText();
                    break;
                }
            }
            if (descriptionText == null) {
                for (final Description description : object.getDescriptions().get().getElements()) {
                    if (!description.getType().isPresent()) {
                        descriptionText = description.getText();
                        break;
                    }
                }

                if (descriptionText == null) {
                    descriptionText = object.getDescriptions().get().getElements().get(0).getText();
                }
            }
            builder.setDescription(descriptionText);
        }

        builder.setGender(object.getGender());

        builder.setInstitutionId(object.getInstitutionId());

        if (object.getMaterials().isPresent()) {
            final ImmutableList.Builder<String> materialTextsBuilder = ImmutableList.builder();
            for (final Material material : object.getMaterials().get().getElements()) {
                materialTextsBuilder.add(material.getText());
            }
            builder.setMaterialTexts(materialTextsBuilder.build());
        }

        builder.setModelMetadata(object.getModelMetadata());

        if (object.getRelations().isPresent()) {
            final ImmutableList.Builder<String> relationTextsBuilder = ImmutableList.builder();
            for (final Relation relation : object.getRelations().get().getElements()) {
                if (relation.getText().isPresent() && !relation.getText().get().isEmpty()) {
                    relationTextsBuilder.add(relation.getText().get());
                }
            }
            final ImmutableList<String> relationTexts = relationTextsBuilder.build();
            if (!relationTexts.isEmpty()) {
                builder.setRelationTexts(relationTexts);
            }
        }

        if (object.getSubjects().isPresent()) {
            final ImmutableList.Builder<String> subjectTermTextsBuilder = ImmutableList.builder();
            for (final Subject subject : object.getSubjects().get().getElements()) {
                for (final SubjectTerm subjectTerm : subject.getTerms()) {
                    subjectTermTextsBuilder.add(subjectTerm.getText());
                }
            }
            builder.setSubjectTermTexts(subjectTermTextsBuilder.build());
        }

        if (object.getTechniques().isPresent()) {
            final ImmutableList.Builder<String> techniqueTextsBuilder = ImmutableList.builder();
            for (final Technique technique : object.getTechniques().get().getElements()) {
                techniqueTextsBuilder.add(technique.getText());
            }
            builder.setTechniqueTexts(techniqueTextsBuilder.build());
        }

        // Thumbnail
        if (object.getImages().isPresent()) {
            @Nullable
            ImageVersion thumbnail = null;
            for (final Image image : object.getImages().get()) {
                if (image.getSquareThumbnail().isPresent()) {
                    thumbnail = image.getSquareThumbnail().get();
                    break;
                }
            }
            if (thumbnail == null) {
                for (final Image image : object.getImages().get()) {
                    if (image.getThumbnail().isPresent()) {
                        thumbnail = image.getThumbnail().get();
                        break;
                    }
                }
            }
            if (thumbnail != null) {
                builder.setThumbnail(thumbnail);
            }
        }

        // Title
        {
            @Nullable
            String titleText = null;
            for (final Title title : object.getTitles().getElements()) {
                if (title.getPref().or(Boolean.FALSE)) {
                    titleText = title.getText();
                    break;
                }
            }
            if (titleText == null) {
                titleText = object.getTitles().getElements().get(0).getText();
            }
            builder.setTitle(titleText);
        }

        // URL
        if (object.getTextrefs().isPresent()) {
            @Nullable
            Url url = null;
            for (final Textref textref : object.getTextrefs().get().getElements()) {
                if (textref.getRefid().getType() == TextrefRefidType.URI && textref.getRefid().getHref().isPresent()) {
                    url = textref.getRefid().getHref().get();
                    break;
                }
            }
            if (url != null) {
                builder.setUrl(url);
            }
        }

        if (object.getWorkTypes().isPresent()) {
            final ImmutableList.Builder<String> workTypeTextsBuilder = ImmutableList.builder();
            for (final WorkType workType : object.getWorkTypes().get().getElements()) {
                workTypeTextsBuilder.add(workType.getText());
            }
            builder.setWorkTypeTexts(workTypeTextsBuilder.build());
        }

        return builder.build();
    }

    private final static ObjectSummarizer instance = new ObjectSummarizer();
}
