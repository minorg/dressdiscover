package org.dressdiscover.api.vocabularies.dublin_core;

public final class DublinCoreObject implements org.thryft.Struct {
    public final static class Builder {
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
            return new DublinCoreObject(abstracts, audiences, contributors, coverages, createds, creators, dates, descriptions, extents, formats, identifiers, languages, mediums, provenances, publishers, relations, rights, rightsHolders, sources, spatials, subjects, temporals, titles, types, DefaultConstructionValidator.getInstance());
        }

        public DublinCoreObject build() {
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
                        abstracts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACTS, e.getCause());
                    }
                }
                if (__list.getSize() > 1) {
                    try {
                        audiences = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCES, e.getCause());
                    }
                }
                if (__list.getSize() > 2) {
                    try {
                        contributors = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTORS, e.getCause());
                    }
                }
                if (__list.getSize() > 3) {
                    try {
                        coverages = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGES, e.getCause());
                    }
                }
                if (__list.getSize() > 4) {
                    try {
                        createds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATEDS, e.getCause());
                    }
                }
                if (__list.getSize() > 5) {
                    try {
                        creators = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATORS, e.getCause());
                    }
                }
                if (__list.getSize() > 6) {
                    try {
                        dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                    }
                }
                if (__list.getSize() > 7) {
                    try {
                        descriptions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTIONS, e.getCause());
                    }
                }
                if (__list.getSize() > 8) {
                    try {
                        extents = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENTS, e.getCause());
                    }
                }
                if (__list.getSize() > 9) {
                    try {
                        formats = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMATS, e.getCause());
                    }
                }
                if (__list.getSize() > 10) {
                    try {
                        identifiers = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIERS, e.getCause());
                    }
                }
                if (__list.getSize() > 11) {
                    try {
                        languages = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGES, e.getCause());
                    }
                }
                if (__list.getSize() > 12) {
                    try {
                        mediums = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUMS, e.getCause());
                    }
                }
                if (__list.getSize() > 13) {
                    try {
                        provenances = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCES, e.getCause());
                    }
                }
                if (__list.getSize() > 14) {
                    try {
                        publishers = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHERS, e.getCause());
                    }
                }
                if (__list.getSize() > 15) {
                    try {
                        relations = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATIONS, e.getCause());
                    }
                }
                if (__list.getSize() > 16) {
                    try {
                        rights = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS, e.getCause());
                    }
                }
                if (__list.getSize() > 17) {
                    try {
                        rightsHolders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDERS, e.getCause());
                    }
                }
                if (__list.getSize() > 18) {
                    try {
                        sources = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCES, e.getCause());
                    }
                }
                if (__list.getSize() > 19) {
                    try {
                        spatials = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIALS, e.getCause());
                    }
                }
                if (__list.getSize() > 20) {
                    try {
                        subjects = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECTS, e.getCause());
                    }
                }
                if (__list.getSize() > 21) {
                    try {
                        temporals = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORALS, e.getCause());
                    }
                }
                if (__list.getSize() > 22) {
                    try {
                        titles = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLES, e.getCause());
                    }
                }
                if (__list.getSize() > 23) {
                    try {
                        types = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPES, e.getCause());
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
                    case "abstracts": {
                        if (!ifield.hasId() || ifield.getId() == 24) {
                            try {
                                abstracts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACTS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "audiences": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            try {
                                audiences = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "contributors": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            try {
                                contributors = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTORS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "coverages": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            try {
                                coverages = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "createds": {
                        if (!ifield.hasId() || ifield.getId() == 20) {
                            try {
                                createds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATEDS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "creators": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            try {
                                creators = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATORS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "dates": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            try {
                                dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "descriptions": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                            try {
                                descriptions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTIONS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "extents": {
                        if (!ifield.hasId() || ifield.getId() == 19) {
                            try {
                                extents = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENTS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "formats": {
                        if (!ifield.hasId() || ifield.getId() == 8) {
                            try {
                                formats = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMATS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "identifiers": {
                        if (!ifield.hasId() || ifield.getId() == 7) {
                            try {
                                identifiers = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIERS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "languages": {
                        if (!ifield.hasId() || ifield.getId() == 9) {
                            try {
                                languages = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "mediums": {
                        if (!ifield.hasId() || ifield.getId() == 23) {
                            try {
                                mediums = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUMS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "provenances": {
                        if (!ifield.hasId() || ifield.getId() == 10) {
                            try {
                                provenances = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "publishers": {
                        if (!ifield.hasId() || ifield.getId() == 11) {
                            try {
                                publishers = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHERS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "relations": {
                        if (!ifield.hasId() || ifield.getId() == 12) {
                            try {
                                relations = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATIONS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "rights": {
                        if (!ifield.hasId() || ifield.getId() == 13) {
                            try {
                                rights = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "rights_holders": {
                        if (!ifield.hasId() || ifield.getId() == 14) {
                            try {
                                rightsHolders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDERS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "sources": {
                        if (!ifield.hasId() || ifield.getId() == 15) {
                            try {
                                sources = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "spatials": {
                        if (!ifield.hasId() || ifield.getId() == 21) {
                            try {
                                spatials = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIALS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "subjects": {
                        if (!ifield.hasId() || ifield.getId() == 16) {
                            try {
                                subjects = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECTS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "temporals": {
                        if (!ifield.hasId() || ifield.getId() == 22) {
                            try {
                                temporals = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORALS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "titles": {
                        if (!ifield.hasId() || ifield.getId() == 17) {
                            try {
                                titles = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "types": {
                        if (!ifield.hasId() || ifield.getId() == 18) {
                            try {
                                types = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPES, e.getCause());
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
            this.abstracts = DefaultConstructionValidator.getInstance().validateAbstracts(abstracts);
            return this;
        }

        public Builder setAbstracts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> abstracts) {
            return setAbstracts(com.google.common.base.Optional.fromNullable(abstracts));
        }

        public Builder setAudiences(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences) {
            this.audiences = DefaultConstructionValidator.getInstance().validateAudiences(audiences);
            return this;
        }

        public Builder setAudiences(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> audiences) {
            return setAudiences(com.google.common.base.Optional.fromNullable(audiences));
        }

        public Builder setContributors(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors) {
            this.contributors = DefaultConstructionValidator.getInstance().validateContributors(contributors);
            return this;
        }

        public Builder setContributors(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> contributors) {
            return setContributors(com.google.common.base.Optional.fromNullable(contributors));
        }

        public Builder setCoverages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages) {
            this.coverages = DefaultConstructionValidator.getInstance().validateCoverages(coverages);
            return this;
        }

        public Builder setCoverages(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> coverages) {
            return setCoverages(com.google.common.base.Optional.fromNullable(coverages));
        }

        public Builder setCreateds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds) {
            this.createds = DefaultConstructionValidator.getInstance().validateCreateds(createds);
            return this;
        }

        public Builder setCreateds(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> createds) {
            return setCreateds(com.google.common.base.Optional.fromNullable(createds));
        }

        public Builder setCreators(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators) {
            this.creators = DefaultConstructionValidator.getInstance().validateCreators(creators);
            return this;
        }

        public Builder setCreators(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> creators) {
            return setCreators(com.google.common.base.Optional.fromNullable(creators));
        }

        public Builder setDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates) {
            this.dates = DefaultConstructionValidator.getInstance().validateDates(dates);
            return this;
        }

        public Builder setDates(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> dates) {
            return setDates(com.google.common.base.Optional.fromNullable(dates));
        }

        public Builder setDescriptions(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions) {
            this.descriptions = DefaultConstructionValidator.getInstance().validateDescriptions(descriptions);
            return this;
        }

        public Builder setDescriptions(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> descriptions) {
            return setDescriptions(com.google.common.base.Optional.fromNullable(descriptions));
        }

        public Builder setExtents(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents) {
            this.extents = DefaultConstructionValidator.getInstance().validateExtents(extents);
            return this;
        }

        public Builder setExtents(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> extents) {
            return setExtents(com.google.common.base.Optional.fromNullable(extents));
        }

        public Builder setFormats(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats) {
            this.formats = DefaultConstructionValidator.getInstance().validateFormats(formats);
            return this;
        }

        public Builder setFormats(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> formats) {
            return setFormats(com.google.common.base.Optional.fromNullable(formats));
        }

        public Builder setIdentifiers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers) {
            this.identifiers = DefaultConstructionValidator.getInstance().validateIdentifiers(identifiers);
            return this;
        }

        public Builder setIdentifiers(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> identifiers) {
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
            this.languages = DefaultConstructionValidator.getInstance().validateLanguages(languages);
            return this;
        }

        public Builder setLanguages(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> languages) {
            return setLanguages(com.google.common.base.Optional.fromNullable(languages));
        }

        public Builder setMediums(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums) {
            this.mediums = DefaultConstructionValidator.getInstance().validateMediums(mediums);
            return this;
        }

        public Builder setMediums(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> mediums) {
            return setMediums(com.google.common.base.Optional.fromNullable(mediums));
        }

        public Builder setProvenances(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances) {
            this.provenances = DefaultConstructionValidator.getInstance().validateProvenances(provenances);
            return this;
        }

        public Builder setProvenances(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> provenances) {
            return setProvenances(com.google.common.base.Optional.fromNullable(provenances));
        }

        public Builder setPublishers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers) {
            this.publishers = DefaultConstructionValidator.getInstance().validatePublishers(publishers);
            return this;
        }

        public Builder setPublishers(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> publishers) {
            return setPublishers(com.google.common.base.Optional.fromNullable(publishers));
        }

        public Builder setRelations(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations) {
            this.relations = DefaultConstructionValidator.getInstance().validateRelations(relations);
            return this;
        }

        public Builder setRelations(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> relations) {
            return setRelations(com.google.common.base.Optional.fromNullable(relations));
        }

        public Builder setRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
            this.rights = DefaultConstructionValidator.getInstance().validateRights(rights);
            return this;
        }

        public Builder setRights(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> rights) {
            return setRights(com.google.common.base.Optional.fromNullable(rights));
        }

        public Builder setRightsHolders(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders) {
            this.rightsHolders = DefaultConstructionValidator.getInstance().validateRightsHolders(rightsHolders);
            return this;
        }

        public Builder setRightsHolders(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> rightsHolders) {
            return setRightsHolders(com.google.common.base.Optional.fromNullable(rightsHolders));
        }

        public Builder setSources(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources) {
            this.sources = DefaultConstructionValidator.getInstance().validateSources(sources);
            return this;
        }

        public Builder setSources(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> sources) {
            return setSources(com.google.common.base.Optional.fromNullable(sources));
        }

        public Builder setSpatials(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials) {
            this.spatials = DefaultConstructionValidator.getInstance().validateSpatials(spatials);
            return this;
        }

        public Builder setSpatials(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> spatials) {
            return setSpatials(com.google.common.base.Optional.fromNullable(spatials));
        }

        public Builder setSubjects(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects) {
            this.subjects = DefaultConstructionValidator.getInstance().validateSubjects(subjects);
            return this;
        }

        public Builder setSubjects(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> subjects) {
            return setSubjects(com.google.common.base.Optional.fromNullable(subjects));
        }

        public Builder setTemporals(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals) {
            this.temporals = DefaultConstructionValidator.getInstance().validateTemporals(temporals);
            return this;
        }

        public Builder setTemporals(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> temporals) {
            return setTemporals(com.google.common.base.Optional.fromNullable(temporals));
        }

        public Builder setTitles(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles) {
            this.titles = DefaultConstructionValidator.getInstance().validateTitles(titles);
            return this;
        }

        public Builder setTitles(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> titles) {
            return setTitles(com.google.common.base.Optional.fromNullable(titles));
        }

        public Builder setTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
            this.types = DefaultConstructionValidator.getInstance().validateTypes(types);
            return this;
        }

        public Builder setTypes(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> types) {
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
        public DublinCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return DublinCoreObject.readAs(iprot, type);
        }

        @Override
        public DublinCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return DublinCoreObject.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public DublinCoreObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DublinCoreObject.readAsList(iprot);
        }

        @Override
        public DublinCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return DublinCoreObject.readAsStruct(iprot);
        }

        @Override
        public DublinCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return DublinCoreObject.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ABSTRACTS("abstracts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 24, "abstracts", org.thryft.protocol.Type.LIST),
        AUDIENCES("audiences", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 1, "audiences", org.thryft.protocol.Type.LIST),
        CONTRIBUTORS("contributors", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 2, "contributors", org.thryft.protocol.Type.LIST),
        COVERAGES("coverages", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 3, "coverages", org.thryft.protocol.Type.LIST),
        CREATEDS("createds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 20, "createds", org.thryft.protocol.Type.LIST),
        CREATORS("creators", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 4, "creators", org.thryft.protocol.Type.LIST),
        DATES("dates", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 5, "dates", org.thryft.protocol.Type.LIST),
        DESCRIPTIONS("descriptions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 6, "descriptions", org.thryft.protocol.Type.LIST),
        EXTENTS("extents", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 19, "extents", org.thryft.protocol.Type.LIST),
        FORMATS("formats", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 8, "formats", org.thryft.protocol.Type.LIST),
        IDENTIFIERS("identifiers", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 7, "identifiers", org.thryft.protocol.Type.LIST),
        LANGUAGES("languages", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 9, "languages", org.thryft.protocol.Type.LIST),
        MEDIUMS("mediums", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 23, "mediums", org.thryft.protocol.Type.LIST),
        PROVENANCES("provenances", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 10, "provenances", org.thryft.protocol.Type.LIST),
        PUBLISHERS("publishers", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 11, "publishers", org.thryft.protocol.Type.LIST),
        RELATIONS("relations", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 12, "relations", org.thryft.protocol.Type.LIST),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 13, "rights", org.thryft.protocol.Type.LIST),
        RIGHTS_HOLDERS("rightsHolders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 14, "rights_holders", org.thryft.protocol.Type.LIST),
        SOURCES("sources", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 15, "sources", org.thryft.protocol.Type.LIST),
        SPATIALS("spatials", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 21, "spatials", org.thryft.protocol.Type.LIST),
        SUBJECTS("subjects", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 16, "subjects", org.thryft.protocol.Type.LIST),
        TEMPORALS("temporals", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 22, "temporals", org.thryft.protocol.Type.LIST),
        TITLES("titles", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 17, "titles", org.thryft.protocol.Type.LIST),
        TYPES("types", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 18, "types", org.thryft.protocol.Type.LIST);

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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAbstracts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAudiences(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateContributors(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCoverages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreateds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreators(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDescriptions(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateExtents(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateFormats(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateIdentifiers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLanguages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMediums(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateProvenances(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validatePublishers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelations(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRightsHolders(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSources(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSpatials(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubjects(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTemporals(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTitles(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) throws ExceptionT;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAbstracts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts) throws RuntimeException {
            if (abstracts == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: abstracts is null");
            }
            if (!abstracts.isPresent()) {
                return abstracts;
            }
            if (abstracts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: abstracts is less than min length 1");
            }
            return abstracts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAudiences(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences) throws RuntimeException {
            if (audiences == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: audiences is null");
            }
            if (!audiences.isPresent()) {
                return audiences;
            }
            if (audiences.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: audiences is less than min length 1");
            }
            return audiences;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateContributors(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors) throws RuntimeException {
            if (contributors == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: contributors is null");
            }
            if (!contributors.isPresent()) {
                return contributors;
            }
            if (contributors.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: contributors is less than min length 1");
            }
            return contributors;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCoverages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages) throws RuntimeException {
            if (coverages == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: coverages is null");
            }
            if (!coverages.isPresent()) {
                return coverages;
            }
            if (coverages.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: coverages is less than min length 1");
            }
            return coverages;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreateds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds) throws RuntimeException {
            if (createds == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: createds is null");
            }
            if (!createds.isPresent()) {
                return createds;
            }
            if (createds.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: createds is less than min length 1");
            }
            return createds;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreators(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators) throws RuntimeException {
            if (creators == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: creators is null");
            }
            if (!creators.isPresent()) {
                return creators;
            }
            if (creators.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: creators is less than min length 1");
            }
            return creators;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates) throws RuntimeException {
            if (dates == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: dates is null");
            }
            if (!dates.isPresent()) {
                return dates;
            }
            if (dates.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: dates is less than min length 1");
            }
            return dates;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDescriptions(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions) throws RuntimeException {
            if (descriptions == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: descriptions is null");
            }
            if (!descriptions.isPresent()) {
                return descriptions;
            }
            if (descriptions.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: descriptions is less than min length 1");
            }
            return descriptions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateExtents(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents) throws RuntimeException {
            if (extents == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: extents is null");
            }
            if (!extents.isPresent()) {
                return extents;
            }
            if (extents.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: extents is less than min length 1");
            }
            return extents;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateFormats(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats) throws RuntimeException {
            if (formats == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: formats is null");
            }
            if (!formats.isPresent()) {
                return formats;
            }
            if (formats.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: formats is less than min length 1");
            }
            return formats;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateIdentifiers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers) throws RuntimeException {
            if (identifiers == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: identifiers is null");
            }
            if (!identifiers.isPresent()) {
                return identifiers;
            }
            if (identifiers.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: identifiers is less than min length 1");
            }
            return identifiers;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLanguages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages) throws RuntimeException {
            if (languages == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: languages is null");
            }
            if (!languages.isPresent()) {
                return languages;
            }
            if (languages.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: languages is less than min length 1");
            }
            return languages;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMediums(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums) throws RuntimeException {
            if (mediums == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: mediums is null");
            }
            if (!mediums.isPresent()) {
                return mediums;
            }
            if (mediums.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: mediums is less than min length 1");
            }
            return mediums;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateProvenances(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances) throws RuntimeException {
            if (provenances == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: provenances is null");
            }
            if (!provenances.isPresent()) {
                return provenances;
            }
            if (provenances.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: provenances is less than min length 1");
            }
            return provenances;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validatePublishers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers) throws RuntimeException {
            if (publishers == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: publishers is null");
            }
            if (!publishers.isPresent()) {
                return publishers;
            }
            if (publishers.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: publishers is less than min length 1");
            }
            return publishers;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelations(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations) throws RuntimeException {
            if (relations == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: relations is null");
            }
            if (!relations.isPresent()) {
                return relations;
            }
            if (relations.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: relations is less than min length 1");
            }
            return relations;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) throws RuntimeException {
            if (rights == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rights is null");
            }
            if (!rights.isPresent()) {
                return rights;
            }
            if (rights.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rights is less than min length 1");
            }
            return rights;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRightsHolders(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders) throws RuntimeException {
            if (rightsHolders == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rightsHolders is null");
            }
            if (!rightsHolders.isPresent()) {
                return rightsHolders;
            }
            if (rightsHolders.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rightsHolders is less than min length 1");
            }
            return rightsHolders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSources(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources) throws RuntimeException {
            if (sources == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: sources is null");
            }
            if (!sources.isPresent()) {
                return sources;
            }
            if (sources.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: sources is less than min length 1");
            }
            return sources;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSpatials(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials) throws RuntimeException {
            if (spatials == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: spatials is null");
            }
            if (!spatials.isPresent()) {
                return spatials;
            }
            if (spatials.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: spatials is less than min length 1");
            }
            return spatials;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubjects(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects) throws RuntimeException {
            if (subjects == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: subjects is null");
            }
            if (!subjects.isPresent()) {
                return subjects;
            }
            if (subjects.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: subjects is less than min length 1");
            }
            return subjects;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTemporals(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals) throws RuntimeException {
            if (temporals == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: temporals is null");
            }
            if (!temporals.isPresent()) {
                return temporals;
            }
            if (temporals.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: temporals is less than min length 1");
            }
            return temporals;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTitles(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles) throws RuntimeException {
            if (titles == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: titles is null");
            }
            if (!titles.isPresent()) {
                return titles;
            }
            if (titles.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: titles is less than min length 1");
            }
            return titles;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) throws RuntimeException {
            if (types == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: types is null");
            }
            if (!types.isPresent()) {
                return types;
            }
            if (types.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: types is less than min length 1");
            }
            return types;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAbstracts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts) {
            return abstracts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAudiences(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences) {
            return audiences;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateContributors(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors) {
            return contributors;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCoverages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages) {
            return coverages;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreateds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds) {
            return createds;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreators(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators) {
            return creators;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates) {
            return dates;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDescriptions(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions) {
            return descriptions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateExtents(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents) {
            return extents;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateFormats(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats) {
            return formats;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateIdentifiers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers) {
            return identifiers;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLanguages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages) {
            return languages;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMediums(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums) {
            return mediums;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateProvenances(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances) {
            return provenances;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validatePublishers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers) {
            return publishers;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelations(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations) {
            return relations;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
            return rights;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRightsHolders(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders) {
            return rightsHolders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSources(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources) {
            return sources;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSpatials(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials) {
            return spatials;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubjects(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects) {
            return subjects;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTemporals(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals) {
            return temporals;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTitles(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles) {
            return titles;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
            return types;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAbstracts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts) throws org.thryft.protocol.InputProtocolException {
            if (abstracts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ABSTRACTS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: abstracts is null");
            }
            if (!abstracts.isPresent()) {
                return abstracts;
            }
            if (abstracts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACTS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: abstracts is less than min length 1");
            }
            return abstracts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAudiences(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences) throws org.thryft.protocol.InputProtocolException {
            if (audiences == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.AUDIENCES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: audiences is null");
            }
            if (!audiences.isPresent()) {
                return audiences;
            }
            if (audiences.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: audiences is less than min length 1");
            }
            return audiences;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateContributors(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors) throws org.thryft.protocol.InputProtocolException {
            if (contributors == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CONTRIBUTORS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: contributors is null");
            }
            if (!contributors.isPresent()) {
                return contributors;
            }
            if (contributors.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTORS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: contributors is less than min length 1");
            }
            return contributors;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCoverages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages) throws org.thryft.protocol.InputProtocolException {
            if (coverages == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COVERAGES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: coverages is null");
            }
            if (!coverages.isPresent()) {
                return coverages;
            }
            if (coverages.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: coverages is less than min length 1");
            }
            return coverages;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreateds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds) throws org.thryft.protocol.InputProtocolException {
            if (createds == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CREATEDS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: createds is null");
            }
            if (!createds.isPresent()) {
                return createds;
            }
            if (createds.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATEDS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: createds is less than min length 1");
            }
            return createds;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreators(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators) throws org.thryft.protocol.InputProtocolException {
            if (creators == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CREATORS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: creators is null");
            }
            if (!creators.isPresent()) {
                return creators;
            }
            if (creators.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATORS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: creators is less than min length 1");
            }
            return creators;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates) throws org.thryft.protocol.InputProtocolException {
            if (dates == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DATES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: dates is null");
            }
            if (!dates.isPresent()) {
                return dates;
            }
            if (dates.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: dates is less than min length 1");
            }
            return dates;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDescriptions(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions) throws org.thryft.protocol.InputProtocolException {
            if (descriptions == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DESCRIPTIONS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: descriptions is null");
            }
            if (!descriptions.isPresent()) {
                return descriptions;
            }
            if (descriptions.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTIONS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: descriptions is less than min length 1");
            }
            return descriptions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateExtents(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents) throws org.thryft.protocol.InputProtocolException {
            if (extents == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXTENTS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: extents is null");
            }
            if (!extents.isPresent()) {
                return extents;
            }
            if (extents.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENTS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: extents is less than min length 1");
            }
            return extents;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateFormats(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats) throws org.thryft.protocol.InputProtocolException {
            if (formats == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FORMATS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: formats is null");
            }
            if (!formats.isPresent()) {
                return formats;
            }
            if (formats.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMATS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: formats is less than min length 1");
            }
            return formats;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateIdentifiers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers) throws org.thryft.protocol.InputProtocolException {
            if (identifiers == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IDENTIFIERS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: identifiers is null");
            }
            if (!identifiers.isPresent()) {
                return identifiers;
            }
            if (identifiers.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIERS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: identifiers is less than min length 1");
            }
            return identifiers;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLanguages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages) throws org.thryft.protocol.InputProtocolException {
            if (languages == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LANGUAGES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: languages is null");
            }
            if (!languages.isPresent()) {
                return languages;
            }
            if (languages.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: languages is less than min length 1");
            }
            return languages;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMediums(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums) throws org.thryft.protocol.InputProtocolException {
            if (mediums == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MEDIUMS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: mediums is null");
            }
            if (!mediums.isPresent()) {
                return mediums;
            }
            if (mediums.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUMS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: mediums is less than min length 1");
            }
            return mediums;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateProvenances(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances) throws org.thryft.protocol.InputProtocolException {
            if (provenances == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PROVENANCES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: provenances is null");
            }
            if (!provenances.isPresent()) {
                return provenances;
            }
            if (provenances.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: provenances is less than min length 1");
            }
            return provenances;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validatePublishers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers) throws org.thryft.protocol.InputProtocolException {
            if (publishers == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PUBLISHERS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: publishers is null");
            }
            if (!publishers.isPresent()) {
                return publishers;
            }
            if (publishers.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHERS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: publishers is less than min length 1");
            }
            return publishers;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelations(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations) throws org.thryft.protocol.InputProtocolException {
            if (relations == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RELATIONS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: relations is null");
            }
            if (!relations.isPresent()) {
                return relations;
            }
            if (relations.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATIONS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: relations is less than min length 1");
            }
            return relations;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) throws org.thryft.protocol.InputProtocolException {
            if (rights == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHTS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rights is null");
            }
            if (!rights.isPresent()) {
                return rights;
            }
            if (rights.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rights is less than min length 1");
            }
            return rights;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRightsHolders(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders) throws org.thryft.protocol.InputProtocolException {
            if (rightsHolders == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDERS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rightsHolders is null");
            }
            if (!rightsHolders.isPresent()) {
                return rightsHolders;
            }
            if (rightsHolders.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDERS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rightsHolders is less than min length 1");
            }
            return rightsHolders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSources(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources) throws org.thryft.protocol.InputProtocolException {
            if (sources == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SOURCES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: sources is null");
            }
            if (!sources.isPresent()) {
                return sources;
            }
            if (sources.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: sources is less than min length 1");
            }
            return sources;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSpatials(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials) throws org.thryft.protocol.InputProtocolException {
            if (spatials == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SPATIALS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: spatials is null");
            }
            if (!spatials.isPresent()) {
                return spatials;
            }
            if (spatials.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIALS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: spatials is less than min length 1");
            }
            return spatials;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubjects(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects) throws org.thryft.protocol.InputProtocolException {
            if (subjects == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SUBJECTS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: subjects is null");
            }
            if (!subjects.isPresent()) {
                return subjects;
            }
            if (subjects.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECTS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: subjects is less than min length 1");
            }
            return subjects;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTemporals(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals) throws org.thryft.protocol.InputProtocolException {
            if (temporals == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEMPORALS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: temporals is null");
            }
            if (!temporals.isPresent()) {
                return temporals;
            }
            if (temporals.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORALS, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: temporals is less than min length 1");
            }
            return temporals;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTitles(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles) throws org.thryft.protocol.InputProtocolException {
            if (titles == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TITLES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: titles is null");
            }
            if (!titles.isPresent()) {
                return titles;
            }
            if (titles.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: titles is less than min length 1");
            }
            return titles;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) throws org.thryft.protocol.InputProtocolException {
            if (types == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: types is null");
            }
            if (!types.isPresent()) {
                return types;
            }
            if (types.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPES, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: types is less than min length 1");
            }
            return types;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAbstracts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts) {
            return abstracts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAudiences(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences) {
            return audiences;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateContributors(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors) {
            return contributors;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCoverages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages) {
            return coverages;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreateds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds) {
            return createds;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreators(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators) {
            return creators;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates) {
            return dates;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDescriptions(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions) {
            return descriptions;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateExtents(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents) {
            return extents;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateFormats(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats) {
            return formats;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateIdentifiers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers) {
            return identifiers;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLanguages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages) {
            return languages;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMediums(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums) {
            return mediums;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateProvenances(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances) {
            return provenances;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validatePublishers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers) {
            return publishers;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelations(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations) {
            return relations;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
            return rights;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRightsHolders(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders) {
            return rightsHolders;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSources(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources) {
            return sources;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSpatials(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials) {
            return spatials;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubjects(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects) {
            return subjects;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTemporals(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals) {
            return temporals;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTitles(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles) {
            return titles;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
            return types;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
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
        this(other.getAbstracts(), other.getAudiences(), other.getContributors(), other.getCoverages(), other.getCreateds(), other.getCreators(), other.getDates(), other.getDescriptions(), other.getExtents(), other.getFormats(), other.getIdentifiers(), other.getLanguages(), other.getMediums(), other.getProvenances(), other.getPublishers(), other.getRelations(), other.getRights(), other.getRightsHolders(), other.getSources(), other.getSpatials(), other.getSubjects(), other.getTemporals(), other.getTitles(), other.getTypes(), NopConstructionValidator.getInstance());
    }

    protected DublinCoreObject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types, ConstructionValidator validator) {
        this.abstracts = validator.validateAbstracts(abstracts);
        this.audiences = validator.validateAudiences(audiences);
        this.contributors = validator.validateContributors(contributors);
        this.coverages = validator.validateCoverages(coverages);
        this.createds = validator.validateCreateds(createds);
        this.creators = validator.validateCreators(creators);
        this.dates = validator.validateDates(dates);
        this.descriptions = validator.validateDescriptions(descriptions);
        this.extents = validator.validateExtents(extents);
        this.formats = validator.validateFormats(formats);
        this.identifiers = validator.validateIdentifiers(identifiers);
        this.languages = validator.validateLanguages(languages);
        this.mediums = validator.validateMediums(mediums);
        this.provenances = validator.validateProvenances(provenances);
        this.publishers = validator.validatePublishers(publishers);
        this.relations = validator.validateRelations(relations);
        this.rights = validator.validateRights(rights);
        this.rightsHolders = validator.validateRightsHolders(rightsHolders);
        this.sources = validator.validateSources(sources);
        this.spatials = validator.validateSpatials(spatials);
        this.subjects = validator.validateSubjects(subjects);
        this.temporals = validator.validateTemporals(temporals);
        this.titles = validator.validateTitles(titles);
        this.types = validator.validateTypes(types);
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

    public static DublinCoreObject create() {
        return new DublinCoreObject();
    }

    /**
     * Total Nullable factory method
     */
    public static DublinCoreObject create(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> abstracts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> audiences, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> contributors, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> coverages, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> createds, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> creators, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> dates, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> descriptions, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> extents, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> formats, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> identifiers, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> languages, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> mediums, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> provenances, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> publishers, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> relations, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> rights, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> rightsHolders, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> sources, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> spatials, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> subjects, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> temporals, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> titles, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> types) {
        return new DublinCoreObject(com.google.common.base.Optional.fromNullable(abstracts), com.google.common.base.Optional.fromNullable(audiences), com.google.common.base.Optional.fromNullable(contributors), com.google.common.base.Optional.fromNullable(coverages), com.google.common.base.Optional.fromNullable(createds), com.google.common.base.Optional.fromNullable(creators), com.google.common.base.Optional.fromNullable(dates), com.google.common.base.Optional.fromNullable(descriptions), com.google.common.base.Optional.fromNullable(extents), com.google.common.base.Optional.fromNullable(formats), com.google.common.base.Optional.fromNullable(identifiers), com.google.common.base.Optional.fromNullable(languages), com.google.common.base.Optional.fromNullable(mediums), com.google.common.base.Optional.fromNullable(provenances), com.google.common.base.Optional.fromNullable(publishers), com.google.common.base.Optional.fromNullable(relations), com.google.common.base.Optional.fromNullable(rights), com.google.common.base.Optional.fromNullable(rightsHolders), com.google.common.base.Optional.fromNullable(sources), com.google.common.base.Optional.fromNullable(spatials), com.google.common.base.Optional.fromNullable(subjects), com.google.common.base.Optional.fromNullable(temporals), com.google.common.base.Optional.fromNullable(titles), com.google.common.base.Optional.fromNullable(types), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static DublinCoreObject create(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
        return new DublinCoreObject(abstracts, audiences, contributors, coverages, createds, creators, dates, descriptions, extents, formats, identifiers, languages, mediums, provenances, publishers, relations, rights, rightsHolders, sources, spatials, subjects, temporals, titles, types, DefaultConstructionValidator.getInstance());
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

    public static DublinCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DublinCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static DublinCoreObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                try {
                    abstracts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACTS, e.getCause());
                }
            }
            if (__list.getSize() > 1) {
                try {
                    audiences = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCES, e.getCause());
                }
            }
            if (__list.getSize() > 2) {
                try {
                    contributors = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTORS, e.getCause());
                }
            }
            if (__list.getSize() > 3) {
                try {
                    coverages = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGES, e.getCause());
                }
            }
            if (__list.getSize() > 4) {
                try {
                    createds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATEDS, e.getCause());
                }
            }
            if (__list.getSize() > 5) {
                try {
                    creators = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATORS, e.getCause());
                }
            }
            if (__list.getSize() > 6) {
                try {
                    dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                }
            }
            if (__list.getSize() > 7) {
                try {
                    descriptions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTIONS, e.getCause());
                }
            }
            if (__list.getSize() > 8) {
                try {
                    extents = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENTS, e.getCause());
                }
            }
            if (__list.getSize() > 9) {
                try {
                    formats = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMATS, e.getCause());
                }
            }
            if (__list.getSize() > 10) {
                try {
                    identifiers = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIERS, e.getCause());
                }
            }
            if (__list.getSize() > 11) {
                try {
                    languages = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGES, e.getCause());
                }
            }
            if (__list.getSize() > 12) {
                try {
                    mediums = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUMS, e.getCause());
                }
            }
            if (__list.getSize() > 13) {
                try {
                    provenances = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCES, e.getCause());
                }
            }
            if (__list.getSize() > 14) {
                try {
                    publishers = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHERS, e.getCause());
                }
            }
            if (__list.getSize() > 15) {
                try {
                    relations = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATIONS, e.getCause());
                }
            }
            if (__list.getSize() > 16) {
                try {
                    rights = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS, e.getCause());
                }
            }
            if (__list.getSize() > 17) {
                try {
                    rightsHolders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDERS, e.getCause());
                }
            }
            if (__list.getSize() > 18) {
                try {
                    sources = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCES, e.getCause());
                }
            }
            if (__list.getSize() > 19) {
                try {
                    spatials = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIALS, e.getCause());
                }
            }
            if (__list.getSize() > 20) {
                try {
                    subjects = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECTS, e.getCause());
                }
            }
            if (__list.getSize() > 21) {
                try {
                    temporals = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORALS, e.getCause());
                }
            }
            if (__list.getSize() > 22) {
                try {
                    titles = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLES, e.getCause());
                }
            }
            if (__list.getSize() > 23) {
                try {
                    types = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPES, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new DublinCoreObject(DefaultReadValidator.getInstance().validateAbstracts(abstracts), DefaultReadValidator.getInstance().validateAudiences(audiences), DefaultReadValidator.getInstance().validateContributors(contributors), DefaultReadValidator.getInstance().validateCoverages(coverages), DefaultReadValidator.getInstance().validateCreateds(createds), DefaultReadValidator.getInstance().validateCreators(creators), DefaultReadValidator.getInstance().validateDates(dates), DefaultReadValidator.getInstance().validateDescriptions(descriptions), DefaultReadValidator.getInstance().validateExtents(extents), DefaultReadValidator.getInstance().validateFormats(formats), DefaultReadValidator.getInstance().validateIdentifiers(identifiers), DefaultReadValidator.getInstance().validateLanguages(languages), DefaultReadValidator.getInstance().validateMediums(mediums), DefaultReadValidator.getInstance().validateProvenances(provenances), DefaultReadValidator.getInstance().validatePublishers(publishers), DefaultReadValidator.getInstance().validateRelations(relations), DefaultReadValidator.getInstance().validateRights(rights), DefaultReadValidator.getInstance().validateRightsHolders(rightsHolders), DefaultReadValidator.getInstance().validateSources(sources), DefaultReadValidator.getInstance().validateSpatials(spatials), DefaultReadValidator.getInstance().validateSubjects(subjects), DefaultReadValidator.getInstance().validateTemporals(temporals), DefaultReadValidator.getInstance().validateTitles(titles), DefaultReadValidator.getInstance().validateTypes(types), NopConstructionValidator.getInstance());
    }

    public static DublinCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DublinCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();

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
                            abstracts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACTS, e.getCause());
                        }
                    }
                    break;
                }
                case "audiences": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            audiences = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCES, e.getCause());
                        }
                    }
                    break;
                }
                case "contributors": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            contributors = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTORS, e.getCause());
                        }
                    }
                    break;
                }
                case "coverages": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            coverages = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGES, e.getCause());
                        }
                    }
                    break;
                }
                case "createds": {
                    if (!ifield.hasId() || ifield.getId() == 20) {
                        try {
                            createds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATEDS, e.getCause());
                        }
                    }
                    break;
                }
                case "creators": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        try {
                            creators = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATORS, e.getCause());
                        }
                    }
                    break;
                }
                case "dates": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        try {
                            dates = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATES, e.getCause());
                        }
                    }
                    break;
                }
                case "descriptions": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        try {
                            descriptions = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTIONS, e.getCause());
                        }
                    }
                    break;
                }
                case "extents": {
                    if (!ifield.hasId() || ifield.getId() == 19) {
                        try {
                            extents = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENTS, e.getCause());
                        }
                    }
                    break;
                }
                case "formats": {
                    if (!ifield.hasId() || ifield.getId() == 8) {
                        try {
                            formats = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMATS, e.getCause());
                        }
                    }
                    break;
                }
                case "identifiers": {
                    if (!ifield.hasId() || ifield.getId() == 7) {
                        try {
                            identifiers = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIERS, e.getCause());
                        }
                    }
                    break;
                }
                case "languages": {
                    if (!ifield.hasId() || ifield.getId() == 9) {
                        try {
                            languages = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGES, e.getCause());
                        }
                    }
                    break;
                }
                case "mediums": {
                    if (!ifield.hasId() || ifield.getId() == 23) {
                        try {
                            mediums = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUMS, e.getCause());
                        }
                    }
                    break;
                }
                case "provenances": {
                    if (!ifield.hasId() || ifield.getId() == 10) {
                        try {
                            provenances = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCES, e.getCause());
                        }
                    }
                    break;
                }
                case "publishers": {
                    if (!ifield.hasId() || ifield.getId() == 11) {
                        try {
                            publishers = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHERS, e.getCause());
                        }
                    }
                    break;
                }
                case "relations": {
                    if (!ifield.hasId() || ifield.getId() == 12) {
                        try {
                            relations = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATIONS, e.getCause());
                        }
                    }
                    break;
                }
                case "rights": {
                    if (!ifield.hasId() || ifield.getId() == 13) {
                        try {
                            rights = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS, e.getCause());
                        }
                    }
                    break;
                }
                case "rights_holders": {
                    if (!ifield.hasId() || ifield.getId() == 14) {
                        try {
                            rightsHolders = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDERS, e.getCause());
                        }
                    }
                    break;
                }
                case "sources": {
                    if (!ifield.hasId() || ifield.getId() == 15) {
                        try {
                            sources = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCES, e.getCause());
                        }
                    }
                    break;
                }
                case "spatials": {
                    if (!ifield.hasId() || ifield.getId() == 21) {
                        try {
                            spatials = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIALS, e.getCause());
                        }
                    }
                    break;
                }
                case "subjects": {
                    if (!ifield.hasId() || ifield.getId() == 16) {
                        try {
                            subjects = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECTS, e.getCause());
                        }
                    }
                    break;
                }
                case "temporals": {
                    if (!ifield.hasId() || ifield.getId() == 22) {
                        try {
                            temporals = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORALS, e.getCause());
                        }
                    }
                    break;
                }
                case "titles": {
                    if (!ifield.hasId() || ifield.getId() == 17) {
                        try {
                            titles = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLES, e.getCause());
                        }
                    }
                    break;
                }
                case "types": {
                    if (!ifield.hasId() || ifield.getId() == 18) {
                        try {
                            types = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPES, e.getCause());
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
        return new DublinCoreObject(DefaultReadValidator.getInstance().validateAbstracts(abstracts), DefaultReadValidator.getInstance().validateAudiences(audiences), DefaultReadValidator.getInstance().validateContributors(contributors), DefaultReadValidator.getInstance().validateCoverages(coverages), DefaultReadValidator.getInstance().validateCreateds(createds), DefaultReadValidator.getInstance().validateCreators(creators), DefaultReadValidator.getInstance().validateDates(dates), DefaultReadValidator.getInstance().validateDescriptions(descriptions), DefaultReadValidator.getInstance().validateExtents(extents), DefaultReadValidator.getInstance().validateFormats(formats), DefaultReadValidator.getInstance().validateIdentifiers(identifiers), DefaultReadValidator.getInstance().validateLanguages(languages), DefaultReadValidator.getInstance().validateMediums(mediums), DefaultReadValidator.getInstance().validateProvenances(provenances), DefaultReadValidator.getInstance().validatePublishers(publishers), DefaultReadValidator.getInstance().validateRelations(relations), DefaultReadValidator.getInstance().validateRights(rights), DefaultReadValidator.getInstance().validateRightsHolders(rightsHolders), DefaultReadValidator.getInstance().validateSources(sources), DefaultReadValidator.getInstance().validateSpatials(spatials), DefaultReadValidator.getInstance().validateSubjects(subjects), DefaultReadValidator.getInstance().validateTemporals(temporals), DefaultReadValidator.getInstance().validateTitles(titles), DefaultReadValidator.getInstance().validateTypes(types), NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceAbstracts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstracts) {
        return new DublinCoreObject(DefaultConstructionValidator.getInstance().validateAbstracts(abstracts), this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceAbstracts(final com.google.common.collect.ImmutableList<String> abstracts) {
        return replaceAbstracts(com.google.common.base.Optional.fromNullable(abstracts));
    }

    public DublinCoreObject replaceAudiences(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audiences) {
        return new DublinCoreObject(this.abstracts, DefaultConstructionValidator.getInstance().validateAudiences(audiences), this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceAudiences(final com.google.common.collect.ImmutableList<String> audiences) {
        return replaceAudiences(com.google.common.base.Optional.fromNullable(audiences));
    }

    public DublinCoreObject replaceContributors(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributors) {
        return new DublinCoreObject(this.abstracts, this.audiences, DefaultConstructionValidator.getInstance().validateContributors(contributors), this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceContributors(final com.google.common.collect.ImmutableList<String> contributors) {
        return replaceContributors(com.google.common.base.Optional.fromNullable(contributors));
    }

    public DublinCoreObject replaceCoverages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverages) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, DefaultConstructionValidator.getInstance().validateCoverages(coverages), this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceCoverages(final com.google.common.collect.ImmutableList<String> coverages) {
        return replaceCoverages(com.google.common.base.Optional.fromNullable(coverages));
    }

    public DublinCoreObject replaceCreateds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> createds) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, DefaultConstructionValidator.getInstance().validateCreateds(createds), this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceCreateds(final com.google.common.collect.ImmutableList<String> createds) {
        return replaceCreateds(com.google.common.base.Optional.fromNullable(createds));
    }

    public DublinCoreObject replaceCreators(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creators) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, DefaultConstructionValidator.getInstance().validateCreators(creators), this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceCreators(final com.google.common.collect.ImmutableList<String> creators) {
        return replaceCreators(com.google.common.base.Optional.fromNullable(creators));
    }

    public DublinCoreObject replaceDates(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> dates) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, DefaultConstructionValidator.getInstance().validateDates(dates), this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceDates(final com.google.common.collect.ImmutableList<String> dates) {
        return replaceDates(com.google.common.base.Optional.fromNullable(dates));
    }

    public DublinCoreObject replaceDescriptions(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> descriptions) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, DefaultConstructionValidator.getInstance().validateDescriptions(descriptions), this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceDescriptions(final com.google.common.collect.ImmutableList<String> descriptions) {
        return replaceDescriptions(com.google.common.base.Optional.fromNullable(descriptions));
    }

    public DublinCoreObject replaceExtents(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extents) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, DefaultConstructionValidator.getInstance().validateExtents(extents), this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceExtents(final com.google.common.collect.ImmutableList<String> extents) {
        return replaceExtents(com.google.common.base.Optional.fromNullable(extents));
    }

    public DublinCoreObject replaceFormats(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> formats) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, DefaultConstructionValidator.getInstance().validateFormats(formats), this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceFormats(final com.google.common.collect.ImmutableList<String> formats) {
        return replaceFormats(com.google.common.base.Optional.fromNullable(formats));
    }

    public DublinCoreObject replaceIdentifiers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifiers) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, DefaultConstructionValidator.getInstance().validateIdentifiers(identifiers), this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceIdentifiers(final com.google.common.collect.ImmutableList<String> identifiers) {
        return replaceIdentifiers(com.google.common.base.Optional.fromNullable(identifiers));
    }

    public DublinCoreObject replaceLanguages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> languages) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, DefaultConstructionValidator.getInstance().validateLanguages(languages), this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceLanguages(final com.google.common.collect.ImmutableList<String> languages) {
        return replaceLanguages(com.google.common.base.Optional.fromNullable(languages));
    }

    public DublinCoreObject replaceMediums(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> mediums) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, DefaultConstructionValidator.getInstance().validateMediums(mediums), this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceMediums(final com.google.common.collect.ImmutableList<String> mediums) {
        return replaceMediums(com.google.common.base.Optional.fromNullable(mediums));
    }

    public DublinCoreObject replaceProvenances(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenances) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, DefaultConstructionValidator.getInstance().validateProvenances(provenances), this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceProvenances(final com.google.common.collect.ImmutableList<String> provenances) {
        return replaceProvenances(com.google.common.base.Optional.fromNullable(provenances));
    }

    public DublinCoreObject replacePublishers(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publishers) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, DefaultConstructionValidator.getInstance().validatePublishers(publishers), this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replacePublishers(final com.google.common.collect.ImmutableList<String> publishers) {
        return replacePublishers(com.google.common.base.Optional.fromNullable(publishers));
    }

    public DublinCoreObject replaceRelations(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relations) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, DefaultConstructionValidator.getInstance().validateRelations(relations), this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceRelations(final com.google.common.collect.ImmutableList<String> relations) {
        return replaceRelations(com.google.common.base.Optional.fromNullable(relations));
    }

    public DublinCoreObject replaceRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, DefaultConstructionValidator.getInstance().validateRights(rights), this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceRights(final com.google.common.collect.ImmutableList<String> rights) {
        return replaceRights(com.google.common.base.Optional.fromNullable(rights));
    }

    public DublinCoreObject replaceRightsHolders(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolders) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, DefaultConstructionValidator.getInstance().validateRightsHolders(rightsHolders), this.sources, this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceRightsHolders(final com.google.common.collect.ImmutableList<String> rightsHolders) {
        return replaceRightsHolders(com.google.common.base.Optional.fromNullable(rightsHolders));
    }

    public DublinCoreObject replaceSources(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> sources) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, DefaultConstructionValidator.getInstance().validateSources(sources), this.spatials, this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceSources(final com.google.common.collect.ImmutableList<String> sources) {
        return replaceSources(com.google.common.base.Optional.fromNullable(sources));
    }

    public DublinCoreObject replaceSpatials(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatials) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, DefaultConstructionValidator.getInstance().validateSpatials(spatials), this.subjects, this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceSpatials(final com.google.common.collect.ImmutableList<String> spatials) {
        return replaceSpatials(com.google.common.base.Optional.fromNullable(spatials));
    }

    public DublinCoreObject replaceSubjects(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjects) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, DefaultConstructionValidator.getInstance().validateSubjects(subjects), this.temporals, this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceSubjects(final com.google.common.collect.ImmutableList<String> subjects) {
        return replaceSubjects(com.google.common.base.Optional.fromNullable(subjects));
    }

    public DublinCoreObject replaceTemporals(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporals) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, DefaultConstructionValidator.getInstance().validateTemporals(temporals), this.titles, this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceTemporals(final com.google.common.collect.ImmutableList<String> temporals) {
        return replaceTemporals(com.google.common.base.Optional.fromNullable(temporals));
    }

    public DublinCoreObject replaceTitles(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> titles) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, DefaultConstructionValidator.getInstance().validateTitles(titles), this.types, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceTitles(final com.google.common.collect.ImmutableList<String> titles) {
        return replaceTitles(com.google.common.base.Optional.fromNullable(titles));
    }

    public DublinCoreObject replaceTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> types) {
        return new DublinCoreObject(this.abstracts, this.audiences, this.contributors, this.coverages, this.createds, this.creators, this.dates, this.descriptions, this.extents, this.formats, this.identifiers, this.languages, this.mediums, this.provenances, this.publishers, this.relations, this.rights, this.rightsHolders, this.sources, this.spatials, this.subjects, this.temporals, this.titles, DefaultConstructionValidator.getInstance().validateTypes(types), NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceTypes(final com.google.common.collect.ImmutableList<String> types) {
        return replaceTypes(com.google.common.base.Optional.fromNullable(types));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("abstracts", getAbstracts().orNull()).add("audiences", getAudiences().orNull()).add("contributors", getContributors().orNull()).add("coverages", getCoverages().orNull()).add("createds", getCreateds().orNull()).add("creators", getCreators().orNull()).add("dates", getDates().orNull()).add("descriptions", getDescriptions().orNull()).add("extents", getExtents().orNull()).add("formats", getFormats().orNull()).add("identifiers", getIdentifiers().orNull()).add("languages", getLanguages().orNull()).add("mediums", getMediums().orNull()).add("provenances", getProvenances().orNull()).add("publishers", getPublishers().orNull()).add("relations", getRelations().orNull()).add("rights", getRights().orNull()).add("rights_holders", getRightsHolders().orNull()).add("sources", getSources().orNull()).add("spatials", getSpatials().orNull()).add("subjects", getSubjects().orNull()).add("temporals", getTemporals().orNull()).add("titles", getTitles().orNull()).add("types", getTypes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 24);

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

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAbstracts().isPresent()) {
            oprot.writeFieldBegin("abstracts", org.thryft.protocol.Type.LIST, (short)24);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAbstracts().get().size());
            for (final String _iter0 : getAbstracts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getAudiences().isPresent()) {
            oprot.writeFieldBegin("audiences", org.thryft.protocol.Type.LIST, (short)1);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAudiences().get().size());
            for (final String _iter0 : getAudiences().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getContributors().isPresent()) {
            oprot.writeFieldBegin("contributors", org.thryft.protocol.Type.LIST, (short)2);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getContributors().get().size());
            for (final String _iter0 : getContributors().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getCoverages().isPresent()) {
            oprot.writeFieldBegin("coverages", org.thryft.protocol.Type.LIST, (short)3);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCoverages().get().size());
            for (final String _iter0 : getCoverages().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getCreateds().isPresent()) {
            oprot.writeFieldBegin("createds", org.thryft.protocol.Type.LIST, (short)20);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCreateds().get().size());
            for (final String _iter0 : getCreateds().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getCreators().isPresent()) {
            oprot.writeFieldBegin("creators", org.thryft.protocol.Type.LIST, (short)4);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCreators().get().size());
            for (final String _iter0 : getCreators().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getDates().isPresent()) {
            oprot.writeFieldBegin("dates", org.thryft.protocol.Type.LIST, (short)5);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getDates().get().size());
            for (final String _iter0 : getDates().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getDescriptions().isPresent()) {
            oprot.writeFieldBegin("descriptions", org.thryft.protocol.Type.LIST, (short)6);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getDescriptions().get().size());
            for (final String _iter0 : getDescriptions().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getExtents().isPresent()) {
            oprot.writeFieldBegin("extents", org.thryft.protocol.Type.LIST, (short)19);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getExtents().get().size());
            for (final String _iter0 : getExtents().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getFormats().isPresent()) {
            oprot.writeFieldBegin("formats", org.thryft.protocol.Type.LIST, (short)8);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getFormats().get().size());
            for (final String _iter0 : getFormats().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getIdentifiers().isPresent()) {
            oprot.writeFieldBegin("identifiers", org.thryft.protocol.Type.LIST, (short)7);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getIdentifiers().get().size());
            for (final String _iter0 : getIdentifiers().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getLanguages().isPresent()) {
            oprot.writeFieldBegin("languages", org.thryft.protocol.Type.LIST, (short)9);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getLanguages().get().size());
            for (final String _iter0 : getLanguages().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getMediums().isPresent()) {
            oprot.writeFieldBegin("mediums", org.thryft.protocol.Type.LIST, (short)23);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getMediums().get().size());
            for (final String _iter0 : getMediums().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getProvenances().isPresent()) {
            oprot.writeFieldBegin("provenances", org.thryft.protocol.Type.LIST, (short)10);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getProvenances().get().size());
            for (final String _iter0 : getProvenances().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getPublishers().isPresent()) {
            oprot.writeFieldBegin("publishers", org.thryft.protocol.Type.LIST, (short)11);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getPublishers().get().size());
            for (final String _iter0 : getPublishers().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getRelations().isPresent()) {
            oprot.writeFieldBegin("relations", org.thryft.protocol.Type.LIST, (short)12);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRelations().get().size());
            for (final String _iter0 : getRelations().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getRights().isPresent()) {
            oprot.writeFieldBegin("rights", org.thryft.protocol.Type.LIST, (short)13);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRights().get().size());
            for (final String _iter0 : getRights().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getRightsHolders().isPresent()) {
            oprot.writeFieldBegin("rights_holders", org.thryft.protocol.Type.LIST, (short)14);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRightsHolders().get().size());
            for (final String _iter0 : getRightsHolders().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getSources().isPresent()) {
            oprot.writeFieldBegin("sources", org.thryft.protocol.Type.LIST, (short)15);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSources().get().size());
            for (final String _iter0 : getSources().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getSpatials().isPresent()) {
            oprot.writeFieldBegin("spatials", org.thryft.protocol.Type.LIST, (short)21);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSpatials().get().size());
            for (final String _iter0 : getSpatials().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getSubjects().isPresent()) {
            oprot.writeFieldBegin("subjects", org.thryft.protocol.Type.LIST, (short)16);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSubjects().get().size());
            for (final String _iter0 : getSubjects().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getTemporals().isPresent()) {
            oprot.writeFieldBegin("temporals", org.thryft.protocol.Type.LIST, (short)22);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTemporals().get().size());
            for (final String _iter0 : getTemporals().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getTitles().isPresent()) {
            oprot.writeFieldBegin("titles", org.thryft.protocol.Type.LIST, (short)17);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTitles().get().size());
            for (final String _iter0 : getTitles().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getTypes().isPresent()) {
            oprot.writeFieldBegin("types", org.thryft.protocol.Type.LIST, (short)18);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTypes().get().size());
            for (final String _iter0 : getTypes().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

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
