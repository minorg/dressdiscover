package org.dressdiscover.api.models.object;

public final class ObjectFacetFilters implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            excludeAll = com.google.common.base.Optional.<Boolean> absent();
            excludeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            excludeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
            excludeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            excludeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            excludeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> absent();
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
            includeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> absent();
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

        protected ObjectFacetFilters _build(final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            return new ObjectFacetFilters(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
        }

        public ObjectFacetFilters build() {
            UncheckedValidator.validate(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);

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

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> getExcludeGenders() {
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

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> getIncludeGenders() {
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
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    excludeAll = org.thryft.Optionals.of(iprot.readBool());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CATEGORIES, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLLECTIONS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLOR_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CULTURAL_CONTEXT_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 5) {
                    try {
                        excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_GENDERS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_INSTITUTIONS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_LOCATION_NAME_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_MATERIAL_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_SUBJECT_TERM_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_TECHNIQUE_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_WORK_TYPE_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CATEGORIES, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLLECTIONS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLOR_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CULTURAL_CONTEXT_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 16) {
                    try {
                        includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_GENDERS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_INSTITUTIONS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_LOCATION_NAME_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_MATERIAL_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_SUBJECT_TERM_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_TECHNIQUE_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_WORK_TYPE_TEXTS, e.getCause());
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
                    case "exclude_all": {
                        excludeAll = org.thryft.Optionals.of(iprot.readBool());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CATEGORIES, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLLECTIONS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLOR_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CULTURAL_CONTEXT_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "exclude_genders": {
                        try {
                            excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>>() {
                                @Override
                                public com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                        final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                                        }
                                        iprot.readSetEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_GENDERS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_INSTITUTIONS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_LOCATION_NAME_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_MATERIAL_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_SUBJECT_TERM_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_TECHNIQUE_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_WORK_TYPE_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CATEGORIES, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLLECTIONS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLOR_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CULTURAL_CONTEXT_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "include_genders": {
                        try {
                            includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>>() {
                                @Override
                                public com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                        final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                                        }
                                        iprot.readSetEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_GENDERS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_INSTITUTIONS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_LOCATION_NAME_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_MATERIAL_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_SUBJECT_TERM_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_TECHNIQUE_TEXTS, e.getCause());
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_WORK_TYPE_TEXTS, e.getCause());
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
            case EXCLUDE_ALL: setExcludeAll((Boolean)value); return this;
            case EXCLUDE_CATEGORIES: setExcludeCategories((com.google.common.collect.ImmutableSet<String>)value); return this;
            case EXCLUDE_COLLECTIONS: setExcludeCollections((com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>)value); return this;
            case EXCLUDE_COLOR_TEXTS: setExcludeColorTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case EXCLUDE_CULTURAL_CONTEXT_TEXTS: setExcludeCulturalContextTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case EXCLUDE_GENDERS: setExcludeGenders((com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>)value); return this;
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
            case INCLUDE_GENDERS: setIncludeGenders((com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>)value); return this;
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
            UncheckedValidator.validateExcludeAll(excludeAll);
            this.excludeAll = excludeAll;
            return this;
        }

        public Builder setExcludeAll(final @javax.annotation.Nullable Boolean excludeAll) {
            return setExcludeAll(org.thryft.Optionals.fromNullable(excludeAll));
        }

        public Builder setExcludeAll(final boolean excludeAll) {
            return setExcludeAll(org.thryft.Optionals.of(excludeAll));
        }

        public Builder setExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
            UncheckedValidator.validateExcludeCategories(excludeCategories);
            this.excludeCategories = excludeCategories;
            return this;
        }

        public Builder setExcludeCategories(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeCategories) {
            return setExcludeCategories(com.google.common.base.Optional.fromNullable(excludeCategories));
        }

        public Builder setExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) {
            UncheckedValidator.validateExcludeCollections(excludeCollections);
            this.excludeCollections = excludeCollections;
            return this;
        }

        public Builder setExcludeCollections(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> excludeCollections) {
            return setExcludeCollections(com.google.common.base.Optional.fromNullable(excludeCollections));
        }

        public Builder setExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) {
            UncheckedValidator.validateExcludeColorTexts(excludeColorTexts);
            this.excludeColorTexts = excludeColorTexts;
            return this;
        }

        public Builder setExcludeColorTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeColorTexts) {
            return setExcludeColorTexts(com.google.common.base.Optional.fromNullable(excludeColorTexts));
        }

        public Builder setExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) {
            UncheckedValidator.validateExcludeCulturalContextTexts(excludeCulturalContextTexts);
            this.excludeCulturalContextTexts = excludeCulturalContextTexts;
            return this;
        }

        public Builder setExcludeCulturalContextTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeCulturalContextTexts) {
            return setExcludeCulturalContextTexts(com.google.common.base.Optional.fromNullable(excludeCulturalContextTexts));
        }

        public Builder setExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders) {
            UncheckedValidator.validateExcludeGenders(excludeGenders);
            this.excludeGenders = excludeGenders;
            return this;
        }

        public Builder setExcludeGenders(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> excludeGenders) {
            return setExcludeGenders(com.google.common.base.Optional.fromNullable(excludeGenders));
        }

        public Builder setExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) {
            UncheckedValidator.validateExcludeInstitutions(excludeInstitutions);
            this.excludeInstitutions = excludeInstitutions;
            return this;
        }

        public Builder setExcludeInstitutions(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> excludeInstitutions) {
            return setExcludeInstitutions(com.google.common.base.Optional.fromNullable(excludeInstitutions));
        }

        public Builder setExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) {
            UncheckedValidator.validateExcludeLocationNameTexts(excludeLocationNameTexts);
            this.excludeLocationNameTexts = excludeLocationNameTexts;
            return this;
        }

        public Builder setExcludeLocationNameTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeLocationNameTexts) {
            return setExcludeLocationNameTexts(com.google.common.base.Optional.fromNullable(excludeLocationNameTexts));
        }

        public Builder setExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) {
            UncheckedValidator.validateExcludeMaterialTexts(excludeMaterialTexts);
            this.excludeMaterialTexts = excludeMaterialTexts;
            return this;
        }

        public Builder setExcludeMaterialTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeMaterialTexts) {
            return setExcludeMaterialTexts(com.google.common.base.Optional.fromNullable(excludeMaterialTexts));
        }

        public Builder setExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
            UncheckedValidator.validateExcludeSubjectTermTexts(excludeSubjectTermTexts);
            this.excludeSubjectTermTexts = excludeSubjectTermTexts;
            return this;
        }

        public Builder setExcludeSubjectTermTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts) {
            return setExcludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts));
        }

        public Builder setExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) {
            UncheckedValidator.validateExcludeTechniqueTexts(excludeTechniqueTexts);
            this.excludeTechniqueTexts = excludeTechniqueTexts;
            return this;
        }

        public Builder setExcludeTechniqueTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts) {
            return setExcludeTechniqueTexts(com.google.common.base.Optional.fromNullable(excludeTechniqueTexts));
        }

        public Builder setExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) {
            UncheckedValidator.validateExcludeWorkTypeTexts(excludeWorkTypeTexts);
            this.excludeWorkTypeTexts = excludeWorkTypeTexts;
            return this;
        }

        public Builder setExcludeWorkTypeTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts) {
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
            UncheckedValidator.validateIncludeCategories(includeCategories);
            this.includeCategories = includeCategories;
            return this;
        }

        public Builder setIncludeCategories(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeCategories) {
            return setIncludeCategories(com.google.common.base.Optional.fromNullable(includeCategories));
        }

        public Builder setIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) {
            UncheckedValidator.validateIncludeCollections(includeCollections);
            this.includeCollections = includeCollections;
            return this;
        }

        public Builder setIncludeCollections(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> includeCollections) {
            return setIncludeCollections(com.google.common.base.Optional.fromNullable(includeCollections));
        }

        public Builder setIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) {
            UncheckedValidator.validateIncludeColorTexts(includeColorTexts);
            this.includeColorTexts = includeColorTexts;
            return this;
        }

        public Builder setIncludeColorTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeColorTexts) {
            return setIncludeColorTexts(com.google.common.base.Optional.fromNullable(includeColorTexts));
        }

        public Builder setIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) {
            UncheckedValidator.validateIncludeCulturalContextTexts(includeCulturalContextTexts);
            this.includeCulturalContextTexts = includeCulturalContextTexts;
            return this;
        }

        public Builder setIncludeCulturalContextTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeCulturalContextTexts) {
            return setIncludeCulturalContextTexts(com.google.common.base.Optional.fromNullable(includeCulturalContextTexts));
        }

        public Builder setIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders) {
            UncheckedValidator.validateIncludeGenders(includeGenders);
            this.includeGenders = includeGenders;
            return this;
        }

        public Builder setIncludeGenders(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> includeGenders) {
            return setIncludeGenders(com.google.common.base.Optional.fromNullable(includeGenders));
        }

        public Builder setIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) {
            UncheckedValidator.validateIncludeInstitutions(includeInstitutions);
            this.includeInstitutions = includeInstitutions;
            return this;
        }

        public Builder setIncludeInstitutions(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> includeInstitutions) {
            return setIncludeInstitutions(com.google.common.base.Optional.fromNullable(includeInstitutions));
        }

        public Builder setIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) {
            UncheckedValidator.validateIncludeLocationNameTexts(includeLocationNameTexts);
            this.includeLocationNameTexts = includeLocationNameTexts;
            return this;
        }

        public Builder setIncludeLocationNameTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeLocationNameTexts) {
            return setIncludeLocationNameTexts(com.google.common.base.Optional.fromNullable(includeLocationNameTexts));
        }

        public Builder setIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) {
            UncheckedValidator.validateIncludeMaterialTexts(includeMaterialTexts);
            this.includeMaterialTexts = includeMaterialTexts;
            return this;
        }

        public Builder setIncludeMaterialTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeMaterialTexts) {
            return setIncludeMaterialTexts(com.google.common.base.Optional.fromNullable(includeMaterialTexts));
        }

        public Builder setIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
            UncheckedValidator.validateIncludeSubjectTermTexts(includeSubjectTermTexts);
            this.includeSubjectTermTexts = includeSubjectTermTexts;
            return this;
        }

        public Builder setIncludeSubjectTermTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts) {
            return setIncludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(includeSubjectTermTexts));
        }

        public Builder setIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) {
            UncheckedValidator.validateIncludeTechniqueTexts(includeTechniqueTexts);
            this.includeTechniqueTexts = includeTechniqueTexts;
            return this;
        }

        public Builder setIncludeTechniqueTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeTechniqueTexts) {
            return setIncludeTechniqueTexts(com.google.common.base.Optional.fromNullable(includeTechniqueTexts));
        }

        public Builder setIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            UncheckedValidator.validateIncludeWorkTypeTexts(includeWorkTypeTexts);
            this.includeWorkTypeTexts = includeWorkTypeTexts;
            return this;
        }

        public Builder setIncludeWorkTypeTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeWorkTypeTexts) {
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
            this.excludeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> absent();
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
            this.includeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> absent();
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
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders;
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
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders;
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
        EXCLUDE_ALL("excludeAll", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)0, "exclude_all", org.thryft.protocol.Type.BOOL),
        EXCLUDE_CATEGORIES("excludeCategories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "exclude_categories", org.thryft.protocol.Type.SET),
        EXCLUDE_COLLECTIONS("excludeCollections", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {}, false, (short)0, "exclude_collections", org.thryft.protocol.Type.SET),
        EXCLUDE_COLOR_TEXTS("excludeColorTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "exclude_color_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_CULTURAL_CONTEXT_TEXTS("excludeCulturalContextTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "exclude_cultural_context_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_GENDERS("excludeGenders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>>() {}, false, (short)0, "exclude_genders", org.thryft.protocol.Type.SET),
        EXCLUDE_INSTITUTIONS("excludeInstitutions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {}, false, (short)0, "exclude_institutions", org.thryft.protocol.Type.SET),
        EXCLUDE_LOCATION_NAME_TEXTS("excludeLocationNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "exclude_location_name_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_MATERIAL_TEXTS("excludeMaterialTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "exclude_material_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_SUBJECT_TERM_TEXTS("excludeSubjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "exclude_subject_term_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_TECHNIQUE_TEXTS("excludeTechniqueTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "exclude_technique_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_WORK_TYPE_TEXTS("excludeWorkTypeTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "exclude_work_type_texts", org.thryft.protocol.Type.SET),
        INCLUDE_CATEGORIES("includeCategories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "include_categories", org.thryft.protocol.Type.SET),
        INCLUDE_COLLECTIONS("includeCollections", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>>() {}, false, (short)0, "include_collections", org.thryft.protocol.Type.SET),
        INCLUDE_COLOR_TEXTS("includeColorTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "include_color_texts", org.thryft.protocol.Type.SET),
        INCLUDE_CULTURAL_CONTEXT_TEXTS("includeCulturalContextTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "include_cultural_context_texts", org.thryft.protocol.Type.SET),
        INCLUDE_GENDERS("includeGenders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>>() {}, false, (short)0, "include_genders", org.thryft.protocol.Type.SET),
        INCLUDE_INSTITUTIONS("includeInstitutions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>>() {}, false, (short)0, "include_institutions", org.thryft.protocol.Type.SET),
        INCLUDE_LOCATION_NAME_TEXTS("includeLocationNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "include_location_name_texts", org.thryft.protocol.Type.SET),
        INCLUDE_MATERIAL_TEXTS("includeMaterialTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "include_material_texts", org.thryft.protocol.Type.SET),
        INCLUDE_SUBJECT_TERM_TEXTS("includeSubjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "include_subject_term_texts", org.thryft.protocol.Type.SET),
        INCLUDE_TECHNIQUE_TEXTS("includeTechniqueTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "include_technique_texts", org.thryft.protocol.Type.SET),
        INCLUDE_WORK_TYPE_TEXTS("includeWorkTypeTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "include_work_type_texts", org.thryft.protocol.Type.SET);

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

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final org.thryft.protocol.Type thriftProtocolType) {
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
        private final short thriftId;
        private final String thriftName;
        private final String thriftProtocolKey;
        private final org.thryft.protocol.Type thriftProtocolType;
    }

    public final static class ReadValidator {
        public static void validate(final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) throws org.thryft.protocol.InputProtocolException {
            validateExcludeAll(excludeAll);
            validateExcludeCategories(excludeCategories);
            validateExcludeCollections(excludeCollections);
            validateExcludeColorTexts(excludeColorTexts);
            validateExcludeCulturalContextTexts(excludeCulturalContextTexts);
            validateExcludeGenders(excludeGenders);
            validateExcludeInstitutions(excludeInstitutions);
            validateExcludeLocationNameTexts(excludeLocationNameTexts);
            validateExcludeMaterialTexts(excludeMaterialTexts);
            validateExcludeSubjectTermTexts(excludeSubjectTermTexts);
            validateExcludeTechniqueTexts(excludeTechniqueTexts);
            validateExcludeWorkTypeTexts(excludeWorkTypeTexts);
            validateIncludeCategories(includeCategories);
            validateIncludeCollections(includeCollections);
            validateIncludeColorTexts(includeColorTexts);
            validateIncludeCulturalContextTexts(includeCulturalContextTexts);
            validateIncludeGenders(includeGenders);
            validateIncludeInstitutions(includeInstitutions);
            validateIncludeLocationNameTexts(includeLocationNameTexts);
            validateIncludeMaterialTexts(includeMaterialTexts);
            validateIncludeSubjectTermTexts(includeSubjectTermTexts);
            validateIncludeTechniqueTexts(includeTechniqueTexts);
            validateIncludeWorkTypeTexts(includeWorkTypeTexts);
        }

        public static void validateExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) throws org.thryft.protocol.InputProtocolException {
            if (excludeAll == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_ALL, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeAll is null");
            }
            if (excludeAll.isPresent()) {
                if (!excludeAll.get()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_ALL, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeAll: not true");
                }
            }
        }

        public static void validateExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) throws org.thryft.protocol.InputProtocolException {
            if (excludeCategories == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_CATEGORIES, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCategories is null");
            }
            if (excludeCategories.isPresent()) {
                if (excludeCategories.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CATEGORIES, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCategories: less than min length 1");
                }
            }
        }

        public static void validateExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) throws org.thryft.protocol.InputProtocolException {
            if (excludeCollections == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_COLLECTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCollections is null");
            }
            if (excludeCollections.isPresent()) {
                if (excludeCollections.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLLECTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCollections: less than min length 1");
                }
            }
        }

        public static void validateExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeColorTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeColorTexts is null");
            }
            if (excludeColorTexts.isPresent()) {
                if (excludeColorTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeColorTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeCulturalContextTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCulturalContextTexts is null");
            }
            if (excludeCulturalContextTexts.isPresent()) {
                if (excludeCulturalContextTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCulturalContextTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders) throws org.thryft.protocol.InputProtocolException {
            if (excludeGenders == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_GENDERS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeGenders is null");
            }
            if (excludeGenders.isPresent()) {
                if (excludeGenders.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_GENDERS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeGenders: less than min length 1");
                }
            }
        }

        public static void validateExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) throws org.thryft.protocol.InputProtocolException {
            if (excludeInstitutions == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_INSTITUTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeInstitutions is null");
            }
            if (excludeInstitutions.isPresent()) {
                if (excludeInstitutions.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_INSTITUTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeInstitutions: less than min length 1");
                }
            }
        }

        public static void validateExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeLocationNameTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeLocationNameTexts is null");
            }
            if (excludeLocationNameTexts.isPresent()) {
                if (excludeLocationNameTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeLocationNameTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeMaterialTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeMaterialTexts is null");
            }
            if (excludeMaterialTexts.isPresent()) {
                if (excludeMaterialTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeMaterialTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeSubjectTermTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeSubjectTermTexts is null");
            }
            if (excludeSubjectTermTexts.isPresent()) {
                if (excludeSubjectTermTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeSubjectTermTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeTechniqueTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeTechniqueTexts is null");
            }
            if (excludeTechniqueTexts.isPresent()) {
                if (excludeTechniqueTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeTechniqueTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) throws org.thryft.protocol.InputProtocolException {
            if (excludeWorkTypeTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXCLUDE_WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeWorkTypeTexts is null");
            }
            if (excludeWorkTypeTexts.isPresent()) {
                if (excludeWorkTypeTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: excludeWorkTypeTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) throws org.thryft.protocol.InputProtocolException {
            if (includeCategories == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_CATEGORIES, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCategories is null");
            }
            if (includeCategories.isPresent()) {
                if (includeCategories.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CATEGORIES, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCategories: less than min length 1");
                }
            }
        }

        public static void validateIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) throws org.thryft.protocol.InputProtocolException {
            if (includeCollections == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_COLLECTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCollections is null");
            }
            if (includeCollections.isPresent()) {
                if (includeCollections.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLLECTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCollections: less than min length 1");
                }
            }
        }

        public static void validateIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeColorTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeColorTexts is null");
            }
            if (includeColorTexts.isPresent()) {
                if (includeColorTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeColorTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeCulturalContextTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCulturalContextTexts is null");
            }
            if (includeCulturalContextTexts.isPresent()) {
                if (includeCulturalContextTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeCulturalContextTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders) throws org.thryft.protocol.InputProtocolException {
            if (includeGenders == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_GENDERS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeGenders is null");
            }
            if (includeGenders.isPresent()) {
                if (includeGenders.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_GENDERS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeGenders: less than min length 1");
                }
            }
        }

        public static void validateIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) throws org.thryft.protocol.InputProtocolException {
            if (includeInstitutions == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_INSTITUTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeInstitutions is null");
            }
            if (includeInstitutions.isPresent()) {
                if (includeInstitutions.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_INSTITUTIONS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeInstitutions: less than min length 1");
                }
            }
        }

        public static void validateIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeLocationNameTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeLocationNameTexts is null");
            }
            if (includeLocationNameTexts.isPresent()) {
                if (includeLocationNameTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeLocationNameTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeMaterialTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeMaterialTexts is null");
            }
            if (includeMaterialTexts.isPresent()) {
                if (includeMaterialTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeMaterialTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeSubjectTermTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeSubjectTermTexts is null");
            }
            if (includeSubjectTermTexts.isPresent()) {
                if (includeSubjectTermTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeSubjectTermTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeTechniqueTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeTechniqueTexts is null");
            }
            if (includeTechniqueTexts.isPresent()) {
                if (includeTechniqueTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeTechniqueTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) throws org.thryft.protocol.InputProtocolException {
            if (includeWorkTypeTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INCLUDE_WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeWorkTypeTexts is null");
            }
            if (includeWorkTypeTexts.isPresent()) {
                if (includeWorkTypeTexts.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacetFilters: includeWorkTypeTexts: less than min length 1");
                }
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            validateExcludeAll(excludeAll);
            validateExcludeCategories(excludeCategories);
            validateExcludeCollections(excludeCollections);
            validateExcludeColorTexts(excludeColorTexts);
            validateExcludeCulturalContextTexts(excludeCulturalContextTexts);
            validateExcludeGenders(excludeGenders);
            validateExcludeInstitutions(excludeInstitutions);
            validateExcludeLocationNameTexts(excludeLocationNameTexts);
            validateExcludeMaterialTexts(excludeMaterialTexts);
            validateExcludeSubjectTermTexts(excludeSubjectTermTexts);
            validateExcludeTechniqueTexts(excludeTechniqueTexts);
            validateExcludeWorkTypeTexts(excludeWorkTypeTexts);
            validateIncludeCategories(includeCategories);
            validateIncludeCollections(includeCollections);
            validateIncludeColorTexts(includeColorTexts);
            validateIncludeCulturalContextTexts(includeCulturalContextTexts);
            validateIncludeGenders(includeGenders);
            validateIncludeInstitutions(includeInstitutions);
            validateIncludeLocationNameTexts(includeLocationNameTexts);
            validateIncludeMaterialTexts(includeMaterialTexts);
            validateIncludeSubjectTermTexts(includeSubjectTermTexts);
            validateIncludeTechniqueTexts(includeTechniqueTexts);
            validateIncludeWorkTypeTexts(includeWorkTypeTexts);
        }

        public static void validateExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) {
            if (excludeAll == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeAll is null");
            }
            if (excludeAll.isPresent()) {
                if (!excludeAll.get()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeAll: not true");
                }
            }
        }

        public static void validateExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
            if (excludeCategories == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCategories is null");
            }
            if (excludeCategories.isPresent()) {
                if (excludeCategories.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCategories: less than min length 1");
                }
            }
        }

        public static void validateExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) {
            if (excludeCollections == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCollections is null");
            }
            if (excludeCollections.isPresent()) {
                if (excludeCollections.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCollections: less than min length 1");
                }
            }
        }

        public static void validateExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) {
            if (excludeColorTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeColorTexts is null");
            }
            if (excludeColorTexts.isPresent()) {
                if (excludeColorTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeColorTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) {
            if (excludeCulturalContextTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCulturalContextTexts is null");
            }
            if (excludeCulturalContextTexts.isPresent()) {
                if (excludeCulturalContextTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeCulturalContextTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders) {
            if (excludeGenders == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeGenders is null");
            }
            if (excludeGenders.isPresent()) {
                if (excludeGenders.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeGenders: less than min length 1");
                }
            }
        }

        public static void validateExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) {
            if (excludeInstitutions == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeInstitutions is null");
            }
            if (excludeInstitutions.isPresent()) {
                if (excludeInstitutions.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeInstitutions: less than min length 1");
                }
            }
        }

        public static void validateExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) {
            if (excludeLocationNameTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeLocationNameTexts is null");
            }
            if (excludeLocationNameTexts.isPresent()) {
                if (excludeLocationNameTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeLocationNameTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) {
            if (excludeMaterialTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeMaterialTexts is null");
            }
            if (excludeMaterialTexts.isPresent()) {
                if (excludeMaterialTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeMaterialTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
            if (excludeSubjectTermTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeSubjectTermTexts is null");
            }
            if (excludeSubjectTermTexts.isPresent()) {
                if (excludeSubjectTermTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeSubjectTermTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) {
            if (excludeTechniqueTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeTechniqueTexts is null");
            }
            if (excludeTechniqueTexts.isPresent()) {
                if (excludeTechniqueTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeTechniqueTexts: less than min length 1");
                }
            }
        }

        public static void validateExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) {
            if (excludeWorkTypeTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeWorkTypeTexts is null");
            }
            if (excludeWorkTypeTexts.isPresent()) {
                if (excludeWorkTypeTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: excludeWorkTypeTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) {
            if (includeCategories == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCategories is null");
            }
            if (includeCategories.isPresent()) {
                if (includeCategories.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCategories: less than min length 1");
                }
            }
        }

        public static void validateIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) {
            if (includeCollections == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCollections is null");
            }
            if (includeCollections.isPresent()) {
                if (includeCollections.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCollections: less than min length 1");
                }
            }
        }

        public static void validateIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) {
            if (includeColorTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeColorTexts is null");
            }
            if (includeColorTexts.isPresent()) {
                if (includeColorTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeColorTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) {
            if (includeCulturalContextTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCulturalContextTexts is null");
            }
            if (includeCulturalContextTexts.isPresent()) {
                if (includeCulturalContextTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeCulturalContextTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders) {
            if (includeGenders == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeGenders is null");
            }
            if (includeGenders.isPresent()) {
                if (includeGenders.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeGenders: less than min length 1");
                }
            }
        }

        public static void validateIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) {
            if (includeInstitutions == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeInstitutions is null");
            }
            if (includeInstitutions.isPresent()) {
                if (includeInstitutions.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeInstitutions: less than min length 1");
                }
            }
        }

        public static void validateIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) {
            if (includeLocationNameTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeLocationNameTexts is null");
            }
            if (includeLocationNameTexts.isPresent()) {
                if (includeLocationNameTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeLocationNameTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) {
            if (includeMaterialTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeMaterialTexts is null");
            }
            if (includeMaterialTexts.isPresent()) {
                if (includeMaterialTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeMaterialTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
            if (includeSubjectTermTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeSubjectTermTexts is null");
            }
            if (includeSubjectTermTexts.isPresent()) {
                if (includeSubjectTermTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeSubjectTermTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) {
            if (includeTechniqueTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeTechniqueTexts is null");
            }
            if (includeTechniqueTexts.isPresent()) {
                if (includeTechniqueTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeTechniqueTexts: less than min length 1");
                }
            }
        }

        public static void validateIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
            if (includeWorkTypeTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeWorkTypeTexts is null");
            }
            if (includeWorkTypeTexts.isPresent()) {
                if (includeWorkTypeTexts.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectFacetFilters: includeWorkTypeTexts: less than min length 1");
                }
            }
        }
    }

    /**
     * Default constructor
     */
    @Deprecated
    public ObjectFacetFilters() {
        excludeAll = com.google.common.base.Optional.<Boolean> absent();
        excludeCategories = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        excludeCollections = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> absent();
        excludeColorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        excludeCulturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        excludeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> absent();
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
        includeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> absent();
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
        this(other.getExcludeAll(), other.getExcludeCategories(), other.getExcludeCollections(), other.getExcludeColorTexts(), other.getExcludeCulturalContextTexts(), other.getExcludeGenders(), other.getExcludeInstitutions(), other.getExcludeLocationNameTexts(), other.getExcludeMaterialTexts(), other.getExcludeSubjectTermTexts(), other.getExcludeTechniqueTexts(), other.getExcludeWorkTypeTexts(), other.getIncludeCategories(), other.getIncludeCollections(), other.getIncludeColorTexts(), other.getIncludeCulturalContextTexts(), other.getIncludeGenders(), other.getIncludeInstitutions(), other.getIncludeLocationNameTexts(), other.getIncludeMaterialTexts(), other.getIncludeSubjectTermTexts(), other.getIncludeTechniqueTexts(), other.getIncludeWorkTypeTexts());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected ObjectFacetFilters(final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
        this.excludeAll = excludeAll;
        this.excludeCategories = excludeCategories;
        this.excludeCollections = excludeCollections;
        this.excludeColorTexts = excludeColorTexts;
        this.excludeCulturalContextTexts = excludeCulturalContextTexts;
        this.excludeGenders = excludeGenders;
        this.excludeInstitutions = excludeInstitutions;
        this.excludeLocationNameTexts = excludeLocationNameTexts;
        this.excludeMaterialTexts = excludeMaterialTexts;
        this.excludeSubjectTermTexts = excludeSubjectTermTexts;
        this.excludeTechniqueTexts = excludeTechniqueTexts;
        this.excludeWorkTypeTexts = excludeWorkTypeTexts;
        this.includeCategories = includeCategories;
        this.includeCollections = includeCollections;
        this.includeColorTexts = includeColorTexts;
        this.includeCulturalContextTexts = includeCulturalContextTexts;
        this.includeGenders = includeGenders;
        this.includeInstitutions = includeInstitutions;
        this.includeLocationNameTexts = includeLocationNameTexts;
        this.includeMaterialTexts = includeMaterialTexts;
        this.includeSubjectTermTexts = includeSubjectTermTexts;
        this.includeTechniqueTexts = includeTechniqueTexts;
        this.includeWorkTypeTexts = includeWorkTypeTexts;
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

    @Deprecated
    public static ObjectFacetFilters create() {
        return new ObjectFacetFilters();
    }

    /**
     * Total Nullable factory method
     */
    public static ObjectFacetFilters create(@javax.annotation.Nullable final Boolean excludeAll, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeCategories, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> excludeCollections, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeColorTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeCulturalContextTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> excludeGenders, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> excludeInstitutions, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeLocationNameTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeMaterialTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeCategories, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> includeCollections, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeColorTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeCulturalContextTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> includeGenders, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> includeInstitutions, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeLocationNameTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeMaterialTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeTechniqueTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeWorkTypeTexts) {
        final com.google.common.base.Optional<Boolean> excludeAllOptional = org.thryft.Optionals.fromNullable(excludeAll);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategoriesOptional = com.google.common.base.Optional.fromNullable(excludeCategories);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollectionsOptional = com.google.common.base.Optional.fromNullable(excludeCollections);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTextsOptional = com.google.common.base.Optional.fromNullable(excludeColorTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTextsOptional = com.google.common.base.Optional.fromNullable(excludeCulturalContextTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGendersOptional = com.google.common.base.Optional.fromNullable(excludeGenders);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutionsOptional = com.google.common.base.Optional.fromNullable(excludeInstitutions);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTextsOptional = com.google.common.base.Optional.fromNullable(excludeLocationNameTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTextsOptional = com.google.common.base.Optional.fromNullable(excludeMaterialTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTextsOptional = com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTextsOptional = com.google.common.base.Optional.fromNullable(excludeTechniqueTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTextsOptional = com.google.common.base.Optional.fromNullable(excludeWorkTypeTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategoriesOptional = com.google.common.base.Optional.fromNullable(includeCategories);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollectionsOptional = com.google.common.base.Optional.fromNullable(includeCollections);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTextsOptional = com.google.common.base.Optional.fromNullable(includeColorTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTextsOptional = com.google.common.base.Optional.fromNullable(includeCulturalContextTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGendersOptional = com.google.common.base.Optional.fromNullable(includeGenders);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutionsOptional = com.google.common.base.Optional.fromNullable(includeInstitutions);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTextsOptional = com.google.common.base.Optional.fromNullable(includeLocationNameTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTextsOptional = com.google.common.base.Optional.fromNullable(includeMaterialTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTextsOptional = com.google.common.base.Optional.fromNullable(includeSubjectTermTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTextsOptional = com.google.common.base.Optional.fromNullable(includeTechniqueTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTextsOptional = com.google.common.base.Optional.fromNullable(includeWorkTypeTexts);
        UncheckedValidator.validate(excludeAllOptional, excludeCategoriesOptional, excludeCollectionsOptional, excludeColorTextsOptional, excludeCulturalContextTextsOptional, excludeGendersOptional, excludeInstitutionsOptional, excludeLocationNameTextsOptional, excludeMaterialTextsOptional, excludeSubjectTermTextsOptional, excludeTechniqueTextsOptional, excludeWorkTypeTextsOptional, includeCategoriesOptional, includeCollectionsOptional, includeColorTextsOptional, includeCulturalContextTextsOptional, includeGendersOptional, includeInstitutionsOptional, includeLocationNameTextsOptional, includeMaterialTextsOptional, includeSubjectTermTextsOptional, includeTechniqueTextsOptional, includeWorkTypeTextsOptional);
        return new ObjectFacetFilters(excludeAllOptional, excludeCategoriesOptional, excludeCollectionsOptional, excludeColorTextsOptional, excludeCulturalContextTextsOptional, excludeGendersOptional, excludeInstitutionsOptional, excludeLocationNameTextsOptional, excludeMaterialTextsOptional, excludeSubjectTermTextsOptional, excludeTechniqueTextsOptional, excludeWorkTypeTextsOptional, includeCategoriesOptional, includeCollectionsOptional, includeColorTextsOptional, includeCulturalContextTextsOptional, includeGendersOptional, includeInstitutionsOptional, includeLocationNameTextsOptional, includeMaterialTextsOptional, includeSubjectTermTextsOptional, includeTechniqueTextsOptional, includeWorkTypeTextsOptional);
    }

    /**
     * Optional factory method
     */
    public static ObjectFacetFilters create(final com.google.common.base.Optional<Boolean> excludeAll, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
        UncheckedValidator.validate(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
        return new ObjectFacetFilters(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof ObjectFacetFilters)) {
            return false;
        }

        final ObjectFacetFilters other = (ObjectFacetFilters)otherObject;

        if (!(((getExcludeAll().isPresent() && other.getExcludeAll().isPresent()) ? (getExcludeAll().get().booleanValue() == other.getExcludeAll().get().booleanValue()) : (!getExcludeAll().isPresent() && !other.getExcludeAll().isPresent())))) {
            return false;
        }

        if (!(((getExcludeCategories().isPresent() && other.getExcludeCategories().isPresent()) ? (getExcludeCategories().get().equals(other.getExcludeCategories().get())) : (!getExcludeCategories().isPresent() && !other.getExcludeCategories().isPresent())))) {
            return false;
        }

        if (!(((getExcludeCollections().isPresent() && other.getExcludeCollections().isPresent()) ? (getExcludeCollections().get().equals(other.getExcludeCollections().get())) : (!getExcludeCollections().isPresent() && !other.getExcludeCollections().isPresent())))) {
            return false;
        }

        if (!(((getExcludeColorTexts().isPresent() && other.getExcludeColorTexts().isPresent()) ? (getExcludeColorTexts().get().equals(other.getExcludeColorTexts().get())) : (!getExcludeColorTexts().isPresent() && !other.getExcludeColorTexts().isPresent())))) {
            return false;
        }

        if (!(((getExcludeCulturalContextTexts().isPresent() && other.getExcludeCulturalContextTexts().isPresent()) ? (getExcludeCulturalContextTexts().get().equals(other.getExcludeCulturalContextTexts().get())) : (!getExcludeCulturalContextTexts().isPresent() && !other.getExcludeCulturalContextTexts().isPresent())))) {
            return false;
        }

        if (!(((getExcludeGenders().isPresent() && other.getExcludeGenders().isPresent()) ? (getExcludeGenders().get().equals(other.getExcludeGenders().get())) : (!getExcludeGenders().isPresent() && !other.getExcludeGenders().isPresent())))) {
            return false;
        }

        if (!(((getExcludeInstitutions().isPresent() && other.getExcludeInstitutions().isPresent()) ? (getExcludeInstitutions().get().equals(other.getExcludeInstitutions().get())) : (!getExcludeInstitutions().isPresent() && !other.getExcludeInstitutions().isPresent())))) {
            return false;
        }

        if (!(((getExcludeLocationNameTexts().isPresent() && other.getExcludeLocationNameTexts().isPresent()) ? (getExcludeLocationNameTexts().get().equals(other.getExcludeLocationNameTexts().get())) : (!getExcludeLocationNameTexts().isPresent() && !other.getExcludeLocationNameTexts().isPresent())))) {
            return false;
        }

        if (!(((getExcludeMaterialTexts().isPresent() && other.getExcludeMaterialTexts().isPresent()) ? (getExcludeMaterialTexts().get().equals(other.getExcludeMaterialTexts().get())) : (!getExcludeMaterialTexts().isPresent() && !other.getExcludeMaterialTexts().isPresent())))) {
            return false;
        }

        if (!(((getExcludeSubjectTermTexts().isPresent() && other.getExcludeSubjectTermTexts().isPresent()) ? (getExcludeSubjectTermTexts().get().equals(other.getExcludeSubjectTermTexts().get())) : (!getExcludeSubjectTermTexts().isPresent() && !other.getExcludeSubjectTermTexts().isPresent())))) {
            return false;
        }

        if (!(((getExcludeTechniqueTexts().isPresent() && other.getExcludeTechniqueTexts().isPresent()) ? (getExcludeTechniqueTexts().get().equals(other.getExcludeTechniqueTexts().get())) : (!getExcludeTechniqueTexts().isPresent() && !other.getExcludeTechniqueTexts().isPresent())))) {
            return false;
        }

        if (!(((getExcludeWorkTypeTexts().isPresent() && other.getExcludeWorkTypeTexts().isPresent()) ? (getExcludeWorkTypeTexts().get().equals(other.getExcludeWorkTypeTexts().get())) : (!getExcludeWorkTypeTexts().isPresent() && !other.getExcludeWorkTypeTexts().isPresent())))) {
            return false;
        }

        if (!(((getIncludeCategories().isPresent() && other.getIncludeCategories().isPresent()) ? (getIncludeCategories().get().equals(other.getIncludeCategories().get())) : (!getIncludeCategories().isPresent() && !other.getIncludeCategories().isPresent())))) {
            return false;
        }

        if (!(((getIncludeCollections().isPresent() && other.getIncludeCollections().isPresent()) ? (getIncludeCollections().get().equals(other.getIncludeCollections().get())) : (!getIncludeCollections().isPresent() && !other.getIncludeCollections().isPresent())))) {
            return false;
        }

        if (!(((getIncludeColorTexts().isPresent() && other.getIncludeColorTexts().isPresent()) ? (getIncludeColorTexts().get().equals(other.getIncludeColorTexts().get())) : (!getIncludeColorTexts().isPresent() && !other.getIncludeColorTexts().isPresent())))) {
            return false;
        }

        if (!(((getIncludeCulturalContextTexts().isPresent() && other.getIncludeCulturalContextTexts().isPresent()) ? (getIncludeCulturalContextTexts().get().equals(other.getIncludeCulturalContextTexts().get())) : (!getIncludeCulturalContextTexts().isPresent() && !other.getIncludeCulturalContextTexts().isPresent())))) {
            return false;
        }

        if (!(((getIncludeGenders().isPresent() && other.getIncludeGenders().isPresent()) ? (getIncludeGenders().get().equals(other.getIncludeGenders().get())) : (!getIncludeGenders().isPresent() && !other.getIncludeGenders().isPresent())))) {
            return false;
        }

        if (!(((getIncludeInstitutions().isPresent() && other.getIncludeInstitutions().isPresent()) ? (getIncludeInstitutions().get().equals(other.getIncludeInstitutions().get())) : (!getIncludeInstitutions().isPresent() && !other.getIncludeInstitutions().isPresent())))) {
            return false;
        }

        if (!(((getIncludeLocationNameTexts().isPresent() && other.getIncludeLocationNameTexts().isPresent()) ? (getIncludeLocationNameTexts().get().equals(other.getIncludeLocationNameTexts().get())) : (!getIncludeLocationNameTexts().isPresent() && !other.getIncludeLocationNameTexts().isPresent())))) {
            return false;
        }

        if (!(((getIncludeMaterialTexts().isPresent() && other.getIncludeMaterialTexts().isPresent()) ? (getIncludeMaterialTexts().get().equals(other.getIncludeMaterialTexts().get())) : (!getIncludeMaterialTexts().isPresent() && !other.getIncludeMaterialTexts().isPresent())))) {
            return false;
        }

        if (!(((getIncludeSubjectTermTexts().isPresent() && other.getIncludeSubjectTermTexts().isPresent()) ? (getIncludeSubjectTermTexts().get().equals(other.getIncludeSubjectTermTexts().get())) : (!getIncludeSubjectTermTexts().isPresent() && !other.getIncludeSubjectTermTexts().isPresent())))) {
            return false;
        }

        if (!(((getIncludeTechniqueTexts().isPresent() && other.getIncludeTechniqueTexts().isPresent()) ? (getIncludeTechniqueTexts().get().equals(other.getIncludeTechniqueTexts().get())) : (!getIncludeTechniqueTexts().isPresent() && !other.getIncludeTechniqueTexts().isPresent())))) {
            return false;
        }

        if (!(((getIncludeWorkTypeTexts().isPresent() && other.getIncludeWorkTypeTexts().isPresent()) ? (getIncludeWorkTypeTexts().get().equals(other.getIncludeWorkTypeTexts().get())) : (!getIncludeWorkTypeTexts().isPresent() && !other.getIncludeWorkTypeTexts().isPresent())))) {
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

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> getExcludeGenders() {
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

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> getIncludeGenders() {
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
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> absent();
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
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                excludeAll = org.thryft.Optionals.of(iprot.readBool());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CATEGORIES, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLLECTIONS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLOR_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CULTURAL_CONTEXT_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 5) {
                try {
                    excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_GENDERS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_INSTITUTIONS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_LOCATION_NAME_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_MATERIAL_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_SUBJECT_TERM_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_TECHNIQUE_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_WORK_TYPE_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CATEGORIES, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLLECTIONS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLOR_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CULTURAL_CONTEXT_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 16) {
                try {
                    includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_GENDERS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_INSTITUTIONS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_LOCATION_NAME_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_MATERIAL_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_SUBJECT_TERM_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_TECHNIQUE_TEXTS, e.getCause());
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_WORK_TYPE_TEXTS, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);

        return new ObjectFacetFilters(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
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
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> absent();
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
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "exclude_all": {
                    excludeAll = org.thryft.Optionals.of(iprot.readBool());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CATEGORIES, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLLECTIONS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_COLOR_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_CULTURAL_CONTEXT_TEXTS, e.getCause());
                    }
                    break;
                }
                case "exclude_genders": {
                    try {
                        excludeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_GENDERS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_INSTITUTIONS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_LOCATION_NAME_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_MATERIAL_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_SUBJECT_TERM_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_TECHNIQUE_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXCLUDE_WORK_TYPE_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CATEGORIES, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLLECTIONS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_COLOR_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_CULTURAL_CONTEXT_TEXTS, e.getCause());
                    }
                    break;
                }
                case "include_genders": {
                    try {
                        includeGenders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_GENDERS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_INSTITUTIONS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_LOCATION_NAME_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_MATERIAL_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_SUBJECT_TERM_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_TECHNIQUE_TEXTS, e.getCause());
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_WORK_TYPE_TEXTS, e.getCause());
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

        ReadValidator.validate(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);

        return new ObjectFacetFilters(excludeAll, excludeCategories, excludeCollections, excludeColorTexts, excludeCulturalContextTexts, excludeGenders, excludeInstitutions, excludeLocationNameTexts, excludeMaterialTexts, excludeSubjectTermTexts, excludeTechniqueTexts, excludeWorkTypeTexts, includeCategories, includeCollections, includeColorTexts, includeCulturalContextTexts, includeGenders, includeInstitutions, includeLocationNameTexts, includeMaterialTexts, includeSubjectTermTexts, includeTechniqueTexts, includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeAll(final com.google.common.base.Optional<Boolean> excludeAll) {
        UncheckedValidator.validateExcludeAll(excludeAll);
        return new ObjectFacetFilters(excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeAll(@javax.annotation.Nullable final Boolean excludeAll) {
        return replaceExcludeAll(org.thryft.Optionals.fromNullable(excludeAll));
    }

    public ObjectFacetFilters replaceExcludeAll(final boolean excludeAll) {
        return replaceExcludeAll(org.thryft.Optionals.of(excludeAll));
    }

    public ObjectFacetFilters replaceExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
        UncheckedValidator.validateExcludeCategories(excludeCategories);
        return new ObjectFacetFilters(this.excludeAll, excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeCategories) {
        return replaceExcludeCategories(com.google.common.base.Optional.fromNullable(excludeCategories));
    }

    public ObjectFacetFilters replaceExcludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections) {
        UncheckedValidator.validateExcludeCollections(excludeCollections);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeCollections(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> excludeCollections) {
        return replaceExcludeCollections(com.google.common.base.Optional.fromNullable(excludeCollections));
    }

    public ObjectFacetFilters replaceExcludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts) {
        UncheckedValidator.validateExcludeColorTexts(excludeColorTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeColorTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeColorTexts) {
        return replaceExcludeColorTexts(com.google.common.base.Optional.fromNullable(excludeColorTexts));
    }

    public ObjectFacetFilters replaceExcludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts) {
        UncheckedValidator.validateExcludeCulturalContextTexts(excludeCulturalContextTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeCulturalContextTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeCulturalContextTexts) {
        return replaceExcludeCulturalContextTexts(com.google.common.base.Optional.fromNullable(excludeCulturalContextTexts));
    }

    public ObjectFacetFilters replaceExcludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders) {
        UncheckedValidator.validateExcludeGenders(excludeGenders);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeGenders(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> excludeGenders) {
        return replaceExcludeGenders(com.google.common.base.Optional.fromNullable(excludeGenders));
    }

    public ObjectFacetFilters replaceExcludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> excludeInstitutions) {
        UncheckedValidator.validateExcludeInstitutions(excludeInstitutions);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeInstitutions(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> excludeInstitutions) {
        return replaceExcludeInstitutions(com.google.common.base.Optional.fromNullable(excludeInstitutions));
    }

    public ObjectFacetFilters replaceExcludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeLocationNameTexts) {
        UncheckedValidator.validateExcludeLocationNameTexts(excludeLocationNameTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeLocationNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeLocationNameTexts) {
        return replaceExcludeLocationNameTexts(com.google.common.base.Optional.fromNullable(excludeLocationNameTexts));
    }

    public ObjectFacetFilters replaceExcludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeMaterialTexts) {
        UncheckedValidator.validateExcludeMaterialTexts(excludeMaterialTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeMaterialTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeMaterialTexts) {
        return replaceExcludeMaterialTexts(com.google.common.base.Optional.fromNullable(excludeMaterialTexts));
    }

    public ObjectFacetFilters replaceExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
        UncheckedValidator.validateExcludeSubjectTermTexts(excludeSubjectTermTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeSubjectTermTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts) {
        return replaceExcludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts));
    }

    public ObjectFacetFilters replaceExcludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeTechniqueTexts) {
        UncheckedValidator.validateExcludeTechniqueTexts(excludeTechniqueTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeTechniqueTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeTechniqueTexts) {
        return replaceExcludeTechniqueTexts(com.google.common.base.Optional.fromNullable(excludeTechniqueTexts));
    }

    public ObjectFacetFilters replaceExcludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeWorkTypeTexts) {
        UncheckedValidator.validateExcludeWorkTypeTexts(excludeWorkTypeTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceExcludeWorkTypeTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeWorkTypeTexts) {
        return replaceExcludeWorkTypeTexts(com.google.common.base.Optional.fromNullable(excludeWorkTypeTexts));
    }

    public ObjectFacetFilters replaceIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) {
        UncheckedValidator.validateIncludeCategories(includeCategories);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeCategories) {
        return replaceIncludeCategories(com.google.common.base.Optional.fromNullable(includeCategories));
    }

    public ObjectFacetFilters replaceIncludeCollections(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> includeCollections) {
        UncheckedValidator.validateIncludeCollections(includeCollections);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeCollections(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId> includeCollections) {
        return replaceIncludeCollections(com.google.common.base.Optional.fromNullable(includeCollections));
    }

    public ObjectFacetFilters replaceIncludeColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeColorTexts) {
        UncheckedValidator.validateIncludeColorTexts(includeColorTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeColorTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeColorTexts) {
        return replaceIncludeColorTexts(com.google.common.base.Optional.fromNullable(includeColorTexts));
    }

    public ObjectFacetFilters replaceIncludeCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCulturalContextTexts) {
        UncheckedValidator.validateIncludeCulturalContextTexts(includeCulturalContextTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeCulturalContextTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeCulturalContextTexts) {
        return replaceIncludeCulturalContextTexts(com.google.common.base.Optional.fromNullable(includeCulturalContextTexts));
    }

    public ObjectFacetFilters replaceIncludeGenders(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders) {
        UncheckedValidator.validateIncludeGenders(includeGenders);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeGenders(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> includeGenders) {
        return replaceIncludeGenders(com.google.common.base.Optional.fromNullable(includeGenders));
    }

    public ObjectFacetFilters replaceIncludeInstitutions(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions) {
        UncheckedValidator.validateIncludeInstitutions(includeInstitutions);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeInstitutions(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId> includeInstitutions) {
        return replaceIncludeInstitutions(com.google.common.base.Optional.fromNullable(includeInstitutions));
    }

    public ObjectFacetFilters replaceIncludeLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts) {
        UncheckedValidator.validateIncludeLocationNameTexts(includeLocationNameTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeLocationNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeLocationNameTexts) {
        return replaceIncludeLocationNameTexts(com.google.common.base.Optional.fromNullable(includeLocationNameTexts));
    }

    public ObjectFacetFilters replaceIncludeMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts) {
        UncheckedValidator.validateIncludeMaterialTexts(includeMaterialTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeMaterialTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeMaterialTexts) {
        return replaceIncludeMaterialTexts(com.google.common.base.Optional.fromNullable(includeMaterialTexts));
    }

    public ObjectFacetFilters replaceIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
        UncheckedValidator.validateIncludeSubjectTermTexts(includeSubjectTermTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, includeSubjectTermTexts, this.includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeSubjectTermTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts) {
        return replaceIncludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(includeSubjectTermTexts));
    }

    public ObjectFacetFilters replaceIncludeTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts) {
        UncheckedValidator.validateIncludeTechniqueTexts(includeTechniqueTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, includeTechniqueTexts, this.includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeTechniqueTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeTechniqueTexts) {
        return replaceIncludeTechniqueTexts(com.google.common.base.Optional.fromNullable(includeTechniqueTexts));
    }

    public ObjectFacetFilters replaceIncludeWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts) {
        UncheckedValidator.validateIncludeWorkTypeTexts(includeWorkTypeTexts);
        return new ObjectFacetFilters(this.excludeAll, this.excludeCategories, this.excludeCollections, this.excludeColorTexts, this.excludeCulturalContextTexts, this.excludeGenders, this.excludeInstitutions, this.excludeLocationNameTexts, this.excludeMaterialTexts, this.excludeSubjectTermTexts, this.excludeTechniqueTexts, this.excludeWorkTypeTexts, this.includeCategories, this.includeCollections, this.includeColorTexts, this.includeCulturalContextTexts, this.includeGenders, this.includeInstitutions, this.includeLocationNameTexts, this.includeMaterialTexts, this.includeSubjectTermTexts, this.includeTechniqueTexts, includeWorkTypeTexts);
    }

    public ObjectFacetFilters replaceIncludeWorkTypeTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> includeWorkTypeTexts) {
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
            for (final org.dressdiscover.api.vocabularies.costume_core.gender.Gender _iter0 : getExcludeGenders().get()) {
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
            for (final org.dressdiscover.api.vocabularies.costume_core.gender.Gender _iter0 : getIncludeGenders().get()) {
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

    public void writeExcludeAllField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeAll().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_ALL);
            oprot.writeBool(getExcludeAll().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeCategoriesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeCategories().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_CATEGORIES);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCategories().get().size());
            for (final String _iter0 : getExcludeCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeCollectionsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeCollections().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_COLLECTIONS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCollections().get().size());
            for (final org.dressdiscover.api.models.collection.CollectionId _iter0 : getExcludeCollections().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeColorTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeColorTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_COLOR_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeColorTexts().get().size());
            for (final String _iter0 : getExcludeColorTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeCulturalContextTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeCulturalContextTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_CULTURAL_CONTEXT_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCulturalContextTexts().get().size());
            for (final String _iter0 : getExcludeCulturalContextTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeGendersField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeGenders().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_GENDERS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeGenders().get().size());
            for (final org.dressdiscover.api.vocabularies.costume_core.gender.Gender _iter0 : getExcludeGenders().get()) {
                oprot.writeEnum(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeInstitutionsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeInstitutions().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_INSTITUTIONS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeInstitutions().get().size());
            for (final org.dressdiscover.api.models.institution.InstitutionId _iter0 : getExcludeInstitutions().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeLocationNameTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeLocationNameTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_LOCATION_NAME_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeLocationNameTexts().get().size());
            for (final String _iter0 : getExcludeLocationNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeMaterialTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeMaterialTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_MATERIAL_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeMaterialTexts().get().size());
            for (final String _iter0 : getExcludeMaterialTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeSubjectTermTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeSubjectTermTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_SUBJECT_TERM_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeSubjectTermTexts().get().size());
            for (final String _iter0 : getExcludeSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeTechniqueTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeTechniqueTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_TECHNIQUE_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeTechniqueTexts().get().size());
            for (final String _iter0 : getExcludeTechniqueTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExcludeWorkTypeTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExcludeWorkTypeTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXCLUDE_WORK_TYPE_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeWorkTypeTexts().get().size());
            for (final String _iter0 : getExcludeWorkTypeTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeExcludeAllField(oprot);

        writeExcludeCategoriesField(oprot);

        writeExcludeCollectionsField(oprot);

        writeExcludeColorTextsField(oprot);

        writeExcludeCulturalContextTextsField(oprot);

        writeExcludeGendersField(oprot);

        writeExcludeInstitutionsField(oprot);

        writeExcludeLocationNameTextsField(oprot);

        writeExcludeMaterialTextsField(oprot);

        writeExcludeSubjectTermTextsField(oprot);

        writeExcludeTechniqueTextsField(oprot);

        writeExcludeWorkTypeTextsField(oprot);

        writeIncludeCategoriesField(oprot);

        writeIncludeCollectionsField(oprot);

        writeIncludeColorTextsField(oprot);

        writeIncludeCulturalContextTextsField(oprot);

        writeIncludeGendersField(oprot);

        writeIncludeInstitutionsField(oprot);

        writeIncludeLocationNameTextsField(oprot);

        writeIncludeMaterialTextsField(oprot);

        writeIncludeSubjectTermTextsField(oprot);

        writeIncludeTechniqueTextsField(oprot);

        writeIncludeWorkTypeTextsField(oprot);

        oprot.writeFieldStop();
    }

    public void writeIncludeCategoriesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeCategories().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_CATEGORIES);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCategories().get().size());
            for (final String _iter0 : getIncludeCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeCollectionsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeCollections().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_COLLECTIONS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCollections().get().size());
            for (final org.dressdiscover.api.models.collection.CollectionId _iter0 : getIncludeCollections().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeColorTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeColorTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_COLOR_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeColorTexts().get().size());
            for (final String _iter0 : getIncludeColorTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeCulturalContextTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeCulturalContextTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_CULTURAL_CONTEXT_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCulturalContextTexts().get().size());
            for (final String _iter0 : getIncludeCulturalContextTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeGendersField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeGenders().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_GENDERS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeGenders().get().size());
            for (final org.dressdiscover.api.vocabularies.costume_core.gender.Gender _iter0 : getIncludeGenders().get()) {
                oprot.writeEnum(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeInstitutionsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeInstitutions().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_INSTITUTIONS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeInstitutions().get().size());
            for (final org.dressdiscover.api.models.institution.InstitutionId _iter0 : getIncludeInstitutions().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeLocationNameTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeLocationNameTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_LOCATION_NAME_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeLocationNameTexts().get().size());
            for (final String _iter0 : getIncludeLocationNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeMaterialTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeMaterialTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_MATERIAL_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeMaterialTexts().get().size());
            for (final String _iter0 : getIncludeMaterialTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeSubjectTermTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeSubjectTermTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_SUBJECT_TERM_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeSubjectTermTexts().get().size());
            for (final String _iter0 : getIncludeSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeTechniqueTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeTechniqueTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_TECHNIQUE_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeTechniqueTexts().get().size());
            for (final String _iter0 : getIncludeTechniqueTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIncludeWorkTypeTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIncludeWorkTypeTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.INCLUDE_WORK_TYPE_TEXTS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeWorkTypeTexts().get().size());
            for (final String _iter0 : getIncludeWorkTypeTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public final static ObjectFacetFilters EMPTY = new ObjectFacetFilters();

    private final com.google.common.base.Optional<Boolean> excludeAll;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.collection.CollectionId>> excludeCollections;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeColorTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCulturalContextTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> excludeGenders;

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

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>> includeGenders;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.institution.InstitutionId>> includeInstitutions;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeLocationNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeMaterialTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeTechniqueTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeWorkTypeTexts;
}
