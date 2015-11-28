package net.lab1318.costume.api.models.object;

public class ObjectQuery implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            excludeAgentNameTexts = com.google.common.base.Optional.absent();
            excludeCategories = com.google.common.base.Optional.absent();
            excludeCollectionIds = com.google.common.base.Optional.absent();
            excludeInstitutionIds = com.google.common.base.Optional.absent();
            excludeSubjectTermTexts = com.google.common.base.Optional.absent();
            includeAgentNameTexts = com.google.common.base.Optional.absent();
            includeCategories = com.google.common.base.Optional.absent();
            includeCollectionIds = com.google.common.base.Optional.absent();
            includeInstitutionIds = com.google.common.base.Optional.absent();
            includeSubjectTermTexts = com.google.common.base.Optional.absent();
            moreLikeObjectId = com.google.common.base.Optional.absent();
            queryString = com.google.common.base.Optional.absent();
        }

        public Builder(final ObjectQuery other) {
            this.excludeAgentNameTexts = other.getExcludeAgentNameTexts();
            this.excludeCategories = other.getExcludeCategories();
            this.excludeCollectionIds = other.getExcludeCollectionIds();
            this.excludeInstitutionIds = other.getExcludeInstitutionIds();
            this.excludeSubjectTermTexts = other.getExcludeSubjectTermTexts();
            this.includeAgentNameTexts = other.getIncludeAgentNameTexts();
            this.includeCategories = other.getIncludeCategories();
            this.includeCollectionIds = other.getIncludeCollectionIds();
            this.includeInstitutionIds = other.getIncludeInstitutionIds();
            this.includeSubjectTermTexts = other.getIncludeSubjectTermTexts();
            this.moreLikeObjectId = other.getMoreLikeObjectId();
            this.queryString = other.getQueryString();
        }

        protected ObjectQuery _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollectionIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutionIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollectionIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutionIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId, final com.google.common.base.Optional<String> queryString) {
            return new ObjectQuery(excludeAgentNameTexts, excludeCategories, excludeCollectionIds, excludeInstitutionIds, excludeSubjectTermTexts, includeAgentNameTexts, includeCategories, includeCollectionIds, includeInstitutionIds, includeSubjectTermTexts, moreLikeObjectId, queryString);
        }

        public ObjectQuery build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(excludeAgentNameTexts, "net.lab1318.costume.api.models.object.ObjectQuery: missing excludeAgentNameTexts"), com.google.common.base.Preconditions.checkNotNull(excludeCategories, "net.lab1318.costume.api.models.object.ObjectQuery: missing excludeCategories"), com.google.common.base.Preconditions.checkNotNull(excludeCollectionIds, "net.lab1318.costume.api.models.object.ObjectQuery: missing excludeCollectionIds"), com.google.common.base.Preconditions.checkNotNull(excludeInstitutionIds, "net.lab1318.costume.api.models.object.ObjectQuery: missing excludeInstitutionIds"), com.google.common.base.Preconditions.checkNotNull(excludeSubjectTermTexts, "net.lab1318.costume.api.models.object.ObjectQuery: missing excludeSubjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(includeAgentNameTexts, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeAgentNameTexts"), com.google.common.base.Preconditions.checkNotNull(includeCategories, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeCategories"), com.google.common.base.Preconditions.checkNotNull(includeCollectionIds, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeCollectionIds"), com.google.common.base.Preconditions.checkNotNull(includeInstitutionIds, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeInstitutionIds"), com.google.common.base.Preconditions.checkNotNull(includeSubjectTermTexts, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeSubjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(moreLikeObjectId, "net.lab1318.costume.api.models.object.ObjectQuery: missing moreLikeObjectId"), com.google.common.base.Preconditions.checkNotNull(queryString, "net.lab1318.costume.api.models.object.ObjectQuery: missing queryString"));
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeAgentNameTexts() {
            return excludeAgentNameTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeCategories() {
            return excludeCategories;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> getExcludeCollectionIds() {
            return excludeCollectionIds;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getExcludeInstitutionIds() {
            return excludeInstitutionIds;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeSubjectTermTexts() {
            return excludeSubjectTermTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeAgentNameTexts() {
            return includeAgentNameTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeCategories() {
            return includeCategories;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> getIncludeCollectionIds() {
            return includeCollectionIds;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getIncludeInstitutionIds() {
            return includeInstitutionIds;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeSubjectTermTexts() {
            return includeSubjectTermTexts;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> getMoreLikeObjectId() {
            return moreLikeObjectId;
        }

        public final com.google.common.base.Optional<String> getQueryString() {
            return queryString;
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
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
            }
            if (__list.getSize() > 1) {
                try {
                    excludeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                    excludeCollectionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequence.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                    excludeInstitutionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                    excludeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                    includeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                    includeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                    includeCollectionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequence.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                    includeInstitutionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                    includeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                    moreLikeObjectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                }
            }
            if (__list.getSize() > 11) {
                queryString = com.google.common.base.Optional.of(iprot.readString());
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
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_categories": {
                    try {
                        excludeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_collection_ids": {
                    try {
                        excludeCollectionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequence.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "exclude_institution_ids": {
                    try {
                        excludeInstitutionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
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
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
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
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
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
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_collection_ids": {
                    try {
                        includeCollectionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequence.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "include_institution_ids": {
                    try {
                        includeInstitutionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
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
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                    break;
                }
                case "more_like_object_id": {
                    try {
                        moreLikeObjectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                    } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                    }
                    break;
                }
                case "query_string": {
                    queryString = com.google.common.base.Optional.of(iprot.readString());
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

        public Builder setExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
            this.excludeCategories = com.google.common.base.Preconditions.checkNotNull(excludeCategories);
            return this;
        }

        public Builder setExcludeCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> excludeCategories) {
            this.excludeCategories = com.google.common.base.Optional.fromNullable(excludeCategories);
            return this;
        }

        public Builder setExcludeCollectionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollectionIds) {
            this.excludeCollectionIds = com.google.common.base.Preconditions.checkNotNull(excludeCollectionIds);
            return this;
        }

        public Builder setExcludeCollectionIds(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> excludeCollectionIds) {
            this.excludeCollectionIds = com.google.common.base.Optional.fromNullable(excludeCollectionIds);
            return this;
        }

        public Builder setExcludeInstitutionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutionIds) {
            this.excludeInstitutionIds = com.google.common.base.Preconditions.checkNotNull(excludeInstitutionIds);
            return this;
        }

        public Builder setExcludeInstitutionIds(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> excludeInstitutionIds) {
            this.excludeInstitutionIds = com.google.common.base.Optional.fromNullable(excludeInstitutionIds);
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

        public Builder setIfPresent(final ObjectQuery other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getExcludeAgentNameTexts().isPresent()) {
                setExcludeAgentNameTexts(other.getExcludeAgentNameTexts());
            }
            if (other.getExcludeCategories().isPresent()) {
                setExcludeCategories(other.getExcludeCategories());
            }
            if (other.getExcludeCollectionIds().isPresent()) {
                setExcludeCollectionIds(other.getExcludeCollectionIds());
            }
            if (other.getExcludeInstitutionIds().isPresent()) {
                setExcludeInstitutionIds(other.getExcludeInstitutionIds());
            }
            if (other.getExcludeSubjectTermTexts().isPresent()) {
                setExcludeSubjectTermTexts(other.getExcludeSubjectTermTexts());
            }
            if (other.getIncludeAgentNameTexts().isPresent()) {
                setIncludeAgentNameTexts(other.getIncludeAgentNameTexts());
            }
            if (other.getIncludeCategories().isPresent()) {
                setIncludeCategories(other.getIncludeCategories());
            }
            if (other.getIncludeCollectionIds().isPresent()) {
                setIncludeCollectionIds(other.getIncludeCollectionIds());
            }
            if (other.getIncludeInstitutionIds().isPresent()) {
                setIncludeInstitutionIds(other.getIncludeInstitutionIds());
            }
            if (other.getIncludeSubjectTermTexts().isPresent()) {
                setIncludeSubjectTermTexts(other.getIncludeSubjectTermTexts());
            }
            if (other.getMoreLikeObjectId().isPresent()) {
                setMoreLikeObjectId(other.getMoreLikeObjectId());
            }
            if (other.getQueryString().isPresent()) {
                setQueryString(other.getQueryString());
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

        public Builder setIncludeCollectionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollectionIds) {
            this.includeCollectionIds = com.google.common.base.Preconditions.checkNotNull(includeCollectionIds);
            return this;
        }

        public Builder setIncludeCollectionIds(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionIds) {
            this.includeCollectionIds = com.google.common.base.Optional.fromNullable(includeCollectionIds);
            return this;
        }

        public Builder setIncludeInstitutionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutionIds) {
            this.includeInstitutionIds = com.google.common.base.Preconditions.checkNotNull(includeInstitutionIds);
            return this;
        }

        public Builder setIncludeInstitutionIds(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionIds) {
            this.includeInstitutionIds = com.google.common.base.Optional.fromNullable(includeInstitutionIds);
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

        public Builder setMoreLikeObjectId(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId) {
            this.moreLikeObjectId = com.google.common.base.Preconditions.checkNotNull(moreLikeObjectId);
            return this;
        }

        public Builder setMoreLikeObjectId(@javax.annotation.Nullable final net.lab1318.costume.api.models.object.ObjectId moreLikeObjectId) {
            this.moreLikeObjectId = com.google.common.base.Optional.fromNullable(moreLikeObjectId);
            return this;
        }

        public Builder setQueryString(final com.google.common.base.Optional<String> queryString) {
            this.queryString = com.google.common.base.Preconditions.checkNotNull(queryString);
            return this;
        }

        public Builder setQueryString(@javax.annotation.Nullable final String queryString) {
            this.queryString = com.google.common.base.Optional.fromNullable(queryString);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "exclude_agent_name_texts": setExcludeAgentNameTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_categories": setExcludeCategories((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "exclude_collection_ids": setExcludeCollectionIds((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>)value); return this;
            case "exclude_institution_ids": setExcludeInstitutionIds((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>)value); return this;
            case "exclude_subject_term_texts": setExcludeSubjectTermTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_agent_name_texts": setIncludeAgentNameTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_categories": setIncludeCategories((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "include_collection_ids": setIncludeCollectionIds((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>)value); return this;
            case "include_institution_ids": setIncludeInstitutionIds((com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>)value); return this;
            case "include_subject_term_texts": setIncludeSubjectTermTexts((com.google.common.collect.ImmutableSet<String>)value); return this;
            case "more_like_object_id": setMoreLikeObjectId((net.lab1318.costume.api.models.object.ObjectId)value); return this;
            case "query_string": setQueryString((String)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetExcludeAgentNameTexts() {
            this.excludeAgentNameTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeCategories() {
            this.excludeCategories = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeCollectionIds() {
            this.excludeCollectionIds = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeInstitutionIds() {
            this.excludeInstitutionIds = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetExcludeSubjectTermTexts() {
            this.excludeSubjectTermTexts = com.google.common.base.Optional.absent();
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

        public Builder unsetIncludeCollectionIds() {
            this.includeCollectionIds = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeInstitutionIds() {
            this.includeInstitutionIds = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetIncludeSubjectTermTexts() {
            this.includeSubjectTermTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetMoreLikeObjectId() {
            this.moreLikeObjectId = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetQueryString() {
            this.queryString = com.google.common.base.Optional.absent();
            return this;
        }

        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollectionIds;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutionIds;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollectionIds;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutionIds;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId;
        private com.google.common.base.Optional<String> queryString;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        EXCLUDE_AGENT_NAME_TEXTS("excludeAgentNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_agent_name_texts", org.thryft.protocol.Type.SET),
        EXCLUDE_CATEGORIES("excludeCategories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_categories", org.thryft.protocol.Type.SET),
        EXCLUDE_COLLECTION_IDS("excludeCollectionIds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {}, false, 0, "exclude_collection_ids", org.thryft.protocol.Type.SET),
        EXCLUDE_INSTITUTION_IDS("excludeInstitutionIds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {}, false, 0, "exclude_institution_ids", org.thryft.protocol.Type.SET),
        EXCLUDE_SUBJECT_TERM_TEXTS("excludeSubjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "exclude_subject_term_texts", org.thryft.protocol.Type.SET),
        INCLUDE_AGENT_NAME_TEXTS("includeAgentNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_agent_name_texts", org.thryft.protocol.Type.SET),
        INCLUDE_CATEGORIES("includeCategories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_categories", org.thryft.protocol.Type.SET),
        INCLUDE_COLLECTION_IDS("includeCollectionIds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {}, false, 0, "include_collection_ids", org.thryft.protocol.Type.SET),
        INCLUDE_INSTITUTION_IDS("includeInstitutionIds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {}, false, 0, "include_institution_ids", org.thryft.protocol.Type.SET),
        INCLUDE_SUBJECT_TERM_TEXTS("includeSubjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, 0, "include_subject_term_texts", org.thryft.protocol.Type.SET),
        MORE_LIKE_OBJECT_ID("moreLikeObjectId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectId>() {}, false, 0, "more_like_object_id", org.thryft.protocol.Type.STRING),
        QUERY_STRING("queryString", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "query_string", org.thryft.protocol.Type.STRING);

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
            case "excludeCategories": return EXCLUDE_CATEGORIES;
            case "excludeCollectionIds": return EXCLUDE_COLLECTION_IDS;
            case "excludeInstitutionIds": return EXCLUDE_INSTITUTION_IDS;
            case "excludeSubjectTermTexts": return EXCLUDE_SUBJECT_TERM_TEXTS;
            case "includeAgentNameTexts": return INCLUDE_AGENT_NAME_TEXTS;
            case "includeCategories": return INCLUDE_CATEGORIES;
            case "includeCollectionIds": return INCLUDE_COLLECTION_IDS;
            case "includeInstitutionIds": return INCLUDE_INSTITUTION_IDS;
            case "includeSubjectTermTexts": return INCLUDE_SUBJECT_TERM_TEXTS;
            case "moreLikeObjectId": return MORE_LIKE_OBJECT_ID;
            case "queryString": return QUERY_STRING;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "exclude_agent_name_texts": return EXCLUDE_AGENT_NAME_TEXTS;
            case "exclude_categories": return EXCLUDE_CATEGORIES;
            case "exclude_collection_ids": return EXCLUDE_COLLECTION_IDS;
            case "exclude_institution_ids": return EXCLUDE_INSTITUTION_IDS;
            case "exclude_subject_term_texts": return EXCLUDE_SUBJECT_TERM_TEXTS;
            case "include_agent_name_texts": return INCLUDE_AGENT_NAME_TEXTS;
            case "include_categories": return INCLUDE_CATEGORIES;
            case "include_collection_ids": return INCLUDE_COLLECTION_IDS;
            case "include_institution_ids": return INCLUDE_INSTITUTION_IDS;
            case "include_subject_term_texts": return INCLUDE_SUBJECT_TERM_TEXTS;
            case "more_like_object_id": return MORE_LIKE_OBJECT_ID;
            case "query_string": return QUERY_STRING;
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
    public ObjectQuery() {
        excludeAgentNameTexts = com.google.common.base.Optional.absent();
        excludeCategories = com.google.common.base.Optional.absent();
        excludeCollectionIds = com.google.common.base.Optional.absent();
        excludeInstitutionIds = com.google.common.base.Optional.absent();
        excludeSubjectTermTexts = com.google.common.base.Optional.absent();
        includeAgentNameTexts = com.google.common.base.Optional.absent();
        includeCategories = com.google.common.base.Optional.absent();
        includeCollectionIds = com.google.common.base.Optional.absent();
        includeInstitutionIds = com.google.common.base.Optional.absent();
        includeSubjectTermTexts = com.google.common.base.Optional.absent();
        moreLikeObjectId = com.google.common.base.Optional.absent();
        queryString = com.google.common.base.Optional.absent();
    }

    /**
     * Copy constructor
     */
    public ObjectQuery(final ObjectQuery other) {
        this(other.getExcludeAgentNameTexts(), other.getExcludeCategories(), other.getExcludeCollectionIds(), other.getExcludeInstitutionIds(), other.getExcludeSubjectTermTexts(), other.getIncludeAgentNameTexts(), other.getIncludeCategories(), other.getIncludeCollectionIds(), other.getIncludeInstitutionIds(), other.getIncludeSubjectTermTexts(), other.getMoreLikeObjectId(), other.getQueryString());
    }

    /**
     * Total Nullable constructor
     */
    public ObjectQuery(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeAgentNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeCategories, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> excludeCollectionIds, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> excludeInstitutionIds, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeAgentNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeCategories, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionIds, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionIds, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts, final @javax.annotation.Nullable net.lab1318.costume.api.models.object.ObjectId moreLikeObjectId, final @javax.annotation.Nullable String queryString) {
        this.excludeAgentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeAgentNameTexts), "net.lab1318.costume.api.models.object.ObjectQuery: excludeAgentNameTexts is empty");
        this.excludeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeCategories), "net.lab1318.costume.api.models.object.ObjectQuery: excludeCategories is empty");
        this.excludeCollectionIds = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeCollectionIds), "net.lab1318.costume.api.models.object.ObjectQuery: excludeCollectionIds is empty");
        this.excludeInstitutionIds = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeInstitutionIds), "net.lab1318.costume.api.models.object.ObjectQuery: excludeInstitutionIds is empty");
        this.excludeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts), "net.lab1318.costume.api.models.object.ObjectQuery: excludeSubjectTermTexts is empty");
        this.includeAgentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeAgentNameTexts), "net.lab1318.costume.api.models.object.ObjectQuery: includeAgentNameTexts is empty");
        this.includeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeCategories), "net.lab1318.costume.api.models.object.ObjectQuery: includeCategories is empty");
        this.includeCollectionIds = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeCollectionIds), "net.lab1318.costume.api.models.object.ObjectQuery: includeCollectionIds is empty");
        this.includeInstitutionIds = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeInstitutionIds), "net.lab1318.costume.api.models.object.ObjectQuery: includeInstitutionIds is empty");
        this.includeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(includeSubjectTermTexts), "net.lab1318.costume.api.models.object.ObjectQuery: includeSubjectTermTexts is empty");
        this.moreLikeObjectId = com.google.common.base.Optional.fromNullable(moreLikeObjectId);
        this.queryString = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(queryString), "net.lab1318.costume.api.models.object.ObjectQuery: queryString is empty");
    }

    /**
     * Optional constructor
     */
    public ObjectQuery(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollectionIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutionIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollectionIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutionIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts, final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId, final com.google.common.base.Optional<String> queryString) {
        this.excludeAgentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeAgentNameTexts, "net.lab1318.costume.api.models.object.ObjectQuery: missing excludeAgentNameTexts"), "net.lab1318.costume.api.models.object.ObjectQuery: excludeAgentNameTexts is empty");
        this.excludeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeCategories, "net.lab1318.costume.api.models.object.ObjectQuery: missing excludeCategories"), "net.lab1318.costume.api.models.object.ObjectQuery: excludeCategories is empty");
        this.excludeCollectionIds = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeCollectionIds, "net.lab1318.costume.api.models.object.ObjectQuery: missing excludeCollectionIds"), "net.lab1318.costume.api.models.object.ObjectQuery: excludeCollectionIds is empty");
        this.excludeInstitutionIds = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeInstitutionIds, "net.lab1318.costume.api.models.object.ObjectQuery: missing excludeInstitutionIds"), "net.lab1318.costume.api.models.object.ObjectQuery: excludeInstitutionIds is empty");
        this.excludeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(excludeSubjectTermTexts, "net.lab1318.costume.api.models.object.ObjectQuery: missing excludeSubjectTermTexts"), "net.lab1318.costume.api.models.object.ObjectQuery: excludeSubjectTermTexts is empty");
        this.includeAgentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeAgentNameTexts, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeAgentNameTexts"), "net.lab1318.costume.api.models.object.ObjectQuery: includeAgentNameTexts is empty");
        this.includeCategories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeCategories, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeCategories"), "net.lab1318.costume.api.models.object.ObjectQuery: includeCategories is empty");
        this.includeCollectionIds = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeCollectionIds, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeCollectionIds"), "net.lab1318.costume.api.models.object.ObjectQuery: includeCollectionIds is empty");
        this.includeInstitutionIds = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeInstitutionIds, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeInstitutionIds"), "net.lab1318.costume.api.models.object.ObjectQuery: includeInstitutionIds is empty");
        this.includeSubjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(includeSubjectTermTexts, "net.lab1318.costume.api.models.object.ObjectQuery: missing includeSubjectTermTexts"), "net.lab1318.costume.api.models.object.ObjectQuery: includeSubjectTermTexts is empty");
        this.moreLikeObjectId = com.google.common.base.Preconditions.checkNotNull(moreLikeObjectId, "net.lab1318.costume.api.models.object.ObjectQuery: missing moreLikeObjectId");
        this.queryString = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(queryString, "net.lab1318.costume.api.models.object.ObjectQuery: missing queryString"), "net.lab1318.costume.api.models.object.ObjectQuery: queryString is empty");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ObjectQuery other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ObjectQuery> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectQuery)) {
            return false;
        }

        final ObjectQuery other = (ObjectQuery)otherObject;
        return
            getExcludeAgentNameTexts().equals(other.getExcludeAgentNameTexts()) &&
            getExcludeCategories().equals(other.getExcludeCategories()) &&
            getExcludeCollectionIds().equals(other.getExcludeCollectionIds()) &&
            getExcludeInstitutionIds().equals(other.getExcludeInstitutionIds()) &&
            getExcludeSubjectTermTexts().equals(other.getExcludeSubjectTermTexts()) &&
            getIncludeAgentNameTexts().equals(other.getIncludeAgentNameTexts()) &&
            getIncludeCategories().equals(other.getIncludeCategories()) &&
            getIncludeCollectionIds().equals(other.getIncludeCollectionIds()) &&
            getIncludeInstitutionIds().equals(other.getIncludeInstitutionIds()) &&
            getIncludeSubjectTermTexts().equals(other.getIncludeSubjectTermTexts()) &&
            getMoreLikeObjectId().equals(other.getMoreLikeObjectId()) &&
            getQueryString().equals(other.getQueryString());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "exclude_agent_name_texts": return getExcludeAgentNameTexts();
        case "exclude_categories": return getExcludeCategories();
        case "exclude_collection_ids": return getExcludeCollectionIds();
        case "exclude_institution_ids": return getExcludeInstitutionIds();
        case "exclude_subject_term_texts": return getExcludeSubjectTermTexts();
        case "include_agent_name_texts": return getIncludeAgentNameTexts();
        case "include_categories": return getIncludeCategories();
        case "include_collection_ids": return getIncludeCollectionIds();
        case "include_institution_ids": return getIncludeInstitutionIds();
        case "include_subject_term_texts": return getIncludeSubjectTermTexts();
        case "more_like_object_id": return getMoreLikeObjectId();
        case "query_string": return getQueryString();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeAgentNameTexts() {
        return excludeAgentNameTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeCategories() {
        return excludeCategories;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> getExcludeCollectionIds() {
        return excludeCollectionIds;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getExcludeInstitutionIds() {
        return excludeInstitutionIds;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExcludeSubjectTermTexts() {
        return excludeSubjectTermTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeAgentNameTexts() {
        return includeAgentNameTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeCategories() {
        return includeCategories;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> getIncludeCollectionIds() {
        return includeCollectionIds;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> getIncludeInstitutionIds() {
        return includeInstitutionIds;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getIncludeSubjectTermTexts() {
        return includeSubjectTermTexts;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> getMoreLikeObjectId() {
        return moreLikeObjectId;
    }

    public final com.google.common.base.Optional<String> getQueryString() {
        return queryString;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getExcludeAgentNameTexts().isPresent()) {
            hashCode = 31 * hashCode + getExcludeAgentNameTexts().get().hashCode();
        }
        if (getExcludeCategories().isPresent()) {
            hashCode = 31 * hashCode + getExcludeCategories().get().hashCode();
        }
        if (getExcludeCollectionIds().isPresent()) {
            hashCode = 31 * hashCode + getExcludeCollectionIds().get().hashCode();
        }
        if (getExcludeInstitutionIds().isPresent()) {
            hashCode = 31 * hashCode + getExcludeInstitutionIds().get().hashCode();
        }
        if (getExcludeSubjectTermTexts().isPresent()) {
            hashCode = 31 * hashCode + getExcludeSubjectTermTexts().get().hashCode();
        }
        if (getIncludeAgentNameTexts().isPresent()) {
            hashCode = 31 * hashCode + getIncludeAgentNameTexts().get().hashCode();
        }
        if (getIncludeCategories().isPresent()) {
            hashCode = 31 * hashCode + getIncludeCategories().get().hashCode();
        }
        if (getIncludeCollectionIds().isPresent()) {
            hashCode = 31 * hashCode + getIncludeCollectionIds().get().hashCode();
        }
        if (getIncludeInstitutionIds().isPresent()) {
            hashCode = 31 * hashCode + getIncludeInstitutionIds().get().hashCode();
        }
        if (getIncludeSubjectTermTexts().isPresent()) {
            hashCode = 31 * hashCode + getIncludeSubjectTermTexts().get().hashCode();
        }
        if (getMoreLikeObjectId().isPresent()) {
            hashCode = 31 * hashCode + getMoreLikeObjectId().get().hashCode();
        }
        if (getQueryString().isPresent()) {
            hashCode = 31 * hashCode + getQueryString().get().hashCode();
        }
        return hashCode;
    }

    public static ObjectQuery readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectQuery readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollectionIds = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutionIds = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollectionIds = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutionIds = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> queryString = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        if (__list.getSize() > 0) {
            try {
                excludeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        if (__list.getSize() > 1) {
            try {
                excludeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequence.build();
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
                excludeCollectionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequence.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
                            return sequence.build();
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
                excludeInstitutionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
                            return sequence.build();
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
                excludeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequence.build();
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
                includeAgentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequence.build();
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
                includeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequence.build();
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
                includeCollectionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequence.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
                            return sequence.build();
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
                includeInstitutionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                try {
                                    sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                            iprot.readSetEnd();
                            return sequence.build();
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
                includeSubjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequence.build();
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
                moreLikeObjectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
            } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
            }
        }
        if (__list.getSize() > 11) {
            queryString = com.google.common.base.Optional.of(iprot.readString());
        }
        iprot.readListEnd();
        try {
            return new ObjectQuery(excludeAgentNameTexts, excludeCategories, excludeCollectionIds, excludeInstitutionIds, excludeSubjectTermTexts, includeAgentNameTexts, includeCategories, includeCollectionIds, includeInstitutionIds, includeSubjectTermTexts, moreLikeObjectId, queryString);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectQuery readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollectionIds = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutionIds = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollectionIds = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutionIds = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> queryString = com.google.common.base.Optional.absent();

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
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_categories": {
                try {
                    excludeCategories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_collection_ids": {
                try {
                    excludeCollectionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequence.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "exclude_institution_ids": {
                try {
                    excludeInstitutionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_collection_ids": {
                try {
                    includeCollectionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.collection.CollectionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequence.add(net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "include_institution_ids": {
                try {
                    includeInstitutionIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<net.lab1318.costume.api.models.institution.InstitutionId> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequence.add(net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString()));
                                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequence.build();
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
                                final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                }
                break;
            }
            case "more_like_object_id": {
                try {
                    moreLikeObjectId = com.google.common.base.Optional.of(net.lab1318.costume.api.models.object.ObjectId.parse(iprot.readString()));
                } catch (final net.lab1318.costume.api.models.object.InvalidObjectIdException e) {
                }
                break;
            }
            case "query_string": {
                queryString = com.google.common.base.Optional.of(iprot.readString());
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new ObjectQuery(excludeAgentNameTexts, excludeCategories, excludeCollectionIds, excludeInstitutionIds, excludeSubjectTermTexts, includeAgentNameTexts, includeCategories, includeCollectionIds, includeInstitutionIds, includeSubjectTermTexts, moreLikeObjectId, queryString);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectQuery replaceExcludeAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts) {
        return new ObjectQuery(excludeAgentNameTexts, this.excludeCategories, this.excludeCollectionIds, this.excludeInstitutionIds, this.excludeSubjectTermTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollectionIds, this.includeInstitutionIds, this.includeSubjectTermTexts, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceExcludeAgentNameTexts(final com.google.common.collect.ImmutableSet<String> excludeAgentNameTexts) {
        return replaceExcludeAgentNameTexts(com.google.common.base.Optional.fromNullable(excludeAgentNameTexts));
    }

    public ObjectQuery replaceExcludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories) {
        return new ObjectQuery(this.excludeAgentNameTexts, excludeCategories, this.excludeCollectionIds, this.excludeInstitutionIds, this.excludeSubjectTermTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollectionIds, this.includeInstitutionIds, this.includeSubjectTermTexts, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceExcludeCategories(final com.google.common.collect.ImmutableSet<String> excludeCategories) {
        return replaceExcludeCategories(com.google.common.base.Optional.fromNullable(excludeCategories));
    }

    public ObjectQuery replaceExcludeCollectionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollectionIds) {
        return new ObjectQuery(this.excludeAgentNameTexts, this.excludeCategories, excludeCollectionIds, this.excludeInstitutionIds, this.excludeSubjectTermTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollectionIds, this.includeInstitutionIds, this.includeSubjectTermTexts, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceExcludeCollectionIds(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> excludeCollectionIds) {
        return replaceExcludeCollectionIds(com.google.common.base.Optional.fromNullable(excludeCollectionIds));
    }

    public ObjectQuery replaceExcludeInstitutionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutionIds) {
        return new ObjectQuery(this.excludeAgentNameTexts, this.excludeCategories, this.excludeCollectionIds, excludeInstitutionIds, this.excludeSubjectTermTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollectionIds, this.includeInstitutionIds, this.includeSubjectTermTexts, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceExcludeInstitutionIds(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> excludeInstitutionIds) {
        return replaceExcludeInstitutionIds(com.google.common.base.Optional.fromNullable(excludeInstitutionIds));
    }

    public ObjectQuery replaceExcludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts) {
        return new ObjectQuery(this.excludeAgentNameTexts, this.excludeCategories, this.excludeCollectionIds, this.excludeInstitutionIds, excludeSubjectTermTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollectionIds, this.includeInstitutionIds, this.includeSubjectTermTexts, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceExcludeSubjectTermTexts(final com.google.common.collect.ImmutableSet<String> excludeSubjectTermTexts) {
        return replaceExcludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(excludeSubjectTermTexts));
    }

    public ObjectQuery replaceIncludeAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts) {
        return new ObjectQuery(this.excludeAgentNameTexts, this.excludeCategories, this.excludeCollectionIds, this.excludeInstitutionIds, this.excludeSubjectTermTexts, includeAgentNameTexts, this.includeCategories, this.includeCollectionIds, this.includeInstitutionIds, this.includeSubjectTermTexts, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceIncludeAgentNameTexts(final com.google.common.collect.ImmutableSet<String> includeAgentNameTexts) {
        return replaceIncludeAgentNameTexts(com.google.common.base.Optional.fromNullable(includeAgentNameTexts));
    }

    public ObjectQuery replaceIncludeCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories) {
        return new ObjectQuery(this.excludeAgentNameTexts, this.excludeCategories, this.excludeCollectionIds, this.excludeInstitutionIds, this.excludeSubjectTermTexts, this.includeAgentNameTexts, includeCategories, this.includeCollectionIds, this.includeInstitutionIds, this.includeSubjectTermTexts, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceIncludeCategories(final com.google.common.collect.ImmutableSet<String> includeCategories) {
        return replaceIncludeCategories(com.google.common.base.Optional.fromNullable(includeCategories));
    }

    public ObjectQuery replaceIncludeCollectionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollectionIds) {
        return new ObjectQuery(this.excludeAgentNameTexts, this.excludeCategories, this.excludeCollectionIds, this.excludeInstitutionIds, this.excludeSubjectTermTexts, this.includeAgentNameTexts, this.includeCategories, includeCollectionIds, this.includeInstitutionIds, this.includeSubjectTermTexts, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceIncludeCollectionIds(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId> includeCollectionIds) {
        return replaceIncludeCollectionIds(com.google.common.base.Optional.fromNullable(includeCollectionIds));
    }

    public ObjectQuery replaceIncludeInstitutionIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutionIds) {
        return new ObjectQuery(this.excludeAgentNameTexts, this.excludeCategories, this.excludeCollectionIds, this.excludeInstitutionIds, this.excludeSubjectTermTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollectionIds, includeInstitutionIds, this.includeSubjectTermTexts, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceIncludeInstitutionIds(final com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId> includeInstitutionIds) {
        return replaceIncludeInstitutionIds(com.google.common.base.Optional.fromNullable(includeInstitutionIds));
    }

    public ObjectQuery replaceIncludeSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts) {
        return new ObjectQuery(this.excludeAgentNameTexts, this.excludeCategories, this.excludeCollectionIds, this.excludeInstitutionIds, this.excludeSubjectTermTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollectionIds, this.includeInstitutionIds, includeSubjectTermTexts, this.moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceIncludeSubjectTermTexts(final com.google.common.collect.ImmutableSet<String> includeSubjectTermTexts) {
        return replaceIncludeSubjectTermTexts(com.google.common.base.Optional.fromNullable(includeSubjectTermTexts));
    }

    public ObjectQuery replaceMoreLikeObjectId(final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId) {
        return new ObjectQuery(this.excludeAgentNameTexts, this.excludeCategories, this.excludeCollectionIds, this.excludeInstitutionIds, this.excludeSubjectTermTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollectionIds, this.includeInstitutionIds, this.includeSubjectTermTexts, moreLikeObjectId, this.queryString);
    }

    public ObjectQuery replaceMoreLikeObjectId(final net.lab1318.costume.api.models.object.ObjectId moreLikeObjectId) {
        return replaceMoreLikeObjectId(com.google.common.base.Optional.fromNullable(moreLikeObjectId));
    }

    public ObjectQuery replaceQueryString(final com.google.common.base.Optional<String> queryString) {
        return new ObjectQuery(this.excludeAgentNameTexts, this.excludeCategories, this.excludeCollectionIds, this.excludeInstitutionIds, this.excludeSubjectTermTexts, this.includeAgentNameTexts, this.includeCategories, this.includeCollectionIds, this.includeInstitutionIds, this.includeSubjectTermTexts, this.moreLikeObjectId, queryString);
    }

    public ObjectQuery replaceQueryString(final String queryString) {
        return replaceQueryString(com.google.common.base.Optional.fromNullable(queryString));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("exclude_agent_name_texts", getExcludeAgentNameTexts().orNull()).add("exclude_categories", getExcludeCategories().orNull()).add("exclude_collection_ids", getExcludeCollectionIds().orNull()).add("exclude_institution_ids", getExcludeInstitutionIds().orNull()).add("exclude_subject_term_texts", getExcludeSubjectTermTexts().orNull()).add("include_agent_name_texts", getIncludeAgentNameTexts().orNull()).add("include_categories", getIncludeCategories().orNull()).add("include_collection_ids", getIncludeCollectionIds().orNull()).add("include_institution_ids", getIncludeInstitutionIds().orNull()).add("include_subject_term_texts", getIncludeSubjectTermTexts().orNull()).add("more_like_object_id", getMoreLikeObjectId().orNull()).add("query_string", getQueryString().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 12);

        if (getExcludeAgentNameTexts().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeAgentNameTexts().get().size());
            for (final String _iter0 : getExcludeAgentNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
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

        if (getExcludeCollectionIds().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCollectionIds().get().size());
            for (final net.lab1318.costume.api.models.collection.CollectionId _iter0 : getExcludeCollectionIds().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getExcludeInstitutionIds().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeInstitutionIds().get().size());
            for (final net.lab1318.costume.api.models.institution.InstitutionId _iter0 : getExcludeInstitutionIds().get()) {
                oprot.writeString(_iter0.toString());
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

        if (getIncludeCollectionIds().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCollectionIds().get().size());
            for (final net.lab1318.costume.api.models.collection.CollectionId _iter0 : getIncludeCollectionIds().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getIncludeInstitutionIds().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeInstitutionIds().get().size());
            for (final net.lab1318.costume.api.models.institution.InstitutionId _iter0 : getIncludeInstitutionIds().get()) {
                oprot.writeString(_iter0.toString());
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

        if (getMoreLikeObjectId().isPresent()) {
            oprot.writeString(getMoreLikeObjectId().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getQueryString().isPresent()) {
            oprot.writeString(getQueryString().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.object.ObjectQuery");
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

        if (getExcludeCategories().isPresent()) {
            oprot.writeFieldBegin("exclude_categories", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCategories().get().size());
            for (final String _iter0 : getExcludeCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeCollectionIds().isPresent()) {
            oprot.writeFieldBegin("exclude_collection_ids", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeCollectionIds().get().size());
            for (final net.lab1318.costume.api.models.collection.CollectionId _iter0 : getExcludeCollectionIds().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getExcludeInstitutionIds().isPresent()) {
            oprot.writeFieldBegin("exclude_institution_ids", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExcludeInstitutionIds().get().size());
            for (final net.lab1318.costume.api.models.institution.InstitutionId _iter0 : getExcludeInstitutionIds().get()) {
                oprot.writeString(_iter0.toString());
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

        if (getIncludeCollectionIds().isPresent()) {
            oprot.writeFieldBegin("include_collection_ids", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeCollectionIds().get().size());
            for (final net.lab1318.costume.api.models.collection.CollectionId _iter0 : getIncludeCollectionIds().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getIncludeInstitutionIds().isPresent()) {
            oprot.writeFieldBegin("include_institution_ids", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getIncludeInstitutionIds().get().size());
            for (final net.lab1318.costume.api.models.institution.InstitutionId _iter0 : getIncludeInstitutionIds().get()) {
                oprot.writeString(_iter0.toString());
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

        if (getMoreLikeObjectId().isPresent()) {
            oprot.writeFieldBegin("more_like_object_id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getMoreLikeObjectId().get().toString());
            oprot.writeFieldEnd();
        }

        if (getQueryString().isPresent()) {
            oprot.writeFieldBegin("query_string", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getQueryString().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeAgentNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeCategories;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> excludeCollectionIds;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> excludeInstitutionIds;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> excludeSubjectTermTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeAgentNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeCategories;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.collection.CollectionId>> includeCollectionIds;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<net.lab1318.costume.api.models.institution.InstitutionId>> includeInstitutionIds;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> includeSubjectTermTexts;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.object.ObjectId> moreLikeObjectId;

    private final com.google.common.base.Optional<String> queryString;
}
