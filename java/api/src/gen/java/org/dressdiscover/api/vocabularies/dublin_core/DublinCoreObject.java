package org.dressdiscover.api.vocabularies.dublin_core;

public final class DublinCoreObject implements org.thryft.Struct {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, DublinCoreObject> {
        public Builder() {
            abstracts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            audiences = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            contributors = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            coverages = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            createds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            creators = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            dates = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            descriptions = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            extents = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            formats = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            identifiers = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            languages = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            mediums = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            provenances = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            publishers = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            relations = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            rights = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            rightsHolders = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            sources = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            spatials = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            subjects = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            temporals = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            titles = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            types = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        }

        public Builder(final DublinCoreObject other) {
            this.abstracts = other.getAbstracts();
            this.audiences = other.getAudiences();
            this.contributors = other.getContributors();
            this.coverages = other.getCoverages();
            this.createds = other.getCreateds();
            this.creators = other.getCreators();
            this.dates = other.getDates();
            this.descriptions = other.getDescriptions();
            this.extents = other.getExtents();
            this.formats = other.getFormats();
            this.identifiers = other.getIdentifiers();
            this.languages = other.getLanguages();
            this.mediums = other.getMediums();
            this.provenances = other.getProvenances();
            this.publishers = other.getPublishers();
            this.relations = other.getRelations();
            this.rights = other.getRights();
            this.rightsHolders = other.getRightsHolders();
            this.sources = other.getSources();
            this.spatials = other.getSpatials();
            this.subjects = other.getSubjects();
            this.temporals = other.getTemporals();
            this.titles = other.getTitles();
            this.types = other.getTypes();
        }

        protected DublinCoreObject _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
            return new DublinCoreObject(abstracts, audiences, contributors, coverages, createds, creators, dates, descriptions, extents, formats, identifiers, languages, mediums, provenances, publishers, relations, rights, rightsHolders, sources, spatials, subjects, temporals, titles, types);
        }

        public DublinCoreObject build() {
            Validator.validate(abstracts, audiences, contributors, coverages, createds, creators, dates, descriptions, extents, formats, identifiers, languages, mediums, provenances, publishers, relations, rights, rightsHolders, sources, spatials, subjects, temporals, titles, types);

            return _build(abstracts, audiences, contributors, coverages, createds, creators, dates, descriptions, extents, formats, identifiers, languages, mediums, provenances, publishers, relations, rights, rightsHolders, sources, spatials, subjects, temporals, titles, types);
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAbstracts() {
            return abstracts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAudiences() {
            return audiences;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getContributors() {
            return contributors;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCoverages() {
            return coverages;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCreateds() {
            return createds;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCreators() {
            return creators;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getDates() {
            return dates;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getDescriptions() {
            return descriptions;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getExtents() {
            return extents;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getFormats() {
            return formats;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getIdentifiers() {
            return identifiers;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getLanguages() {
            return languages;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getMediums() {
            return mediums;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getProvenances() {
            return provenances;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getPublishers() {
            return publishers;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRelations() {
            return relations;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRights() {
            return rights;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRightsHolders() {
            return rightsHolders;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSources() {
            return sources;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSpatials() {
            return spatials;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSubjects() {
            return subjects;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTemporals() {
            return temporals;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTitles() {
            return titles;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTypes() {
            return types;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                if (__list.getSize() > 0) {
                    try {
                        this.setAbstracts(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACTS, e.getCause());
                    }
                }
                if (__list.getSize() > 1) {
                    try {
                        this.setAudiences(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCES, e.getCause());
                    }
                }
                if (__list.getSize() > 2) {
                    try {
                        this.setContributors(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTORS, e.getCause());
                    }
                }
                if (__list.getSize() > 3) {
                    try {
                        this.setCoverages(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGES, e.getCause());
                    }
                }
                if (__list.getSize() > 4) {
                    try {
                        this.setCreateds(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATEDS, e.getCause());
                    }
                }
                if (__list.getSize() > 5) {
                    try {
                        this.setCreators(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATORS, e.getCause());
                    }
                }
                if (__list.getSize() > 6) {
                    try {
                        this.setDates(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                    }
                }
                if (__list.getSize() > 7) {
                    try {
                        this.setDescriptions(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTIONS, e.getCause());
                    }
                }
                if (__list.getSize() > 8) {
                    try {
                        this.setExtents(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENTS, e.getCause());
                    }
                }
                if (__list.getSize() > 9) {
                    try {
                        this.setFormats(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMATS, e.getCause());
                    }
                }
                if (__list.getSize() > 10) {
                    try {
                        this.setIdentifiers(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIERS, e.getCause());
                    }
                }
                if (__list.getSize() > 11) {
                    try {
                        this.setLanguages(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGES, e.getCause());
                    }
                }
                if (__list.getSize() > 12) {
                    try {
                        this.setMediums(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUMS, e.getCause());
                    }
                }
                if (__list.getSize() > 13) {
                    try {
                        this.setProvenances(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCES, e.getCause());
                    }
                }
                if (__list.getSize() > 14) {
                    try {
                        this.setPublishers(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHERS, e.getCause());
                    }
                }
                if (__list.getSize() > 15) {
                    try {
                        this.setRelations(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATIONS, e.getCause());
                    }
                }
                if (__list.getSize() > 16) {
                    try {
                        this.setRights(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS, e.getCause());
                    }
                }
                if (__list.getSize() > 17) {
                    try {
                        this.setRightsHolders(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDERS, e.getCause());
                    }
                }
                if (__list.getSize() > 18) {
                    try {
                        this.setSources(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCES, e.getCause());
                    }
                }
                if (__list.getSize() > 19) {
                    try {
                        this.setSpatials(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIALS, e.getCause());
                    }
                }
                if (__list.getSize() > 20) {
                    try {
                        this.setSubjects(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECTS, e.getCause());
                    }
                }
                if (__list.getSize() > 21) {
                    try {
                        this.setTemporals(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORALS, e.getCause());
                    }
                }
                if (__list.getSize() > 22) {
                    try {
                        this.setTitles(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLES, e.getCause());
                    }
                }
                if (__list.getSize() > 23) {
                    try {
                        this.setTypes(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                        }).apply(iprot)));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPES, e.getCause());
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
                    case "abstracts": {
                        if (!ifield.hasId() || ifield.getId() == 24) {
                                try {
                                    this.setAbstracts(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACTS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "audiences": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                                try {
                                    this.setAudiences(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCES, e.getCause());
                                }
                        }
                        break;
                    }
                    case "contributors": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                                try {
                                    this.setContributors(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTORS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "coverages": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                                try {
                                    this.setCoverages(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGES, e.getCause());
                                }
                        }
                        break;
                    }
                    case "createds": {
                        if (!ifield.hasId() || ifield.getId() == 20) {
                                try {
                                    this.setCreateds(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATEDS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "creators": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                                try {
                                    this.setCreators(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATORS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "dates": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                                try {
                                    this.setDates(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                                }
                        }
                        break;
                    }
                    case "descriptions": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                                try {
                                    this.setDescriptions(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTIONS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "extents": {
                        if (!ifield.hasId() || ifield.getId() == 19) {
                                try {
                                    this.setExtents(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENTS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "formats": {
                        if (!ifield.hasId() || ifield.getId() == 8) {
                                try {
                                    this.setFormats(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMATS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "identifiers": {
                        if (!ifield.hasId() || ifield.getId() == 7) {
                                try {
                                    this.setIdentifiers(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIERS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "languages": {
                        if (!ifield.hasId() || ifield.getId() == 9) {
                                try {
                                    this.setLanguages(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGES, e.getCause());
                                }
                        }
                        break;
                    }
                    case "mediums": {
                        if (!ifield.hasId() || ifield.getId() == 23) {
                                try {
                                    this.setMediums(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUMS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "provenances": {
                        if (!ifield.hasId() || ifield.getId() == 10) {
                                try {
                                    this.setProvenances(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCES, e.getCause());
                                }
                        }
                        break;
                    }
                    case "publishers": {
                        if (!ifield.hasId() || ifield.getId() == 11) {
                                try {
                                    this.setPublishers(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHERS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "relations": {
                        if (!ifield.hasId() || ifield.getId() == 12) {
                                try {
                                    this.setRelations(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATIONS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "rights": {
                        if (!ifield.hasId() || ifield.getId() == 13) {
                                try {
                                    this.setRights(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "rights_holders": {
                        if (!ifield.hasId() || ifield.getId() == 14) {
                                try {
                                    this.setRightsHolders(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDERS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "sources": {
                        if (!ifield.hasId() || ifield.getId() == 15) {
                                try {
                                    this.setSources(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCES, e.getCause());
                                }
                        }
                        break;
                    }
                    case "spatials": {
                        if (!ifield.hasId() || ifield.getId() == 21) {
                                try {
                                    this.setSpatials(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIALS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "subjects": {
                        if (!ifield.hasId() || ifield.getId() == 16) {
                                try {
                                    this.setSubjects(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECTS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "temporals": {
                        if (!ifield.hasId() || ifield.getId() == 22) {
                                try {
                                    this.setTemporals(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORALS, e.getCause());
                                }
                        }
                        break;
                    }
                    case "titles": {
                        if (!ifield.hasId() || ifield.getId() == 17) {
                                try {
                                    this.setTitles(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLES, e.getCause());
                                }
                        }
                        break;
                    }
                    case "types": {
                        if (!ifield.hasId() || ifield.getId() == 18) {
                                try {
                                    this.setTypes(com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                    }).apply(iprot)));
                                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPES, e.getCause());
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
            case ABSTRACTS: setAbstracts((com.google.common.collect.ImmutableList<String>)value); return this;
            case AUDIENCES: setAudiences((com.google.common.collect.ImmutableList<String>)value); return this;
            case CONTRIBUTORS: setContributors((com.google.common.collect.ImmutableList<String>)value); return this;
            case COVERAGES: setCoverages((com.google.common.collect.ImmutableList<String>)value); return this;
            case CREATEDS: setCreateds((com.google.common.collect.ImmutableList<String>)value); return this;
            case CREATORS: setCreators((com.google.common.collect.ImmutableList<String>)value); return this;
            case DATES: setDates((com.google.common.collect.ImmutableList<String>)value); return this;
            case DESCRIPTIONS: setDescriptions((com.google.common.collect.ImmutableList<String>)value); return this;
            case EXTENTS: setExtents((com.google.common.collect.ImmutableList<String>)value); return this;
            case FORMATS: setFormats((com.google.common.collect.ImmutableList<String>)value); return this;
            case IDENTIFIERS: setIdentifiers((com.google.common.collect.ImmutableList<String>)value); return this;
            case LANGUAGES: setLanguages((com.google.common.collect.ImmutableList<String>)value); return this;
            case MEDIUMS: setMediums((com.google.common.collect.ImmutableList<String>)value); return this;
            case PROVENANCES: setProvenances((com.google.common.collect.ImmutableList<String>)value); return this;
            case PUBLISHERS: setPublishers((com.google.common.collect.ImmutableList<String>)value); return this;
            case RELATIONS: setRelations((com.google.common.collect.ImmutableList<String>)value); return this;
            case RIGHTS: setRights((com.google.common.collect.ImmutableList<String>)value); return this;
            case RIGHTS_HOLDERS: setRightsHolders((com.google.common.collect.ImmutableList<String>)value); return this;
            case SOURCES: setSources((com.google.common.collect.ImmutableList<String>)value); return this;
            case SPATIALS: setSpatials((com.google.common.collect.ImmutableList<String>)value); return this;
            case SUBJECTS: setSubjects((com.google.common.collect.ImmutableList<String>)value); return this;
            case TEMPORALS: setTemporals((com.google.common.collect.ImmutableList<String>)value); return this;
            case TITLES: setTitles((com.google.common.collect.ImmutableList<String>)value); return this;
            case TYPES: setTypes((com.google.common.collect.ImmutableList<String>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAbstracts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts) {
            Validator.validateAbstracts(abstracts);
            this.abstracts = abstracts;
            return this;
        }

        public Builder setAbstracts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> abstracts) {
            return setAbstracts(com.google.common.base.Optional.fromNullable(abstracts));
        }

        public Builder setAudiences(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences) {
            Validator.validateAudiences(audiences);
            this.audiences = audiences;
            return this;
        }

        public Builder setAudiences(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> audiences) {
            return setAudiences(com.google.common.base.Optional.fromNullable(audiences));
        }

        public Builder setContributors(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors) {
            Validator.validateContributors(contributors);
            this.contributors = contributors;
            return this;
        }

        public Builder setContributors(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> contributors) {
            return setContributors(com.google.common.base.Optional.fromNullable(contributors));
        }

        public Builder setCoverages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages) {
            Validator.validateCoverages(coverages);
            this.coverages = coverages;
            return this;
        }

        public Builder setCoverages(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> coverages) {
            return setCoverages(com.google.common.base.Optional.fromNullable(coverages));
        }

        public Builder setCreateds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds) {
            Validator.validateCreateds(createds);
            this.createds = createds;
            return this;
        }

        public Builder setCreateds(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> createds) {
            return setCreateds(com.google.common.base.Optional.fromNullable(createds));
        }

        public Builder setCreators(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators) {
            Validator.validateCreators(creators);
            this.creators = creators;
            return this;
        }

        public Builder setCreators(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> creators) {
            return setCreators(com.google.common.base.Optional.fromNullable(creators));
        }

        public Builder setDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates) {
            Validator.validateDates(dates);
            this.dates = dates;
            return this;
        }

        public Builder setDates(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> dates) {
            return setDates(com.google.common.base.Optional.fromNullable(dates));
        }

        public Builder setDescriptions(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions) {
            Validator.validateDescriptions(descriptions);
            this.descriptions = descriptions;
            return this;
        }

        public Builder setDescriptions(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> descriptions) {
            return setDescriptions(com.google.common.base.Optional.fromNullable(descriptions));
        }

        public Builder setExtents(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents) {
            Validator.validateExtents(extents);
            this.extents = extents;
            return this;
        }

        public Builder setExtents(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> extents) {
            return setExtents(com.google.common.base.Optional.fromNullable(extents));
        }

        public Builder setFormats(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats) {
            Validator.validateFormats(formats);
            this.formats = formats;
            return this;
        }

        public Builder setFormats(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> formats) {
            return setFormats(com.google.common.base.Optional.fromNullable(formats));
        }

        public Builder setIdentifiers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers) {
            Validator.validateIdentifiers(identifiers);
            this.identifiers = identifiers;
            return this;
        }

        public Builder setIdentifiers(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> identifiers) {
            return setIdentifiers(com.google.common.base.Optional.fromNullable(identifiers));
        }

        public Builder setIfPresent(final DublinCoreObject other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getAbstracts().isPresent()) {
                setAbstracts(other.getAbstracts());
            }
            if (other.getAudiences().isPresent()) {
                setAudiences(other.getAudiences());
            }
            if (other.getContributors().isPresent()) {
                setContributors(other.getContributors());
            }
            if (other.getCoverages().isPresent()) {
                setCoverages(other.getCoverages());
            }
            if (other.getCreateds().isPresent()) {
                setCreateds(other.getCreateds());
            }
            if (other.getCreators().isPresent()) {
                setCreators(other.getCreators());
            }
            if (other.getDates().isPresent()) {
                setDates(other.getDates());
            }
            if (other.getDescriptions().isPresent()) {
                setDescriptions(other.getDescriptions());
            }
            if (other.getExtents().isPresent()) {
                setExtents(other.getExtents());
            }
            if (other.getFormats().isPresent()) {
                setFormats(other.getFormats());
            }
            if (other.getIdentifiers().isPresent()) {
                setIdentifiers(other.getIdentifiers());
            }
            if (other.getLanguages().isPresent()) {
                setLanguages(other.getLanguages());
            }
            if (other.getMediums().isPresent()) {
                setMediums(other.getMediums());
            }
            if (other.getProvenances().isPresent()) {
                setProvenances(other.getProvenances());
            }
            if (other.getPublishers().isPresent()) {
                setPublishers(other.getPublishers());
            }
            if (other.getRelations().isPresent()) {
                setRelations(other.getRelations());
            }
            if (other.getRights().isPresent()) {
                setRights(other.getRights());
            }
            if (other.getRightsHolders().isPresent()) {
                setRightsHolders(other.getRightsHolders());
            }
            if (other.getSources().isPresent()) {
                setSources(other.getSources());
            }
            if (other.getSpatials().isPresent()) {
                setSpatials(other.getSpatials());
            }
            if (other.getSubjects().isPresent()) {
                setSubjects(other.getSubjects());
            }
            if (other.getTemporals().isPresent()) {
                setTemporals(other.getTemporals());
            }
            if (other.getTitles().isPresent()) {
                setTitles(other.getTitles());
            }
            if (other.getTypes().isPresent()) {
                setTypes(other.getTypes());
            }

            return this;
        }

        public Builder setLanguages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages) {
            Validator.validateLanguages(languages);
            this.languages = languages;
            return this;
        }

        public Builder setLanguages(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> languages) {
            return setLanguages(com.google.common.base.Optional.fromNullable(languages));
        }

        public Builder setMediums(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums) {
            Validator.validateMediums(mediums);
            this.mediums = mediums;
            return this;
        }

        public Builder setMediums(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> mediums) {
            return setMediums(com.google.common.base.Optional.fromNullable(mediums));
        }

        public Builder setProvenances(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances) {
            Validator.validateProvenances(provenances);
            this.provenances = provenances;
            return this;
        }

        public Builder setProvenances(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> provenances) {
            return setProvenances(com.google.common.base.Optional.fromNullable(provenances));
        }

        public Builder setPublishers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers) {
            Validator.validatePublishers(publishers);
            this.publishers = publishers;
            return this;
        }

        public Builder setPublishers(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> publishers) {
            return setPublishers(com.google.common.base.Optional.fromNullable(publishers));
        }

        public Builder setRelations(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations) {
            Validator.validateRelations(relations);
            this.relations = relations;
            return this;
        }

        public Builder setRelations(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> relations) {
            return setRelations(com.google.common.base.Optional.fromNullable(relations));
        }

        public Builder setRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
            Validator.validateRights(rights);
            this.rights = rights;
            return this;
        }

        public Builder setRights(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> rights) {
            return setRights(com.google.common.base.Optional.fromNullable(rights));
        }

        public Builder setRightsHolders(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders) {
            Validator.validateRightsHolders(rightsHolders);
            this.rightsHolders = rightsHolders;
            return this;
        }

        public Builder setRightsHolders(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> rightsHolders) {
            return setRightsHolders(com.google.common.base.Optional.fromNullable(rightsHolders));
        }

        public Builder setSources(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources) {
            Validator.validateSources(sources);
            this.sources = sources;
            return this;
        }

        public Builder setSources(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> sources) {
            return setSources(com.google.common.base.Optional.fromNullable(sources));
        }

        public Builder setSpatials(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials) {
            Validator.validateSpatials(spatials);
            this.spatials = spatials;
            return this;
        }

        public Builder setSpatials(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> spatials) {
            return setSpatials(com.google.common.base.Optional.fromNullable(spatials));
        }

        public Builder setSubjects(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects) {
            Validator.validateSubjects(subjects);
            this.subjects = subjects;
            return this;
        }

        public Builder setSubjects(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> subjects) {
            return setSubjects(com.google.common.base.Optional.fromNullable(subjects));
        }

        public Builder setTemporals(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals) {
            Validator.validateTemporals(temporals);
            this.temporals = temporals;
            return this;
        }

        public Builder setTemporals(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> temporals) {
            return setTemporals(com.google.common.base.Optional.fromNullable(temporals));
        }

        public Builder setTitles(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles) {
            Validator.validateTitles(titles);
            this.titles = titles;
            return this;
        }

        public Builder setTitles(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> titles) {
            return setTitles(com.google.common.base.Optional.fromNullable(titles));
        }

        public Builder setTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
            Validator.validateTypes(types);
            this.types = types;
            return this;
        }

        public Builder setTypes(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> types) {
            return setTypes(com.google.common.base.Optional.fromNullable(types));
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
            case ABSTRACTS: return unsetAbstracts();
            case AUDIENCES: return unsetAudiences();
            case CONTRIBUTORS: return unsetContributors();
            case COVERAGES: return unsetCoverages();
            case CREATEDS: return unsetCreateds();
            case CREATORS: return unsetCreators();
            case DATES: return unsetDates();
            case DESCRIPTIONS: return unsetDescriptions();
            case EXTENTS: return unsetExtents();
            case FORMATS: return unsetFormats();
            case IDENTIFIERS: return unsetIdentifiers();
            case LANGUAGES: return unsetLanguages();
            case MEDIUMS: return unsetMediums();
            case PROVENANCES: return unsetProvenances();
            case PUBLISHERS: return unsetPublishers();
            case RELATIONS: return unsetRelations();
            case RIGHTS: return unsetRights();
            case RIGHTS_HOLDERS: return unsetRightsHolders();
            case SOURCES: return unsetSources();
            case SPATIALS: return unsetSpatials();
            case SUBJECTS: return unsetSubjects();
            case TEMPORALS: return unsetTemporals();
            case TITLES: return unsetTitles();
            case TYPES: return unsetTypes();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAbstracts() {
            this.abstracts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetAudiences() {
            this.audiences = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetContributors() {
            this.contributors = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetCoverages() {
            this.coverages = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetCreateds() {
            this.createds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetCreators() {
            this.creators = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetDates() {
            this.dates = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetDescriptions() {
            this.descriptions = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetExtents() {
            this.extents = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetFormats() {
            this.formats = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetIdentifiers() {
            this.identifiers = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetLanguages() {
            this.languages = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetMediums() {
            this.mediums = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetProvenances() {
            this.provenances = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetPublishers() {
            this.publishers = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetRelations() {
            this.relations = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetRights() {
            this.rights = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetRightsHolders() {
            this.rightsHolders = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetSources() {
            this.sources = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetSpatials() {
            this.spatials = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetSubjects() {
            this.subjects = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetTemporals() {
            this.temporals = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetTitles() {
            this.titles = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetTypes() {
            this.types = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<DublinCoreObject> {
        @Override
        public DublinCoreObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DublinCoreObject.readAsList(iprot);
        }

        @Override
        public DublinCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DublinCoreObject.readAsStruct(iprot);
        }

        @Override
        public DublinCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return DublinCoreObject.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ABSTRACTS("abstracts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)24, "abstracts", "24:abstracts", org.thryft.protocol.Type.LIST),
        AUDIENCES("audiences", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)1, "audiences", "1:audiences", org.thryft.protocol.Type.LIST),
        CONTRIBUTORS("contributors", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)2, "contributors", "2:contributors", org.thryft.protocol.Type.LIST),
        COVERAGES("coverages", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)3, "coverages", "3:coverages", org.thryft.protocol.Type.LIST),
        CREATEDS("createds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)20, "createds", "20:createds", org.thryft.protocol.Type.LIST),
        CREATORS("creators", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)4, "creators", "4:creators", org.thryft.protocol.Type.LIST),
        DATES("dates", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)5, "dates", "5:dates", org.thryft.protocol.Type.LIST),
        DESCRIPTIONS("descriptions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)6, "descriptions", "6:descriptions", org.thryft.protocol.Type.LIST),
        EXTENTS("extents", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)19, "extents", "19:extents", org.thryft.protocol.Type.LIST),
        FORMATS("formats", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)8, "formats", "8:formats", org.thryft.protocol.Type.LIST),
        IDENTIFIERS("identifiers", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)7, "identifiers", "7:identifiers", org.thryft.protocol.Type.LIST),
        LANGUAGES("languages", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)9, "languages", "9:languages", org.thryft.protocol.Type.LIST),
        MEDIUMS("mediums", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)23, "mediums", "23:mediums", org.thryft.protocol.Type.LIST),
        PROVENANCES("provenances", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)10, "provenances", "10:provenances", org.thryft.protocol.Type.LIST),
        PUBLISHERS("publishers", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)11, "publishers", "11:publishers", org.thryft.protocol.Type.LIST),
        RELATIONS("relations", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)12, "relations", "12:relations", org.thryft.protocol.Type.LIST),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)13, "rights", "13:rights", org.thryft.protocol.Type.LIST),
        RIGHTS_HOLDERS("rightsHolders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)14, "rights_holders", "14:rights_holders", org.thryft.protocol.Type.LIST),
        SOURCES("sources", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)15, "sources", "15:sources", org.thryft.protocol.Type.LIST),
        SPATIALS("spatials", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)21, "spatials", "21:spatials", org.thryft.protocol.Type.LIST),
        SUBJECTS("subjects", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)16, "subjects", "16:subjects", org.thryft.protocol.Type.LIST),
        TEMPORALS("temporals", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)22, "temporals", "22:temporals", org.thryft.protocol.Type.LIST),
        TITLES("titles", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)17, "titles", "17:titles", org.thryft.protocol.Type.LIST),
        TYPES("types", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)18, "types", "18:types", org.thryft.protocol.Type.LIST);

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
            case "abstracts": return ABSTRACTS;
            case "audiences": return AUDIENCES;
            case "contributors": return CONTRIBUTORS;
            case "coverages": return COVERAGES;
            case "createds": return CREATEDS;
            case "creators": return CREATORS;
            case "dates": return DATES;
            case "descriptions": return DESCRIPTIONS;
            case "extents": return EXTENTS;
            case "formats": return FORMATS;
            case "identifiers": return IDENTIFIERS;
            case "languages": return LANGUAGES;
            case "mediums": return MEDIUMS;
            case "provenances": return PROVENANCES;
            case "publishers": return PUBLISHERS;
            case "relations": return RELATIONS;
            case "rights": return RIGHTS;
            case "rightsHolders": return RIGHTS_HOLDERS;
            case "sources": return SOURCES;
            case "spatials": return SPATIALS;
            case "subjects": return SUBJECTS;
            case "temporals": return TEMPORALS;
            case "titles": return TITLES;
            case "types": return TYPES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "abstracts": return ABSTRACTS;
            case "audiences": return AUDIENCES;
            case "contributors": return CONTRIBUTORS;
            case "coverages": return COVERAGES;
            case "createds": return CREATEDS;
            case "creators": return CREATORS;
            case "dates": return DATES;
            case "descriptions": return DESCRIPTIONS;
            case "extents": return EXTENTS;
            case "formats": return FORMATS;
            case "identifiers": return IDENTIFIERS;
            case "languages": return LANGUAGES;
            case "mediums": return MEDIUMS;
            case "provenances": return PROVENANCES;
            case "publishers": return PUBLISHERS;
            case "relations": return RELATIONS;
            case "rights": return RIGHTS;
            case "rights_holders": return RIGHTS_HOLDERS;
            case "sources": return SOURCES;
            case "spatials": return SPATIALS;
            case "subjects": return SUBJECTS;
            case "temporals": return TEMPORALS;
            case "titles": return TITLES;
            case "types": return TYPES;
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
        public static void validate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
            validateAbstracts(abstracts);
            validateAudiences(audiences);
            validateContributors(contributors);
            validateCoverages(coverages);
            validateCreateds(createds);
            validateCreators(creators);
            validateDates(dates);
            validateDescriptions(descriptions);
            validateExtents(extents);
            validateFormats(formats);
            validateIdentifiers(identifiers);
            validateLanguages(languages);
            validateMediums(mediums);
            validateProvenances(provenances);
            validatePublishers(publishers);
            validateRelations(relations);
            validateRights(rights);
            validateRightsHolders(rightsHolders);
            validateSources(sources);
            validateSpatials(spatials);
            validateSubjects(subjects);
            validateTemporals(temporals);
            validateTitles(titles);
            validateTypes(types);
        }

        public static void validateAbstracts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts) {
            if (abstracts == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: abstracts is missing");
            }
            if (abstracts.isPresent()) {
                if (abstracts.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: abstracts: less than min length 1");
                }
            }
        }

        public static void validateAudiences(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences) {
            if (audiences == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: audiences is missing");
            }
            if (audiences.isPresent()) {
                if (audiences.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: audiences: less than min length 1");
                }
            }
        }

        public static void validateContributors(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors) {
            if (contributors == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: contributors is missing");
            }
            if (contributors.isPresent()) {
                if (contributors.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: contributors: less than min length 1");
                }
            }
        }

        public static void validateCoverages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages) {
            if (coverages == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: coverages is missing");
            }
            if (coverages.isPresent()) {
                if (coverages.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: coverages: less than min length 1");
                }
            }
        }

        public static void validateCreateds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds) {
            if (createds == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: createds is missing");
            }
            if (createds.isPresent()) {
                if (createds.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: createds: less than min length 1");
                }
            }
        }

        public static void validateCreators(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators) {
            if (creators == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: creators is missing");
            }
            if (creators.isPresent()) {
                if (creators.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: creators: less than min length 1");
                }
            }
        }

        public static void validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates) {
            if (dates == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: dates is missing");
            }
            if (dates.isPresent()) {
                if (dates.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: dates: less than min length 1");
                }
            }
        }

        public static void validateDescriptions(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions) {
            if (descriptions == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: descriptions is missing");
            }
            if (descriptions.isPresent()) {
                if (descriptions.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: descriptions: less than min length 1");
                }
            }
        }

        public static void validateExtents(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents) {
            if (extents == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: extents is missing");
            }
            if (extents.isPresent()) {
                if (extents.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: extents: less than min length 1");
                }
            }
        }

        public static void validateFormats(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats) {
            if (formats == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: formats is missing");
            }
            if (formats.isPresent()) {
                if (formats.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: formats: less than min length 1");
                }
            }
        }

        public static void validateIdentifiers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers) {
            if (identifiers == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: identifiers is missing");
            }
            if (identifiers.isPresent()) {
                if (identifiers.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: identifiers: less than min length 1");
                }
            }
        }

        public static void validateLanguages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages) {
            if (languages == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: languages is missing");
            }
            if (languages.isPresent()) {
                if (languages.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: languages: less than min length 1");
                }
            }
        }

        public static void validateMediums(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums) {
            if (mediums == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: mediums is missing");
            }
            if (mediums.isPresent()) {
                if (mediums.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: mediums: less than min length 1");
                }
            }
        }

        public static void validateProvenances(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances) {
            if (provenances == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: provenances is missing");
            }
            if (provenances.isPresent()) {
                if (provenances.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: provenances: less than min length 1");
                }
            }
        }

        public static void validatePublishers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers) {
            if (publishers == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: publishers is missing");
            }
            if (publishers.isPresent()) {
                if (publishers.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: publishers: less than min length 1");
                }
            }
        }

        public static void validateRelations(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations) {
            if (relations == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: relations is missing");
            }
            if (relations.isPresent()) {
                if (relations.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: relations: less than min length 1");
                }
            }
        }

        public static void validateRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
            if (rights == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rights is missing");
            }
            if (rights.isPresent()) {
                if (rights.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rights: less than min length 1");
                }
            }
        }

        public static void validateRightsHolders(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders) {
            if (rightsHolders == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rightsHolders is missing");
            }
            if (rightsHolders.isPresent()) {
                if (rightsHolders.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rightsHolders: less than min length 1");
                }
            }
        }

        public static void validateSources(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources) {
            if (sources == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: sources is missing");
            }
            if (sources.isPresent()) {
                if (sources.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: sources: less than min length 1");
                }
            }
        }

        public static void validateSpatials(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials) {
            if (spatials == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: spatials is missing");
            }
            if (spatials.isPresent()) {
                if (spatials.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: spatials: less than min length 1");
                }
            }
        }

        public static void validateSubjects(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects) {
            if (subjects == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: subjects is missing");
            }
            if (subjects.isPresent()) {
                if (subjects.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: subjects: less than min length 1");
                }
            }
        }

        public static void validateTemporals(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals) {
            if (temporals == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: temporals is missing");
            }
            if (temporals.isPresent()) {
                if (temporals.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: temporals: less than min length 1");
                }
            }
        }

        public static void validateTitles(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles) {
            if (titles == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: titles is missing");
            }
            if (titles.isPresent()) {
                if (titles.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: titles: less than min length 1");
                }
            }
        }

        public static void validateTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
            if (types == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: types is missing");
            }
            if (types.isPresent()) {
                if (types.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: types: less than min length 1");
                }
            }
        }
    }

    /**
     * Default constructor
     */
    @Deprecated
    public DublinCoreObject() {
        abstracts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        audiences = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        contributors = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        coverages = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        createds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        creators = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        dates = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        descriptions = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        extents = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        formats = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        identifiers = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        languages = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        mediums = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        provenances = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        publishers = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        relations = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        rights = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        rightsHolders = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        sources = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        spatials = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        subjects = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        temporals = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        titles = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        types = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
    }

    /**
     * Copy constructor
     */
    public DublinCoreObject(final DublinCoreObject other) {
        this(other.getAbstracts(), other.getAudiences(), other.getContributors(), other.getCoverages(), other.getCreateds(), other.getCreators(), other.getDates(), other.getDescriptions(), other.getExtents(), other.getFormats(), other.getIdentifiers(), other.getLanguages(), other.getMediums(), other.getProvenances(), other.getPublishers(), other.getRelations(), other.getRights(), other.getRightsHolders(), other.getSources(), other.getSpatials(), other.getSubjects(), other.getTemporals(), other.getTitles(), other.getTypes());
    }

    /**
     * Total constructor
     */
    public DublinCoreObject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
        Validator.validate(abstracts, audiences, contributors, coverages, createds, creators, dates, descriptions, extents, formats, identifiers, languages, mediums, provenances, publishers, relations, rights, rightsHolders, sources, spatials, subjects, temporals, titles, types);
        this.abstracts = abstracts;
        this.audiences = audiences;
        this.contributors = contributors;
        this.coverages = coverages;
        this.createds = createds;
        this.creators = creators;
        this.dates = dates;
        this.descriptions = descriptions;
        this.extents = extents;
        this.formats = formats;
        this.identifiers = identifiers;
        this.languages = languages;
        this.mediums = mediums;
        this.provenances = provenances;
        this.publishers = publishers;
        this.relations = relations;
        this.rights = rights;
        this.rightsHolders = rightsHolders;
        this.sources = sources;
        this.spatials = spatials;
        this.subjects = subjects;
        this.temporals = temporals;
        this.titles = titles;
        this.types = types;
    }

    /**
     * Total Nullable constructor
     */
    public DublinCoreObject(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> abstracts, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> audiences, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> contributors, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> coverages, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> createds, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> creators, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> dates, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> descriptions, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> extents, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> formats, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> identifiers, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> languages, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> mediums, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> provenances, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> publishers, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> relations, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> rights, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> rightsHolders, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> sources, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> spatials, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> subjects, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> temporals, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> titles, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> types) {
        this(com.google.common.base.Optional.fromNullable(abstracts), com.google.common.base.Optional.fromNullable(audiences), com.google.common.base.Optional.fromNullable(contributors), com.google.common.base.Optional.fromNullable(coverages), com.google.common.base.Optional.fromNullable(createds), com.google.common.base.Optional.fromNullable(creators), com.google.common.base.Optional.fromNullable(dates), com.google.common.base.Optional.fromNullable(descriptions), com.google.common.base.Optional.fromNullable(extents), com.google.common.base.Optional.fromNullable(formats), com.google.common.base.Optional.fromNullable(identifiers), com.google.common.base.Optional.fromNullable(languages), com.google.common.base.Optional.fromNullable(mediums), com.google.common.base.Optional.fromNullable(provenances), com.google.common.base.Optional.fromNullable(publishers), com.google.common.base.Optional.fromNullable(relations), com.google.common.base.Optional.fromNullable(rights), com.google.common.base.Optional.fromNullable(rightsHolders), com.google.common.base.Optional.fromNullable(sources), com.google.common.base.Optional.fromNullable(spatials), com.google.common.base.Optional.fromNullable(subjects), com.google.common.base.Optional.fromNullable(temporals), com.google.common.base.Optional.fromNullable(titles), com.google.common.base.Optional.fromNullable(types));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final DublinCoreObject other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<DublinCoreObject> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof DublinCoreObject)) {
            return false;
        }

        final DublinCoreObject other = (DublinCoreObject)otherObject;

        if (!(((getAbstracts().isPresent() && other.getAbstracts().isPresent()) ? (getAbstracts().get().equals(other.getAbstracts().get())) : (!getAbstracts().isPresent() && !other.getAbstracts().isPresent())))) {
            return false;
        }

        if (!(((getAudiences().isPresent() && other.getAudiences().isPresent()) ? (getAudiences().get().equals(other.getAudiences().get())) : (!getAudiences().isPresent() && !other.getAudiences().isPresent())))) {
            return false;
        }

        if (!(((getContributors().isPresent() && other.getContributors().isPresent()) ? (getContributors().get().equals(other.getContributors().get())) : (!getContributors().isPresent() && !other.getContributors().isPresent())))) {
            return false;
        }

        if (!(((getCoverages().isPresent() && other.getCoverages().isPresent()) ? (getCoverages().get().equals(other.getCoverages().get())) : (!getCoverages().isPresent() && !other.getCoverages().isPresent())))) {
            return false;
        }

        if (!(((getCreateds().isPresent() && other.getCreateds().isPresent()) ? (getCreateds().get().equals(other.getCreateds().get())) : (!getCreateds().isPresent() && !other.getCreateds().isPresent())))) {
            return false;
        }

        if (!(((getCreators().isPresent() && other.getCreators().isPresent()) ? (getCreators().get().equals(other.getCreators().get())) : (!getCreators().isPresent() && !other.getCreators().isPresent())))) {
            return false;
        }

        if (!(((getDates().isPresent() && other.getDates().isPresent()) ? (getDates().get().equals(other.getDates().get())) : (!getDates().isPresent() && !other.getDates().isPresent())))) {
            return false;
        }

        if (!(((getDescriptions().isPresent() && other.getDescriptions().isPresent()) ? (getDescriptions().get().equals(other.getDescriptions().get())) : (!getDescriptions().isPresent() && !other.getDescriptions().isPresent())))) {
            return false;
        }

        if (!(((getExtents().isPresent() && other.getExtents().isPresent()) ? (getExtents().get().equals(other.getExtents().get())) : (!getExtents().isPresent() && !other.getExtents().isPresent())))) {
            return false;
        }

        if (!(((getFormats().isPresent() && other.getFormats().isPresent()) ? (getFormats().get().equals(other.getFormats().get())) : (!getFormats().isPresent() && !other.getFormats().isPresent())))) {
            return false;
        }

        if (!(((getIdentifiers().isPresent() && other.getIdentifiers().isPresent()) ? (getIdentifiers().get().equals(other.getIdentifiers().get())) : (!getIdentifiers().isPresent() && !other.getIdentifiers().isPresent())))) {
            return false;
        }

        if (!(((getLanguages().isPresent() && other.getLanguages().isPresent()) ? (getLanguages().get().equals(other.getLanguages().get())) : (!getLanguages().isPresent() && !other.getLanguages().isPresent())))) {
            return false;
        }

        if (!(((getMediums().isPresent() && other.getMediums().isPresent()) ? (getMediums().get().equals(other.getMediums().get())) : (!getMediums().isPresent() && !other.getMediums().isPresent())))) {
            return false;
        }

        if (!(((getProvenances().isPresent() && other.getProvenances().isPresent()) ? (getProvenances().get().equals(other.getProvenances().get())) : (!getProvenances().isPresent() && !other.getProvenances().isPresent())))) {
            return false;
        }

        if (!(((getPublishers().isPresent() && other.getPublishers().isPresent()) ? (getPublishers().get().equals(other.getPublishers().get())) : (!getPublishers().isPresent() && !other.getPublishers().isPresent())))) {
            return false;
        }

        if (!(((getRelations().isPresent() && other.getRelations().isPresent()) ? (getRelations().get().equals(other.getRelations().get())) : (!getRelations().isPresent() && !other.getRelations().isPresent())))) {
            return false;
        }

        if (!(((getRights().isPresent() && other.getRights().isPresent()) ? (getRights().get().equals(other.getRights().get())) : (!getRights().isPresent() && !other.getRights().isPresent())))) {
            return false;
        }

        if (!(((getRightsHolders().isPresent() && other.getRightsHolders().isPresent()) ? (getRightsHolders().get().equals(other.getRightsHolders().get())) : (!getRightsHolders().isPresent() && !other.getRightsHolders().isPresent())))) {
            return false;
        }

        if (!(((getSources().isPresent() && other.getSources().isPresent()) ? (getSources().get().equals(other.getSources().get())) : (!getSources().isPresent() && !other.getSources().isPresent())))) {
            return false;
        }

        if (!(((getSpatials().isPresent() && other.getSpatials().isPresent()) ? (getSpatials().get().equals(other.getSpatials().get())) : (!getSpatials().isPresent() && !other.getSpatials().isPresent())))) {
            return false;
        }

        if (!(((getSubjects().isPresent() && other.getSubjects().isPresent()) ? (getSubjects().get().equals(other.getSubjects().get())) : (!getSubjects().isPresent() && !other.getSubjects().isPresent())))) {
            return false;
        }

        if (!(((getTemporals().isPresent() && other.getTemporals().isPresent()) ? (getTemporals().get().equals(other.getTemporals().get())) : (!getTemporals().isPresent() && !other.getTemporals().isPresent())))) {
            return false;
        }

        if (!(((getTitles().isPresent() && other.getTitles().isPresent()) ? (getTitles().get().equals(other.getTitles().get())) : (!getTitles().isPresent() && !other.getTitles().isPresent())))) {
            return false;
        }

        if (!(((getTypes().isPresent() && other.getTypes().isPresent()) ? (getTypes().get().equals(other.getTypes().get())) : (!getTypes().isPresent() && !other.getTypes().isPresent())))) {
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
        case ABSTRACTS: return getAbstracts();
        case AUDIENCES: return getAudiences();
        case CONTRIBUTORS: return getContributors();
        case COVERAGES: return getCoverages();
        case CREATEDS: return getCreateds();
        case CREATORS: return getCreators();
        case DATES: return getDates();
        case DESCRIPTIONS: return getDescriptions();
        case EXTENTS: return getExtents();
        case FORMATS: return getFormats();
        case IDENTIFIERS: return getIdentifiers();
        case LANGUAGES: return getLanguages();
        case MEDIUMS: return getMediums();
        case PROVENANCES: return getProvenances();
        case PUBLISHERS: return getPublishers();
        case RELATIONS: return getRelations();
        case RIGHTS: return getRights();
        case RIGHTS_HOLDERS: return getRightsHolders();
        case SOURCES: return getSources();
        case SPATIALS: return getSpatials();
        case SUBJECTS: return getSubjects();
        case TEMPORALS: return getTemporals();
        case TITLES: return getTitles();
        case TYPES: return getTypes();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAbstracts() {
        return abstracts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAudiences() {
        return audiences;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getContributors() {
        return contributors;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCoverages() {
        return coverages;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCreateds() {
        return createds;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCreators() {
        return creators;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getDates() {
        return dates;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getDescriptions() {
        return descriptions;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getExtents() {
        return extents;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getFormats() {
        return formats;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getIdentifiers() {
        return identifiers;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getLanguages() {
        return languages;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getMediums() {
        return mediums;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getProvenances() {
        return provenances;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getPublishers() {
        return publishers;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRelations() {
        return relations;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRights() {
        return rights;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRightsHolders() {
        return rightsHolders;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSources() {
        return sources;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSpatials() {
        return spatials;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSubjects() {
        return subjects;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTemporals() {
        return temporals;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTitles() {
        return titles;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTypes() {
        return types;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getAbstracts().isPresent()) {
            hashCode = 31 * hashCode + getAbstracts().get().hashCode();
        }
        if (getAudiences().isPresent()) {
            hashCode = 31 * hashCode + getAudiences().get().hashCode();
        }
        if (getContributors().isPresent()) {
            hashCode = 31 * hashCode + getContributors().get().hashCode();
        }
        if (getCoverages().isPresent()) {
            hashCode = 31 * hashCode + getCoverages().get().hashCode();
        }
        if (getCreateds().isPresent()) {
            hashCode = 31 * hashCode + getCreateds().get().hashCode();
        }
        if (getCreators().isPresent()) {
            hashCode = 31 * hashCode + getCreators().get().hashCode();
        }
        if (getDates().isPresent()) {
            hashCode = 31 * hashCode + getDates().get().hashCode();
        }
        if (getDescriptions().isPresent()) {
            hashCode = 31 * hashCode + getDescriptions().get().hashCode();
        }
        if (getExtents().isPresent()) {
            hashCode = 31 * hashCode + getExtents().get().hashCode();
        }
        if (getFormats().isPresent()) {
            hashCode = 31 * hashCode + getFormats().get().hashCode();
        }
        if (getIdentifiers().isPresent()) {
            hashCode = 31 * hashCode + getIdentifiers().get().hashCode();
        }
        if (getLanguages().isPresent()) {
            hashCode = 31 * hashCode + getLanguages().get().hashCode();
        }
        if (getMediums().isPresent()) {
            hashCode = 31 * hashCode + getMediums().get().hashCode();
        }
        if (getProvenances().isPresent()) {
            hashCode = 31 * hashCode + getProvenances().get().hashCode();
        }
        if (getPublishers().isPresent()) {
            hashCode = 31 * hashCode + getPublishers().get().hashCode();
        }
        if (getRelations().isPresent()) {
            hashCode = 31 * hashCode + getRelations().get().hashCode();
        }
        if (getRights().isPresent()) {
            hashCode = 31 * hashCode + getRights().get().hashCode();
        }
        if (getRightsHolders().isPresent()) {
            hashCode = 31 * hashCode + getRightsHolders().get().hashCode();
        }
        if (getSources().isPresent()) {
            hashCode = 31 * hashCode + getSources().get().hashCode();
        }
        if (getSpatials().isPresent()) {
            hashCode = 31 * hashCode + getSpatials().get().hashCode();
        }
        if (getSubjects().isPresent()) {
            hashCode = 31 * hashCode + getSubjects().get().hashCode();
        }
        if (getTemporals().isPresent()) {
            hashCode = 31 * hashCode + getTemporals().get().hashCode();
        }
        if (getTitles().isPresent()) {
            hashCode = 31 * hashCode + getTitles().get().hashCode();
        }
        if (getTypes().isPresent()) {
            hashCode = 31 * hashCode + getTypes().get().hashCode();
        }
        return hashCode;
    }

    public static DublinCoreObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static DublinCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static DublinCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public DublinCoreObject replaceAbstracts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts) {
        Validator.validateAbstracts(abstracts);
        return new DublinCoreObject(abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceAbstracts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> abstracts) {
        return replaceAbstracts(com.google.common.base.Optional.fromNullable(abstracts));
    }

    public DublinCoreObject replaceAudiences(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences) {
        Validator.validateAudiences(audiences);
        return new DublinCoreObject(this.abstracts, audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceAudiences(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> audiences) {
        return replaceAudiences(com.google.common.base.Optional.fromNullable(audiences));
    }

    public DublinCoreObject replaceContributors(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors) {
        Validator.validateContributors(contributors);
        return new DublinCoreObject(this.abstracts, this.audiences, contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceContributors(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> contributors) {
        return replaceContributors(com.google.common.base.Optional.fromNullable(contributors));
    }

    public DublinCoreObject replaceCoverages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages) {
        Validator.validateCoverages(coverages);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceCoverages(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> coverages) {
        return replaceCoverages(com.google.common.base.Optional.fromNullable(coverages));
    }

    public DublinCoreObject replaceCreateds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds) {
        Validator.validateCreateds(createds);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceCreateds(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> createds) {
        return replaceCreateds(com.google.common.base.Optional.fromNullable(createds));
    }

    public DublinCoreObject replaceCreators(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators) {
        Validator.validateCreators(creators);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceCreators(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> creators) {
        return replaceCreators(com.google.common.base.Optional.fromNullable(creators));
    }

    public DublinCoreObject replaceDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates) {
        Validator.validateDates(dates);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceDates(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> dates) {
        return replaceDates(com.google.common.base.Optional.fromNullable(dates));
    }

    public DublinCoreObject replaceDescriptions(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions) {
        Validator.validateDescriptions(descriptions);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceDescriptions(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> descriptions) {
        return replaceDescriptions(com.google.common.base.Optional.fromNullable(descriptions));
    }

    public DublinCoreObject replaceExtents(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents) {
        Validator.validateExtents(extents);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceExtents(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> extents) {
        return replaceExtents(com.google.common.base.Optional.fromNullable(extents));
    }

    public DublinCoreObject replaceFormats(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats) {
        Validator.validateFormats(formats);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceFormats(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> formats) {
        return replaceFormats(com.google.common.base.Optional.fromNullable(formats));
    }

    public DublinCoreObject replaceIdentifiers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers) {
        Validator.validateIdentifiers(identifiers);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceIdentifiers(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> identifiers) {
        return replaceIdentifiers(com.google.common.base.Optional.fromNullable(identifiers));
    }

    public DublinCoreObject replaceLanguages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages) {
        Validator.validateLanguages(languages);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceLanguages(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> languages) {
        return replaceLanguages(com.google.common.base.Optional.fromNullable(languages));
    }

    public DublinCoreObject replaceMediums(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums) {
        Validator.validateMediums(mediums);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceMediums(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> mediums) {
        return replaceMediums(com.google.common.base.Optional.fromNullable(mediums));
    }

    public DublinCoreObject replaceProvenances(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances) {
        Validator.validateProvenances(provenances);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceProvenances(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> provenances) {
        return replaceProvenances(com.google.common.base.Optional.fromNullable(provenances));
    }

    public DublinCoreObject replacePublishers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers) {
        Validator.validatePublishers(publishers);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replacePublishers(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> publishers) {
        return replacePublishers(com.google.common.base.Optional.fromNullable(publishers));
    }

    public DublinCoreObject replaceRelations(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations) {
        Validator.validateRelations(relations);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceRelations(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> relations) {
        return replaceRelations(com.google.common.base.Optional.fromNullable(relations));
    }

    public DublinCoreObject replaceRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
        Validator.validateRights(rights);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceRightsHolders(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders) {
        Validator.validateRightsHolders(rightsHolders);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceRightsHolders(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> rightsHolders) {
        return replaceRightsHolders(com.google.common.base.Optional.fromNullable(rightsHolders));
    }

    public DublinCoreObject replaceRights(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> rights) {
        return replaceRights(com.google.common.base.Optional.fromNullable(rights));
    }

    public DublinCoreObject replaceSources(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources) {
        Validator.validateSources(sources);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, sources, this.spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceSources(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> sources) {
        return replaceSources(com.google.common.base.Optional.fromNullable(sources));
    }

    public DublinCoreObject replaceSpatials(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials) {
        Validator.validateSpatials(spatials);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, spatials, this.subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceSpatials(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> spatials) {
        return replaceSpatials(com.google.common.base.Optional.fromNullable(spatials));
    }

    public DublinCoreObject replaceSubjects(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects) {
        Validator.validateSubjects(subjects);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, subjects, this.temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceSubjects(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> subjects) {
        return replaceSubjects(com.google.common.base.Optional.fromNullable(subjects));
    }

    public DublinCoreObject replaceTemporals(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals) {
        Validator.validateTemporals(temporals);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, temporals, this.titles, this.types);
    }

    public DublinCoreObject replaceTemporals(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> temporals) {
        return replaceTemporals(com.google.common.base.Optional.fromNullable(temporals));
    }

    public DublinCoreObject replaceTitles(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles) {
        Validator.validateTitles(titles);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, titles, this.types);
    }

    public DublinCoreObject replaceTitles(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> titles) {
        return replaceTitles(com.google.common.base.Optional.fromNullable(titles));
    }

    public DublinCoreObject replaceTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
        Validator.validateTypes(types);
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, types);
    }

    public DublinCoreObject replaceTypes(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> types) {
        return replaceTypes(com.google.common.base.Optional.fromNullable(types));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("abstracts", getAbstracts().orNull()).add("audiences", getAudiences().orNull()).add("contributors", getContributors().orNull()).add("coverages", getCoverages().orNull()).add("createds", getCreateds().orNull()).add("creators", getCreators().orNull()).add("dates", getDates().orNull()).add("descriptions", getDescriptions().orNull()).add("extents", getExtents().orNull()).add("formats", getFormats().orNull()).add("identifiers", getIdentifiers().orNull()).add("languages", getLanguages().orNull()).add("mediums", getMediums().orNull()).add("provenances", getProvenances().orNull()).add("publishers", getPublishers().orNull()).add("relations", getRelations().orNull()).add("rights", getRights().orNull()).add("rights_holders", getRightsHolders().orNull()).add("sources", getSources().orNull()).add("spatials", getSpatials().orNull()).add("subjects", getSubjects().orNull()).add("temporals", getTemporals().orNull()).add("titles", getTitles().orNull()).add("types", getTypes().orNull()).toString();
    }

    public void writeAbstractsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAbstracts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.ABSTRACTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAbstracts().get().size());
            for (final String _iter0 : getAbstracts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 24);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeAudiencesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAudiences().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.AUDIENCES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAudiences().get().size());
            for (final String _iter0 : getAudiences().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeContributorsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getContributors().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.CONTRIBUTORS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getContributors().get().size());
            for (final String _iter0 : getContributors().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeCoveragesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCoverages().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.COVERAGES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCoverages().get().size());
            for (final String _iter0 : getCoverages().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeCreatedsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCreateds().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.CREATEDS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCreateds().get().size());
            for (final String _iter0 : getCreateds().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeCreatorsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCreators().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.CREATORS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCreators().get().size());
            for (final String _iter0 : getCreators().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeDatesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDates().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DATES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getDates().get().size());
            for (final String _iter0 : getDates().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeDescriptionsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDescriptions().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DESCRIPTIONS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getDescriptions().get().size());
            for (final String _iter0 : getDescriptions().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeExtentsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExtents().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXTENTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getExtents().get().size());
            for (final String _iter0 : getExtents().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAbstracts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAbstracts().get().size());
            for (final String _iter0 : getAbstracts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getAudiences().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAudiences().get().size());
            for (final String _iter0 : getAudiences().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getContributors().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getContributors().get().size());
            for (final String _iter0 : getContributors().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getCoverages().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCoverages().get().size());
            for (final String _iter0 : getCoverages().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getCreateds().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCreateds().get().size());
            for (final String _iter0 : getCreateds().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getCreators().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCreators().get().size());
            for (final String _iter0 : getCreators().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getDates().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getDates().get().size());
            for (final String _iter0 : getDates().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getDescriptions().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getDescriptions().get().size());
            for (final String _iter0 : getDescriptions().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getExtents().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getExtents().get().size());
            for (final String _iter0 : getExtents().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getFormats().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getFormats().get().size());
            for (final String _iter0 : getFormats().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getIdentifiers().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getIdentifiers().get().size());
            for (final String _iter0 : getIdentifiers().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getLanguages().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getLanguages().get().size());
            for (final String _iter0 : getLanguages().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getMediums().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getMediums().get().size());
            for (final String _iter0 : getMediums().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getProvenances().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getProvenances().get().size());
            for (final String _iter0 : getProvenances().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getPublishers().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getPublishers().get().size());
            for (final String _iter0 : getPublishers().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getRelations().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRelations().get().size());
            for (final String _iter0 : getRelations().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getRights().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRights().get().size());
            for (final String _iter0 : getRights().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getRightsHolders().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRightsHolders().get().size());
            for (final String _iter0 : getRightsHolders().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getSources().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSources().get().size());
            for (final String _iter0 : getSources().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getSpatials().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSpatials().get().size());
            for (final String _iter0 : getSpatials().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getSubjects().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSubjects().get().size());
            for (final String _iter0 : getSubjects().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getTemporals().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTemporals().get().size());
            for (final String _iter0 : getTemporals().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getTitles().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTitles().get().size());
            for (final String _iter0 : getTitles().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
        if (getTypes().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTypes().get().size());
            for (final String _iter0 : getTypes().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeAbstractsField(oprot);

        writeAudiencesField(oprot);

        writeContributorsField(oprot);

        writeCoveragesField(oprot);

        writeCreatedsField(oprot);

        writeCreatorsField(oprot);

        writeDatesField(oprot);

        writeDescriptionsField(oprot);

        writeExtentsField(oprot);

        writeFormatsField(oprot);

        writeIdentifiersField(oprot);

        writeLanguagesField(oprot);

        writeMediumsField(oprot);

        writeProvenancesField(oprot);

        writePublishersField(oprot);

        writeRelationsField(oprot);

        writeRightsField(oprot);

        writeRightsHoldersField(oprot);

        writeSourcesField(oprot);

        writeSpatialsField(oprot);

        writeSubjectsField(oprot);

        writeTemporalsField(oprot);

        writeTitlesField(oprot);

        writeTypesField(oprot);

        oprot.writeFieldStop();
    }

    public void writeFormatsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFormats().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.FORMATS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getFormats().get().size());
            for (final String _iter0 : getFormats().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeIdentifiersField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getIdentifiers().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.IDENTIFIERS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getIdentifiers().get().size());
            for (final String _iter0 : getIdentifiers().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeLanguagesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getLanguages().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.LANGUAGES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getLanguages().get().size());
            for (final String _iter0 : getLanguages().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeMediumsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getMediums().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.MEDIUMS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getMediums().get().size());
            for (final String _iter0 : getMediums().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeProvenancesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getProvenances().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.PROVENANCES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getProvenances().get().size());
            for (final String _iter0 : getProvenances().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writePublishersField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getPublishers().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.PUBLISHERS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getPublishers().get().size());
            for (final String _iter0 : getPublishers().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeRelationsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRelations().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.RELATIONS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRelations().get().size());
            for (final String _iter0 : getRelations().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeRightsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRights().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.RIGHTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRights().get().size());
            for (final String _iter0 : getRights().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeRightsHoldersField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRightsHolders().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.RIGHTS_HOLDERS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRightsHolders().get().size());
            for (final String _iter0 : getRightsHolders().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeSourcesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getSources().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.SOURCES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSources().get().size());
            for (final String _iter0 : getSources().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeSpatialsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getSpatials().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.SPATIALS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSpatials().get().size());
            for (final String _iter0 : getSpatials().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeSubjectsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getSubjects().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.SUBJECTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSubjects().get().size());
            for (final String _iter0 : getSubjects().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTemporalsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getTemporals().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TEMPORALS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTemporals().get().size());
            for (final String _iter0 : getTemporals().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTitlesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getTitles().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TITLES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTitles().get().size());
            for (final String _iter0 : getTitles().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTypesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getTypes().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TYPES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTypes().get().size());
            for (final String _iter0 : getTypes().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public final static DublinCoreObject EMPTY = new DublinCoreObject();

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types;
}
