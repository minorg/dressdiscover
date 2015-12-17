package net.lab1318.costume.api.services.object;

public class ObjectFacets implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            agentNameTexts = null;
            categories = null;
            collectionHits = null;
            genders = null;
            institutionHits = null;
            materialTexts = null;
            subjectTermTexts = null;
            techniqueTexts = null;
            workTypeTexts = null;
        }

        public Builder(final ObjectFacets other) {
            this.agentNameTexts = other.getAgentNameTexts();
            this.categories = other.getCategories();
            this.collectionHits = other.getCollectionHits();
            this.genders = other.getGenders();
            this.institutionHits = other.getInstitutionHits();
            this.materialTexts = other.getMaterialTexts();
            this.subjectTermTexts = other.getSubjectTermTexts();
            this.techniqueTexts = other.getTechniqueTexts();
            this.workTypeTexts = other.getWorkTypeTexts();
        }

        protected ObjectFacets _build(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts) {
            return new ObjectFacets(agentNameTexts, categories, collectionHits, genders, institutionHits, materialTexts, subjectTermTexts, techniqueTexts, workTypeTexts);
        }

        public ObjectFacets build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing agentNameTexts"), com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.services.object.ObjectFacets: missing categories"), com.google.common.base.Preconditions.checkNotNull(collectionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing collectionHits"), com.google.common.base.Preconditions.checkNotNull(genders, "net.lab1318.costume.api.services.object.ObjectFacets: missing genders"), com.google.common.base.Preconditions.checkNotNull(institutionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing institutionHits"), com.google.common.base.Preconditions.checkNotNull(materialTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing materialTexts"), com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing subjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(techniqueTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing techniqueTexts"), com.google.common.base.Preconditions.checkNotNull(workTypeTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing workTypeTexts"));
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

        public final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> getGenders() {
            return genders;
        }

        public final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> getInstitutionHits() {
            return institutionHits;
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getMaterialTexts() {
            return materialTexts;
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getSubjectTermTexts() {
            return subjectTermTexts;
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getTechniqueTexts() {
            return techniqueTexts;
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getWorkTypeTexts() {
            return workTypeTexts;
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
            genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>>() {
                @Override
                public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                        final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                            final net.lab1318.costume.api.models.gender.Gender key;
                            try {
                                key = iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class);
                            } catch (final IllegalArgumentException e) {
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
            materialTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            techniqueTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            workTypeTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
                case "genders": {
                    genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final net.lab1318.costume.api.models.gender.Gender key;
                                    try {
                                        key = iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class);
                                    } catch (final IllegalArgumentException e) {
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
                case "material_texts": {
                    materialTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
                case "technique_texts": {
                    techniqueTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
                case "work_type_texts": {
                    workTypeTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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

        public Builder setGenders(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders) {
            this.genders = com.google.common.base.Preconditions.checkNotNull(genders);
            return this;
        }

        public Builder setIfPresent(final ObjectFacets other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setAgentNameTexts(other.getAgentNameTexts());
            setCategories(other.getCategories());
            setCollectionHits(other.getCollectionHits());
            setGenders(other.getGenders());
            setInstitutionHits(other.getInstitutionHits());
            setMaterialTexts(other.getMaterialTexts());
            setSubjectTermTexts(other.getSubjectTermTexts());
            setTechniqueTexts(other.getTechniqueTexts());
            setWorkTypeTexts(other.getWorkTypeTexts());

            return this;
        }

        public Builder setInstitutionHits(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits) {
            this.institutionHits = com.google.common.base.Preconditions.checkNotNull(institutionHits);
            return this;
        }

        public Builder setMaterialTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts) {
            this.materialTexts = com.google.common.base.Preconditions.checkNotNull(materialTexts);
            return this;
        }

        public Builder setSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts) {
            this.subjectTermTexts = com.google.common.base.Preconditions.checkNotNull(subjectTermTexts);
            return this;
        }

        public Builder setTechniqueTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts) {
            this.techniqueTexts = com.google.common.base.Preconditions.checkNotNull(techniqueTexts);
            return this;
        }

        public Builder setWorkTypeTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts) {
            this.workTypeTexts = com.google.common.base.Preconditions.checkNotNull(workTypeTexts);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "agent_name_texts": setAgentNameTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "categories": setCategories((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "collection_hits": setCollectionHits((com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "genders": setGenders((com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "institution_hits": setInstitutionHits((com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "material_texts": setMaterialTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "subject_term_texts": setSubjectTermTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "technique_texts": setTechniqueTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case "work_type_texts": setWorkTypeTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
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

        public Builder unsetGenders() {
            this.genders = null;
            return this;
        }

        public Builder unsetInstitutionHits() {
            this.institutionHits = null;
            return this;
        }

        public Builder unsetMaterialTexts() {
            this.materialTexts = null;
            return this;
        }

        public Builder unsetSubjectTermTexts() {
            this.subjectTermTexts = null;
            return this;
        }

        public Builder unsetTechniqueTexts() {
            this.techniqueTexts = null;
            return this;
        }

        public Builder unsetWorkTypeTexts() {
            this.workTypeTexts = null;
            return this;
        }

        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories;
        private com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits;
        private com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders;
        private com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        AGENT_NAME_TEXTS("agentNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "agent_name_texts", org.thryft.protocol.Type.MAP),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "categories", org.thryft.protocol.Type.MAP),
        COLLECTION_HITS("collectionHits", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "collection_hits", org.thryft.protocol.Type.MAP),
        GENDERS("genders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "genders", org.thryft.protocol.Type.MAP),
        INSTITUTION_HITS("institutionHits", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "institution_hits", org.thryft.protocol.Type.MAP),
        MATERIAL_TEXTS("materialTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "material_texts", org.thryft.protocol.Type.MAP),
        SUBJECT_TERM_TEXTS("subjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "subject_term_texts", org.thryft.protocol.Type.MAP),
        TECHNIQUE_TEXTS("techniqueTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "technique_texts", org.thryft.protocol.Type.MAP),
        WORK_TYPE_TEXTS("workTypeTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "work_type_texts", org.thryft.protocol.Type.MAP);

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
            case "genders": return GENDERS;
            case "institutionHits": return INSTITUTION_HITS;
            case "materialTexts": return MATERIAL_TEXTS;
            case "subjectTermTexts": return SUBJECT_TERM_TEXTS;
            case "techniqueTexts": return TECHNIQUE_TEXTS;
            case "workTypeTexts": return WORK_TYPE_TEXTS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "agent_name_texts": return AGENT_NAME_TEXTS;
            case "categories": return CATEGORIES;
            case "collection_hits": return COLLECTION_HITS;
            case "genders": return GENDERS;
            case "institution_hits": return INSTITUTION_HITS;
            case "material_texts": return MATERIAL_TEXTS;
            case "subject_term_texts": return SUBJECT_TERM_TEXTS;
            case "technique_texts": return TECHNIQUE_TEXTS;
            case "work_type_texts": return WORK_TYPE_TEXTS;
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
        this(other.getAgentNameTexts(), other.getCategories(), other.getCollectionHits(), other.getGenders(), other.getInstitutionHits(), other.getMaterialTexts(), other.getSubjectTermTexts(), other.getTechniqueTexts(), other.getWorkTypeTexts());
    }

    /**
     * Optional constructor
     */
    public ObjectFacets(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts) {
        this.agentNameTexts = com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing agentNameTexts");
        this.categories = com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.services.object.ObjectFacets: missing categories");
        this.collectionHits = com.google.common.base.Preconditions.checkNotNull(collectionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing collectionHits");
        this.genders = com.google.common.base.Preconditions.checkNotNull(genders, "net.lab1318.costume.api.services.object.ObjectFacets: missing genders");
        this.institutionHits = com.google.common.base.Preconditions.checkNotNull(institutionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing institutionHits");
        this.materialTexts = com.google.common.base.Preconditions.checkNotNull(materialTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing materialTexts");
        this.subjectTermTexts = com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing subjectTermTexts");
        this.techniqueTexts = com.google.common.base.Preconditions.checkNotNull(techniqueTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing techniqueTexts");
        this.workTypeTexts = com.google.common.base.Preconditions.checkNotNull(workTypeTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing workTypeTexts");
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
            getGenders().equals(other.getGenders()) &&
            getInstitutionHits().equals(other.getInstitutionHits()) &&
            getMaterialTexts().equals(other.getMaterialTexts()) &&
            getSubjectTermTexts().equals(other.getSubjectTermTexts()) &&
            getTechniqueTexts().equals(other.getTechniqueTexts()) &&
            getWorkTypeTexts().equals(other.getWorkTypeTexts());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "agent_name_texts": return getAgentNameTexts();
        case "categories": return getCategories();
        case "collection_hits": return getCollectionHits();
        case "genders": return getGenders();
        case "institution_hits": return getInstitutionHits();
        case "material_texts": return getMaterialTexts();
        case "subject_term_texts": return getSubjectTermTexts();
        case "technique_texts": return getTechniqueTexts();
        case "work_type_texts": return getWorkTypeTexts();
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

    public final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> getGenders() {
        return genders;
    }

    public final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> getInstitutionHits() {
        return institutionHits;
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getMaterialTexts() {
        return materialTexts;
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getSubjectTermTexts() {
        return subjectTermTexts;
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getTechniqueTexts() {
        return techniqueTexts;
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getWorkTypeTexts() {
        return workTypeTexts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getAgentNameTexts().hashCode();
        hashCode = 31 * hashCode + getCategories().hashCode();
        hashCode = 31 * hashCode + getCollectionHits().hashCode();
        hashCode = 31 * hashCode + getGenders().hashCode();
        hashCode = 31 * hashCode + getInstitutionHits().hashCode();
        hashCode = 31 * hashCode + getMaterialTexts().hashCode();
        hashCode = 31 * hashCode + getSubjectTermTexts().hashCode();
        hashCode = 31 * hashCode + getTechniqueTexts().hashCode();
        hashCode = 31 * hashCode + getWorkTypeTexts().hashCode();
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
        com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders = null;
        com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts = null;

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
        genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>>() {
            @Override
            public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                    final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                        final net.lab1318.costume.api.models.gender.Gender key;
                        try {
                            key = iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class);
                        } catch (final IllegalArgumentException e) {
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
        materialTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
        techniqueTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
        workTypeTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            return new ObjectFacets(agentNameTexts, categories, collectionHits, genders, institutionHits, materialTexts, subjectTermTexts, techniqueTexts, workTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectFacets readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories = null;
        com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits = null;
        com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders = null;
        com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts = null;

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
            case "genders": {
                genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final net.lab1318.costume.api.models.gender.Gender key;
                                try {
                                    key = iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class);
                                } catch (final IllegalArgumentException e) {
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
            case "material_texts": {
                materialTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            case "technique_texts": {
                techniqueTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            case "work_type_texts": {
                workTypeTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            return new ObjectFacets(agentNameTexts, categories, collectionHits, genders, institutionHits, materialTexts, subjectTermTexts, techniqueTexts, workTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectFacets replaceAgentNameTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts) {
        return new ObjectFacets(agentNameTexts, this.categories, this.collectionHits, this.genders, this.institutionHits, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceCategories(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories) {
        return new ObjectFacets(this.agentNameTexts, categories, this.collectionHits, this.genders, this.institutionHits, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceCollectionHits(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits) {
        return new ObjectFacets(this.agentNameTexts, this.categories, collectionHits, this.genders, this.institutionHits, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceGenders(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, genders, this.institutionHits, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceInstitutionHits(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, this.genders, institutionHits, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceMaterialTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, this.genders, this.institutionHits, materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, this.genders, this.institutionHits, this.materialTexts, subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceTechniqueTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, this.genders, this.institutionHits, this.materialTexts, this.subjectTermTexts, techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceWorkTypeTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, this.genders, this.institutionHits, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, workTypeTexts);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("agent_name_texts", getAgentNameTexts()).add("categories", getCategories()).add("collection_hits", getCollectionHits()).add("genders", getGenders()).add("institution_hits", getInstitutionHits()).add("material_texts", getMaterialTexts()).add("subject_term_texts", getSubjectTermTexts()).add("technique_texts", getTechniqueTexts()).add("work_type_texts", getWorkTypeTexts()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 9);

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

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getGenders().size());
        for (com.google.common.collect.ImmutableMap.Entry<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> _iter0 : getGenders().entrySet()) {
            oprot.writeEnum(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getInstitutionHits().size());
        for (com.google.common.collect.ImmutableMap.Entry<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> _iter0 : getInstitutionHits().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getMaterialTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getMaterialTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getSubjectTermTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getSubjectTermTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getTechniqueTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getTechniqueTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getWorkTypeTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getWorkTypeTexts().entrySet()) {
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

        oprot.writeFieldBegin("genders", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getGenders().size());
        for (com.google.common.collect.ImmutableMap.Entry<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> _iter0 : getGenders().entrySet()) {
            oprot.writeEnum(_iter0.getKey());
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

        oprot.writeFieldBegin("material_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getMaterialTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getMaterialTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
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

        oprot.writeFieldBegin("technique_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getTechniqueTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getTechniqueTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("work_type_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getWorkTypeTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getWorkTypeTexts().entrySet()) {
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

    private final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders;

    private final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts;
}
