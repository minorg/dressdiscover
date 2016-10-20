package org.dressdiscover.lib.services.object;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Nullable;

import org.dressdiscover.api.models.image.Image;
import org.dressdiscover.api.models.object.Object;
import org.dressdiscover.api.models.object.ObjectSummary;
import org.dressdiscover.api.vocabularies.costume_core.color.Color;
import org.dressdiscover.api.vocabularies.costume_core.structure.Structure;
import org.dressdiscover.api.vocabularies.vra_core.agent.Agent;
import org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContext;
import org.dressdiscover.api.vocabularies.vra_core.date.Date;
import org.dressdiscover.api.vocabularies.vra_core.date.DateType;
import org.dressdiscover.api.vocabularies.vra_core.description.Description;
import org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType;
import org.dressdiscover.api.vocabularies.vra_core.location.Location;
import org.dressdiscover.api.vocabularies.vra_core.location.LocationName;
import org.dressdiscover.api.vocabularies.vra_core.material.Material;
import org.dressdiscover.api.vocabularies.vra_core.relation.Relation;
import org.dressdiscover.api.vocabularies.vra_core.subject.Subject;
import org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm;
import org.dressdiscover.api.vocabularies.vra_core.technique.Technique;
import org.dressdiscover.api.vocabularies.vra_core.textref.Textref;
import org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType;
import org.dressdiscover.api.vocabularies.vra_core.title.Title;
import org.dressdiscover.api.vocabularies.vra_core.work_type.WorkType;
import org.thryft.native_.Url;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

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

        builder.setHidden(object.getHidden());

        if (object.getImages().isPresent()) {
            Image selectedImage = null;
            for (final Image image : object.getImages().get()) {
                if (image.getSquareThumbnail().isPresent()) {
                    selectedImage = image;
                    break;
                }
            }
            if (selectedImage == null) {
                for (final Image image : object.getImages().get()) {
                    if (image.getThumbnail().isPresent()) {
                        selectedImage = image;
                        break;
                    }
                }
            }
            if (selectedImage != null) {
                builder.setImage(selectedImage);
            }
        }

        builder.setInstitutionId(object.getInstitutionId());

        if (object.getLocations().isPresent()) {
            final ImmutableList.Builder<String> locationNameTextsBuilder = ImmutableList.builder();
            for (final Location location : object.getLocations().get().getElements()) {
                if (!location.getNames().isPresent()) {
                    continue;
                }
                for (final LocationName locationName : location.getNames().get()) {
                    locationNameTextsBuilder.add(locationName.getText());
                }
            }
            final ImmutableList<String> locationNameTexts = locationNameTextsBuilder.build();
            if (!locationNameTexts.isEmpty()) {
                builder.setLocationNameTexts(locationNameTexts);
            }
        }

        if (object.getMaterials().isPresent()) {
            final ImmutableList.Builder<String> materialTextsBuilder = ImmutableList.builder();
            for (final Material material : object.getMaterials().get().getElements()) {
                materialTextsBuilder.add(material.getText());
            }
            builder.setMaterialTexts(materialTextsBuilder.build());
        }

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

        if (object.getStructures().isPresent()) {
            // Use a mutable map and then make a copy of it, to allow for
            // duplicate structure type entries
            final Map<String, String> structureTextsBuilder = new LinkedHashMap<>();
            for (final Structure structure : object.getStructures().get().getElements()) {
                structureTextsBuilder.put(structure.getType().getText(), structure.getText());
            }
            builder.setStructureTexts(ImmutableMap.copyOf(structureTextsBuilder));
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

        // Image
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
