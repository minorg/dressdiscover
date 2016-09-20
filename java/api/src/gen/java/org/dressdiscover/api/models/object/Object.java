package org.dressdiscover.api.models.object;

public final class Object implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            collectionId = null;
            institutionId = null;
            titles = null;
            agents = com.google.common.base.Optional.<org.dressdiscover.api.models.agent.AgentSet> absent();
            categories = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            closures = com.google.common.base.Optional.<org.dressdiscover.api.models.closure.ClosureSet> absent();
            colors = com.google.common.base.Optional.<org.dressdiscover.api.models.color.ColorSet> absent();
            components = com.google.common.base.Optional.<org.dressdiscover.api.models.component.ComponentSet> absent();
            condition = com.google.common.base.Optional.<org.dressdiscover.api.models.condition.Condition> absent();
            culturalContexts = com.google.common.base.Optional.<org.dressdiscover.api.models.cultural_context.CulturalContextSet> absent();
            dates = com.google.common.base.Optional.<org.dressdiscover.api.models.date.DateSet> absent();
            descriptions = com.google.common.base.Optional.<org.dressdiscover.api.models.description.DescriptionSet> absent();
            gender = com.google.common.base.Optional.<org.dressdiscover.api.models.gender.Gender> absent();
            hidden = com.google.common.base.Optional.<Boolean> absent();
            images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
            inscriptions = com.google.common.base.Optional.<org.dressdiscover.api.models.inscription.InscriptionSet> absent();
            locations = com.google.common.base.Optional.<org.dressdiscover.api.models.location.LocationSet> absent();
            materials = com.google.common.base.Optional.<org.dressdiscover.api.models.material.MaterialSet> absent();
            measurements = com.google.common.base.Optional.<org.dressdiscover.api.models.measurements.MeasurementsSet> absent();
            provenance = com.google.common.base.Optional.<String> absent();
            quantity = com.google.common.base.Optional.<com.google.common.primitives.UnsignedInteger> absent();
            relations = com.google.common.base.Optional.<org.dressdiscover.api.models.relation.RelationSet> absent();
            rights = com.google.common.base.Optional.<org.dressdiscover.api.models.rights.RightsSet> absent();
            structures = com.google.common.base.Optional.<org.dressdiscover.api.models.structure.StructureSet> absent();
            subjects = com.google.common.base.Optional.<org.dressdiscover.api.models.subject.SubjectSet> absent();
            techniques = com.google.common.base.Optional.<org.dressdiscover.api.models.technique.TechniqueSet> absent();
            textrefs = com.google.common.base.Optional.<org.dressdiscover.api.models.textref.TextrefSet> absent();
            viewType = com.google.common.base.Optional.<org.dressdiscover.api.models.view_type.ViewType> absent();
            workTypes = com.google.common.base.Optional.<org.dressdiscover.api.models.work_type.WorkTypeSet> absent();
        }

        public Builder(final Object other) {
            this.collectionId = other.getCollectionId();
            this.institutionId = other.getInstitutionId();
            this.titles = other.getTitles();
            this.agents = other.getAgents();
            this.categories = other.getCategories();
            this.closures = other.getClosures();
            this.colors = other.getColors();
            this.components = other.getComponents();
            this.condition = other.getCondition();
            this.culturalContexts = other.getCulturalContexts();
            this.dates = other.getDates();
            this.descriptions = other.getDescriptions();
            this.gender = other.getGender();
            this.hidden = other.getHidden();
            this.images = other.getImages();
            this.inscriptions = other.getInscriptions();
            this.locations = other.getLocations();
            this.materials = other.getMaterials();
            this.measurements = other.getMeasurements();
            this.provenance = other.getProvenance();
            this.quantity = other.getQuantity();
            this.relations = other.getRelations();
            this.rights = other.getRights();
            this.structures = other.getStructures();
            this.subjects = other.getSubjects();
            this.techniques = other.getTechniques();
            this.textrefs = other.getTextrefs();
            this.viewType = other.getViewType();
            this.workTypes = other.getWorkTypes();
        }

        protected Object _build(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.title.TitleSet titles, final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures, final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors, final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components, final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition, final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts, final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates, final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions, final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions, final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations, final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials, final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements, final com.google.common.base.Optional<String> provenance, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity, final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations, final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights, final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures, final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects, final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques, final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs, final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType, final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes) {
            return new Object(collectionId, institutionId, titles, agents, categories, closures, colors, components, condition, culturalContexts, dates, descriptions, gender, hidden, images, inscriptions, locations, materials, measurements, provenance, quantity, relations, rights, structures, subjects, techniques, textrefs, viewType, workTypes, DefaultConstructionValidator.getInstance());
        }

        public Object build() {
            return _build(collectionId, institutionId, titles, agents, categories, closures, colors, components, condition, culturalContexts, dates, descriptions, gender, hidden, images, inscriptions, locations, materials, measurements, provenance, quantity, relations, rights, structures, subjects, techniques, textrefs, viewType, workTypes);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> getAgents() {
            return agents;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCategories() {
            return categories;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> getClosures() {
            return closures;
        }

        public final org.dressdiscover.api.models.collection.CollectionId getCollectionId() {
            return collectionId;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> getColors() {
            return colors;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> getComponents() {
            return components;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> getCondition() {
            return condition;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> getCulturalContexts() {
            return culturalContexts;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> getDates() {
            return dates;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> getDescriptions() {
            return descriptions;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> getGender() {
            return gender;
        }

        public final com.google.common.base.Optional<Boolean> getHidden() {
            return hidden;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> getImages() {
            return images;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> getInscriptions() {
            return inscriptions;
        }

        public final org.dressdiscover.api.models.institution.InstitutionId getInstitutionId() {
            return institutionId;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> getLocations() {
            return locations;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> getMaterials() {
            return materials;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> getMeasurements() {
            return measurements;
        }

        /**
         * Dublin Core freetext provenance
         */
        public final com.google.common.base.Optional<String> getProvenance() {
            return provenance;
        }

        public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getQuantity() {
            return quantity;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> getRelations() {
            return relations;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> getRights() {
            return rights;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> getStructures() {
            return structures;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> getSubjects() {
            return subjects;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> getTechniques() {
            return techniques;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> getTextrefs() {
            return textrefs;
        }

        public final org.dressdiscover.api.models.title.TitleSet getTitles() {
            return titles;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> getViewType() {
            return viewType;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> getWorkTypes() {
            return workTypes;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot, unknownFieldCallback);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                try {
                    collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                }
                try {
                    institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                }
                titles = org.dressdiscover.api.models.title.TitleSet.readAsStruct(iprot);
                if (__list.getSize() > 3) {
                    agents = com.google.common.base.Optional.of(org.dressdiscover.api.models.agent.AgentSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 4) {
                    try {
                        categories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                    }
                }
                if (__list.getSize() > 5) {
                    closures = com.google.common.base.Optional.of(org.dressdiscover.api.models.closure.ClosureSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 6) {
                    colors = com.google.common.base.Optional.of(org.dressdiscover.api.models.color.ColorSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 7) {
                    components = com.google.common.base.Optional.of(org.dressdiscover.api.models.component.ComponentSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 8) {
                    condition = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.condition.Condition.class));
                }
                if (__list.getSize() > 9) {
                    culturalContexts = com.google.common.base.Optional.of(org.dressdiscover.api.models.cultural_context.CulturalContextSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 10) {
                    dates = com.google.common.base.Optional.of(org.dressdiscover.api.models.date.DateSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 11) {
                    descriptions = com.google.common.base.Optional.of(org.dressdiscover.api.models.description.DescriptionSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 12) {
                    gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                }
                if (__list.getSize() > 13) {
                    hidden = com.google.common.base.Optional.of(iprot.readBool());
                }
                if (__list.getSize() > 14) {
                    try {
                        images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.image.Image.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, e.getCause());
                    }
                }
                if (__list.getSize() > 15) {
                    inscriptions = com.google.common.base.Optional.of(org.dressdiscover.api.models.inscription.InscriptionSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 16) {
                    locations = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 17) {
                    materials = com.google.common.base.Optional.of(org.dressdiscover.api.models.material.MaterialSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 18) {
                    measurements = com.google.common.base.Optional.of(org.dressdiscover.api.models.measurements.MeasurementsSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 19) {
                    provenance = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 20) {
                    try {
                        quantity = com.google.common.base.Optional.of(iprot.readU32());
                    } catch (final NumberFormatException e) {
                    }
                }
                if (__list.getSize() > 21) {
                    relations = com.google.common.base.Optional.of(org.dressdiscover.api.models.relation.RelationSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 22) {
                    rights = com.google.common.base.Optional.of(org.dressdiscover.api.models.rights.RightsSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 23) {
                    structures = com.google.common.base.Optional.of(org.dressdiscover.api.models.structure.StructureSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 24) {
                    subjects = com.google.common.base.Optional.of(org.dressdiscover.api.models.subject.SubjectSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 25) {
                    techniques = com.google.common.base.Optional.of(org.dressdiscover.api.models.technique.TechniqueSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 26) {
                    textrefs = com.google.common.base.Optional.of(org.dressdiscover.api.models.textref.TextrefSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 27) {
                    viewType = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.view_type.ViewType.class));
                }
                if (__list.getSize() > 28) {
                    workTypes = com.google.common.base.Optional.of(org.dressdiscover.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
                }
                iprot.readListEnd();
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "collection_id": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            try {
                                collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                            } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                            }
                        }
                        break;
                    }
                    case "institution_id": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            try {
                                institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                            } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                            }
                        }
                        break;
                    }
                    case "titles": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            titles = org.dressdiscover.api.models.title.TitleSet.readAsStruct(iprot);
                        }
                        break;
                    }
                    case "agents": {
                        if (!ifield.hasId() || ifield.getId() == 20) {
                            agents = com.google.common.base.Optional.of(org.dressdiscover.api.models.agent.AgentSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "categories": {
                        if (!ifield.hasId() || ifield.getId() == 18) {
                            try {
                                categories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(iprot.readString());
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "closures": {
                        if (!ifield.hasId() || ifield.getId() == 34) {
                            closures = com.google.common.base.Optional.of(org.dressdiscover.api.models.closure.ClosureSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "colors": {
                        if (!ifield.hasId() || ifield.getId() == 30) {
                            colors = com.google.common.base.Optional.of(org.dressdiscover.api.models.color.ColorSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "components": {
                        if (!ifield.hasId() || ifield.getId() == 32) {
                            components = com.google.common.base.Optional.of(org.dressdiscover.api.models.component.ComponentSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "condition": {
                        if (!ifield.hasId() || ifield.getId() == 27) {
                            condition = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.condition.Condition.class));
                        }
                        break;
                    }
                    case "cultural_contexts": {
                        if (!ifield.hasId() || ifield.getId() == 35) {
                            culturalContexts = com.google.common.base.Optional.of(org.dressdiscover.api.models.cultural_context.CulturalContextSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "dates": {
                        if (!ifield.hasId() || ifield.getId() == 10) {
                            dates = com.google.common.base.Optional.of(org.dressdiscover.api.models.date.DateSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "descriptions": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            descriptions = com.google.common.base.Optional.of(org.dressdiscover.api.models.description.DescriptionSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "gender": {
                        if (!ifield.hasId() || ifield.getId() == 25) {
                            gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                        }
                        break;
                    }
                    case "hidden": {
                        if (!ifield.hasId() || ifield.getId() == 37) {
                            hidden = com.google.common.base.Optional.of(iprot.readBool());
                        }
                        break;
                    }
                    case "images": {
                        if (!ifield.hasId() || ifield.getId() == 23) {
                            try {
                                images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.models.image.Image.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "inscriptions": {
                        if (!ifield.hasId() || ifield.getId() == 17) {
                            inscriptions = com.google.common.base.Optional.of(org.dressdiscover.api.models.inscription.InscriptionSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "locations": {
                        if (!ifield.hasId() || ifield.getId() == 36) {
                            locations = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "materials": {
                        if (!ifield.hasId() || ifield.getId() == 15) {
                            materials = com.google.common.base.Optional.of(org.dressdiscover.api.models.material.MaterialSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "measurements": {
                        if (!ifield.hasId() || ifield.getId() == 31) {
                            measurements = com.google.common.base.Optional.of(org.dressdiscover.api.models.measurements.MeasurementsSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "provenance": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            provenance = com.google.common.base.Optional.of(iprot.readString());
                        }
                        break;
                    }
                    case "quantity": {
                        if (!ifield.hasId() || ifield.getId() == 26) {
                            try {
                                quantity = com.google.common.base.Optional.of(iprot.readU32());
                            } catch (final NumberFormatException e) {
                            }
                        }
                        break;
                    }
                    case "relations": {
                        if (!ifield.hasId() || ifield.getId() == 29) {
                            relations = com.google.common.base.Optional.of(org.dressdiscover.api.models.relation.RelationSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "rights": {
                        if (!ifield.hasId() || ifield.getId() == 22) {
                            rights = com.google.common.base.Optional.of(org.dressdiscover.api.models.rights.RightsSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "structures": {
                        if (!ifield.hasId() || ifield.getId() == 33) {
                            structures = com.google.common.base.Optional.of(org.dressdiscover.api.models.structure.StructureSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "subjects": {
                        if (!ifield.hasId() || ifield.getId() == 21) {
                            subjects = com.google.common.base.Optional.of(org.dressdiscover.api.models.subject.SubjectSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "techniques": {
                        if (!ifield.hasId() || ifield.getId() == 16) {
                            techniques = com.google.common.base.Optional.of(org.dressdiscover.api.models.technique.TechniqueSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "textrefs": {
                        if (!ifield.hasId() || ifield.getId() == 9) {
                            textrefs = com.google.common.base.Optional.of(org.dressdiscover.api.models.textref.TextrefSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "view_type": {
                        if (!ifield.hasId() || ifield.getId() == 28) {
                            viewType = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.view_type.ViewType.class));
                        }
                        break;
                    }
                    case "work_types": {
                        if (!ifield.hasId() || ifield.getId() == 24) {
                            workTypes = com.google.common.base.Optional.of(org.dressdiscover.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    default:
                        if (unknownFieldCallback.isPresent()) {
                            unknownFieldCallback.get().apply(ifield);
                        }
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
            return this;
        }

        public Builder set(final String fieldThriftName, @javax.annotation.Nullable final java.lang.Object value) {
            return set(FieldMetadata.valueOfThriftName(fieldThriftName), value);
        }

        public Builder set(final org.thryft.Struct.FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            if (!(fieldMetadata instanceof FieldMetadata)) {
                throw new IllegalArgumentException();
            }
            return set((FieldMetadata)fieldMetadata, value);
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case COLLECTION_ID: setCollectionId((org.dressdiscover.api.models.collection.CollectionId)value); return this;
            case INSTITUTION_ID: setInstitutionId((org.dressdiscover.api.models.institution.InstitutionId)value); return this;
            case TITLES: setTitles((org.dressdiscover.api.models.title.TitleSet)value); return this;
            case AGENTS: setAgents((org.dressdiscover.api.models.agent.AgentSet)value); return this;
            case CATEGORIES: setCategories((com.google.common.collect.ImmutableList<String>)value); return this;
            case CLOSURES: setClosures((org.dressdiscover.api.models.closure.ClosureSet)value); return this;
            case COLORS: setColors((org.dressdiscover.api.models.color.ColorSet)value); return this;
            case COMPONENTS: setComponents((org.dressdiscover.api.models.component.ComponentSet)value); return this;
            case CONDITION: setCondition((org.dressdiscover.api.models.condition.Condition)value); return this;
            case CULTURAL_CONTEXTS: setCulturalContexts((org.dressdiscover.api.models.cultural_context.CulturalContextSet)value); return this;
            case DATES: setDates((org.dressdiscover.api.models.date.DateSet)value); return this;
            case DESCRIPTIONS: setDescriptions((org.dressdiscover.api.models.description.DescriptionSet)value); return this;
            case GENDER: setGender((org.dressdiscover.api.models.gender.Gender)value); return this;
            case HIDDEN: setHidden((Boolean)value); return this;
            case IMAGES: setImages((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>)value); return this;
            case INSCRIPTIONS: setInscriptions((org.dressdiscover.api.models.inscription.InscriptionSet)value); return this;
            case LOCATIONS: setLocations((org.dressdiscover.api.models.location.LocationSet)value); return this;
            case MATERIALS: setMaterials((org.dressdiscover.api.models.material.MaterialSet)value); return this;
            case MEASUREMENTS: setMeasurements((org.dressdiscover.api.models.measurements.MeasurementsSet)value); return this;
            case PROVENANCE: setProvenance((String)value); return this;
            case QUANTITY: setQuantity((com.google.common.primitives.UnsignedInteger)value); return this;
            case RELATIONS: setRelations((org.dressdiscover.api.models.relation.RelationSet)value); return this;
            case RIGHTS: setRights((org.dressdiscover.api.models.rights.RightsSet)value); return this;
            case STRUCTURES: setStructures((org.dressdiscover.api.models.structure.StructureSet)value); return this;
            case SUBJECTS: setSubjects((org.dressdiscover.api.models.subject.SubjectSet)value); return this;
            case TECHNIQUES: setTechniques((org.dressdiscover.api.models.technique.TechniqueSet)value); return this;
            case TEXTREFS: setTextrefs((org.dressdiscover.api.models.textref.TextrefSet)value); return this;
            case VIEW_TYPE: setViewType((org.dressdiscover.api.models.view_type.ViewType)value); return this;
            case WORK_TYPES: setWorkTypes((org.dressdiscover.api.models.work_type.WorkTypeSet)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAgents(final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents) {
            this.agents = DefaultConstructionValidator.getInstance().validateAgents(agents);
            return this;
        }

        public Builder setAgents(@javax.annotation.Nullable final org.dressdiscover.api.models.agent.AgentSet agents) {
            return setAgents(com.google.common.base.Optional.fromNullable(agents));
        }

        public Builder setCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
            this.categories = DefaultConstructionValidator.getInstance().validateCategories(categories);
            return this;
        }

        public Builder setCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> categories) {
            return setCategories(com.google.common.base.Optional.fromNullable(categories));
        }

        public Builder setClosures(final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures) {
            this.closures = DefaultConstructionValidator.getInstance().validateClosures(closures);
            return this;
        }

        public Builder setClosures(@javax.annotation.Nullable final org.dressdiscover.api.models.closure.ClosureSet closures) {
            return setClosures(com.google.common.base.Optional.fromNullable(closures));
        }

        public Builder setCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
            this.collectionId = DefaultConstructionValidator.getInstance().validateCollectionId(collectionId);
            return this;
        }

        public Builder setColors(final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors) {
            this.colors = DefaultConstructionValidator.getInstance().validateColors(colors);
            return this;
        }

        public Builder setColors(@javax.annotation.Nullable final org.dressdiscover.api.models.color.ColorSet colors) {
            return setColors(com.google.common.base.Optional.fromNullable(colors));
        }

        public Builder setComponents(final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components) {
            this.components = DefaultConstructionValidator.getInstance().validateComponents(components);
            return this;
        }

        public Builder setComponents(@javax.annotation.Nullable final org.dressdiscover.api.models.component.ComponentSet components) {
            return setComponents(com.google.common.base.Optional.fromNullable(components));
        }

        public Builder setCondition(final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition) {
            this.condition = DefaultConstructionValidator.getInstance().validateCondition(condition);
            return this;
        }

        public Builder setCondition(@javax.annotation.Nullable final org.dressdiscover.api.models.condition.Condition condition) {
            return setCondition(com.google.common.base.Optional.fromNullable(condition));
        }

        public Builder setCulturalContexts(final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts) {
            this.culturalContexts = DefaultConstructionValidator.getInstance().validateCulturalContexts(culturalContexts);
            return this;
        }

        public Builder setCulturalContexts(@javax.annotation.Nullable final org.dressdiscover.api.models.cultural_context.CulturalContextSet culturalContexts) {
            return setCulturalContexts(com.google.common.base.Optional.fromNullable(culturalContexts));
        }

        public Builder setDates(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates) {
            this.dates = DefaultConstructionValidator.getInstance().validateDates(dates);
            return this;
        }

        public Builder setDates(@javax.annotation.Nullable final org.dressdiscover.api.models.date.DateSet dates) {
            return setDates(com.google.common.base.Optional.fromNullable(dates));
        }

        public Builder setDescriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions) {
            this.descriptions = DefaultConstructionValidator.getInstance().validateDescriptions(descriptions);
            return this;
        }

        public Builder setDescriptions(@javax.annotation.Nullable final org.dressdiscover.api.models.description.DescriptionSet descriptions) {
            return setDescriptions(com.google.common.base.Optional.fromNullable(descriptions));
        }

        public Builder setGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) {
            this.gender = DefaultConstructionValidator.getInstance().validateGender(gender);
            return this;
        }

        public Builder setGender(@javax.annotation.Nullable final org.dressdiscover.api.models.gender.Gender gender) {
            return setGender(com.google.common.base.Optional.fromNullable(gender));
        }

        public Builder setHidden(final com.google.common.base.Optional<Boolean> hidden) {
            this.hidden = DefaultConstructionValidator.getInstance().validateHidden(hidden);
            return this;
        }

        public Builder setHidden(@javax.annotation.Nullable final Boolean hidden) {
            return setHidden(com.google.common.base.Optional.fromNullable(hidden));
        }

        public Builder setIfPresent(final Object other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCollectionId(other.getCollectionId());
            setInstitutionId(other.getInstitutionId());
            setTitles(other.getTitles());
            if (other.getAgents().isPresent()) {
                setAgents(other.getAgents());
            }
            if (other.getCategories().isPresent()) {
                setCategories(other.getCategories());
            }
            if (other.getClosures().isPresent()) {
                setClosures(other.getClosures());
            }
            if (other.getColors().isPresent()) {
                setColors(other.getColors());
            }
            if (other.getComponents().isPresent()) {
                setComponents(other.getComponents());
            }
            if (other.getCondition().isPresent()) {
                setCondition(other.getCondition());
            }
            if (other.getCulturalContexts().isPresent()) {
                setCulturalContexts(other.getCulturalContexts());
            }
            if (other.getDates().isPresent()) {
                setDates(other.getDates());
            }
            if (other.getDescriptions().isPresent()) {
                setDescriptions(other.getDescriptions());
            }
            if (other.getGender().isPresent()) {
                setGender(other.getGender());
            }
            if (other.getHidden().isPresent()) {
                setHidden(other.getHidden());
            }
            if (other.getImages().isPresent()) {
                setImages(other.getImages());
            }
            if (other.getInscriptions().isPresent()) {
                setInscriptions(other.getInscriptions());
            }
            if (other.getLocations().isPresent()) {
                setLocations(other.getLocations());
            }
            if (other.getMaterials().isPresent()) {
                setMaterials(other.getMaterials());
            }
            if (other.getMeasurements().isPresent()) {
                setMeasurements(other.getMeasurements());
            }
            if (other.getProvenance().isPresent()) {
                setProvenance(other.getProvenance());
            }
            if (other.getQuantity().isPresent()) {
                setQuantity(other.getQuantity());
            }
            if (other.getRelations().isPresent()) {
                setRelations(other.getRelations());
            }
            if (other.getRights().isPresent()) {
                setRights(other.getRights());
            }
            if (other.getStructures().isPresent()) {
                setStructures(other.getStructures());
            }
            if (other.getSubjects().isPresent()) {
                setSubjects(other.getSubjects());
            }
            if (other.getTechniques().isPresent()) {
                setTechniques(other.getTechniques());
            }
            if (other.getTextrefs().isPresent()) {
                setTextrefs(other.getTextrefs());
            }
            if (other.getViewType().isPresent()) {
                setViewType(other.getViewType());
            }
            if (other.getWorkTypes().isPresent()) {
                setWorkTypes(other.getWorkTypes());
            }

            return this;
        }

        public Builder setImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
            this.images = DefaultConstructionValidator.getInstance().validateImages(images);
            return this;
        }

        public Builder setImages(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> images) {
            return setImages(com.google.common.base.Optional.fromNullable(images));
        }

        public Builder setInscriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions) {
            this.inscriptions = DefaultConstructionValidator.getInstance().validateInscriptions(inscriptions);
            return this;
        }

        public Builder setInscriptions(@javax.annotation.Nullable final org.dressdiscover.api.models.inscription.InscriptionSet inscriptions) {
            return setInscriptions(com.google.common.base.Optional.fromNullable(inscriptions));
        }

        public Builder setInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
            this.institutionId = DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId);
            return this;
        }

        public Builder setLocations(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations) {
            this.locations = DefaultConstructionValidator.getInstance().validateLocations(locations);
            return this;
        }

        public Builder setLocations(@javax.annotation.Nullable final org.dressdiscover.api.models.location.LocationSet locations) {
            return setLocations(com.google.common.base.Optional.fromNullable(locations));
        }

        public Builder setMaterials(final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials) {
            this.materials = DefaultConstructionValidator.getInstance().validateMaterials(materials);
            return this;
        }

        public Builder setMaterials(@javax.annotation.Nullable final org.dressdiscover.api.models.material.MaterialSet materials) {
            return setMaterials(com.google.common.base.Optional.fromNullable(materials));
        }

        public Builder setMeasurements(final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements) {
            this.measurements = DefaultConstructionValidator.getInstance().validateMeasurements(measurements);
            return this;
        }

        public Builder setMeasurements(@javax.annotation.Nullable final org.dressdiscover.api.models.measurements.MeasurementsSet measurements) {
            return setMeasurements(com.google.common.base.Optional.fromNullable(measurements));
        }

        public Builder setProvenance(final com.google.common.base.Optional<String> provenance) {
            this.provenance = DefaultConstructionValidator.getInstance().validateProvenance(provenance);
            return this;
        }

        public Builder setProvenance(@javax.annotation.Nullable final String provenance) {
            return setProvenance(com.google.common.base.Optional.fromNullable(provenance));
        }

        public Builder setQuantity(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity) {
            this.quantity = DefaultConstructionValidator.getInstance().validateQuantity(quantity);
            return this;
        }

        public Builder setQuantity(@javax.annotation.Nullable final com.google.common.primitives.UnsignedInteger quantity) {
            return setQuantity(com.google.common.base.Optional.fromNullable(quantity));
        }

        public Builder setRelations(final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations) {
            this.relations = DefaultConstructionValidator.getInstance().validateRelations(relations);
            return this;
        }

        public Builder setRelations(@javax.annotation.Nullable final org.dressdiscover.api.models.relation.RelationSet relations) {
            return setRelations(com.google.common.base.Optional.fromNullable(relations));
        }

        public Builder setRights(final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights) {
            this.rights = DefaultConstructionValidator.getInstance().validateRights(rights);
            return this;
        }

        public Builder setRights(@javax.annotation.Nullable final org.dressdiscover.api.models.rights.RightsSet rights) {
            return setRights(com.google.common.base.Optional.fromNullable(rights));
        }

        public Builder setStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) {
            this.structures = DefaultConstructionValidator.getInstance().validateStructures(structures);
            return this;
        }

        public Builder setStructures(@javax.annotation.Nullable final org.dressdiscover.api.models.structure.StructureSet structures) {
            return setStructures(com.google.common.base.Optional.fromNullable(structures));
        }

        public Builder setSubjects(final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects) {
            this.subjects = DefaultConstructionValidator.getInstance().validateSubjects(subjects);
            return this;
        }

        public Builder setSubjects(@javax.annotation.Nullable final org.dressdiscover.api.models.subject.SubjectSet subjects) {
            return setSubjects(com.google.common.base.Optional.fromNullable(subjects));
        }

        public Builder setTechniques(final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques) {
            this.techniques = DefaultConstructionValidator.getInstance().validateTechniques(techniques);
            return this;
        }

        public Builder setTechniques(@javax.annotation.Nullable final org.dressdiscover.api.models.technique.TechniqueSet techniques) {
            return setTechniques(com.google.common.base.Optional.fromNullable(techniques));
        }

        public Builder setTextrefs(final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs) {
            this.textrefs = DefaultConstructionValidator.getInstance().validateTextrefs(textrefs);
            return this;
        }

        public Builder setTextrefs(@javax.annotation.Nullable final org.dressdiscover.api.models.textref.TextrefSet textrefs) {
            return setTextrefs(com.google.common.base.Optional.fromNullable(textrefs));
        }

        public Builder setTitles(final org.dressdiscover.api.models.title.TitleSet titles) {
            this.titles = DefaultConstructionValidator.getInstance().validateTitles(titles);
            return this;
        }

        public Builder setViewType(final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType) {
            this.viewType = DefaultConstructionValidator.getInstance().validateViewType(viewType);
            return this;
        }

        public Builder setViewType(@javax.annotation.Nullable final org.dressdiscover.api.models.view_type.ViewType viewType) {
            return setViewType(com.google.common.base.Optional.fromNullable(viewType));
        }

        public Builder setWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes) {
            this.workTypes = DefaultConstructionValidator.getInstance().validateWorkTypes(workTypes);
            return this;
        }

        public Builder setWorkTypes(@javax.annotation.Nullable final org.dressdiscover.api.models.work_type.WorkTypeSet workTypes) {
            return setWorkTypes(com.google.common.base.Optional.fromNullable(workTypes));
        }

        public Builder unset(final String fieldThriftName) {
            return unset(FieldMetadata.valueOfThriftName(fieldThriftName));
        }

        public Builder unset(final org.thryft.Struct.FieldMetadata fieldMetadata) {
            if (!(fieldMetadata instanceof FieldMetadata)) {
                throw new IllegalArgumentException();
            }
            return unset((FieldMetadata)fieldMetadata);
        }

        public Builder unset(final FieldMetadata fieldMetadata) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case COLLECTION_ID: return unsetCollectionId();
            case INSTITUTION_ID: return unsetInstitutionId();
            case TITLES: return unsetTitles();
            case AGENTS: return unsetAgents();
            case CATEGORIES: return unsetCategories();
            case CLOSURES: return unsetClosures();
            case COLORS: return unsetColors();
            case COMPONENTS: return unsetComponents();
            case CONDITION: return unsetCondition();
            case CULTURAL_CONTEXTS: return unsetCulturalContexts();
            case DATES: return unsetDates();
            case DESCRIPTIONS: return unsetDescriptions();
            case GENDER: return unsetGender();
            case HIDDEN: return unsetHidden();
            case IMAGES: return unsetImages();
            case INSCRIPTIONS: return unsetInscriptions();
            case LOCATIONS: return unsetLocations();
            case MATERIALS: return unsetMaterials();
            case MEASUREMENTS: return unsetMeasurements();
            case PROVENANCE: return unsetProvenance();
            case QUANTITY: return unsetQuantity();
            case RELATIONS: return unsetRelations();
            case RIGHTS: return unsetRights();
            case STRUCTURES: return unsetStructures();
            case SUBJECTS: return unsetSubjects();
            case TECHNIQUES: return unsetTechniques();
            case TEXTREFS: return unsetTextrefs();
            case VIEW_TYPE: return unsetViewType();
            case WORK_TYPES: return unsetWorkTypes();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAgents() {
            this.agents = com.google.common.base.Optional.<org.dressdiscover.api.models.agent.AgentSet> absent();
            return this;
        }

        public Builder unsetCategories() {
            this.categories = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetClosures() {
            this.closures = com.google.common.base.Optional.<org.dressdiscover.api.models.closure.ClosureSet> absent();
            return this;
        }

        public Builder unsetCollectionId() {
            this.collectionId = null;
            return this;
        }

        public Builder unsetColors() {
            this.colors = com.google.common.base.Optional.<org.dressdiscover.api.models.color.ColorSet> absent();
            return this;
        }

        public Builder unsetComponents() {
            this.components = com.google.common.base.Optional.<org.dressdiscover.api.models.component.ComponentSet> absent();
            return this;
        }

        public Builder unsetCondition() {
            this.condition = com.google.common.base.Optional.<org.dressdiscover.api.models.condition.Condition> absent();
            return this;
        }

        public Builder unsetCulturalContexts() {
            this.culturalContexts = com.google.common.base.Optional.<org.dressdiscover.api.models.cultural_context.CulturalContextSet> absent();
            return this;
        }

        public Builder unsetDates() {
            this.dates = com.google.common.base.Optional.<org.dressdiscover.api.models.date.DateSet> absent();
            return this;
        }

        public Builder unsetDescriptions() {
            this.descriptions = com.google.common.base.Optional.<org.dressdiscover.api.models.description.DescriptionSet> absent();
            return this;
        }

        public Builder unsetGender() {
            this.gender = com.google.common.base.Optional.<org.dressdiscover.api.models.gender.Gender> absent();
            return this;
        }

        public Builder unsetHidden() {
            this.hidden = com.google.common.base.Optional.<Boolean> absent();
            return this;
        }

        public Builder unsetImages() {
            this.images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
            return this;
        }

        public Builder unsetInscriptions() {
            this.inscriptions = com.google.common.base.Optional.<org.dressdiscover.api.models.inscription.InscriptionSet> absent();
            return this;
        }

        public Builder unsetInstitutionId() {
            this.institutionId = null;
            return this;
        }

        public Builder unsetLocations() {
            this.locations = com.google.common.base.Optional.<org.dressdiscover.api.models.location.LocationSet> absent();
            return this;
        }

        public Builder unsetMaterials() {
            this.materials = com.google.common.base.Optional.<org.dressdiscover.api.models.material.MaterialSet> absent();
            return this;
        }

        public Builder unsetMeasurements() {
            this.measurements = com.google.common.base.Optional.<org.dressdiscover.api.models.measurements.MeasurementsSet> absent();
            return this;
        }

        public Builder unsetProvenance() {
            this.provenance = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetQuantity() {
            this.quantity = com.google.common.base.Optional.<com.google.common.primitives.UnsignedInteger> absent();
            return this;
        }

        public Builder unsetRelations() {
            this.relations = com.google.common.base.Optional.<org.dressdiscover.api.models.relation.RelationSet> absent();
            return this;
        }

        public Builder unsetRights() {
            this.rights = com.google.common.base.Optional.<org.dressdiscover.api.models.rights.RightsSet> absent();
            return this;
        }

        public Builder unsetStructures() {
            this.structures = com.google.common.base.Optional.<org.dressdiscover.api.models.structure.StructureSet> absent();
            return this;
        }

        public Builder unsetSubjects() {
            this.subjects = com.google.common.base.Optional.<org.dressdiscover.api.models.subject.SubjectSet> absent();
            return this;
        }

        public Builder unsetTechniques() {
            this.techniques = com.google.common.base.Optional.<org.dressdiscover.api.models.technique.TechniqueSet> absent();
            return this;
        }

        public Builder unsetTextrefs() {
            this.textrefs = com.google.common.base.Optional.<org.dressdiscover.api.models.textref.TextrefSet> absent();
            return this;
        }

        public Builder unsetTitles() {
            this.titles = null;
            return this;
        }

        public Builder unsetViewType() {
            this.viewType = com.google.common.base.Optional.<org.dressdiscover.api.models.view_type.ViewType> absent();
            return this;
        }

        public Builder unsetWorkTypes() {
            this.workTypes = com.google.common.base.Optional.<org.dressdiscover.api.models.work_type.WorkTypeSet> absent();
            return this;
        }

        private org.dressdiscover.api.models.collection.CollectionId collectionId;
        private org.dressdiscover.api.models.institution.InstitutionId institutionId;
        private org.dressdiscover.api.models.title.TitleSet titles;
        private com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories;
        private com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures;
        private com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors;
        private com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components;
        private com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition;
        private com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts;
        private com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates;
        private com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions;
        private com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender;
        private com.google.common.base.Optional<Boolean> hidden;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images;
        private com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions;
        private com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations;
        private com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials;
        private com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements;
        /**
         * Dublin Core freetext provenance
         */
        private com.google.common.base.Optional<String> provenance;
        private com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity;
        private com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations;
        private com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights;
        private com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures;
        private com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects;
        private com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques;
        private com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs;
        private com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType;
        private com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Object> {
        @Override
        public Object readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Object.readAs(iprot, type);
        }

        @Override
        public Object readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Object.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Object readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Object.readAsList(iprot);
        }

        @Override
        public Object readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Object.readAsStruct(iprot);
        }

        @Override
        public Object readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Object.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.collection.CollectionId>() {}, true, 1, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, true, 2, "institution_id", org.thryft.protocol.Type.STRING),
        TITLES("titles", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.title.TitleSet>() {}, true, 3, "titles", org.thryft.protocol.Type.STRUCT),
        AGENTS("agents", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.agent.AgentSet>() {}, false, 20, "agents", org.thryft.protocol.Type.STRUCT),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 18, "categories", org.thryft.protocol.Type.LIST),
        CLOSURES("closures", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.closure.ClosureSet>() {}, false, 34, "closures", org.thryft.protocol.Type.STRUCT),
        COLORS("colors", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.color.ColorSet>() {}, false, 30, "colors", org.thryft.protocol.Type.STRUCT),
        COMPONENTS("components", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.component.ComponentSet>() {}, false, 32, "components", org.thryft.protocol.Type.STRUCT),
        CONDITION("condition", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.condition.Condition>() {}, false, 27, "condition", org.thryft.protocol.Type.STRING),
        CULTURAL_CONTEXTS("culturalContexts", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.cultural_context.CulturalContextSet>() {}, false, 35, "cultural_contexts", org.thryft.protocol.Type.STRUCT),
        DATES("dates", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.date.DateSet>() {}, false, 10, "dates", org.thryft.protocol.Type.STRUCT),
        DESCRIPTIONS("descriptions", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.description.DescriptionSet>() {}, false, 4, "descriptions", org.thryft.protocol.Type.STRUCT),
        GENDER("gender", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.gender.Gender>() {}, false, 25, "gender", org.thryft.protocol.Type.STRING),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 37, "hidden", org.thryft.protocol.Type.BOOL),
        IMAGES("images", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {}, false, 23, "images", org.thryft.protocol.Type.LIST),
        INSCRIPTIONS("inscriptions", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.inscription.InscriptionSet>() {}, false, 17, "inscriptions", org.thryft.protocol.Type.STRUCT),
        LOCATIONS("locations", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.location.LocationSet>() {}, false, 36, "locations", org.thryft.protocol.Type.STRUCT),
        MATERIALS("materials", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.material.MaterialSet>() {}, false, 15, "materials", org.thryft.protocol.Type.STRUCT),
        MEASUREMENTS("measurements", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.measurements.MeasurementsSet>() {}, false, 31, "measurements", org.thryft.protocol.Type.STRUCT),
        PROVENANCE("provenance", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "provenance", org.thryft.protocol.Type.STRING),
        QUANTITY("quantity", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 26, "quantity", org.thryft.protocol.Type.I32),
        RELATIONS("relations", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.relation.RelationSet>() {}, false, 29, "relations", org.thryft.protocol.Type.STRUCT),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.rights.RightsSet>() {}, false, 22, "rights", org.thryft.protocol.Type.STRUCT),
        STRUCTURES("structures", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.structure.StructureSet>() {}, false, 33, "structures", org.thryft.protocol.Type.STRUCT),
        SUBJECTS("subjects", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.subject.SubjectSet>() {}, false, 21, "subjects", org.thryft.protocol.Type.STRUCT),
        TECHNIQUES("techniques", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.technique.TechniqueSet>() {}, false, 16, "techniques", org.thryft.protocol.Type.STRUCT),
        TEXTREFS("textrefs", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.textref.TextrefSet>() {}, false, 9, "textrefs", org.thryft.protocol.Type.STRUCT),
        VIEW_TYPE("viewType", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.view_type.ViewType>() {}, false, 28, "view_type", org.thryft.protocol.Type.STRING),
        WORK_TYPES("workTypes", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.work_type.WorkTypeSet>() {}, false, 24, "work_types", org.thryft.protocol.Type.STRUCT);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public int getThriftId() {
            return thriftId;
        }

        @Override
        public String getThriftProtocolKey() {
            return thriftProtocolKey;
        }

        @Override
        public org.thryft.protocol.Type getThriftProtocolType() {
            return thriftProtocolType;
        }

        @Override
        public String getThriftName() {
            return thriftName;
        }

        @Override
        public boolean hasThriftId() {
            return thriftId != org.thryft.protocol.FieldBegin.ABSENT_ID;
        }

        @Override
        public boolean isRequired()  {
            return required;
        }

        public static FieldMetadata valueOfJavaName(final String javaName) {
            switch (javaName) {
            case "collectionId": return COLLECTION_ID;
            case "institutionId": return INSTITUTION_ID;
            case "titles": return TITLES;
            case "agents": return AGENTS;
            case "categories": return CATEGORIES;
            case "closures": return CLOSURES;
            case "colors": return COLORS;
            case "components": return COMPONENTS;
            case "condition": return CONDITION;
            case "culturalContexts": return CULTURAL_CONTEXTS;
            case "dates": return DATES;
            case "descriptions": return DESCRIPTIONS;
            case "gender": return GENDER;
            case "hidden": return HIDDEN;
            case "images": return IMAGES;
            case "inscriptions": return INSCRIPTIONS;
            case "locations": return LOCATIONS;
            case "materials": return MATERIALS;
            case "measurements": return MEASUREMENTS;
            case "provenance": return PROVENANCE;
            case "quantity": return QUANTITY;
            case "relations": return RELATIONS;
            case "rights": return RIGHTS;
            case "structures": return STRUCTURES;
            case "subjects": return SUBJECTS;
            case "techniques": return TECHNIQUES;
            case "textrefs": return TEXTREFS;
            case "viewType": return VIEW_TYPE;
            case "workTypes": return WORK_TYPES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "collection_id": return COLLECTION_ID;
            case "institution_id": return INSTITUTION_ID;
            case "titles": return TITLES;
            case "agents": return AGENTS;
            case "categories": return CATEGORIES;
            case "closures": return CLOSURES;
            case "colors": return COLORS;
            case "components": return COMPONENTS;
            case "condition": return CONDITION;
            case "cultural_contexts": return CULTURAL_CONTEXTS;
            case "dates": return DATES;
            case "descriptions": return DESCRIPTIONS;
            case "gender": return GENDER;
            case "hidden": return HIDDEN;
            case "images": return IMAGES;
            case "inscriptions": return INSCRIPTIONS;
            case "locations": return LOCATIONS;
            case "materials": return MATERIALS;
            case "measurements": return MEASUREMENTS;
            case "provenance": return PROVENANCE;
            case "quantity": return QUANTITY;
            case "relations": return RELATIONS;
            case "rights": return RIGHTS;
            case "structures": return STRUCTURES;
            case "subjects": return SUBJECTS;
            case "techniques": return TECHNIQUES;
            case "textrefs": return TEXTREFS;
            case "view_type": return VIEW_TYPE;
            case "work_types": return WORK_TYPES;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final int thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            if (thriftId != org.thryft.protocol.FieldBegin.ABSENT_ID) {
                this.thriftProtocolKey = Integer.toString(thriftId) + ":" + thriftName;
            } else {
                this.thriftProtocolKey = thriftName;
            }
            this.thriftProtocolType = thriftProtocolType;
        }

        private final String javaName;
        private final com.google.common.reflect.TypeToken<?> javaType;
        private final boolean required;
        private final int thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public interface Validator<ExceptionT extends Exception> {
        public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws ExceptionT;

        public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws ExceptionT;

        public org.dressdiscover.api.models.title.TitleSet validateTitles(final org.dressdiscover.api.models.title.TitleSet titles) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> validateAgents(final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> validateClosures(final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> validateColors(final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> validateComponents(final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> validateCondition(final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> validateCulturalContexts(final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> validateDates(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> validateDescriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) throws ExceptionT;

        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> validateInscriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> validateMaterials(final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> validateMeasurements(final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements) throws ExceptionT;

        public com.google.common.base.Optional<String> validateProvenance(final com.google.common.base.Optional<String> provenance) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> validateQuantity(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> validateRelations(final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> validateRights(final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> validateSubjects(final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> validateTechniques(final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> validateTextrefs(final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> validateViewType(final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> validateWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes) throws ExceptionT;
    }

    public interface ConstructionValidator extends Validator<RuntimeException> {
    }

    public static class DefaultConstructionValidator implements ConstructionValidator {
        public static DefaultConstructionValidator getInstance() {
            return instance;
        }

        public DefaultConstructionValidator() {
        }

        @Override
        public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws RuntimeException {
            if (collectionId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: collectionId is null");
            }
            return collectionId;
        }

        @Override
        public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws RuntimeException {
            if (institutionId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: institutionId is null");
            }
            return institutionId;
        }

        @Override
        public org.dressdiscover.api.models.title.TitleSet validateTitles(final org.dressdiscover.api.models.title.TitleSet titles) throws RuntimeException {
            if (titles == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: titles is null");
            }
            return titles;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> validateAgents(final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents) throws RuntimeException {
            if (agents == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: agents is null");
            }
            if (!agents.isPresent()) {
                return agents;
            }
            return agents;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) throws RuntimeException {
            if (categories == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: categories is null");
            }
            if (!categories.isPresent()) {
                return categories;
            }
            if (categories.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.Object: categories is less than min length 1");
            }
            return categories;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> validateClosures(final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures) throws RuntimeException {
            if (closures == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: closures is null");
            }
            if (!closures.isPresent()) {
                return closures;
            }
            return closures;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> validateColors(final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors) throws RuntimeException {
            if (colors == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: colors is null");
            }
            if (!colors.isPresent()) {
                return colors;
            }
            return colors;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> validateComponents(final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components) throws RuntimeException {
            if (components == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: components is null");
            }
            if (!components.isPresent()) {
                return components;
            }
            return components;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> validateCondition(final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition) throws RuntimeException {
            if (condition == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: condition is null");
            }
            if (!condition.isPresent()) {
                return condition;
            }
            return condition;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> validateCulturalContexts(final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts) throws RuntimeException {
            if (culturalContexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: culturalContexts is null");
            }
            if (!culturalContexts.isPresent()) {
                return culturalContexts;
            }
            return culturalContexts;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> validateDates(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates) throws RuntimeException {
            if (dates == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: dates is null");
            }
            if (!dates.isPresent()) {
                return dates;
            }
            return dates;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> validateDescriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions) throws RuntimeException {
            if (descriptions == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: descriptions is null");
            }
            if (!descriptions.isPresent()) {
                return descriptions;
            }
            return descriptions;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) throws RuntimeException {
            if (gender == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: gender is null");
            }
            if (!gender.isPresent()) {
                return gender;
            }
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws RuntimeException {
            if (!hidden.isPresent()) {
                return hidden;
            }
            if (!hidden.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.Object: hidden is not true");
            }
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) throws RuntimeException {
            if (images == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: images is null");
            }
            if (!images.isPresent()) {
                return images;
            }
            if (images.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.Object: images is less than min length 1");
            }
            return images;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> validateInscriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions) throws RuntimeException {
            if (inscriptions == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: inscriptions is null");
            }
            if (!inscriptions.isPresent()) {
                return inscriptions;
            }
            return inscriptions;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations) throws RuntimeException {
            if (locations == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: locations is null");
            }
            if (!locations.isPresent()) {
                return locations;
            }
            return locations;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> validateMaterials(final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials) throws RuntimeException {
            if (materials == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: materials is null");
            }
            if (!materials.isPresent()) {
                return materials;
            }
            return materials;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> validateMeasurements(final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements) throws RuntimeException {
            if (measurements == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: measurements is null");
            }
            if (!measurements.isPresent()) {
                return measurements;
            }
            return measurements;
        }

        @Override
        public com.google.common.base.Optional<String> validateProvenance(final com.google.common.base.Optional<String> provenance) throws RuntimeException {
            if (provenance == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: provenance is null");
            }
            if (!provenance.isPresent()) {
                return provenance;
            }
            if (provenance.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.Object: provenance is less than min length 1");
            }
            return provenance;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> validateQuantity(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity) throws RuntimeException {
            if (quantity == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: quantity is null");
            }
            if (!quantity.isPresent()) {
                return quantity;
            }
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> validateRelations(final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations) throws RuntimeException {
            if (relations == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: relations is null");
            }
            if (!relations.isPresent()) {
                return relations;
            }
            return relations;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> validateRights(final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights) throws RuntimeException {
            if (rights == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: rights is null");
            }
            if (!rights.isPresent()) {
                return rights;
            }
            return rights;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) throws RuntimeException {
            if (structures == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: structures is null");
            }
            if (!structures.isPresent()) {
                return structures;
            }
            return structures;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> validateSubjects(final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects) throws RuntimeException {
            if (subjects == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: subjects is null");
            }
            if (!subjects.isPresent()) {
                return subjects;
            }
            return subjects;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> validateTechniques(final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques) throws RuntimeException {
            if (techniques == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: techniques is null");
            }
            if (!techniques.isPresent()) {
                return techniques;
            }
            return techniques;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> validateTextrefs(final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs) throws RuntimeException {
            if (textrefs == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: textrefs is null");
            }
            if (!textrefs.isPresent()) {
                return textrefs;
            }
            return textrefs;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> validateViewType(final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType) throws RuntimeException {
            if (viewType == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: viewType is null");
            }
            if (!viewType.isPresent()) {
                return viewType;
            }
            return viewType;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> validateWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes) throws RuntimeException {
            if (workTypes == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: workTypes is null");
            }
            if (!workTypes.isPresent()) {
                return workTypes;
            }
            return workTypes;
        }

        private final static DefaultConstructionValidator instance = new DefaultConstructionValidator();
    }

    public static class NopConstructionValidator implements ConstructionValidator {
        public static NopConstructionValidator getInstance() {
            return instance;
        }

        public NopConstructionValidator() {
        }

        @Override
        public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
            return collectionId;
        }

        @Override
        public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
            return institutionId;
        }

        @Override
        public org.dressdiscover.api.models.title.TitleSet validateTitles(final org.dressdiscover.api.models.title.TitleSet titles) {
            return titles;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> validateAgents(final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents) {
            return agents;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
            return categories;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> validateClosures(final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures) {
            return closures;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> validateColors(final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors) {
            return colors;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> validateComponents(final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components) {
            return components;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> validateCondition(final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition) {
            return condition;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> validateCulturalContexts(final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts) {
            return culturalContexts;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> validateDates(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates) {
            return dates;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> validateDescriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions) {
            return descriptions;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) {
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
            return images;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> validateInscriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions) {
            return inscriptions;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations) {
            return locations;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> validateMaterials(final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials) {
            return materials;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> validateMeasurements(final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements) {
            return measurements;
        }

        @Override
        public com.google.common.base.Optional<String> validateProvenance(final com.google.common.base.Optional<String> provenance) {
            return provenance;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> validateQuantity(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity) {
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> validateRelations(final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations) {
            return relations;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> validateRights(final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights) {
            return rights;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) {
            return structures;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> validateSubjects(final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects) {
            return subjects;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> validateTechniques(final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques) {
            return techniques;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> validateTextrefs(final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs) {
            return textrefs;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> validateViewType(final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType) {
            return viewType;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> validateWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes) {
            return workTypes;
        }

        private final static NopConstructionValidator instance = new NopConstructionValidator();
    }

    public interface ReadValidator extends Validator<org.thryft.protocol.InputProtocolException> {
    }

    public static class DefaultReadValidator implements ReadValidator {
        public static DefaultReadValidator getInstance() {
            return instance;
        }

        public DefaultReadValidator() {
        }

        @Override
        public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.thryft.protocol.InputProtocolException {
            if (collectionId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLLECTION_ID, "org.dressdiscover.api.models.object.Object: collectionId is null");
            }
            return collectionId;
        }

        @Override
        public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.thryft.protocol.InputProtocolException {
            if (institutionId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, "org.dressdiscover.api.models.object.Object: institutionId is null");
            }
            return institutionId;
        }

        @Override
        public org.dressdiscover.api.models.title.TitleSet validateTitles(final org.dressdiscover.api.models.title.TitleSet titles) throws org.thryft.protocol.InputProtocolException {
            if (titles == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TITLES, "org.dressdiscover.api.models.object.Object: titles is null");
            }
            return titles;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> validateAgents(final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents) throws org.thryft.protocol.InputProtocolException {
            if (agents == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.AGENTS, "org.dressdiscover.api.models.object.Object: agents is null");
            }
            if (!agents.isPresent()) {
                return agents;
            }
            return agents;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) throws org.thryft.protocol.InputProtocolException {
            if (categories == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CATEGORIES, "org.dressdiscover.api.models.object.Object: categories is null");
            }
            if (!categories.isPresent()) {
                return categories;
            }
            if (categories.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, "org.dressdiscover.api.models.object.Object: categories is less than min length 1");
            }
            return categories;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> validateClosures(final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures) throws org.thryft.protocol.InputProtocolException {
            if (closures == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CLOSURES, "org.dressdiscover.api.models.object.Object: closures is null");
            }
            if (!closures.isPresent()) {
                return closures;
            }
            return closures;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> validateColors(final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors) throws org.thryft.protocol.InputProtocolException {
            if (colors == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLORS, "org.dressdiscover.api.models.object.Object: colors is null");
            }
            if (!colors.isPresent()) {
                return colors;
            }
            return colors;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> validateComponents(final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components) throws org.thryft.protocol.InputProtocolException {
            if (components == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COMPONENTS, "org.dressdiscover.api.models.object.Object: components is null");
            }
            if (!components.isPresent()) {
                return components;
            }
            return components;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> validateCondition(final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition) throws org.thryft.protocol.InputProtocolException {
            if (condition == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CONDITION, "org.dressdiscover.api.models.object.Object: condition is null");
            }
            if (!condition.isPresent()) {
                return condition;
            }
            return condition;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> validateCulturalContexts(final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts) throws org.thryft.protocol.InputProtocolException {
            if (culturalContexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXTS, "org.dressdiscover.api.models.object.Object: culturalContexts is null");
            }
            if (!culturalContexts.isPresent()) {
                return culturalContexts;
            }
            return culturalContexts;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> validateDates(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates) throws org.thryft.protocol.InputProtocolException {
            if (dates == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DATES, "org.dressdiscover.api.models.object.Object: dates is null");
            }
            if (!dates.isPresent()) {
                return dates;
            }
            return dates;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> validateDescriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions) throws org.thryft.protocol.InputProtocolException {
            if (descriptions == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DESCRIPTIONS, "org.dressdiscover.api.models.object.Object: descriptions is null");
            }
            if (!descriptions.isPresent()) {
                return descriptions;
            }
            return descriptions;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) throws org.thryft.protocol.InputProtocolException {
            if (gender == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GENDER, "org.dressdiscover.api.models.object.Object: gender is null");
            }
            if (!gender.isPresent()) {
                return gender;
            }
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws org.thryft.protocol.InputProtocolException {
            if (!hidden.isPresent()) {
                return hidden;
            }
            if (!hidden.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HIDDEN, "org.dressdiscover.api.models.object.Object: hidden is not true");
            }
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) throws org.thryft.protocol.InputProtocolException {
            if (images == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IMAGES, "org.dressdiscover.api.models.object.Object: images is null");
            }
            if (!images.isPresent()) {
                return images;
            }
            if (images.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, "org.dressdiscover.api.models.object.Object: images is less than min length 1");
            }
            return images;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> validateInscriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions) throws org.thryft.protocol.InputProtocolException {
            if (inscriptions == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSCRIPTIONS, "org.dressdiscover.api.models.object.Object: inscriptions is null");
            }
            if (!inscriptions.isPresent()) {
                return inscriptions;
            }
            return inscriptions;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations) throws org.thryft.protocol.InputProtocolException {
            if (locations == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LOCATIONS, "org.dressdiscover.api.models.object.Object: locations is null");
            }
            if (!locations.isPresent()) {
                return locations;
            }
            return locations;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> validateMaterials(final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials) throws org.thryft.protocol.InputProtocolException {
            if (materials == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MATERIALS, "org.dressdiscover.api.models.object.Object: materials is null");
            }
            if (!materials.isPresent()) {
                return materials;
            }
            return materials;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> validateMeasurements(final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements) throws org.thryft.protocol.InputProtocolException {
            if (measurements == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MEASUREMENTS, "org.dressdiscover.api.models.object.Object: measurements is null");
            }
            if (!measurements.isPresent()) {
                return measurements;
            }
            return measurements;
        }

        @Override
        public com.google.common.base.Optional<String> validateProvenance(final com.google.common.base.Optional<String> provenance) throws org.thryft.protocol.InputProtocolException {
            if (provenance == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PROVENANCE, "org.dressdiscover.api.models.object.Object: provenance is null");
            }
            if (!provenance.isPresent()) {
                return provenance;
            }
            if (provenance.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCE, "org.dressdiscover.api.models.object.Object: provenance is less than min length 1");
            }
            return provenance;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> validateQuantity(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity) throws org.thryft.protocol.InputProtocolException {
            if (quantity == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUANTITY, "org.dressdiscover.api.models.object.Object: quantity is null");
            }
            if (!quantity.isPresent()) {
                return quantity;
            }
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> validateRelations(final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations) throws org.thryft.protocol.InputProtocolException {
            if (relations == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RELATIONS, "org.dressdiscover.api.models.object.Object: relations is null");
            }
            if (!relations.isPresent()) {
                return relations;
            }
            return relations;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> validateRights(final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights) throws org.thryft.protocol.InputProtocolException {
            if (rights == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHTS, "org.dressdiscover.api.models.object.Object: rights is null");
            }
            if (!rights.isPresent()) {
                return rights;
            }
            return rights;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) throws org.thryft.protocol.InputProtocolException {
            if (structures == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STRUCTURES, "org.dressdiscover.api.models.object.Object: structures is null");
            }
            if (!structures.isPresent()) {
                return structures;
            }
            return structures;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> validateSubjects(final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects) throws org.thryft.protocol.InputProtocolException {
            if (subjects == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SUBJECTS, "org.dressdiscover.api.models.object.Object: subjects is null");
            }
            if (!subjects.isPresent()) {
                return subjects;
            }
            return subjects;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> validateTechniques(final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques) throws org.thryft.protocol.InputProtocolException {
            if (techniques == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TECHNIQUES, "org.dressdiscover.api.models.object.Object: techniques is null");
            }
            if (!techniques.isPresent()) {
                return techniques;
            }
            return techniques;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> validateTextrefs(final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs) throws org.thryft.protocol.InputProtocolException {
            if (textrefs == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXTREFS, "org.dressdiscover.api.models.object.Object: textrefs is null");
            }
            if (!textrefs.isPresent()) {
                return textrefs;
            }
            return textrefs;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> validateViewType(final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType) throws org.thryft.protocol.InputProtocolException {
            if (viewType == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VIEW_TYPE, "org.dressdiscover.api.models.object.Object: viewType is null");
            }
            if (!viewType.isPresent()) {
                return viewType;
            }
            return viewType;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> validateWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes) throws org.thryft.protocol.InputProtocolException {
            if (workTypes == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.WORK_TYPES, "org.dressdiscover.api.models.object.Object: workTypes is null");
            }
            if (!workTypes.isPresent()) {
                return workTypes;
            }
            return workTypes;
        }

        private final static DefaultReadValidator instance = new DefaultReadValidator();
    }

    public static class NopReadValidator implements ReadValidator {
        public static NopReadValidator getInstance() {
            return instance;
        }

        public NopReadValidator() {
        }

        @Override
        public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
            return collectionId;
        }

        @Override
        public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
            return institutionId;
        }

        @Override
        public org.dressdiscover.api.models.title.TitleSet validateTitles(final org.dressdiscover.api.models.title.TitleSet titles) {
            return titles;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> validateAgents(final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents) {
            return agents;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
            return categories;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> validateClosures(final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures) {
            return closures;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> validateColors(final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors) {
            return colors;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> validateComponents(final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components) {
            return components;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> validateCondition(final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition) {
            return condition;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> validateCulturalContexts(final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts) {
            return culturalContexts;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> validateDates(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates) {
            return dates;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> validateDescriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions) {
            return descriptions;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) {
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
            return images;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> validateInscriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions) {
            return inscriptions;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations) {
            return locations;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> validateMaterials(final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials) {
            return materials;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> validateMeasurements(final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements) {
            return measurements;
        }

        @Override
        public com.google.common.base.Optional<String> validateProvenance(final com.google.common.base.Optional<String> provenance) {
            return provenance;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> validateQuantity(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity) {
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> validateRelations(final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations) {
            return relations;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> validateRights(final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights) {
            return rights;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> validateStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) {
            return structures;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> validateSubjects(final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects) {
            return subjects;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> validateTechniques(final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques) {
            return techniques;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> validateTextrefs(final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs) {
            return textrefs;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> validateViewType(final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType) {
            return viewType;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> validateWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes) {
            return workTypes;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Object(final Object other) {
        this(other.getCollectionId(), other.getInstitutionId(), other.getTitles(), other.getAgents(), other.getCategories(), other.getClosures(), other.getColors(), other.getComponents(), other.getCondition(), other.getCulturalContexts(), other.getDates(), other.getDescriptions(), other.getGender(), other.getHidden(), other.getImages(), other.getInscriptions(), other.getLocations(), other.getMaterials(), other.getMeasurements(), other.getProvenance(), other.getQuantity(), other.getRelations(), other.getRights(), other.getStructures(), other.getSubjects(), other.getTechniques(), other.getTextrefs(), other.getViewType(), other.getWorkTypes(), NopConstructionValidator.getInstance());
    }

    protected Object(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.title.TitleSet titles, final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures, final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors, final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components, final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition, final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts, final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates, final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions, final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions, final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations, final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials, final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements, final com.google.common.base.Optional<String> provenance, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity, final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations, final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights, final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures, final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects, final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques, final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs, final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType, final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes, ConstructionValidator validator) {
        this.collectionId = validator.validateCollectionId(collectionId);
        this.institutionId = validator.validateInstitutionId(institutionId);
        this.titles = validator.validateTitles(titles);
        this.agents = validator.validateAgents(agents);
        this.categories = validator.validateCategories(categories);
        this.closures = validator.validateClosures(closures);
        this.colors = validator.validateColors(colors);
        this.components = validator.validateComponents(components);
        this.condition = validator.validateCondition(condition);
        this.culturalContexts = validator.validateCulturalContexts(culturalContexts);
        this.dates = validator.validateDates(dates);
        this.descriptions = validator.validateDescriptions(descriptions);
        this.gender = validator.validateGender(gender);
        this.hidden = validator.validateHidden(hidden);
        this.images = validator.validateImages(images);
        this.inscriptions = validator.validateInscriptions(inscriptions);
        this.locations = validator.validateLocations(locations);
        this.materials = validator.validateMaterials(materials);
        this.measurements = validator.validateMeasurements(measurements);
        this.provenance = validator.validateProvenance(provenance);
        this.quantity = validator.validateQuantity(quantity);
        this.relations = validator.validateRelations(relations);
        this.rights = validator.validateRights(rights);
        this.structures = validator.validateStructures(structures);
        this.subjects = validator.validateSubjects(subjects);
        this.techniques = validator.validateTechniques(techniques);
        this.textrefs = validator.validateTextrefs(textrefs);
        this.viewType = validator.validateViewType(viewType);
        this.workTypes = validator.validateWorkTypes(workTypes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Object other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Object> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static Object create(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.title.TitleSet titles) {
        return new Object(collectionId, institutionId, titles, com.google.common.base.Optional.<org.dressdiscover.api.models.agent.AgentSet> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.closure.ClosureSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.color.ColorSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.component.ComponentSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.condition.Condition> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.cultural_context.CulturalContextSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.date.DateSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.description.DescriptionSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.gender.Gender> absent(), com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.inscription.InscriptionSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.location.LocationSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.material.MaterialSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.measurements.MeasurementsSet> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<com.google.common.primitives.UnsignedInteger> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.relation.RelationSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.rights.RightsSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.structure.StructureSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.subject.SubjectSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.technique.TechniqueSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.textref.TextrefSet> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.view_type.ViewType> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.work_type.WorkTypeSet> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Object create(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.title.TitleSet titles, final @javax.annotation.Nullable org.dressdiscover.api.models.agent.AgentSet agents, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> categories, final @javax.annotation.Nullable org.dressdiscover.api.models.closure.ClosureSet closures, final @javax.annotation.Nullable org.dressdiscover.api.models.color.ColorSet colors, final @javax.annotation.Nullable org.dressdiscover.api.models.component.ComponentSet components, final @javax.annotation.Nullable org.dressdiscover.api.models.condition.Condition condition, final @javax.annotation.Nullable org.dressdiscover.api.models.cultural_context.CulturalContextSet culturalContexts, final @javax.annotation.Nullable org.dressdiscover.api.models.date.DateSet dates, final @javax.annotation.Nullable org.dressdiscover.api.models.description.DescriptionSet descriptions, final @javax.annotation.Nullable org.dressdiscover.api.models.gender.Gender gender, final @javax.annotation.Nullable Boolean hidden, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> images, final @javax.annotation.Nullable org.dressdiscover.api.models.inscription.InscriptionSet inscriptions, final @javax.annotation.Nullable org.dressdiscover.api.models.location.LocationSet locations, final @javax.annotation.Nullable org.dressdiscover.api.models.material.MaterialSet materials, final @javax.annotation.Nullable org.dressdiscover.api.models.measurements.MeasurementsSet measurements, final @javax.annotation.Nullable String provenance, final @javax.annotation.Nullable com.google.common.primitives.UnsignedInteger quantity, final @javax.annotation.Nullable org.dressdiscover.api.models.relation.RelationSet relations, final @javax.annotation.Nullable org.dressdiscover.api.models.rights.RightsSet rights, final @javax.annotation.Nullable org.dressdiscover.api.models.structure.StructureSet structures, final @javax.annotation.Nullable org.dressdiscover.api.models.subject.SubjectSet subjects, final @javax.annotation.Nullable org.dressdiscover.api.models.technique.TechniqueSet techniques, final @javax.annotation.Nullable org.dressdiscover.api.models.textref.TextrefSet textrefs, final @javax.annotation.Nullable org.dressdiscover.api.models.view_type.ViewType viewType, final @javax.annotation.Nullable org.dressdiscover.api.models.work_type.WorkTypeSet workTypes) {
        return new Object(collectionId, institutionId, titles, com.google.common.base.Optional.fromNullable(agents), com.google.common.base.Optional.fromNullable(categories), com.google.common.base.Optional.fromNullable(closures), com.google.common.base.Optional.fromNullable(colors), com.google.common.base.Optional.fromNullable(components), com.google.common.base.Optional.fromNullable(condition), com.google.common.base.Optional.fromNullable(culturalContexts), com.google.common.base.Optional.fromNullable(dates), com.google.common.base.Optional.fromNullable(descriptions), com.google.common.base.Optional.fromNullable(gender), com.google.common.base.Optional.fromNullable(hidden), com.google.common.base.Optional.fromNullable(images), com.google.common.base.Optional.fromNullable(inscriptions), com.google.common.base.Optional.fromNullable(locations), com.google.common.base.Optional.fromNullable(materials), com.google.common.base.Optional.fromNullable(measurements), com.google.common.base.Optional.fromNullable(provenance), com.google.common.base.Optional.fromNullable(quantity), com.google.common.base.Optional.fromNullable(relations), com.google.common.base.Optional.fromNullable(rights), com.google.common.base.Optional.fromNullable(structures), com.google.common.base.Optional.fromNullable(subjects), com.google.common.base.Optional.fromNullable(techniques), com.google.common.base.Optional.fromNullable(textrefs), com.google.common.base.Optional.fromNullable(viewType), com.google.common.base.Optional.fromNullable(workTypes), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Object create(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final org.dressdiscover.api.models.title.TitleSet titles, final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures, final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors, final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components, final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition, final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts, final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates, final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions, final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions, final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations, final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials, final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements, final com.google.common.base.Optional<String> provenance, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity, final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations, final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights, final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures, final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects, final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques, final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs, final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType, final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes) {
        return new Object(collectionId, institutionId, titles, agents, categories, closures, colors, components, condition, culturalContexts, dates, descriptions, gender, hidden, images, inscriptions, locations, materials, measurements, provenance, quantity, relations, rights, structures, subjects, techniques, textrefs, viewType, workTypes, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Object)) {
            return false;
        }

        final Object other = (Object)otherObject;
        return
            getCollectionId().equals(other.getCollectionId()) &&
            getInstitutionId().equals(other.getInstitutionId()) &&
            getTitles().equals(other.getTitles()) &&
            ((getAgents().isPresent() && other.getAgents().isPresent()) ? (getAgents().get().equals(other.getAgents().get())) : (!getAgents().isPresent() && !other.getAgents().isPresent())) &&
            ((getCategories().isPresent() && other.getCategories().isPresent()) ? (getCategories().get().equals(other.getCategories().get())) : (!getCategories().isPresent() && !other.getCategories().isPresent())) &&
            ((getClosures().isPresent() && other.getClosures().isPresent()) ? (getClosures().get().equals(other.getClosures().get())) : (!getClosures().isPresent() && !other.getClosures().isPresent())) &&
            ((getColors().isPresent() && other.getColors().isPresent()) ? (getColors().get().equals(other.getColors().get())) : (!getColors().isPresent() && !other.getColors().isPresent())) &&
            ((getComponents().isPresent() && other.getComponents().isPresent()) ? (getComponents().get().equals(other.getComponents().get())) : (!getComponents().isPresent() && !other.getComponents().isPresent())) &&
            ((getCondition().isPresent() && other.getCondition().isPresent()) ? (getCondition().get().equals(other.getCondition().get())) : (!getCondition().isPresent() && !other.getCondition().isPresent())) &&
            ((getCulturalContexts().isPresent() && other.getCulturalContexts().isPresent()) ? (getCulturalContexts().get().equals(other.getCulturalContexts().get())) : (!getCulturalContexts().isPresent() && !other.getCulturalContexts().isPresent())) &&
            ((getDates().isPresent() && other.getDates().isPresent()) ? (getDates().get().equals(other.getDates().get())) : (!getDates().isPresent() && !other.getDates().isPresent())) &&
            ((getDescriptions().isPresent() && other.getDescriptions().isPresent()) ? (getDescriptions().get().equals(other.getDescriptions().get())) : (!getDescriptions().isPresent() && !other.getDescriptions().isPresent())) &&
            ((getGender().isPresent() && other.getGender().isPresent()) ? (getGender().get().equals(other.getGender().get())) : (!getGender().isPresent() && !other.getGender().isPresent())) &&
            ((getHidden().isPresent() && other.getHidden().isPresent()) ? (getHidden().get() == other.getHidden().get()) : (!getHidden().isPresent() && !other.getHidden().isPresent())) &&
            ((getImages().isPresent() && other.getImages().isPresent()) ? (getImages().get().equals(other.getImages().get())) : (!getImages().isPresent() && !other.getImages().isPresent())) &&
            ((getInscriptions().isPresent() && other.getInscriptions().isPresent()) ? (getInscriptions().get().equals(other.getInscriptions().get())) : (!getInscriptions().isPresent() && !other.getInscriptions().isPresent())) &&
            ((getLocations().isPresent() && other.getLocations().isPresent()) ? (getLocations().get().equals(other.getLocations().get())) : (!getLocations().isPresent() && !other.getLocations().isPresent())) &&
            ((getMaterials().isPresent() && other.getMaterials().isPresent()) ? (getMaterials().get().equals(other.getMaterials().get())) : (!getMaterials().isPresent() && !other.getMaterials().isPresent())) &&
            ((getMeasurements().isPresent() && other.getMeasurements().isPresent()) ? (getMeasurements().get().equals(other.getMeasurements().get())) : (!getMeasurements().isPresent() && !other.getMeasurements().isPresent())) &&
            ((getProvenance().isPresent() && other.getProvenance().isPresent()) ? (getProvenance().get().equals(other.getProvenance().get())) : (!getProvenance().isPresent() && !other.getProvenance().isPresent())) &&
            ((getQuantity().isPresent() && other.getQuantity().isPresent()) ? (getQuantity().get().equals(other.getQuantity().get())) : (!getQuantity().isPresent() && !other.getQuantity().isPresent())) &&
            ((getRelations().isPresent() && other.getRelations().isPresent()) ? (getRelations().get().equals(other.getRelations().get())) : (!getRelations().isPresent() && !other.getRelations().isPresent())) &&
            ((getRights().isPresent() && other.getRights().isPresent()) ? (getRights().get().equals(other.getRights().get())) : (!getRights().isPresent() && !other.getRights().isPresent())) &&
            ((getStructures().isPresent() && other.getStructures().isPresent()) ? (getStructures().get().equals(other.getStructures().get())) : (!getStructures().isPresent() && !other.getStructures().isPresent())) &&
            ((getSubjects().isPresent() && other.getSubjects().isPresent()) ? (getSubjects().get().equals(other.getSubjects().get())) : (!getSubjects().isPresent() && !other.getSubjects().isPresent())) &&
            ((getTechniques().isPresent() && other.getTechniques().isPresent()) ? (getTechniques().get().equals(other.getTechniques().get())) : (!getTechniques().isPresent() && !other.getTechniques().isPresent())) &&
            ((getTextrefs().isPresent() && other.getTextrefs().isPresent()) ? (getTextrefs().get().equals(other.getTextrefs().get())) : (!getTextrefs().isPresent() && !other.getTextrefs().isPresent())) &&
            ((getViewType().isPresent() && other.getViewType().isPresent()) ? (getViewType().get().equals(other.getViewType().get())) : (!getViewType().isPresent() && !other.getViewType().isPresent())) &&
            ((getWorkTypes().isPresent() && other.getWorkTypes().isPresent()) ? (getWorkTypes().get().equals(other.getWorkTypes().get())) : (!getWorkTypes().isPresent() && !other.getWorkTypes().isPresent()));
    }

    @Override
    public java.lang.Object get(final String fieldThriftName) {
        return get(FieldMetadata.valueOfThriftName(fieldThriftName));
    }

    @Override
    public java.lang.Object get(final org.thryft.CompoundType.FieldMetadata fieldMetadata) {
        if (!(fieldMetadata instanceof FieldMetadata)) {
            throw new IllegalArgumentException();
        }
        return get((FieldMetadata)fieldMetadata);
    }

    public java.lang.Object get(final FieldMetadata fieldMetadata) {
        switch (fieldMetadata) {
        case COLLECTION_ID: return getCollectionId();
        case INSTITUTION_ID: return getInstitutionId();
        case TITLES: return getTitles();
        case AGENTS: return getAgents();
        case CATEGORIES: return getCategories();
        case CLOSURES: return getClosures();
        case COLORS: return getColors();
        case COMPONENTS: return getComponents();
        case CONDITION: return getCondition();
        case CULTURAL_CONTEXTS: return getCulturalContexts();
        case DATES: return getDates();
        case DESCRIPTIONS: return getDescriptions();
        case GENDER: return getGender();
        case HIDDEN: return getHidden();
        case IMAGES: return getImages();
        case INSCRIPTIONS: return getInscriptions();
        case LOCATIONS: return getLocations();
        case MATERIALS: return getMaterials();
        case MEASUREMENTS: return getMeasurements();
        case PROVENANCE: return getProvenance();
        case QUANTITY: return getQuantity();
        case RELATIONS: return getRelations();
        case RIGHTS: return getRights();
        case STRUCTURES: return getStructures();
        case SUBJECTS: return getSubjects();
        case TECHNIQUES: return getTechniques();
        case TEXTREFS: return getTextrefs();
        case VIEW_TYPE: return getViewType();
        case WORK_TYPES: return getWorkTypes();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> getAgents() {
        return agents;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCategories() {
        return categories;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> getClosures() {
        return closures;
    }

    public final org.dressdiscover.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> getColors() {
        return colors;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> getComponents() {
        return components;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> getCondition() {
        return condition;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> getCulturalContexts() {
        return culturalContexts;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> getDates() {
        return dates;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> getDescriptions() {
        return descriptions;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> getGender() {
        return gender;
    }

    public final com.google.common.base.Optional<Boolean> getHidden() {
        return hidden;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> getImages() {
        return images;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> getInscriptions() {
        return inscriptions;
    }

    public final org.dressdiscover.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> getLocations() {
        return locations;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> getMaterials() {
        return materials;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> getMeasurements() {
        return measurements;
    }

    /**
     * Dublin Core freetext provenance
     */
    public final com.google.common.base.Optional<String> getProvenance() {
        return provenance;
    }

    public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getQuantity() {
        return quantity;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> getRelations() {
        return relations;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> getRights() {
        return rights;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> getStructures() {
        return structures;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> getSubjects() {
        return subjects;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> getTechniques() {
        return techniques;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> getTextrefs() {
        return textrefs;
    }

    public final org.dressdiscover.api.models.title.TitleSet getTitles() {
        return titles;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> getViewType() {
        return viewType;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> getWorkTypes() {
        return workTypes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCollectionId().hashCode();
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getTitles().hashCode();
        if (getAgents().isPresent()) {
            hashCode = 31 * hashCode + getAgents().get().hashCode();
        }
        if (getCategories().isPresent()) {
            hashCode = 31 * hashCode + getCategories().get().hashCode();
        }
        if (getClosures().isPresent()) {
            hashCode = 31 * hashCode + getClosures().get().hashCode();
        }
        if (getColors().isPresent()) {
            hashCode = 31 * hashCode + getColors().get().hashCode();
        }
        if (getComponents().isPresent()) {
            hashCode = 31 * hashCode + getComponents().get().hashCode();
        }
        if (getCondition().isPresent()) {
            hashCode = 31 * hashCode + getCondition().get().ordinal();
        }
        if (getCulturalContexts().isPresent()) {
            hashCode = 31 * hashCode + getCulturalContexts().get().hashCode();
        }
        if (getDates().isPresent()) {
            hashCode = 31 * hashCode + getDates().get().hashCode();
        }
        if (getDescriptions().isPresent()) {
            hashCode = 31 * hashCode + getDescriptions().get().hashCode();
        }
        if (getGender().isPresent()) {
            hashCode = 31 * hashCode + getGender().get().ordinal();
        }
        if (getHidden().isPresent()) {
            hashCode = 31 * hashCode + (getHidden().get() ? 1 : 0);
        }
        if (getImages().isPresent()) {
            hashCode = 31 * hashCode + getImages().get().hashCode();
        }
        if (getInscriptions().isPresent()) {
            hashCode = 31 * hashCode + getInscriptions().get().hashCode();
        }
        if (getLocations().isPresent()) {
            hashCode = 31 * hashCode + getLocations().get().hashCode();
        }
        if (getMaterials().isPresent()) {
            hashCode = 31 * hashCode + getMaterials().get().hashCode();
        }
        if (getMeasurements().isPresent()) {
            hashCode = 31 * hashCode + getMeasurements().get().hashCode();
        }
        if (getProvenance().isPresent()) {
            hashCode = 31 * hashCode + getProvenance().get().hashCode();
        }
        if (getQuantity().isPresent()) {
            hashCode = 31 * hashCode + getQuantity().get().hashCode();
        }
        if (getRelations().isPresent()) {
            hashCode = 31 * hashCode + getRelations().get().hashCode();
        }
        if (getRights().isPresent()) {
            hashCode = 31 * hashCode + getRights().get().hashCode();
        }
        if (getStructures().isPresent()) {
            hashCode = 31 * hashCode + getStructures().get().hashCode();
        }
        if (getSubjects().isPresent()) {
            hashCode = 31 * hashCode + getSubjects().get().hashCode();
        }
        if (getTechniques().isPresent()) {
            hashCode = 31 * hashCode + getTechniques().get().hashCode();
        }
        if (getTextrefs().isPresent()) {
            hashCode = 31 * hashCode + getTextrefs().get().hashCode();
        }
        if (getViewType().isPresent()) {
            hashCode = 31 * hashCode + getViewType().get().ordinal();
        }
        if (getWorkTypes().isPresent()) {
            hashCode = 31 * hashCode + getWorkTypes().get().hashCode();
        }
        return hashCode;
    }

    public static Object readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Object readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Object readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.collection.CollectionId collectionId = null;
        org.dressdiscover.api.models.institution.InstitutionId institutionId = null;
        org.dressdiscover.api.models.title.TitleSet titles = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents = com.google.common.base.Optional.<org.dressdiscover.api.models.agent.AgentSet> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures = com.google.common.base.Optional.<org.dressdiscover.api.models.closure.ClosureSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors = com.google.common.base.Optional.<org.dressdiscover.api.models.color.ColorSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components = com.google.common.base.Optional.<org.dressdiscover.api.models.component.ComponentSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition = com.google.common.base.Optional.<org.dressdiscover.api.models.condition.Condition> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts = com.google.common.base.Optional.<org.dressdiscover.api.models.cultural_context.CulturalContextSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates = com.google.common.base.Optional.<org.dressdiscover.api.models.date.DateSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions = com.google.common.base.Optional.<org.dressdiscover.api.models.description.DescriptionSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender = com.google.common.base.Optional.<org.dressdiscover.api.models.gender.Gender> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions = com.google.common.base.Optional.<org.dressdiscover.api.models.inscription.InscriptionSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations = com.google.common.base.Optional.<org.dressdiscover.api.models.location.LocationSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials = com.google.common.base.Optional.<org.dressdiscover.api.models.material.MaterialSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements = com.google.common.base.Optional.<org.dressdiscover.api.models.measurements.MeasurementsSet> absent();
        com.google.common.base.Optional<String> provenance = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity = com.google.common.base.Optional.<com.google.common.primitives.UnsignedInteger> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations = com.google.common.base.Optional.<org.dressdiscover.api.models.relation.RelationSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights = com.google.common.base.Optional.<org.dressdiscover.api.models.rights.RightsSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures = com.google.common.base.Optional.<org.dressdiscover.api.models.structure.StructureSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects = com.google.common.base.Optional.<org.dressdiscover.api.models.subject.SubjectSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques = com.google.common.base.Optional.<org.dressdiscover.api.models.technique.TechniqueSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs = com.google.common.base.Optional.<org.dressdiscover.api.models.textref.TextrefSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType = com.google.common.base.Optional.<org.dressdiscover.api.models.view_type.ViewType> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes = com.google.common.base.Optional.<org.dressdiscover.api.models.work_type.WorkTypeSet> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
            } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
            }
            try {
                institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
            } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
            }
            titles = org.dressdiscover.api.models.title.TitleSet.readAsStruct(iprot);
            if (__list.getSize() > 3) {
                agents = com.google.common.base.Optional.of(org.dressdiscover.api.models.agent.AgentSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 4) {
                try {
                    categories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                }
            }
            if (__list.getSize() > 5) {
                closures = com.google.common.base.Optional.of(org.dressdiscover.api.models.closure.ClosureSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 6) {
                colors = com.google.common.base.Optional.of(org.dressdiscover.api.models.color.ColorSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 7) {
                components = com.google.common.base.Optional.of(org.dressdiscover.api.models.component.ComponentSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 8) {
                condition = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.condition.Condition.class));
            }
            if (__list.getSize() > 9) {
                culturalContexts = com.google.common.base.Optional.of(org.dressdiscover.api.models.cultural_context.CulturalContextSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 10) {
                dates = com.google.common.base.Optional.of(org.dressdiscover.api.models.date.DateSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 11) {
                descriptions = com.google.common.base.Optional.of(org.dressdiscover.api.models.description.DescriptionSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 12) {
                gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
            }
            if (__list.getSize() > 13) {
                hidden = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 14) {
                try {
                    images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.image.Image.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, e.getCause());
                }
            }
            if (__list.getSize() > 15) {
                inscriptions = com.google.common.base.Optional.of(org.dressdiscover.api.models.inscription.InscriptionSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 16) {
                locations = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 17) {
                materials = com.google.common.base.Optional.of(org.dressdiscover.api.models.material.MaterialSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 18) {
                measurements = com.google.common.base.Optional.of(org.dressdiscover.api.models.measurements.MeasurementsSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 19) {
                provenance = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 20) {
                try {
                    quantity = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 21) {
                relations = com.google.common.base.Optional.of(org.dressdiscover.api.models.relation.RelationSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 22) {
                rights = com.google.common.base.Optional.of(org.dressdiscover.api.models.rights.RightsSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 23) {
                structures = com.google.common.base.Optional.of(org.dressdiscover.api.models.structure.StructureSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 24) {
                subjects = com.google.common.base.Optional.of(org.dressdiscover.api.models.subject.SubjectSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 25) {
                techniques = com.google.common.base.Optional.of(org.dressdiscover.api.models.technique.TechniqueSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 26) {
                textrefs = com.google.common.base.Optional.of(org.dressdiscover.api.models.textref.TextrefSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 27) {
                viewType = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.view_type.ViewType.class));
            }
            if (__list.getSize() > 28) {
                workTypes = com.google.common.base.Optional.of(org.dressdiscover.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Object(DefaultReadValidator.getInstance().validateCollectionId(collectionId), DefaultReadValidator.getInstance().validateInstitutionId(institutionId), DefaultReadValidator.getInstance().validateTitles(titles), DefaultReadValidator.getInstance().validateAgents(agents), DefaultReadValidator.getInstance().validateCategories(categories), DefaultReadValidator.getInstance().validateClosures(closures), DefaultReadValidator.getInstance().validateColors(colors), DefaultReadValidator.getInstance().validateComponents(components), DefaultReadValidator.getInstance().validateCondition(condition), DefaultReadValidator.getInstance().validateCulturalContexts(culturalContexts), DefaultReadValidator.getInstance().validateDates(dates), DefaultReadValidator.getInstance().validateDescriptions(descriptions), DefaultReadValidator.getInstance().validateGender(gender), DefaultReadValidator.getInstance().validateHidden(hidden), DefaultReadValidator.getInstance().validateImages(images), DefaultReadValidator.getInstance().validateInscriptions(inscriptions), DefaultReadValidator.getInstance().validateLocations(locations), DefaultReadValidator.getInstance().validateMaterials(materials), DefaultReadValidator.getInstance().validateMeasurements(measurements), DefaultReadValidator.getInstance().validateProvenance(provenance), DefaultReadValidator.getInstance().validateQuantity(quantity), DefaultReadValidator.getInstance().validateRelations(relations), DefaultReadValidator.getInstance().validateRights(rights), DefaultReadValidator.getInstance().validateStructures(structures), DefaultReadValidator.getInstance().validateSubjects(subjects), DefaultReadValidator.getInstance().validateTechniques(techniques), DefaultReadValidator.getInstance().validateTextrefs(textrefs), DefaultReadValidator.getInstance().validateViewType(viewType), DefaultReadValidator.getInstance().validateWorkTypes(workTypes), NopConstructionValidator.getInstance());
    }

    public static Object readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Object readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.collection.CollectionId collectionId = null;
        org.dressdiscover.api.models.institution.InstitutionId institutionId = null;
        org.dressdiscover.api.models.title.TitleSet titles = null;
        com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents = com.google.common.base.Optional.<org.dressdiscover.api.models.agent.AgentSet> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures = com.google.common.base.Optional.<org.dressdiscover.api.models.closure.ClosureSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors = com.google.common.base.Optional.<org.dressdiscover.api.models.color.ColorSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components = com.google.common.base.Optional.<org.dressdiscover.api.models.component.ComponentSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition = com.google.common.base.Optional.<org.dressdiscover.api.models.condition.Condition> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts = com.google.common.base.Optional.<org.dressdiscover.api.models.cultural_context.CulturalContextSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates = com.google.common.base.Optional.<org.dressdiscover.api.models.date.DateSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions = com.google.common.base.Optional.<org.dressdiscover.api.models.description.DescriptionSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender = com.google.common.base.Optional.<org.dressdiscover.api.models.gender.Gender> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions = com.google.common.base.Optional.<org.dressdiscover.api.models.inscription.InscriptionSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations = com.google.common.base.Optional.<org.dressdiscover.api.models.location.LocationSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials = com.google.common.base.Optional.<org.dressdiscover.api.models.material.MaterialSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements = com.google.common.base.Optional.<org.dressdiscover.api.models.measurements.MeasurementsSet> absent();
        com.google.common.base.Optional<String> provenance = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity = com.google.common.base.Optional.<com.google.common.primitives.UnsignedInteger> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations = com.google.common.base.Optional.<org.dressdiscover.api.models.relation.RelationSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights = com.google.common.base.Optional.<org.dressdiscover.api.models.rights.RightsSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures = com.google.common.base.Optional.<org.dressdiscover.api.models.structure.StructureSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects = com.google.common.base.Optional.<org.dressdiscover.api.models.subject.SubjectSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques = com.google.common.base.Optional.<org.dressdiscover.api.models.technique.TechniqueSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs = com.google.common.base.Optional.<org.dressdiscover.api.models.textref.TextrefSet> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType = com.google.common.base.Optional.<org.dressdiscover.api.models.view_type.ViewType> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes = com.google.common.base.Optional.<org.dressdiscover.api.models.work_type.WorkTypeSet> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "collection_id": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                        }
                    }
                    break;
                }
                case "institution_id": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                        }
                    }
                    break;
                }
                case "titles": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        titles = org.dressdiscover.api.models.title.TitleSet.readAsStruct(iprot);
                    }
                    break;
                }
                case "agents": {
                    if (!ifield.hasId() || ifield.getId() == 20) {
                        agents = com.google.common.base.Optional.of(org.dressdiscover.api.models.agent.AgentSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "categories": {
                    if (!ifield.hasId() || ifield.getId() == 18) {
                        try {
                            categories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(iprot.readString());
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                        }
                    }
                    break;
                }
                case "closures": {
                    if (!ifield.hasId() || ifield.getId() == 34) {
                        closures = com.google.common.base.Optional.of(org.dressdiscover.api.models.closure.ClosureSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "colors": {
                    if (!ifield.hasId() || ifield.getId() == 30) {
                        colors = com.google.common.base.Optional.of(org.dressdiscover.api.models.color.ColorSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "components": {
                    if (!ifield.hasId() || ifield.getId() == 32) {
                        components = com.google.common.base.Optional.of(org.dressdiscover.api.models.component.ComponentSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "condition": {
                    if (!ifield.hasId() || ifield.getId() == 27) {
                        condition = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.condition.Condition.class));
                    }
                    break;
                }
                case "cultural_contexts": {
                    if (!ifield.hasId() || ifield.getId() == 35) {
                        culturalContexts = com.google.common.base.Optional.of(org.dressdiscover.api.models.cultural_context.CulturalContextSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "dates": {
                    if (!ifield.hasId() || ifield.getId() == 10) {
                        dates = com.google.common.base.Optional.of(org.dressdiscover.api.models.date.DateSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "descriptions": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        descriptions = com.google.common.base.Optional.of(org.dressdiscover.api.models.description.DescriptionSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "gender": {
                    if (!ifield.hasId() || ifield.getId() == 25) {
                        gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                    }
                    break;
                }
                case "hidden": {
                    if (!ifield.hasId() || ifield.getId() == 37) {
                        hidden = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                case "images": {
                    if (!ifield.hasId() || ifield.getId() == 23) {
                        try {
                            images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.image.Image.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, e.getCause());
                        }
                    }
                    break;
                }
                case "inscriptions": {
                    if (!ifield.hasId() || ifield.getId() == 17) {
                        inscriptions = com.google.common.base.Optional.of(org.dressdiscover.api.models.inscription.InscriptionSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "locations": {
                    if (!ifield.hasId() || ifield.getId() == 36) {
                        locations = com.google.common.base.Optional.of(org.dressdiscover.api.models.location.LocationSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "materials": {
                    if (!ifield.hasId() || ifield.getId() == 15) {
                        materials = com.google.common.base.Optional.of(org.dressdiscover.api.models.material.MaterialSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "measurements": {
                    if (!ifield.hasId() || ifield.getId() == 31) {
                        measurements = com.google.common.base.Optional.of(org.dressdiscover.api.models.measurements.MeasurementsSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "provenance": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        provenance = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "quantity": {
                    if (!ifield.hasId() || ifield.getId() == 26) {
                        try {
                            quantity = com.google.common.base.Optional.of(iprot.readU32());
                        } catch (final NumberFormatException e) {
                        }
                    }
                    break;
                }
                case "relations": {
                    if (!ifield.hasId() || ifield.getId() == 29) {
                        relations = com.google.common.base.Optional.of(org.dressdiscover.api.models.relation.RelationSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "rights": {
                    if (!ifield.hasId() || ifield.getId() == 22) {
                        rights = com.google.common.base.Optional.of(org.dressdiscover.api.models.rights.RightsSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "structures": {
                    if (!ifield.hasId() || ifield.getId() == 33) {
                        structures = com.google.common.base.Optional.of(org.dressdiscover.api.models.structure.StructureSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "subjects": {
                    if (!ifield.hasId() || ifield.getId() == 21) {
                        subjects = com.google.common.base.Optional.of(org.dressdiscover.api.models.subject.SubjectSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "techniques": {
                    if (!ifield.hasId() || ifield.getId() == 16) {
                        techniques = com.google.common.base.Optional.of(org.dressdiscover.api.models.technique.TechniqueSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "textrefs": {
                    if (!ifield.hasId() || ifield.getId() == 9) {
                        textrefs = com.google.common.base.Optional.of(org.dressdiscover.api.models.textref.TextrefSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "view_type": {
                    if (!ifield.hasId() || ifield.getId() == 28) {
                        viewType = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.view_type.ViewType.class));
                    }
                    break;
                }
                case "work_types": {
                    if (!ifield.hasId() || ifield.getId() == 24) {
                        workTypes = com.google.common.base.Optional.of(org.dressdiscover.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
                    }
                    break;
                }
                default:
                    if (unknownFieldCallback.isPresent()) {
                        unknownFieldCallback.get().apply(ifield);
                    }
                    break;
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Object(DefaultReadValidator.getInstance().validateCollectionId(collectionId), DefaultReadValidator.getInstance().validateInstitutionId(institutionId), DefaultReadValidator.getInstance().validateTitles(titles), DefaultReadValidator.getInstance().validateAgents(agents), DefaultReadValidator.getInstance().validateCategories(categories), DefaultReadValidator.getInstance().validateClosures(closures), DefaultReadValidator.getInstance().validateColors(colors), DefaultReadValidator.getInstance().validateComponents(components), DefaultReadValidator.getInstance().validateCondition(condition), DefaultReadValidator.getInstance().validateCulturalContexts(culturalContexts), DefaultReadValidator.getInstance().validateDates(dates), DefaultReadValidator.getInstance().validateDescriptions(descriptions), DefaultReadValidator.getInstance().validateGender(gender), DefaultReadValidator.getInstance().validateHidden(hidden), DefaultReadValidator.getInstance().validateImages(images), DefaultReadValidator.getInstance().validateInscriptions(inscriptions), DefaultReadValidator.getInstance().validateLocations(locations), DefaultReadValidator.getInstance().validateMaterials(materials), DefaultReadValidator.getInstance().validateMeasurements(measurements), DefaultReadValidator.getInstance().validateProvenance(provenance), DefaultReadValidator.getInstance().validateQuantity(quantity), DefaultReadValidator.getInstance().validateRelations(relations), DefaultReadValidator.getInstance().validateRights(rights), DefaultReadValidator.getInstance().validateStructures(structures), DefaultReadValidator.getInstance().validateSubjects(subjects), DefaultReadValidator.getInstance().validateTechniques(techniques), DefaultReadValidator.getInstance().validateTextrefs(textrefs), DefaultReadValidator.getInstance().validateViewType(viewType), DefaultReadValidator.getInstance().validateWorkTypes(workTypes), NopConstructionValidator.getInstance());
    }

    public Object replaceAgents(final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents) {
        return new Object(this.collectionId, this.institutionId, this.titles, DefaultConstructionValidator.getInstance().validateAgents(agents), this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceAgents(final org.dressdiscover.api.models.agent.AgentSet agents) {
        return replaceAgents(com.google.common.base.Optional.fromNullable(agents));
    }

    public Object replaceCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, DefaultConstructionValidator.getInstance().validateCategories(categories), this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceCategories(final com.google.common.collect.ImmutableList<String> categories) {
        return replaceCategories(com.google.common.base.Optional.fromNullable(categories));
    }

    public Object replaceClosures(final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, DefaultConstructionValidator.getInstance().validateClosures(closures), this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceClosures(final org.dressdiscover.api.models.closure.ClosureSet closures) {
        return replaceClosures(com.google.common.base.Optional.fromNullable(closures));
    }

    public Object replaceCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
        return new Object(DefaultConstructionValidator.getInstance().validateCollectionId(collectionId), this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceColors(final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, DefaultConstructionValidator.getInstance().validateColors(colors), this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceColors(final org.dressdiscover.api.models.color.ColorSet colors) {
        return replaceColors(com.google.common.base.Optional.fromNullable(colors));
    }

    public Object replaceComponents(final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, DefaultConstructionValidator.getInstance().validateComponents(components), this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceComponents(final org.dressdiscover.api.models.component.ComponentSet components) {
        return replaceComponents(com.google.common.base.Optional.fromNullable(components));
    }

    public Object replaceCondition(final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, DefaultConstructionValidator.getInstance().validateCondition(condition), this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceCondition(final org.dressdiscover.api.models.condition.Condition condition) {
        return replaceCondition(com.google.common.base.Optional.fromNullable(condition));
    }

    public Object replaceCulturalContexts(final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, DefaultConstructionValidator.getInstance().validateCulturalContexts(culturalContexts), this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceCulturalContexts(final org.dressdiscover.api.models.cultural_context.CulturalContextSet culturalContexts) {
        return replaceCulturalContexts(com.google.common.base.Optional.fromNullable(culturalContexts));
    }

    public Object replaceDates(final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, DefaultConstructionValidator.getInstance().validateDates(dates), this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceDates(final org.dressdiscover.api.models.date.DateSet dates) {
        return replaceDates(com.google.common.base.Optional.fromNullable(dates));
    }

    public Object replaceDescriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, DefaultConstructionValidator.getInstance().validateDescriptions(descriptions), this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceDescriptions(final org.dressdiscover.api.models.description.DescriptionSet descriptions) {
        return replaceDescriptions(com.google.common.base.Optional.fromNullable(descriptions));
    }

    public Object replaceGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, DefaultConstructionValidator.getInstance().validateGender(gender), this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceGender(final org.dressdiscover.api.models.gender.Gender gender) {
        return replaceGender(com.google.common.base.Optional.fromNullable(gender));
    }

    public Object replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, DefaultConstructionValidator.getInstance().validateHidden(hidden), this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceHidden(final boolean hidden) {
        return replaceHidden(com.google.common.base.Optional.fromNullable(hidden));
    }

    public Object replaceImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, DefaultConstructionValidator.getInstance().validateImages(images), this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceImages(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> images) {
        return replaceImages(com.google.common.base.Optional.fromNullable(images));
    }

    public Object replaceInscriptions(final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, DefaultConstructionValidator.getInstance().validateInscriptions(inscriptions), this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceInscriptions(final org.dressdiscover.api.models.inscription.InscriptionSet inscriptions) {
        return replaceInscriptions(com.google.common.base.Optional.fromNullable(inscriptions));
    }

    public Object replaceInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
        return new Object(this.collectionId, DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId), this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceLocations(final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, DefaultConstructionValidator.getInstance().validateLocations(locations), this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceLocations(final org.dressdiscover.api.models.location.LocationSet locations) {
        return replaceLocations(com.google.common.base.Optional.fromNullable(locations));
    }

    public Object replaceMaterials(final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, DefaultConstructionValidator.getInstance().validateMaterials(materials), this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceMaterials(final org.dressdiscover.api.models.material.MaterialSet materials) {
        return replaceMaterials(com.google.common.base.Optional.fromNullable(materials));
    }

    public Object replaceMeasurements(final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, DefaultConstructionValidator.getInstance().validateMeasurements(measurements), this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceMeasurements(final org.dressdiscover.api.models.measurements.MeasurementsSet measurements) {
        return replaceMeasurements(com.google.common.base.Optional.fromNullable(measurements));
    }

    public Object replaceProvenance(final com.google.common.base.Optional<String> provenance) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, DefaultConstructionValidator.getInstance().validateProvenance(provenance), this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceProvenance(final String provenance) {
        return replaceProvenance(com.google.common.base.Optional.fromNullable(provenance));
    }

    public Object replaceQuantity(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, DefaultConstructionValidator.getInstance().validateQuantity(quantity), this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceQuantity(final com.google.common.primitives.UnsignedInteger quantity) {
        return replaceQuantity(com.google.common.base.Optional.fromNullable(quantity));
    }

    public Object replaceRelations(final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, DefaultConstructionValidator.getInstance().validateRelations(relations), this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceRelations(final org.dressdiscover.api.models.relation.RelationSet relations) {
        return replaceRelations(com.google.common.base.Optional.fromNullable(relations));
    }

    public Object replaceRights(final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, DefaultConstructionValidator.getInstance().validateRights(rights), this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceRights(final org.dressdiscover.api.models.rights.RightsSet rights) {
        return replaceRights(com.google.common.base.Optional.fromNullable(rights));
    }

    public Object replaceStructures(final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, DefaultConstructionValidator.getInstance().validateStructures(structures), this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceStructures(final org.dressdiscover.api.models.structure.StructureSet structures) {
        return replaceStructures(com.google.common.base.Optional.fromNullable(structures));
    }

    public Object replaceSubjects(final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, DefaultConstructionValidator.getInstance().validateSubjects(subjects), this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceSubjects(final org.dressdiscover.api.models.subject.SubjectSet subjects) {
        return replaceSubjects(com.google.common.base.Optional.fromNullable(subjects));
    }

    public Object replaceTechniques(final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, DefaultConstructionValidator.getInstance().validateTechniques(techniques), this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceTechniques(final org.dressdiscover.api.models.technique.TechniqueSet techniques) {
        return replaceTechniques(com.google.common.base.Optional.fromNullable(techniques));
    }

    public Object replaceTextrefs(final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, DefaultConstructionValidator.getInstance().validateTextrefs(textrefs), this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceTextrefs(final org.dressdiscover.api.models.textref.TextrefSet textrefs) {
        return replaceTextrefs(com.google.common.base.Optional.fromNullable(textrefs));
    }

    public Object replaceTitles(final org.dressdiscover.api.models.title.TitleSet titles) {
        return new Object(this.collectionId, this.institutionId, DefaultConstructionValidator.getInstance().validateTitles(titles), this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceViewType(final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, DefaultConstructionValidator.getInstance().validateViewType(viewType), this.workTypes, NopConstructionValidator.getInstance());
    }

    public Object replaceViewType(final org.dressdiscover.api.models.view_type.ViewType viewType) {
        return replaceViewType(com.google.common.base.Optional.fromNullable(viewType));
    }

    public Object replaceWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes) {
        return new Object(this.collectionId, this.institutionId, this.titles, this.agents, this.categories, this.closures, this.colors, this.components, this.condition, this.culturalContexts, this.dates, this.descriptions, this.gender, this.hidden, this.images, this.inscriptions, this.locations, this.materials, this.measurements, this.provenance, this.quantity, this.relations, this.rights, this.structures, this.subjects, this.techniques, this.textrefs, this.viewType, DefaultConstructionValidator.getInstance().validateWorkTypes(workTypes), NopConstructionValidator.getInstance());
    }

    public Object replaceWorkTypes(final org.dressdiscover.api.models.work_type.WorkTypeSet workTypes) {
        return replaceWorkTypes(com.google.common.base.Optional.fromNullable(workTypes));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("titles", getTitles()).add("agents", getAgents().orNull()).add("categories", getCategories().orNull()).add("closures", getClosures().orNull()).add("colors", getColors().orNull()).add("components", getComponents().orNull()).add("condition", getCondition().orNull()).add("cultural_contexts", getCulturalContexts().orNull()).add("dates", getDates().orNull()).add("descriptions", getDescriptions().orNull()).add("gender", getGender().orNull()).add("hidden", getHidden().orNull()).add("images", getImages().orNull()).add("inscriptions", getInscriptions().orNull()).add("locations", getLocations().orNull()).add("materials", getMaterials().orNull()).add("measurements", getMeasurements().orNull()).add("provenance", getProvenance().orNull()).add("quantity", getQuantity().orNull()).add("relations", getRelations().orNull()).add("rights", getRights().orNull()).add("structures", getStructures().orNull()).add("subjects", getSubjects().orNull()).add("techniques", getTechniques().orNull()).add("textrefs", getTextrefs().orNull()).add("view_type", getViewType().orNull()).add("work_types", getWorkTypes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 29);

        oprot.writeString(getCollectionId().toString());

        oprot.writeString(getInstitutionId().toString());

        getTitles().writeAsStruct(oprot);

        if (getAgents().isPresent()) {
            getAgents().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getCategories().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCategories().get().size());
            for (final String _iter0 : getCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getClosures().isPresent()) {
            getClosures().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getColors().isPresent()) {
            getColors().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getComponents().isPresent()) {
            getComponents().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getCondition().isPresent()) {
            oprot.writeEnum(getCondition().get());
        } else {
            oprot.writeNull();
        }

        if (getCulturalContexts().isPresent()) {
            getCulturalContexts().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getDates().isPresent()) {
            getDates().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getDescriptions().isPresent()) {
            getDescriptions().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getGender().isPresent()) {
            oprot.writeEnum(getGender().get());
        } else {
            oprot.writeNull();
        }

        if (getHidden().isPresent()) {
            oprot.writeBool(getHidden().get());
        } else {
            oprot.writeNull();
        }

        if (getImages().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getImages().get().size());
            for (final org.dressdiscover.api.models.image.Image _iter0 : getImages().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getInscriptions().isPresent()) {
            getInscriptions().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getLocations().isPresent()) {
            getLocations().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getMaterials().isPresent()) {
            getMaterials().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getMeasurements().isPresent()) {
            getMeasurements().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getProvenance().isPresent()) {
            oprot.writeString(getProvenance().get());
        } else {
            oprot.writeNull();
        }

        if (getQuantity().isPresent()) {
            oprot.writeU32(getQuantity().get());
        } else {
            oprot.writeNull();
        }

        if (getRelations().isPresent()) {
            getRelations().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getRights().isPresent()) {
            getRights().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getStructures().isPresent()) {
            getStructures().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getSubjects().isPresent()) {
            getSubjects().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getTechniques().isPresent()) {
            getTechniques().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getTextrefs().isPresent()) {
            getTextrefs().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getViewType().isPresent()) {
            oprot.writeEnum(getViewType().get());
        } else {
            oprot.writeNull();
        }

        if (getWorkTypes().isPresent()) {
            getWorkTypes().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.object.Object");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("collection_id", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getCollectionId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getInstitutionId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("titles", org.thryft.protocol.Type.STRUCT, (short)3);
        getTitles().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        if (getAgents().isPresent()) {
            oprot.writeFieldBegin("agents", org.thryft.protocol.Type.STRUCT, (short)20);
            getAgents().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getCategories().isPresent()) {
            oprot.writeFieldBegin("categories", org.thryft.protocol.Type.LIST, (short)18);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCategories().get().size());
            for (final String _iter0 : getCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getClosures().isPresent()) {
            oprot.writeFieldBegin("closures", org.thryft.protocol.Type.STRUCT, (short)34);
            getClosures().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getColors().isPresent()) {
            oprot.writeFieldBegin("colors", org.thryft.protocol.Type.STRUCT, (short)30);
            getColors().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getComponents().isPresent()) {
            oprot.writeFieldBegin("components", org.thryft.protocol.Type.STRUCT, (short)32);
            getComponents().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getCondition().isPresent()) {
            oprot.writeFieldBegin("condition", org.thryft.protocol.Type.STRING, (short)27);
            oprot.writeEnum(getCondition().get());
            oprot.writeFieldEnd();
        }

        if (getCulturalContexts().isPresent()) {
            oprot.writeFieldBegin("cultural_contexts", org.thryft.protocol.Type.STRUCT, (short)35);
            getCulturalContexts().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getDates().isPresent()) {
            oprot.writeFieldBegin("dates", org.thryft.protocol.Type.STRUCT, (short)10);
            getDates().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getDescriptions().isPresent()) {
            oprot.writeFieldBegin("descriptions", org.thryft.protocol.Type.STRUCT, (short)4);
            getDescriptions().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getGender().isPresent()) {
            oprot.writeFieldBegin("gender", org.thryft.protocol.Type.STRING, (short)25);
            oprot.writeEnum(getGender().get());
            oprot.writeFieldEnd();
        }

        if (getHidden().isPresent()) {
            oprot.writeFieldBegin("hidden", org.thryft.protocol.Type.BOOL, (short)37);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }

        if (getImages().isPresent()) {
            oprot.writeFieldBegin("images", org.thryft.protocol.Type.LIST, (short)23);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getImages().get().size());
            for (final org.dressdiscover.api.models.image.Image _iter0 : getImages().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getInscriptions().isPresent()) {
            oprot.writeFieldBegin("inscriptions", org.thryft.protocol.Type.STRUCT, (short)17);
            getInscriptions().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getLocations().isPresent()) {
            oprot.writeFieldBegin("locations", org.thryft.protocol.Type.STRUCT, (short)36);
            getLocations().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getMaterials().isPresent()) {
            oprot.writeFieldBegin("materials", org.thryft.protocol.Type.STRUCT, (short)15);
            getMaterials().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getMeasurements().isPresent()) {
            oprot.writeFieldBegin("measurements", org.thryft.protocol.Type.STRUCT, (short)31);
            getMeasurements().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getProvenance().isPresent()) {
            oprot.writeFieldBegin("provenance", org.thryft.protocol.Type.STRING, (short)5);
            oprot.writeString(getProvenance().get());
            oprot.writeFieldEnd();
        }

        if (getQuantity().isPresent()) {
            oprot.writeFieldBegin("quantity", org.thryft.protocol.Type.I32, (short)26);
            oprot.writeU32(getQuantity().get());
            oprot.writeFieldEnd();
        }

        if (getRelations().isPresent()) {
            oprot.writeFieldBegin("relations", org.thryft.protocol.Type.STRUCT, (short)29);
            getRelations().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getRights().isPresent()) {
            oprot.writeFieldBegin("rights", org.thryft.protocol.Type.STRUCT, (short)22);
            getRights().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getStructures().isPresent()) {
            oprot.writeFieldBegin("structures", org.thryft.protocol.Type.STRUCT, (short)33);
            getStructures().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getSubjects().isPresent()) {
            oprot.writeFieldBegin("subjects", org.thryft.protocol.Type.STRUCT, (short)21);
            getSubjects().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getTechniques().isPresent()) {
            oprot.writeFieldBegin("techniques", org.thryft.protocol.Type.STRUCT, (short)16);
            getTechniques().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getTextrefs().isPresent()) {
            oprot.writeFieldBegin("textrefs", org.thryft.protocol.Type.STRUCT, (short)9);
            getTextrefs().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getViewType().isPresent()) {
            oprot.writeFieldBegin("view_type", org.thryft.protocol.Type.STRING, (short)28);
            oprot.writeEnum(getViewType().get());
            oprot.writeFieldEnd();
        }

        if (getWorkTypes().isPresent()) {
            oprot.writeFieldBegin("work_types", org.thryft.protocol.Type.STRUCT, (short)24);
            getWorkTypes().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final org.dressdiscover.api.models.collection.CollectionId collectionId;

    private final org.dressdiscover.api.models.institution.InstitutionId institutionId;

    private final org.dressdiscover.api.models.title.TitleSet titles;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.agent.AgentSet> agents;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.closure.ClosureSet> closures;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.color.ColorSet> colors;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.component.ComponentSet> components;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.condition.Condition> condition;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.cultural_context.CulturalContextSet> culturalContexts;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.date.DateSet> dates;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.description.DescriptionSet> descriptions;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender;

    private final com.google.common.base.Optional<Boolean> hidden;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.inscription.InscriptionSet> inscriptions;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.location.LocationSet> locations;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.material.MaterialSet> materials;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.measurements.MeasurementsSet> measurements;

    /**
     * Dublin Core freetext provenance
     */
    private final com.google.common.base.Optional<String> provenance;

    private final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.relation.RelationSet> relations;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.rights.RightsSet> rights;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.structure.StructureSet> structures;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.subject.SubjectSet> subjects;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.technique.TechniqueSet> techniques;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.textref.TextrefSet> textrefs;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.view_type.ViewType> viewType;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.work_type.WorkTypeSet> workTypes;
}
