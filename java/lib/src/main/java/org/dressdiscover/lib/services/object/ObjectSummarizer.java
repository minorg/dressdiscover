package org.dressdiscover.lib.services.object;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Nullable;

import org.dressdiscover.api.models.image.Image;
import org.dressdiscover.api.models.object.Object;
import org.dressdiscover.api.models.object.ObjectEntry;
import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.models.object.ObjectSummary;
import org.dressdiscover.api.vocabularies.costume_core.color.Color;
import org.dressdiscover.api.vocabularies.costume_core.color.ColorSet;
import org.dressdiscover.api.vocabularies.costume_core.structure.Structure;
import org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet;
import org.dressdiscover.api.vocabularies.vra_core.agent.Agent;
import org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet;
import org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContext;
import org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet;
import org.dressdiscover.api.vocabularies.vra_core.date.Date;
import org.dressdiscover.api.vocabularies.vra_core.date.DateSet;
import org.dressdiscover.api.vocabularies.vra_core.date.DateType;
import org.dressdiscover.api.vocabularies.vra_core.description.Description;
import org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet;
import org.dressdiscover.api.vocabularies.vra_core.description.DescriptionType;
import org.dressdiscover.api.vocabularies.vra_core.location.Location;
import org.dressdiscover.api.vocabularies.vra_core.location.LocationName;
import org.dressdiscover.api.vocabularies.vra_core.location.LocationSet;
import org.dressdiscover.api.vocabularies.vra_core.material.Material;
import org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet;
import org.dressdiscover.api.vocabularies.vra_core.relation.Relation;
import org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet;
import org.dressdiscover.api.vocabularies.vra_core.subject.Subject;
import org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet;
import org.dressdiscover.api.vocabularies.vra_core.subject.SubjectTerm;
import org.dressdiscover.api.vocabularies.vra_core.technique.Technique;
import org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet;
import org.dressdiscover.api.vocabularies.vra_core.textref.Textref;
import org.dressdiscover.api.vocabularies.vra_core.textref.TextrefRefidType;
import org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet;
import org.dressdiscover.api.vocabularies.vra_core.title.Title;
import org.dressdiscover.api.vocabularies.vra_core.title.TitleSet;
import org.dressdiscover.api.vocabularies.vra_core.work_type.WorkType;
import org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet;
import org.thryft.native_.Url;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public final class ObjectSummarizer {
    public static ObjectSummarizer getInstance() {
        return instance;
    }

    private ObjectSummarizer() {
    }

    public final ObjectSummary summarizeObject(final Object object, final ObjectId objectId) {
        final ObjectSummary.Builder builder = ObjectSummary.builder();

        if (object.getVraCore().isPresent() && object.getVraCore().get().getAgentSets().isPresent()) {
            final ImmutableList.Builder<String> agentNameTextsBuilder = ImmutableList.builder();
            for (final AgentSet agentSet : object.getVraCore().get().getAgentSets().get()) {
                for (final Agent agent : agentSet.getElements()) {
                    agentNameTextsBuilder.add(agent.getName().getText());
                }
            }
            builder.setAgentNameTexts(agentNameTextsBuilder.build());
        }

        // builder.setCategories(object.getCategories());

        builder.setCollectionId(objectId.getCollectionId());

        if (object.getCostumeCore().isPresent() && object.getCostumeCore().get().getColorSets().isPresent()) {
            final ImmutableList.Builder<String> colorTextsBuilder = ImmutableList.builder();
            for (final ColorSet colorSet : object.getCostumeCore().get().getColorSets().get()) {
                for (final Color color : colorSet.getElements()) {
                    colorTextsBuilder.add(color.getText());
                }
            }
            builder.setColorTexts(colorTextsBuilder.build());
        }

        if (object.getVraCore().isPresent() && object.getVraCore().get().getCulturalContextSets().isPresent()) {
            final ImmutableList.Builder<String> culturalContextTextsBuilder = ImmutableList.builder();
            for (final CulturalContextSet culturalContextSet : object.getVraCore().get().getCulturalContextSets()
                    .get()) {
                for (final CulturalContext culturalContext : culturalContextSet.getElements()) {
                    culturalContextTextsBuilder.add(culturalContext.getText());
                }
            }
            builder.setCulturalContextTexts(culturalContextTextsBuilder.build());
        }

        if (object.getVraCore().isPresent() && object.getVraCore().get().getDateSets().isPresent()) {
            @Nullable
            Date representativeDate = null;
            for (final DateSet dateSet : object.getVraCore().get().getDateSets().get()) {
                for (final Date date : dateSet.getElements()) {
                    if (date.getType() == DateType.CREATION) {
                        representativeDate = date;
                        break;
                    }
                }
                if (representativeDate != null) {
                    break;
                }
            }
            if (representativeDate == null) {
                representativeDate = object.getVraCore().get().getDateSets().get().get(0).getElements().get(0);
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

        if (object.getVraCore().isPresent() && object.getVraCore().get().getDescriptionSets().isPresent()) {
            @Nullable
            String descriptionText = null;
            for (final DescriptionSet descriptionSet : object.getVraCore().get().getDescriptionSets().get()) {
                for (final Description description : descriptionSet.getElements()) {
                    if (description.getType().isPresent() && description.getType().get() == DescriptionType.SUMMARY) {
                        descriptionText = description.getText();
                        break;
                    }
                }
                if (descriptionText != null) {
                    break;
                }
            }
            if (descriptionText == null) {
                for (final DescriptionSet descriptionSet : object.getVraCore().get().getDescriptionSets().get()) {
                    for (final Description description : descriptionSet.getElements()) {
                        if (!description.getType().isPresent()) {
                            descriptionText = description.getText();
                            break;
                        }
                    }
                    if (descriptionText != null) {
                        break;
                    }
                }

                if (descriptionText == null) {
                    descriptionText = object.getVraCore().get().getDescriptionSets().get().get(0).getElements().get(0)
                            .getText();
                }
            }
            builder.setDescription(descriptionText);
        }

        if (object.getCostumeCore().isPresent()) {
            builder.setGender(object.getCostumeCore().get().getGender());
        }

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

        builder.setInstitutionId(objectId.getInstitutionId());

        if (object.getVraCore().isPresent() && object.getVraCore().get().getLocationSets().isPresent()) {
            final ImmutableList.Builder<String> locationNameTextsBuilder = ImmutableList.builder();
            for (final LocationSet locationSet : object.getVraCore().get().getLocationSets().get()) {
                for (final Location location : locationSet.getElements()) {
                    if (!location.getNames().isPresent()) {
                        continue;
                    }
                    for (final LocationName locationName : location.getNames().get()) {
                        locationNameTextsBuilder.add(locationName.getText());
                    }
                }
            }
            final ImmutableList<String> locationNameTexts = locationNameTextsBuilder.build();
            if (!locationNameTexts.isEmpty()) {
                builder.setLocationNameTexts(locationNameTexts);
            }
        }

        if (object.getVraCore().isPresent() && object.getVraCore().get().getMaterialSets().isPresent()) {
            final ImmutableList.Builder<String> materialTextsBuilder = ImmutableList.builder();
            for (final MaterialSet materialSet : object.getVraCore().get().getMaterialSets().get()) {
                for (final Material material : materialSet.getElements()) {
                    materialTextsBuilder.add(material.getText());
                }
            }
            builder.setMaterialTexts(materialTextsBuilder.build());
        }

        if (object.getVraCore().isPresent() && object.getVraCore().get().getRelationSets().isPresent()) {
            final ImmutableList.Builder<String> relationTextsBuilder = ImmutableList.builder();
            for (final RelationSet relationSet : object.getVraCore().get().getRelationSets().get()) {
                for (final Relation relation : relationSet.getElements()) {
                    if (relation.getText().isPresent() && !relation.getText().get().isEmpty()) {
                        relationTextsBuilder.add(relation.getText().get());
                    }
                }
            }
            final ImmutableList<String> relationTexts = relationTextsBuilder.build();
            if (!relationTexts.isEmpty()) {
                builder.setRelationTexts(relationTexts);
            }
        }

        if (object.getCostumeCore().isPresent() && object.getCostumeCore().get().getStructureSets().isPresent()) {
            // Use a mutable map and then make a copy of it, to allow for
            // duplicate structure type entries
            final Map<String, String> structureTextsBuilder = new LinkedHashMap<>();
            for (final StructureSet structureSet : object.getCostumeCore().get().getStructureSets().get()) {
                for (final Structure structure : structureSet.getElements()) {
                    structureTextsBuilder.put(structure.getType().getText(), structure.getText());
                }
            }
            builder.setStructureTexts(ImmutableMap.copyOf(structureTextsBuilder));
        }

        if (object.getVraCore().isPresent() && object.getVraCore().get().getSubjectSets().isPresent()) {
            final ImmutableList.Builder<String> subjectTermTextsBuilder = ImmutableList.builder();
            for (final SubjectSet subjectSet : object.getVraCore().get().getSubjectSets().get()) {
                for (final Subject subject : subjectSet.getElements()) {
                    for (final SubjectTerm subjectTerm : subject.getTerms()) {
                        subjectTermTextsBuilder.add(subjectTerm.getText());
                    }
                }
            }
            builder.setSubjectTermTexts(subjectTermTextsBuilder.build());
        }

        if (object.getVraCore().isPresent() && object.getVraCore().get().getTechniqueSets().isPresent()) {
            final ImmutableList.Builder<String> techniqueTextsBuilder = ImmutableList.builder();
            for (final TechniqueSet techniqueSet : object.getVraCore().get().getTechniqueSets().get()) {
                for (final Technique technique : techniqueSet.getElements()) {
                    techniqueTextsBuilder.add(technique.getText());
                }
            }
            builder.setTechniqueTexts(techniqueTextsBuilder.build());
        }

        // Title
        if (object.getVraCore().isPresent() && object.getVraCore().get().getTitleSets().isPresent()) {
            @Nullable
            String titleText = null;
            for (final TitleSet titleSet : object.getVraCore().get().getTitleSets().get()) {
                for (final Title title : titleSet.getElements()) {
                    if (title.getPref().or(Boolean.FALSE)) {
                        titleText = title.getText();
                        break;
                    }
                }
                if (titleText != null) {
                    break;
                }
            }
            if (titleText == null) {
                titleText = object.getVraCore().get().getTitleSets().get().get(0).getElements().get(0).getText();
            }
            builder.setTitle(titleText);
        } else if (object.getDublinCore().isPresent() && object.getDublinCore().get().getTitles().isPresent()) {
            builder.setTitle(object.getDublinCore().get().getTitles().get().get(0));
        } else {
            builder.setTitle("(No title)");
        }

        // URL
        if (object.getVraCore().isPresent() && object.getVraCore().get().getTextrefSets().isPresent()) {
            @Nullable
            Url url = null;
            for (final TextrefSet textrefSet : object.getVraCore().get().getTextrefSets().get()) {
                for (final Textref textref : textrefSet.getElements()) {
                    if (textref.getRefid().getType() == TextrefRefidType.URI
                            && textref.getRefid().getHref().isPresent()) {
                        url = textref.getRefid().getHref().get();
                        break;
                    }
                }
                if (url != null) {
                    break;
                }
            }
            if (url != null) {
                builder.setUrl(url);
            }
        }

        if (object.getVraCore().isPresent() && object.getVraCore().get().getWorkTypeSets().isPresent()) {
            final ImmutableList.Builder<String> workTypeTextsBuilder = ImmutableList.builder();
            for (final WorkTypeSet workTypeSet : object.getVraCore().get().getWorkTypeSets().get()) {
                for (final WorkType workType : workTypeSet.getElements()) {
                    workTypeTextsBuilder.add(workType.getText());
                }
            }
            builder.setWorkTypeTexts(workTypeTextsBuilder.build());
        }

        return builder.build();
    }

    public ObjectSummary summarizeObject(final ObjectEntry objectEntry) {
        return summarizeObject(objectEntry.getModel(), objectEntry.getId());
    }

    private final static ObjectSummarizer instance = new ObjectSummarizer();
}
