package org.dressdiscover.api.models.object;

public final class ObjectFacetFilters implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            excludeAll = com.google.common.base.Optional.<Boolean> absent();
            excludeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            excludeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
            excludeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            excludeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            excludeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> absent();
            excludeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
            excludeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            excludeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            excludeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            excludeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            excludeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            includeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            includeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
            includeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            includeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            includeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> absent();
            includeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
            includeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            includeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            includeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            includeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            includeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
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

        protected ObjectFacetFilters _build(final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            return new ObjectFacetFilters(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts, DefaultConstructionValidator.getInstance());
        }

        public ObjectFacetFilters build() {
            return _build(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
        }

        public final com.google.common.base.Optional<Boolean> getExcludeAll() {
            return excludeAll;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeCategories() {
            return excludeCategories;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> getExcludeCollections() {
            return excludeCollections;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeColorTexts() {
            return excludeColorTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeCulturalContextTexts() {
            return excludeCulturalContextTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> getExcludeGenders() {
            return excludeGenders;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> getExcludeInstitutions() {
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

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> getIncludeCollections() {
            return includeCollections;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeColorTexts() {
            return includeColorTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeCulturalContextTexts() {
            return includeCulturalContextTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> getIncludeGenders() {
            return includeGenders;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> getIncludeInstitutions() {
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
                     throw e.getCause();
                }
            }
            if (__list.getSize() > 2) {
                try {
                    excludeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
                }
            }
            if (__list.getSize() > 5) {
                try {
                    excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
                }
            }
            if (__list.getSize() > 6) {
                try {
                    excludeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
                }
            }
            if (__list.getSize() > 13) {
                try {
                    includeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
                }
            }
            if (__list.getSize() > 16) {
                try {
                    includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
                }
            }
            if (__list.getSize() > 17) {
                try {
                    includeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                         throw e.getCause();
                    }
                    break;
                }
                case "exclude_collections": {
                    try {
                        excludeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
                    }
                    break;
                }
                case "exclude_genders": {
                    try {
                        excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                                        } catch (final IllegalArgumentException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
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
                         throw e.getCause();
                    }
                    break;
                }
                case "exclude_institutions": {
                    try {
                        excludeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
                    }
                    break;
                }
                case "include_collections": {
                    try {
                        includeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
                    }
                    break;
                }
                case "include_genders": {
                    try {
                        includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                                        } catch (final IllegalArgumentException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
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
                         throw e.getCause();
                    }
                    break;
                }
                case "include_institutions": {
                    try {
                        includeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
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
                         throw e.getCause();
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
            case EXCLUDE_ALL: setExcludeAll((Boolean)value); return this;
            case EXCLUDE_CATEGORIES: setExcludeCategories((com.google.common.collect.ImmutableSet<String>)value); return this;
            case EXCLUDE_COLLECTIONS: setExcludeCollections((com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>)value); return this;
            case EXCLUDE_COLOR_TEXTS: setExcludeColorTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case EXCLUDE_CULTURAL_CONTEXT_TEXTS: setExcludeCulturalContextTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case EXCLUDE_GENDERS: setExcludeGenders((com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>)value); return this;
            case EXCLUDE_INSTITUTIONS: setExcludeInstitutions((com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>)value); return this;
            case EXCLUDE_LOCATION_NAME_TEXTS: setExcludeLocationNameTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case EXCLUDE_MATERIAL_TEXTS: setExcludeMaterialTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case EXCLUDE_SUBJECT_TERM_TEXTS: setExcludeSubjectTermTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case EXCLUDE_TECHNIQUE_TEXTS: setExcludeTechniqueTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case EXCLUDE_WORK_TYPE_TEXTS: setExcludeWorkTypeTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case INCLUDE_CATEGORIES: setIncludeCategories((com.google.common.collect.ImmutableSet<String>)value); return this;
            case INCLUDE_COLLECTIONS: setIncludeCollections((com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>)value); return this;
            case INCLUDE_COLOR_TEXTS: setIncludeColorTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case INCLUDE_CULTURAL_CONTEXT_TEXTS: setIncludeCulturalContextTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case INCLUDE_GENDERS: setIncludeGenders((com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>)value); return this;
            case INCLUDE_INSTITUTIONS: setIncludeInstitutions((com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>)value); return this;
            case INCLUDE_LOCATION_NAME_TEXTS: setIncludeLocationNameTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case INCLUDE_MATERIAL_TEXTS: setIncludeMaterialTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case INCLUDE_SUBJECT_TERM_TEXTS: setIncludeSubjectTermTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case INCLUDE_TECHNIQUE_TEXTS: setIncludeTechniqueTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case INCLUDE_WORK_TYPE_TEXTS: setIncludeWorkTypeTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) {
            this.excludeAll = DefaultConstructionValidator.getInstance().validateExcludeAll(excludeAll);
            return this;
        }

        public Builder setExcludeAll(@javax.annotation.Nullable final Boolean excludeAll) {
            return setExcludeAll(com.google.common.base.Optional.fromNullable(excludeAll));
        }

        public Builder setExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
            this.excludeCategories = DefaultConstructionValidator.getInstance().validateExcludeCategories(excludeCategories);
            return this;
        }

        public Builder setExcludeCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeCategories) {
            return setExcludeCategories(com.google.common.base.Optional.fromNullable(excludeCategories));
        }

        public Builder setExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) {
            this.excludeCollections = DefaultConstructionValidator.getInstance().validateExcludeCollections(excludeCollections);
            return this;
        }

        public Builder setExcludeCollections(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> excludeCollections) {
            return setExcludeCollections(com.google.common.base.Optional.fromNullable(excludeCollections));
        }

        public Builder setExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) {
            this.excludeColorTexts = DefaultConstructionValidator.getInstance().validateExcludeColorTexts(excludeColorTexts);
            return this;
        }

        public Builder setExcludeColorTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeColorTexts) {
            return setExcludeColorTexts(com.google.common.base.Optional.fromNullable(excludeColorTexts));
        }

        public Builder setExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) {
            this.excludeCulturalContextTexts = DefaultConstructionValidator.getInstance().validateExcludeCulturalContextTexts(excludeCulturalContextTexts);
            return this;
        }

        public Builder setExcludeCulturalContextTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeCulturalContextTexts) {
            return setExcludeCulturalContextTexts(com.google.common.base.Optional.fromNullable(excludeCulturalContextTexts));
        }

        public Builder setExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders) {
            this.excludeGenders = DefaultConstructionValidator.getInstance().validateExcludeGenders(excludeGenders);
            return this;
        }

        public Builder setExcludeGenders(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> excludeGenders) {
            return setExcludeGenders(com.google.common.base.Optional.fromNullable(excludeGenders));
        }

        public Builder setExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) {
            this.excludeInstitutions = DefaultConstructionValidator.getInstance().validateExcludeInstitutions(excludeInstitutions);
            return this;
        }

        public Builder setExcludeInstitutions(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> excludeInstitutions) {
            return setExcludeInstitutions(com.google.common.base.Optional.fromNullable(excludeInstitutions));
        }

        public Builder setExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) {
            this.excludeLocationNameTexts = DefaultConstructionValidator.getInstance().validateExcludeLocationNameTexts(excludeLocationNameTexts);
            return this;
        }

        public Builder setExcludeLocationNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeLocationNameTexts) {
            return setExcludeLocationNameTexts(com.google.common.base.Optional.fromNullable(excludeLocationNameTexts));
        }

        public Builder setExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) {
            this.excludeMaterialTexts = DefaultConstructionValidator.getInstance().validateExcludeMaterialTexts(excludeMaterialTexts);
            return this;
        }

        public Builder setExcludeMaterialTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeMaterialTexts) {
            return setExcludeMaterialTexts(com.google.common.base.Optional.fromNullable(excludeMaterialTexts));
        }

        public Builder setExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
            this.excludeSubjectTermTexts = DefaultConstructionValidator.getInstance().validateExcludeSubjectTermTexts(excludeSubjectTermTexts);
            return this;
        }

        public Builder setExcludeSubjectTermTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts) {
            return setExcludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts));
        }

        public Builder setExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) {
            this.excludeTechniqueTexts = DefaultConstructionValidator.getInstance().validateExcludeTechniqueTexts(excludeTechniqueTexts);
            return this;
        }

        public Builder setExcludeTechniqueTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts) {
            return setExcludeTechniqueTexts(com.google.common.base.Optional.fromNullable(excludeTechniqueTexts));
        }

        public Builder setExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) {
            this.excludeWorkTypeTexts = DefaultConstructionValidator.getInstance().validateExcludeWorkTypeTexts(excludeWorkTypeTexts);
            return this;
        }

        public Builder setExcludeWorkTypeTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts) {
            return setExcludeWorkTypeTexts(com.google.common.base.Optional.fromNullable(excludeWorkTypeTexts));
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
            this.includeCategories = DefaultConstructionValidator.getInstance().validateIncludeCategories(includeCategories);
            return this;
        }

        public Builder setIncludeCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeCategories) {
            return setIncludeCategories(com.google.common.base.Optional.fromNullable(includeCategories));
        }

        public Builder setIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) {
            this.includeCollections = DefaultConstructionValidator.getInstance().validateIncludeCollections(includeCollections);
            return this;
        }

        public Builder setIncludeCollections(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> includeCollections) {
            return setIncludeCollections(com.google.common.base.Optional.fromNullable(includeCollections));
        }

        public Builder setIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) {
            this.includeColorTexts = DefaultConstructionValidator.getInstance().validateIncludeColorTexts(includeColorTexts);
            return this;
        }

        public Builder setIncludeColorTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeColorTexts) {
            return setIncludeColorTexts(com.google.common.base.Optional.fromNullable(includeColorTexts));
        }

        public Builder setIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) {
            this.includeCulturalContextTexts = DefaultConstructionValidator.getInstance().validateIncludeCulturalContextTexts(includeCulturalContextTexts);
            return this;
        }

        public Builder setIncludeCulturalContextTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeCulturalContextTexts) {
            return setIncludeCulturalContextTexts(com.google.common.base.Optional.fromNullable(includeCulturalContextTexts));
        }

        public Builder setIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders) {
            this.includeGenders = DefaultConstructionValidator.getInstance().validateIncludeGenders(includeGenders);
            return this;
        }

        public Builder setIncludeGenders(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> includeGenders) {
            return setIncludeGenders(com.google.common.base.Optional.fromNullable(includeGenders));
        }

        public Builder setIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) {
            this.includeInstitutions = DefaultConstructionValidator.getInstance().validateIncludeInstitutions(includeInstitutions);
            return this;
        }

        public Builder setIncludeInstitutions(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> includeInstitutions) {
            return setIncludeInstitutions(com.google.common.base.Optional.fromNullable(includeInstitutions));
        }

        public Builder setIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) {
            this.includeLocationNameTexts = DefaultConstructionValidator.getInstance().validateIncludeLocationNameTexts(includeLocationNameTexts);
            return this;
        }

        public Builder setIncludeLocationNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeLocationNameTexts) {
            return setIncludeLocationNameTexts(com.google.common.base.Optional.fromNullable(includeLocationNameTexts));
        }

        public Builder setIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) {
            this.includeMaterialTexts = DefaultConstructionValidator.getInstance().validateIncludeMaterialTexts(includeMaterialTexts);
            return this;
        }

        public Builder setIncludeMaterialTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeMaterialTexts) {
            return setIncludeMaterialTexts(com.google.common.base.Optional.fromNullable(includeMaterialTexts));
        }

        public Builder setIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
            this.includeSubjectTermTexts = DefaultConstructionValidator.getInstance().validateIncludeSubjectTermTexts(includeSubjectTermTexts);
            return this;
        }

        public Builder setIncludeSubjectTermTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts) {
            return setIncludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(includeSubjectTermTexts));
        }

        public Builder setIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) {
            this.includeTechniqueTexts = DefaultConstructionValidator.getInstance().validateIncludeTechniqueTexts(includeTechniqueTexts);
            return this;
        }

        public Builder setIncludeTechniqueTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeTechniqueTexts) {
            return setIncludeTechniqueTexts(com.google.common.base.Optional.fromNullable(includeTechniqueTexts));
        }

        public Builder setIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            this.includeWorkTypeTexts = DefaultConstructionValidator.getInstance().validateIncludeWorkTypeTexts(includeWorkTypeTexts);
            return this;
        }

        public Builder setIncludeWorkTypeTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeWorkTypeTexts) {
            return setIncludeWorkTypeTexts(com.google.common.base.Optional.fromNullable(includeWorkTypeTexts));
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
            case EXCLUDE_ALL: return unsetExcludeAll();
            case EXCLUDE_CATEGORIES: return unsetExcludeCategories();
            case EXCLUDE_COLLECTIONS: return unsetExcludeCollections();
            case EXCLUDE_COLOR_TEXTS: return unsetExcludeColorTexts();
            case EXCLUDE_CULTURAL_CONTEXT_TEXTS: return unsetExcludeCulturalContextTexts();
            case EXCLUDE_GENDERS: return unsetExcludeGenders();
            case EXCLUDE_INSTITUTIONS: return unsetExcludeInstitutions();
            case EXCLUDE_LOCATION_NAME_TEXTS: return unsetExcludeLocationNameTexts();
            case EXCLUDE_MATERIAL_TEXTS: return unsetExcludeMaterialTexts();
            case EXCLUDE_SUBJECT_TERM_TEXTS: return unsetExcludeSubjectTermTexts();
            case EXCLUDE_TECHNIQUE_TEXTS: return unsetExcludeTechniqueTexts();
            case EXCLUDE_WORK_TYPE_TEXTS: return unsetExcludeWorkTypeTexts();
            case INCLUDE_CATEGORIES: return unsetIncludeCategories();
            case INCLUDE_COLLECTIONS: return unsetIncludeCollections();
            case INCLUDE_COLOR_TEXTS: return unsetIncludeColorTexts();
            case INCLUDE_CULTURAL_CONTEXT_TEXTS: return unsetIncludeCulturalContextTexts();
            case INCLUDE_GENDERS: return unsetIncludeGenders();
            case INCLUDE_INSTITUTIONS: return unsetIncludeInstitutions();
            case INCLUDE_LOCATION_NAME_TEXTS: return unsetIncludeLocationNameTexts();
            case INCLUDE_MATERIAL_TEXTS: return unsetIncludeMaterialTexts();
            case INCLUDE_SUBJECT_TERM_TEXTS: return unsetIncludeSubjectTermTexts();
            case INCLUDE_TECHNIQUE_TEXTS: return unsetIncludeTechniqueTexts();
            case INCLUDE_WORK_TYPE_TEXTS: return unsetIncludeWorkTypeTexts();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetExcludeAll() {
            this.excludeAll = com.google.common.base.Optional.<Boolean> absent();
            return this;
        }

        public Builder unsetExcludeCategories() {
            this.excludeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetExcludeCollections() {
            this.excludeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
            return this;
        }

        public Builder unsetExcludeColorTexts() {
            this.excludeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetExcludeCulturalContextTexts() {
            this.excludeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetExcludeGenders() {
            this.excludeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> absent();
            return this;
        }

        public Builder unsetExcludeInstitutions() {
            this.excludeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
            return this;
        }

        public Builder unsetExcludeLocationNameTexts() {
            this.excludeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetExcludeMaterialTexts() {
            this.excludeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetExcludeSubjectTermTexts() {
            this.excludeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetExcludeTechniqueTexts() {
            this.excludeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetExcludeWorkTypeTexts() {
            this.excludeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetIncludeCategories() {
            this.includeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetIncludeCollections() {
            this.includeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
            return this;
        }

        public Builder unsetIncludeColorTexts() {
            this.includeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetIncludeCulturalContextTexts() {
            this.includeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetIncludeGenders() {
            this.includeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> absent();
            return this;
        }

        public Builder unsetIncludeInstitutions() {
            this.includeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
            return this;
        }

        public Builder unsetIncludeLocationNameTexts() {
            this.includeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetIncludeMaterialTexts() {
            this.includeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetIncludeSubjectTermTexts() {
            this.includeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetIncludeTechniqueTexts() {
            this.includeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetIncludeWorkTypeTexts() {
            this.includeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        private com.google.common.base.Optional<Boolean> excludeAll;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ObjectFacetFilters> {
        @Override
        public ObjectFacetFilters readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return ObjectFacetFilters.readAs(iprot, type);
        }

        @Override
        public ObjectFacetFilters readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectFacetFilters.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public ObjectFacetFilters readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectFacetFilters.readAsList(iprot);
        }

        @Override
        public ObjectFacetFilters readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectFacetFilters.readAsStruct(iprot);
        }

        @Override
        public ObjectFacetFilters readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectFacetFilters.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        EXCLUDE_ALL("excludeAll", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 0, "exclude_all", org.thryft.protocol.Type.BOOL),
        EXCLUDE_CATEGORIES("excludeCategories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_categories", org.thryft.protocol.Type.SET),
        EXCLUDE_COLLECTIONS("excludeCollections", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {}, false, 0, "exclude_collections", org.thryft.protocol.Type.SET),
        EXCLUDE_COLOR_TEXTS("excludeColorTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_color_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_CULTURAL_CONTEXT_TEXTS("excludeCulturalContextTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_cultural_context_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_GENDERS("excludeGenders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>>() {}, false, 0, "exclude_genders", org.thryft.protocol.Type.SET),
        EXCLUDE_INSTITUTIONS("excludeInstitutions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {}, false, 0, "exclude_institutions", org.thryft.protocol.Type.SET),
        EXCLUDE_LOCATION_NAME_TEXTS("excludeLocationNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_location_name_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_MATERIAL_TEXTS("excludeMaterialTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_material_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_SUBJECT_TERM_TEXTS("excludeSubjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_subject_term_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_TECHNIQUE_TEXTS("excludeTechniqueTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_technique_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_WORK_TYPE_TEXTS("excludeWorkTypeTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_work_type_texts", org.thryft.protocol.Type.SET),
        INCLUDE_CATEGORIES("includeCategories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_categories", org.thryft.protocol.Type.SET),
        INCLUDE_COLLECTIONS("includeCollections", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {}, false, 0, "include_collections", org.thryft.protocol.Type.SET),
        INCLUDE_COLOR_TEXTS("includeColorTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_color_texts", org.thryft.protocol.Type.SET),
        INCLUDE_CULTURAL_CONTEXT_TEXTS("includeCulturalContextTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_cultural_context_texts", org.thryft.protocol.Type.SET),
        INCLUDE_GENDERS("includeGenders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>>() {}, false, 0, "include_genders", org.thryft.protocol.Type.SET),
        INCLUDE_INSTITUTIONS("includeInstitutions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {}, false, 0, "include_institutions", org.thryft.protocol.Type.SET),
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

    public interface Validator<ExceptionT extends Exception> {
        public com.google.common.base.Optional<Boolean> validateExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> validateExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> validateExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> validateExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> validateIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> validateIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> validateIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) throws ExceptionT;
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
        public com.google.common.base.Optional<Boolean> validateExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) throws RuntimeException {
            if (!excludeAll.isPresent()) {
                return excludeAll;
            }
            if (!excludeAll.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeAll is not true");
            }
            return excludeAll;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) throws RuntimeException {
            if (excludeCategories == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCategories is null");
            }
            if (!excludeCategories.isPresent()) {
                return excludeCategories;
            }
            if (excludeCategories.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCategories is less than min length 1");
            }
            return excludeCategories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> validateExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) throws RuntimeException {
            if (excludeCollections == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCollections is null");
            }
            if (!excludeCollections.isPresent()) {
                return excludeCollections;
            }
            if (excludeCollections.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCollections is less than min length 1");
            }
            return excludeCollections;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) throws RuntimeException {
            if (excludeColorTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeColorTexts is null");
            }
            if (!excludeColorTexts.isPresent()) {
                return excludeColorTexts;
            }
            if (excludeColorTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeColorTexts is less than min length 1");
            }
            return excludeColorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) throws RuntimeException {
            if (excludeCulturalContextTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCulturalContextTexts is null");
            }
            if (!excludeCulturalContextTexts.isPresent()) {
                return excludeCulturalContextTexts;
            }
            if (excludeCulturalContextTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCulturalContextTexts is less than min length 1");
            }
            return excludeCulturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> validateExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders) throws RuntimeException {
            if (excludeGenders == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeGenders is null");
            }
            if (!excludeGenders.isPresent()) {
                return excludeGenders;
            }
            if (excludeGenders.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeGenders is less than min length 1");
            }
            return excludeGenders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> validateExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) throws RuntimeException {
            if (excludeInstitutions == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeInstitutions is null");
            }
            if (!excludeInstitutions.isPresent()) {
                return excludeInstitutions;
            }
            if (excludeInstitutions.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeInstitutions is less than min length 1");
            }
            return excludeInstitutions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) throws RuntimeException {
            if (excludeLocationNameTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeLocationNameTexts is null");
            }
            if (!excludeLocationNameTexts.isPresent()) {
                return excludeLocationNameTexts;
            }
            if (excludeLocationNameTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeLocationNameTexts is less than min length 1");
            }
            return excludeLocationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) throws RuntimeException {
            if (excludeMaterialTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeMaterialTexts is null");
            }
            if (!excludeMaterialTexts.isPresent()) {
                return excludeMaterialTexts;
            }
            if (excludeMaterialTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeMaterialTexts is less than min length 1");
            }
            return excludeMaterialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) throws RuntimeException {
            if (excludeSubjectTermTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeSubjectTermTexts is null");
            }
            if (!excludeSubjectTermTexts.isPresent()) {
                return excludeSubjectTermTexts;
            }
            if (excludeSubjectTermTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeSubjectTermTexts is less than min length 1");
            }
            return excludeSubjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) throws RuntimeException {
            if (excludeTechniqueTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeTechniqueTexts is null");
            }
            if (!excludeTechniqueTexts.isPresent()) {
                return excludeTechniqueTexts;
            }
            if (excludeTechniqueTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeTechniqueTexts is less than min length 1");
            }
            return excludeTechniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) throws RuntimeException {
            if (excludeWorkTypeTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeWorkTypeTexts is null");
            }
            if (!excludeWorkTypeTexts.isPresent()) {
                return excludeWorkTypeTexts;
            }
            if (excludeWorkTypeTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeWorkTypeTexts is less than min length 1");
            }
            return excludeWorkTypeTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) throws RuntimeException {
            if (includeCategories == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCategories is null");
            }
            if (!includeCategories.isPresent()) {
                return includeCategories;
            }
            if (includeCategories.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCategories is less than min length 1");
            }
            return includeCategories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> validateIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) throws RuntimeException {
            if (includeCollections == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCollections is null");
            }
            if (!includeCollections.isPresent()) {
                return includeCollections;
            }
            if (includeCollections.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCollections is less than min length 1");
            }
            return includeCollections;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) throws RuntimeException {
            if (includeColorTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeColorTexts is null");
            }
            if (!includeColorTexts.isPresent()) {
                return includeColorTexts;
            }
            if (includeColorTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeColorTexts is less than min length 1");
            }
            return includeColorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) throws RuntimeException {
            if (includeCulturalContextTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCulturalContextTexts is null");
            }
            if (!includeCulturalContextTexts.isPresent()) {
                return includeCulturalContextTexts;
            }
            if (includeCulturalContextTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCulturalContextTexts is less than min length 1");
            }
            return includeCulturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> validateIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders) throws RuntimeException {
            if (includeGenders == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeGenders is null");
            }
            if (!includeGenders.isPresent()) {
                return includeGenders;
            }
            if (includeGenders.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeGenders is less than min length 1");
            }
            return includeGenders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> validateIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) throws RuntimeException {
            if (includeInstitutions == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeInstitutions is null");
            }
            if (!includeInstitutions.isPresent()) {
                return includeInstitutions;
            }
            if (includeInstitutions.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeInstitutions is less than min length 1");
            }
            return includeInstitutions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) throws RuntimeException {
            if (includeLocationNameTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeLocationNameTexts is null");
            }
            if (!includeLocationNameTexts.isPresent()) {
                return includeLocationNameTexts;
            }
            if (includeLocationNameTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeLocationNameTexts is less than min length 1");
            }
            return includeLocationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) throws RuntimeException {
            if (includeMaterialTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeMaterialTexts is null");
            }
            if (!includeMaterialTexts.isPresent()) {
                return includeMaterialTexts;
            }
            if (includeMaterialTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeMaterialTexts is less than min length 1");
            }
            return includeMaterialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) throws RuntimeException {
            if (includeSubjectTermTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeSubjectTermTexts is null");
            }
            if (!includeSubjectTermTexts.isPresent()) {
                return includeSubjectTermTexts;
            }
            if (includeSubjectTermTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeSubjectTermTexts is less than min length 1");
            }
            return includeSubjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) throws RuntimeException {
            if (includeTechniqueTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeTechniqueTexts is null");
            }
            if (!includeTechniqueTexts.isPresent()) {
                return includeTechniqueTexts;
            }
            if (includeTechniqueTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeTechniqueTexts is less than min length 1");
            }
            return includeTechniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) throws RuntimeException {
            if (includeWorkTypeTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeWorkTypeTexts is null");
            }
            if (!includeWorkTypeTexts.isPresent()) {
                return includeWorkTypeTexts;
            }
            if (includeWorkTypeTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeWorkTypeTexts is less than min length 1");
            }
            return includeWorkTypeTexts;
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
        public com.google.common.base.Optional<Boolean> validateExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) {
            return excludeAll;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
            return excludeCategories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> validateExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) {
            return excludeCollections;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) {
            return excludeColorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) {
            return excludeCulturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> validateExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders) {
            return excludeGenders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> validateExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) {
            return excludeInstitutions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) {
            return excludeLocationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) {
            return excludeMaterialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
            return excludeSubjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) {
            return excludeTechniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) {
            return excludeWorkTypeTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) {
            return includeCategories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> validateIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) {
            return includeCollections;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) {
            return includeColorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) {
            return includeCulturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> validateIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders) {
            return includeGenders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> validateIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) {
            return includeInstitutions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) {
            return includeLocationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) {
            return includeMaterialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
            return includeSubjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) {
            return includeTechniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            return includeWorkTypeTexts;
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
        public com.google.common.base.Optional<Boolean> validateExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) throws org.thryft.protocol.InputProtocolException {
            if (!excludeAll.isPresent()) {
                return excludeAll;
            }
            if (!excludeAll.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_ALL, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeAll is not true");
            }
            return excludeAll;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) throws org.thryft.protocol.InputProtocolException {
            if (excludeCategories == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_CATEGORIES, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCategories is null");
            }
            if (!excludeCategories.isPresent()) {
                return excludeCategories;
            }
            if (excludeCategories.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CATEGORIES, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCategories is less than min length 1");
            }
            return excludeCategories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> validateExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) throws org.thryft.protocol.InputProtocolException {
            if (excludeCollections == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_COLLECTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCollections is null");
            }
            if (!excludeCollections.isPresent()) {
                return excludeCollections;
            }
            if (excludeCollections.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLLECTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCollections is less than min length 1");
            }
            return excludeCollections;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeColorTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeColorTexts is null");
            }
            if (!excludeColorTexts.isPresent()) {
                return excludeColorTexts;
            }
            if (excludeColorTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeColorTexts is less than min length 1");
            }
            return excludeColorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeCulturalContextTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCulturalContextTexts is null");
            }
            if (!excludeCulturalContextTexts.isPresent()) {
                return excludeCulturalContextTexts;
            }
            if (excludeCulturalContextTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCulturalContextTexts is less than min length 1");
            }
            return excludeCulturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> validateExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders) throws org.thryft.protocol.InputProtocolException {
            if (excludeGenders == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_GENDERS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeGenders is null");
            }
            if (!excludeGenders.isPresent()) {
                return excludeGenders;
            }
            if (excludeGenders.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_GENDERS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeGenders is less than min length 1");
            }
            return excludeGenders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> validateExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) throws org.thryft.protocol.InputProtocolException {
            if (excludeInstitutions == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_INSTITUTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeInstitutions is null");
            }
            if (!excludeInstitutions.isPresent()) {
                return excludeInstitutions;
            }
            if (excludeInstitutions.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_INSTITUTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeInstitutions is less than min length 1");
            }
            return excludeInstitutions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeLocationNameTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeLocationNameTexts is null");
            }
            if (!excludeLocationNameTexts.isPresent()) {
                return excludeLocationNameTexts;
            }
            if (excludeLocationNameTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeLocationNameTexts is less than min length 1");
            }
            return excludeLocationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeMaterialTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeMaterialTexts is null");
            }
            if (!excludeMaterialTexts.isPresent()) {
                return excludeMaterialTexts;
            }
            if (excludeMaterialTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeMaterialTexts is less than min length 1");
            }
            return excludeMaterialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeSubjectTermTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeSubjectTermTexts is null");
            }
            if (!excludeSubjectTermTexts.isPresent()) {
                return excludeSubjectTermTexts;
            }
            if (excludeSubjectTermTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeSubjectTermTexts is less than min length 1");
            }
            return excludeSubjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeTechniqueTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeTechniqueTexts is null");
            }
            if (!excludeTechniqueTexts.isPresent()) {
                return excludeTechniqueTexts;
            }
            if (excludeTechniqueTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeTechniqueTexts is less than min length 1");
            }
            return excludeTechniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeWorkTypeTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeWorkTypeTexts is null");
            }
            if (!excludeWorkTypeTexts.isPresent()) {
                return excludeWorkTypeTexts;
            }
            if (excludeWorkTypeTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeWorkTypeTexts is less than min length 1");
            }
            return excludeWorkTypeTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) throws org.thryft.protocol.InputProtocolException {
            if (includeCategories == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_CATEGORIES, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCategories is null");
            }
            if (!includeCategories.isPresent()) {
                return includeCategories;
            }
            if (includeCategories.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CATEGORIES, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCategories is less than min length 1");
            }
            return includeCategories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> validateIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) throws org.thryft.protocol.InputProtocolException {
            if (includeCollections == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_COLLECTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCollections is null");
            }
            if (!includeCollections.isPresent()) {
                return includeCollections;
            }
            if (includeCollections.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLLECTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCollections is less than min length 1");
            }
            return includeCollections;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeColorTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeColorTexts is null");
            }
            if (!includeColorTexts.isPresent()) {
                return includeColorTexts;
            }
            if (includeColorTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeColorTexts is less than min length 1");
            }
            return includeColorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeCulturalContextTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCulturalContextTexts is null");
            }
            if (!includeCulturalContextTexts.isPresent()) {
                return includeCulturalContextTexts;
            }
            if (includeCulturalContextTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCulturalContextTexts is less than min length 1");
            }
            return includeCulturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> validateIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders) throws org.thryft.protocol.InputProtocolException {
            if (includeGenders == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_GENDERS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeGenders is null");
            }
            if (!includeGenders.isPresent()) {
                return includeGenders;
            }
            if (includeGenders.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_GENDERS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeGenders is less than min length 1");
            }
            return includeGenders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> validateIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) throws org.thryft.protocol.InputProtocolException {
            if (includeInstitutions == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_INSTITUTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeInstitutions is null");
            }
            if (!includeInstitutions.isPresent()) {
                return includeInstitutions;
            }
            if (includeInstitutions.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_INSTITUTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeInstitutions is less than min length 1");
            }
            return includeInstitutions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeLocationNameTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeLocationNameTexts is null");
            }
            if (!includeLocationNameTexts.isPresent()) {
                return includeLocationNameTexts;
            }
            if (includeLocationNameTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeLocationNameTexts is less than min length 1");
            }
            return includeLocationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeMaterialTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeMaterialTexts is null");
            }
            if (!includeMaterialTexts.isPresent()) {
                return includeMaterialTexts;
            }
            if (includeMaterialTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeMaterialTexts is less than min length 1");
            }
            return includeMaterialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeSubjectTermTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeSubjectTermTexts is null");
            }
            if (!includeSubjectTermTexts.isPresent()) {
                return includeSubjectTermTexts;
            }
            if (includeSubjectTermTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeSubjectTermTexts is less than min length 1");
            }
            return includeSubjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeTechniqueTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeTechniqueTexts is null");
            }
            if (!includeTechniqueTexts.isPresent()) {
                return includeTechniqueTexts;
            }
            if (includeTechniqueTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeTechniqueTexts is less than min length 1");
            }
            return includeTechniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeWorkTypeTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeWorkTypeTexts is null");
            }
            if (!includeWorkTypeTexts.isPresent()) {
                return includeWorkTypeTexts;
            }
            if (includeWorkTypeTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeWorkTypeTexts is less than min length 1");
            }
            return includeWorkTypeTexts;
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
        public com.google.common.base.Optional<Boolean> validateExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) {
            return excludeAll;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
            return excludeCategories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> validateExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) {
            return excludeCollections;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) {
            return excludeColorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) {
            return excludeCulturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> validateExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders) {
            return excludeGenders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> validateExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) {
            return excludeInstitutions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) {
            return excludeLocationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) {
            return excludeMaterialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
            return excludeSubjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) {
            return excludeTechniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) {
            return excludeWorkTypeTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) {
            return includeCategories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> validateIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) {
            return includeCollections;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) {
            return includeColorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) {
            return includeCulturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> validateIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders) {
            return includeGenders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> validateIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) {
            return includeInstitutions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) {
            return includeLocationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) {
            return includeMaterialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
            return includeSubjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) {
            return includeTechniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> validateIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            return includeWorkTypeTexts;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
    public ObjectFacetFilters() {
        excludeAll = com.google.common.base.Optional.<Boolean> absent();
        excludeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        excludeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
        excludeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        excludeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        excludeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> absent();
        excludeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
        excludeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        excludeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        excludeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        excludeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        excludeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        includeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        includeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
        includeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        includeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        includeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> absent();
        includeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
        includeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        includeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        includeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        includeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        includeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
    }

    /**
     * Copy constructor
     */
    public ObjectFacetFilters(final ObjectFacetFilters other) {
        this(other.getExcludeAll(), other.getExcludeCategories(), other.getExcludeCollections(), other.getExcludeColorTexts(), other.getExcludeCulturalContextTexts(), other.getExcludeGenders(), other.getExcludeInstitutions(), other.getExcludeLocationNameTexts(), other.getExcludeMaterialTexts(), other.getExcludeSubjectTermTexts(), other.getExcludeTechniqueTexts(), other.getExcludeWorkTypeTexts(), other.getIncludeCategories(), other.getIncludeCollections(), other.getIncludeColorTexts(), other.getIncludeCulturalContextTexts(), other.getIncludeGenders(), other.getIncludeInstitutions(), other.getIncludeLocationNameTexts(), other.getIncludeMaterialTexts(), other.getIncludeSubjectTermTexts(), other.getIncludeTechniqueTexts(), other.getIncludeWorkTypeTexts(), NopConstructionValidator.getInstance());
    }

    protected ObjectFacetFilters(final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts, ConstructionValidator validator) {
        this.excludeAll = validator.validateExcludeAll(excludeAll);
        this.excludeCategories = validator.validateExcludeCategories(excludeCategories);
        this.excludeCollections = validator.validateExcludeCollections(excludeCollections);
        this.excludeColorTexts = validator.validateExcludeColorTexts(excludeColorTexts);
        this.excludeCulturalContextTexts = validator.validateExcludeCulturalContextTexts(excludeCulturalContextTexts);
        this.excludeGenders = validator.validateExcludeGenders(excludeGenders);
        this.excludeInstitutions = validator.validateExcludeInstitutions(excludeInstitutions);
        this.excludeLocationNameTexts = validator.validateExcludeLocationNameTexts(excludeLocationNameTexts);
        this.excludeMaterialTexts = validator.validateExcludeMaterialTexts(excludeMaterialTexts);
        this.excludeSubjectTermTexts = validator.validateExcludeSubjectTermTexts(excludeSubjectTermTexts);
        this.excludeTechniqueTexts = validator.validateExcludeTechniqueTexts(excludeTechniqueTexts);
        this.excludeWorkTypeTexts = validator.validateExcludeWorkTypeTexts(excludeWorkTypeTexts);
        this.includeCategories = validator.validateIncludeCategories(includeCategories);
        this.includeCollections = validator.validateIncludeCollections(includeCollections);
        this.includeColorTexts = validator.validateIncludeColorTexts(includeColorTexts);
        this.includeCulturalContextTexts = validator.validateIncludeCulturalContextTexts(includeCulturalContextTexts);
        this.includeGenders = validator.validateIncludeGenders(includeGenders);
        this.includeInstitutions = validator.validateIncludeInstitutions(includeInstitutions);
        this.includeLocationNameTexts = validator.validateIncludeLocationNameTexts(includeLocationNameTexts);
        this.includeMaterialTexts = validator.validateIncludeMaterialTexts(includeMaterialTexts);
        this.includeSubjectTermTexts = validator.validateIncludeSubjectTermTexts(includeSubjectTermTexts);
        this.includeTechniqueTexts = validator.validateIncludeTechniqueTexts(includeTechniqueTexts);
        this.includeWorkTypeTexts = validator.validateIncludeWorkTypeTexts(includeWorkTypeTexts);
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

    public static ObjectFacetFilters create() {
        return new ObjectFacetFilters();
    }

    /**
     * Total Nullable factory method
     */
    public static ObjectFacetFilters create(final @javax.annotation.Nullable Boolean excludeAll, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeCategories, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> excludeCollections, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeColorTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeCulturalContextTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> excludeGenders, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> excludeInstitutions, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeLocationNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeMaterialTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeCategories, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> includeCollections, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeColorTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeCulturalContextTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> includeGenders, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> includeInstitutions, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeLocationNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeMaterialTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeTechniqueTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeWorkTypeTexts) {
        return new ObjectFacetFilters(com.google.common.base.Optional.fromNullable(excludeAll), com.google.common.base.Optional.fromNullable(excludeCategories), com.google.common.base.Optional.fromNullable(excludeCollections), com.google.common.base.Optional.fromNullable(excludeColorTexts), com.google.common.base.Optional.fromNullable(excludeCulturalContextTexts), com.google.common.base.Optional.fromNullable(excludeGenders), com.google.common.base.Optional.fromNullable(excludeInstitutions), com.google.common.base.Optional.fromNullable(excludeLocationNameTexts), com.google.common.base.Optional.fromNullable(excludeMaterialTexts), com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts), com.google.common.base.Optional.fromNullable(excludeTechniqueTexts), com.google.common.base.Optional.fromNullable(excludeWorkTypeTexts), com.google.common.base.Optional.fromNullable(includeCategories), com.google.common.base.Optional.fromNullable(includeCollections), com.google.common.base.Optional.fromNullable(includeColorTexts), com.google.common.base.Optional.fromNullable(includeCulturalContextTexts), com.google.common.base.Optional.fromNullable(includeGenders), com.google.common.base.Optional.fromNullable(includeInstitutions), com.google.common.base.Optional.fromNullable(includeLocationNameTexts), com.google.common.base.Optional.fromNullable(includeMaterialTexts), com.google.common.base.Optional.fromNullable(includeSubjectTermTexts), com.google.common.base.Optional.fromNullable(includeTechniqueTexts), com.google.common.base.Optional.fromNullable(includeWorkTypeTexts), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static ObjectFacetFilters create(final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
        return new ObjectFacetFilters(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts, DefaultConstructionValidator.getInstance());
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
            ((getExcludeAll().isPresent() && other.getExcludeAll().isPresent()) ? (getExcludeAll().get() == other.getExcludeAll().get()) : (!getExcludeAll().isPresent() && !other.getExcludeAll().isPresent())) &&
            ((getExcludeCategories().isPresent() && other.getExcludeCategories().isPresent()) ? (getExcludeCategories().get().equals(other.getExcludeCategories().get())) : (!getExcludeCategories().isPresent() && !other.getExcludeCategories().isPresent())) &&
            ((getExcludeCollections().isPresent() && other.getExcludeCollections().isPresent()) ? (getExcludeCollections().get().equals(other.getExcludeCollections().get())) : (!getExcludeCollections().isPresent() && !other.getExcludeCollections().isPresent())) &&
            ((getExcludeColorTexts().isPresent() && other.getExcludeColorTexts().isPresent()) ? (getExcludeColorTexts().get().equals(other.getExcludeColorTexts().get())) : (!getExcludeColorTexts().isPresent() && !other.getExcludeColorTexts().isPresent())) &&
            ((getExcludeCulturalContextTexts().isPresent() && other.getExcludeCulturalContextTexts().isPresent()) ? (getExcludeCulturalContextTexts().get().equals(other.getExcludeCulturalContextTexts().get())) : (!getExcludeCulturalContextTexts().isPresent() && !other.getExcludeCulturalContextTexts().isPresent())) &&
            ((getExcludeGenders().isPresent() && other.getExcludeGenders().isPresent()) ? (getExcludeGenders().get().equals(other.getExcludeGenders().get())) : (!getExcludeGenders().isPresent() && !other.getExcludeGenders().isPresent())) &&
            ((getExcludeInstitutions().isPresent() && other.getExcludeInstitutions().isPresent()) ? (getExcludeInstitutions().get().equals(other.getExcludeInstitutions().get())) : (!getExcludeInstitutions().isPresent() && !other.getExcludeInstitutions().isPresent())) &&
            ((getExcludeLocationNameTexts().isPresent() && other.getExcludeLocationNameTexts().isPresent()) ? (getExcludeLocationNameTexts().get().equals(other.getExcludeLocationNameTexts().get())) : (!getExcludeLocationNameTexts().isPresent() && !other.getExcludeLocationNameTexts().isPresent())) &&
            ((getExcludeMaterialTexts().isPresent() && other.getExcludeMaterialTexts().isPresent()) ? (getExcludeMaterialTexts().get().equals(other.getExcludeMaterialTexts().get())) : (!getExcludeMaterialTexts().isPresent() && !other.getExcludeMaterialTexts().isPresent())) &&
            ((getExcludeSubjectTermTexts().isPresent() && other.getExcludeSubjectTermTexts().isPresent()) ? (getExcludeSubjectTermTexts().get().equals(other.getExcludeSubjectTermTexts().get())) : (!getExcludeSubjectTermTexts().isPresent() && !other.getExcludeSubjectTermTexts().isPresent())) &&
            ((getExcludeTechniqueTexts().isPresent() && other.getExcludeTechniqueTexts().isPresent()) ? (getExcludeTechniqueTexts().get().equals(other.getExcludeTechniqueTexts().get())) : (!getExcludeTechniqueTexts().isPresent() && !other.getExcludeTechniqueTexts().isPresent())) &&
            ((getExcludeWorkTypeTexts().isPresent() && other.getExcludeWorkTypeTexts().isPresent()) ? (getExcludeWorkTypeTexts().get().equals(other.getExcludeWorkTypeTexts().get())) : (!getExcludeWorkTypeTexts().isPresent() && !other.getExcludeWorkTypeTexts().isPresent())) &&
            ((getIncludeCategories().isPresent() && other.getIncludeCategories().isPresent()) ? (getIncludeCategories().get().equals(other.getIncludeCategories().get())) : (!getIncludeCategories().isPresent() && !other.getIncludeCategories().isPresent())) &&
            ((getIncludeCollections().isPresent() && other.getIncludeCollections().isPresent()) ? (getIncludeCollections().get().equals(other.getIncludeCollections().get())) : (!getIncludeCollections().isPresent() && !other.getIncludeCollections().isPresent())) &&
            ((getIncludeColorTexts().isPresent() && other.getIncludeColorTexts().isPresent()) ? (getIncludeColorTexts().get().equals(other.getIncludeColorTexts().get())) : (!getIncludeColorTexts().isPresent() && !other.getIncludeColorTexts().isPresent())) &&
            ((getIncludeCulturalContextTexts().isPresent() && other.getIncludeCulturalContextTexts().isPresent()) ? (getIncludeCulturalContextTexts().get().equals(other.getIncludeCulturalContextTexts().get())) : (!getIncludeCulturalContextTexts().isPresent() && !other.getIncludeCulturalContextTexts().isPresent())) &&
            ((getIncludeGenders().isPresent() && other.getIncludeGenders().isPresent()) ? (getIncludeGenders().get().equals(other.getIncludeGenders().get())) : (!getIncludeGenders().isPresent() && !other.getIncludeGenders().isPresent())) &&
            ((getIncludeInstitutions().isPresent() && other.getIncludeInstitutions().isPresent()) ? (getIncludeInstitutions().get().equals(other.getIncludeInstitutions().get())) : (!getIncludeInstitutions().isPresent() && !other.getIncludeInstitutions().isPresent())) &&
            ((getIncludeLocationNameTexts().isPresent() && other.getIncludeLocationNameTexts().isPresent()) ? (getIncludeLocationNameTexts().get().equals(other.getIncludeLocationNameTexts().get())) : (!getIncludeLocationNameTexts().isPresent() && !other.getIncludeLocationNameTexts().isPresent())) &&
            ((getIncludeMaterialTexts().isPresent() && other.getIncludeMaterialTexts().isPresent()) ? (getIncludeMaterialTexts().get().equals(other.getIncludeMaterialTexts().get())) : (!getIncludeMaterialTexts().isPresent() && !other.getIncludeMaterialTexts().isPresent())) &&
            ((getIncludeSubjectTermTexts().isPresent() && other.getIncludeSubjectTermTexts().isPresent()) ? (getIncludeSubjectTermTexts().get().equals(other.getIncludeSubjectTermTexts().get())) : (!getIncludeSubjectTermTexts().isPresent() && !other.getIncludeSubjectTermTexts().isPresent())) &&
            ((getIncludeTechniqueTexts().isPresent() && other.getIncludeTechniqueTexts().isPresent()) ? (getIncludeTechniqueTexts().get().equals(other.getIncludeTechniqueTexts().get())) : (!getIncludeTechniqueTexts().isPresent() && !other.getIncludeTechniqueTexts().isPresent())) &&
            ((getIncludeWorkTypeTexts().isPresent() && other.getIncludeWorkTypeTexts().isPresent()) ? (getIncludeWorkTypeTexts().get().equals(other.getIncludeWorkTypeTexts().get())) : (!getIncludeWorkTypeTexts().isPresent() && !other.getIncludeWorkTypeTexts().isPresent()));
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

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> getExcludeCollections() {
        return excludeCollections;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeColorTexts() {
        return excludeColorTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeCulturalContextTexts() {
        return excludeCulturalContextTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> getExcludeGenders() {
        return excludeGenders;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> getExcludeInstitutions() {
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

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> getIncludeCollections() {
        return includeCollections;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeColorTexts() {
        return includeColorTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeCulturalContextTexts() {
        return includeCulturalContextTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> getIncludeGenders() {
        return includeGenders;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> getIncludeInstitutions() {
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

    public static ObjectFacetFilters readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectFacetFilters readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectFacetFilters readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<Boolean> excludeAll = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();

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
                 throw e.getCause();
            }
        }
        if (__list.getSize() > 2) {
            try {
                excludeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
            }
        }
        if (__list.getSize() > 5) {
            try {
                excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
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
                 throw e.getCause();
            }
        }
        if (__list.getSize() > 6) {
            try {
                excludeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
            }
        }
        if (__list.getSize() > 13) {
            try {
                includeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
            }
        }
        if (__list.getSize() > 16) {
            try {
                includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                                } catch (final IllegalArgumentException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
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
                 throw e.getCause();
            }
        }
        if (__list.getSize() > 17) {
            try {
                includeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequenceBuilder.add(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
            }
        }
        iprot.readListEnd();
        return new ObjectFacetFilters(DefaultReadValidator.getInstance().validateExcludeAll(excludeAll), DefaultReadValidator.getInstance().validateExcludeCategories(excludeCategories), DefaultReadValidator.getInstance().validateExcludeCollections(excludeCollections), DefaultReadValidator.getInstance().validateExcludeColorTexts(excludeColorTexts), DefaultReadValidator.getInstance().validateExcludeCulturalContextTexts(excludeCulturalContextTexts), DefaultReadValidator.getInstance().validateExcludeGenders(excludeGenders), DefaultReadValidator.getInstance().validateExcludeInstitutions(excludeInstitutions), DefaultReadValidator.getInstance().validateExcludeLocationNameTexts(excludeLocationNameTexts), DefaultReadValidator.getInstance().validateExcludeMaterialTexts(excludeMaterialTexts), DefaultReadValidator.getInstance().validateExcludeSubjectTermTexts(excludeSubjectTermTexts), DefaultReadValidator.getInstance().validateExcludeTechniqueTexts(excludeTechniqueTexts), DefaultReadValidator.getInstance().validateExcludeWorkTypeTexts(excludeWorkTypeTexts), DefaultReadValidator.getInstance().validateIncludeCategories(includeCategories), DefaultReadValidator.getInstance().validateIncludeCollections(includeCollections), DefaultReadValidator.getInstance().validateIncludeColorTexts(includeColorTexts), DefaultReadValidator.getInstance().validateIncludeCulturalContextTexts(includeCulturalContextTexts), DefaultReadValidator.getInstance().validateIncludeGenders(includeGenders), DefaultReadValidator.getInstance().validateIncludeInstitutions(includeInstitutions), DefaultReadValidator.getInstance().validateIncludeLocationNameTexts(includeLocationNameTexts), DefaultReadValidator.getInstance().validateIncludeMaterialTexts(includeMaterialTexts), DefaultReadValidator.getInstance().validateIncludeSubjectTermTexts(includeSubjectTermTexts), DefaultReadValidator.getInstance().validateIncludeTechniqueTexts(includeTechniqueTexts), DefaultReadValidator.getInstance().validateIncludeWorkTypeTexts(includeWorkTypeTexts), NopConstructionValidator.getInstance());
    }

    public static ObjectFacetFilters readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectFacetFilters readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<Boolean> excludeAll = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();

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
                     throw e.getCause();
                }
                break;
            }
            case "exclude_collections": {
                try {
                    excludeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
                }
                break;
            }
            case "exclude_genders": {
                try {
                    excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
                }
                break;
            }
            case "exclude_institutions": {
                try {
                    excludeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
                }
                break;
            }
            case "include_collections": {
                try {
                    includeCollections = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.collection.CollectionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
                }
                break;
            }
            case "include_genders": {
                try {
                    includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                                    } catch (final IllegalArgumentException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
                }
                break;
            }
            case "include_institutions": {
                try {
                    includeInstitutions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.institution.InstitutionId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
        return new ObjectFacetFilters(DefaultReadValidator.getInstance().validateExcludeAll(excludeAll), DefaultReadValidator.getInstance().validateExcludeCategories(excludeCategories), DefaultReadValidator.getInstance().validateExcludeCollections(excludeCollections), DefaultReadValidator.getInstance().validateExcludeColorTexts(excludeColorTexts), DefaultReadValidator.getInstance().validateExcludeCulturalContextTexts(excludeCulturalContextTexts), DefaultReadValidator.getInstance().validateExcludeGenders(excludeGenders), DefaultReadValidator.getInstance().validateExcludeInstitutions(excludeInstitutions), DefaultReadValidator.getInstance().validateExcludeLocationNameTexts(excludeLocationNameTexts), DefaultReadValidator.getInstance().validateExcludeMaterialTexts(excludeMaterialTexts), DefaultReadValidator.getInstance().validateExcludeSubjectTermTexts(excludeSubjectTermTexts), DefaultReadValidator.getInstance().validateExcludeTechniqueTexts(excludeTechniqueTexts), DefaultReadValidator.getInstance().validateExcludeWorkTypeTexts(excludeWorkTypeTexts), DefaultReadValidator.getInstance().validateIncludeCategories(includeCategories), DefaultReadValidator.getInstance().validateIncludeCollections(includeCollections), DefaultReadValidator.getInstance().validateIncludeColorTexts(includeColorTexts), DefaultReadValidator.getInstance().validateIncludeCulturalContextTexts(includeCulturalContextTexts), DefaultReadValidator.getInstance().validateIncludeGenders(includeGenders), DefaultReadValidator.getInstance().validateIncludeInstitutions(includeInstitutions), DefaultReadValidator.getInstance().validateIncludeLocationNameTexts(includeLocationNameTexts), DefaultReadValidator.getInstance().validateIncludeMaterialTexts(includeMaterialTexts), DefaultReadValidator.getInstance().validateIncludeSubjectTermTexts(includeSubjectTermTexts), DefaultReadValidator.getInstance().validateIncludeTechniqueTexts(includeTechniqueTexts), DefaultReadValidator.getInstance().validateIncludeWorkTypeTexts(includeWorkTypeTexts), NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) {
        return new ObjectFacetFilters(DefaultConstructionValidator.getInstance().validateExcludeAll(excludeAll), this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeAll(final boolean excludeAll) {
        return replaceExcludeAll(com.google.common.base.Optional.fromNullable(excludeAll));
    }

    public ObjectFacetFilters replaceExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
        return new ObjectFacetFilters(this.excludeAll, DefaultConstructionValidator.getInstance().validateExcludeCategories(excludeCategories), this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeCategories(final com.google.common.collect.ImmutableSet<String> excludeCategories) {
        return replaceExcludeCategories(com.google.common.base.Optional.fromNullable(excludeCategories));
    }

    public ObjectFacetFilters replaceExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, DefaultConstructionValidator.getInstance().validateExcludeCollections(excludeCollections), this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeCollections(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> excludeCollections) {
        return replaceExcludeCollections(com.google.common.base.Optional.fromNullable(excludeCollections));
    }

    public ObjectFacetFilters replaceExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, DefaultConstructionValidator.getInstance().validateExcludeColorTexts(excludeColorTexts), this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeColorTexts(final com.google.common.collect.ImmutableSet<String> excludeColorTexts) {
        return replaceExcludeColorTexts(com.google.common.base.Optional.fromNullable(excludeColorTexts));
    }

    public ObjectFacetFilters replaceExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, DefaultConstructionValidator.getInstance().validateExcludeCulturalContextTexts(excludeCulturalContextTexts), this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeCulturalContextTexts(final com.google.common.collect.ImmutableSet<String> excludeCulturalContextTexts) {
        return replaceExcludeCulturalContextTexts(com.google.common.base.Optional.fromNullable(excludeCulturalContextTexts));
    }

    public ObjectFacetFilters replaceExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, DefaultConstructionValidator.getInstance().validateExcludeGenders(excludeGenders), this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeGenders(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> excludeGenders) {
        return replaceExcludeGenders(com.google.common.base.Optional.fromNullable(excludeGenders));
    }

    public ObjectFacetFilters replaceExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, DefaultConstructionValidator.getInstance().validateExcludeInstitutions(excludeInstitutions), this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeInstitutions(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> excludeInstitutions) {
        return replaceExcludeInstitutions(com.google.common.base.Optional.fromNullable(excludeInstitutions));
    }

    public ObjectFacetFilters replaceExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, DefaultConstructionValidator.getInstance().validateExcludeLocationNameTexts(excludeLocationNameTexts), this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeLocationNameTexts(final com.google.common.collect.ImmutableSet<String> excludeLocationNameTexts) {
        return replaceExcludeLocationNameTexts(com.google.common.base.Optional.fromNullable(excludeLocationNameTexts));
    }

    public ObjectFacetFilters replaceExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, DefaultConstructionValidator.getInstance().validateExcludeMaterialTexts(excludeMaterialTexts), this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeMaterialTexts(final com.google.common.collect.ImmutableSet<String> excludeMaterialTexts) {
        return replaceExcludeMaterialTexts(com.google.common.base.Optional.fromNullable(excludeMaterialTexts));
    }

    public ObjectFacetFilters replaceExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, DefaultConstructionValidator.getInstance().validateExcludeSubjectTermTexts(excludeSubjectTermTexts), this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeSubjectTermTexts(final com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts) {
        return replaceExcludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts));
    }

    public ObjectFacetFilters replaceExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, DefaultConstructionValidator.getInstance().validateExcludeTechniqueTexts(excludeTechniqueTexts), this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeTechniqueTexts(final com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts) {
        return replaceExcludeTechniqueTexts(com.google.common.base.Optional.fromNullable(excludeTechniqueTexts));
    }

    public ObjectFacetFilters replaceExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, DefaultConstructionValidator.getInstance().validateExcludeWorkTypeTexts(excludeWorkTypeTexts), this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceExcludeWorkTypeTexts(final com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts) {
        return replaceExcludeWorkTypeTexts(com.google.common.base.Optional.fromNullable(excludeWorkTypeTexts));
    }

    public ObjectFacetFilters replaceIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, DefaultConstructionValidator.getInstance().validateIncludeCategories(includeCategories), this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceIncludeCategories(final com.google.common.collect.ImmutableSet<String> includeCategories) {
        return replaceIncludeCategories(com.google.common.base.Optional.fromNullable(includeCategories));
    }

    public ObjectFacetFilters replaceIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, DefaultConstructionValidator.getInstance().validateIncludeCollections(includeCollections), this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceIncludeCollections(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> includeCollections) {
        return replaceIncludeCollections(com.google.common.base.Optional.fromNullable(includeCollections));
    }

    public ObjectFacetFilters replaceIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, DefaultConstructionValidator.getInstance().validateIncludeColorTexts(includeColorTexts), this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceIncludeColorTexts(final com.google.common.collect.ImmutableSet<String> includeColorTexts) {
        return replaceIncludeColorTexts(com.google.common.base.Optional.fromNullable(includeColorTexts));
    }

    public ObjectFacetFilters replaceIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, DefaultConstructionValidator.getInstance().validateIncludeCulturalContextTexts(includeCulturalContextTexts), this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceIncludeCulturalContextTexts(final com.google.common.collect.ImmutableSet<String> includeCulturalContextTexts) {
        return replaceIncludeCulturalContextTexts(com.google.common.base.Optional.fromNullable(includeCulturalContextTexts));
    }

    public ObjectFacetFilters replaceIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, DefaultConstructionValidator.getInstance().validateIncludeGenders(includeGenders), this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceIncludeGenders(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender> includeGenders) {
        return replaceIncludeGenders(com.google.common.base.Optional.fromNullable(includeGenders));
    }

    public ObjectFacetFilters replaceIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, DefaultConstructionValidator.getInstance().validateIncludeInstitutions(includeInstitutions), this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceIncludeInstitutions(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> includeInstitutions) {
        return replaceIncludeInstitutions(com.google.common.base.Optional.fromNullable(includeInstitutions));
    }

    public ObjectFacetFilters replaceIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, DefaultConstructionValidator.getInstance().validateIncludeLocationNameTexts(includeLocationNameTexts), this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceIncludeLocationNameTexts(final com.google.common.collect.ImmutableSet<String> includeLocationNameTexts) {
        return replaceIncludeLocationNameTexts(com.google.common.base.Optional.fromNullable(includeLocationNameTexts));
    }

    public ObjectFacetFilters replaceIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, DefaultConstructionValidator.getInstance().validateIncludeMaterialTexts(includeMaterialTexts), this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceIncludeMaterialTexts(final com.google.common.collect.ImmutableSet<String> includeMaterialTexts) {
        return replaceIncludeMaterialTexts(com.google.common.base.Optional.fromNullable(includeMaterialTexts));
    }

    public ObjectFacetFilters replaceIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, DefaultConstructionValidator.getInstance().validateIncludeSubjectTermTexts(includeSubjectTermTexts), this.includeTechniqueTexts, this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceIncludeSubjectTermTexts(final com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts) {
        return replaceIncludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(includeSubjectTermTexts));
    }

    public ObjectFacetFilters replaceIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, DefaultConstructionValidator.getInstance().validateIncludeTechniqueTexts(includeTechniqueTexts), this.includeWorkTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacetFilters replaceIncludeTechniqueTexts(final com.google.common.collect.ImmutableSet<String> includeTechniqueTexts) {
        return replaceIncludeTechniqueTexts(com.google.common.base.Optional.fromNullable(includeTechniqueTexts));
    }

    public ObjectFacetFilters replaceIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, DefaultConstructionValidator.getInstance().validateIncludeWorkTypeTexts(includeWorkTypeTexts), NopConstructionValidator.getInstance());
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
            for (final org.dressdiscover.api.models.collection.CollectionId _iter0 : getExcludeCollections().get()) {
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
            for (final org.dressdiscover.api.models.gender.Gender _iter0 : getExcludeGenders().get()) {
                oprot.writeEnum(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeInstitutions().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeInstitutions().get().size());
            for (final org.dressdiscover.api.models.institution.InstitutionId _iter0 : getExcludeInstitutions().get()) {
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
            for (final org.dressdiscover.api.models.collection.CollectionId _iter0 : getIncludeCollections().get()) {
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
            for (final org.dressdiscover.api.models.gender.Gender _iter0 : getIncludeGenders().get()) {
                oprot.writeEnum(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeInstitutions().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeInstitutions().get().size());
            for (final org.dressdiscover.api.models.institution.InstitutionId _iter0 : getIncludeInstitutions().get()) {
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
        oprot.writeStructBegin("org.dressdiscover.api.models.object.ObjectFacetFilters");
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
            for (final org.dressdiscover.api.models.collection.CollectionId _iter0 : getExcludeCollections().get()) {
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
            for (final org.dressdiscover.api.models.gender.Gender _iter0 : getExcludeGenders().get()) {
                oprot.writeEnum(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeInstitutions().isPresent()) {
            oprot.writeFieldBegin("exclude_institutions", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeInstitutions().get().size());
            for (final org.dressdiscover.api.models.institution.InstitutionId _iter0 : getExcludeInstitutions().get()) {
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
            for (final org.dressdiscover.api.models.collection.CollectionId _iter0 : getIncludeCollections().get()) {
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
            for (final org.dressdiscover.api.models.gender.Gender _iter0 : getIncludeGenders().get()) {
                oprot.writeEnum(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeInstitutions().isPresent()) {
            oprot.writeFieldBegin("include_institutions", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeInstitutions().get().size());
            for (final org.dressdiscover.api.models.institution.InstitutionId _iter0 : getIncludeInstitutions().get()) {
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

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> excludeGenders;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.gender.Gender>> includeGenders;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts;
}
