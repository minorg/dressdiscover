package net.lab1318.costume.api.models.object;

public class ObjectFacetFilters implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            excludeAll = com.google.common.base.Optional.absent();
            excludeCategories = com.google.common.base.Optional.absent();
            excludeCollections = com.google.common.base.Optional.absent();
            excludeColorTexts = com.google.common.base.Optional.absent();
            excludeCulturalContextTexts = com.google.common.base.Optional.absent();
            excludeGenders = com.google.common.base.Optional.absent();
            excludeInstitutions = com.google.common.base.Optional.absent();
            excludeLocationNameTexts = com.google.common.base.Optional.absent();
            excludeMaterialTexts = com.google.common.base.Optional.absent();
            excludeSubjectTermTexts = com.google.common.base.Optional.absent();
            excludeTechniqueTexts = com.google.common.base.Optional.absent();
            excludeWorkTypeTexts = com.google.common.base.Optional.absent();
            includeCategories = com.google.common.base.Optional.absent();
            includeCollections = com.google.common.base.Optional.absent();
            includeColorTexts = com.google.common.base.Optional.absent();
            includeCulturalContextTexts = com.google.common.base.Optional.absent();
            includeGenders = com.google.common.base.Optional.absent();
            includeInstitutions = com.google.common.base.Optional.absent();
            includeLocationNameTexts = com.google.common.base.Optional.absent();
            includeMaterialTexts = com.google.common.base.Optional.absent();
            includeSubjectTermTexts = com.google.common.base.Optional.absent();
            includeTechniqueTexts = com.google.common.base.Optional.absent();
            includeWorkTypeTexts = com.google.common.base.Optional.absent();
        }

        public Builder(final ObjectFacetFilters other) {
            this.excludeAll = other.getExcludeAll();
            this.excludeCategories = other.getExcludeCategories();
            this.excludeCollections = other.getExcludeCollections();
            this.excludeColorTexts = other.getExcludeColorTexts();
            this.excludeCulturalContextTexts = other.getExcludeCulturalContextTexts();
            this.excludeGenders = other.getExcludeGenders();
            this.excludeInstitutions = other.getExcludeInstitutions();
            this.excludeLocationNameTexts = other.getExcludeLocationNameTexts();
            this.excludeMaterialTexts = other.getExcludeMaterialTexts();
            this.excludeSubjectTermTexts = other.getExcludeSubjectTermTexts();
            this.excludeTechniqueTexts = other.getExcludeTechniqueTexts();
            this.excludeWorkTypeTexts = other.getExcludeWorkTypeTexts();
            this.includeCategories = other.getIncludeCategories();
            this.includeCollections = other.getIncludeCollections();
            this.includeColorTexts = other.getIncludeColorTexts();
            this.includeCulturalContextTexts = other.getIncludeCulturalContextTexts();
            this.includeGenders = other.getIncludeGenders();
            this.includeInstitutions = other.getIncludeInstitutions();
            this.includeLocationNameTexts = other.getIncludeLocationNameTexts();
            this.includeMaterialTexts = other.getIncludeMaterialTexts();
            this.includeSubjectTermTexts = other.getIncludeSubjectTermTexts();
            this.includeTechniqueTexts = other.getIncludeTechniqueTexts();
            this.includeWorkTypeTexts = other.getIncludeWorkTypeTexts();
        }

        protected ObjectFacetFilters _build(final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            return new ObjectFacetFilters(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
        }

        public ObjectFacetFilters build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(excludeAll, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeAll"), com.google.common.base.Preconditions.checkNotNull(excludeCategories, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeCategories"), com.google.common.base.Preconditions.checkNotNull(excludeCollections, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeCollections"), com.google.common.base.Preconditions.checkNotNull(excludeColorTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeColorTexts"), com.google.common.base.Preconditions.checkNotNull(excludeCulturalContextTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeCulturalContextTexts"), com.google.common.base.Preconditions.checkNotNull(excludeGenders, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeGenders"), com.google.common.base.Preconditions.checkNotNull(excludeInstitutions, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeInstitutions"), com.google.common.base.Preconditions.checkNotNull(excludeLocationNameTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeLocationNameTexts"), com.google.common.base.Preconditions.checkNotNull(excludeMaterialTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeMaterialTexts"), com.google.common.base.Preconditions.checkNotNull(excludeSubjectTermTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeSubjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(excludeTechniqueTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeTechniqueTexts"), com.google.common.base.Preconditions.checkNotNull(excludeWorkTypeTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeWorkTypeTexts"), com.google.common.base.Preconditions.checkNotNull(includeCategories, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeCategories"), com.google.common.base.Preconditions.checkNotNull(includeCollections, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeCollections"), com.google.common.base.Preconditions.checkNotNull(includeColorTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeColorTexts"), com.google.common.base.Preconditions.checkNotNull(includeCulturalContextTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeCulturalContextTexts"), com.google.common.base.Preconditions.checkNotNull(includeGenders, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeGenders"), com.google.common.base.Preconditions.checkNotNull(includeInstitutions, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeInstitutions"), com.google.common.base.Preconditions.checkNotNull(includeLocationNameTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeLocationNameTexts"), com.google.common.base.Preconditions.checkNotNull(includeMaterialTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeMaterialTexts"), com.google.common.base.Preconditions.checkNotNull(includeSubjectTermTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeSubjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(includeTechniqueTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeTechniqueTexts"), com.google.common.base.Preconditions.checkNotNull(includeWorkTypeTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeWorkTypeTexts"));
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

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeColorTexts() {
            return excludeColorTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeCulturalContextTexts() {
            return excludeCulturalContextTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> getExcludeGenders() {
            return excludeGenders;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getExcludeInstitutions() {
            return excludeInstitutions;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeLocationNameTexts() {
            return excludeLocationNameTexts;
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

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeCategories() {
            return includeCategories;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> getIncludeCollections() {
            return includeCollections;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeColorTexts() {
            return includeColorTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeCulturalContextTexts() {
            return includeCulturalContextTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> getIncludeGenders() {
            return includeGenders;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getIncludeInstitutions() {
            return includeInstitutions;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeLocationNameTexts() {
            return includeLocationNameTexts;
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
                excludeAll = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 1) {
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
            if (__list.getSize() > 2) {
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
            if (__list.getSize() > 3) {
                try {
                    excludeColorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            if (__list.getSize() > 4) {
                try {
                    excludeCulturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            if (__list.getSize() > 5) {
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
            if (__list.getSize() > 6) {
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
            if (__list.getSize() > 7) {
                try {
                    excludeLocationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            if (__list.getSize() > 9) {
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
            if (__list.getSize() > 10) {
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
            if (__list.getSize() > 11) {
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
            if (__list.getSize() > 12) {
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
            if (__list.getSize() > 13) {
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
            if (__list.getSize() > 14) {
                try {
                    includeColorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            if (__list.getSize() > 15) {
                try {
                    includeCulturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            if (__list.getSize() > 17) {
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
            if (__list.getSize() > 18) {
                try {
                    includeLocationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            if (__list.getSize() > 19) {
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
            if (__list.getSize() > 20) {
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
            if (__list.getSize() > 21) {
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
            if (__list.getSize() > 22) {
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
            return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
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
                case "exclude_color_texts": {
                    try {
                        excludeColorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
                case "exclude_cultural_context_texts": {
                    try {
                        excludeCulturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
                case "exclude_location_name_texts": {
                    try {
                        excludeLocationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
                case "include_color_texts": {
                    try {
                        includeColorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
                case "include_cultural_context_texts": {
                    try {
                        includeCulturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
                case "include_location_name_texts": {
                    try {
                        includeLocationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
                default:
                    if (unknownFieldCallback.isPresent()) {
                        unknownFieldCallback.get().apply(ifield);
                    }
                    break;
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
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

        public Builder setExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) {
            this.excludeColorTexts = com.google.common.base.Preconditions.checkNotNull(excludeColorTexts);
            return this;
        }

        public Builder setExcludeColorTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeColorTexts) {
            this.excludeColorTexts = com.google.common.base.Optional.fromNullable(excludeColorTexts);
            return this;
        }

        public Builder setExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) {
            this.excludeCulturalContextTexts = com.google.common.base.Preconditions.checkNotNull(excludeCulturalContextTexts);
            return this;
        }

        public Builder setExcludeCulturalContextTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeCulturalContextTexts) {
            this.excludeCulturalContextTexts = com.google.common.base.Optional.fromNullable(excludeCulturalContextTexts);
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

        public Builder setExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) {
            this.excludeLocationNameTexts = com.google.common.base.Preconditions.checkNotNull(excludeLocationNameTexts);
            return this;
        }

        public Builder setExcludeLocationNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeLocationNameTexts) {
            this.excludeLocationNameTexts = com.google.common.base.Optional.fromNullable(excludeLocationNameTexts);
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

            if (other.getExcludeAll().isPresent()) {
                setExcludeAll(other.getExcludeAll());
            }
            if (other.getExcludeCategories().isPresent()) {
                setExcludeCategories(other.getExcludeCategories());
            }
            if (other.getExcludeCollections().isPresent()) {
                setExcludeCollections(other.getExcludeCollections());
            }
            if (other.getExcludeColorTexts().isPresent()) {
                setExcludeColorTexts(other.getExcludeColorTexts());
            }
            if (other.getExcludeCulturalContextTexts().isPresent()) {
                setExcludeCulturalContextTexts(other.getExcludeCulturalContextTexts());
            }
            if (other.getExcludeGenders().isPresent()) {
                setExcludeGenders(other.getExcludeGenders());
            }
            if (other.getExcludeInstitutions().isPresent()) {
                setExcludeInstitutions(other.getExcludeInstitutions());
            }
            if (other.getExcludeLocationNameTexts().isPresent()) {
                setExcludeLocationNameTexts(other.getExcludeLocationNameTexts());
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
            if (other.getIncludeCategories().isPresent()) {
                setIncludeCategories(other.getIncludeCategories());
            }
            if (other.getIncludeCollections().isPresent()) {
                setIncludeCollections(other.getIncludeCollections());
            }
            if (other.getIncludeColorTexts().isPresent()) {
                setIncludeColorTexts(other.getIncludeColorTexts());
            }
            if (other.getIncludeCulturalContextTexts().isPresent()) {
                setIncludeCulturalContextTexts(other.getIncludeCulturalContextTexts());
            }
            if (other.getIncludeGenders().isPresent()) {
                setIncludeGenders(other.getIncludeGenders());
            }
            if (other.getIncludeInstitutions().isPresent()) {
                setIncludeInstitutions(other.getIncludeInstitutions());
            }
            if (other.getIncludeLocationNameTexts().isPresent()) {
                setIncludeLocationNameTexts(other.getIncludeLocationNameTexts());
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

        public Builder setIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) {
            this.includeColorTexts = com.google.common.base.Preconditions.checkNotNull(includeColorTexts);
            return this;
        }

        public Builder setIncludeColorTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeColorTexts) {
            this.includeColorTexts = com.google.common.base.Optional.fromNullable(includeColorTexts);
            return this;
        }

        public Builder setIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) {
            this.includeCulturalContextTexts = com.google.common.base.Preconditions.checkNotNull(includeCulturalContextTexts);
            return this;
        }

        public Builder setIncludeCulturalContextTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeCulturalContextTexts) {
            this.includeCulturalContextTexts = com.google.common.base.Optional.fromNullable(includeCulturalContextTexts);
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

        public Builder setIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) {
            this.includeLocationNameTexts = com.google.common.base.Preconditions.checkNotNull(includeLocationNameTexts);
            return this;
        }

        public Builder setIncludeLocationNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeLocationNameTexts) {
            this.includeLocationNameTexts = com.google.common.base.Optional.fromNullable(includeLocationNameTexts);
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
            case "exclude_all": setExcludeAll((Boolean)value); return this;
            case "exclude_categories": setExcludeCategories((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_collections": setExcludeCollections((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>)value); return this;
            case "exclude_color_texts": setExcludeColorTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_cultural_context_texts": setExcludeCulturalContextTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_genders": setExcludeGenders((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>)value); return this;
            case "exclude_institutions": setExcludeInstitutions((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>)value); return this;
            case "exclude_location_name_texts": setExcludeLocationNameTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_material_texts": setExcludeMaterialTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_subject_term_texts": setExcludeSubjectTermTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_technique_texts": setExcludeTechniqueTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_work_type_texts": setExcludeWorkTypeTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_categories": setIncludeCategories((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_collections": setIncludeCollections((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>)value); return this;
            case "include_color_texts": setIncludeColorTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_cultural_context_texts": setIncludeCulturalContextTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_genders": setIncludeGenders((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>)value); return this;
            case "include_institutions": setIncludeInstitutions((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>)value); return this;
            case "include_location_name_texts": setIncludeLocationNameTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_material_texts": setIncludeMaterialTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_subject_term_texts": setIncludeSubjectTermTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_technique_texts": setIncludeTechniqueTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_work_type_texts": setIncludeWorkTypeTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
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

        public Builder unsetExcludeColorTexts() {
            this.excludeColorTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeCulturalContextTexts() {
            this.excludeCulturalContextTexts = com.google.common.base.Optional.absent();
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

        public Builder unsetExcludeLocationNameTexts() {
            this.excludeLocationNameTexts = com.google.common.base.Optional.absent();
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

        public Builder unsetIncludeCategories() {
            this.includeCategories = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeCollections() {
            this.includeCollections = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeColorTexts() {
            this.includeColorTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeCulturalContextTexts() {
            this.includeCulturalContextTexts = com.google.common.base.Optional.absent();
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

        public Builder unsetIncludeLocationNameTexts() {
            this.includeLocationNameTexts = com.google.common.base.Optional.absent();
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
            case "exclude_all": return unsetExcludeAll();
            case "exclude_categories": return unsetExcludeCategories();
            case "exclude_collections": return unsetExcludeCollections();
            case "exclude_color_texts": return unsetExcludeColorTexts();
            case "exclude_cultural_context_texts": return unsetExcludeCulturalContextTexts();
            case "exclude_genders": return unsetExcludeGenders();
            case "exclude_institutions": return unsetExcludeInstitutions();
            case "exclude_location_name_texts": return unsetExcludeLocationNameTexts();
            case "exclude_material_texts": return unsetExcludeMaterialTexts();
            case "exclude_subject_term_texts": return unsetExcludeSubjectTermTexts();
            case "exclude_technique_texts": return unsetExcludeTechniqueTexts();
            case "exclude_work_type_texts": return unsetExcludeWorkTypeTexts();
            case "include_categories": return unsetIncludeCategories();
            case "include_collections": return unsetIncludeCollections();
            case "include_color_texts": return unsetIncludeColorTexts();
            case "include_cultural_context_texts": return unsetIncludeCulturalContextTexts();
            case "include_genders": return unsetIncludeGenders();
            case "include_institutions": return unsetIncludeInstitutions();
            case "include_location_name_texts": return unsetIncludeLocationNameTexts();
            case "include_material_texts": return unsetIncludeMaterialTexts();
            case "include_subject_term_texts": return unsetIncludeSubjectTermTexts();
            case "include_technique_texts": return unsetIncludeTechniqueTexts();
            case "include_work_type_texts": return unsetIncludeWorkTypeTexts();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private com.google.common.base.Optional<Boolean> excludeAll;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        EXCLUDE_ALL("excludeAll", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 0, "exclude_all", org.thryft.protocol.Type.BOOL),
        EXCLUDE_CATEGORIES("excludeCategories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_categories", org.thryft.protocol.Type.SET),
        EXCLUDE_COLLECTIONS("excludeCollections", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {}, false, 0, "exclude_collections", org.thryft.protocol.Type.SET),
        EXCLUDE_COLOR_TEXTS("excludeColorTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_color_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_CULTURAL_CONTEXT_TEXTS("excludeCulturalContextTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_cultural_context_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_GENDERS("excludeGenders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {}, false, 0, "exclude_genders", org.thryft.protocol.Type.SET),
        EXCLUDE_INSTITUTIONS("excludeInstitutions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {}, false, 0, "exclude_institutions", org.thryft.protocol.Type.SET),
        EXCLUDE_LOCATION_NAME_TEXTS("excludeLocationNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_location_name_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_MATERIAL_TEXTS("excludeMaterialTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_material_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_SUBJECT_TERM_TEXTS("excludeSubjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_subject_term_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_TECHNIQUE_TEXTS("excludeTechniqueTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_technique_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_WORK_TYPE_TEXTS("excludeWorkTypeTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_work_type_texts", org.thryft.protocol.Type.SET),
        INCLUDE_CATEGORIES("includeCategories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_categories", org.thryft.protocol.Type.SET),
        INCLUDE_COLLECTIONS("includeCollections", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {}, false, 0, "include_collections", org.thryft.protocol.Type.SET),
        INCLUDE_COLOR_TEXTS("includeColorTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_color_texts", org.thryft.protocol.Type.SET),
        INCLUDE_CULTURAL_CONTEXT_TEXTS("includeCulturalContextTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_cultural_context_texts", org.thryft.protocol.Type.SET),
        INCLUDE_GENDERS("includeGenders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>>() {}, false, 0, "include_genders", org.thryft.protocol.Type.SET),
        INCLUDE_INSTITUTIONS("includeInstitutions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {}, false, 0, "include_institutions", org.thryft.protocol.Type.SET),
        INCLUDE_LOCATION_NAME_TEXTS("includeLocationNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_location_name_texts", org.thryft.protocol.Type.SET),
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
            case "excludeAll": return EXCLUDE_ALL;
            case "excludeCategories": return EXCLUDE_CATEGORIES;
            case "excludeCollections": return EXCLUDE_COLLECTIONS;
            case "excludeColorTexts": return EXCLUDE_COLOR_TEXTS;
            case "excludeCulturalContextTexts": return EXCLUDE_CULTURAL_CONTEXT_TEXTS;
            case "excludeGenders": return EXCLUDE_GENDERS;
            case "excludeInstitutions": return EXCLUDE_INSTITUTIONS;
            case "excludeLocationNameTexts": return EXCLUDE_LOCATION_NAME_TEXTS;
            case "excludeMaterialTexts": return EXCLUDE_MATERIAL_TEXTS;
            case "excludeSubjectTermTexts": return EXCLUDE_SUBJECT_TERM_TEXTS;
            case "excludeTechniqueTexts": return EXCLUDE_TECHNIQUE_TEXTS;
            case "excludeWorkTypeTexts": return EXCLUDE_WORK_TYPE_TEXTS;
            case "includeCategories": return INCLUDE_CATEGORIES;
            case "includeCollections": return INCLUDE_COLLECTIONS;
            case "includeColorTexts": return INCLUDE_COLOR_TEXTS;
            case "includeCulturalContextTexts": return INCLUDE_CULTURAL_CONTEXT_TEXTS;
            case "includeGenders": return INCLUDE_GENDERS;
            case "includeInstitutions": return INCLUDE_INSTITUTIONS;
            case "includeLocationNameTexts": return INCLUDE_LOCATION_NAME_TEXTS;
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
            case "exclude_all": return EXCLUDE_ALL;
            case "exclude_categories": return EXCLUDE_CATEGORIES;
            case "exclude_collections": return EXCLUDE_COLLECTIONS;
            case "exclude_color_texts": return EXCLUDE_COLOR_TEXTS;
            case "exclude_cultural_context_texts": return EXCLUDE_CULTURAL_CONTEXT_TEXTS;
            case "exclude_genders": return EXCLUDE_GENDERS;
            case "exclude_institutions": return EXCLUDE_INSTITUTIONS;
            case "exclude_location_name_texts": return EXCLUDE_LOCATION_NAME_TEXTS;
            case "exclude_material_texts": return EXCLUDE_MATERIAL_TEXTS;
            case "exclude_subject_term_texts": return EXCLUDE_SUBJECT_TERM_TEXTS;
            case "exclude_technique_texts": return EXCLUDE_TECHNIQUE_TEXTS;
            case "exclude_work_type_texts": return EXCLUDE_WORK_TYPE_TEXTS;
            case "include_categories": return INCLUDE_CATEGORIES;
            case "include_collections": return INCLUDE_COLLECTIONS;
            case "include_color_texts": return INCLUDE_COLOR_TEXTS;
            case "include_cultural_context_texts": return INCLUDE_CULTURAL_CONTEXT_TEXTS;
            case "include_genders": return INCLUDE_GENDERS;
            case "include_institutions": return INCLUDE_INSTITUTIONS;
            case "include_location_name_texts": return INCLUDE_LOCATION_NAME_TEXTS;
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
        excludeAll = com.google.common.base.Optional.absent();
        excludeCategories = com.google.common.base.Optional.absent();
        excludeCollections = com.google.common.base.Optional.absent();
        excludeColorTexts = com.google.common.base.Optional.absent();
        excludeCulturalContextTexts = com.google.common.base.Optional.absent();
        excludeGenders = com.google.common.base.Optional.absent();
        excludeInstitutions = com.google.common.base.Optional.absent();
        excludeLocationNameTexts = com.google.common.base.Optional.absent();
        excludeMaterialTexts = com.google.common.base.Optional.absent();
        excludeSubjectTermTexts = com.google.common.base.Optional.absent();
        excludeTechniqueTexts = com.google.common.base.Optional.absent();
        excludeWorkTypeTexts = com.google.common.base.Optional.absent();
        includeCategories = com.google.common.base.Optional.absent();
        includeCollections = com.google.common.base.Optional.absent();
        includeColorTexts = com.google.common.base.Optional.absent();
        includeCulturalContextTexts = com.google.common.base.Optional.absent();
        includeGenders = com.google.common.base.Optional.absent();
        includeInstitutions = com.google.common.base.Optional.absent();
        includeLocationNameTexts = com.google.common.base.Optional.absent();
        includeMaterialTexts = com.google.common.base.Optional.absent();
        includeSubjectTermTexts = com.google.common.base.Optional.absent();
        includeTechniqueTexts = com.google.common.base.Optional.absent();
        includeWorkTypeTexts = com.google.common.base.Optional.absent();
    }

    /**
     * Copy constructor
     */
    public ObjectFacetFilters(final ObjectFacetFilters other) {
        this(other.getExcludeAll(), other.getExcludeCategories(), other.getExcludeCollections(), other.getExcludeColorTexts(), other.getExcludeCulturalContextTexts(), other.getExcludeGenders(), other.getExcludeInstitutions(), other.getExcludeLocationNameTexts(), other.getExcludeMaterialTexts(), other.getExcludeSubjectTermTexts(), other.getExcludeTechniqueTexts(), other.getExcludeWorkTypeTexts(), other.getIncludeCategories(), other.getIncludeCollections(), other.getIncludeColorTexts(), other.getIncludeCulturalContextTexts(), other.getIncludeGenders(), other.getIncludeInstitutions(), other.getIncludeLocationNameTexts(), other.getIncludeMaterialTexts(), other.getIncludeSubjectTermTexts(), other.getIncludeTechniqueTexts(), other.getIncludeWorkTypeTexts());
    }

    /**
     * Total Nullable constructor
     */
    public ObjectFacetFilters(final @javax.annotation.Nullable Boolean excludeAll, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeCategories, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> excludeCollections, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeColorTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeCulturalContextTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> excludeGenders, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> excludeInstitutions, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeLocationNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeMaterialTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeCategories, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> includeCollections, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeColorTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeCulturalContextTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> includeGenders, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutions, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeLocationNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeMaterialTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeTechniqueTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeWorkTypeTexts) {
        this.excludeAll = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(excludeAll), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeAll must be true");
        this.excludeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeCategories), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeCategories is empty");
        this.excludeCollections = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeCollections), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeCollections is empty");
        this.excludeColorTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeColorTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeColorTexts is empty");
        this.excludeCulturalContextTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeCulturalContextTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeCulturalContextTexts is empty");
        this.excludeGenders = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeGenders), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeGenders is empty");
        this.excludeInstitutions = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeInstitutions), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeInstitutions is empty");
        this.excludeLocationNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeLocationNameTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeLocationNameTexts is empty");
        this.excludeMaterialTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeMaterialTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeMaterialTexts is empty");
        this.excludeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeSubjectTermTexts is empty");
        this.excludeTechniqueTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeTechniqueTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeTechniqueTexts is empty");
        this.excludeWorkTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeWorkTypeTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeWorkTypeTexts is empty");
        this.includeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeCategories), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeCategories is empty");
        this.includeCollections = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeCollections), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeCollections is empty");
        this.includeColorTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeColorTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeColorTexts is empty");
        this.includeCulturalContextTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeCulturalContextTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeCulturalContextTexts is empty");
        this.includeGenders = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeGenders), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeGenders is empty");
        this.includeInstitutions = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeInstitutions), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeInstitutions is empty");
        this.includeLocationNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeLocationNameTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeLocationNameTexts is empty");
        this.includeMaterialTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeMaterialTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeMaterialTexts is empty");
        this.includeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeSubjectTermTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeSubjectTermTexts is empty");
        this.includeTechniqueTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeTechniqueTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeTechniqueTexts is empty");
        this.includeWorkTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeWorkTypeTexts), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeWorkTypeTexts is empty");
    }

    /**
     * Optional constructor
     */
    public ObjectFacetFilters(final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
        this.excludeAll = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(excludeAll, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeAll"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeAll must be true");
        this.excludeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeCategories, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeCategories"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeCategories is empty");
        this.excludeCollections = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeCollections, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeCollections"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeCollections is empty");
        this.excludeColorTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeColorTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeColorTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeColorTexts is empty");
        this.excludeCulturalContextTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeCulturalContextTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeCulturalContextTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeCulturalContextTexts is empty");
        this.excludeGenders = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeGenders, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeGenders"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeGenders is empty");
        this.excludeInstitutions = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeInstitutions, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeInstitutions"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeInstitutions is empty");
        this.excludeLocationNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeLocationNameTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeLocationNameTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeLocationNameTexts is empty");
        this.excludeMaterialTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeMaterialTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeMaterialTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeMaterialTexts is empty");
        this.excludeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeSubjectTermTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeSubjectTermTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeSubjectTermTexts is empty");
        this.excludeTechniqueTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeTechniqueTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeTechniqueTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeTechniqueTexts is empty");
        this.excludeWorkTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeWorkTypeTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing excludeWorkTypeTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: excludeWorkTypeTexts is empty");
        this.includeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeCategories, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeCategories"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeCategories is empty");
        this.includeCollections = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeCollections, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeCollections"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeCollections is empty");
        this.includeColorTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeColorTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeColorTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeColorTexts is empty");
        this.includeCulturalContextTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeCulturalContextTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeCulturalContextTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeCulturalContextTexts is empty");
        this.includeGenders = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeGenders, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeGenders"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeGenders is empty");
        this.includeInstitutions = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeInstitutions, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeInstitutions"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeInstitutions is empty");
        this.includeLocationNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeLocationNameTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeLocationNameTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeLocationNameTexts is empty");
        this.includeMaterialTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeMaterialTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeMaterialTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeMaterialTexts is empty");
        this.includeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeSubjectTermTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeSubjectTermTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeSubjectTermTexts is empty");
        this.includeTechniqueTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeTechniqueTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeTechniqueTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeTechniqueTexts is empty");
        this.includeWorkTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeWorkTypeTexts, "net.lab1318.costume.api.models.object.ObjectFacetFilters: missing includeWorkTypeTexts"), "net.lab1318.costume.api.models.object.ObjectFacetFilters: includeWorkTypeTexts is empty");
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
            getExcludeAll().equals(other.getExcludeAll()) &&
            getExcludeCategories().equals(other.getExcludeCategories()) &&
            getExcludeCollections().equals(other.getExcludeCollections()) &&
            getExcludeColorTexts().equals(other.getExcludeColorTexts()) &&
            getExcludeCulturalContextTexts().equals(other.getExcludeCulturalContextTexts()) &&
            getExcludeGenders().equals(other.getExcludeGenders()) &&
            getExcludeInstitutions().equals(other.getExcludeInstitutions()) &&
            getExcludeLocationNameTexts().equals(other.getExcludeLocationNameTexts()) &&
            getExcludeMaterialTexts().equals(other.getExcludeMaterialTexts()) &&
            getExcludeSubjectTermTexts().equals(other.getExcludeSubjectTermTexts()) &&
            getExcludeTechniqueTexts().equals(other.getExcludeTechniqueTexts()) &&
            getExcludeWorkTypeTexts().equals(other.getExcludeWorkTypeTexts()) &&
            getIncludeCategories().equals(other.getIncludeCategories()) &&
            getIncludeCollections().equals(other.getIncludeCollections()) &&
            getIncludeColorTexts().equals(other.getIncludeColorTexts()) &&
            getIncludeCulturalContextTexts().equals(other.getIncludeCulturalContextTexts()) &&
            getIncludeGenders().equals(other.getIncludeGenders()) &&
            getIncludeInstitutions().equals(other.getIncludeInstitutions()) &&
            getIncludeLocationNameTexts().equals(other.getIncludeLocationNameTexts()) &&
            getIncludeMaterialTexts().equals(other.getIncludeMaterialTexts()) &&
            getIncludeSubjectTermTexts().equals(other.getIncludeSubjectTermTexts()) &&
            getIncludeTechniqueTexts().equals(other.getIncludeTechniqueTexts()) &&
            getIncludeWorkTypeTexts().equals(other.getIncludeWorkTypeTexts());
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
        case EXCLUDE_ALL: return getExcludeAll();
        case EXCLUDE_CATEGORIES: return getExcludeCategories();
        case EXCLUDE_COLLECTIONS: return getExcludeCollections();
        case EXCLUDE_COLOR_TEXTS: return getExcludeColorTexts();
        case EXCLUDE_CULTURAL_CONTEXT_TEXTS: return getExcludeCulturalContextTexts();
        case EXCLUDE_GENDERS: return getExcludeGenders();
        case EXCLUDE_INSTITUTIONS: return getExcludeInstitutions();
        case EXCLUDE_LOCATION_NAME_TEXTS: return getExcludeLocationNameTexts();
        case EXCLUDE_MATERIAL_TEXTS: return getExcludeMaterialTexts();
        case EXCLUDE_SUBJECT_TERM_TEXTS: return getExcludeSubjectTermTexts();
        case EXCLUDE_TECHNIQUE_TEXTS: return getExcludeTechniqueTexts();
        case EXCLUDE_WORK_TYPE_TEXTS: return getExcludeWorkTypeTexts();
        case INCLUDE_CATEGORIES: return getIncludeCategories();
        case INCLUDE_COLLECTIONS: return getIncludeCollections();
        case INCLUDE_COLOR_TEXTS: return getIncludeColorTexts();
        case INCLUDE_CULTURAL_CONTEXT_TEXTS: return getIncludeCulturalContextTexts();
        case INCLUDE_GENDERS: return getIncludeGenders();
        case INCLUDE_INSTITUTIONS: return getIncludeInstitutions();
        case INCLUDE_LOCATION_NAME_TEXTS: return getIncludeLocationNameTexts();
        case INCLUDE_MATERIAL_TEXTS: return getIncludeMaterialTexts();
        case INCLUDE_SUBJECT_TERM_TEXTS: return getIncludeSubjectTermTexts();
        case INCLUDE_TECHNIQUE_TEXTS: return getIncludeTechniqueTexts();
        case INCLUDE_WORK_TYPE_TEXTS: return getIncludeWorkTypeTexts();
        default:
            throw new IllegalStateException();
        }
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

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeColorTexts() {
        return excludeColorTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeCulturalContextTexts() {
        return excludeCulturalContextTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> getExcludeGenders() {
        return excludeGenders;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getExcludeInstitutions() {
        return excludeInstitutions;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeLocationNameTexts() {
        return excludeLocationNameTexts;
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

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeCategories() {
        return includeCategories;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> getIncludeCollections() {
        return includeCollections;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeColorTexts() {
        return includeColorTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeCulturalContextTexts() {
        return includeCulturalContextTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> getIncludeGenders() {
        return includeGenders;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getIncludeInstitutions() {
        return includeInstitutions;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeLocationNameTexts() {
        return includeLocationNameTexts;
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
        if (getExcludeAll().isPresent()) {
            hashCode = 31 * hashCode + (getExcludeAll().get() ? 1 : 0);
        }
        if (getExcludeCategories().isPresent()) {
            hashCode = 31 * hashCode + getExcludeCategories().get().hashCode();
        }
        if (getExcludeCollections().isPresent()) {
            hashCode = 31 * hashCode + getExcludeCollections().get().hashCode();
        }
        if (getExcludeColorTexts().isPresent()) {
            hashCode = 31 * hashCode + getExcludeColorTexts().get().hashCode();
        }
        if (getExcludeCulturalContextTexts().isPresent()) {
            hashCode = 31 * hashCode + getExcludeCulturalContextTexts().get().hashCode();
        }
        if (getExcludeGenders().isPresent()) {
            hashCode = 31 * hashCode + getExcludeGenders().get().hashCode();
        }
        if (getExcludeInstitutions().isPresent()) {
            hashCode = 31 * hashCode + getExcludeInstitutions().get().hashCode();
        }
        if (getExcludeLocationNameTexts().isPresent()) {
            hashCode = 31 * hashCode + getExcludeLocationNameTexts().get().hashCode();
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
        if (getIncludeCategories().isPresent()) {
            hashCode = 31 * hashCode + getIncludeCategories().get().hashCode();
        }
        if (getIncludeCollections().isPresent()) {
            hashCode = 31 * hashCode + getIncludeCollections().get().hashCode();
        }
        if (getIncludeColorTexts().isPresent()) {
            hashCode = 31 * hashCode + getIncludeColorTexts().get().hashCode();
        }
        if (getIncludeCulturalContextTexts().isPresent()) {
            hashCode = 31 * hashCode + getIncludeCulturalContextTexts().get().hashCode();
        }
        if (getIncludeGenders().isPresent()) {
            hashCode = 31 * hashCode + getIncludeGenders().get().hashCode();
        }
        if (getIncludeInstitutions().isPresent()) {
            hashCode = 31 * hashCode + getIncludeInstitutions().get().hashCode();
        }
        if (getIncludeLocationNameTexts().isPresent()) {
            hashCode = 31 * hashCode + getIncludeLocationNameTexts().get().hashCode();
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

    @Override
    public boolean isEmpty() {
        return !getExcludeAll().isPresent() && !getExcludeCategories().isPresent() && !getExcludeCollections().isPresent() && !getExcludeColorTexts().isPresent() && !getExcludeCulturalContextTexts().isPresent() && !getExcludeGenders().isPresent() && !getExcludeInstitutions().isPresent() && !getExcludeLocationNameTexts().isPresent() && !getExcludeMaterialTexts().isPresent() && !getExcludeSubjectTermTexts().isPresent() && !getExcludeTechniqueTexts().isPresent() && !getExcludeWorkTypeTexts().isPresent() && !getIncludeCategories().isPresent() && !getIncludeCollections().isPresent() && !getIncludeColorTexts().isPresent() && !getIncludeCulturalContextTexts().isPresent() && !getIncludeGenders().isPresent() && !getIncludeInstitutions().isPresent() && !getIncludeLocationNameTexts().isPresent() && !getIncludeMaterialTexts().isPresent() && !getIncludeSubjectTermTexts().isPresent() && !getIncludeTechniqueTexts().isPresent() && !getIncludeWorkTypeTexts().isPresent();
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
        com.google.common.base.Optional<Boolean> excludeAll = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        if (__list.getSize() > 0) {
            excludeAll = com.google.common.base.Optional.of(iprot.readBool());
        }
        if (__list.getSize() > 1) {
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
        if (__list.getSize() > 2) {
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
        if (__list.getSize() > 3) {
            try {
                excludeColorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
        if (__list.getSize() > 4) {
            try {
                excludeCulturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
        if (__list.getSize() > 5) {
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
        if (__list.getSize() > 6) {
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
        if (__list.getSize() > 7) {
            try {
                excludeLocationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
        if (__list.getSize() > 9) {
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
        if (__list.getSize() > 10) {
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
        if (__list.getSize() > 11) {
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
        if (__list.getSize() > 12) {
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
        if (__list.getSize() > 13) {
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
        if (__list.getSize() > 14) {
            try {
                includeColorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
        if (__list.getSize() > 15) {
            try {
                includeCulturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
        if (__list.getSize() > 17) {
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
        if (__list.getSize() > 18) {
            try {
                includeLocationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
        if (__list.getSize() > 19) {
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
        if (__list.getSize() > 20) {
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
        if (__list.getSize() > 21) {
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
        if (__list.getSize() > 22) {
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
            return new ObjectFacetFilters(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectFacetFilters readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectFacetFilters readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<Boolean> excludeAll = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts = com.google.common.base.Optional.absent();
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
            case "exclude_color_texts": {
                try {
                    excludeColorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            case "exclude_cultural_context_texts": {
                try {
                    excludeCulturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            case "exclude_location_name_texts": {
                try {
                    excludeLocationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            case "include_color_texts": {
                try {
                    includeColorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            case "include_cultural_context_texts": {
                try {
                    includeCulturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            case "include_location_name_texts": {
                try {
                    includeLocationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
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
            default:
                if (unknownFieldCallback.isPresent()) {
                    unknownFieldCallback.get().apply(ifield);
                }
                break;
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new ObjectFacetFilters(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectFacetFilters replaceExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) {
        return new ObjectFacetFilters(excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeAll(final boolean excludeAll) {
        return replaceExcludeAll(com.google.common.base.Optional.fromNullable(excludeAll));
    }

    public ObjectFacetFilters replaceExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
        return new ObjectFacetFilters(this.excludeAll, excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeCategories(final com.google.common.collect.ImmutableSet<String> excludeCategories) {
        return replaceExcludeCategories(com.google.common.base.Optional.fromNullable(excludeCategories));
    }

    public ObjectFacetFilters replaceExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeCollections(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> excludeCollections) {
        return replaceExcludeCollections(com.google.common.base.Optional.fromNullable(excludeCollections));
    }

    public ObjectFacetFilters replaceExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeColorTexts(final com.google.common.collect.ImmutableSet<String> excludeColorTexts) {
        return replaceExcludeColorTexts(com.google.common.base.Optional.fromNullable(excludeColorTexts));
    }

    public ObjectFacetFilters replaceExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeCulturalContextTexts(final com.google.common.collect.ImmutableSet<String> excludeCulturalContextTexts) {
        return replaceExcludeCulturalContextTexts(com.google.common.base.Optional.fromNullable(excludeCulturalContextTexts));
    }

    public ObjectFacetFilters replaceExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeGenders(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> excludeGenders) {
        return replaceExcludeGenders(com.google.common.base.Optional.fromNullable(excludeGenders));
    }

    public ObjectFacetFilters replaceExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeInstitutions(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> excludeInstitutions) {
        return replaceExcludeInstitutions(com.google.common.base.Optional.fromNullable(excludeInstitutions));
    }

    public ObjectFacetFilters replaceExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeLocationNameTexts(final com.google.common.collect.ImmutableSet<String> excludeLocationNameTexts) {
        return replaceExcludeLocationNameTexts(com.google.common.base.Optional.fromNullable(excludeLocationNameTexts));
    }

    public ObjectFacetFilters replaceExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeMaterialTexts(final com.google.common.collect.ImmutableSet<String> excludeMaterialTexts) {
        return replaceExcludeMaterialTexts(com.google.common.base.Optional.fromNullable(excludeMaterialTexts));
    }

    public ObjectFacetFilters replaceExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeSubjectTermTexts(final com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts) {
        return replaceExcludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts));
    }

    public ObjectFacetFilters replaceExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeTechniqueTexts(final com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts) {
        return replaceExcludeTechniqueTexts(com.google.common.base.Optional.fromNullable(excludeTechniqueTexts));
    }

    public ObjectFacetFilters replaceExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeWorkTypeTexts(final com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts) {
        return replaceExcludeWorkTypeTexts(com.google.common.base.Optional.fromNullable(excludeWorkTypeTexts));
    }

    public ObjectFacetFilters replaceIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeCategories(final com.google.common.collect.ImmutableSet<String> includeCategories) {
        return replaceIncludeCategories(com.google.common.base.Optional.fromNullable(includeCategories));
    }

    public ObjectFacetFilters replaceIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeCollections(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> includeCollections) {
        return replaceIncludeCollections(com.google.common.base.Optional.fromNullable(includeCollections));
    }

    public ObjectFacetFilters replaceIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeColorTexts(final com.google.common.collect.ImmutableSet<String> includeColorTexts) {
        return replaceIncludeColorTexts(com.google.common.base.Optional.fromNullable(includeColorTexts));
    }

    public ObjectFacetFilters replaceIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeCulturalContextTexts(final com.google.common.collect.ImmutableSet<String> includeCulturalContextTexts) {
        return replaceIncludeCulturalContextTexts(com.google.common.base.Optional.fromNullable(includeCulturalContextTexts));
    }

    public ObjectFacetFilters replaceIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeGenders(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender> includeGenders) {
        return replaceIncludeGenders(com.google.common.base.Optional.fromNullable(includeGenders));
    }

    public ObjectFacetFilters replaceIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeInstitutions(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutions) {
        return replaceIncludeInstitutions(com.google.common.base.Optional.fromNullable(includeInstitutions));
    }

    public ObjectFacetFilters replaceIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeLocationNameTexts(final com.google.common.collect.ImmutableSet<String> includeLocationNameTexts) {
        return replaceIncludeLocationNameTexts(com.google.common.base.Optional.fromNullable(includeLocationNameTexts));
    }

    public ObjectFacetFilters replaceIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeMaterialTexts(final com.google.common.collect.ImmutableSet<String> includeMaterialTexts) {
        return replaceIncludeMaterialTexts(com.google.common.base.Optional.fromNullable(includeMaterialTexts));
    }

    public ObjectFacetFilters replaceIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeSubjectTermTexts(final com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts) {
        return replaceIncludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(includeSubjectTermTexts));
    }

    public ObjectFacetFilters replaceIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeTechniqueTexts(final com.google.common.collect.ImmutableSet<String> includeTechniqueTexts) {
        return replaceIncludeTechniqueTexts(com.google.common.base.Optional.fromNullable(includeTechniqueTexts));
    }

    public ObjectFacetFilters replaceIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeWorkTypeTexts(final com.google.common.collect.ImmutableSet<String> includeWorkTypeTexts) {
        return replaceIncludeWorkTypeTexts(com.google.common.base.Optional.fromNullable(includeWorkTypeTexts));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("exclude_all", getExcludeAll().orNull()).add("exclude_categories", getExcludeCategories().orNull()).add("exclude_collections", getExcludeCollections().orNull()).add("exclude_color_texts", getExcludeColorTexts().orNull()).add("exclude_cultural_context_texts", getExcludeCulturalContextTexts().orNull()).add("exclude_genders", getExcludeGenders().orNull()).add("exclude_institutions", getExcludeInstitutions().orNull()).add("exclude_location_name_texts", getExcludeLocationNameTexts().orNull()).add("exclude_material_texts", getExcludeMaterialTexts().orNull()).add("exclude_subject_term_texts", getExcludeSubjectTermTexts().orNull()).add("exclude_technique_texts", getExcludeTechniqueTexts().orNull()).add("exclude_work_type_texts", getExcludeWorkTypeTexts().orNull()).add("include_categories", getIncludeCategories().orNull()).add("include_collections", getIncludeCollections().orNull()).add("include_color_texts", getIncludeColorTexts().orNull()).add("include_cultural_context_texts", getIncludeCulturalContextTexts().orNull()).add("include_genders", getIncludeGenders().orNull()).add("include_institutions", getIncludeInstitutions().orNull()).add("include_location_name_texts", getIncludeLocationNameTexts().orNull()).add("include_material_texts", getIncludeMaterialTexts().orNull()).add("include_subject_term_texts", getIncludeSubjectTermTexts().orNull()).add("include_technique_texts", getIncludeTechniqueTexts().orNull()).add("include_work_type_texts", getIncludeWorkTypeTexts().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 23);

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

        if (getExcludeColorTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeColorTexts().get().size());
            for (final String _iter0 : getExcludeColorTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeCulturalContextTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCulturalContextTexts().get().size());
            for (final String _iter0 : getExcludeCulturalContextTexts().get()) {
                oprot.writeString(_iter0);
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

        if (getExcludeLocationNameTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeLocationNameTexts().get().size());
            for (final String _iter0 : getExcludeLocationNameTexts().get()) {
                oprot.writeString(_iter0);
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

        if (getIncludeColorTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeColorTexts().get().size());
            for (final String _iter0 : getIncludeColorTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeCulturalContextTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCulturalContextTexts().get().size());
            for (final String _iter0 : getIncludeCulturalContextTexts().get()) {
                oprot.writeString(_iter0);
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

        if (getIncludeLocationNameTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeLocationNameTexts().get().size());
            for (final String _iter0 : getIncludeLocationNameTexts().get()) {
                oprot.writeString(_iter0);
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.object.ObjectFacetFilters");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
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

        if (getExcludeColorTexts().isPresent()) {
            oprot.writeFieldBegin("exclude_color_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeColorTexts().get().size());
            for (final String _iter0 : getExcludeColorTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeCulturalContextTexts().isPresent()) {
            oprot.writeFieldBegin("exclude_cultural_context_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCulturalContextTexts().get().size());
            for (final String _iter0 : getExcludeCulturalContextTexts().get()) {
                oprot.writeString(_iter0);
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

        if (getExcludeLocationNameTexts().isPresent()) {
            oprot.writeFieldBegin("exclude_location_name_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeLocationNameTexts().get().size());
            for (final String _iter0 : getExcludeLocationNameTexts().get()) {
                oprot.writeString(_iter0);
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

        if (getIncludeColorTexts().isPresent()) {
            oprot.writeFieldBegin("include_color_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeColorTexts().get().size());
            for (final String _iter0 : getIncludeColorTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeCulturalContextTexts().isPresent()) {
            oprot.writeFieldBegin("include_cultural_context_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCulturalContextTexts().get().size());
            for (final String _iter0 : getIncludeCulturalContextTexts().get()) {
                oprot.writeString(_iter0);
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

        if (getIncludeLocationNameTexts().isPresent()) {
            oprot.writeFieldBegin("include_location_name_texts", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeLocationNameTexts().get().size());
            for (final String _iter0 : getIncludeLocationNameTexts().get()) {
                oprot.writeString(_iter0);
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

    private final com.google.common.base.Optional<Boolean> excludeAll;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollections;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> excludeGenders;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutions;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollections;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.gender.Gender>> includeGenders;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutions;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts;
}