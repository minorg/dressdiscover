package org.dressdiscover.api.vocabularies.dublin_core;

public final class DublinCoreObject implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            abstract_ = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            audience = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            contributor = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            coverage = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            created = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            creator = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            date = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            description = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            extent = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            format = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            identifier = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            language = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            medium = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            provenance = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            publisher = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            relation = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            rights = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            rightsHolder = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            source = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            spatial = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            subject = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            temporal = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            title = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            type = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        }

        public Builder(final DublinCoreObject other) {
            this.abstract_ = other.getAbstract_();
            this.audience = other.getAudience();
            this.contributor = other.getContributor();
            this.coverage = other.getCoverage();
            this.created = other.getCreated();
            this.creator = other.getCreator();
            this.date = other.getDate();
            this.description = other.getDescription();
            this.extent = other.getExtent();
            this.format = other.getFormat();
            this.identifier = other.getIdentifier();
            this.language = other.getLanguage();
            this.medium = other.getMedium();
            this.provenance = other.getProvenance();
            this.publisher = other.getPublisher();
            this.relation = other.getRelation();
            this.rights = other.getRights();
            this.rightsHolder = other.getRightsHolder();
            this.source = other.getSource();
            this.spatial = other.getSpatial();
            this.subject = other.getSubject();
            this.temporal = other.getTemporal();
            this.title = other.getTitle();
            this.type = other.getType();
        }

        protected DublinCoreObject _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type) {
            return new DublinCoreObject(abstract_, audience, contributor, coverage, created, creator, date, description, extent, format, identifier, language, medium, provenance, publisher, relation, rights, rightsHolder, source, spatial, subject, temporal, title, type, DefaultConstructionValidator.getInstance());
        }

        public DublinCoreObject build() {
            return _build(abstract_, audience, contributor, coverage, created, creator, date, description, extent, format, identifier, language, medium, provenance, publisher, relation, rights, rightsHolder, source, spatial, subject, temporal, title, type);
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAbstract_() {
            return abstract_;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAudience() {
            return audience;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getContributor() {
            return contributor;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCoverage() {
            return coverage;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCreated() {
            return created;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCreator() {
            return creator;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getDate() {
            return date;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getDescription() {
            return description;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getExtent() {
            return extent;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getFormat() {
            return format;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getIdentifier() {
            return identifier;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getLanguage() {
            return language;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getMedium() {
            return medium;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getProvenance() {
            return provenance;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getPublisher() {
            return publisher;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRelation() {
            return relation;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRights() {
            return rights;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRightsHolder() {
            return rightsHolder;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSource() {
            return source;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSpatial() {
            return spatial;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSubject() {
            return subject;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTemporal() {
            return temporal;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTitle() {
            return title;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getType() {
            return type;
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
                        abstract_ = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACT_, e.getCause());
                    }
                }
                if (__list.getSize() > 1) {
                    try {
                        audience = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCE, e.getCause());
                    }
                }
                if (__list.getSize() > 2) {
                    try {
                        contributor = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTOR, e.getCause());
                    }
                }
                if (__list.getSize() > 3) {
                    try {
                        coverage = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGE, e.getCause());
                    }
                }
                if (__list.getSize() > 4) {
                    try {
                        created = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATED, e.getCause());
                    }
                }
                if (__list.getSize() > 5) {
                    try {
                        creator = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATOR, e.getCause());
                    }
                }
                if (__list.getSize() > 6) {
                    try {
                        date = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE, e.getCause());
                    }
                }
                if (__list.getSize() > 7) {
                    try {
                        description = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION, e.getCause());
                    }
                }
                if (__list.getSize() > 8) {
                    try {
                        extent = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT, e.getCause());
                    }
                }
                if (__list.getSize() > 9) {
                    try {
                        format = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMAT, e.getCause());
                    }
                }
                if (__list.getSize() > 10) {
                    try {
                        identifier = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIER, e.getCause());
                    }
                }
                if (__list.getSize() > 11) {
                    try {
                        language = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGE, e.getCause());
                    }
                }
                if (__list.getSize() > 12) {
                    try {
                        medium = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUM, e.getCause());
                    }
                }
                if (__list.getSize() > 13) {
                    try {
                        provenance = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCE, e.getCause());
                    }
                }
                if (__list.getSize() > 14) {
                    try {
                        publisher = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHER, e.getCause());
                    }
                }
                if (__list.getSize() > 15) {
                    try {
                        relation = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION, e.getCause());
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
                        rightsHolder = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDER, e.getCause());
                    }
                }
                if (__list.getSize() > 18) {
                    try {
                        source = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE, e.getCause());
                    }
                }
                if (__list.getSize() > 19) {
                    try {
                        spatial = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIAL, e.getCause());
                    }
                }
                if (__list.getSize() > 20) {
                    try {
                        subject = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT, e.getCause());
                    }
                }
                if (__list.getSize() > 21) {
                    try {
                        temporal = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORAL, e.getCause());
                    }
                }
                if (__list.getSize() > 22) {
                    try {
                        title = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE, e.getCause());
                    }
                }
                if (__list.getSize() > 23) {
                    try {
                        type = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPE, e.getCause());
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
                    case "abstract_": {
                        if (!ifield.hasId() || ifield.getId() == 24) {
                            try {
                                abstract_ = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACT_, e.getCause());
                            }
                        }
                        break;
                    }
                    case "audience": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            try {
                                audience = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCE, e.getCause());
                            }
                        }
                        break;
                    }
                    case "contributor": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            try {
                                contributor = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTOR, e.getCause());
                            }
                        }
                        break;
                    }
                    case "coverage": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            try {
                                coverage = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGE, e.getCause());
                            }
                        }
                        break;
                    }
                    case "created": {
                        if (!ifield.hasId() || ifield.getId() == 20) {
                            try {
                                created = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATED, e.getCause());
                            }
                        }
                        break;
                    }
                    case "creator": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            try {
                                creator = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATOR, e.getCause());
                            }
                        }
                        break;
                    }
                    case "date": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            try {
                                date = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE, e.getCause());
                            }
                        }
                        break;
                    }
                    case "description": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                            try {
                                description = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION, e.getCause());
                            }
                        }
                        break;
                    }
                    case "extent": {
                        if (!ifield.hasId() || ifield.getId() == 19) {
                            try {
                                extent = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT, e.getCause());
                            }
                        }
                        break;
                    }
                    case "format": {
                        if (!ifield.hasId() || ifield.getId() == 8) {
                            try {
                                format = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMAT, e.getCause());
                            }
                        }
                        break;
                    }
                    case "identifier": {
                        if (!ifield.hasId() || ifield.getId() == 7) {
                            try {
                                identifier = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIER, e.getCause());
                            }
                        }
                        break;
                    }
                    case "language": {
                        if (!ifield.hasId() || ifield.getId() == 9) {
                            try {
                                language = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGE, e.getCause());
                            }
                        }
                        break;
                    }
                    case "medium": {
                        if (!ifield.hasId() || ifield.getId() == 23) {
                            try {
                                medium = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUM, e.getCause());
                            }
                        }
                        break;
                    }
                    case "provenance": {
                        if (!ifield.hasId() || ifield.getId() == 10) {
                            try {
                                provenance = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCE, e.getCause());
                            }
                        }
                        break;
                    }
                    case "publisher": {
                        if (!ifield.hasId() || ifield.getId() == 11) {
                            try {
                                publisher = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHER, e.getCause());
                            }
                        }
                        break;
                    }
                    case "relation": {
                        if (!ifield.hasId() || ifield.getId() == 12) {
                            try {
                                relation = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION, e.getCause());
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
                    case "rights_holder": {
                        if (!ifield.hasId() || ifield.getId() == 14) {
                            try {
                                rightsHolder = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDER, e.getCause());
                            }
                        }
                        break;
                    }
                    case "source": {
                        if (!ifield.hasId() || ifield.getId() == 15) {
                            try {
                                source = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE, e.getCause());
                            }
                        }
                        break;
                    }
                    case "spatial": {
                        if (!ifield.hasId() || ifield.getId() == 21) {
                            try {
                                spatial = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIAL, e.getCause());
                            }
                        }
                        break;
                    }
                    case "subject": {
                        if (!ifield.hasId() || ifield.getId() == 16) {
                            try {
                                subject = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT, e.getCause());
                            }
                        }
                        break;
                    }
                    case "temporal": {
                        if (!ifield.hasId() || ifield.getId() == 22) {
                            try {
                                temporal = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORAL, e.getCause());
                            }
                        }
                        break;
                    }
                    case "title": {
                        if (!ifield.hasId() || ifield.getId() == 17) {
                            try {
                                title = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE, e.getCause());
                            }
                        }
                        break;
                    }
                    case "type": {
                        if (!ifield.hasId() || ifield.getId() == 18) {
                            try {
                                type = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPE, e.getCause());
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
            case ABSTRACT_: setAbstract_((com.google.common.collect.ImmutableList<String>)value); return this;
            case AUDIENCE: setAudience((com.google.common.collect.ImmutableList<String>)value); return this;
            case CONTRIBUTOR: setContributor((com.google.common.collect.ImmutableList<String>)value); return this;
            case COVERAGE: setCoverage((com.google.common.collect.ImmutableList<String>)value); return this;
            case CREATED: setCreated((com.google.common.collect.ImmutableList<String>)value); return this;
            case CREATOR: setCreator((com.google.common.collect.ImmutableList<String>)value); return this;
            case DATE: setDate((com.google.common.collect.ImmutableList<String>)value); return this;
            case DESCRIPTION: setDescription((com.google.common.collect.ImmutableList<String>)value); return this;
            case EXTENT: setExtent((com.google.common.collect.ImmutableList<String>)value); return this;
            case FORMAT: setFormat((com.google.common.collect.ImmutableList<String>)value); return this;
            case IDENTIFIER: setIdentifier((com.google.common.collect.ImmutableList<String>)value); return this;
            case LANGUAGE: setLanguage((com.google.common.collect.ImmutableList<String>)value); return this;
            case MEDIUM: setMedium((com.google.common.collect.ImmutableList<String>)value); return this;
            case PROVENANCE: setProvenance((com.google.common.collect.ImmutableList<String>)value); return this;
            case PUBLISHER: setPublisher((com.google.common.collect.ImmutableList<String>)value); return this;
            case RELATION: setRelation((com.google.common.collect.ImmutableList<String>)value); return this;
            case RIGHTS: setRights((com.google.common.collect.ImmutableList<String>)value); return this;
            case RIGHTS_HOLDER: setRightsHolder((com.google.common.collect.ImmutableList<String>)value); return this;
            case SOURCE: setSource((com.google.common.collect.ImmutableList<String>)value); return this;
            case SPATIAL: setSpatial((com.google.common.collect.ImmutableList<String>)value); return this;
            case SUBJECT: setSubject((com.google.common.collect.ImmutableList<String>)value); return this;
            case TEMPORAL: setTemporal((com.google.common.collect.ImmutableList<String>)value); return this;
            case TITLE: setTitle((com.google.common.collect.ImmutableList<String>)value); return this;
            case TYPE: setType((com.google.common.collect.ImmutableList<String>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAbstract_(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_) {
            this.abstract_ = DefaultConstructionValidator.getInstance().validateAbstract_(abstract_);
            return this;
        }

        public Builder setAbstract_(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> abstract_) {
            return setAbstract_(com.google.common.base.Optional.fromNullable(abstract_));
        }

        public Builder setAudience(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience) {
            this.audience = DefaultConstructionValidator.getInstance().validateAudience(audience);
            return this;
        }

        public Builder setAudience(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> audience) {
            return setAudience(com.google.common.base.Optional.fromNullable(audience));
        }

        public Builder setContributor(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor) {
            this.contributor = DefaultConstructionValidator.getInstance().validateContributor(contributor);
            return this;
        }

        public Builder setContributor(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> contributor) {
            return setContributor(com.google.common.base.Optional.fromNullable(contributor));
        }

        public Builder setCoverage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage) {
            this.coverage = DefaultConstructionValidator.getInstance().validateCoverage(coverage);
            return this;
        }

        public Builder setCoverage(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> coverage) {
            return setCoverage(com.google.common.base.Optional.fromNullable(coverage));
        }

        public Builder setCreated(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created) {
            this.created = DefaultConstructionValidator.getInstance().validateCreated(created);
            return this;
        }

        public Builder setCreated(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> created) {
            return setCreated(com.google.common.base.Optional.fromNullable(created));
        }

        public Builder setCreator(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator) {
            this.creator = DefaultConstructionValidator.getInstance().validateCreator(creator);
            return this;
        }

        public Builder setCreator(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> creator) {
            return setCreator(com.google.common.base.Optional.fromNullable(creator));
        }

        public Builder setDate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date) {
            this.date = DefaultConstructionValidator.getInstance().validateDate(date);
            return this;
        }

        public Builder setDate(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> date) {
            return setDate(com.google.common.base.Optional.fromNullable(date));
        }

        public Builder setDescription(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description) {
            this.description = DefaultConstructionValidator.getInstance().validateDescription(description);
            return this;
        }

        public Builder setDescription(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> description) {
            return setDescription(com.google.common.base.Optional.fromNullable(description));
        }

        public Builder setExtent(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent) {
            this.extent = DefaultConstructionValidator.getInstance().validateExtent(extent);
            return this;
        }

        public Builder setExtent(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> extent) {
            return setExtent(com.google.common.base.Optional.fromNullable(extent));
        }

        public Builder setFormat(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format) {
            this.format = DefaultConstructionValidator.getInstance().validateFormat(format);
            return this;
        }

        public Builder setFormat(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> format) {
            return setFormat(com.google.common.base.Optional.fromNullable(format));
        }

        public Builder setIdentifier(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier) {
            this.identifier = DefaultConstructionValidator.getInstance().validateIdentifier(identifier);
            return this;
        }

        public Builder setIdentifier(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> identifier) {
            return setIdentifier(com.google.common.base.Optional.fromNullable(identifier));
        }

        public Builder setIfPresent(final DublinCoreObject other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getAbstract_().isPresent()) {
                setAbstract_(other.getAbstract_());
            }
            if (other.getAudience().isPresent()) {
                setAudience(other.getAudience());
            }
            if (other.getContributor().isPresent()) {
                setContributor(other.getContributor());
            }
            if (other.getCoverage().isPresent()) {
                setCoverage(other.getCoverage());
            }
            if (other.getCreated().isPresent()) {
                setCreated(other.getCreated());
            }
            if (other.getCreator().isPresent()) {
                setCreator(other.getCreator());
            }
            if (other.getDate().isPresent()) {
                setDate(other.getDate());
            }
            if (other.getDescription().isPresent()) {
                setDescription(other.getDescription());
            }
            if (other.getExtent().isPresent()) {
                setExtent(other.getExtent());
            }
            if (other.getFormat().isPresent()) {
                setFormat(other.getFormat());
            }
            if (other.getIdentifier().isPresent()) {
                setIdentifier(other.getIdentifier());
            }
            if (other.getLanguage().isPresent()) {
                setLanguage(other.getLanguage());
            }
            if (other.getMedium().isPresent()) {
                setMedium(other.getMedium());
            }
            if (other.getProvenance().isPresent()) {
                setProvenance(other.getProvenance());
            }
            if (other.getPublisher().isPresent()) {
                setPublisher(other.getPublisher());
            }
            if (other.getRelation().isPresent()) {
                setRelation(other.getRelation());
            }
            if (other.getRights().isPresent()) {
                setRights(other.getRights());
            }
            if (other.getRightsHolder().isPresent()) {
                setRightsHolder(other.getRightsHolder());
            }
            if (other.getSource().isPresent()) {
                setSource(other.getSource());
            }
            if (other.getSpatial().isPresent()) {
                setSpatial(other.getSpatial());
            }
            if (other.getSubject().isPresent()) {
                setSubject(other.getSubject());
            }
            if (other.getTemporal().isPresent()) {
                setTemporal(other.getTemporal());
            }
            if (other.getTitle().isPresent()) {
                setTitle(other.getTitle());
            }
            if (other.getType().isPresent()) {
                setType(other.getType());
            }

            return this;
        }

        public Builder setLanguage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language) {
            this.language = DefaultConstructionValidator.getInstance().validateLanguage(language);
            return this;
        }

        public Builder setLanguage(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> language) {
            return setLanguage(com.google.common.base.Optional.fromNullable(language));
        }

        public Builder setMedium(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium) {
            this.medium = DefaultConstructionValidator.getInstance().validateMedium(medium);
            return this;
        }

        public Builder setMedium(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> medium) {
            return setMedium(com.google.common.base.Optional.fromNullable(medium));
        }

        public Builder setProvenance(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance) {
            this.provenance = DefaultConstructionValidator.getInstance().validateProvenance(provenance);
            return this;
        }

        public Builder setProvenance(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> provenance) {
            return setProvenance(com.google.common.base.Optional.fromNullable(provenance));
        }

        public Builder setPublisher(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher) {
            this.publisher = DefaultConstructionValidator.getInstance().validatePublisher(publisher);
            return this;
        }

        public Builder setPublisher(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> publisher) {
            return setPublisher(com.google.common.base.Optional.fromNullable(publisher));
        }

        public Builder setRelation(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation) {
            this.relation = DefaultConstructionValidator.getInstance().validateRelation(relation);
            return this;
        }

        public Builder setRelation(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> relation) {
            return setRelation(com.google.common.base.Optional.fromNullable(relation));
        }

        public Builder setRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
            this.rights = DefaultConstructionValidator.getInstance().validateRights(rights);
            return this;
        }

        public Builder setRights(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> rights) {
            return setRights(com.google.common.base.Optional.fromNullable(rights));
        }

        public Builder setRightsHolder(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder) {
            this.rightsHolder = DefaultConstructionValidator.getInstance().validateRightsHolder(rightsHolder);
            return this;
        }

        public Builder setRightsHolder(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> rightsHolder) {
            return setRightsHolder(com.google.common.base.Optional.fromNullable(rightsHolder));
        }

        public Builder setSource(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source) {
            this.source = DefaultConstructionValidator.getInstance().validateSource(source);
            return this;
        }

        public Builder setSource(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> source) {
            return setSource(com.google.common.base.Optional.fromNullable(source));
        }

        public Builder setSpatial(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial) {
            this.spatial = DefaultConstructionValidator.getInstance().validateSpatial(spatial);
            return this;
        }

        public Builder setSpatial(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> spatial) {
            return setSpatial(com.google.common.base.Optional.fromNullable(spatial));
        }

        public Builder setSubject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject) {
            this.subject = DefaultConstructionValidator.getInstance().validateSubject(subject);
            return this;
        }

        public Builder setSubject(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> subject) {
            return setSubject(com.google.common.base.Optional.fromNullable(subject));
        }

        public Builder setTemporal(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal) {
            this.temporal = DefaultConstructionValidator.getInstance().validateTemporal(temporal);
            return this;
        }

        public Builder setTemporal(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> temporal) {
            return setTemporal(com.google.common.base.Optional.fromNullable(temporal));
        }

        public Builder setTitle(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title) {
            this.title = DefaultConstructionValidator.getInstance().validateTitle(title);
            return this;
        }

        public Builder setTitle(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> title) {
            return setTitle(com.google.common.base.Optional.fromNullable(title));
        }

        public Builder setType(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type) {
            this.type = DefaultConstructionValidator.getInstance().validateType(type);
            return this;
        }

        public Builder setType(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> type) {
            return setType(com.google.common.base.Optional.fromNullable(type));
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
            case ABSTRACT_: return unsetAbstract_();
            case AUDIENCE: return unsetAudience();
            case CONTRIBUTOR: return unsetContributor();
            case COVERAGE: return unsetCoverage();
            case CREATED: return unsetCreated();
            case CREATOR: return unsetCreator();
            case DATE: return unsetDate();
            case DESCRIPTION: return unsetDescription();
            case EXTENT: return unsetExtent();
            case FORMAT: return unsetFormat();
            case IDENTIFIER: return unsetIdentifier();
            case LANGUAGE: return unsetLanguage();
            case MEDIUM: return unsetMedium();
            case PROVENANCE: return unsetProvenance();
            case PUBLISHER: return unsetPublisher();
            case RELATION: return unsetRelation();
            case RIGHTS: return unsetRights();
            case RIGHTS_HOLDER: return unsetRightsHolder();
            case SOURCE: return unsetSource();
            case SPATIAL: return unsetSpatial();
            case SUBJECT: return unsetSubject();
            case TEMPORAL: return unsetTemporal();
            case TITLE: return unsetTitle();
            case TYPE: return unsetType();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAbstract_() {
            this.abstract_ = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetAudience() {
            this.audience = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetContributor() {
            this.contributor = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetCoverage() {
            this.coverage = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetCreated() {
            this.created = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetCreator() {
            this.creator = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetDate() {
            this.date = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetDescription() {
            this.description = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetExtent() {
            this.extent = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetFormat() {
            this.format = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetIdentifier() {
            this.identifier = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetLanguage() {
            this.language = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetMedium() {
            this.medium = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetProvenance() {
            this.provenance = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetPublisher() {
            this.publisher = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetRelation() {
            this.relation = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetRights() {
            this.rights = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetRightsHolder() {
            this.rightsHolder = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetSource() {
            this.source = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetSpatial() {
            this.spatial = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetSubject() {
            this.subject = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetTemporal() {
            this.temporal = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetTitle() {
            this.title = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetType() {
            this.type = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type;
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
        ABSTRACT_("abstract_", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 24, "abstract_", org.thryft.protocol.Type.LIST),
        AUDIENCE("audience", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 1, "audience", org.thryft.protocol.Type.LIST),
        CONTRIBUTOR("contributor", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 2, "contributor", org.thryft.protocol.Type.LIST),
        COVERAGE("coverage", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 3, "coverage", org.thryft.protocol.Type.LIST),
        CREATED("created", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 20, "created", org.thryft.protocol.Type.LIST),
        CREATOR("creator", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 4, "creator", org.thryft.protocol.Type.LIST),
        DATE("date", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 5, "date", org.thryft.protocol.Type.LIST),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 6, "description", org.thryft.protocol.Type.LIST),
        EXTENT("extent", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 19, "extent", org.thryft.protocol.Type.LIST),
        FORMAT("format", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 8, "format", org.thryft.protocol.Type.LIST),
        IDENTIFIER("identifier", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 7, "identifier", org.thryft.protocol.Type.LIST),
        LANGUAGE("language", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 9, "language", org.thryft.protocol.Type.LIST),
        MEDIUM("medium", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 23, "medium", org.thryft.protocol.Type.LIST),
        PROVENANCE("provenance", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 10, "provenance", org.thryft.protocol.Type.LIST),
        PUBLISHER("publisher", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 11, "publisher", org.thryft.protocol.Type.LIST),
        RELATION("relation", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 12, "relation", org.thryft.protocol.Type.LIST),
        RIGHTS("rights", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 13, "rights", org.thryft.protocol.Type.LIST),
        RIGHTS_HOLDER("rightsHolder", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 14, "rights_holder", org.thryft.protocol.Type.LIST),
        SOURCE("source", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 15, "source", org.thryft.protocol.Type.LIST),
        SPATIAL("spatial", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 21, "spatial", org.thryft.protocol.Type.LIST),
        SUBJECT("subject", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 16, "subject", org.thryft.protocol.Type.LIST),
        TEMPORAL("temporal", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 22, "temporal", org.thryft.protocol.Type.LIST),
        TITLE("title", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 17, "title", org.thryft.protocol.Type.LIST),
        TYPE("type", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 18, "type", org.thryft.protocol.Type.LIST);

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
            case "abstract_": return ABSTRACT_;
            case "audience": return AUDIENCE;
            case "contributor": return CONTRIBUTOR;
            case "coverage": return COVERAGE;
            case "created": return CREATED;
            case "creator": return CREATOR;
            case "date": return DATE;
            case "description": return DESCRIPTION;
            case "extent": return EXTENT;
            case "format": return FORMAT;
            case "identifier": return IDENTIFIER;
            case "language": return LANGUAGE;
            case "medium": return MEDIUM;
            case "provenance": return PROVENANCE;
            case "publisher": return PUBLISHER;
            case "relation": return RELATION;
            case "rights": return RIGHTS;
            case "rightsHolder": return RIGHTS_HOLDER;
            case "source": return SOURCE;
            case "spatial": return SPATIAL;
            case "subject": return SUBJECT;
            case "temporal": return TEMPORAL;
            case "title": return TITLE;
            case "type": return TYPE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "abstract_": return ABSTRACT_;
            case "audience": return AUDIENCE;
            case "contributor": return CONTRIBUTOR;
            case "coverage": return COVERAGE;
            case "created": return CREATED;
            case "creator": return CREATOR;
            case "date": return DATE;
            case "description": return DESCRIPTION;
            case "extent": return EXTENT;
            case "format": return FORMAT;
            case "identifier": return IDENTIFIER;
            case "language": return LANGUAGE;
            case "medium": return MEDIUM;
            case "provenance": return PROVENANCE;
            case "publisher": return PUBLISHER;
            case "relation": return RELATION;
            case "rights": return RIGHTS;
            case "rights_holder": return RIGHTS_HOLDER;
            case "source": return SOURCE;
            case "spatial": return SPATIAL;
            case "subject": return SUBJECT;
            case "temporal": return TEMPORAL;
            case "title": return TITLE;
            case "type": return TYPE;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAbstract_(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAudience(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateContributor(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCoverage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreated(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreator(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDescription(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateExtent(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateFormat(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateIdentifier(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLanguage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMedium(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateProvenance(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validatePublisher(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelation(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRightsHolder(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSource(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSpatial(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTemporal(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTitle(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateType(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type) throws ExceptionT;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAbstract_(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_) throws RuntimeException {
            if (abstract_ == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: abstract_ is null");
            }
            if (!abstract_.isPresent()) {
                return abstract_;
            }
            if (abstract_.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: abstract_ is less than min length 1");
            }
            return abstract_;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAudience(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience) throws RuntimeException {
            if (audience == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: audience is null");
            }
            if (!audience.isPresent()) {
                return audience;
            }
            if (audience.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: audience is less than min length 1");
            }
            return audience;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateContributor(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor) throws RuntimeException {
            if (contributor == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: contributor is null");
            }
            if (!contributor.isPresent()) {
                return contributor;
            }
            if (contributor.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: contributor is less than min length 1");
            }
            return contributor;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCoverage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage) throws RuntimeException {
            if (coverage == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: coverage is null");
            }
            if (!coverage.isPresent()) {
                return coverage;
            }
            if (coverage.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: coverage is less than min length 1");
            }
            return coverage;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreated(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created) throws RuntimeException {
            if (created == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: created is null");
            }
            if (!created.isPresent()) {
                return created;
            }
            if (created.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: created is less than min length 1");
            }
            return created;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreator(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator) throws RuntimeException {
            if (creator == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: creator is null");
            }
            if (!creator.isPresent()) {
                return creator;
            }
            if (creator.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: creator is less than min length 1");
            }
            return creator;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date) throws RuntimeException {
            if (date == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: date is null");
            }
            if (!date.isPresent()) {
                return date;
            }
            if (date.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: date is less than min length 1");
            }
            return date;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDescription(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description) throws RuntimeException {
            if (description == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: description is null");
            }
            if (!description.isPresent()) {
                return description;
            }
            if (description.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: description is less than min length 1");
            }
            return description;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateExtent(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent) throws RuntimeException {
            if (extent == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: extent is null");
            }
            if (!extent.isPresent()) {
                return extent;
            }
            if (extent.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: extent is less than min length 1");
            }
            return extent;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateFormat(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format) throws RuntimeException {
            if (format == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: format is null");
            }
            if (!format.isPresent()) {
                return format;
            }
            if (format.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: format is less than min length 1");
            }
            return format;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateIdentifier(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier) throws RuntimeException {
            if (identifier == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: identifier is null");
            }
            if (!identifier.isPresent()) {
                return identifier;
            }
            if (identifier.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: identifier is less than min length 1");
            }
            return identifier;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLanguage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language) throws RuntimeException {
            if (language == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: language is null");
            }
            if (!language.isPresent()) {
                return language;
            }
            if (language.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: language is less than min length 1");
            }
            return language;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMedium(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium) throws RuntimeException {
            if (medium == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: medium is null");
            }
            if (!medium.isPresent()) {
                return medium;
            }
            if (medium.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: medium is less than min length 1");
            }
            return medium;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateProvenance(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance) throws RuntimeException {
            if (provenance == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: provenance is null");
            }
            if (!provenance.isPresent()) {
                return provenance;
            }
            if (provenance.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: provenance is less than min length 1");
            }
            return provenance;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validatePublisher(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher) throws RuntimeException {
            if (publisher == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: publisher is null");
            }
            if (!publisher.isPresent()) {
                return publisher;
            }
            if (publisher.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: publisher is less than min length 1");
            }
            return publisher;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelation(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation) throws RuntimeException {
            if (relation == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: relation is null");
            }
            if (!relation.isPresent()) {
                return relation;
            }
            if (relation.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: relation is less than min length 1");
            }
            return relation;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRightsHolder(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder) throws RuntimeException {
            if (rightsHolder == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rightsHolder is null");
            }
            if (!rightsHolder.isPresent()) {
                return rightsHolder;
            }
            if (rightsHolder.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rightsHolder is less than min length 1");
            }
            return rightsHolder;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSource(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source) throws RuntimeException {
            if (source == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: source is null");
            }
            if (!source.isPresent()) {
                return source;
            }
            if (source.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: source is less than min length 1");
            }
            return source;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSpatial(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial) throws RuntimeException {
            if (spatial == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: spatial is null");
            }
            if (!spatial.isPresent()) {
                return spatial;
            }
            if (spatial.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: spatial is less than min length 1");
            }
            return spatial;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject) throws RuntimeException {
            if (subject == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: subject is null");
            }
            if (!subject.isPresent()) {
                return subject;
            }
            if (subject.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: subject is less than min length 1");
            }
            return subject;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTemporal(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal) throws RuntimeException {
            if (temporal == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: temporal is null");
            }
            if (!temporal.isPresent()) {
                return temporal;
            }
            if (temporal.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: temporal is less than min length 1");
            }
            return temporal;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTitle(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title) throws RuntimeException {
            if (title == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: title is null");
            }
            if (!title.isPresent()) {
                return title;
            }
            if (title.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: title is less than min length 1");
            }
            return title;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateType(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type) throws RuntimeException {
            if (type == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: type is null");
            }
            if (!type.isPresent()) {
                return type;
            }
            if (type.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: type is less than min length 1");
            }
            return type;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAbstract_(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_) {
            return abstract_;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAudience(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience) {
            return audience;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateContributor(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor) {
            return contributor;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCoverage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage) {
            return coverage;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreated(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created) {
            return created;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreator(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator) {
            return creator;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date) {
            return date;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDescription(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description) {
            return description;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateExtent(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent) {
            return extent;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateFormat(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format) {
            return format;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateIdentifier(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier) {
            return identifier;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLanguage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language) {
            return language;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMedium(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium) {
            return medium;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateProvenance(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance) {
            return provenance;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validatePublisher(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher) {
            return publisher;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelation(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation) {
            return relation;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
            return rights;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRightsHolder(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder) {
            return rightsHolder;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSource(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source) {
            return source;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSpatial(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial) {
            return spatial;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject) {
            return subject;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTemporal(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal) {
            return temporal;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTitle(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title) {
            return title;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateType(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type) {
            return type;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAbstract_(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_) throws org.thryft.protocol.InputProtocolException {
            if (abstract_ == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ABSTRACT_, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: abstract_ is null");
            }
            if (!abstract_.isPresent()) {
                return abstract_;
            }
            if (abstract_.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACT_, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: abstract_ is less than min length 1");
            }
            return abstract_;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAudience(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience) throws org.thryft.protocol.InputProtocolException {
            if (audience == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.AUDIENCE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: audience is null");
            }
            if (!audience.isPresent()) {
                return audience;
            }
            if (audience.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: audience is less than min length 1");
            }
            return audience;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateContributor(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor) throws org.thryft.protocol.InputProtocolException {
            if (contributor == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CONTRIBUTOR, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: contributor is null");
            }
            if (!contributor.isPresent()) {
                return contributor;
            }
            if (contributor.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTOR, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: contributor is less than min length 1");
            }
            return contributor;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCoverage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage) throws org.thryft.protocol.InputProtocolException {
            if (coverage == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COVERAGE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: coverage is null");
            }
            if (!coverage.isPresent()) {
                return coverage;
            }
            if (coverage.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: coverage is less than min length 1");
            }
            return coverage;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreated(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created) throws org.thryft.protocol.InputProtocolException {
            if (created == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CREATED, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: created is null");
            }
            if (!created.isPresent()) {
                return created;
            }
            if (created.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATED, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: created is less than min length 1");
            }
            return created;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreator(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator) throws org.thryft.protocol.InputProtocolException {
            if (creator == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CREATOR, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: creator is null");
            }
            if (!creator.isPresent()) {
                return creator;
            }
            if (creator.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATOR, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: creator is less than min length 1");
            }
            return creator;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date) throws org.thryft.protocol.InputProtocolException {
            if (date == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DATE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: date is null");
            }
            if (!date.isPresent()) {
                return date;
            }
            if (date.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: date is less than min length 1");
            }
            return date;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDescription(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description) throws org.thryft.protocol.InputProtocolException {
            if (description == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DESCRIPTION, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: description is null");
            }
            if (!description.isPresent()) {
                return description;
            }
            if (description.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: description is less than min length 1");
            }
            return description;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateExtent(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent) throws org.thryft.protocol.InputProtocolException {
            if (extent == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXTENT, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: extent is null");
            }
            if (!extent.isPresent()) {
                return extent;
            }
            if (extent.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: extent is less than min length 1");
            }
            return extent;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateFormat(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format) throws org.thryft.protocol.InputProtocolException {
            if (format == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FORMAT, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: format is null");
            }
            if (!format.isPresent()) {
                return format;
            }
            if (format.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMAT, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: format is less than min length 1");
            }
            return format;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateIdentifier(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier) throws org.thryft.protocol.InputProtocolException {
            if (identifier == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IDENTIFIER, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: identifier is null");
            }
            if (!identifier.isPresent()) {
                return identifier;
            }
            if (identifier.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIER, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: identifier is less than min length 1");
            }
            return identifier;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLanguage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language) throws org.thryft.protocol.InputProtocolException {
            if (language == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LANGUAGE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: language is null");
            }
            if (!language.isPresent()) {
                return language;
            }
            if (language.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: language is less than min length 1");
            }
            return language;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMedium(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium) throws org.thryft.protocol.InputProtocolException {
            if (medium == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MEDIUM, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: medium is null");
            }
            if (!medium.isPresent()) {
                return medium;
            }
            if (medium.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUM, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: medium is less than min length 1");
            }
            return medium;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateProvenance(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance) throws org.thryft.protocol.InputProtocolException {
            if (provenance == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PROVENANCE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: provenance is null");
            }
            if (!provenance.isPresent()) {
                return provenance;
            }
            if (provenance.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: provenance is less than min length 1");
            }
            return provenance;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validatePublisher(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher) throws org.thryft.protocol.InputProtocolException {
            if (publisher == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.PUBLISHER, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: publisher is null");
            }
            if (!publisher.isPresent()) {
                return publisher;
            }
            if (publisher.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHER, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: publisher is less than min length 1");
            }
            return publisher;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelation(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation) throws org.thryft.protocol.InputProtocolException {
            if (relation == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RELATION, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: relation is null");
            }
            if (!relation.isPresent()) {
                return relation;
            }
            if (relation.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: relation is less than min length 1");
            }
            return relation;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRightsHolder(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder) throws org.thryft.protocol.InputProtocolException {
            if (rightsHolder == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDER, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rightsHolder is null");
            }
            if (!rightsHolder.isPresent()) {
                return rightsHolder;
            }
            if (rightsHolder.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDER, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: rightsHolder is less than min length 1");
            }
            return rightsHolder;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSource(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source) throws org.thryft.protocol.InputProtocolException {
            if (source == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SOURCE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: source is null");
            }
            if (!source.isPresent()) {
                return source;
            }
            if (source.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: source is less than min length 1");
            }
            return source;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSpatial(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial) throws org.thryft.protocol.InputProtocolException {
            if (spatial == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SPATIAL, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: spatial is null");
            }
            if (!spatial.isPresent()) {
                return spatial;
            }
            if (spatial.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIAL, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: spatial is less than min length 1");
            }
            return spatial;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject) throws org.thryft.protocol.InputProtocolException {
            if (subject == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SUBJECT, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: subject is null");
            }
            if (!subject.isPresent()) {
                return subject;
            }
            if (subject.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: subject is less than min length 1");
            }
            return subject;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTemporal(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal) throws org.thryft.protocol.InputProtocolException {
            if (temporal == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TEMPORAL, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: temporal is null");
            }
            if (!temporal.isPresent()) {
                return temporal;
            }
            if (temporal.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORAL, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: temporal is less than min length 1");
            }
            return temporal;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTitle(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title) throws org.thryft.protocol.InputProtocolException {
            if (title == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: title is null");
            }
            if (!title.isPresent()) {
                return title;
            }
            if (title.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: title is less than min length 1");
            }
            return title;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateType(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type) throws org.thryft.protocol.InputProtocolException {
            if (type == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: type is null");
            }
            if (!type.isPresent()) {
                return type;
            }
            if (type.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPE, "org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject: type is less than min length 1");
            }
            return type;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAbstract_(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_) {
            return abstract_;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAudience(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience) {
            return audience;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateContributor(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor) {
            return contributor;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCoverage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage) {
            return coverage;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreated(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created) {
            return created;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCreator(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator) {
            return creator;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date) {
            return date;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateDescription(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description) {
            return description;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateExtent(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent) {
            return extent;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateFormat(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format) {
            return format;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateIdentifier(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier) {
            return identifier;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLanguage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language) {
            return language;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMedium(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium) {
            return medium;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateProvenance(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance) {
            return provenance;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validatePublisher(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher) {
            return publisher;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelation(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation) {
            return relation;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
            return rights;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRightsHolder(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder) {
            return rightsHolder;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSource(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source) {
            return source;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSpatial(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial) {
            return spatial;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject) {
            return subject;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTemporal(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal) {
            return temporal;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTitle(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title) {
            return title;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateType(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type) {
            return type;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
    public DublinCoreObject() {
        abstract_ = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        audience = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        contributor = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        coverage = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        created = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        creator = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        date = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        description = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        extent = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        format = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        identifier = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        language = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        medium = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        provenance = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        publisher = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        relation = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        rights = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        rightsHolder = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        source = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        spatial = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        subject = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        temporal = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        title = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        type = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
    }

    /**
     * Copy constructor
     */
    public DublinCoreObject(final DublinCoreObject other) {
        this(other.getAbstract_(), other.getAudience(), other.getContributor(), other.getCoverage(), other.getCreated(), other.getCreator(), other.getDate(), other.getDescription(), other.getExtent(), other.getFormat(), other.getIdentifier(), other.getLanguage(), other.getMedium(), other.getProvenance(), other.getPublisher(), other.getRelation(), other.getRights(), other.getRightsHolder(), other.getSource(), other.getSpatial(), other.getSubject(), other.getTemporal(), other.getTitle(), other.getType(), NopConstructionValidator.getInstance());
    }

    protected DublinCoreObject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type, ConstructionValidator validator) {
        this.abstract_ = validator.validateAbstract_(abstract_);
        this.audience = validator.validateAudience(audience);
        this.contributor = validator.validateContributor(contributor);
        this.coverage = validator.validateCoverage(coverage);
        this.created = validator.validateCreated(created);
        this.creator = validator.validateCreator(creator);
        this.date = validator.validateDate(date);
        this.description = validator.validateDescription(description);
        this.extent = validator.validateExtent(extent);
        this.format = validator.validateFormat(format);
        this.identifier = validator.validateIdentifier(identifier);
        this.language = validator.validateLanguage(language);
        this.medium = validator.validateMedium(medium);
        this.provenance = validator.validateProvenance(provenance);
        this.publisher = validator.validatePublisher(publisher);
        this.relation = validator.validateRelation(relation);
        this.rights = validator.validateRights(rights);
        this.rightsHolder = validator.validateRightsHolder(rightsHolder);
        this.source = validator.validateSource(source);
        this.spatial = validator.validateSpatial(spatial);
        this.subject = validator.validateSubject(subject);
        this.temporal = validator.validateTemporal(temporal);
        this.title = validator.validateTitle(title);
        this.type = validator.validateType(type);
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
    public static DublinCoreObject create(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> abstract_, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> audience, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> contributor, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> coverage, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> created, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> creator, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> date, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> description, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> extent, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> format, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> identifier, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> language, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> medium, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> provenance, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> publisher, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> relation, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> rights, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> rightsHolder, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> source, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> spatial, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> subject, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> temporal, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> title, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> type) {
        return new DublinCoreObject(com.google.common.base.Optional.fromNullable(abstract_), com.google.common.base.Optional.fromNullable(audience), com.google.common.base.Optional.fromNullable(contributor), com.google.common.base.Optional.fromNullable(coverage), com.google.common.base.Optional.fromNullable(created), com.google.common.base.Optional.fromNullable(creator), com.google.common.base.Optional.fromNullable(date), com.google.common.base.Optional.fromNullable(description), com.google.common.base.Optional.fromNullable(extent), com.google.common.base.Optional.fromNullable(format), com.google.common.base.Optional.fromNullable(identifier), com.google.common.base.Optional.fromNullable(language), com.google.common.base.Optional.fromNullable(medium), com.google.common.base.Optional.fromNullable(provenance), com.google.common.base.Optional.fromNullable(publisher), com.google.common.base.Optional.fromNullable(relation), com.google.common.base.Optional.fromNullable(rights), com.google.common.base.Optional.fromNullable(rightsHolder), com.google.common.base.Optional.fromNullable(source), com.google.common.base.Optional.fromNullable(spatial), com.google.common.base.Optional.fromNullable(subject), com.google.common.base.Optional.fromNullable(temporal), com.google.common.base.Optional.fromNullable(title), com.google.common.base.Optional.fromNullable(type), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static DublinCoreObject create(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type) {
        return new DublinCoreObject(abstract_, audience, contributor, coverage, created, creator, date, description, extent, format, identifier, language, medium, provenance, publisher, relation, rights, rightsHolder, source, spatial, subject, temporal, title, type, DefaultConstructionValidator.getInstance());
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

        if (!(((getAbstract_().isPresent() && other.getAbstract_().isPresent()) ? (getAbstract_().get().equals(other.getAbstract_().get())) : (!getAbstract_().isPresent() && !other.getAbstract_().isPresent())))) {
            return false;
        }

        if (!(((getAudience().isPresent() && other.getAudience().isPresent()) ? (getAudience().get().equals(other.getAudience().get())) : (!getAudience().isPresent() && !other.getAudience().isPresent())))) {
            return false;
        }

        if (!(((getContributor().isPresent() && other.getContributor().isPresent()) ? (getContributor().get().equals(other.getContributor().get())) : (!getContributor().isPresent() && !other.getContributor().isPresent())))) {
            return false;
        }

        if (!(((getCoverage().isPresent() && other.getCoverage().isPresent()) ? (getCoverage().get().equals(other.getCoverage().get())) : (!getCoverage().isPresent() && !other.getCoverage().isPresent())))) {
            return false;
        }

        if (!(((getCreated().isPresent() && other.getCreated().isPresent()) ? (getCreated().get().equals(other.getCreated().get())) : (!getCreated().isPresent() && !other.getCreated().isPresent())))) {
            return false;
        }

        if (!(((getCreator().isPresent() && other.getCreator().isPresent()) ? (getCreator().get().equals(other.getCreator().get())) : (!getCreator().isPresent() && !other.getCreator().isPresent())))) {
            return false;
        }

        if (!(((getDate().isPresent() && other.getDate().isPresent()) ? (getDate().get().equals(other.getDate().get())) : (!getDate().isPresent() && !other.getDate().isPresent())))) {
            return false;
        }

        if (!(((getDescription().isPresent() && other.getDescription().isPresent()) ? (getDescription().get().equals(other.getDescription().get())) : (!getDescription().isPresent() && !other.getDescription().isPresent())))) {
            return false;
        }

        if (!(((getExtent().isPresent() && other.getExtent().isPresent()) ? (getExtent().get().equals(other.getExtent().get())) : (!getExtent().isPresent() && !other.getExtent().isPresent())))) {
            return false;
        }

        if (!(((getFormat().isPresent() && other.getFormat().isPresent()) ? (getFormat().get().equals(other.getFormat().get())) : (!getFormat().isPresent() && !other.getFormat().isPresent())))) {
            return false;
        }

        if (!(((getIdentifier().isPresent() && other.getIdentifier().isPresent()) ? (getIdentifier().get().equals(other.getIdentifier().get())) : (!getIdentifier().isPresent() && !other.getIdentifier().isPresent())))) {
            return false;
        }

        if (!(((getLanguage().isPresent() && other.getLanguage().isPresent()) ? (getLanguage().get().equals(other.getLanguage().get())) : (!getLanguage().isPresent() && !other.getLanguage().isPresent())))) {
            return false;
        }

        if (!(((getMedium().isPresent() && other.getMedium().isPresent()) ? (getMedium().get().equals(other.getMedium().get())) : (!getMedium().isPresent() && !other.getMedium().isPresent())))) {
            return false;
        }

        if (!(((getProvenance().isPresent() && other.getProvenance().isPresent()) ? (getProvenance().get().equals(other.getProvenance().get())) : (!getProvenance().isPresent() && !other.getProvenance().isPresent())))) {
            return false;
        }

        if (!(((getPublisher().isPresent() && other.getPublisher().isPresent()) ? (getPublisher().get().equals(other.getPublisher().get())) : (!getPublisher().isPresent() && !other.getPublisher().isPresent())))) {
            return false;
        }

        if (!(((getRelation().isPresent() && other.getRelation().isPresent()) ? (getRelation().get().equals(other.getRelation().get())) : (!getRelation().isPresent() && !other.getRelation().isPresent())))) {
            return false;
        }

        if (!(((getRights().isPresent() && other.getRights().isPresent()) ? (getRights().get().equals(other.getRights().get())) : (!getRights().isPresent() && !other.getRights().isPresent())))) {
            return false;
        }

        if (!(((getRightsHolder().isPresent() && other.getRightsHolder().isPresent()) ? (getRightsHolder().get().equals(other.getRightsHolder().get())) : (!getRightsHolder().isPresent() && !other.getRightsHolder().isPresent())))) {
            return false;
        }

        if (!(((getSource().isPresent() && other.getSource().isPresent()) ? (getSource().get().equals(other.getSource().get())) : (!getSource().isPresent() && !other.getSource().isPresent())))) {
            return false;
        }

        if (!(((getSpatial().isPresent() && other.getSpatial().isPresent()) ? (getSpatial().get().equals(other.getSpatial().get())) : (!getSpatial().isPresent() && !other.getSpatial().isPresent())))) {
            return false;
        }

        if (!(((getSubject().isPresent() && other.getSubject().isPresent()) ? (getSubject().get().equals(other.getSubject().get())) : (!getSubject().isPresent() && !other.getSubject().isPresent())))) {
            return false;
        }

        if (!(((getTemporal().isPresent() && other.getTemporal().isPresent()) ? (getTemporal().get().equals(other.getTemporal().get())) : (!getTemporal().isPresent() && !other.getTemporal().isPresent())))) {
            return false;
        }

        if (!(((getTitle().isPresent() && other.getTitle().isPresent()) ? (getTitle().get().equals(other.getTitle().get())) : (!getTitle().isPresent() && !other.getTitle().isPresent())))) {
            return false;
        }

        if (!(((getType().isPresent() && other.getType().isPresent()) ? (getType().get().equals(other.getType().get())) : (!getType().isPresent() && !other.getType().isPresent())))) {
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
        case ABSTRACT_: return getAbstract_();
        case AUDIENCE: return getAudience();
        case CONTRIBUTOR: return getContributor();
        case COVERAGE: return getCoverage();
        case CREATED: return getCreated();
        case CREATOR: return getCreator();
        case DATE: return getDate();
        case DESCRIPTION: return getDescription();
        case EXTENT: return getExtent();
        case FORMAT: return getFormat();
        case IDENTIFIER: return getIdentifier();
        case LANGUAGE: return getLanguage();
        case MEDIUM: return getMedium();
        case PROVENANCE: return getProvenance();
        case PUBLISHER: return getPublisher();
        case RELATION: return getRelation();
        case RIGHTS: return getRights();
        case RIGHTS_HOLDER: return getRightsHolder();
        case SOURCE: return getSource();
        case SPATIAL: return getSpatial();
        case SUBJECT: return getSubject();
        case TEMPORAL: return getTemporal();
        case TITLE: return getTitle();
        case TYPE: return getType();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAbstract_() {
        return abstract_;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAudience() {
        return audience;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getContributor() {
        return contributor;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCoverage() {
        return coverage;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCreated() {
        return created;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCreator() {
        return creator;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getDate() {
        return date;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getDescription() {
        return description;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getExtent() {
        return extent;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getFormat() {
        return format;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getIdentifier() {
        return identifier;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getLanguage() {
        return language;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getMedium() {
        return medium;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getProvenance() {
        return provenance;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getPublisher() {
        return publisher;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRelation() {
        return relation;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRights() {
        return rights;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRightsHolder() {
        return rightsHolder;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSource() {
        return source;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSpatial() {
        return spatial;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSubject() {
        return subject;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTemporal() {
        return temporal;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTitle() {
        return title;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getAbstract_().isPresent()) {
            hashCode = 31 * hashCode + getAbstract_().get().hashCode();
        }
        if (getAudience().isPresent()) {
            hashCode = 31 * hashCode + getAudience().get().hashCode();
        }
        if (getContributor().isPresent()) {
            hashCode = 31 * hashCode + getContributor().get().hashCode();
        }
        if (getCoverage().isPresent()) {
            hashCode = 31 * hashCode + getCoverage().get().hashCode();
        }
        if (getCreated().isPresent()) {
            hashCode = 31 * hashCode + getCreated().get().hashCode();
        }
        if (getCreator().isPresent()) {
            hashCode = 31 * hashCode + getCreator().get().hashCode();
        }
        if (getDate().isPresent()) {
            hashCode = 31 * hashCode + getDate().get().hashCode();
        }
        if (getDescription().isPresent()) {
            hashCode = 31 * hashCode + getDescription().get().hashCode();
        }
        if (getExtent().isPresent()) {
            hashCode = 31 * hashCode + getExtent().get().hashCode();
        }
        if (getFormat().isPresent()) {
            hashCode = 31 * hashCode + getFormat().get().hashCode();
        }
        if (getIdentifier().isPresent()) {
            hashCode = 31 * hashCode + getIdentifier().get().hashCode();
        }
        if (getLanguage().isPresent()) {
            hashCode = 31 * hashCode + getLanguage().get().hashCode();
        }
        if (getMedium().isPresent()) {
            hashCode = 31 * hashCode + getMedium().get().hashCode();
        }
        if (getProvenance().isPresent()) {
            hashCode = 31 * hashCode + getProvenance().get().hashCode();
        }
        if (getPublisher().isPresent()) {
            hashCode = 31 * hashCode + getPublisher().get().hashCode();
        }
        if (getRelation().isPresent()) {
            hashCode = 31 * hashCode + getRelation().get().hashCode();
        }
        if (getRights().isPresent()) {
            hashCode = 31 * hashCode + getRights().get().hashCode();
        }
        if (getRightsHolder().isPresent()) {
            hashCode = 31 * hashCode + getRightsHolder().get().hashCode();
        }
        if (getSource().isPresent()) {
            hashCode = 31 * hashCode + getSource().get().hashCode();
        }
        if (getSpatial().isPresent()) {
            hashCode = 31 * hashCode + getSpatial().get().hashCode();
        }
        if (getSubject().isPresent()) {
            hashCode = 31 * hashCode + getSubject().get().hashCode();
        }
        if (getTemporal().isPresent()) {
            hashCode = 31 * hashCode + getTemporal().get().hashCode();
        }
        if (getTitle().isPresent()) {
            hashCode = 31 * hashCode + getTitle().get().hashCode();
        }
        if (getType().isPresent()) {
            hashCode = 31 * hashCode + getType().get().hashCode();
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
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_ = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                try {
                    abstract_ = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACT_, e.getCause());
                }
            }
            if (__list.getSize() > 1) {
                try {
                    audience = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCE, e.getCause());
                }
            }
            if (__list.getSize() > 2) {
                try {
                    contributor = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTOR, e.getCause());
                }
            }
            if (__list.getSize() > 3) {
                try {
                    coverage = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGE, e.getCause());
                }
            }
            if (__list.getSize() > 4) {
                try {
                    created = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATED, e.getCause());
                }
            }
            if (__list.getSize() > 5) {
                try {
                    creator = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATOR, e.getCause());
                }
            }
            if (__list.getSize() > 6) {
                try {
                    date = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE, e.getCause());
                }
            }
            if (__list.getSize() > 7) {
                try {
                    description = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION, e.getCause());
                }
            }
            if (__list.getSize() > 8) {
                try {
                    extent = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT, e.getCause());
                }
            }
            if (__list.getSize() > 9) {
                try {
                    format = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMAT, e.getCause());
                }
            }
            if (__list.getSize() > 10) {
                try {
                    identifier = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIER, e.getCause());
                }
            }
            if (__list.getSize() > 11) {
                try {
                    language = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGE, e.getCause());
                }
            }
            if (__list.getSize() > 12) {
                try {
                    medium = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUM, e.getCause());
                }
            }
            if (__list.getSize() > 13) {
                try {
                    provenance = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCE, e.getCause());
                }
            }
            if (__list.getSize() > 14) {
                try {
                    publisher = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHER, e.getCause());
                }
            }
            if (__list.getSize() > 15) {
                try {
                    relation = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION, e.getCause());
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
                    rightsHolder = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDER, e.getCause());
                }
            }
            if (__list.getSize() > 18) {
                try {
                    source = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE, e.getCause());
                }
            }
            if (__list.getSize() > 19) {
                try {
                    spatial = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIAL, e.getCause());
                }
            }
            if (__list.getSize() > 20) {
                try {
                    subject = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT, e.getCause());
                }
            }
            if (__list.getSize() > 21) {
                try {
                    temporal = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORAL, e.getCause());
                }
            }
            if (__list.getSize() > 22) {
                try {
                    title = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE, e.getCause());
                }
            }
            if (__list.getSize() > 23) {
                try {
                    type = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPE, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new DublinCoreObject(DefaultReadValidator.getInstance().validateAbstract_(abstract_), DefaultReadValidator.getInstance().validateAudience(audience), DefaultReadValidator.getInstance().validateContributor(contributor), DefaultReadValidator.getInstance().validateCoverage(coverage), DefaultReadValidator.getInstance().validateCreated(created), DefaultReadValidator.getInstance().validateCreator(creator), DefaultReadValidator.getInstance().validateDate(date), DefaultReadValidator.getInstance().validateDescription(description), DefaultReadValidator.getInstance().validateExtent(extent), DefaultReadValidator.getInstance().validateFormat(format), DefaultReadValidator.getInstance().validateIdentifier(identifier), DefaultReadValidator.getInstance().validateLanguage(language), DefaultReadValidator.getInstance().validateMedium(medium), DefaultReadValidator.getInstance().validateProvenance(provenance), DefaultReadValidator.getInstance().validatePublisher(publisher), DefaultReadValidator.getInstance().validateRelation(relation), DefaultReadValidator.getInstance().validateRights(rights), DefaultReadValidator.getInstance().validateRightsHolder(rightsHolder), DefaultReadValidator.getInstance().validateSource(source), DefaultReadValidator.getInstance().validateSpatial(spatial), DefaultReadValidator.getInstance().validateSubject(subject), DefaultReadValidator.getInstance().validateTemporal(temporal), DefaultReadValidator.getInstance().validateTitle(title), DefaultReadValidator.getInstance().validateType(type), NopConstructionValidator.getInstance());
    }

    public static DublinCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static DublinCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_ = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "abstract_": {
                    if (!ifield.hasId() || ifield.getId() == 24) {
                        try {
                            abstract_ = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ABSTRACT_, e.getCause());
                        }
                    }
                    break;
                }
                case "audience": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            audience = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AUDIENCE, e.getCause());
                        }
                    }
                    break;
                }
                case "contributor": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            contributor = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CONTRIBUTOR, e.getCause());
                        }
                    }
                    break;
                }
                case "coverage": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            coverage = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COVERAGE, e.getCause());
                        }
                    }
                    break;
                }
                case "created": {
                    if (!ifield.hasId() || ifield.getId() == 20) {
                        try {
                            created = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATED, e.getCause());
                        }
                    }
                    break;
                }
                case "creator": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        try {
                            creator = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CREATOR, e.getCause());
                        }
                    }
                    break;
                }
                case "date": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        try {
                            date = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE, e.getCause());
                        }
                    }
                    break;
                }
                case "description": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        try {
                            description = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION, e.getCause());
                        }
                    }
                    break;
                }
                case "extent": {
                    if (!ifield.hasId() || ifield.getId() == 19) {
                        try {
                            extent = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT, e.getCause());
                        }
                    }
                    break;
                }
                case "format": {
                    if (!ifield.hasId() || ifield.getId() == 8) {
                        try {
                            format = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FORMAT, e.getCause());
                        }
                    }
                    break;
                }
                case "identifier": {
                    if (!ifield.hasId() || ifield.getId() == 7) {
                        try {
                            identifier = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IDENTIFIER, e.getCause());
                        }
                    }
                    break;
                }
                case "language": {
                    if (!ifield.hasId() || ifield.getId() == 9) {
                        try {
                            language = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LANGUAGE, e.getCause());
                        }
                    }
                    break;
                }
                case "medium": {
                    if (!ifield.hasId() || ifield.getId() == 23) {
                        try {
                            medium = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MEDIUM, e.getCause());
                        }
                    }
                    break;
                }
                case "provenance": {
                    if (!ifield.hasId() || ifield.getId() == 10) {
                        try {
                            provenance = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PROVENANCE, e.getCause());
                        }
                    }
                    break;
                }
                case "publisher": {
                    if (!ifield.hasId() || ifield.getId() == 11) {
                        try {
                            publisher = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.PUBLISHER, e.getCause());
                        }
                    }
                    break;
                }
                case "relation": {
                    if (!ifield.hasId() || ifield.getId() == 12) {
                        try {
                            relation = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION, e.getCause());
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
                case "rights_holder": {
                    if (!ifield.hasId() || ifield.getId() == 14) {
                        try {
                            rightsHolder = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RIGHTS_HOLDER, e.getCause());
                        }
                    }
                    break;
                }
                case "source": {
                    if (!ifield.hasId() || ifield.getId() == 15) {
                        try {
                            source = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SOURCE, e.getCause());
                        }
                    }
                    break;
                }
                case "spatial": {
                    if (!ifield.hasId() || ifield.getId() == 21) {
                        try {
                            spatial = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SPATIAL, e.getCause());
                        }
                    }
                    break;
                }
                case "subject": {
                    if (!ifield.hasId() || ifield.getId() == 16) {
                        try {
                            subject = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT, e.getCause());
                        }
                    }
                    break;
                }
                case "temporal": {
                    if (!ifield.hasId() || ifield.getId() == 22) {
                        try {
                            temporal = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TEMPORAL, e.getCause());
                        }
                    }
                    break;
                }
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 17) {
                        try {
                            title = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE, e.getCause());
                        }
                    }
                    break;
                }
                case "type": {
                    if (!ifield.hasId() || ifield.getId() == 18) {
                        try {
                            type = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TYPE, e.getCause());
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
        return new DublinCoreObject(DefaultReadValidator.getInstance().validateAbstract_(abstract_), DefaultReadValidator.getInstance().validateAudience(audience), DefaultReadValidator.getInstance().validateContributor(contributor), DefaultReadValidator.getInstance().validateCoverage(coverage), DefaultReadValidator.getInstance().validateCreated(created), DefaultReadValidator.getInstance().validateCreator(creator), DefaultReadValidator.getInstance().validateDate(date), DefaultReadValidator.getInstance().validateDescription(description), DefaultReadValidator.getInstance().validateExtent(extent), DefaultReadValidator.getInstance().validateFormat(format), DefaultReadValidator.getInstance().validateIdentifier(identifier), DefaultReadValidator.getInstance().validateLanguage(language), DefaultReadValidator.getInstance().validateMedium(medium), DefaultReadValidator.getInstance().validateProvenance(provenance), DefaultReadValidator.getInstance().validatePublisher(publisher), DefaultReadValidator.getInstance().validateRelation(relation), DefaultReadValidator.getInstance().validateRights(rights), DefaultReadValidator.getInstance().validateRightsHolder(rightsHolder), DefaultReadValidator.getInstance().validateSource(source), DefaultReadValidator.getInstance().validateSpatial(spatial), DefaultReadValidator.getInstance().validateSubject(subject), DefaultReadValidator.getInstance().validateTemporal(temporal), DefaultReadValidator.getInstance().validateTitle(title), DefaultReadValidator.getInstance().validateType(type), NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceAbstract_(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_) {
        return new DublinCoreObject(DefaultConstructionValidator.getInstance().validateAbstract_(abstract_), this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceAbstract_(final com.google.common.collect.ImmutableList<String> abstract_) {
        return replaceAbstract_(com.google.common.base.Optional.fromNullable(abstract_));
    }

    public DublinCoreObject replaceAudience(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience) {
        return new DublinCoreObject(this.abstract_, DefaultConstructionValidator.getInstance().validateAudience(audience), this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceAudience(final com.google.common.collect.ImmutableList<String> audience) {
        return replaceAudience(com.google.common.base.Optional.fromNullable(audience));
    }

    public DublinCoreObject replaceContributor(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor) {
        return new DublinCoreObject(this.abstract_, this.audience, DefaultConstructionValidator.getInstance().validateContributor(contributor), this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceContributor(final com.google.common.collect.ImmutableList<String> contributor) {
        return replaceContributor(com.google.common.base.Optional.fromNullable(contributor));
    }

    public DublinCoreObject replaceCoverage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, DefaultConstructionValidator.getInstance().validateCoverage(coverage), this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceCoverage(final com.google.common.collect.ImmutableList<String> coverage) {
        return replaceCoverage(com.google.common.base.Optional.fromNullable(coverage));
    }

    public DublinCoreObject replaceCreated(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, DefaultConstructionValidator.getInstance().validateCreated(created), this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceCreated(final com.google.common.collect.ImmutableList<String> created) {
        return replaceCreated(com.google.common.base.Optional.fromNullable(created));
    }

    public DublinCoreObject replaceCreator(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, DefaultConstructionValidator.getInstance().validateCreator(creator), this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceCreator(final com.google.common.collect.ImmutableList<String> creator) {
        return replaceCreator(com.google.common.base.Optional.fromNullable(creator));
    }

    public DublinCoreObject replaceDate(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, DefaultConstructionValidator.getInstance().validateDate(date), this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceDate(final com.google.common.collect.ImmutableList<String> date) {
        return replaceDate(com.google.common.base.Optional.fromNullable(date));
    }

    public DublinCoreObject replaceDescription(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, DefaultConstructionValidator.getInstance().validateDescription(description), this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceDescription(final com.google.common.collect.ImmutableList<String> description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public DublinCoreObject replaceExtent(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, DefaultConstructionValidator.getInstance().validateExtent(extent), this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceExtent(final com.google.common.collect.ImmutableList<String> extent) {
        return replaceExtent(com.google.common.base.Optional.fromNullable(extent));
    }

    public DublinCoreObject replaceFormat(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, DefaultConstructionValidator.getInstance().validateFormat(format), this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceFormat(final com.google.common.collect.ImmutableList<String> format) {
        return replaceFormat(com.google.common.base.Optional.fromNullable(format));
    }

    public DublinCoreObject replaceIdentifier(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, DefaultConstructionValidator.getInstance().validateIdentifier(identifier), this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceIdentifier(final com.google.common.collect.ImmutableList<String> identifier) {
        return replaceIdentifier(com.google.common.base.Optional.fromNullable(identifier));
    }

    public DublinCoreObject replaceLanguage(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, DefaultConstructionValidator.getInstance().validateLanguage(language), this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceLanguage(final com.google.common.collect.ImmutableList<String> language) {
        return replaceLanguage(com.google.common.base.Optional.fromNullable(language));
    }

    public DublinCoreObject replaceMedium(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, DefaultConstructionValidator.getInstance().validateMedium(medium), this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceMedium(final com.google.common.collect.ImmutableList<String> medium) {
        return replaceMedium(com.google.common.base.Optional.fromNullable(medium));
    }

    public DublinCoreObject replaceProvenance(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, DefaultConstructionValidator.getInstance().validateProvenance(provenance), this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceProvenance(final com.google.common.collect.ImmutableList<String> provenance) {
        return replaceProvenance(com.google.common.base.Optional.fromNullable(provenance));
    }

    public DublinCoreObject replacePublisher(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, DefaultConstructionValidator.getInstance().validatePublisher(publisher), this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replacePublisher(final com.google.common.collect.ImmutableList<String> publisher) {
        return replacePublisher(com.google.common.base.Optional.fromNullable(publisher));
    }

    public DublinCoreObject replaceRelation(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, DefaultConstructionValidator.getInstance().validateRelation(relation), this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceRelation(final com.google.common.collect.ImmutableList<String> relation) {
        return replaceRelation(com.google.common.base.Optional.fromNullable(relation));
    }

    public DublinCoreObject replaceRights(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, DefaultConstructionValidator.getInstance().validateRights(rights), this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceRights(final com.google.common.collect.ImmutableList<String> rights) {
        return replaceRights(com.google.common.base.Optional.fromNullable(rights));
    }

    public DublinCoreObject replaceRightsHolder(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, DefaultConstructionValidator.getInstance().validateRightsHolder(rightsHolder), this.source, this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceRightsHolder(final com.google.common.collect.ImmutableList<String> rightsHolder) {
        return replaceRightsHolder(com.google.common.base.Optional.fromNullable(rightsHolder));
    }

    public DublinCoreObject replaceSource(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, DefaultConstructionValidator.getInstance().validateSource(source), this.spatial, this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceSource(final com.google.common.collect.ImmutableList<String> source) {
        return replaceSource(com.google.common.base.Optional.fromNullable(source));
    }

    public DublinCoreObject replaceSpatial(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, DefaultConstructionValidator.getInstance().validateSpatial(spatial), this.subject, this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceSpatial(final com.google.common.collect.ImmutableList<String> spatial) {
        return replaceSpatial(com.google.common.base.Optional.fromNullable(spatial));
    }

    public DublinCoreObject replaceSubject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, DefaultConstructionValidator.getInstance().validateSubject(subject), this.temporal, this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceSubject(final com.google.common.collect.ImmutableList<String> subject) {
        return replaceSubject(com.google.common.base.Optional.fromNullable(subject));
    }

    public DublinCoreObject replaceTemporal(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, DefaultConstructionValidator.getInstance().validateTemporal(temporal), this.title, this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceTemporal(final com.google.common.collect.ImmutableList<String> temporal) {
        return replaceTemporal(com.google.common.base.Optional.fromNullable(temporal));
    }

    public DublinCoreObject replaceTitle(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, DefaultConstructionValidator.getInstance().validateTitle(title), this.type, NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceTitle(final com.google.common.collect.ImmutableList<String> title) {
        return replaceTitle(com.google.common.base.Optional.fromNullable(title));
    }

    public DublinCoreObject replaceType(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type) {
        return new DublinCoreObject(this.abstract_, this.audience, this.contributor, this.coverage, this.created, this.creator, this.date, this.description, this.extent, this.format, this.identifier, this.language, this.medium, this.provenance, this.publisher, this.relation, this.rights, this.rightsHolder, this.source, this.spatial, this.subject, this.temporal, this.title, DefaultConstructionValidator.getInstance().validateType(type), NopConstructionValidator.getInstance());
    }

    public DublinCoreObject replaceType(final com.google.common.collect.ImmutableList<String> type) {
        return replaceType(com.google.common.base.Optional.fromNullable(type));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("abstract_", getAbstract_().orNull()).add("audience", getAudience().orNull()).add("contributor", getContributor().orNull()).add("coverage", getCoverage().orNull()).add("created", getCreated().orNull()).add("creator", getCreator().orNull()).add("date", getDate().orNull()).add("description", getDescription().orNull()).add("extent", getExtent().orNull()).add("format", getFormat().orNull()).add("identifier", getIdentifier().orNull()).add("language", getLanguage().orNull()).add("medium", getMedium().orNull()).add("provenance", getProvenance().orNull()).add("publisher", getPublisher().orNull()).add("relation", getRelation().orNull()).add("rights", getRights().orNull()).add("rights_holder", getRightsHolder().orNull()).add("source", getSource().orNull()).add("spatial", getSpatial().orNull()).add("subject", getSubject().orNull()).add("temporal", getTemporal().orNull()).add("title", getTitle().orNull()).add("type", getType().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 24);

        if (getAbstract_().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAbstract_().get().size());
            for (final String _iter0 : getAbstract_().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getAudience().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAudience().get().size());
            for (final String _iter0 : getAudience().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getContributor().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getContributor().get().size());
            for (final String _iter0 : getContributor().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getCoverage().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCoverage().get().size());
            for (final String _iter0 : getCoverage().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getCreated().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCreated().get().size());
            for (final String _iter0 : getCreated().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getCreator().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCreator().get().size());
            for (final String _iter0 : getCreator().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getDate().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getDate().get().size());
            for (final String _iter0 : getDate().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getDescription().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getDescription().get().size());
            for (final String _iter0 : getDescription().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getExtent().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getExtent().get().size());
            for (final String _iter0 : getExtent().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getFormat().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getFormat().get().size());
            for (final String _iter0 : getFormat().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getIdentifier().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getIdentifier().get().size());
            for (final String _iter0 : getIdentifier().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getLanguage().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getLanguage().get().size());
            for (final String _iter0 : getLanguage().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getMedium().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getMedium().get().size());
            for (final String _iter0 : getMedium().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getProvenance().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getProvenance().get().size());
            for (final String _iter0 : getProvenance().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getPublisher().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getPublisher().get().size());
            for (final String _iter0 : getPublisher().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getRelation().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRelation().get().size());
            for (final String _iter0 : getRelation().get()) {
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

        if (getRightsHolder().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRightsHolder().get().size());
            for (final String _iter0 : getRightsHolder().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getSource().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSource().get().size());
            for (final String _iter0 : getSource().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getSpatial().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSpatial().get().size());
            for (final String _iter0 : getSpatial().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getSubject().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSubject().get().size());
            for (final String _iter0 : getSubject().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getTemporal().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTemporal().get().size());
            for (final String _iter0 : getTemporal().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getTitle().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTitle().get().size());
            for (final String _iter0 : getTitle().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getType().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getType().get().size());
            for (final String _iter0 : getType().get()) {
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
        if (getAbstract_().isPresent()) {
            oprot.writeFieldBegin("abstract_", org.thryft.protocol.Type.LIST, (short)24);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAbstract_().get().size());
            for (final String _iter0 : getAbstract_().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getAudience().isPresent()) {
            oprot.writeFieldBegin("audience", org.thryft.protocol.Type.LIST, (short)1);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAudience().get().size());
            for (final String _iter0 : getAudience().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getContributor().isPresent()) {
            oprot.writeFieldBegin("contributor", org.thryft.protocol.Type.LIST, (short)2);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getContributor().get().size());
            for (final String _iter0 : getContributor().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getCoverage().isPresent()) {
            oprot.writeFieldBegin("coverage", org.thryft.protocol.Type.LIST, (short)3);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCoverage().get().size());
            for (final String _iter0 : getCoverage().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getCreated().isPresent()) {
            oprot.writeFieldBegin("created", org.thryft.protocol.Type.LIST, (short)20);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCreated().get().size());
            for (final String _iter0 : getCreated().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getCreator().isPresent()) {
            oprot.writeFieldBegin("creator", org.thryft.protocol.Type.LIST, (short)4);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCreator().get().size());
            for (final String _iter0 : getCreator().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getDate().isPresent()) {
            oprot.writeFieldBegin("date", org.thryft.protocol.Type.LIST, (short)5);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getDate().get().size());
            for (final String _iter0 : getDate().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getDescription().isPresent()) {
            oprot.writeFieldBegin("description", org.thryft.protocol.Type.LIST, (short)6);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getDescription().get().size());
            for (final String _iter0 : getDescription().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getExtent().isPresent()) {
            oprot.writeFieldBegin("extent", org.thryft.protocol.Type.LIST, (short)19);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getExtent().get().size());
            for (final String _iter0 : getExtent().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getFormat().isPresent()) {
            oprot.writeFieldBegin("format", org.thryft.protocol.Type.LIST, (short)8);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getFormat().get().size());
            for (final String _iter0 : getFormat().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getIdentifier().isPresent()) {
            oprot.writeFieldBegin("identifier", org.thryft.protocol.Type.LIST, (short)7);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getIdentifier().get().size());
            for (final String _iter0 : getIdentifier().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getLanguage().isPresent()) {
            oprot.writeFieldBegin("language", org.thryft.protocol.Type.LIST, (short)9);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getLanguage().get().size());
            for (final String _iter0 : getLanguage().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getMedium().isPresent()) {
            oprot.writeFieldBegin("medium", org.thryft.protocol.Type.LIST, (short)23);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getMedium().get().size());
            for (final String _iter0 : getMedium().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getProvenance().isPresent()) {
            oprot.writeFieldBegin("provenance", org.thryft.protocol.Type.LIST, (short)10);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getProvenance().get().size());
            for (final String _iter0 : getProvenance().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getPublisher().isPresent()) {
            oprot.writeFieldBegin("publisher", org.thryft.protocol.Type.LIST, (short)11);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getPublisher().get().size());
            for (final String _iter0 : getPublisher().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getRelation().isPresent()) {
            oprot.writeFieldBegin("relation", org.thryft.protocol.Type.LIST, (short)12);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRelation().get().size());
            for (final String _iter0 : getRelation().get()) {
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

        if (getRightsHolder().isPresent()) {
            oprot.writeFieldBegin("rights_holder", org.thryft.protocol.Type.LIST, (short)14);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRightsHolder().get().size());
            for (final String _iter0 : getRightsHolder().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getSource().isPresent()) {
            oprot.writeFieldBegin("source", org.thryft.protocol.Type.LIST, (short)15);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSource().get().size());
            for (final String _iter0 : getSource().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getSpatial().isPresent()) {
            oprot.writeFieldBegin("spatial", org.thryft.protocol.Type.LIST, (short)21);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSpatial().get().size());
            for (final String _iter0 : getSpatial().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getSubject().isPresent()) {
            oprot.writeFieldBegin("subject", org.thryft.protocol.Type.LIST, (short)16);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSubject().get().size());
            for (final String _iter0 : getSubject().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getTemporal().isPresent()) {
            oprot.writeFieldBegin("temporal", org.thryft.protocol.Type.LIST, (short)22);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTemporal().get().size());
            for (final String _iter0 : getTemporal().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getTitle().isPresent()) {
            oprot.writeFieldBegin("title", org.thryft.protocol.Type.LIST, (short)17);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTitle().get().size());
            for (final String _iter0 : getTitle().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getType().isPresent()) {
            oprot.writeFieldBegin("type", org.thryft.protocol.Type.LIST, (short)18);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getType().get().size());
            for (final String _iter0 : getType().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> abstract_;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> audience;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> contributor;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> coverage;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> created;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> creator;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> date;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> description;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> extent;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> format;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> identifier;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> language;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> medium;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> provenance;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> publisher;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relation;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rights;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> rightsHolder;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> source;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> spatial;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subject;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> temporal;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> title;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> type;
}
