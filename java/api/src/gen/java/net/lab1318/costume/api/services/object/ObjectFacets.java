package net.lab1318.costume.api.services.object;

public class ObjectFacets implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            agentNameTexts = null;
            categories = null;
            collectionHits = null;
            institutionHits = null;
            subjectTermTexts = null;
        }

        public Builder(final ObjectFacets other) {
            this.agentNameTexts = other.getAgentNameTexts();
            this.categories = other.getCategories();
            this.collectionHits = other.getCollectionHits();
            this.institutionHits = other.getInstitutionHits();
            this.subjectTermTexts = other.getSubjectTermTexts();
        }

        protected ObjectFacets _build(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts) {
            return new ObjectFacets(agentNameTexts, categories, collectionHits, institutionHits, subjectTermTexts);
        }

        public ObjectFacets build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing agentNameTexts"), com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.services.object.ObjectFacets: missing categories"), com.google.common.base.Preconditions.checkNotNull(collectionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing collectionHits"), com.google.common.base.Preconditions.checkNotNull(institutionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing institutionHits"), com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing subjectTermTexts"));
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getAgentNameTexts() {
            return agentNameTexts;
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getCategories() {
            return categories;
        }

        public final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> getCollectionHits() {
            return collectionHits;
        }

        public final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> getInstitutionHits() {
            return institutionHits;
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getSubjectTermTexts() {
            return subjectTermTexts;
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
            iprot.readListBegin();
            agentNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
                @Override
                public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                        final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                            final String key;
                            key = iprot.readString();
                            final com.google.common.primitives.UnsignedInteger value;
                            try {
                                value = iprot.readU32();
                            } catch (final NumberFormatException e) {
                                 throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                            map.put(key, value);
                        }
                        iprot.readMapEnd();
                        return map.build();
                    } catch (final org.thryft.protocol.InputProtocolException e) {
                        return com.google.common.collect.ImmutableMap.of();
                    }
                }
            }).apply(iprot);
            categories = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
                @Override
                public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                        final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                            final String key;
                            key = iprot.readString();
                            final com.google.common.primitives.UnsignedInteger value;
                            try {
                                value = iprot.readU32();
                            } catch (final NumberFormatException e) {
                                 throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                            map.put(key, value);
                        }
                        iprot.readMapEnd();
                        return map.build();
                    } catch (final org.thryft.protocol.InputProtocolException e) {
                        return com.google.common.collect.ImmutableMap.of();
                    }
                }
            }).apply(iprot);
            collectionHits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {
                @Override
                public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                        final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                            final net.lab1318.costume.api.models.collection.CollectionId key;
                            try {
                                key = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                 throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                            final com.google.common.primitives.UnsignedInteger value;
                            try {
                                value = iprot.readU32();
                            } catch (final NumberFormatException e) {
                                 throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                            map.put(key, value);
                        }
                        iprot.readMapEnd();
                        return map.build();
                    } catch (final org.thryft.protocol.InputProtocolException e) {
                        return com.google.common.collect.ImmutableMap.of();
                    }
                }
            }).apply(iprot);
            institutionHits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {
                @Override
                public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                        final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                            final net.lab1318.costume.api.models.institution.InstitutionId key;
                            try {
                                key = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                 throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                            final com.google.common.primitives.UnsignedInteger value;
                            try {
                                value = iprot.readU32();
                            } catch (final NumberFormatException e) {
                                 throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                            map.put(key, value);
                        }
                        iprot.readMapEnd();
                        return map.build();
                    } catch (final org.thryft.protocol.InputProtocolException e) {
                        return com.google.common.collect.ImmutableMap.of();
                    }
                }
            }).apply(iprot);
            subjectTermTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
                @Override
                public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                        final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                            final String key;
                            key = iprot.readString();
                            final com.google.common.primitives.UnsignedInteger value;
                            try {
                                value = iprot.readU32();
                            } catch (final NumberFormatException e) {
                                 throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                            map.put(key, value);
                        }
                        iprot.readMapEnd();
                        return map.build();
                    } catch (final org.thryft.protocol.InputProtocolException e) {
                        return com.google.common.collect.ImmutableMap.of();
                    }
                }
            }).apply(iprot);
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
                case "agent_name_texts": {
                    agentNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final com.google.common.primitives.UnsignedInteger value;
                                    try {
                                        value = iprot.readU32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                return com.google.common.collect.ImmutableMap.of();
                            }
                        }
                    }).apply(iprot);
                    break;
                }
                case "categories": {
                    categories = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final com.google.common.primitives.UnsignedInteger value;
                                    try {
                                        value = iprot.readU32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                return com.google.common.collect.ImmutableMap.of();
                            }
                        }
                    }).apply(iprot);
                    break;
                }
                case "collection_hits": {
                    collectionHits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final net.lab1318.costume.api.models.collection.CollectionId key;
                                    try {
                                        key = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                    final com.google.common.primitives.UnsignedInteger value;
                                    try {
                                        value = iprot.readU32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                return com.google.common.collect.ImmutableMap.of();
                            }
                        }
                    }).apply(iprot);
                    break;
                }
                case "institution_hits": {
                    institutionHits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final net.lab1318.costume.api.models.institution.InstitutionId key;
                                    try {
                                        key = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                    final com.google.common.primitives.UnsignedInteger value;
                                    try {
                                        value = iprot.readU32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                return com.google.common.collect.ImmutableMap.of();
                            }
                        }
                    }).apply(iprot);
                    break;
                }
                case "subject_term_texts": {
                    subjectTermTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final com.google.common.primitives.UnsignedInteger value;
                                    try {
                                        value = iprot.readU32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                return com.google.common.collect.ImmutableMap.of();
                            }
                        }
                    }).apply(iprot);
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setAgentNameTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts) {
            this.agentNameTexts = com.google.common.base.Preconditions.checkNotNull(agentNameTexts);
            return this;
        }

        public Builder setCategories(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories) {
            this.categories = com.google.common.base.Preconditions.checkNotNull(categories);
            return this;
        }

        public Builder setCollectionHits(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits) {
            this.collectionHits = com.google.common.base.Preconditions.checkNotNull(collectionHits);
            return this;
        }

        public Builder setIfPresent(final ObjectFacets other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setAgentNameTexts(other.getAgentNameTexts());
            setCategories(other.getCategories());
            setCollectionHits(other.getCollectionHits());
            setInstitutionHits(other.getInstitutionHits());
            setSubjectTermTexts(other.getSubjectTermTexts());

            return this;
        }

        public Builder setInstitutionHits(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits) {
            this.institutionHits = com.google.common.base.Preconditions.checkNotNull(institutionHits);
            return this;
        }

        public Builder setSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts) {
            this.subjectTermTexts = com.google.common.base.Preconditions.checkNotNull(subjectTermTexts);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "agent_name_texts": setAgentNameTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "categories": setCategories((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "collection_hits": setCollectionHits((com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "institution_hits": setInstitutionHits((com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "subject_term_texts": setSubjectTermTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetAgentNameTexts() {
            this.agentNameTexts = null;
            return this;
        }

        public Builder unsetCategories() {
            this.categories = null;
            return this;
        }

        public Builder unsetCollectionHits() {
            this.collectionHits = null;
            return this;
        }

        public Builder unsetInstitutionHits() {
            this.institutionHits = null;
            return this;
        }

        public Builder unsetSubjectTermTexts() {
            this.subjectTermTexts = null;
            return this;
        }

        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories;
        private com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits;
        private com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        AGENT_NAME_TEXTS("agentNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "agent_name_texts", org.thryft.protocol.Type.MAP),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "categories", org.thryft.protocol.Type.MAP),
        COLLECTION_HITS("collectionHits", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "collection_hits", org.thryft.protocol.Type.MAP),
        INSTITUTION_HITS("institutionHits", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "institution_hits", org.thryft.protocol.Type.MAP),
        SUBJECT_TERM_TEXTS("subjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "subject_term_texts", org.thryft.protocol.Type.MAP);

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
            case "agentNameTexts": return AGENT_NAME_TEXTS;
            case "categories": return CATEGORIES;
            case "collectionHits": return COLLECTION_HITS;
            case "institutionHits": return INSTITUTION_HITS;
            case "subjectTermTexts": return SUBJECT_TERM_TEXTS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "agent_name_texts": return AGENT_NAME_TEXTS;
            case "categories": return CATEGORIES;
            case "collection_hits": return COLLECTION_HITS;
            case "institution_hits": return INSTITUTION_HITS;
            case "subject_term_texts": return SUBJECT_TERM_TEXTS;
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
     * Copy constructor
     */
    public ObjectFacets(final ObjectFacets other) {
        this(other.getAgentNameTexts(), other.getCategories(), other.getCollectionHits(), other.getInstitutionHits(), other.getSubjectTermTexts());
    }

    /**
     * Optional constructor
     */
    public ObjectFacets(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts) {
        this.agentNameTexts = com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing agentNameTexts");
        this.categories = com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.services.object.ObjectFacets: missing categories");
        this.collectionHits = com.google.common.base.Preconditions.checkNotNull(collectionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing collectionHits");
        this.institutionHits = com.google.common.base.Preconditions.checkNotNull(institutionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing institutionHits");
        this.subjectTermTexts = com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing subjectTermTexts");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ObjectFacets other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ObjectFacets> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectFacets)) {
            return false;
        }

        final ObjectFacets other = (ObjectFacets)otherObject;
        return
            getAgentNameTexts().equals(other.getAgentNameTexts()) &&
            getCategories().equals(other.getCategories()) &&
            getCollectionHits().equals(other.getCollectionHits()) &&
            getInstitutionHits().equals(other.getInstitutionHits()) &&
            getSubjectTermTexts().equals(other.getSubjectTermTexts());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "agent_name_texts": return getAgentNameTexts();
        case "categories": return getCategories();
        case "collection_hits": return getCollectionHits();
        case "institution_hits": return getInstitutionHits();
        case "subject_term_texts": return getSubjectTermTexts();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getAgentNameTexts() {
        return agentNameTexts;
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getCategories() {
        return categories;
    }

    public final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> getCollectionHits() {
        return collectionHits;
    }

    public final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> getInstitutionHits() {
        return institutionHits;
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getSubjectTermTexts() {
        return subjectTermTexts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getAgentNameTexts().hashCode();
        hashCode = 31 * hashCode + getCategories().hashCode();
        hashCode = 31 * hashCode + getCollectionHits().hashCode();
        hashCode = 31 * hashCode + getInstitutionHits().hashCode();
        hashCode = 31 * hashCode + getSubjectTermTexts().hashCode();
        return hashCode;
    }

    public static ObjectFacets readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectFacets readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories = null;
        com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits = null;
        com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts = null;

        iprot.readListBegin();
        agentNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
            @Override
            public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                    final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                        final String key;
                        key = iprot.readString();
                        final com.google.common.primitives.UnsignedInteger value;
                        try {
                            value = iprot.readU32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                        map.put(key, value);
                    }
                    iprot.readMapEnd();
                    return map.build();
                } catch (final org.thryft.protocol.InputProtocolException e) {
                    return com.google.common.collect.ImmutableMap.of();
                }
            }
        }).apply(iprot);
        categories = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
            @Override
            public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                    final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                        final String key;
                        key = iprot.readString();
                        final com.google.common.primitives.UnsignedInteger value;
                        try {
                            value = iprot.readU32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                        map.put(key, value);
                    }
                    iprot.readMapEnd();
                    return map.build();
                } catch (final org.thryft.protocol.InputProtocolException e) {
                    return com.google.common.collect.ImmutableMap.of();
                }
            }
        }).apply(iprot);
        collectionHits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {
            @Override
            public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                    final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                        final net.lab1318.costume.api.models.collection.CollectionId key;
                        try {
                            key = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                        final com.google.common.primitives.UnsignedInteger value;
                        try {
                            value = iprot.readU32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                        map.put(key, value);
                    }
                    iprot.readMapEnd();
                    return map.build();
                } catch (final org.thryft.protocol.InputProtocolException e) {
                    return com.google.common.collect.ImmutableMap.of();
                }
            }
        }).apply(iprot);
        institutionHits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {
            @Override
            public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                    final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                        final net.lab1318.costume.api.models.institution.InstitutionId key;
                        try {
                            key = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                        final com.google.common.primitives.UnsignedInteger value;
                        try {
                            value = iprot.readU32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                        map.put(key, value);
                    }
                    iprot.readMapEnd();
                    return map.build();
                } catch (final org.thryft.protocol.InputProtocolException e) {
                    return com.google.common.collect.ImmutableMap.of();
                }
            }
        }).apply(iprot);
        subjectTermTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
            @Override
            public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                    final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                        final String key;
                        key = iprot.readString();
                        final com.google.common.primitives.UnsignedInteger value;
                        try {
                            value = iprot.readU32();
                        } catch (final NumberFormatException e) {
                             throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                        map.put(key, value);
                    }
                    iprot.readMapEnd();
                    return map.build();
                } catch (final org.thryft.protocol.InputProtocolException e) {
                    return com.google.common.collect.ImmutableMap.of();
                }
            }
        }).apply(iprot);
        iprot.readListEnd();
        try {
            return new ObjectFacets(agentNameTexts, categories, collectionHits, institutionHits, subjectTermTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectFacets readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories = null;
        com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits = null;
        com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "agent_name_texts": {
                agentNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final com.google.common.primitives.UnsignedInteger value;
                                try {
                                    value = iprot.readU32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            return com.google.common.collect.ImmutableMap.of();
                        }
                    }
                }).apply(iprot);
                break;
            }
            case "categories": {
                categories = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final com.google.common.primitives.UnsignedInteger value;
                                try {
                                    value = iprot.readU32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            return com.google.common.collect.ImmutableMap.of();
                        }
                    }
                }).apply(iprot);
                break;
            }
            case "collection_hits": {
                collectionHits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final net.lab1318.costume.api.models.collection.CollectionId key;
                                try {
                                    key = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                                } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                                final com.google.common.primitives.UnsignedInteger value;
                                try {
                                    value = iprot.readU32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            return com.google.common.collect.ImmutableMap.of();
                        }
                    }
                }).apply(iprot);
                break;
            }
            case "institution_hits": {
                institutionHits = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final net.lab1318.costume.api.models.institution.InstitutionId key;
                                try {
                                    key = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                                } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                                final com.google.common.primitives.UnsignedInteger value;
                                try {
                                    value = iprot.readU32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            return com.google.common.collect.ImmutableMap.of();
                        }
                    }
                }).apply(iprot);
                break;
            }
            case "subject_term_texts": {
                subjectTermTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final com.google.common.primitives.UnsignedInteger value;
                                try {
                                    value = iprot.readU32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            return com.google.common.collect.ImmutableMap.of();
                        }
                    }
                }).apply(iprot);
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new ObjectFacets(agentNameTexts, categories, collectionHits, institutionHits, subjectTermTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectFacets replaceAgentNameTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts) {
        return new ObjectFacets(agentNameTexts, this.categories, this.collectionHits, this.institutionHits, this.subjectTermTexts);
    }

    public ObjectFacets replaceCategories(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories) {
        return new ObjectFacets(this.agentNameTexts, categories, this.collectionHits, this.institutionHits, this.subjectTermTexts);
    }

    public ObjectFacets replaceCollectionHits(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits) {
        return new ObjectFacets(this.agentNameTexts, this.categories, collectionHits, this.institutionHits, this.subjectTermTexts);
    }

    public ObjectFacets replaceInstitutionHits(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, institutionHits, this.subjectTermTexts);
    }

    public ObjectFacets replaceSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, this.institutionHits, subjectTermTexts);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("agent_name_texts", getAgentNameTexts()).add("categories", getCategories()).add("collection_hits", getCollectionHits()).add("institution_hits", getInstitutionHits()).add("subject_term_texts", getSubjectTermTexts()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getAgentNameTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getAgentNameTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCategories().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getCategories().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCollectionHits().size());
        for (com.google.common.collect.ImmutableMap.Entry<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> _iter0 : getCollectionHits().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getInstitutionHits().size());
        for (com.google.common.collect.ImmutableMap.Entry<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> _iter0 : getInstitutionHits().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getSubjectTermTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getSubjectTermTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.services.object.ObjectFacets");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("agent_name_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getAgentNameTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getAgentNameTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("categories", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCategories().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getCategories().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("collection_hits", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCollectionHits().size());
        for (com.google.common.collect.ImmutableMap.Entry<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> _iter0 : getCollectionHits().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("institution_hits", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getInstitutionHits().size());
        for (com.google.common.collect.ImmutableMap.Entry<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> _iter0 : getInstitutionHits().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("subject_term_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getSubjectTermTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getSubjectTermTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories;

    private final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits;

    private final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts;
}
