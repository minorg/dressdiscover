package org.dressdiscover.api.vocabularies.vra_core;

public final class VraCoreObject implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            agentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> absent();
            culturalContextSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> absent();
            dateSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> absent();
            descriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> absent();
            inscriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> absent();
            locationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> absent();
            materialSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> absent();
            measurementSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> absent();
            relationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> absent();
            rightSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> absent();
            subjectSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> absent();
            techniqueSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> absent();
            textrefSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> absent();
            titleSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> absent();
            workTypeSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> absent();
        }

        public Builder(final VraCoreObject other) {
            this.agentSets = other.getAgentSets();
            this.culturalContextSets = other.getCulturalContextSets();
            this.dateSets = other.getDateSets();
            this.descriptionSets = other.getDescriptionSets();
            this.inscriptionSets = other.getInscriptionSets();
            this.locationSets = other.getLocationSets();
            this.materialSets = other.getMaterialSets();
            this.measurementSets = other.getMeasurementSets();
            this.relationSets = other.getRelationSets();
            this.rightSets = other.getRightSets();
            this.subjectSets = other.getSubjectSets();
            this.techniqueSets = other.getTechniqueSets();
            this.textrefSets = other.getTextrefSets();
            this.titleSets = other.getTitleSets();
            this.workTypeSets = other.getWorkTypeSets();
        }

        protected VraCoreObject _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
            return new VraCoreObject(agentSets, culturalContextSets, dateSets, descriptionSets, inscriptionSets, locationSets, materialSets, measurementSets, relationSets, rightSets, subjectSets, techniqueSets, textrefSets, titleSets, workTypeSets, DefaultConstructionValidator.getInstance());
        }

        public VraCoreObject build() {
            return _build(agentSets, culturalContextSets, dateSets, descriptionSets, inscriptionSets, locationSets, materialSets, measurementSets, relationSets, rightSets, subjectSets, techniqueSets, textrefSets, titleSets, workTypeSets);
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> getAgentSets() {
            return agentSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> getCulturalContextSets() {
            return culturalContextSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> getDateSets() {
            return dateSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> getDescriptionSets() {
            return descriptionSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> getInscriptionSets() {
            return inscriptionSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> getLocationSets() {
            return locationSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> getMaterialSets() {
            return materialSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> getMeasurementSets() {
            return measurementSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> getRelationSets() {
            return relationSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> getRightSets() {
            return rightSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> getSubjectSets() {
            return subjectSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> getTechniqueSets() {
            return techniqueSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> getTextrefSets() {
            return textrefSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> getTitleSets() {
            return titleSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> getWorkTypeSets() {
            return workTypeSets;
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
                if (__list.getSize() > 0) {
                    try {
                        agentSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 1) {
                    try {
                        culturalContextSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 2) {
                    try {
                        dateSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.date.DateSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 3) {
                    try {
                        descriptionSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 4) {
                    try {
                        inscriptionSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSCRIPTION_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 5) {
                    try {
                        locationSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 6) {
                    try {
                        materialSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 7) {
                    try {
                        measurementSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEASUREMENT_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 8) {
                    try {
                        relationSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 9) {
                    try {
                        rightSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHT_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 10) {
                    try {
                        subjectSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 11) {
                    try {
                        techniqueSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 12) {
                    try {
                        textrefSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTREF_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 13) {
                    try {
                        titleSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.title.TitleSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 14) {
                    try {
                        workTypeSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_SETS, e.getCause());
                    }
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
                    case "agent_sets": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            try {
                                agentSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "cultural_context_sets": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            try {
                                culturalContextSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "date_sets": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            try {
                                dateSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.date.DateSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "description_sets": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            try {
                                descriptionSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "inscription_sets": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            try {
                                inscriptionSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSCRIPTION_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "location_sets": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                            try {
                                locationSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "material_sets": {
                        if (!ifield.hasId() || ifield.getId() == 7) {
                            try {
                                materialSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "measurement_sets": {
                        if (!ifield.hasId() || ifield.getId() == 8) {
                            try {
                                measurementSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEASUREMENT_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "relation_sets": {
                        if (!ifield.hasId() || ifield.getId() == 9) {
                            try {
                                relationSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "right_sets": {
                        if (!ifield.hasId() || ifield.getId() == 10) {
                            try {
                                rightSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHT_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "subject_sets": {
                        if (!ifield.hasId() || ifield.getId() == 11) {
                            try {
                                subjectSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "technique_sets": {
                        if (!ifield.hasId() || ifield.getId() == 12) {
                            try {
                                techniqueSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "textref_sets": {
                        if (!ifield.hasId() || ifield.getId() == 13) {
                            try {
                                textrefSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTREF_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "title_sets": {
                        if (!ifield.hasId() || ifield.getId() == 14) {
                            try {
                                titleSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.title.TitleSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "work_type_sets": {
                        if (!ifield.hasId() || ifield.getId() == 15) {
                            try {
                                workTypeSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_SETS, e.getCause());
                            }
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
            case AGENT_SETS: setAgentSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>)value); return this;
            case CULTURAL_CONTEXT_SETS: setCulturalContextSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>)value); return this;
            case DATE_SETS: setDateSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>)value); return this;
            case DESCRIPTION_SETS: setDescriptionSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>)value); return this;
            case INSCRIPTION_SETS: setInscriptionSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>)value); return this;
            case LOCATION_SETS: setLocationSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>)value); return this;
            case MATERIAL_SETS: setMaterialSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>)value); return this;
            case MEASUREMENT_SETS: setMeasurementSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>)value); return this;
            case RELATION_SETS: setRelationSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>)value); return this;
            case RIGHT_SETS: setRightSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>)value); return this;
            case SUBJECT_SETS: setSubjectSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>)value); return this;
            case TECHNIQUE_SETS: setTechniqueSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>)value); return this;
            case TEXTREF_SETS: setTextrefSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>)value); return this;
            case TITLE_SETS: setTitleSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>)value); return this;
            case WORK_TYPE_SETS: setWorkTypeSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAgentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets) {
            this.agentSets = DefaultConstructionValidator.getInstance().validateAgentSets(agentSets);
            return this;
        }

        public Builder setAgentSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> agentSets) {
            return setAgentSets(com.google.common.base.Optional.fromNullable(agentSets));
        }

        public Builder setCulturalContextSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets) {
            this.culturalContextSets = DefaultConstructionValidator.getInstance().validateCulturalContextSets(culturalContextSets);
            return this;
        }

        public Builder setCulturalContextSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> culturalContextSets) {
            return setCulturalContextSets(com.google.common.base.Optional.fromNullable(culturalContextSets));
        }

        public Builder setDateSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets) {
            this.dateSets = DefaultConstructionValidator.getInstance().validateDateSets(dateSets);
            return this;
        }

        public Builder setDateSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> dateSets) {
            return setDateSets(com.google.common.base.Optional.fromNullable(dateSets));
        }

        public Builder setDescriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets) {
            this.descriptionSets = DefaultConstructionValidator.getInstance().validateDescriptionSets(descriptionSets);
            return this;
        }

        public Builder setDescriptionSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> descriptionSets) {
            return setDescriptionSets(com.google.common.base.Optional.fromNullable(descriptionSets));
        }

        public Builder setIfPresent(final VraCoreObject other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getAgentSets().isPresent()) {
                setAgentSets(other.getAgentSets());
            }
            if (other.getCulturalContextSets().isPresent()) {
                setCulturalContextSets(other.getCulturalContextSets());
            }
            if (other.getDateSets().isPresent()) {
                setDateSets(other.getDateSets());
            }
            if (other.getDescriptionSets().isPresent()) {
                setDescriptionSets(other.getDescriptionSets());
            }
            if (other.getInscriptionSets().isPresent()) {
                setInscriptionSets(other.getInscriptionSets());
            }
            if (other.getLocationSets().isPresent()) {
                setLocationSets(other.getLocationSets());
            }
            if (other.getMaterialSets().isPresent()) {
                setMaterialSets(other.getMaterialSets());
            }
            if (other.getMeasurementSets().isPresent()) {
                setMeasurementSets(other.getMeasurementSets());
            }
            if (other.getRelationSets().isPresent()) {
                setRelationSets(other.getRelationSets());
            }
            if (other.getRightSets().isPresent()) {
                setRightSets(other.getRightSets());
            }
            if (other.getSubjectSets().isPresent()) {
                setSubjectSets(other.getSubjectSets());
            }
            if (other.getTechniqueSets().isPresent()) {
                setTechniqueSets(other.getTechniqueSets());
            }
            if (other.getTextrefSets().isPresent()) {
                setTextrefSets(other.getTextrefSets());
            }
            if (other.getTitleSets().isPresent()) {
                setTitleSets(other.getTitleSets());
            }
            if (other.getWorkTypeSets().isPresent()) {
                setWorkTypeSets(other.getWorkTypeSets());
            }

            return this;
        }

        public Builder setInscriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets) {
            this.inscriptionSets = DefaultConstructionValidator.getInstance().validateInscriptionSets(inscriptionSets);
            return this;
        }

        public Builder setInscriptionSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> inscriptionSets) {
            return setInscriptionSets(com.google.common.base.Optional.fromNullable(inscriptionSets));
        }

        public Builder setLocationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets) {
            this.locationSets = DefaultConstructionValidator.getInstance().validateLocationSets(locationSets);
            return this;
        }

        public Builder setLocationSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locationSets) {
            return setLocationSets(com.google.common.base.Optional.fromNullable(locationSets));
        }

        public Builder setMaterialSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets) {
            this.materialSets = DefaultConstructionValidator.getInstance().validateMaterialSets(materialSets);
            return this;
        }

        public Builder setMaterialSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> materialSets) {
            return setMaterialSets(com.google.common.base.Optional.fromNullable(materialSets));
        }

        public Builder setMeasurementSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets) {
            this.measurementSets = DefaultConstructionValidator.getInstance().validateMeasurementSets(measurementSets);
            return this;
        }

        public Builder setMeasurementSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> measurementSets) {
            return setMeasurementSets(com.google.common.base.Optional.fromNullable(measurementSets));
        }

        public Builder setRelationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets) {
            this.relationSets = DefaultConstructionValidator.getInstance().validateRelationSets(relationSets);
            return this;
        }

        public Builder setRelationSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> relationSets) {
            return setRelationSets(com.google.common.base.Optional.fromNullable(relationSets));
        }

        public Builder setRightSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets) {
            this.rightSets = DefaultConstructionValidator.getInstance().validateRightSets(rightSets);
            return this;
        }

        public Builder setRightSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rightSets) {
            return setRightSets(com.google.common.base.Optional.fromNullable(rightSets));
        }

        public Builder setSubjectSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets) {
            this.subjectSets = DefaultConstructionValidator.getInstance().validateSubjectSets(subjectSets);
            return this;
        }

        public Builder setSubjectSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> subjectSets) {
            return setSubjectSets(com.google.common.base.Optional.fromNullable(subjectSets));
        }

        public Builder setTechniqueSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets) {
            this.techniqueSets = DefaultConstructionValidator.getInstance().validateTechniqueSets(techniqueSets);
            return this;
        }

        public Builder setTechniqueSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> techniqueSets) {
            return setTechniqueSets(com.google.common.base.Optional.fromNullable(techniqueSets));
        }

        public Builder setTextrefSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets) {
            this.textrefSets = DefaultConstructionValidator.getInstance().validateTextrefSets(textrefSets);
            return this;
        }

        public Builder setTextrefSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> textrefSets) {
            return setTextrefSets(com.google.common.base.Optional.fromNullable(textrefSets));
        }

        public Builder setTitleSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets) {
            this.titleSets = DefaultConstructionValidator.getInstance().validateTitleSets(titleSets);
            return this;
        }

        public Builder setTitleSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> titleSets) {
            return setTitleSets(com.google.common.base.Optional.fromNullable(titleSets));
        }

        public Builder setWorkTypeSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
            this.workTypeSets = DefaultConstructionValidator.getInstance().validateWorkTypeSets(workTypeSets);
            return this;
        }

        public Builder setWorkTypeSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypeSets) {
            return setWorkTypeSets(com.google.common.base.Optional.fromNullable(workTypeSets));
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
            case AGENT_SETS: return unsetAgentSets();
            case CULTURAL_CONTEXT_SETS: return unsetCulturalContextSets();
            case DATE_SETS: return unsetDateSets();
            case DESCRIPTION_SETS: return unsetDescriptionSets();
            case INSCRIPTION_SETS: return unsetInscriptionSets();
            case LOCATION_SETS: return unsetLocationSets();
            case MATERIAL_SETS: return unsetMaterialSets();
            case MEASUREMENT_SETS: return unsetMeasurementSets();
            case RELATION_SETS: return unsetRelationSets();
            case RIGHT_SETS: return unsetRightSets();
            case SUBJECT_SETS: return unsetSubjectSets();
            case TECHNIQUE_SETS: return unsetTechniqueSets();
            case TEXTREF_SETS: return unsetTextrefSets();
            case TITLE_SETS: return unsetTitleSets();
            case WORK_TYPE_SETS: return unsetWorkTypeSets();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAgentSets() {
            this.agentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> absent();
            return this;
        }

        public Builder unsetCulturalContextSets() {
            this.culturalContextSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> absent();
            return this;
        }

        public Builder unsetDateSets() {
            this.dateSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> absent();
            return this;
        }

        public Builder unsetDescriptionSets() {
            this.descriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> absent();
            return this;
        }

        public Builder unsetInscriptionSets() {
            this.inscriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> absent();
            return this;
        }

        public Builder unsetLocationSets() {
            this.locationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> absent();
            return this;
        }

        public Builder unsetMaterialSets() {
            this.materialSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> absent();
            return this;
        }

        public Builder unsetMeasurementSets() {
            this.measurementSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> absent();
            return this;
        }

        public Builder unsetRelationSets() {
            this.relationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> absent();
            return this;
        }

        public Builder unsetRightSets() {
            this.rightSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> absent();
            return this;
        }

        public Builder unsetSubjectSets() {
            this.subjectSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> absent();
            return this;
        }

        public Builder unsetTechniqueSets() {
            this.techniqueSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> absent();
            return this;
        }

        public Builder unsetTextrefSets() {
            this.textrefSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> absent();
            return this;
        }

        public Builder unsetTitleSets() {
            this.titleSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> absent();
            return this;
        }

        public Builder unsetWorkTypeSets() {
            this.workTypeSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> absent();
            return this;
        }

        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<VraCoreObject> {
        @Override
        public VraCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return VraCoreObject.readAs(iprot, type);
        }

        @Override
        public VraCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return VraCoreObject.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public VraCoreObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return VraCoreObject.readAsList(iprot);
        }

        @Override
        public VraCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return VraCoreObject.readAsStruct(iprot);
        }

        @Override
        public VraCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return VraCoreObject.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        AGENT_SETS("agentSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>>() {}, false, 1, "agent_sets", org.thryft.protocol.Type.LIST),
        CULTURAL_CONTEXT_SETS("culturalContextSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>>() {}, false, 2, "cultural_context_sets", org.thryft.protocol.Type.LIST),
        DATE_SETS("dateSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>>() {}, false, 3, "date_sets", org.thryft.protocol.Type.LIST),
        DESCRIPTION_SETS("descriptionSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>>() {}, false, 4, "description_sets", org.thryft.protocol.Type.LIST),
        INSCRIPTION_SETS("inscriptionSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>>() {}, false, 5, "inscription_sets", org.thryft.protocol.Type.LIST),
        LOCATION_SETS("locationSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>>() {}, false, 6, "location_sets", org.thryft.protocol.Type.LIST),
        MATERIAL_SETS("materialSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>>() {}, false, 7, "material_sets", org.thryft.protocol.Type.LIST),
        MEASUREMENT_SETS("measurementSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>>() {}, false, 8, "measurement_sets", org.thryft.protocol.Type.LIST),
        RELATION_SETS("relationSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>>() {}, false, 9, "relation_sets", org.thryft.protocol.Type.LIST),
        RIGHT_SETS("rightSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>>() {}, false, 10, "right_sets", org.thryft.protocol.Type.LIST),
        SUBJECT_SETS("subjectSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>>() {}, false, 11, "subject_sets", org.thryft.protocol.Type.LIST),
        TECHNIQUE_SETS("techniqueSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>>() {}, false, 12, "technique_sets", org.thryft.protocol.Type.LIST),
        TEXTREF_SETS("textrefSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>>() {}, false, 13, "textref_sets", org.thryft.protocol.Type.LIST),
        TITLE_SETS("titleSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>>() {}, false, 14, "title_sets", org.thryft.protocol.Type.LIST),
        WORK_TYPE_SETS("workTypeSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>>() {}, false, 15, "work_type_sets", org.thryft.protocol.Type.LIST);

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
            case "agentSets": return AGENT_SETS;
            case "culturalContextSets": return CULTURAL_CONTEXT_SETS;
            case "dateSets": return DATE_SETS;
            case "descriptionSets": return DESCRIPTION_SETS;
            case "inscriptionSets": return INSCRIPTION_SETS;
            case "locationSets": return LOCATION_SETS;
            case "materialSets": return MATERIAL_SETS;
            case "measurementSets": return MEASUREMENT_SETS;
            case "relationSets": return RELATION_SETS;
            case "rightSets": return RIGHT_SETS;
            case "subjectSets": return SUBJECT_SETS;
            case "techniqueSets": return TECHNIQUE_SETS;
            case "textrefSets": return TEXTREF_SETS;
            case "titleSets": return TITLE_SETS;
            case "workTypeSets": return WORK_TYPE_SETS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "agent_sets": return AGENT_SETS;
            case "cultural_context_sets": return CULTURAL_CONTEXT_SETS;
            case "date_sets": return DATE_SETS;
            case "description_sets": return DESCRIPTION_SETS;
            case "inscription_sets": return INSCRIPTION_SETS;
            case "location_sets": return LOCATION_SETS;
            case "material_sets": return MATERIAL_SETS;
            case "measurement_sets": return MEASUREMENT_SETS;
            case "relation_sets": return RELATION_SETS;
            case "right_sets": return RIGHT_SETS;
            case "subject_sets": return SUBJECT_SETS;
            case "technique_sets": return TECHNIQUE_SETS;
            case "textref_sets": return TEXTREF_SETS;
            case "title_sets": return TITLE_SETS;
            case "work_type_sets": return WORK_TYPE_SETS;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> validateAgentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> validateCulturalContextSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> validateDateSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> validateDescriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> validateInscriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> validateLocationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> validateMaterialSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> validateMeasurementSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> validateRelationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> validateRightSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> validateSubjectSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> validateTechniqueSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> validateTextrefSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> validateTitleSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> validateWorkTypeSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) throws ExceptionT;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> validateAgentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets) throws RuntimeException {
            if (agentSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: agentSets is null");
            }
            if (!agentSets.isPresent()) {
                return agentSets;
            }
            if (agentSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: agentSets is less than min length 1");
            }
            return agentSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> validateCulturalContextSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets) throws RuntimeException {
            if (culturalContextSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: culturalContextSets is null");
            }
            if (!culturalContextSets.isPresent()) {
                return culturalContextSets;
            }
            if (culturalContextSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: culturalContextSets is less than min length 1");
            }
            return culturalContextSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> validateDateSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets) throws RuntimeException {
            if (dateSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: dateSets is null");
            }
            if (!dateSets.isPresent()) {
                return dateSets;
            }
            if (dateSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: dateSets is less than min length 1");
            }
            return dateSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> validateDescriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets) throws RuntimeException {
            if (descriptionSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: descriptionSets is null");
            }
            if (!descriptionSets.isPresent()) {
                return descriptionSets;
            }
            if (descriptionSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: descriptionSets is less than min length 1");
            }
            return descriptionSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> validateInscriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets) throws RuntimeException {
            if (inscriptionSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: inscriptionSets is null");
            }
            if (!inscriptionSets.isPresent()) {
                return inscriptionSets;
            }
            if (inscriptionSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: inscriptionSets is less than min length 1");
            }
            return inscriptionSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> validateLocationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets) throws RuntimeException {
            if (locationSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: locationSets is null");
            }
            if (!locationSets.isPresent()) {
                return locationSets;
            }
            if (locationSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: locationSets is less than min length 1");
            }
            return locationSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> validateMaterialSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets) throws RuntimeException {
            if (materialSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: materialSets is null");
            }
            if (!materialSets.isPresent()) {
                return materialSets;
            }
            if (materialSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: materialSets is less than min length 1");
            }
            return materialSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> validateMeasurementSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets) throws RuntimeException {
            if (measurementSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: measurementSets is null");
            }
            if (!measurementSets.isPresent()) {
                return measurementSets;
            }
            if (measurementSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: measurementSets is less than min length 1");
            }
            return measurementSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> validateRelationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets) throws RuntimeException {
            if (relationSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: relationSets is null");
            }
            if (!relationSets.isPresent()) {
                return relationSets;
            }
            if (relationSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: relationSets is less than min length 1");
            }
            return relationSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> validateRightSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets) throws RuntimeException {
            if (rightSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: rightSets is null");
            }
            if (!rightSets.isPresent()) {
                return rightSets;
            }
            if (rightSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: rightSets is less than min length 1");
            }
            return rightSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> validateSubjectSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets) throws RuntimeException {
            if (subjectSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: subjectSets is null");
            }
            if (!subjectSets.isPresent()) {
                return subjectSets;
            }
            if (subjectSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: subjectSets is less than min length 1");
            }
            return subjectSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> validateTechniqueSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets) throws RuntimeException {
            if (techniqueSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: techniqueSets is null");
            }
            if (!techniqueSets.isPresent()) {
                return techniqueSets;
            }
            if (techniqueSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: techniqueSets is less than min length 1");
            }
            return techniqueSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> validateTextrefSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets) throws RuntimeException {
            if (textrefSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: textrefSets is null");
            }
            if (!textrefSets.isPresent()) {
                return textrefSets;
            }
            if (textrefSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: textrefSets is less than min length 1");
            }
            return textrefSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> validateTitleSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets) throws RuntimeException {
            if (titleSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: titleSets is null");
            }
            if (!titleSets.isPresent()) {
                return titleSets;
            }
            if (titleSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: titleSets is less than min length 1");
            }
            return titleSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> validateWorkTypeSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) throws RuntimeException {
            if (workTypeSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: workTypeSets is null");
            }
            if (!workTypeSets.isPresent()) {
                return workTypeSets;
            }
            if (workTypeSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: workTypeSets is less than min length 1");
            }
            return workTypeSets;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> validateAgentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets) {
            return agentSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> validateCulturalContextSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets) {
            return culturalContextSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> validateDateSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets) {
            return dateSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> validateDescriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets) {
            return descriptionSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> validateInscriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets) {
            return inscriptionSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> validateLocationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets) {
            return locationSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> validateMaterialSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets) {
            return materialSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> validateMeasurementSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets) {
            return measurementSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> validateRelationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets) {
            return relationSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> validateRightSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets) {
            return rightSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> validateSubjectSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets) {
            return subjectSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> validateTechniqueSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets) {
            return techniqueSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> validateTextrefSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets) {
            return textrefSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> validateTitleSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets) {
            return titleSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> validateWorkTypeSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
            return workTypeSets;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> validateAgentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets) throws org.thryft.protocol.InputProtocolException {
            if (agentSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.AGENT_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: agentSets is null");
            }
            if (!agentSets.isPresent()) {
                return agentSets;
            }
            if (agentSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: agentSets is less than min length 1");
            }
            return agentSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> validateCulturalContextSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets) throws org.thryft.protocol.InputProtocolException {
            if (culturalContextSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: culturalContextSets is null");
            }
            if (!culturalContextSets.isPresent()) {
                return culturalContextSets;
            }
            if (culturalContextSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: culturalContextSets is less than min length 1");
            }
            return culturalContextSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> validateDateSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets) throws org.thryft.protocol.InputProtocolException {
            if (dateSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DATE_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: dateSets is null");
            }
            if (!dateSets.isPresent()) {
                return dateSets;
            }
            if (dateSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: dateSets is less than min length 1");
            }
            return dateSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> validateDescriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets) throws org.thryft.protocol.InputProtocolException {
            if (descriptionSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DESCRIPTION_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: descriptionSets is null");
            }
            if (!descriptionSets.isPresent()) {
                return descriptionSets;
            }
            if (descriptionSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: descriptionSets is less than min length 1");
            }
            return descriptionSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> validateInscriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets) throws org.thryft.protocol.InputProtocolException {
            if (inscriptionSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSCRIPTION_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: inscriptionSets is null");
            }
            if (!inscriptionSets.isPresent()) {
                return inscriptionSets;
            }
            if (inscriptionSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSCRIPTION_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: inscriptionSets is less than min length 1");
            }
            return inscriptionSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> validateLocationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets) throws org.thryft.protocol.InputProtocolException {
            if (locationSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LOCATION_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: locationSets is null");
            }
            if (!locationSets.isPresent()) {
                return locationSets;
            }
            if (locationSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: locationSets is less than min length 1");
            }
            return locationSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> validateMaterialSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets) throws org.thryft.protocol.InputProtocolException {
            if (materialSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MATERIAL_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: materialSets is null");
            }
            if (!materialSets.isPresent()) {
                return materialSets;
            }
            if (materialSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: materialSets is less than min length 1");
            }
            return materialSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> validateMeasurementSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets) throws org.thryft.protocol.InputProtocolException {
            if (measurementSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MEASUREMENT_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: measurementSets is null");
            }
            if (!measurementSets.isPresent()) {
                return measurementSets;
            }
            if (measurementSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEASUREMENT_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: measurementSets is less than min length 1");
            }
            return measurementSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> validateRelationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets) throws org.thryft.protocol.InputProtocolException {
            if (relationSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RELATION_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: relationSets is null");
            }
            if (!relationSets.isPresent()) {
                return relationSets;
            }
            if (relationSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: relationSets is less than min length 1");
            }
            return relationSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> validateRightSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets) throws org.thryft.protocol.InputProtocolException {
            if (rightSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHT_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: rightSets is null");
            }
            if (!rightSets.isPresent()) {
                return rightSets;
            }
            if (rightSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHT_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: rightSets is less than min length 1");
            }
            return rightSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> validateSubjectSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets) throws org.thryft.protocol.InputProtocolException {
            if (subjectSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SUBJECT_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: subjectSets is null");
            }
            if (!subjectSets.isPresent()) {
                return subjectSets;
            }
            if (subjectSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: subjectSets is less than min length 1");
            }
            return subjectSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> validateTechniqueSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets) throws org.thryft.protocol.InputProtocolException {
            if (techniqueSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TECHNIQUE_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: techniqueSets is null");
            }
            if (!techniqueSets.isPresent()) {
                return techniqueSets;
            }
            if (techniqueSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: techniqueSets is less than min length 1");
            }
            return techniqueSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> validateTextrefSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets) throws org.thryft.protocol.InputProtocolException {
            if (textrefSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEXTREF_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: textrefSets is null");
            }
            if (!textrefSets.isPresent()) {
                return textrefSets;
            }
            if (textrefSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTREF_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: textrefSets is less than min length 1");
            }
            return textrefSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> validateTitleSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets) throws org.thryft.protocol.InputProtocolException {
            if (titleSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TITLE_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: titleSets is null");
            }
            if (!titleSets.isPresent()) {
                return titleSets;
            }
            if (titleSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: titleSets is less than min length 1");
            }
            return titleSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> validateWorkTypeSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) throws org.thryft.protocol.InputProtocolException {
            if (workTypeSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.WORK_TYPE_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: workTypeSets is null");
            }
            if (!workTypeSets.isPresent()) {
                return workTypeSets;
            }
            if (workTypeSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_SETS, "org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: workTypeSets is less than min length 1");
            }
            return workTypeSets;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> validateAgentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets) {
            return agentSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> validateCulturalContextSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets) {
            return culturalContextSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> validateDateSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets) {
            return dateSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> validateDescriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets) {
            return descriptionSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> validateInscriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets) {
            return inscriptionSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> validateLocationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets) {
            return locationSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> validateMaterialSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets) {
            return materialSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> validateMeasurementSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets) {
            return measurementSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> validateRelationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets) {
            return relationSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> validateRightSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets) {
            return rightSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> validateSubjectSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets) {
            return subjectSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> validateTechniqueSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets) {
            return techniqueSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> validateTextrefSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets) {
            return textrefSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> validateTitleSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets) {
            return titleSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> validateWorkTypeSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
            return workTypeSets;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
    public VraCoreObject() {
        agentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> absent();
        culturalContextSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> absent();
        dateSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> absent();
        descriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> absent();
        inscriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> absent();
        locationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> absent();
        materialSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> absent();
        measurementSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> absent();
        relationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> absent();
        rightSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> absent();
        subjectSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> absent();
        techniqueSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> absent();
        textrefSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> absent();
        titleSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> absent();
        workTypeSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> absent();
    }

    /**
     * Copy constructor
     */
    public VraCoreObject(final VraCoreObject other) {
        this(other.getAgentSets(), other.getCulturalContextSets(), other.getDateSets(), other.getDescriptionSets(), other.getInscriptionSets(), other.getLocationSets(), other.getMaterialSets(), other.getMeasurementSets(), other.getRelationSets(), other.getRightSets(), other.getSubjectSets(), other.getTechniqueSets(), other.getTextrefSets(), other.getTitleSets(), other.getWorkTypeSets(), NopConstructionValidator.getInstance());
    }

    protected VraCoreObject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets, ConstructionValidator validator) {
        this.agentSets = validator.validateAgentSets(agentSets);
        this.culturalContextSets = validator.validateCulturalContextSets(culturalContextSets);
        this.dateSets = validator.validateDateSets(dateSets);
        this.descriptionSets = validator.validateDescriptionSets(descriptionSets);
        this.inscriptionSets = validator.validateInscriptionSets(inscriptionSets);
        this.locationSets = validator.validateLocationSets(locationSets);
        this.materialSets = validator.validateMaterialSets(materialSets);
        this.measurementSets = validator.validateMeasurementSets(measurementSets);
        this.relationSets = validator.validateRelationSets(relationSets);
        this.rightSets = validator.validateRightSets(rightSets);
        this.subjectSets = validator.validateSubjectSets(subjectSets);
        this.techniqueSets = validator.validateTechniqueSets(techniqueSets);
        this.textrefSets = validator.validateTextrefSets(textrefSets);
        this.titleSets = validator.validateTitleSets(titleSets);
        this.workTypeSets = validator.validateWorkTypeSets(workTypeSets);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final VraCoreObject other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<VraCoreObject> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    public static VraCoreObject create() {
        return new VraCoreObject();
    }

    /**
     * Total Nullable factory method
     */
    public static VraCoreObject create(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> agentSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> culturalContextSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> dateSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> descriptionSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> inscriptionSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locationSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> materialSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> measurementSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> relationSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rightSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> subjectSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> techniqueSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> textrefSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> titleSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypeSets) {
        return new VraCoreObject(com.google.common.base.Optional.fromNullable(agentSets), com.google.common.base.Optional.fromNullable(culturalContextSets), com.google.common.base.Optional.fromNullable(dateSets), com.google.common.base.Optional.fromNullable(descriptionSets), com.google.common.base.Optional.fromNullable(inscriptionSets), com.google.common.base.Optional.fromNullable(locationSets), com.google.common.base.Optional.fromNullable(materialSets), com.google.common.base.Optional.fromNullable(measurementSets), com.google.common.base.Optional.fromNullable(relationSets), com.google.common.base.Optional.fromNullable(rightSets), com.google.common.base.Optional.fromNullable(subjectSets), com.google.common.base.Optional.fromNullable(techniqueSets), com.google.common.base.Optional.fromNullable(textrefSets), com.google.common.base.Optional.fromNullable(titleSets), com.google.common.base.Optional.fromNullable(workTypeSets), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static VraCoreObject create(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
        return new VraCoreObject(agentSets, culturalContextSets, dateSets, descriptionSets, inscriptionSets, locationSets, materialSets, measurementSets, relationSets, rightSets, subjectSets, techniqueSets, textrefSets, titleSets, workTypeSets, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof VraCoreObject)) {
            return false;
        }

        final VraCoreObject other = (VraCoreObject)otherObject;

        if (!(((getAgentSets().isPresent() && other.getAgentSets().isPresent()) ? (getAgentSets().get().equals(other.getAgentSets().get())) : (!getAgentSets().isPresent() && !other.getAgentSets().isPresent())))) {
            return false;
        }

        if (!(((getCulturalContextSets().isPresent() && other.getCulturalContextSets().isPresent()) ? (getCulturalContextSets().get().equals(other.getCulturalContextSets().get())) : (!getCulturalContextSets().isPresent() && !other.getCulturalContextSets().isPresent())))) {
            return false;
        }

        if (!(((getDateSets().isPresent() && other.getDateSets().isPresent()) ? (getDateSets().get().equals(other.getDateSets().get())) : (!getDateSets().isPresent() && !other.getDateSets().isPresent())))) {
            return false;
        }

        if (!(((getDescriptionSets().isPresent() && other.getDescriptionSets().isPresent()) ? (getDescriptionSets().get().equals(other.getDescriptionSets().get())) : (!getDescriptionSets().isPresent() && !other.getDescriptionSets().isPresent())))) {
            return false;
        }

        if (!(((getInscriptionSets().isPresent() && other.getInscriptionSets().isPresent()) ? (getInscriptionSets().get().equals(other.getInscriptionSets().get())) : (!getInscriptionSets().isPresent() && !other.getInscriptionSets().isPresent())))) {
            return false;
        }

        if (!(((getLocationSets().isPresent() && other.getLocationSets().isPresent()) ? (getLocationSets().get().equals(other.getLocationSets().get())) : (!getLocationSets().isPresent() && !other.getLocationSets().isPresent())))) {
            return false;
        }

        if (!(((getMaterialSets().isPresent() && other.getMaterialSets().isPresent()) ? (getMaterialSets().get().equals(other.getMaterialSets().get())) : (!getMaterialSets().isPresent() && !other.getMaterialSets().isPresent())))) {
            return false;
        }

        if (!(((getMeasurementSets().isPresent() && other.getMeasurementSets().isPresent()) ? (getMeasurementSets().get().equals(other.getMeasurementSets().get())) : (!getMeasurementSets().isPresent() && !other.getMeasurementSets().isPresent())))) {
            return false;
        }

        if (!(((getRelationSets().isPresent() && other.getRelationSets().isPresent()) ? (getRelationSets().get().equals(other.getRelationSets().get())) : (!getRelationSets().isPresent() && !other.getRelationSets().isPresent())))) {
            return false;
        }

        if (!(((getRightSets().isPresent() && other.getRightSets().isPresent()) ? (getRightSets().get().equals(other.getRightSets().get())) : (!getRightSets().isPresent() && !other.getRightSets().isPresent())))) {
            return false;
        }

        if (!(((getSubjectSets().isPresent() && other.getSubjectSets().isPresent()) ? (getSubjectSets().get().equals(other.getSubjectSets().get())) : (!getSubjectSets().isPresent() && !other.getSubjectSets().isPresent())))) {
            return false;
        }

        if (!(((getTechniqueSets().isPresent() && other.getTechniqueSets().isPresent()) ? (getTechniqueSets().get().equals(other.getTechniqueSets().get())) : (!getTechniqueSets().isPresent() && !other.getTechniqueSets().isPresent())))) {
            return false;
        }

        if (!(((getTextrefSets().isPresent() && other.getTextrefSets().isPresent()) ? (getTextrefSets().get().equals(other.getTextrefSets().get())) : (!getTextrefSets().isPresent() && !other.getTextrefSets().isPresent())))) {
            return false;
        }

        if (!(((getTitleSets().isPresent() && other.getTitleSets().isPresent()) ? (getTitleSets().get().equals(other.getTitleSets().get())) : (!getTitleSets().isPresent() && !other.getTitleSets().isPresent())))) {
            return false;
        }

        if (!(((getWorkTypeSets().isPresent() && other.getWorkTypeSets().isPresent()) ? (getWorkTypeSets().get().equals(other.getWorkTypeSets().get())) : (!getWorkTypeSets().isPresent() && !other.getWorkTypeSets().isPresent())))) {
            return false;
        }

        return true;
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
        case AGENT_SETS: return getAgentSets();
        case CULTURAL_CONTEXT_SETS: return getCulturalContextSets();
        case DATE_SETS: return getDateSets();
        case DESCRIPTION_SETS: return getDescriptionSets();
        case INSCRIPTION_SETS: return getInscriptionSets();
        case LOCATION_SETS: return getLocationSets();
        case MATERIAL_SETS: return getMaterialSets();
        case MEASUREMENT_SETS: return getMeasurementSets();
        case RELATION_SETS: return getRelationSets();
        case RIGHT_SETS: return getRightSets();
        case SUBJECT_SETS: return getSubjectSets();
        case TECHNIQUE_SETS: return getTechniqueSets();
        case TEXTREF_SETS: return getTextrefSets();
        case TITLE_SETS: return getTitleSets();
        case WORK_TYPE_SETS: return getWorkTypeSets();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> getAgentSets() {
        return agentSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> getCulturalContextSets() {
        return culturalContextSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> getDateSets() {
        return dateSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> getDescriptionSets() {
        return descriptionSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> getInscriptionSets() {
        return inscriptionSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> getLocationSets() {
        return locationSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> getMaterialSets() {
        return materialSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> getMeasurementSets() {
        return measurementSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> getRelationSets() {
        return relationSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> getRightSets() {
        return rightSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> getSubjectSets() {
        return subjectSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> getTechniqueSets() {
        return techniqueSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> getTextrefSets() {
        return textrefSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> getTitleSets() {
        return titleSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> getWorkTypeSets() {
        return workTypeSets;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getAgentSets().isPresent()) {
            hashCode = 31 * hashCode + getAgentSets().get().hashCode();
        }
        if (getCulturalContextSets().isPresent()) {
            hashCode = 31 * hashCode + getCulturalContextSets().get().hashCode();
        }
        if (getDateSets().isPresent()) {
            hashCode = 31 * hashCode + getDateSets().get().hashCode();
        }
        if (getDescriptionSets().isPresent()) {
            hashCode = 31 * hashCode + getDescriptionSets().get().hashCode();
        }
        if (getInscriptionSets().isPresent()) {
            hashCode = 31 * hashCode + getInscriptionSets().get().hashCode();
        }
        if (getLocationSets().isPresent()) {
            hashCode = 31 * hashCode + getLocationSets().get().hashCode();
        }
        if (getMaterialSets().isPresent()) {
            hashCode = 31 * hashCode + getMaterialSets().get().hashCode();
        }
        if (getMeasurementSets().isPresent()) {
            hashCode = 31 * hashCode + getMeasurementSets().get().hashCode();
        }
        if (getRelationSets().isPresent()) {
            hashCode = 31 * hashCode + getRelationSets().get().hashCode();
        }
        if (getRightSets().isPresent()) {
            hashCode = 31 * hashCode + getRightSets().get().hashCode();
        }
        if (getSubjectSets().isPresent()) {
            hashCode = 31 * hashCode + getSubjectSets().get().hashCode();
        }
        if (getTechniqueSets().isPresent()) {
            hashCode = 31 * hashCode + getTechniqueSets().get().hashCode();
        }
        if (getTextrefSets().isPresent()) {
            hashCode = 31 * hashCode + getTextrefSets().get().hashCode();
        }
        if (getTitleSets().isPresent()) {
            hashCode = 31 * hashCode + getTitleSets().get().hashCode();
        }
        if (getWorkTypeSets().isPresent()) {
            hashCode = 31 * hashCode + getWorkTypeSets().get().hashCode();
        }
        return hashCode;
    }

    public static VraCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static VraCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static VraCoreObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                try {
                    agentSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 1) {
                try {
                    culturalContextSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 2) {
                try {
                    dateSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.date.DateSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 3) {
                try {
                    descriptionSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 4) {
                try {
                    inscriptionSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSCRIPTION_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 5) {
                try {
                    locationSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 6) {
                try {
                    materialSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 7) {
                try {
                    measurementSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEASUREMENT_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 8) {
                try {
                    relationSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 9) {
                try {
                    rightSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHT_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 10) {
                try {
                    subjectSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 11) {
                try {
                    techniqueSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 12) {
                try {
                    textrefSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTREF_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 13) {
                try {
                    titleSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.title.TitleSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 14) {
                try {
                    workTypeSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_SETS, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new VraCoreObject(DefaultReadValidator.getInstance().validateAgentSets(agentSets), DefaultReadValidator.getInstance().validateCulturalContextSets(culturalContextSets), DefaultReadValidator.getInstance().validateDateSets(dateSets), DefaultReadValidator.getInstance().validateDescriptionSets(descriptionSets), DefaultReadValidator.getInstance().validateInscriptionSets(inscriptionSets), DefaultReadValidator.getInstance().validateLocationSets(locationSets), DefaultReadValidator.getInstance().validateMaterialSets(materialSets), DefaultReadValidator.getInstance().validateMeasurementSets(measurementSets), DefaultReadValidator.getInstance().validateRelationSets(relationSets), DefaultReadValidator.getInstance().validateRightSets(rightSets), DefaultReadValidator.getInstance().validateSubjectSets(subjectSets), DefaultReadValidator.getInstance().validateTechniqueSets(techniqueSets), DefaultReadValidator.getInstance().validateTextrefSets(textrefSets), DefaultReadValidator.getInstance().validateTitleSets(titleSets), DefaultReadValidator.getInstance().validateWorkTypeSets(workTypeSets), NopConstructionValidator.getInstance());
    }

    public static VraCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static VraCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "agent_sets": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            agentSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "cultural_context_sets": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            culturalContextSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "date_sets": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            dateSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.date.DateSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "description_sets": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        try {
                            descriptionSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "inscription_sets": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        try {
                            inscriptionSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSCRIPTION_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "location_sets": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        try {
                            locationSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "material_sets": {
                    if (!ifield.hasId() || ifield.getId() == 7) {
                        try {
                            materialSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "measurement_sets": {
                    if (!ifield.hasId() || ifield.getId() == 8) {
                        try {
                            measurementSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEASUREMENT_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "relation_sets": {
                    if (!ifield.hasId() || ifield.getId() == 9) {
                        try {
                            relationSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "right_sets": {
                    if (!ifield.hasId() || ifield.getId() == 10) {
                        try {
                            rightSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHT_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "subject_sets": {
                    if (!ifield.hasId() || ifield.getId() == 11) {
                        try {
                            subjectSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "technique_sets": {
                    if (!ifield.hasId() || ifield.getId() == 12) {
                        try {
                            techniqueSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "textref_sets": {
                    if (!ifield.hasId() || ifield.getId() == 13) {
                        try {
                            textrefSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTREF_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "title_sets": {
                    if (!ifield.hasId() || ifield.getId() == 14) {
                        try {
                            titleSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.title.TitleSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "work_type_sets": {
                    if (!ifield.hasId() || ifield.getId() == 15) {
                        try {
                            workTypeSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_SETS, e.getCause());
                        }
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
        return new VraCoreObject(DefaultReadValidator.getInstance().validateAgentSets(agentSets), DefaultReadValidator.getInstance().validateCulturalContextSets(culturalContextSets), DefaultReadValidator.getInstance().validateDateSets(dateSets), DefaultReadValidator.getInstance().validateDescriptionSets(descriptionSets), DefaultReadValidator.getInstance().validateInscriptionSets(inscriptionSets), DefaultReadValidator.getInstance().validateLocationSets(locationSets), DefaultReadValidator.getInstance().validateMaterialSets(materialSets), DefaultReadValidator.getInstance().validateMeasurementSets(measurementSets), DefaultReadValidator.getInstance().validateRelationSets(relationSets), DefaultReadValidator.getInstance().validateRightSets(rightSets), DefaultReadValidator.getInstance().validateSubjectSets(subjectSets), DefaultReadValidator.getInstance().validateTechniqueSets(techniqueSets), DefaultReadValidator.getInstance().validateTextrefSets(textrefSets), DefaultReadValidator.getInstance().validateTitleSets(titleSets), DefaultReadValidator.getInstance().validateWorkTypeSets(workTypeSets), NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceAgentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets) {
        return new VraCoreObject(DefaultConstructionValidator.getInstance().validateAgentSets(agentSets), this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceAgentSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> agentSets) {
        return replaceAgentSets(com.google.common.base.Optional.fromNullable(agentSets));
    }

    public VraCoreObject replaceCulturalContextSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets) {
        return new VraCoreObject(this.agentSets, DefaultConstructionValidator.getInstance().validateCulturalContextSets(culturalContextSets), this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceCulturalContextSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> culturalContextSets) {
        return replaceCulturalContextSets(com.google.common.base.Optional.fromNullable(culturalContextSets));
    }

    public VraCoreObject replaceDateSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, DefaultConstructionValidator.getInstance().validateDateSets(dateSets), this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceDateSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> dateSets) {
        return replaceDateSets(com.google.common.base.Optional.fromNullable(dateSets));
    }

    public VraCoreObject replaceDescriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, DefaultConstructionValidator.getInstance().validateDescriptionSets(descriptionSets), this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceDescriptionSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> descriptionSets) {
        return replaceDescriptionSets(com.google.common.base.Optional.fromNullable(descriptionSets));
    }

    public VraCoreObject replaceInscriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, DefaultConstructionValidator.getInstance().validateInscriptionSets(inscriptionSets), this.locationSets, this.materialSets, this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceInscriptionSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> inscriptionSets) {
        return replaceInscriptionSets(com.google.common.base.Optional.fromNullable(inscriptionSets));
    }

    public VraCoreObject replaceLocationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, DefaultConstructionValidator.getInstance().validateLocationSets(locationSets), this.materialSets, this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceLocationSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locationSets) {
        return replaceLocationSets(com.google.common.base.Optional.fromNullable(locationSets));
    }

    public VraCoreObject replaceMaterialSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, DefaultConstructionValidator.getInstance().validateMaterialSets(materialSets), this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceMaterialSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> materialSets) {
        return replaceMaterialSets(com.google.common.base.Optional.fromNullable(materialSets));
    }

    public VraCoreObject replaceMeasurementSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, DefaultConstructionValidator.getInstance().validateMeasurementSets(measurementSets), this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceMeasurementSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> measurementSets) {
        return replaceMeasurementSets(com.google.common.base.Optional.fromNullable(measurementSets));
    }

    public VraCoreObject replaceRelationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, DefaultConstructionValidator.getInstance().validateRelationSets(relationSets), this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceRelationSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> relationSets) {
        return replaceRelationSets(com.google.common.base.Optional.fromNullable(relationSets));
    }

    public VraCoreObject replaceRightSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, this.relationSets, DefaultConstructionValidator.getInstance().validateRightSets(rightSets), this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceRightSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rightSets) {
        return replaceRightSets(com.google.common.base.Optional.fromNullable(rightSets));
    }

    public VraCoreObject replaceSubjectSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, this.relationSets, this.rightSets, DefaultConstructionValidator.getInstance().validateSubjectSets(subjectSets), this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceSubjectSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> subjectSets) {
        return replaceSubjectSets(com.google.common.base.Optional.fromNullable(subjectSets));
    }

    public VraCoreObject replaceTechniqueSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, DefaultConstructionValidator.getInstance().validateTechniqueSets(techniqueSets), this.textrefSets, this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceTechniqueSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> techniqueSets) {
        return replaceTechniqueSets(com.google.common.base.Optional.fromNullable(techniqueSets));
    }

    public VraCoreObject replaceTextrefSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, DefaultConstructionValidator.getInstance().validateTextrefSets(textrefSets), this.titleSets, this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceTextrefSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> textrefSets) {
        return replaceTextrefSets(com.google.common.base.Optional.fromNullable(textrefSets));
    }

    public VraCoreObject replaceTitleSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, DefaultConstructionValidator.getInstance().validateTitleSets(titleSets), this.workTypeSets, NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceTitleSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> titleSets) {
        return replaceTitleSets(com.google.common.base.Optional.fromNullable(titleSets));
    }

    public VraCoreObject replaceWorkTypeSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementSets, this.relationSets, this.rightSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, DefaultConstructionValidator.getInstance().validateWorkTypeSets(workTypeSets), NopConstructionValidator.getInstance());
    }

    public VraCoreObject replaceWorkTypeSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypeSets) {
        return replaceWorkTypeSets(com.google.common.base.Optional.fromNullable(workTypeSets));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("agent_sets", getAgentSets().orNull()).add("cultural_context_sets", getCulturalContextSets().orNull()).add("date_sets", getDateSets().orNull()).add("description_sets", getDescriptionSets().orNull()).add("inscription_sets", getInscriptionSets().orNull()).add("location_sets", getLocationSets().orNull()).add("material_sets", getMaterialSets().orNull()).add("measurement_sets", getMeasurementSets().orNull()).add("relation_sets", getRelationSets().orNull()).add("right_sets", getRightSets().orNull()).add("subject_sets", getSubjectSets().orNull()).add("technique_sets", getTechniqueSets().orNull()).add("textref_sets", getTextrefSets().orNull()).add("title_sets", getTitleSets().orNull()).add("work_type_sets", getWorkTypeSets().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 15);

        if (getAgentSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getAgentSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet _iter0 : getAgentSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getCulturalContextSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getCulturalContextSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet _iter0 : getCulturalContextSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getDateSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getDateSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.date.DateSet _iter0 : getDateSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getDescriptionSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getDescriptionSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet _iter0 : getDescriptionSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getInscriptionSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getInscriptionSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet _iter0 : getInscriptionSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getLocationSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getLocationSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.location.LocationSet _iter0 : getLocationSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getMaterialSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getMaterialSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet _iter0 : getMaterialSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getMeasurementSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getMeasurementSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet _iter0 : getMeasurementSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getRelationSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRelationSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet _iter0 : getRelationSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getRightSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRightSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet _iter0 : getRightSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getSubjectSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSubjectSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet _iter0 : getSubjectSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getTechniqueSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTechniqueSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet _iter0 : getTechniqueSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getTextrefSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTextrefSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet _iter0 : getTextrefSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getTitleSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTitleSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.title.TitleSet _iter0 : getTitleSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getWorkTypeSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getWorkTypeSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet _iter0 : getWorkTypeSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAgentSets().isPresent()) {
            oprot.writeFieldBegin("agent_sets", org.thryft.protocol.Type.LIST, (short)1);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getAgentSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet _iter0 : getAgentSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getCulturalContextSets().isPresent()) {
            oprot.writeFieldBegin("cultural_context_sets", org.thryft.protocol.Type.LIST, (short)2);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getCulturalContextSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet _iter0 : getCulturalContextSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getDateSets().isPresent()) {
            oprot.writeFieldBegin("date_sets", org.thryft.protocol.Type.LIST, (short)3);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getDateSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.date.DateSet _iter0 : getDateSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getDescriptionSets().isPresent()) {
            oprot.writeFieldBegin("description_sets", org.thryft.protocol.Type.LIST, (short)4);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getDescriptionSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet _iter0 : getDescriptionSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getInscriptionSets().isPresent()) {
            oprot.writeFieldBegin("inscription_sets", org.thryft.protocol.Type.LIST, (short)5);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getInscriptionSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet _iter0 : getInscriptionSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getLocationSets().isPresent()) {
            oprot.writeFieldBegin("location_sets", org.thryft.protocol.Type.LIST, (short)6);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getLocationSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.location.LocationSet _iter0 : getLocationSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getMaterialSets().isPresent()) {
            oprot.writeFieldBegin("material_sets", org.thryft.protocol.Type.LIST, (short)7);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getMaterialSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet _iter0 : getMaterialSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getMeasurementSets().isPresent()) {
            oprot.writeFieldBegin("measurement_sets", org.thryft.protocol.Type.LIST, (short)8);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getMeasurementSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet _iter0 : getMeasurementSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getRelationSets().isPresent()) {
            oprot.writeFieldBegin("relation_sets", org.thryft.protocol.Type.LIST, (short)9);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRelationSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet _iter0 : getRelationSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getRightSets().isPresent()) {
            oprot.writeFieldBegin("right_sets", org.thryft.protocol.Type.LIST, (short)10);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRightSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet _iter0 : getRightSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getSubjectSets().isPresent()) {
            oprot.writeFieldBegin("subject_sets", org.thryft.protocol.Type.LIST, (short)11);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSubjectSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet _iter0 : getSubjectSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getTechniqueSets().isPresent()) {
            oprot.writeFieldBegin("technique_sets", org.thryft.protocol.Type.LIST, (short)12);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTechniqueSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet _iter0 : getTechniqueSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getTextrefSets().isPresent()) {
            oprot.writeFieldBegin("textref_sets", org.thryft.protocol.Type.LIST, (short)13);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTextrefSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet _iter0 : getTextrefSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getTitleSets().isPresent()) {
            oprot.writeFieldBegin("title_sets", org.thryft.protocol.Type.LIST, (short)14);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTitleSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.title.TitleSet _iter0 : getTitleSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getWorkTypeSets().isPresent()) {
            oprot.writeFieldBegin("work_type_sets", org.thryft.protocol.Type.LIST, (short)15);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getWorkTypeSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet _iter0 : getWorkTypeSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets;
}
