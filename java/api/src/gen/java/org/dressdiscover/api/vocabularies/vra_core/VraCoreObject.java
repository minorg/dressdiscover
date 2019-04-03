package org.dressdiscover.api.vocabularies.vra_core;

public final class VraCoreObject implements org.thryft.Struct {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, VraCoreObject> {
        public Builder() {
            agentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> absent();
            culturalContextSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> absent();
            dateSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> absent();
            descriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> absent();
            inscriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> absent();
            locationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> absent();
            materialSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> absent();
            measurementsSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> absent();
            relationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> absent();
            rightsSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> absent();
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
            this.measurementsSets = other.getMeasurementsSets();
            this.relationSets = other.getRelationSets();
            this.rightsSets = other.getRightsSets();
            this.subjectSets = other.getSubjectSets();
            this.techniqueSets = other.getTechniqueSets();
            this.textrefSets = other.getTextrefSets();
            this.titleSets = other.getTitleSets();
            this.workTypeSets = other.getWorkTypeSets();
        }

        protected VraCoreObject _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementsSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightsSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
            return new VraCoreObject(agentSets, culturalContextSets, dateSets, descriptionSets, inscriptionSets, locationSets, materialSets, measurementsSets, relationSets, rightsSets, subjectSets, techniqueSets, textrefSets, titleSets, workTypeSets);
        }

        public VraCoreObject build() {
            Validator.validate(agentSets, culturalContextSets, dateSets, descriptionSets, inscriptionSets, locationSets, materialSets, measurementsSets, relationSets, rightsSets, subjectSets, techniqueSets, textrefSets, titleSets, workTypeSets);

            return _build(agentSets, culturalContextSets, dateSets, descriptionSets, inscriptionSets, locationSets, materialSets, measurementsSets, relationSets, rightsSets, subjectSets, techniqueSets, textrefSets, titleSets, workTypeSets);
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

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> getMeasurementsSets() {
            return measurementsSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> getRelationSets() {
            return relationSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> getRightsSets() {
            return rightsSets;
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

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    try {
                        this.setAgentSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 1) {
                    try {
                        this.setCulturalContextSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 2) {
                    try {
                        this.setDateSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 3) {
                    try {
                        this.setDescriptionSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 4) {
                    try {
                        this.setInscriptionSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSCRIPTION_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 5) {
                    try {
                        this.setLocationSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 6) {
                    try {
                        this.setMaterialSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 7) {
                    try {
                        this.setMeasurementsSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEASUREMENTS_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 8) {
                    try {
                        this.setRelationSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 9) {
                    try {
                        this.setRightsSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 10) {
                    try {
                        this.setSubjectSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 11) {
                    try {
                        this.setTechniqueSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 12) {
                    try {
                        this.setTextrefSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTREF_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 13) {
                    try {
                        this.setTitleSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 14) {
                    try {
                        this.setWorkTypeSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_SETS, e.getCause());
                    }
                }
                iprot.readListEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
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
                                    this.setAgentSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "cultural_context_sets": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                try {
                                    this.setCulturalContextSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "date_sets": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                try {
                                    this.setDateSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.date.DateSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "description_sets": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                                try {
                                    this.setDescriptionSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "inscription_sets": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                                try {
                                    this.setInscriptionSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSCRIPTION_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "location_sets": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                                try {
                                    this.setLocationSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "material_sets": {
                        if (!ifield.hasId() || ifield.getId() == 7) {
                                try {
                                    this.setMaterialSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "measurements_sets": {
                        if (!ifield.hasId() || ifield.getId() == 8) {
                                try {
                                    this.setMeasurementsSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEASUREMENTS_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "relation_sets": {
                        if (!ifield.hasId() || ifield.getId() == 9) {
                                try {
                                    this.setRelationSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "rights_sets": {
                        if (!ifield.hasId() || ifield.getId() == 10) {
                                try {
                                    this.setRightsSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "subject_sets": {
                        if (!ifield.hasId() || ifield.getId() == 11) {
                                try {
                                    this.setSubjectSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "technique_sets": {
                        if (!ifield.hasId() || ifield.getId() == 12) {
                                try {
                                    this.setTechniqueSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "textref_sets": {
                        if (!ifield.hasId() || ifield.getId() == 13) {
                                try {
                                    this.setTextrefSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEXTREF_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "title_sets": {
                        if (!ifield.hasId() || ifield.getId() == 14) {
                                try {
                                    this.setTitleSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.title.TitleSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "work_type_sets": {
                        if (!ifield.hasId() || ifield.getId() == 15) {
                                try {
                                    this.setWorkTypeSets(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>>() {
                                        @Override
                                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                            try {
                                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet.readAsStruct(iprot, unknownFieldCallback));
                                                }
                                                iprot.readListEnd();
                                                return sequenceBuilder.build();
                                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                            }
                                        }
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_SETS, e.getCause());
                                }
                        }
                        break;
                    }
                    default:
                        unknownFieldCallback.apply(ifield);
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            case MEASUREMENTS_SETS: setMeasurementsSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>)value); return this;
            case RELATION_SETS: setRelationSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>)value); return this;
            case RIGHTS_SETS: setRightsSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>)value); return this;
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
            Validator.validateAgentSets(agentSets);
            this.agentSets = agentSets;
            return this;
        }

        public Builder setAgentSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> agentSets) {
            return setAgentSets(com.google.common.base.Optional.fromNullable(agentSets));
        }

        public Builder setCulturalContextSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets) {
            Validator.validateCulturalContextSets(culturalContextSets);
            this.culturalContextSets = culturalContextSets;
            return this;
        }

        public Builder setCulturalContextSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> culturalContextSets) {
            return setCulturalContextSets(com.google.common.base.Optional.fromNullable(culturalContextSets));
        }

        public Builder setDateSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets) {
            Validator.validateDateSets(dateSets);
            this.dateSets = dateSets;
            return this;
        }

        public Builder setDateSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> dateSets) {
            return setDateSets(com.google.common.base.Optional.fromNullable(dateSets));
        }

        public Builder setDescriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets) {
            Validator.validateDescriptionSets(descriptionSets);
            this.descriptionSets = descriptionSets;
            return this;
        }

        public Builder setDescriptionSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> descriptionSets) {
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
            if (other.getMeasurementsSets().isPresent()) {
                setMeasurementsSets(other.getMeasurementsSets());
            }
            if (other.getRelationSets().isPresent()) {
                setRelationSets(other.getRelationSets());
            }
            if (other.getRightsSets().isPresent()) {
                setRightsSets(other.getRightsSets());
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
            Validator.validateInscriptionSets(inscriptionSets);
            this.inscriptionSets = inscriptionSets;
            return this;
        }

        public Builder setInscriptionSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> inscriptionSets) {
            return setInscriptionSets(com.google.common.base.Optional.fromNullable(inscriptionSets));
        }

        public Builder setLocationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets) {
            Validator.validateLocationSets(locationSets);
            this.locationSets = locationSets;
            return this;
        }

        public Builder setLocationSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locationSets) {
            return setLocationSets(com.google.common.base.Optional.fromNullable(locationSets));
        }

        public Builder setMaterialSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets) {
            Validator.validateMaterialSets(materialSets);
            this.materialSets = materialSets;
            return this;
        }

        public Builder setMaterialSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> materialSets) {
            return setMaterialSets(com.google.common.base.Optional.fromNullable(materialSets));
        }

        public Builder setMeasurementsSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementsSets) {
            Validator.validateMeasurementsSets(measurementsSets);
            this.measurementsSets = measurementsSets;
            return this;
        }

        public Builder setMeasurementsSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> measurementsSets) {
            return setMeasurementsSets(com.google.common.base.Optional.fromNullable(measurementsSets));
        }

        public Builder setRelationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets) {
            Validator.validateRelationSets(relationSets);
            this.relationSets = relationSets;
            return this;
        }

        public Builder setRelationSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> relationSets) {
            return setRelationSets(com.google.common.base.Optional.fromNullable(relationSets));
        }

        public Builder setRightsSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightsSets) {
            Validator.validateRightsSets(rightsSets);
            this.rightsSets = rightsSets;
            return this;
        }

        public Builder setRightsSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rightsSets) {
            return setRightsSets(com.google.common.base.Optional.fromNullable(rightsSets));
        }

        public Builder setSubjectSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets) {
            Validator.validateSubjectSets(subjectSets);
            this.subjectSets = subjectSets;
            return this;
        }

        public Builder setSubjectSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> subjectSets) {
            return setSubjectSets(com.google.common.base.Optional.fromNullable(subjectSets));
        }

        public Builder setTechniqueSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets) {
            Validator.validateTechniqueSets(techniqueSets);
            this.techniqueSets = techniqueSets;
            return this;
        }

        public Builder setTechniqueSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> techniqueSets) {
            return setTechniqueSets(com.google.common.base.Optional.fromNullable(techniqueSets));
        }

        public Builder setTextrefSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets) {
            Validator.validateTextrefSets(textrefSets);
            this.textrefSets = textrefSets;
            return this;
        }

        public Builder setTextrefSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> textrefSets) {
            return setTextrefSets(com.google.common.base.Optional.fromNullable(textrefSets));
        }

        public Builder setTitleSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets) {
            Validator.validateTitleSets(titleSets);
            this.titleSets = titleSets;
            return this;
        }

        public Builder setTitleSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> titleSets) {
            return setTitleSets(com.google.common.base.Optional.fromNullable(titleSets));
        }

        public Builder setWorkTypeSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
            Validator.validateWorkTypeSets(workTypeSets);
            this.workTypeSets = workTypeSets;
            return this;
        }

        public Builder setWorkTypeSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypeSets) {
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
            case MEASUREMENTS_SETS: return unsetMeasurementsSets();
            case RELATION_SETS: return unsetRelationSets();
            case RIGHTS_SETS: return unsetRightsSets();
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

        public Builder unsetMeasurementsSets() {
            this.measurementsSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> absent();
            return this;
        }

        public Builder unsetRelationSets() {
            this.relationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> absent();
            return this;
        }

        public Builder unsetRightsSets() {
            this.rightsSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> absent();
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
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementsSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightsSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<VraCoreObject> {
        @Override
        public VraCoreObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return VraCoreObject.readAsList(iprot);
        }

        @Override
        public VraCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return VraCoreObject.readAsStruct(iprot);
        }

        @Override
        public VraCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return VraCoreObject.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        AGENT_SETS("agentSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>>() {}, false, (short)1, "agent_sets", "1:agent_sets", org.thryft.protocol.Type.LIST),
        CULTURAL_CONTEXT_SETS("culturalContextSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>>() {}, false, (short)2, "cultural_context_sets", "2:cultural_context_sets", org.thryft.protocol.Type.LIST),
        DATE_SETS("dateSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>>() {}, false, (short)3, "date_sets", "3:date_sets", org.thryft.protocol.Type.LIST),
        DESCRIPTION_SETS("descriptionSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>>() {}, false, (short)4, "description_sets", "4:description_sets", org.thryft.protocol.Type.LIST),
        INSCRIPTION_SETS("inscriptionSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>>() {}, false, (short)5, "inscription_sets", "5:inscription_sets", org.thryft.protocol.Type.LIST),
        LOCATION_SETS("locationSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>>() {}, false, (short)6, "location_sets", "6:location_sets", org.thryft.protocol.Type.LIST),
        MATERIAL_SETS("materialSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>>() {}, false, (short)7, "material_sets", "7:material_sets", org.thryft.protocol.Type.LIST),
        MEASUREMENTS_SETS("measurementsSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>>() {}, false, (short)8, "measurements_sets", "8:measurements_sets", org.thryft.protocol.Type.LIST),
        RELATION_SETS("relationSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>>() {}, false, (short)9, "relation_sets", "9:relation_sets", org.thryft.protocol.Type.LIST),
        RIGHTS_SETS("rightsSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>>() {}, false, (short)10, "rights_sets", "10:rights_sets", org.thryft.protocol.Type.LIST),
        SUBJECT_SETS("subjectSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>>() {}, false, (short)11, "subject_sets", "11:subject_sets", org.thryft.protocol.Type.LIST),
        TECHNIQUE_SETS("techniqueSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>>() {}, false, (short)12, "technique_sets", "12:technique_sets", org.thryft.protocol.Type.LIST),
        TEXTREF_SETS("textrefSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>>() {}, false, (short)13, "textref_sets", "13:textref_sets", org.thryft.protocol.Type.LIST),
        TITLE_SETS("titleSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>>() {}, false, (short)14, "title_sets", "14:title_sets", org.thryft.protocol.Type.LIST),
        WORK_TYPE_SETS("workTypeSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>>() {}, false, (short)15, "work_type_sets", "15:work_type_sets", org.thryft.protocol.Type.LIST);

        @Override
        public String getJavaName() {
            return javaName;
        }

        @Override
        public com.google.common.reflect.TypeToken<?> getJavaType() {
            return javaType;
        }

        @Override
        public short getThriftId() {
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
            case "measurementsSets": return MEASUREMENTS_SETS;
            case "relationSets": return RELATION_SETS;
            case "rightsSets": return RIGHTS_SETS;
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
            case "measurements_sets": return MEASUREMENTS_SETS;
            case "relation_sets": return RELATION_SETS;
            case "rights_sets": return RIGHTS_SETS;
            case "subject_sets": return SUBJECT_SETS;
            case "technique_sets": return TECHNIQUE_SETS;
            case "textref_sets": return TEXTREF_SETS;
            case "title_sets": return TITLE_SETS;
            case "work_type_sets": return WORK_TYPE_SETS;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            this.thriftProtocolKey = thriftProtocolKey;
            this.thriftProtocolType = thriftProtocolType;
        }

        private final String javaName;
        private final com.google.common.reflect.TypeToken<?> javaType;
        private final boolean required;
        private final short thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public final static class Validator {
        public static void validate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementsSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightsSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
            validateAgentSets(agentSets);
            validateCulturalContextSets(culturalContextSets);
            validateDateSets(dateSets);
            validateDescriptionSets(descriptionSets);
            validateInscriptionSets(inscriptionSets);
            validateLocationSets(locationSets);
            validateMaterialSets(materialSets);
            validateMeasurementsSets(measurementsSets);
            validateRelationSets(relationSets);
            validateRightsSets(rightsSets);
            validateSubjectSets(subjectSets);
            validateTechniqueSets(techniqueSets);
            validateTextrefSets(textrefSets);
            validateTitleSets(titleSets);
            validateWorkTypeSets(workTypeSets);
        }

        public static void validateAgentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets) {
            if (agentSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: agentSets is missing");
            }
            if (agentSets.isPresent()) {
                if (agentSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: agentSets: less than min length 1");
                }
            }
        }

        public static void validateCulturalContextSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets) {
            if (culturalContextSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: culturalContextSets is missing");
            }
            if (culturalContextSets.isPresent()) {
                if (culturalContextSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: culturalContextSets: less than min length 1");
                }
            }
        }

        public static void validateDateSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets) {
            if (dateSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: dateSets is missing");
            }
            if (dateSets.isPresent()) {
                if (dateSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: dateSets: less than min length 1");
                }
            }
        }

        public static void validateDescriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets) {
            if (descriptionSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: descriptionSets is missing");
            }
            if (descriptionSets.isPresent()) {
                if (descriptionSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: descriptionSets: less than min length 1");
                }
            }
        }

        public static void validateInscriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets) {
            if (inscriptionSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: inscriptionSets is missing");
            }
            if (inscriptionSets.isPresent()) {
                if (inscriptionSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: inscriptionSets: less than min length 1");
                }
            }
        }

        public static void validateLocationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets) {
            if (locationSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: locationSets is missing");
            }
            if (locationSets.isPresent()) {
                if (locationSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: locationSets: less than min length 1");
                }
            }
        }

        public static void validateMaterialSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets) {
            if (materialSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: materialSets is missing");
            }
            if (materialSets.isPresent()) {
                if (materialSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: materialSets: less than min length 1");
                }
            }
        }

        public static void validateMeasurementsSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementsSets) {
            if (measurementsSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: measurementsSets is missing");
            }
            if (measurementsSets.isPresent()) {
                if (measurementsSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: measurementsSets: less than min length 1");
                }
            }
        }

        public static void validateRelationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets) {
            if (relationSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: relationSets is missing");
            }
            if (relationSets.isPresent()) {
                if (relationSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: relationSets: less than min length 1");
                }
            }
        }

        public static void validateRightsSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightsSets) {
            if (rightsSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: rightsSets is missing");
            }
            if (rightsSets.isPresent()) {
                if (rightsSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: rightsSets: less than min length 1");
                }
            }
        }

        public static void validateSubjectSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets) {
            if (subjectSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: subjectSets is missing");
            }
            if (subjectSets.isPresent()) {
                if (subjectSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: subjectSets: less than min length 1");
                }
            }
        }

        public static void validateTechniqueSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets) {
            if (techniqueSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: techniqueSets is missing");
            }
            if (techniqueSets.isPresent()) {
                if (techniqueSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: techniqueSets: less than min length 1");
                }
            }
        }

        public static void validateTextrefSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets) {
            if (textrefSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: textrefSets is missing");
            }
            if (textrefSets.isPresent()) {
                if (textrefSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: textrefSets: less than min length 1");
                }
            }
        }

        public static void validateTitleSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets) {
            if (titleSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: titleSets is missing");
            }
            if (titleSets.isPresent()) {
                if (titleSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: titleSets: less than min length 1");
                }
            }
        }

        public static void validateWorkTypeSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
            if (workTypeSets == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: workTypeSets is missing");
            }
            if (workTypeSets.isPresent()) {
                if (workTypeSets.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject: workTypeSets: less than min length 1");
                }
            }
        }
    }

    /**
     * Default constructor
     */
    @Deprecated
    public VraCoreObject() {
        agentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> absent();
        culturalContextSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> absent();
        dateSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> absent();
        descriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> absent();
        inscriptionSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> absent();
        locationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> absent();
        materialSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> absent();
        measurementsSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> absent();
        relationSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> absent();
        rightsSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> absent();
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
        this(other.getAgentSets(), other.getCulturalContextSets(), other.getDateSets(), other.getDescriptionSets(), other.getInscriptionSets(), other.getLocationSets(), other.getMaterialSets(), other.getMeasurementsSets(), other.getRelationSets(), other.getRightsSets(), other.getSubjectSets(), other.getTechniqueSets(), other.getTextrefSets(), other.getTitleSets(), other.getWorkTypeSets());
    }

    /**
     * Total constructor
     */
    public VraCoreObject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementsSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightsSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
        Validator.validate(agentSets, culturalContextSets, dateSets, descriptionSets, inscriptionSets, locationSets, materialSets, measurementsSets, relationSets, rightsSets, subjectSets, techniqueSets, textrefSets, titleSets, workTypeSets);
        this.agentSets = agentSets;
        this.culturalContextSets = culturalContextSets;
        this.dateSets = dateSets;
        this.descriptionSets = descriptionSets;
        this.inscriptionSets = inscriptionSets;
        this.locationSets = locationSets;
        this.materialSets = materialSets;
        this.measurementsSets = measurementsSets;
        this.relationSets = relationSets;
        this.rightsSets = rightsSets;
        this.subjectSets = subjectSets;
        this.techniqueSets = techniqueSets;
        this.textrefSets = textrefSets;
        this.titleSets = titleSets;
        this.workTypeSets = workTypeSets;
    }

    /**
     * Total Nullable constructor
     */
    public VraCoreObject(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> agentSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> culturalContextSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> dateSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> descriptionSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> inscriptionSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locationSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> materialSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> measurementsSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> relationSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rightsSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> subjectSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> techniqueSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> textrefSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> titleSets, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypeSets) {
        this(com.google.common.base.Optional.fromNullable(agentSets), com.google.common.base.Optional.fromNullable(culturalContextSets), com.google.common.base.Optional.fromNullable(dateSets), com.google.common.base.Optional.fromNullable(descriptionSets), com.google.common.base.Optional.fromNullable(inscriptionSets), com.google.common.base.Optional.fromNullable(locationSets), com.google.common.base.Optional.fromNullable(materialSets), com.google.common.base.Optional.fromNullable(measurementsSets), com.google.common.base.Optional.fromNullable(relationSets), com.google.common.base.Optional.fromNullable(rightsSets), com.google.common.base.Optional.fromNullable(subjectSets), com.google.common.base.Optional.fromNullable(techniqueSets), com.google.common.base.Optional.fromNullable(textrefSets), com.google.common.base.Optional.fromNullable(titleSets), com.google.common.base.Optional.fromNullable(workTypeSets));
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

        if (!(((getMeasurementsSets().isPresent() && other.getMeasurementsSets().isPresent()) ? (getMeasurementsSets().get().equals(other.getMeasurementsSets().get())) : (!getMeasurementsSets().isPresent() && !other.getMeasurementsSets().isPresent())))) {
            return false;
        }

        if (!(((getRelationSets().isPresent() && other.getRelationSets().isPresent()) ? (getRelationSets().get().equals(other.getRelationSets().get())) : (!getRelationSets().isPresent() && !other.getRelationSets().isPresent())))) {
            return false;
        }

        if (!(((getRightsSets().isPresent() && other.getRightsSets().isPresent()) ? (getRightsSets().get().equals(other.getRightsSets().get())) : (!getRightsSets().isPresent() && !other.getRightsSets().isPresent())))) {
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
        case MEASUREMENTS_SETS: return getMeasurementsSets();
        case RELATION_SETS: return getRelationSets();
        case RIGHTS_SETS: return getRightsSets();
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

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> getMeasurementsSets() {
        return measurementsSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> getRelationSets() {
        return relationSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> getRightsSets() {
        return rightsSets;
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
        if (getMeasurementsSets().isPresent()) {
            hashCode = 31 * hashCode + getMeasurementsSets().get().hashCode();
        }
        if (getRelationSets().isPresent()) {
            hashCode = 31 * hashCode + getRelationSets().get().hashCode();
        }
        if (getRightsSets().isPresent()) {
            hashCode = 31 * hashCode + getRightsSets().get().hashCode();
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

    public static VraCoreObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static VraCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static VraCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public VraCoreObject replaceAgentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets) {
        Validator.validateAgentSets(agentSets);
        return new VraCoreObject(agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceAgentSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet> agentSets) {
        return replaceAgentSets(com.google.common.base.Optional.fromNullable(agentSets));
    }

    public VraCoreObject replaceCulturalContextSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets) {
        Validator.validateCulturalContextSets(culturalContextSets);
        return new VraCoreObject(this.agentSets, culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceCulturalContextSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet> culturalContextSets) {
        return replaceCulturalContextSets(com.google.common.base.Optional.fromNullable(culturalContextSets));
    }

    public VraCoreObject replaceDateSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets) {
        Validator.validateDateSets(dateSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceDateSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet> dateSets) {
        return replaceDateSets(com.google.common.base.Optional.fromNullable(dateSets));
    }

    public VraCoreObject replaceDescriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets) {
        Validator.validateDescriptionSets(descriptionSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceDescriptionSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet> descriptionSets) {
        return replaceDescriptionSets(com.google.common.base.Optional.fromNullable(descriptionSets));
    }

    public VraCoreObject replaceInscriptionSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets) {
        Validator.validateInscriptionSets(inscriptionSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceInscriptionSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet> inscriptionSets) {
        return replaceInscriptionSets(com.google.common.base.Optional.fromNullable(inscriptionSets));
    }

    public VraCoreObject replaceLocationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets) {
        Validator.validateLocationSets(locationSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceLocationSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locationSets) {
        return replaceLocationSets(com.google.common.base.Optional.fromNullable(locationSets));
    }

    public VraCoreObject replaceMaterialSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets) {
        Validator.validateMaterialSets(materialSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceMaterialSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet> materialSets) {
        return replaceMaterialSets(com.google.common.base.Optional.fromNullable(materialSets));
    }

    public VraCoreObject replaceMeasurementsSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementsSets) {
        Validator.validateMeasurementsSets(measurementsSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceMeasurementsSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet> measurementsSets) {
        return replaceMeasurementsSets(com.google.common.base.Optional.fromNullable(measurementsSets));
    }

    public VraCoreObject replaceRelationSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets) {
        Validator.validateRelationSets(relationSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceRelationSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet> relationSets) {
        return replaceRelationSets(com.google.common.base.Optional.fromNullable(relationSets));
    }

    public VraCoreObject replaceRightsSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightsSets) {
        Validator.validateRightsSets(rightsSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceRightsSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> rightsSets) {
        return replaceRightsSets(com.google.common.base.Optional.fromNullable(rightsSets));
    }

    public VraCoreObject replaceSubjectSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets) {
        Validator.validateSubjectSets(subjectSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceSubjectSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet> subjectSets) {
        return replaceSubjectSets(com.google.common.base.Optional.fromNullable(subjectSets));
    }

    public VraCoreObject replaceTechniqueSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets) {
        Validator.validateTechniqueSets(techniqueSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, techniqueSets, this.textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceTechniqueSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet> techniqueSets) {
        return replaceTechniqueSets(com.google.common.base.Optional.fromNullable(techniqueSets));
    }

    public VraCoreObject replaceTextrefSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets) {
        Validator.validateTextrefSets(textrefSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, textrefSets, this.titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceTextrefSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet> textrefSets) {
        return replaceTextrefSets(com.google.common.base.Optional.fromNullable(textrefSets));
    }

    public VraCoreObject replaceTitleSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets) {
        Validator.validateTitleSets(titleSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, titleSets, this.workTypeSets);
    }

    public VraCoreObject replaceTitleSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet> titleSets) {
        return replaceTitleSets(com.google.common.base.Optional.fromNullable(titleSets));
    }

    public VraCoreObject replaceWorkTypeSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets) {
        Validator.validateWorkTypeSets(workTypeSets);
        return new VraCoreObject(this.agentSets, this.culturalContextSets, this.dateSets, this.descriptionSets, this.inscriptionSets, this.locationSets, this.materialSets, this.measurementsSets, this.relationSets, this.rightsSets, this.subjectSets, this.techniqueSets, this.textrefSets, this.titleSets, workTypeSets);
    }

    public VraCoreObject replaceWorkTypeSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypeSets) {
        return replaceWorkTypeSets(com.google.common.base.Optional.fromNullable(workTypeSets));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("agent_sets", getAgentSets().orNull()).add("cultural_context_sets", getCulturalContextSets().orNull()).add("date_sets", getDateSets().orNull()).add("description_sets", getDescriptionSets().orNull()).add("inscription_sets", getInscriptionSets().orNull()).add("location_sets", getLocationSets().orNull()).add("material_sets", getMaterialSets().orNull()).add("measurements_sets", getMeasurementsSets().orNull()).add("relation_sets", getRelationSets().orNull()).add("rights_sets", getRightsSets().orNull()).add("subject_sets", getSubjectSets().orNull()).add("technique_sets", getTechniqueSets().orNull()).add("textref_sets", getTextrefSets().orNull()).add("title_sets", getTitleSets().orNull()).add("work_type_sets", getWorkTypeSets().orNull()).toString();
    }

    public void writeAgentSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAgentSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.AGENT_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getAgentSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet _iter0 : getAgentSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 15);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.vra_core.VraCoreObject");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeCulturalContextSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCulturalContextSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.CULTURAL_CONTEXT_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getCulturalContextSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet _iter0 : getCulturalContextSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeDateSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDateSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DATE_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getDateSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.date.DateSet _iter0 : getDateSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeDescriptionSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDescriptionSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DESCRIPTION_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getDescriptionSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet _iter0 : getDescriptionSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
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
        if (getMeasurementsSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getMeasurementsSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet _iter0 : getMeasurementsSets().get()) {
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
        if (getRightsSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRightsSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet _iter0 : getRightsSets().get()) {
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
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeAgentSetsField(oprot);

        writeCulturalContextSetsField(oprot);

        writeDateSetsField(oprot);

        writeDescriptionSetsField(oprot);

        writeInscriptionSetsField(oprot);

        writeLocationSetsField(oprot);

        writeMaterialSetsField(oprot);

        writeMeasurementsSetsField(oprot);

        writeRelationSetsField(oprot);

        writeRightsSetsField(oprot);

        writeSubjectSetsField(oprot);

        writeTechniqueSetsField(oprot);

        writeTextrefSetsField(oprot);

        writeTitleSetsField(oprot);

        writeWorkTypeSetsField(oprot);

        oprot.writeFieldStop();
    }

    public void writeInscriptionSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getInscriptionSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INSCRIPTION_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getInscriptionSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet _iter0 : getInscriptionSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeLocationSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getLocationSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.LOCATION_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getLocationSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.location.LocationSet _iter0 : getLocationSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeMaterialSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getMaterialSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.MATERIAL_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getMaterialSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet _iter0 : getMaterialSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeMeasurementsSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getMeasurementsSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.MEASUREMENTS_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getMeasurementsSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet _iter0 : getMeasurementsSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeRelationSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRelationSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.RELATION_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRelationSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet _iter0 : getRelationSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeRightsSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRightsSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.RIGHTS_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getRightsSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet _iter0 : getRightsSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeSubjectSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getSubjectSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.SUBJECT_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getSubjectSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet _iter0 : getSubjectSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTechniqueSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getTechniqueSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TECHNIQUE_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTechniqueSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet _iter0 : getTechniqueSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTextrefSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getTextrefSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TEXTREF_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTextrefSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet _iter0 : getTextrefSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTitleSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getTitleSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TITLE_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getTitleSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.title.TitleSet _iter0 : getTitleSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeWorkTypeSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getWorkTypeSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.WORK_TYPE_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getWorkTypeSets().get().size());
            for (final org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet _iter0 : getWorkTypeSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public final static VraCoreObject EMPTY = new VraCoreObject();

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.agent.AgentSet>> agentSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.cultural_context.CulturalContextSet>> culturalContextSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.date.DateSet>> dateSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.description.DescriptionSet>> descriptionSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.inscription.InscriptionSet>> inscriptionSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>> locationSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.material.MaterialSet>> materialSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.measurements.MeasurementsSet>> measurementsSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.relation.RelationSet>> relationSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>> rightsSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.subject.SubjectSet>> subjectSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.technique.TechniqueSet>> techniqueSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.textref.TextrefSet>> textrefSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.title.TitleSet>> titleSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>> workTypeSets;
}
