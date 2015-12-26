package net.lab1318.costume.api.services.object;

public class ObjectFacetFilters implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            excludeAgentNameTexts = com.google.common.base.Optional.absent();
            excludeAll = com.google.common.base.Optional.absent();
            excludeCategories = com.google.common.base.Optional.absent();
            excludeCollections = com.google.common.base.Optional.absent();
            excludeGenders = com.google.common.base.Optional.absent();
            excludeInstitutions = com.google.common.base.Optional.absent();
            excludeMaterialTexts = com.google.common.base.Optional.absent();
            excludeSubjectTermTexts = com.google.common.base.Optional.absent();
            excludeTechniqueTexts = com.google.common.base.Optional.absent();
            excludeWorkTypeTexts = com.google.common.base.Optional.absent();
            includeAgentNameTexts = com.google.common.base.Optional.absent();
            includeCategories = com.google.common.base.Optional.absent();
            includeCollections = com.google.common.base.Optional.absent();
            includeGenders = com.google.common.base.Optional.absent();
            includeInstitutions = com.google.common.base.Optional.absent();
            includeMaterialTexts = com.google.common.base.Optional.absent();
            includeSubjectTermTexts = com.google.common.base.Optional.absent();
            includeTechniqueTexts = com.google.common.base.Optional.absent();
            includeWorkTypeTexts = com.google.common.base.Optional.absent();
        }

        public Builder(final ObjectFacetFilters other) {
            this.excludeAgentNameTexts = other.getExcludeAgentNameTexts();
            this.excludeAll = other.getExcludeAll();
            this.excludeCategories = other.getExcludeCategories();
            this.excludeCollections = other.getExcludeCollections();
            this.excludeGenders = other.getExcludeGenders();
            this.excludeInstitutions = other.getExcludeInstitutions();
            this.excludeMaterialTexts = other.getExcludeMaterialTexts();
            this.excludeSubjectTermTexts = other.getExcludeSubjectTermTexts();
            this.excludeTechniqueTexts = other.getExcludeTechniqueTexts();
            this.excludeWorkTypeTexts = other.getExcludeWorkTypeTexts();
            this.includeAgentNameTexts = other.getIncludeAgentNameTexts();
            this.includeCategories = other.getIncludeCategories();
            this.includeCollections = other.getIncludeCollections();
            this.includeGenders = other.getIncludeGenders();
            this.includeInstitutions = other.getIncludeInstitutions();
            this.includeMaterialTexts = other.getIncludeMaterialTexts();
            this.includeSubjectTermTexts = other.getIncludeSubjectTermTexts();
            this.includeTechniqueTexts = other.getIncludeTechniqueTexts();
            this.includeWorkTypeTexts = other.getIncludeWorkTypeTexts();
        }

        protected ObjectFacetFilters _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts, final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            return new ObjectFacetFilters(excludeAgentNameTexts, excludeAll, excludeCategories, excludeCollections, excludeGenders, excludeInstitutions, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeAgentNameTexts, includeCategories, includeCollections, includeGenders, includeInstitutions, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
        }

        public ObjectFacetFilters build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(excludeAgentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeAgentNameTexts"), com.google.common.base.Preconditions.checkNotNull(excludeAll, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeAll"), com.google.common.base.Preconditions.checkNotNull(excludeCategories, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeCategories"), com.google.common.base.Preconditions.checkNotNull(excludeCollections, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeCollections"), com.google.common.base.Preconditions.checkNotNull(excludeGenders, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeGenders"), com.google.common.base.Preconditions.checkNotNull(excludeInstitutions, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeInstitutions"), com.google.common.base.Preconditions.checkNotNull(excludeMaterialTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeMaterialTexts"), com.google.common.base.Preconditions.checkNotNull(excludeSubjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeSubjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(excludeTechniqueTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeTechniqueTexts"), com.google.common.base.Preconditions.checkNotNull(excludeWorkTypeTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeWorkTypeTexts"), com.google.common.base.Preconditions.checkNotNull(includeAgentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeAgentNameTexts"), com.google.common.base.Preconditions.checkNotNull(includeCategories, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeCategories"), com.google.common.base.Preconditions.checkNotNull(includeCollections, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeCollections"), com.google.common.base.Preconditions.checkNotNull(includeGenders, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeGenders"), com.google.common.base.Preconditions.checkNotNull(includeInstitutions, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeInstitutions"), com.google.common.base.Preconditions.checkNotNull(includeMaterialTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeMaterialTexts"), com.google.common.base.Preconditions.checkNotNull(includeSubjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeSubjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(includeTechniqueTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeTechniqueTexts"), com.google.common.base.Preconditions.checkNotNull(includeWorkTypeTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeWorkTypeTexts"));
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeAgentNameTexts() {
            return excludeAgentNameTexts;
        }

        public final com.google.common.base.Optional<Boolean> getExcludeAll() {
            return excludeAll;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeCategories() {
            return excludeCategories;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> getExcludeCollections() {
            return excludeCollections;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> getExcludeGenders() {
            return excludeGenders;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getExcludeInstitutions() {
            return excludeInstitutions;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeMaterialTexts() {
            return excludeMaterialTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeSubjectTermTexts() {
            return excludeSubjectTermTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeTechniqueTexts() {
            return excludeTechniqueTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeWorkTypeTexts() {
            return excludeWorkTypeTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeAgentNameTexts() {
            return includeAgentNameTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeCategories() {
            return includeCategories;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> getIncludeCollections() {
            return includeCollections;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> getIncludeGenders() {
            return includeGenders;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getIncludeInstitutions() {
            return includeInstitutions;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeMaterialTexts() {
            return includeMaterialTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeSubjectTermTexts() {
            return includeSubjectTermTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeTechniqueTexts() {
            return includeTechniqueTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeWorkTypeTexts() {
            return includeWorkTypeTexts;
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
            if (__list.getSize() > 0) {
                try {
                    excludeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 1) {
                excludeAll = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 2) {
                try {
                    excludeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 3) {
                try {
                    excludeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 4) {
                try {
                    excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 5) {
                try {
                    excludeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
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
                    excludeMaterialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 7) {
                try {
                    excludeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 8) {
                try {
                    excludeTechniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 9) {
                try {
                    excludeWorkTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 10) {
                try {
                    includeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
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
                try {
                    includeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 12) {
                try {
                    includeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 13) {
                try {
                    includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 14) {
                try {
                    includeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 15) {
                try {
                    includeMaterialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 16) {
                try {
                    includeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 17) {
                try {
                    includeTechniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 18) {
                try {
                    includeWorkTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
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
                case "exclude_agent_name_texts": {
                    try {
                        excludeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_all": {
                    excludeAll = com.google.common.base.Optional.of(iprot.readBool());
                    break;
                }
                case "exclude_categories": {
                    try {
                        excludeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_collections": {
                    try {
                        excludeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_genders": {
                    try {
                        excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                                        } catch (final IllegalArgumentException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_institutions": {
                    try {
                        excludeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_material_texts": {
                    try {
                        excludeMaterialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_subject_term_texts": {
                    try {
                        excludeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_technique_texts": {
                    try {
                        excludeTechniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_work_type_texts": {
                    try {
                        excludeWorkTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_agent_name_texts": {
                    try {
                        includeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_categories": {
                    try {
                        includeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_collections": {
                    try {
                        includeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_genders": {
                    try {
                        includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                                        } catch (final IllegalArgumentException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_institutions": {
                    try {
                        includeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_material_texts": {
                    try {
                        includeMaterialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_subject_term_texts": {
                    try {
                        includeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_technique_texts": {
                    try {
                        includeTechniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_work_type_texts": {
                    try {
                        includeWorkTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setExcludeAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts) {
            this.excludeAgentNameTexts = com.google.common.base.Preconditions.checkNotNull(excludeAgentNameTexts);
            return this;
        }

        public Builder setExcludeAgentNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeAgentNameTexts) {
            this.excludeAgentNameTexts = com.google.common.base.Optional.fromNullable(excludeAgentNameTexts);
            return this;
        }

        public Builder setExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) {
            this.excludeAll = com.google.common.base.Preconditions.checkNotNull(excludeAll);
            return this;
        }

        public Builder setExcludeAll(@javax.annotation.Nullable final Boolean excludeAll) {
            this.excludeAll = com.google.common.base.Optional.fromNullable(excludeAll);
            return this;
        }

        public Builder setExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
            this.excludeCategories = com.google.common.base.Preconditions.checkNotNull(excludeCategories);
            return this;
        }

        public Builder setExcludeCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeCategories) {
            this.excludeCategories = com.google.common.base.Optional.fromNullable(excludeCategories);
            return this;
        }

        public Builder setExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections) {
            this.excludeCollections = com.google.common.base.Preconditions.checkNotNull(excludeCollections);
            return this;
        }

        public Builder setExcludeCollections(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> excludeCollections) {
            this.excludeCollections = com.google.common.base.Optional.fromNullable(excludeCollections);
            return this;
        }

        public Builder setExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders) {
            this.excludeGenders = com.google.common.base.Preconditions.checkNotNull(excludeGenders);
            return this;
        }

        public Builder setExcludeGenders(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> excludeGenders) {
            this.excludeGenders = com.google.common.base.Optional.fromNullable(excludeGenders);
            return this;
        }

        public Builder setExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions) {
            this.excludeInstitutions = com.google.common.base.Preconditions.checkNotNull(excludeInstitutions);
            return this;
        }

        public Builder setExcludeInstitutions(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> excludeInstitutions) {
            this.excludeInstitutions = com.google.common.base.Optional.fromNullable(excludeInstitutions);
            return this;
        }

        public Builder setExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) {
            this.excludeMaterialTexts = com.google.common.base.Preconditions.checkNotNull(excludeMaterialTexts);
            return this;
        }

        public Builder setExcludeMaterialTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeMaterialTexts) {
            this.excludeMaterialTexts = com.google.common.base.Optional.fromNullable(excludeMaterialTexts);
            return this;
        }

        public Builder setExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
            this.excludeSubjectTermTexts = com.google.common.base.Preconditions.checkNotNull(excludeSubjectTermTexts);
            return this;
        }

        public Builder setExcludeSubjectTermTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts) {
            this.excludeSubjectTermTexts = com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts);
            return this;
        }

        public Builder setExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) {
            this.excludeTechniqueTexts = com.google.common.base.Preconditions.checkNotNull(excludeTechniqueTexts);
            return this;
        }

        public Builder setExcludeTechniqueTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts) {
            this.excludeTechniqueTexts = com.google.common.base.Optional.fromNullable(excludeTechniqueTexts);
            return this;
        }

        public Builder setExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) {
            this.excludeWorkTypeTexts = com.google.common.base.Preconditions.checkNotNull(excludeWorkTypeTexts);
            return this;
        }

        public Builder setExcludeWorkTypeTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts) {
            this.excludeWorkTypeTexts = com.google.common.base.Optional.fromNullable(excludeWorkTypeTexts);
            return this;
        }

        public Builder setIfPresent(final ObjectFacetFilters other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getExcludeAgentNameTexts().isPresent()) {
                setExcludeAgentNameTexts(other.getExcludeAgentNameTexts());
            }
            if (other.getExcludeAll().isPresent()) {
                setExcludeAll(other.getExcludeAll());
            }
            if (other.getExcludeCategories().isPresent()) {
                setExcludeCategories(other.getExcludeCategories());
            }
            if (other.getExcludeCollections().isPresent()) {
                setExcludeCollections(other.getExcludeCollections());
            }
            if (other.getExcludeGenders().isPresent()) {
                setExcludeGenders(other.getExcludeGenders());
            }
            if (other.getExcludeInstitutions().isPresent()) {
                setExcludeInstitutions(other.getExcludeInstitutions());
            }
            if (other.getExcludeMaterialTexts().isPresent()) {
                setExcludeMaterialTexts(other.getExcludeMaterialTexts());
            }
            if (other.getExcludeSubjectTermTexts().isPresent()) {
                setExcludeSubjectTermTexts(other.getExcludeSubjectTermTexts());
            }
            if (other.getExcludeTechniqueTexts().isPresent()) {
                setExcludeTechniqueTexts(other.getExcludeTechniqueTexts());
            }
            if (other.getExcludeWorkTypeTexts().isPresent()) {
                setExcludeWorkTypeTexts(other.getExcludeWorkTypeTexts());
            }
            if (other.getIncludeAgentNameTexts().isPresent()) {
                setIncludeAgentNameTexts(other.getIncludeAgentNameTexts());
            }
            if (other.getIncludeCategories().isPresent()) {
                setIncludeCategories(other.getIncludeCategories());
            }
            if (other.getIncludeCollections().isPresent()) {
                setIncludeCollections(other.getIncludeCollections());
            }
            if (other.getIncludeGenders().isPresent()) {
                setIncludeGenders(other.getIncludeGenders());
            }
            if (other.getIncludeInstitutions().isPresent()) {
                setIncludeInstitutions(other.getIncludeInstitutions());
            }
            if (other.getIncludeMaterialTexts().isPresent()) {
                setIncludeMaterialTexts(other.getIncludeMaterialTexts());
            }
            if (other.getIncludeSubjectTermTexts().isPresent()) {
                setIncludeSubjectTermTexts(other.getIncludeSubjectTermTexts());
            }
            if (other.getIncludeTechniqueTexts().isPresent()) {
                setIncludeTechniqueTexts(other.getIncludeTechniqueTexts());
            }
            if (other.getIncludeWorkTypeTexts().isPresent()) {
                setIncludeWorkTypeTexts(other.getIncludeWorkTypeTexts());
            }

            return this;
        }

        public Builder setIncludeAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts) {
            this.includeAgentNameTexts = com.google.common.base.Preconditions.checkNotNull(includeAgentNameTexts);
            return this;
        }

        public Builder setIncludeAgentNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeAgentNameTexts) {
            this.includeAgentNameTexts = com.google.common.base.Optional.fromNullable(includeAgentNameTexts);
            return this;
        }

        public Builder setIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) {
            this.includeCategories = com.google.common.base.Preconditions.checkNotNull(includeCategories);
            return this;
        }

        public Builder setIncludeCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeCategories) {
            this.includeCategories = com.google.common.base.Optional.fromNullable(includeCategories);
            return this;
        }

        public Builder setIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections) {
            this.includeCollections = com.google.common.base.Preconditions.checkNotNull(includeCollections);
            return this;
        }

        public Builder setIncludeCollections(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> includeCollections) {
            this.includeCollections = com.google.common.base.Optional.fromNullable(includeCollections);
            return this;
        }

        public Builder setIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders) {
            this.includeGenders = com.google.common.base.Preconditions.checkNotNull(includeGenders);
            return this;
        }

        public Builder setIncludeGenders(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> includeGenders) {
            this.includeGenders = com.google.common.base.Optional.fromNullable(includeGenders);
            return this;
        }

        public Builder setIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions) {
            this.includeInstitutions = com.google.common.base.Preconditions.checkNotNull(includeInstitutions);
            return this;
        }

        public Builder setIncludeInstitutions(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutions) {
            this.includeInstitutions = com.google.common.base.Optional.fromNullable(includeInstitutions);
            return this;
        }

        public Builder setIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) {
            this.includeMaterialTexts = com.google.common.base.Preconditions.checkNotNull(includeMaterialTexts);
            return this;
        }

        public Builder setIncludeMaterialTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeMaterialTexts) {
            this.includeMaterialTexts = com.google.common.base.Optional.fromNullable(includeMaterialTexts);
            return this;
        }

        public Builder setIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
            this.includeSubjectTermTexts = com.google.common.base.Preconditions.checkNotNull(includeSubjectTermTexts);
            return this;
        }

        public Builder setIncludeSubjectTermTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts) {
            this.includeSubjectTermTexts = com.google.common.base.Optional.fromNullable(includeSubjectTermTexts);
            return this;
        }

        public Builder setIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) {
            this.includeTechniqueTexts = com.google.common.base.Preconditions.checkNotNull(includeTechniqueTexts);
            return this;
        }

        public Builder setIncludeTechniqueTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeTechniqueTexts) {
            this.includeTechniqueTexts = com.google.common.base.Optional.fromNullable(includeTechniqueTexts);
            return this;
        }

        public Builder setIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            this.includeWorkTypeTexts = com.google.common.base.Preconditions.checkNotNull(includeWorkTypeTexts);
            return this;
        }

        public Builder setIncludeWorkTypeTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeWorkTypeTexts) {
            this.includeWorkTypeTexts = com.google.common.base.Optional.fromNullable(includeWorkTypeTexts);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "exclude_agent_name_texts": setExcludeAgentNameTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_all": setExcludeAll((Boolean)value); return this;
            case "exclude_categories": setExcludeCategories((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_collections": setExcludeCollections((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>)value); return this;
            case "exclude_genders": setExcludeGenders((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>)value); return this;
            case "exclude_institutions": setExcludeInstitutions((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>)value); return this;
            case "exclude_material_texts": setExcludeMaterialTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_subject_term_texts": setExcludeSubjectTermTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_technique_texts": setExcludeTechniqueTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_work_type_texts": setExcludeWorkTypeTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_agent_name_texts": setIncludeAgentNameTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_categories": setIncludeCategories((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_collections": setIncludeCollections((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>)value); return this;
            case "include_genders": setIncludeGenders((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>)value); return this;
            case "include_institutions": setIncludeInstitutions((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>)value); return this;
            case "include_material_texts": setIncludeMaterialTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_subject_term_texts": setIncludeSubjectTermTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_technique_texts": setIncludeTechniqueTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_work_type_texts": setIncludeWorkTypeTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetExcludeAgentNameTexts() {
            this.excludeAgentNameTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeAll() {
            this.excludeAll = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeCategories() {
            this.excludeCategories = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeCollections() {
            this.excludeCollections = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeGenders() {
            this.excludeGenders = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeInstitutions() {
            this.excludeInstitutions = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeMaterialTexts() {
            this.excludeMaterialTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeSubjectTermTexts() {
            this.excludeSubjectTermTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeTechniqueTexts() {
            this.excludeTechniqueTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeWorkTypeTexts() {
            this.excludeWorkTypeTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeAgentNameTexts() {
            this.includeAgentNameTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeCategories() {
            this.includeCategories = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeCollections() {
            this.includeCollections = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeGenders() {
            this.includeGenders = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeInstitutions() {
            this.includeInstitutions = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeMaterialTexts() {
            this.includeMaterialTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeSubjectTermTexts() {
            this.includeSubjectTermTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeTechniqueTexts() {
            this.includeTechniqueTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeWorkTypeTexts() {
            this.includeWorkTypeTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "exclude_agent_name_texts": return unsetExcludeAgentNameTexts();
            case "exclude_all": return unsetExcludeAll();
            case "exclude_categories": return unsetExcludeCategories();
            case "exclude_collections": return unsetExcludeCollections();
            case "exclude_genders": return unsetExcludeGenders();
            case "exclude_institutions": return unsetExcludeInstitutions();
            case "exclude_material_texts": return unsetExcludeMaterialTexts();
            case "exclude_subject_term_texts": return unsetExcludeSubjectTermTexts();
            case "exclude_technique_texts": return unsetExcludeTechniqueTexts();
            case "exclude_work_type_texts": return unsetExcludeWorkTypeTexts();
            case "include_agent_name_texts": return unsetIncludeAgentNameTexts();
            case "include_categories": return unsetIncludeCategories();
            case "include_collections": return unsetIncludeCollections();
            case "include_genders": return unsetIncludeGenders();
            case "include_institutions": return unsetIncludeInstitutions();
            case "include_material_texts": return unsetIncludeMaterialTexts();
            case "include_subject_term_texts": return unsetIncludeSubjectTermTexts();
            case "include_technique_texts": return unsetIncludeTechniqueTexts();
            case "include_work_type_texts": return unsetIncludeWorkTypeTexts();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts;
        private com.google.common.base.Optional<Boolean> excludeAll;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        EXCLUDE_AGENT_NAME_TEXTS("excludeAgentNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_agent_name_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_ALL("excludeAll", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 0, "exclude_all", org.thryft.protocol.Type.BOOL),
        EXCLUDE_CATEGORIES("excludeCategories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_categories", org.thryft.protocol.Type.SET),
        EXCLUDE_COLLECTIONS("excludeCollections", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {}, false, 0, "exclude_collections", org.thryft.protocol.Type.SET),
        EXCLUDE_GENDERS("excludeGenders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {}, false, 0, "exclude_genders", org.thryft.protocol.Type.SET),
        EXCLUDE_INSTITUTIONS("excludeInstitutions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {}, false, 0, "exclude_institutions", org.thryft.protocol.Type.SET),
        EXCLUDE_MATERIAL_TEXTS("excludeMaterialTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_material_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_SUBJECT_TERM_TEXTS("excludeSubjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_subject_term_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_TECHNIQUE_TEXTS("excludeTechniqueTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_technique_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_WORK_TYPE_TEXTS("excludeWorkTypeTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_work_type_texts", org.thryft.protocol.Type.SET),
        INCLUDE_AGENT_NAME_TEXTS("includeAgentNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_agent_name_texts", org.thryft.protocol.Type.SET),
        INCLUDE_CATEGORIES("includeCategories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_categories", org.thryft.protocol.Type.SET),
        INCLUDE_COLLECTIONS("includeCollections", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {}, false, 0, "include_collections", org.thryft.protocol.Type.SET),
        INCLUDE_GENDERS("includeGenders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {}, false, 0, "include_genders", org.thryft.protocol.Type.SET),
        INCLUDE_INSTITUTIONS("includeInstitutions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {}, false, 0, "include_institutions", org.thryft.protocol.Type.SET),
        INCLUDE_MATERIAL_TEXTS("includeMaterialTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_material_texts", org.thryft.protocol.Type.SET),
        INCLUDE_SUBJECT_TERM_TEXTS("includeSubjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_subject_term_texts", org.thryft.protocol.Type.SET),
        INCLUDE_TECHNIQUE_TEXTS("includeTechniqueTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_technique_texts", org.thryft.protocol.Type.SET),
        INCLUDE_WORK_TYPE_TEXTS("includeWorkTypeTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_work_type_texts", org.thryft.protocol.Type.SET);

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
            case "excludeAgentNameTexts": return EXCLUDE_AGENT_NAME_TEXTS;
            case "excludeAll": return EXCLUDE_ALL;
            case "excludeCategories": return EXCLUDE_CATEGORIES;
            case "excludeCollections": return EXCLUDE_COLLECTIONS;
            case "excludeGenders": return EXCLUDE_GENDERS;
            case "excludeInstitutions": return EXCLUDE_INSTITUTIONS;
            case "excludeMaterialTexts": return EXCLUDE_MATERIAL_TEXTS;
            case "excludeSubjectTermTexts": return EXCLUDE_SUBJECT_TERM_TEXTS;
            case "excludeTechniqueTexts": return EXCLUDE_TECHNIQUE_TEXTS;
            case "excludeWorkTypeTexts": return EXCLUDE_WORK_TYPE_TEXTS;
            case "includeAgentNameTexts": return INCLUDE_AGENT_NAME_TEXTS;
            case "includeCategories": return INCLUDE_CATEGORIES;
            case "includeCollections": return INCLUDE_COLLECTIONS;
            case "includeGenders": return INCLUDE_GENDERS;
            case "includeInstitutions": return INCLUDE_INSTITUTIONS;
            case "includeMaterialTexts": return INCLUDE_MATERIAL_TEXTS;
            case "includeSubjectTermTexts": return INCLUDE_SUBJECT_TERM_TEXTS;
            case "includeTechniqueTexts": return INCLUDE_TECHNIQUE_TEXTS;
            case "includeWorkTypeTexts": return INCLUDE_WORK_TYPE_TEXTS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "exclude_agent_name_texts": return EXCLUDE_AGENT_NAME_TEXTS;
            case "exclude_all": return EXCLUDE_ALL;
            case "exclude_categories": return EXCLUDE_CATEGORIES;
            case "exclude_collections": return EXCLUDE_COLLECTIONS;
            case "exclude_genders": return EXCLUDE_GENDERS;
            case "exclude_institutions": return EXCLUDE_INSTITUTIONS;
            case "exclude_material_texts": return EXCLUDE_MATERIAL_TEXTS;
            case "exclude_subject_term_texts": return EXCLUDE_SUBJECT_TERM_TEXTS;
            case "exclude_technique_texts": return EXCLUDE_TECHNIQUE_TEXTS;
            case "exclude_work_type_texts": return EXCLUDE_WORK_TYPE_TEXTS;
            case "include_agent_name_texts": return INCLUDE_AGENT_NAME_TEXTS;
            case "include_categories": return INCLUDE_CATEGORIES;
            case "include_collections": return INCLUDE_COLLECTIONS;
            case "include_genders": return INCLUDE_GENDERS;
            case "include_institutions": return INCLUDE_INSTITUTIONS;
            case "include_material_texts": return INCLUDE_MATERIAL_TEXTS;
            case "include_subject_term_texts": return INCLUDE_SUBJECT_TERM_TEXTS;
            case "include_technique_texts": return INCLUDE_TECHNIQUE_TEXTS;
            case "include_work_type_texts": return INCLUDE_WORK_TYPE_TEXTS;
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
     * Default constructor
     */
    public ObjectFacetFilters() {
        excludeAgentNameTexts = com.google.common.base.Optional.absent();
        excludeAll = com.google.common.base.Optional.absent();
        excludeCategories = com.google.common.base.Optional.absent();
        excludeCollections = com.google.common.base.Optional.absent();
        excludeGenders = com.google.common.base.Optional.absent();
        excludeInstitutions = com.google.common.base.Optional.absent();
        excludeMaterialTexts = com.google.common.base.Optional.absent();
        excludeSubjectTermTexts = com.google.common.base.Optional.absent();
        excludeTechniqueTexts = com.google.common.base.Optional.absent();
        excludeWorkTypeTexts = com.google.common.base.Optional.absent();
        includeAgentNameTexts = com.google.common.base.Optional.absent();
        includeCategories = com.google.common.base.Optional.absent();
        includeCollections = com.google.common.base.Optional.absent();
        includeGenders = com.google.common.base.Optional.absent();
        includeInstitutions = com.google.common.base.Optional.absent();
        includeMaterialTexts = com.google.common.base.Optional.absent();
        includeSubjectTermTexts = com.google.common.base.Optional.absent();
        includeTechniqueTexts = com.google.common.base.Optional.absent();
        includeWorkTypeTexts = com.google.common.base.Optional.absent();
    }

    /**
     * Copy constructor
     */
    public ObjectFacetFilters(final ObjectFacetFilters other) {
        this(other.getExcludeAgentNameTexts(), other.getExcludeAll(), other.getExcludeCategories(), other.getExcludeCollections(), other.getExcludeGenders(), other.getExcludeInstitutions(), other.getExcludeMaterialTexts(), other.getExcludeSubjectTermTexts(), other.getExcludeTechniqueTexts(), other.getExcludeWorkTypeTexts(), other.getIncludeAgentNameTexts(), other.getIncludeCategories(), other.getIncludeCollections(), other.getIncludeGenders(), other.getIncludeInstitutions(), other.getIncludeMaterialTexts(), other.getIncludeSubjectTermTexts(), other.getIncludeTechniqueTexts(), other.getIncludeWorkTypeTexts());
    }

    /**
     * Total Nullable constructor
     */
    public ObjectFacetFilters(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeAgentNameTexts, final @javax.annotation.Nullable Boolean excludeAll, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeCategories, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> excludeCollections, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> excludeGenders, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> excludeInstitutions, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeMaterialTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeAgentNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeCategories, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> includeCollections, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> includeGenders, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutions, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeMaterialTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeTechniqueTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeWorkTypeTexts) {
        this.excludeAgentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeAgentNameTexts), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeAgentNameTexts is empty");
        this.excludeAll = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(excludeAll), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeAll must be true");
        this.excludeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeCategories), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeCategories is empty");
        this.excludeCollections = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeCollections), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeCollections is empty");
        this.excludeGenders = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeGenders), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeGenders is empty");
        this.excludeInstitutions = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeInstitutions), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeInstitutions is empty");
        this.excludeMaterialTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeMaterialTexts), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeMaterialTexts is empty");
        this.excludeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeSubjectTermTexts is empty");
        this.excludeTechniqueTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeTechniqueTexts), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeTechniqueTexts is empty");
        this.excludeWorkTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeWorkTypeTexts), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeWorkTypeTexts is empty");
        this.includeAgentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeAgentNameTexts), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeAgentNameTexts is empty");
        this.includeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeCategories), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeCategories is empty");
        this.includeCollections = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeCollections), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeCollections is empty");
        this.includeGenders = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeGenders), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeGenders is empty");
        this.includeInstitutions = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeInstitutions), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeInstitutions is empty");
        this.includeMaterialTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeMaterialTexts), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeMaterialTexts is empty");
        this.includeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeSubjectTermTexts), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeSubjectTermTexts is empty");
        this.includeTechniqueTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeTechniqueTexts), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeTechniqueTexts is empty");
        this.includeWorkTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeWorkTypeTexts), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeWorkTypeTexts is empty");
    }

    /**
     * Optional constructor
     */
    public ObjectFacetFilters(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts, final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
        this.excludeAgentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeAgentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeAgentNameTexts"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeAgentNameTexts is empty");
        this.excludeAll = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(excludeAll, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeAll"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeAll must be true");
        this.excludeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeCategories, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeCategories"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeCategories is empty");
        this.excludeCollections = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeCollections, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeCollections"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeCollections is empty");
        this.excludeGenders = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeGenders, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeGenders"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeGenders is empty");
        this.excludeInstitutions = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeInstitutions, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeInstitutions"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeInstitutions is empty");
        this.excludeMaterialTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeMaterialTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeMaterialTexts"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeMaterialTexts is empty");
        this.excludeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeSubjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeSubjectTermTexts"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeSubjectTermTexts is empty");
        this.excludeTechniqueTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeTechniqueTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeTechniqueTexts"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeTechniqueTexts is empty");
        this.excludeWorkTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeWorkTypeTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing excludeWorkTypeTexts"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: excludeWorkTypeTexts is empty");
        this.includeAgentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeAgentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeAgentNameTexts"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeAgentNameTexts is empty");
        this.includeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeCategories, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeCategories"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeCategories is empty");
        this.includeCollections = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeCollections, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeCollections"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeCollections is empty");
        this.includeGenders = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeGenders, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeGenders"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeGenders is empty");
        this.includeInstitutions = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeInstitutions, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeInstitutions"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeInstitutions is empty");
        this.includeMaterialTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeMaterialTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeMaterialTexts"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeMaterialTexts is empty");
        this.includeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeSubjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeSubjectTermTexts"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeSubjectTermTexts is empty");
        this.includeTechniqueTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeTechniqueTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeTechniqueTexts"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeTechniqueTexts is empty");
        this.includeWorkTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeWorkTypeTexts, "net.lab1318.costume.api.services.object.ObjectFacetFilters: missing includeWorkTypeTexts"), "net.lab1318.costume.api.services.object.ObjectFacetFilters: includeWorkTypeTexts is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ObjectFacetFilters other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ObjectFacetFilters> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectFacetFilters)) {
            return false;
        }

        final ObjectFacetFilters other = (ObjectFacetFilters)otherObject;
        return
            getExcludeAgentNameTexts().equals(other.getExcludeAgentNameTexts()) &&
            getExcludeAll().equals(other.getExcludeAll()) &&
            getExcludeCategories().equals(other.getExcludeCategories()) &&
            getExcludeCollections().equals(other.getExcludeCollections()) &&
            getExcludeGenders().equals(other.getExcludeGenders()) &&
            getExcludeInstitutions().equals(other.getExcludeInstitutions()) &&
            getExcludeMaterialTexts().equals(other.getExcludeMaterialTexts()) &&
            getExcludeSubjectTermTexts().equals(other.getExcludeSubjectTermTexts()) &&
            getExcludeTechniqueTexts().equals(other.getExcludeTechniqueTexts()) &&
            getExcludeWorkTypeTexts().equals(other.getExcludeWorkTypeTexts()) &&
            getIncludeAgentNameTexts().equals(other.getIncludeAgentNameTexts()) &&
            getIncludeCategories().equals(other.getIncludeCategories()) &&
            getIncludeCollections().equals(other.getIncludeCollections()) &&
            getIncludeGenders().equals(other.getIncludeGenders()) &&
            getIncludeInstitutions().equals(other.getIncludeInstitutions()) &&
            getIncludeMaterialTexts().equals(other.getIncludeMaterialTexts()) &&
            getIncludeSubjectTermTexts().equals(other.getIncludeSubjectTermTexts()) &&
            getIncludeTechniqueTexts().equals(other.getIncludeTechniqueTexts()) &&
            getIncludeWorkTypeTexts().equals(other.getIncludeWorkTypeTexts());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "exclude_agent_name_texts": return getExcludeAgentNameTexts();
        case "exclude_all": return getExcludeAll();
        case "exclude_categories": return getExcludeCategories();
        case "exclude_collections": return getExcludeCollections();
        case "exclude_genders": return getExcludeGenders();
        case "exclude_institutions": return getExcludeInstitutions();
        case "exclude_material_texts": return getExcludeMaterialTexts();
        case "exclude_subject_term_texts": return getExcludeSubjectTermTexts();
        case "exclude_technique_texts": return getExcludeTechniqueTexts();
        case "exclude_work_type_texts": return getExcludeWorkTypeTexts();
        case "include_agent_name_texts": return getIncludeAgentNameTexts();
        case "include_categories": return getIncludeCategories();
        case "include_collections": return getIncludeCollections();
        case "include_genders": return getIncludeGenders();
        case "include_institutions": return getIncludeInstitutions();
        case "include_material_texts": return getIncludeMaterialTexts();
        case "include_subject_term_texts": return getIncludeSubjectTermTexts();
        case "include_technique_texts": return getIncludeTechniqueTexts();
        case "include_work_type_texts": return getIncludeWorkTypeTexts();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeAgentNameTexts() {
        return excludeAgentNameTexts;
    }

    public final com.google.common.base.Optional<Boolean> getExcludeAll() {
        return excludeAll;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeCategories() {
        return excludeCategories;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> getExcludeCollections() {
        return excludeCollections;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> getExcludeGenders() {
        return excludeGenders;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getExcludeInstitutions() {
        return excludeInstitutions;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeMaterialTexts() {
        return excludeMaterialTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeSubjectTermTexts() {
        return excludeSubjectTermTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeTechniqueTexts() {
        return excludeTechniqueTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeWorkTypeTexts() {
        return excludeWorkTypeTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeAgentNameTexts() {
        return includeAgentNameTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeCategories() {
        return includeCategories;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> getIncludeCollections() {
        return includeCollections;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> getIncludeGenders() {
        return includeGenders;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getIncludeInstitutions() {
        return includeInstitutions;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeMaterialTexts() {
        return includeMaterialTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeSubjectTermTexts() {
        return includeSubjectTermTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeTechniqueTexts() {
        return includeTechniqueTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeWorkTypeTexts() {
        return includeWorkTypeTexts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getExcludeAgentNameTexts().isPresent()) {
            hashCode = 31 * hashCode + getExcludeAgentNameTexts().get().hashCode();
        }
        if (getExcludeAll().isPresent()) {
            hashCode = 31 * hashCode + (getExcludeAll().get() ? 1 : 0);
        }
        if (getExcludeCategories().isPresent()) {
            hashCode = 31 * hashCode + getExcludeCategories().get().hashCode();
        }
        if (getExcludeCollections().isPresent()) {
            hashCode = 31 * hashCode + getExcludeCollections().get().hashCode();
        }
        if (getExcludeGenders().isPresent()) {
            hashCode = 31 * hashCode + getExcludeGenders().get().hashCode();
        }
        if (getExcludeInstitutions().isPresent()) {
            hashCode = 31 * hashCode + getExcludeInstitutions().get().hashCode();
        }
        if (getExcludeMaterialTexts().isPresent()) {
            hashCode = 31 * hashCode + getExcludeMaterialTexts().get().hashCode();
        }
        if (getExcludeSubjectTermTexts().isPresent()) {
            hashCode = 31 * hashCode + getExcludeSubjectTermTexts().get().hashCode();
        }
        if (getExcludeTechniqueTexts().isPresent()) {
            hashCode = 31 * hashCode + getExcludeTechniqueTexts().get().hashCode();
        }
        if (getExcludeWorkTypeTexts().isPresent()) {
            hashCode = 31 * hashCode + getExcludeWorkTypeTexts().get().hashCode();
        }
        if (getIncludeAgentNameTexts().isPresent()) {
            hashCode = 31 * hashCode + getIncludeAgentNameTexts().get().hashCode();
        }
        if (getIncludeCategories().isPresent()) {
            hashCode = 31 * hashCode + getIncludeCategories().get().hashCode();
        }
        if (getIncludeCollections().isPresent()) {
            hashCode = 31 * hashCode + getIncludeCollections().get().hashCode();
        }
        if (getIncludeGenders().isPresent()) {
            hashCode = 31 * hashCode + getIncludeGenders().get().hashCode();
        }
        if (getIncludeInstitutions().isPresent()) {
            hashCode = 31 * hashCode + getIncludeInstitutions().get().hashCode();
        }
        if (getIncludeMaterialTexts().isPresent()) {
            hashCode = 31 * hashCode + getIncludeMaterialTexts().get().hashCode();
        }
        if (getIncludeSubjectTermTexts().isPresent()) {
            hashCode = 31 * hashCode + getIncludeSubjectTermTexts().get().hashCode();
        }
        if (getIncludeTechniqueTexts().isPresent()) {
            hashCode = 31 * hashCode + getIncludeTechniqueTexts().get().hashCode();
        }
        if (getIncludeWorkTypeTexts().isPresent()) {
            hashCode = 31 * hashCode + getIncludeWorkTypeTexts().get().hashCode();
        }
        return hashCode;
    }

    public static ObjectFacetFilters readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectFacetFilters readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> excludeAll = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        if (__list.getSize() > 0) {
            try {
                excludeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 1) {
            excludeAll = com.google.common.base.Optional.of(iprot.readBool());
        }
        if (__list.getSize() > 2) {
            try {
                excludeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 3) {
            try {
                excludeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 4) {
            try {
                excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 5) {
            try {
                excludeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
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
                excludeMaterialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 7) {
            try {
                excludeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 8) {
            try {
                excludeTechniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 9) {
            try {
                excludeWorkTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 10) {
            try {
                includeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
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
            try {
                includeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 12) {
            try {
                includeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 13) {
            try {
                includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 14) {
            try {
                includeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 15) {
            try {
                includeMaterialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 16) {
            try {
                includeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 17) {
            try {
                includeTechniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 18) {
            try {
                includeWorkTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequenceBuilder.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequenceBuilder.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new ObjectFacetFilters(excludeAgentNameTexts, excludeAll, excludeCategories, excludeCollections, excludeGenders, excludeInstitutions, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeAgentNameTexts, includeCategories, includeCollections, includeGenders, includeInstitutions, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectFacetFilters readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> excludeAll = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "exclude_agent_name_texts": {
                try {
                    excludeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_all": {
                excludeAll = com.google.common.base.Optional.of(iprot.readBool());
                break;
            }
            case "exclude_categories": {
                try {
                    excludeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_collections": {
                try {
                    excludeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_genders": {
                try {
                    excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_institutions": {
                try {
                    excludeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_material_texts": {
                try {
                    excludeMaterialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_subject_term_texts": {
                try {
                    excludeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_technique_texts": {
                try {
                    excludeTechniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_work_type_texts": {
                try {
                    excludeWorkTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_agent_name_texts": {
                try {
                    includeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_categories": {
                try {
                    includeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_collections": {
                try {
                    includeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_genders": {
                try {
                    includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_institutions": {
                try {
                    includeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_material_texts": {
                try {
                    includeMaterialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_subject_term_texts": {
                try {
                    includeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_technique_texts": {
                try {
                    includeTechniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_work_type_texts": {
                try {
                    includeWorkTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new ObjectFacetFilters(excludeAgentNameTexts, excludeAll, excludeCategories, excludeCollections, excludeGenders, excludeInstitutions, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeAgentNameTexts, includeCategories, includeCollections, includeGenders, includeInstitutions, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectFacetFilters replaceExcludeAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts) {
        return new ObjectFacetFilters(excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeAgentNameTexts(final com.google.common.collect.ImmutableSet<String> excludeAgentNameTexts) {
        return replaceExcludeAgentNameTexts(com.google.common.base.Optional.fromNullable(excludeAgentNameTexts));
    }

    public ObjectFacetFilters replaceExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeAll(final boolean excludeAll) {
        return replaceExcludeAll(com.google.common.base.Optional.fromNullable(excludeAll));
    }

    public ObjectFacetFilters replaceExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeCategories(final com.google.common.collect.ImmutableSet<String> excludeCategories) {
        return replaceExcludeCategories(com.google.common.base.Optional.fromNullable(excludeCategories));
    }

    public ObjectFacetFilters replaceExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeCollections(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> excludeCollections) {
        return replaceExcludeCollections(com.google.common.base.Optional.fromNullable(excludeCollections));
    }

    public ObjectFacetFilters replaceExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeGenders(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> excludeGenders) {
        return replaceExcludeGenders(com.google.common.base.Optional.fromNullable(excludeGenders));
    }

    public ObjectFacetFilters replaceExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeInstitutions(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> excludeInstitutions) {
        return replaceExcludeInstitutions(com.google.common.base.Optional.fromNullable(excludeInstitutions));
    }

    public ObjectFacetFilters replaceExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeMaterialTexts(final com.google.common.collect.ImmutableSet<String> excludeMaterialTexts) {
        return replaceExcludeMaterialTexts(com.google.common.base.Optional.fromNullable(excludeMaterialTexts));
    }

    public ObjectFacetFilters replaceExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeSubjectTermTexts(final com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts) {
        return replaceExcludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts));
    }

    public ObjectFacetFilters replaceExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeTechniqueTexts(final com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts) {
        return replaceExcludeTechniqueTexts(com.google.common.base.Optional.fromNullable(excludeTechniqueTexts));
    }

    public ObjectFacetFilters replaceExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeWorkTypeTexts(final com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts) {
        return replaceExcludeWorkTypeTexts(com.google.common.base.Optional.fromNullable(excludeWorkTypeTexts));
    }

    public ObjectFacetFilters replaceIncludeAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeAgentNameTexts(final com.google.common.collect.ImmutableSet<String> includeAgentNameTexts) {
        return replaceIncludeAgentNameTexts(com.google.common.base.Optional.fromNullable(includeAgentNameTexts));
    }

    public ObjectFacetFilters replaceIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeCategories(final com.google.common.collect.ImmutableSet<String> includeCategories) {
        return replaceIncludeCategories(com.google.common.base.Optional.fromNullable(includeCategories));
    }

    public ObjectFacetFilters replaceIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeCollections(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> includeCollections) {
        return replaceIncludeCollections(com.google.common.base.Optional.fromNullable(includeCollections));
    }

    public ObjectFacetFilters replaceIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeGenders(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> includeGenders) {
        return replaceIncludeGenders(com.google.common.base.Optional.fromNullable(includeGenders));
    }

    public ObjectFacetFilters replaceIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeInstitutions(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutions) {
        return replaceIncludeInstitutions(com.google.common.base.Optional.fromNullable(includeInstitutions));
    }

    public ObjectFacetFilters replaceIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeMaterialTexts(final com.google.common.collect.ImmutableSet<String> includeMaterialTexts) {
        return replaceIncludeMaterialTexts(com.google.common.base.Optional.fromNullable(includeMaterialTexts));
    }

    public ObjectFacetFilters replaceIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeSubjectTermTexts(final com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts) {
        return replaceIncludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(includeSubjectTermTexts));
    }

    public ObjectFacetFilters replaceIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeTechniqueTexts(final com.google.common.collect.ImmutableSet<String> includeTechniqueTexts) {
        return replaceIncludeTechniqueTexts(com.google.common.base.Optional.fromNullable(includeTechniqueTexts));
    }

    public ObjectFacetFilters replaceIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
        return new ObjectFacetFilters(this.excludeAgentNameTexts, this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeGenders, this.excludeInstitutions, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollections, this.includeGenders, this.includeInstitutions, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeWorkTypeTexts(final com.google.common.collect.ImmutableSet<String> includeWorkTypeTexts) {
        return replaceIncludeWorkTypeTexts(com.google.common.base.Optional.fromNullable(includeWorkTypeTexts));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("exclude_agent_name_texts", getExcludeAgentNameTexts().orNull()).add("exclude_all", getExcludeAll().orNull()).add("exclude_categories", getExcludeCategories().orNull()).add("exclude_collections", getExcludeCollections().orNull()).add("exclude_genders", getExcludeGenders().orNull()).add("exclude_institutions", getExcludeInstitutions().orNull()).add("exclude_material_texts", getExcludeMaterialTexts().orNull()).add("exclude_subject_term_texts", getExcludeSubjectTermTexts().orNull()).add("exclude_technique_texts", getExcludeTechniqueTexts().orNull()).add("exclude_work_type_texts", getExcludeWorkTypeTexts().orNull()).add("include_agent_name_texts", getIncludeAgentNameTexts().orNull()).add("include_categories", getIncludeCategories().orNull()).add("include_collections", getIncludeCollections().orNull()).add("include_genders", getIncludeGenders().orNull()).add("include_institutions", getIncludeInstitutions().orNull()).add("include_material_texts", getIncludeMaterialTexts().orNull()).add("include_subject_term_texts", getIncludeSubjectTermTexts().orNull()).add("include_technique_texts", getIncludeTechniqueTexts().orNull()).add("include_work_type_texts", getIncludeWorkTypeTexts().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 19);

        if (getExcludeAgentNameTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeAgentNameTexts().get().size());
            for (final String _iter0 : getExcludeAgentNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeAll().isPresent()) {
            oprot.writeBool(getExcludeAll().get());
        } else {
            oprot.writeNull();
        }

        if (getExcludeCategories().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCategories().get().size());
            for (final String _iter0 : getExcludeCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeCollections().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCollections().get().size());
            for (final net.lab1318.costume.api.models.collection.CollectionId _iter0 : getExcludeCollections().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeGenders().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeGenders().get().size());
            for (final net.lab1318.costume.api.models.gender.Gender _iter0 : getExcludeGenders().get()) {
                oprot.writeEnum(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeInstitutions().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeInstitutions().get().size());
            for (final net.lab1318.costume.api.models.institution.InstitutionId _iter0 : getExcludeInstitutions().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeMaterialTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeMaterialTexts().get().size());
            for (final String _iter0 : getExcludeMaterialTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeSubjectTermTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeSubjectTermTexts().get().size());
            for (final String _iter0 : getExcludeSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeTechniqueTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeTechniqueTexts().get().size());
            for (final String _iter0 : getExcludeTechniqueTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeWorkTypeTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeWorkTypeTexts().get().size());
            for (final String _iter0 : getExcludeWorkTypeTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeAgentNameTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeAgentNameTexts().get().size());
            for (final String _iter0 : getIncludeAgentNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeCategories().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCategories().get().size());
            for (final String _iter0 : getIncludeCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeCollections().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCollections().get().size());
            for (final net.lab1318.costume.api.models.collection.CollectionId _iter0 : getIncludeCollections().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeGenders().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeGenders().get().size());
            for (final net.lab1318.costume.api.models.gender.Gender _iter0 : getIncludeGenders().get()) {
                oprot.writeEnum(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeInstitutions().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeInstitutions().get().size());
            for (final net.lab1318.costume.api.models.institution.InstitutionId _iter0 : getIncludeInstitutions().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeMaterialTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeMaterialTexts().get().size());
            for (final String _iter0 : getIncludeMaterialTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeSubjectTermTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeSubjectTermTexts().get().size());
            for (final String _iter0 : getIncludeSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeTechniqueTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeTechniqueTexts().get().size());
            for (final String _iter0 : getIncludeTechniqueTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeWorkTypeTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeWorkTypeTexts().get().size());
            for (final String _iter0 : getIncludeWorkTypeTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.services.object.ObjectFacetFilters");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeAgentNameTexts().isPresent()) {
            oprot.writeFieldBegin("exclude_agent_name_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeAgentNameTexts().get().size());
            for (final String _iter0 : getExcludeAgentNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeAll().isPresent()) {
            oprot.writeFieldBegin("exclude_all", org.thryft.protocol.Type.BOOL, (short)0);
            oprot.writeBool(getExcludeAll().get());
            oprot.writeFieldEnd();
        }

        if (getExcludeCategories().isPresent()) {
            oprot.writeFieldBegin("exclude_categories", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCategories().get().size());
            for (final String _iter0 : getExcludeCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeCollections().isPresent()) {
            oprot.writeFieldBegin("exclude_collections", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCollections().get().size());
            for (final net.lab1318.costume.api.models.collection.CollectionId _iter0 : getExcludeCollections().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeGenders().isPresent()) {
            oprot.writeFieldBegin("exclude_genders", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeGenders().get().size());
            for (final net.lab1318.costume.api.models.gender.Gender _iter0 : getExcludeGenders().get()) {
                oprot.writeEnum(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeInstitutions().isPresent()) {
            oprot.writeFieldBegin("exclude_institutions", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeInstitutions().get().size());
            for (final net.lab1318.costume.api.models.institution.InstitutionId _iter0 : getExcludeInstitutions().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeMaterialTexts().isPresent()) {
            oprot.writeFieldBegin("exclude_material_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeMaterialTexts().get().size());
            for (final String _iter0 : getExcludeMaterialTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeSubjectTermTexts().isPresent()) {
            oprot.writeFieldBegin("exclude_subject_term_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeSubjectTermTexts().get().size());
            for (final String _iter0 : getExcludeSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeTechniqueTexts().isPresent()) {
            oprot.writeFieldBegin("exclude_technique_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeTechniqueTexts().get().size());
            for (final String _iter0 : getExcludeTechniqueTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeWorkTypeTexts().isPresent()) {
            oprot.writeFieldBegin("exclude_work_type_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeWorkTypeTexts().get().size());
            for (final String _iter0 : getExcludeWorkTypeTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeAgentNameTexts().isPresent()) {
            oprot.writeFieldBegin("include_agent_name_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeAgentNameTexts().get().size());
            for (final String _iter0 : getIncludeAgentNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeCategories().isPresent()) {
            oprot.writeFieldBegin("include_categories", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCategories().get().size());
            for (final String _iter0 : getIncludeCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeCollections().isPresent()) {
            oprot.writeFieldBegin("include_collections", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCollections().get().size());
            for (final net.lab1318.costume.api.models.collection.CollectionId _iter0 : getIncludeCollections().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeGenders().isPresent()) {
            oprot.writeFieldBegin("include_genders", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeGenders().get().size());
            for (final net.lab1318.costume.api.models.gender.Gender _iter0 : getIncludeGenders().get()) {
                oprot.writeEnum(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeInstitutions().isPresent()) {
            oprot.writeFieldBegin("include_institutions", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeInstitutions().get().size());
            for (final net.lab1318.costume.api.models.institution.InstitutionId _iter0 : getIncludeInstitutions().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeMaterialTexts().isPresent()) {
            oprot.writeFieldBegin("include_material_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeMaterialTexts().get().size());
            for (final String _iter0 : getIncludeMaterialTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeSubjectTermTexts().isPresent()) {
            oprot.writeFieldBegin("include_subject_term_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeSubjectTermTexts().get().size());
            for (final String _iter0 : getIncludeSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeTechniqueTexts().isPresent()) {
            oprot.writeFieldBegin("include_technique_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeTechniqueTexts().get().size());
            for (final String _iter0 : getIncludeTechniqueTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeWorkTypeTexts().isPresent()) {
            oprot.writeFieldBegin("include_work_type_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeWorkTypeTexts().get().size());
            for (final String _iter0 : getIncludeWorkTypeTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts;

    private final com.google.common.base.Optional<Boolean> excludeAll;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts;
}
