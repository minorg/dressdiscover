package net.lab1318.costume.api.models.object;

public class Object implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public static class Builder {
        public Builder() {
            collectionId = null;
            institutionId = null;
            modelMetadata = null;
            titles = null;
            agents = com.google.common.base.Optional.absent();
            categories = com.google.common.base.Optional.absent();
            condition = com.google.common.base.Optional.absent();
            dates = com.google.common.base.Optional.absent();
            descriptions = com.google.common.base.Optional.absent();
            gender = com.google.common.base.Optional.absent();
            images = com.google.common.base.Optional.absent();
            inscriptions = com.google.common.base.Optional.absent();
            materials = com.google.common.base.Optional.absent();
            provenance = com.google.common.base.Optional.absent();
            quantity = com.google.common.base.Optional.absent();
            rights = com.google.common.base.Optional.absent();
            subjects = com.google.common.base.Optional.absent();
            techniques = com.google.common.base.Optional.absent();
            textrefs = com.google.common.base.Optional.absent();
            viewType = com.google.common.base.Optional.absent();
            workTypes = com.google.common.base.Optional.absent();
        }

        public Builder(final Object other) {
            this.collectionId = other.getCollectionId();
            this.institutionId = other.getInstitutionId();
            this.modelMetadata = other.getModelMetadata();
            this.titles = other.getTitles();
            this.agents = other.getAgents();
            this.categories = other.getCategories();
            this.condition = other.getCondition();
            this.dates = other.getDates();
            this.descriptions = other.getDescriptions();
            this.gender = other.getGender();
            this.images = other.getImages();
            this.inscriptions = other.getInscriptions();
            this.materials = other.getMaterials();
            this.provenance = other.getProvenance();
            this.quantity = other.getQuantity();
            this.rights = other.getRights();
            this.subjects = other.getSubjects();
            this.techniques = other.getTechniques();
            this.textrefs = other.getTextrefs();
            this.viewType = other.getViewType();
            this.workTypes = other.getWorkTypes();
        }

        protected Object _build(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final net.lab1318.costume.api.models.title.TitleSet titles, final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentSet> agents, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<net.lab1318.costume.api.models.condition.Condition> condition, final com.google.common.base.Optional<net.lab1318.costume.api.models.date.DateSet> dates, final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionSet> descriptions, final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>> images, final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionSet> inscriptions, final com.google.common.base.Optional<net.lab1318.costume.api.models.material.MaterialSet> materials, final com.google.common.base.Optional<String> provenance, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity, final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights, final com.google.common.base.Optional<net.lab1318.costume.api.models.subject.SubjectSet> subjects, final com.google.common.base.Optional<net.lab1318.costume.api.models.technique.TechniqueSet> techniques, final com.google.common.base.Optional<net.lab1318.costume.api.models.textref.TextrefSet> textrefs, final com.google.common.base.Optional<net.lab1318.costume.api.models.view_type.ViewType> viewType, final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
            return new Object(collectionId, institutionId, modelMetadata, titles, agents, categories, condition, dates, descriptions, gender, images, inscriptions, materials, provenance, quantity, rights, subjects, techniques, textrefs, viewType, workTypes);
        }

        public Object build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.Object: missing collectionId"), com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId"), com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.object.Object: missing modelMetadata"), com.google.common.base.Preconditions.checkNotNull(titles, "net.lab1318.costume.api.models.object.Object: missing titles"), com.google.common.base.Preconditions.checkNotNull(agents, "net.lab1318.costume.api.models.object.Object: missing agents"), com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.models.object.Object: missing categories"), com.google.common.base.Preconditions.checkNotNull(condition, "net.lab1318.costume.api.models.object.Object: missing condition"), com.google.common.base.Preconditions.checkNotNull(dates, "net.lab1318.costume.api.models.object.Object: missing dates"), com.google.common.base.Preconditions.checkNotNull(descriptions, "net.lab1318.costume.api.models.object.Object: missing descriptions"), com.google.common.base.Preconditions.checkNotNull(gender, "net.lab1318.costume.api.models.object.Object: missing gender"), com.google.common.base.Preconditions.checkNotNull(images, "net.lab1318.costume.api.models.object.Object: missing images"), com.google.common.base.Preconditions.checkNotNull(inscriptions, "net.lab1318.costume.api.models.object.Object: missing inscriptions"), com.google.common.base.Preconditions.checkNotNull(materials, "net.lab1318.costume.api.models.object.Object: missing materials"), com.google.common.base.Preconditions.checkNotNull(provenance, "net.lab1318.costume.api.models.object.Object: missing provenance"), com.google.common.base.Preconditions.checkNotNull(quantity, "net.lab1318.costume.api.models.object.Object: missing quantity"), com.google.common.base.Preconditions.checkNotNull(rights, "net.lab1318.costume.api.models.object.Object: missing rights"), com.google.common.base.Preconditions.checkNotNull(subjects, "net.lab1318.costume.api.models.object.Object: missing subjects"), com.google.common.base.Preconditions.checkNotNull(techniques, "net.lab1318.costume.api.models.object.Object: missing techniques"), com.google.common.base.Preconditions.checkNotNull(textrefs, "net.lab1318.costume.api.models.object.Object: missing textrefs"), com.google.common.base.Preconditions.checkNotNull(viewType, "net.lab1318.costume.api.models.object.Object: missing viewType"), com.google.common.base.Preconditions.checkNotNull(workTypes, "net.lab1318.costume.api.models.object.Object: missing workTypes"));
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentSet> getAgents() {
            return agents;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCategories() {
            return categories;
        }

        public final net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
            return collectionId;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.condition.Condition> getCondition() {
            return condition;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.date.DateSet> getDates() {
            return dates;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionSet> getDescriptions() {
            return descriptions;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> getGender() {
            return gender;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>> getImages() {
            return images;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionSet> getInscriptions() {
            return inscriptions;
        }

        public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
            return institutionId;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.material.MaterialSet> getMaterials() {
            return materials;
        }

        public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
            return modelMetadata;
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

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> getRights() {
            return rights;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.subject.SubjectSet> getSubjects() {
            return subjects;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.technique.TechniqueSet> getTechniques() {
            return techniques;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.textref.TextrefSet> getTextrefs() {
            return textrefs;
        }

        public final net.lab1318.costume.api.models.title.TitleSet getTitles() {
            return titles;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.view_type.ViewType> getViewType() {
            return viewType;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> getWorkTypes() {
            return workTypes;
        }

        public Builder readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            switch (type) {
            case LIST:
                return readAsList(iprot);
            case STRUCT:
                return readAsStruct(iprot);
            default:
                throw new IllegalArgumentException("cannot read as " + type);
            }
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            try {
                institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
            titles = net.lab1318.costume.api.models.title.TitleSet.readAsStruct(iprot);
            if (__list.getSize() > 4) {
                agents = com.google.common.base.Optional.of(net.lab1318.costume.api.models.agent.AgentSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 5) {
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
                }
            }
            if (__list.getSize() > 6) {
                try {
                    condition = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.condition.Condition.class));
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 7) {
                dates = com.google.common.base.Optional.of(net.lab1318.costume.api.models.date.DateSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 8) {
                descriptions = com.google.common.base.Optional.of(net.lab1318.costume.api.models.description.DescriptionSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 9) {
                try {
                    gender = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 10) {
                try {
                    images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.image.Image.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 11) {
                inscriptions = com.google.common.base.Optional.of(net.lab1318.costume.api.models.inscription.InscriptionSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 12) {
                materials = com.google.common.base.Optional.of(net.lab1318.costume.api.models.material.MaterialSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 13) {
                provenance = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 14) {
                try {
                    quantity = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 15) {
                rights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 16) {
                subjects = com.google.common.base.Optional.of(net.lab1318.costume.api.models.subject.SubjectSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 17) {
                techniques = com.google.common.base.Optional.of(net.lab1318.costume.api.models.technique.TechniqueSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 18) {
                textrefs = com.google.common.base.Optional.of(net.lab1318.costume.api.models.textref.TextrefSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 19) {
                try {
                    viewType = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.view_type.ViewType.class));
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 20) {
                workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
            }
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
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
                            collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
                        }
                    }
                    break;
                }
                case "institution_id": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
                        }
                    }
                    break;
                }
                case "model_metadata": {
                    if (!ifield.hasId() || ifield.getId() == 14) {
                        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
                    }
                    break;
                }
                case "titles": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        titles = net.lab1318.costume.api.models.title.TitleSet.readAsStruct(iprot);
                    }
                    break;
                }
                case "agents": {
                    if (!ifield.hasId() || ifield.getId() == 20) {
                        agents = com.google.common.base.Optional.of(net.lab1318.costume.api.models.agent.AgentSet.readAsStruct(iprot));
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
                        }
                    }
                    break;
                }
                case "condition": {
                    if (!ifield.hasId() || ifield.getId() == 27) {
                        try {
                            condition = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.condition.Condition.class));
                        } catch (final IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "dates": {
                    if (!ifield.hasId() || ifield.getId() == 10) {
                        dates = com.google.common.base.Optional.of(net.lab1318.costume.api.models.date.DateSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "descriptions": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        descriptions = com.google.common.base.Optional.of(net.lab1318.costume.api.models.description.DescriptionSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "gender": {
                    if (!ifield.hasId() || ifield.getId() == 25) {
                        try {
                            gender = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                        } catch (final IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "images": {
                    if (!ifield.hasId() || ifield.getId() == 23) {
                        try {
                            images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(net.lab1318.costume.api.models.image.Image.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                        }
                    }
                    break;
                }
                case "inscriptions": {
                    if (!ifield.hasId() || ifield.getId() == 17) {
                        inscriptions = com.google.common.base.Optional.of(net.lab1318.costume.api.models.inscription.InscriptionSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "materials": {
                    if (!ifield.hasId() || ifield.getId() == 15) {
                        materials = com.google.common.base.Optional.of(net.lab1318.costume.api.models.material.MaterialSet.readAsStruct(iprot));
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
                case "rights": {
                    if (!ifield.hasId() || ifield.getId() == 22) {
                        rights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "subjects": {
                    if (!ifield.hasId() || ifield.getId() == 21) {
                        subjects = com.google.common.base.Optional.of(net.lab1318.costume.api.models.subject.SubjectSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "techniques": {
                    if (!ifield.hasId() || ifield.getId() == 16) {
                        techniques = com.google.common.base.Optional.of(net.lab1318.costume.api.models.technique.TechniqueSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "textrefs": {
                    if (!ifield.hasId() || ifield.getId() == 9) {
                        textrefs = com.google.common.base.Optional.of(net.lab1318.costume.api.models.textref.TextrefSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "view_type": {
                    if (!ifield.hasId() || ifield.getId() == 28) {
                        try {
                            viewType = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.view_type.ViewType.class));
                        } catch (final IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "work_types": {
                    if (!ifield.hasId() || ifield.getId() == 24) {
                        workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setAgents(final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentSet> agents) {
            this.agents = com.google.common.base.Preconditions.checkNotNull(agents);
            return this;
        }

        public Builder setAgents(@javax.annotation.Nullable final net.lab1318.costume.api.models.agent.AgentSet agents) {
            this.agents = com.google.common.base.Optional.fromNullable(agents);
            return this;
        }

        public Builder setCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
            this.categories = com.google.common.base.Preconditions.checkNotNull(categories);
            return this;
        }

        public Builder setCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> categories) {
            this.categories = com.google.common.base.Optional.fromNullable(categories);
            return this;
        }

        public Builder setCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
            this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId);
            return this;
        }

        public Builder setCondition(final com.google.common.base.Optional<net.lab1318.costume.api.models.condition.Condition> condition) {
            this.condition = com.google.common.base.Preconditions.checkNotNull(condition);
            return this;
        }

        public Builder setCondition(@javax.annotation.Nullable final net.lab1318.costume.api.models.condition.Condition condition) {
            this.condition = com.google.common.base.Optional.fromNullable(condition);
            return this;
        }

        public Builder setDates(final com.google.common.base.Optional<net.lab1318.costume.api.models.date.DateSet> dates) {
            this.dates = com.google.common.base.Preconditions.checkNotNull(dates);
            return this;
        }

        public Builder setDates(@javax.annotation.Nullable final net.lab1318.costume.api.models.date.DateSet dates) {
            this.dates = com.google.common.base.Optional.fromNullable(dates);
            return this;
        }

        public Builder setDescriptions(final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionSet> descriptions) {
            this.descriptions = com.google.common.base.Preconditions.checkNotNull(descriptions);
            return this;
        }

        public Builder setDescriptions(@javax.annotation.Nullable final net.lab1318.costume.api.models.description.DescriptionSet descriptions) {
            this.descriptions = com.google.common.base.Optional.fromNullable(descriptions);
            return this;
        }

        public Builder setGender(final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender) {
            this.gender = com.google.common.base.Preconditions.checkNotNull(gender);
            return this;
        }

        public Builder setGender(@javax.annotation.Nullable final net.lab1318.costume.api.models.gender.Gender gender) {
            this.gender = com.google.common.base.Optional.fromNullable(gender);
            return this;
        }

        public Builder setIfPresent(final Object other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCollectionId(other.getCollectionId());
            setInstitutionId(other.getInstitutionId());
            setModelMetadata(other.getModelMetadata());
            setTitles(other.getTitles());
            if (other.getAgents().isPresent()) {
                setAgents(other.getAgents());
            }
            if (other.getCategories().isPresent()) {
                setCategories(other.getCategories());
            }
            if (other.getCondition().isPresent()) {
                setCondition(other.getCondition());
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
            if (other.getImages().isPresent()) {
                setImages(other.getImages());
            }
            if (other.getInscriptions().isPresent()) {
                setInscriptions(other.getInscriptions());
            }
            if (other.getMaterials().isPresent()) {
                setMaterials(other.getMaterials());
            }
            if (other.getProvenance().isPresent()) {
                setProvenance(other.getProvenance());
            }
            if (other.getQuantity().isPresent()) {
                setQuantity(other.getQuantity());
            }
            if (other.getRights().isPresent()) {
                setRights(other.getRights());
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

        public Builder setImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>> images) {
            this.images = com.google.common.base.Preconditions.checkNotNull(images);
            return this;
        }

        public Builder setImages(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image> images) {
            this.images = com.google.common.base.Optional.fromNullable(images);
            return this;
        }

        public Builder setInscriptions(final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionSet> inscriptions) {
            this.inscriptions = com.google.common.base.Preconditions.checkNotNull(inscriptions);
            return this;
        }

        public Builder setInscriptions(@javax.annotation.Nullable final net.lab1318.costume.api.models.inscription.InscriptionSet inscriptions) {
            this.inscriptions = com.google.common.base.Optional.fromNullable(inscriptions);
            return this;
        }

        public Builder setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
            this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId);
            return this;
        }

        public Builder setMaterials(final com.google.common.base.Optional<net.lab1318.costume.api.models.material.MaterialSet> materials) {
            this.materials = com.google.common.base.Preconditions.checkNotNull(materials);
            return this;
        }

        public Builder setMaterials(@javax.annotation.Nullable final net.lab1318.costume.api.models.material.MaterialSet materials) {
            this.materials = com.google.common.base.Optional.fromNullable(materials);
            return this;
        }

        public Builder setModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
            this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata);
            return this;
        }

        public Builder setProvenance(final com.google.common.base.Optional<String> provenance) {
            this.provenance = com.google.common.base.Preconditions.checkNotNull(provenance);
            return this;
        }

        public Builder setProvenance(@javax.annotation.Nullable final String provenance) {
            this.provenance = com.google.common.base.Optional.fromNullable(provenance);
            return this;
        }

        public Builder setQuantity(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity) {
            this.quantity = com.google.common.base.Preconditions.checkNotNull(quantity);
            return this;
        }

        public Builder setQuantity(@javax.annotation.Nullable final com.google.common.primitives.UnsignedInteger quantity) {
            this.quantity = com.google.common.base.Optional.fromNullable(quantity);
            return this;
        }

        public Builder setRights(final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights) {
            this.rights = com.google.common.base.Preconditions.checkNotNull(rights);
            return this;
        }

        public Builder setRights(@javax.annotation.Nullable final net.lab1318.costume.api.models.rights.RightsSet rights) {
            this.rights = com.google.common.base.Optional.fromNullable(rights);
            return this;
        }

        public Builder setSubjects(final com.google.common.base.Optional<net.lab1318.costume.api.models.subject.SubjectSet> subjects) {
            this.subjects = com.google.common.base.Preconditions.checkNotNull(subjects);
            return this;
        }

        public Builder setSubjects(@javax.annotation.Nullable final net.lab1318.costume.api.models.subject.SubjectSet subjects) {
            this.subjects = com.google.common.base.Optional.fromNullable(subjects);
            return this;
        }

        public Builder setTechniques(final com.google.common.base.Optional<net.lab1318.costume.api.models.technique.TechniqueSet> techniques) {
            this.techniques = com.google.common.base.Preconditions.checkNotNull(techniques);
            return this;
        }

        public Builder setTechniques(@javax.annotation.Nullable final net.lab1318.costume.api.models.technique.TechniqueSet techniques) {
            this.techniques = com.google.common.base.Optional.fromNullable(techniques);
            return this;
        }

        public Builder setTextrefs(final com.google.common.base.Optional<net.lab1318.costume.api.models.textref.TextrefSet> textrefs) {
            this.textrefs = com.google.common.base.Preconditions.checkNotNull(textrefs);
            return this;
        }

        public Builder setTextrefs(@javax.annotation.Nullable final net.lab1318.costume.api.models.textref.TextrefSet textrefs) {
            this.textrefs = com.google.common.base.Optional.fromNullable(textrefs);
            return this;
        }

        public Builder setTitles(final net.lab1318.costume.api.models.title.TitleSet titles) {
            this.titles = com.google.common.base.Preconditions.checkNotNull(titles);
            return this;
        }

        public Builder setViewType(final com.google.common.base.Optional<net.lab1318.costume.api.models.view_type.ViewType> viewType) {
            this.viewType = com.google.common.base.Preconditions.checkNotNull(viewType);
            return this;
        }

        public Builder setViewType(@javax.annotation.Nullable final net.lab1318.costume.api.models.view_type.ViewType viewType) {
            this.viewType = com.google.common.base.Optional.fromNullable(viewType);
            return this;
        }

        public Builder setWorkTypes(final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
            this.workTypes = com.google.common.base.Preconditions.checkNotNull(workTypes);
            return this;
        }

        public Builder setWorkTypes(@javax.annotation.Nullable final net.lab1318.costume.api.models.work_type.WorkTypeSet workTypes) {
            this.workTypes = com.google.common.base.Optional.fromNullable(workTypes);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "collection_id": setCollectionId((net.lab1318.costume.api.models.collection.CollectionId)value); return this;
            case "institution_id": setInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
            case "model_metadata": setModelMetadata((net.lab1318.costume.api.models.ModelMetadata)value); return this;
            case "titles": setTitles((net.lab1318.costume.api.models.title.TitleSet)value); return this;
            case "agents": setAgents((net.lab1318.costume.api.models.agent.AgentSet)value); return this;
            case "categories": setCategories((com.google.common.collect.ImmutableList<String>)value); return this;
            case "condition": setCondition((net.lab1318.costume.api.models.condition.Condition)value); return this;
            case "dates": setDates((net.lab1318.costume.api.models.date.DateSet)value); return this;
            case "descriptions": setDescriptions((net.lab1318.costume.api.models.description.DescriptionSet)value); return this;
            case "gender": setGender((net.lab1318.costume.api.models.gender.Gender)value); return this;
            case "images": setImages((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>)value); return this;
            case "inscriptions": setInscriptions((net.lab1318.costume.api.models.inscription.InscriptionSet)value); return this;
            case "materials": setMaterials((net.lab1318.costume.api.models.material.MaterialSet)value); return this;
            case "provenance": setProvenance((String)value); return this;
            case "quantity": setQuantity((com.google.common.primitives.UnsignedInteger)value); return this;
            case "rights": setRights((net.lab1318.costume.api.models.rights.RightsSet)value); return this;
            case "subjects": setSubjects((net.lab1318.costume.api.models.subject.SubjectSet)value); return this;
            case "techniques": setTechniques((net.lab1318.costume.api.models.technique.TechniqueSet)value); return this;
            case "textrefs": setTextrefs((net.lab1318.costume.api.models.textref.TextrefSet)value); return this;
            case "view_type": setViewType((net.lab1318.costume.api.models.view_type.ViewType)value); return this;
            case "work_types": setWorkTypes((net.lab1318.costume.api.models.work_type.WorkTypeSet)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetAgents() {
            this.agents = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetCategories() {
            this.categories = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetCollectionId() {
            this.collectionId = null;
            return this;
        }

        public Builder unsetCondition() {
            this.condition = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetDates() {
            this.dates = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetDescriptions() {
            this.descriptions = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetGender() {
            this.gender = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetImages() {
            this.images = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetInscriptions() {
            this.inscriptions = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetInstitutionId() {
            this.institutionId = null;
            return this;
        }

        public Builder unsetMaterials() {
            this.materials = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetModelMetadata() {
            this.modelMetadata = null;
            return this;
        }

        public Builder unsetProvenance() {
            this.provenance = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetQuantity() {
            this.quantity = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetRights() {
            this.rights = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetSubjects() {
            this.subjects = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetTechniques() {
            this.techniques = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetTextrefs() {
            this.textrefs = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetTitles() {
            this.titles = null;
            return this;
        }

        public Builder unsetViewType() {
            this.viewType = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetWorkTypes() {
            this.workTypes = com.google.common.base.Optional.absent();
            return this;
        }

        private net.lab1318.costume.api.models.collection.CollectionId collectionId;
        private net.lab1318.costume.api.models.institution.InstitutionId institutionId;
        private net.lab1318.costume.api.models.ModelMetadata modelMetadata;
        private net.lab1318.costume.api.models.title.TitleSet titles;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentSet> agents;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.condition.Condition> condition;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.date.DateSet> dates;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionSet> descriptions;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>> images;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionSet> inscriptions;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.material.MaterialSet> materials;
        /**
         * Dublin Core freetext provenance
         */
        private com.google.common.base.Optional<String> provenance;
        private com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.subject.SubjectSet> subjects;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.technique.TechniqueSet> techniques;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.textref.TextrefSet> textrefs;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.view_type.ViewType> viewType;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 1, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 2, "institution_id", org.thryft.protocol.Type.STRING),
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.ModelMetadata>() {}, true, 14, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLES("titles", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.title.TitleSet>() {}, true, 3, "titles", org.thryft.protocol.Type.STRUCT),
        AGENTS("agents", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.agent.AgentSet>() {}, false, 20, "agents", org.thryft.protocol.Type.STRUCT),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 18, "categories", org.thryft.protocol.Type.LIST),
        CONDITION("condition", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.condition.Condition>() {}, false, 27, "condition", org.thryft.protocol.Type.STRING),
        DATES("dates", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.date.DateSet>() {}, false, 10, "dates", org.thryft.protocol.Type.STRUCT),
        DESCRIPTIONS("descriptions", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.description.DescriptionSet>() {}, false, 4, "descriptions", org.thryft.protocol.Type.STRUCT),
        GENDER("gender", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.gender.Gender>() {}, false, 25, "gender", org.thryft.protocol.Type.STRING),
        IMAGES("images", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>>() {}, false, 23, "images", org.thryft.protocol.Type.LIST),
        INSCRIPTIONS("inscriptions", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.inscription.InscriptionSet>() {}, false, 17, "inscriptions", org.thryft.protocol.Type.STRUCT),
        MATERIALS("materials", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.material.MaterialSet>() {}, false, 15, "materials", org.thryft.protocol.Type.STRUCT),
        PROVENANCE("provenance", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "provenance", org.thryft.protocol.Type.STRING),
        QUANTITY("quantity", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 26, "quantity", org.thryft.protocol.Type.I32),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.rights.RightsSet>() {}, false, 22, "rights", org.thryft.protocol.Type.STRUCT),
        SUBJECTS("subjects", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.subject.SubjectSet>() {}, false, 21, "subjects", org.thryft.protocol.Type.STRUCT),
        TECHNIQUES("techniques", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.technique.TechniqueSet>() {}, false, 16, "techniques", org.thryft.protocol.Type.STRUCT),
        TEXTREFS("textrefs", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.textref.TextrefSet>() {}, false, 9, "textrefs", org.thryft.protocol.Type.STRUCT),
        VIEW_TYPE("viewType", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.view_type.ViewType>() {}, false, 28, "view_type", org.thryft.protocol.Type.STRING),
        WORK_TYPES("workTypes", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.work_type.WorkTypeSet>() {}, false, 24, "work_types", org.thryft.protocol.Type.STRUCT);

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
            case "modelMetadata": return MODEL_METADATA;
            case "titles": return TITLES;
            case "agents": return AGENTS;
            case "categories": return CATEGORIES;
            case "condition": return CONDITION;
            case "dates": return DATES;
            case "descriptions": return DESCRIPTIONS;
            case "gender": return GENDER;
            case "images": return IMAGES;
            case "inscriptions": return INSCRIPTIONS;
            case "materials": return MATERIALS;
            case "provenance": return PROVENANCE;
            case "quantity": return QUANTITY;
            case "rights": return RIGHTS;
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
            case "model_metadata": return MODEL_METADATA;
            case "titles": return TITLES;
            case "agents": return AGENTS;
            case "categories": return CATEGORIES;
            case "condition": return CONDITION;
            case "dates": return DATES;
            case "descriptions": return DESCRIPTIONS;
            case "gender": return GENDER;
            case "images": return IMAGES;
            case "inscriptions": return INSCRIPTIONS;
            case "materials": return MATERIALS;
            case "provenance": return PROVENANCE;
            case "quantity": return QUANTITY;
            case "rights": return RIGHTS;
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

    /**
     * Copy constructor
     */
    public Object(final Object other) {
        this(other.getCollectionId(), other.getInstitutionId(), other.getModelMetadata(), other.getTitles(), other.getAgents(), other.getCategories(), other.getCondition(), other.getDates(), other.getDescriptions(), other.getGender(), other.getImages(), other.getInscriptions(), other.getMaterials(), other.getProvenance(), other.getQuantity(), other.getRights(), other.getSubjects(), other.getTechniques(), other.getTextrefs(), other.getViewType(), other.getWorkTypes());
    }

    /**
     * Required constructor
     */
    public Object(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final net.lab1318.costume.api.models.title.TitleSet titles) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.Object: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.object.Object: missing modelMetadata");
        this.titles = com.google.common.base.Preconditions.checkNotNull(titles, "net.lab1318.costume.api.models.object.Object: missing titles");
        this.agents = com.google.common.base.Optional.absent();
        this.categories = com.google.common.base.Optional.absent();
        this.condition = com.google.common.base.Optional.absent();
        this.dates = com.google.common.base.Optional.absent();
        this.descriptions = com.google.common.base.Optional.absent();
        this.gender = com.google.common.base.Optional.absent();
        this.images = com.google.common.base.Optional.absent();
        this.inscriptions = com.google.common.base.Optional.absent();
        this.materials = com.google.common.base.Optional.absent();
        this.provenance = com.google.common.base.Optional.absent();
        this.quantity = com.google.common.base.Optional.absent();
        this.rights = com.google.common.base.Optional.absent();
        this.subjects = com.google.common.base.Optional.absent();
        this.techniques = com.google.common.base.Optional.absent();
        this.textrefs = com.google.common.base.Optional.absent();
        this.viewType = com.google.common.base.Optional.absent();
        this.workTypes = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public Object(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final net.lab1318.costume.api.models.title.TitleSet titles, final @javax.annotation.Nullable net.lab1318.costume.api.models.agent.AgentSet agents, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> categories, final @javax.annotation.Nullable net.lab1318.costume.api.models.condition.Condition condition, final @javax.annotation.Nullable net.lab1318.costume.api.models.date.DateSet dates, final @javax.annotation.Nullable net.lab1318.costume.api.models.description.DescriptionSet descriptions, final @javax.annotation.Nullable net.lab1318.costume.api.models.gender.Gender gender, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image> images, final @javax.annotation.Nullable net.lab1318.costume.api.models.inscription.InscriptionSet inscriptions, final @javax.annotation.Nullable net.lab1318.costume.api.models.material.MaterialSet materials, final @javax.annotation.Nullable String provenance, final @javax.annotation.Nullable com.google.common.primitives.UnsignedInteger quantity, final @javax.annotation.Nullable net.lab1318.costume.api.models.rights.RightsSet rights, final @javax.annotation.Nullable net.lab1318.costume.api.models.subject.SubjectSet subjects, final @javax.annotation.Nullable net.lab1318.costume.api.models.technique.TechniqueSet techniques, final @javax.annotation.Nullable net.lab1318.costume.api.models.textref.TextrefSet textrefs, final @javax.annotation.Nullable net.lab1318.costume.api.models.view_type.ViewType viewType, final @javax.annotation.Nullable net.lab1318.costume.api.models.work_type.WorkTypeSet workTypes) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.Object: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.object.Object: missing modelMetadata");
        this.titles = com.google.common.base.Preconditions.checkNotNull(titles, "net.lab1318.costume.api.models.object.Object: missing titles");
        this.agents = com.google.common.base.Optional.fromNullable(agents);
        this.categories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(categories), "net.lab1318.costume.api.models.object.Object: categories is empty");
        this.condition = com.google.common.base.Optional.fromNullable(condition);
        this.dates = com.google.common.base.Optional.fromNullable(dates);
        this.descriptions = com.google.common.base.Optional.fromNullable(descriptions);
        this.gender = com.google.common.base.Optional.fromNullable(gender);
        this.images = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(images), "net.lab1318.costume.api.models.object.Object: images is empty");
        this.inscriptions = com.google.common.base.Optional.fromNullable(inscriptions);
        this.materials = com.google.common.base.Optional.fromNullable(materials);
        this.provenance = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(provenance), "net.lab1318.costume.api.models.object.Object: provenance is empty");
        this.quantity = com.google.common.base.Optional.fromNullable(quantity);
        this.rights = com.google.common.base.Optional.fromNullable(rights);
        this.subjects = com.google.common.base.Optional.fromNullable(subjects);
        this.techniques = com.google.common.base.Optional.fromNullable(techniques);
        this.textrefs = com.google.common.base.Optional.fromNullable(textrefs);
        this.viewType = com.google.common.base.Optional.fromNullable(viewType);
        this.workTypes = com.google.common.base.Optional.fromNullable(workTypes);
    }

    /**
     * Optional constructor
     */
    public Object(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final net.lab1318.costume.api.models.title.TitleSet titles, final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentSet> agents, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<net.lab1318.costume.api.models.condition.Condition> condition, final com.google.common.base.Optional<net.lab1318.costume.api.models.date.DateSet> dates, final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionSet> descriptions, final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>> images, final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionSet> inscriptions, final com.google.common.base.Optional<net.lab1318.costume.api.models.material.MaterialSet> materials, final com.google.common.base.Optional<String> provenance, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity, final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights, final com.google.common.base.Optional<net.lab1318.costume.api.models.subject.SubjectSet> subjects, final com.google.common.base.Optional<net.lab1318.costume.api.models.technique.TechniqueSet> techniques, final com.google.common.base.Optional<net.lab1318.costume.api.models.textref.TextrefSet> textrefs, final com.google.common.base.Optional<net.lab1318.costume.api.models.view_type.ViewType> viewType, final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.Object: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.Object: missing institutionId");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.object.Object: missing modelMetadata");
        this.titles = com.google.common.base.Preconditions.checkNotNull(titles, "net.lab1318.costume.api.models.object.Object: missing titles");
        this.agents = com.google.common.base.Preconditions.checkNotNull(agents, "net.lab1318.costume.api.models.object.Object: missing agents");
        this.categories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.models.object.Object: missing categories"), "net.lab1318.costume.api.models.object.Object: categories is empty");
        this.condition = com.google.common.base.Preconditions.checkNotNull(condition, "net.lab1318.costume.api.models.object.Object: missing condition");
        this.dates = com.google.common.base.Preconditions.checkNotNull(dates, "net.lab1318.costume.api.models.object.Object: missing dates");
        this.descriptions = com.google.common.base.Preconditions.checkNotNull(descriptions, "net.lab1318.costume.api.models.object.Object: missing descriptions");
        this.gender = com.google.common.base.Preconditions.checkNotNull(gender, "net.lab1318.costume.api.models.object.Object: missing gender");
        this.images = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(images, "net.lab1318.costume.api.models.object.Object: missing images"), "net.lab1318.costume.api.models.object.Object: images is empty");
        this.inscriptions = com.google.common.base.Preconditions.checkNotNull(inscriptions, "net.lab1318.costume.api.models.object.Object: missing inscriptions");
        this.materials = com.google.common.base.Preconditions.checkNotNull(materials, "net.lab1318.costume.api.models.object.Object: missing materials");
        this.provenance = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(provenance, "net.lab1318.costume.api.models.object.Object: missing provenance"), "net.lab1318.costume.api.models.object.Object: provenance is empty");
        this.quantity = com.google.common.base.Preconditions.checkNotNull(quantity, "net.lab1318.costume.api.models.object.Object: missing quantity");
        this.rights = com.google.common.base.Preconditions.checkNotNull(rights, "net.lab1318.costume.api.models.object.Object: missing rights");
        this.subjects = com.google.common.base.Preconditions.checkNotNull(subjects, "net.lab1318.costume.api.models.object.Object: missing subjects");
        this.techniques = com.google.common.base.Preconditions.checkNotNull(techniques, "net.lab1318.costume.api.models.object.Object: missing techniques");
        this.textrefs = com.google.common.base.Preconditions.checkNotNull(textrefs, "net.lab1318.costume.api.models.object.Object: missing textrefs");
        this.viewType = com.google.common.base.Preconditions.checkNotNull(viewType, "net.lab1318.costume.api.models.object.Object: missing viewType");
        this.workTypes = com.google.common.base.Preconditions.checkNotNull(workTypes, "net.lab1318.costume.api.models.object.Object: missing workTypes");
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
            getModelMetadata().equals(other.getModelMetadata()) &&
            getTitles().equals(other.getTitles()) &&
            getAgents().equals(other.getAgents()) &&
            getCategories().equals(other.getCategories()) &&
            getCondition().equals(other.getCondition()) &&
            getDates().equals(other.getDates()) &&
            getDescriptions().equals(other.getDescriptions()) &&
            getGender().equals(other.getGender()) &&
            getImages().equals(other.getImages()) &&
            getInscriptions().equals(other.getInscriptions()) &&
            getMaterials().equals(other.getMaterials()) &&
            getProvenance().equals(other.getProvenance()) &&
            getQuantity().equals(other.getQuantity()) &&
            getRights().equals(other.getRights()) &&
            getSubjects().equals(other.getSubjects()) &&
            getTechniques().equals(other.getTechniques()) &&
            getTextrefs().equals(other.getTextrefs()) &&
            getViewType().equals(other.getViewType()) &&
            getWorkTypes().equals(other.getWorkTypes());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "collection_id": return getCollectionId();
        case "institution_id": return getInstitutionId();
        case "model_metadata": return getModelMetadata();
        case "titles": return getTitles();
        case "agents": return getAgents();
        case "categories": return getCategories();
        case "condition": return getCondition();
        case "dates": return getDates();
        case "descriptions": return getDescriptions();
        case "gender": return getGender();
        case "images": return getImages();
        case "inscriptions": return getInscriptions();
        case "materials": return getMaterials();
        case "provenance": return getProvenance();
        case "quantity": return getQuantity();
        case "rights": return getRights();
        case "subjects": return getSubjects();
        case "techniques": return getTechniques();
        case "textrefs": return getTextrefs();
        case "view_type": return getViewType();
        case "work_types": return getWorkTypes();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentSet> getAgents() {
        return agents;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCategories() {
        return categories;
    }

    public final net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.condition.Condition> getCondition() {
        return condition;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.date.DateSet> getDates() {
        return dates;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionSet> getDescriptions() {
        return descriptions;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> getGender() {
        return gender;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>> getImages() {
        return images;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionSet> getInscriptions() {
        return inscriptions;
    }

    public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.material.MaterialSet> getMaterials() {
        return materials;
    }

    public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
        return modelMetadata;
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

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> getRights() {
        return rights;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.subject.SubjectSet> getSubjects() {
        return subjects;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.technique.TechniqueSet> getTechniques() {
        return techniques;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.textref.TextrefSet> getTextrefs() {
        return textrefs;
    }

    public final net.lab1318.costume.api.models.title.TitleSet getTitles() {
        return titles;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.view_type.ViewType> getViewType() {
        return viewType;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> getWorkTypes() {
        return workTypes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCollectionId().hashCode();
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getTitles().hashCode();
        if (getAgents().isPresent()) {
            hashCode = 31 * hashCode + getAgents().get().hashCode();
        }
        if (getCategories().isPresent()) {
            hashCode = 31 * hashCode + getCategories().get().hashCode();
        }
        if (getCondition().isPresent()) {
            hashCode = 31 * hashCode + getCondition().get().ordinal();
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
        if (getImages().isPresent()) {
            hashCode = 31 * hashCode + getImages().get().hashCode();
        }
        if (getInscriptions().isPresent()) {
            hashCode = 31 * hashCode + getInscriptions().get().hashCode();
        }
        if (getMaterials().isPresent()) {
            hashCode = 31 * hashCode + getMaterials().get().hashCode();
        }
        if (getProvenance().isPresent()) {
            hashCode = 31 * hashCode + getProvenance().get().hashCode();
        }
        if (getQuantity().isPresent()) {
            hashCode = 31 * hashCode + getQuantity().get().hashCode();
        }
        if (getRights().isPresent()) {
            hashCode = 31 * hashCode + getRights().get().hashCode();
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
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Object readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.collection.CollectionId collectionId = null;
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        net.lab1318.costume.api.models.title.TitleSet titles = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentSet> agents = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.condition.Condition> condition = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.date.DateSet> dates = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionSet> descriptions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>> images = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionSet> inscriptions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.material.MaterialSet> materials = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> provenance = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.subject.SubjectSet> subjects = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.technique.TechniqueSet> techniques = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.textref.TextrefSet> textrefs = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.view_type.ViewType> viewType = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        try {
            collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        try {
            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
        titles = net.lab1318.costume.api.models.title.TitleSet.readAsStruct(iprot);
        if (__list.getSize() > 4) {
            agents = com.google.common.base.Optional.of(net.lab1318.costume.api.models.agent.AgentSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 5) {
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
            }
        }
        if (__list.getSize() > 6) {
            try {
                condition = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.condition.Condition.class));
            } catch (final IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 7) {
            dates = com.google.common.base.Optional.of(net.lab1318.costume.api.models.date.DateSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 8) {
            descriptions = com.google.common.base.Optional.of(net.lab1318.costume.api.models.description.DescriptionSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 9) {
            try {
                gender = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
            } catch (final IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 10) {
            try {
                images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(net.lab1318.costume.api.models.image.Image.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 11) {
            inscriptions = com.google.common.base.Optional.of(net.lab1318.costume.api.models.inscription.InscriptionSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 12) {
            materials = com.google.common.base.Optional.of(net.lab1318.costume.api.models.material.MaterialSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 13) {
            provenance = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 14) {
            try {
                quantity = com.google.common.base.Optional.of(iprot.readU32());
            } catch (final NumberFormatException e) {
            }
        }
        if (__list.getSize() > 15) {
            rights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 16) {
            subjects = com.google.common.base.Optional.of(net.lab1318.costume.api.models.subject.SubjectSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 17) {
            techniques = com.google.common.base.Optional.of(net.lab1318.costume.api.models.technique.TechniqueSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 18) {
            textrefs = com.google.common.base.Optional.of(net.lab1318.costume.api.models.textref.TextrefSet.readAsStruct(iprot));
        }
        if (__list.getSize() > 19) {
            try {
                viewType = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.view_type.ViewType.class));
            } catch (final IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 20) {
            workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
        }
        iprot.readListEnd();
        try {
            return new Object(collectionId, institutionId, modelMetadata, titles, agents, categories, condition, dates, descriptions, gender, images, inscriptions, materials, provenance, quantity, rights, subjects, techniques, textrefs, viewType, workTypes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static Object readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.collection.CollectionId collectionId = null;
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        net.lab1318.costume.api.models.title.TitleSet titles = null;
        com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentSet> agents = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.condition.Condition> condition = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.date.DateSet> dates = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionSet> descriptions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>> images = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionSet> inscriptions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.material.MaterialSet> materials = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> provenance = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.subject.SubjectSet> subjects = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.technique.TechniqueSet> techniques = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.textref.TextrefSet> textrefs = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.view_type.ViewType> viewType = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes = com.google.common.base.Optional.absent();

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
                        collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                }
                break;
            }
            case "institution_id": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    try {
                        institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                }
                break;
            }
            case "model_metadata": {
                if (!ifield.hasId() || ifield.getId() == 14) {
                    modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
                }
                break;
            }
            case "titles": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    titles = net.lab1318.costume.api.models.title.TitleSet.readAsStruct(iprot);
                }
                break;
            }
            case "agents": {
                if (!ifield.hasId() || ifield.getId() == 20) {
                    agents = com.google.common.base.Optional.of(net.lab1318.costume.api.models.agent.AgentSet.readAsStruct(iprot));
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
                    }
                }
                break;
            }
            case "condition": {
                if (!ifield.hasId() || ifield.getId() == 27) {
                    try {
                        condition = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.condition.Condition.class));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                break;
            }
            case "dates": {
                if (!ifield.hasId() || ifield.getId() == 10) {
                    dates = com.google.common.base.Optional.of(net.lab1318.costume.api.models.date.DateSet.readAsStruct(iprot));
                }
                break;
            }
            case "descriptions": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    descriptions = com.google.common.base.Optional.of(net.lab1318.costume.api.models.description.DescriptionSet.readAsStruct(iprot));
                }
                break;
            }
            case "gender": {
                if (!ifield.hasId() || ifield.getId() == 25) {
                    try {
                        gender = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                break;
            }
            case "images": {
                if (!ifield.hasId() || ifield.getId() == 23) {
                    try {
                        images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.image.Image.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                }
                break;
            }
            case "inscriptions": {
                if (!ifield.hasId() || ifield.getId() == 17) {
                    inscriptions = com.google.common.base.Optional.of(net.lab1318.costume.api.models.inscription.InscriptionSet.readAsStruct(iprot));
                }
                break;
            }
            case "materials": {
                if (!ifield.hasId() || ifield.getId() == 15) {
                    materials = com.google.common.base.Optional.of(net.lab1318.costume.api.models.material.MaterialSet.readAsStruct(iprot));
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
            case "rights": {
                if (!ifield.hasId() || ifield.getId() == 22) {
                    rights = com.google.common.base.Optional.of(net.lab1318.costume.api.models.rights.RightsSet.readAsStruct(iprot));
                }
                break;
            }
            case "subjects": {
                if (!ifield.hasId() || ifield.getId() == 21) {
                    subjects = com.google.common.base.Optional.of(net.lab1318.costume.api.models.subject.SubjectSet.readAsStruct(iprot));
                }
                break;
            }
            case "techniques": {
                if (!ifield.hasId() || ifield.getId() == 16) {
                    techniques = com.google.common.base.Optional.of(net.lab1318.costume.api.models.technique.TechniqueSet.readAsStruct(iprot));
                }
                break;
            }
            case "textrefs": {
                if (!ifield.hasId() || ifield.getId() == 9) {
                    textrefs = com.google.common.base.Optional.of(net.lab1318.costume.api.models.textref.TextrefSet.readAsStruct(iprot));
                }
                break;
            }
            case "view_type": {
                if (!ifield.hasId() || ifield.getId() == 28) {
                    try {
                        viewType = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.view_type.ViewType.class));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                break;
            }
            case "work_types": {
                if (!ifield.hasId() || ifield.getId() == 24) {
                    workTypes = com.google.common.base.Optional.of(net.lab1318.costume.api.models.work_type.WorkTypeSet.readAsStruct(iprot));
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new Object(collectionId, institutionId, modelMetadata, titles, agents, categories, condition, dates, descriptions, gender, images, inscriptions, materials, provenance, quantity, rights, subjects, techniques, textrefs, viewType, workTypes);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public Object replaceAgents(final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentSet> agents) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceAgents(final net.lab1318.costume.api.models.agent.AgentSet agents) {
        return replaceAgents(com.google.common.base.Optional.fromNullable(agents));
    }

    public Object replaceCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceCategories(final com.google.common.collect.ImmutableList<String> categories) {
        return replaceCategories(com.google.common.base.Optional.fromNullable(categories));
    }

    public Object replaceCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        return new Object(collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceCondition(final com.google.common.base.Optional<net.lab1318.costume.api.models.condition.Condition> condition) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceCondition(final net.lab1318.costume.api.models.condition.Condition condition) {
        return replaceCondition(com.google.common.base.Optional.fromNullable(condition));
    }

    public Object replaceDates(final com.google.common.base.Optional<net.lab1318.costume.api.models.date.DateSet> dates) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceDates(final net.lab1318.costume.api.models.date.DateSet dates) {
        return replaceDates(com.google.common.base.Optional.fromNullable(dates));
    }

    public Object replaceDescriptions(final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionSet> descriptions) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceDescriptions(final net.lab1318.costume.api.models.description.DescriptionSet descriptions) {
        return replaceDescriptions(com.google.common.base.Optional.fromNullable(descriptions));
    }

    public Object replaceGender(final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceGender(final net.lab1318.costume.api.models.gender.Gender gender) {
        return replaceGender(com.google.common.base.Optional.fromNullable(gender));
    }

    public Object replaceImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>> images) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceImages(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image> images) {
        return replaceImages(com.google.common.base.Optional.fromNullable(images));
    }

    public Object replaceInscriptions(final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionSet> inscriptions) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceInscriptions(final net.lab1318.costume.api.models.inscription.InscriptionSet inscriptions) {
        return replaceInscriptions(com.google.common.base.Optional.fromNullable(inscriptions));
    }

    public Object replaceInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        return new Object(this.collectionId, institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceMaterials(final com.google.common.base.Optional<net.lab1318.costume.api.models.material.MaterialSet> materials) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceMaterials(final net.lab1318.costume.api.models.material.MaterialSet materials) {
        return replaceMaterials(com.google.common.base.Optional.fromNullable(materials));
    }

    public Object replaceModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
        return new Object(this.collectionId, this.institutionId, modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceProvenance(final com.google.common.base.Optional<String> provenance) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceProvenance(final String provenance) {
        return replaceProvenance(com.google.common.base.Optional.fromNullable(provenance));
    }

    public Object replaceQuantity(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceQuantity(final com.google.common.primitives.UnsignedInteger quantity) {
        return replaceQuantity(com.google.common.base.Optional.fromNullable(quantity));
    }

    public Object replaceRights(final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceRights(final net.lab1318.costume.api.models.rights.RightsSet rights) {
        return replaceRights(com.google.common.base.Optional.fromNullable(rights));
    }

    public Object replaceSubjects(final com.google.common.base.Optional<net.lab1318.costume.api.models.subject.SubjectSet> subjects) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceSubjects(final net.lab1318.costume.api.models.subject.SubjectSet subjects) {
        return replaceSubjects(com.google.common.base.Optional.fromNullable(subjects));
    }

    public Object replaceTechniques(final com.google.common.base.Optional<net.lab1318.costume.api.models.technique.TechniqueSet> techniques) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceTechniques(final net.lab1318.costume.api.models.technique.TechniqueSet techniques) {
        return replaceTechniques(com.google.common.base.Optional.fromNullable(techniques));
    }

    public Object replaceTextrefs(final com.google.common.base.Optional<net.lab1318.costume.api.models.textref.TextrefSet> textrefs) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, textrefs, this.viewType, this.workTypes);
    }

    public Object replaceTextrefs(final net.lab1318.costume.api.models.textref.TextrefSet textrefs) {
        return replaceTextrefs(com.google.common.base.Optional.fromNullable(textrefs));
    }

    public Object replaceTitles(final net.lab1318.costume.api.models.title.TitleSet titles) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, this.workTypes);
    }

    public Object replaceViewType(final com.google.common.base.Optional<net.lab1318.costume.api.models.view_type.ViewType> viewType) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, viewType, this.workTypes);
    }

    public Object replaceViewType(final net.lab1318.costume.api.models.view_type.ViewType viewType) {
        return replaceViewType(com.google.common.base.Optional.fromNullable(viewType));
    }

    public Object replaceWorkTypes(final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes) {
        return new Object(this.collectionId, this.institutionId, this.modelMetadata, this.titles, this.agents, this.categories, this.condition, this.dates, this.descriptions, this.gender, this.images, this.inscriptions, this.materials, this.provenance, this.quantity, this.rights, this.subjects, this.techniques, this.textrefs, this.viewType, workTypes);
    }

    public Object replaceWorkTypes(final net.lab1318.costume.api.models.work_type.WorkTypeSet workTypes) {
        return replaceWorkTypes(com.google.common.base.Optional.fromNullable(workTypes));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("model_metadata", getModelMetadata()).add("titles", getTitles()).add("agents", getAgents().orNull()).add("categories", getCategories().orNull()).add("condition", getCondition().orNull()).add("dates", getDates().orNull()).add("descriptions", getDescriptions().orNull()).add("gender", getGender().orNull()).add("images", getImages().orNull()).add("inscriptions", getInscriptions().orNull()).add("materials", getMaterials().orNull()).add("provenance", getProvenance().orNull()).add("quantity", getQuantity().orNull()).add("rights", getRights().orNull()).add("subjects", getSubjects().orNull()).add("techniques", getTechniques().orNull()).add("textrefs", getTextrefs().orNull()).add("view_type", getViewType().orNull()).add("work_types", getWorkTypes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 21);

        oprot.writeString(getCollectionId().toString());

        oprot.writeString(getInstitutionId().toString());

        getModelMetadata().writeAsStruct(oprot);

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

        if (getCondition().isPresent()) {
            oprot.writeEnum(getCondition().get());
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

        if (getImages().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getImages().get().size());
            for (final net.lab1318.costume.api.models.image.Image _iter0 : getImages().get()) {
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

        if (getMaterials().isPresent()) {
            getMaterials().get().writeAsStruct(oprot);
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

        if (getRights().isPresent()) {
            getRights().get().writeAsStruct(oprot);
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.object.Object");
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

        oprot.writeFieldBegin("model_metadata", org.thryft.protocol.Type.STRUCT, (short)14);
        getModelMetadata().writeAsStruct(oprot);
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

        if (getCondition().isPresent()) {
            oprot.writeFieldBegin("condition", org.thryft.protocol.Type.STRING, (short)27);
            oprot.writeEnum(getCondition().get());
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

        if (getImages().isPresent()) {
            oprot.writeFieldBegin("images", org.thryft.protocol.Type.LIST, (short)23);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getImages().get().size());
            for (final net.lab1318.costume.api.models.image.Image _iter0 : getImages().get()) {
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

        if (getMaterials().isPresent()) {
            oprot.writeFieldBegin("materials", org.thryft.protocol.Type.STRUCT, (short)15);
            getMaterials().get().writeAsStruct(oprot);
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

        if (getRights().isPresent()) {
            oprot.writeFieldBegin("rights", org.thryft.protocol.Type.STRUCT, (short)22);
            getRights().get().writeAsStruct(oprot);
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

    private final net.lab1318.costume.api.models.collection.CollectionId collectionId;

    private final net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private final net.lab1318.costume.api.models.ModelMetadata modelMetadata;

    private final net.lab1318.costume.api.models.title.TitleSet titles;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.agent.AgentSet> agents;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.condition.Condition> condition;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.date.DateSet> dates;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.description.DescriptionSet> descriptions;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.image.Image>> images;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.inscription.InscriptionSet> inscriptions;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.material.MaterialSet> materials;

    /**
     * Dublin Core freetext provenance
     */
    private final com.google.common.base.Optional<String> provenance;

    private final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> quantity;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.rights.RightsSet> rights;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.subject.SubjectSet> subjects;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.technique.TechniqueSet> techniques;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.textref.TextrefSet> textrefs;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.view_type.ViewType> viewType;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.work_type.WorkTypeSet> workTypes;
}
