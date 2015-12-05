package net.lab1318.costume.api.services.object;

public class ObjectFacets implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            agentNameTexts = null;
            categories = null;
            collectionHits = null;
            institutionHits = null;
            subjectTermTexts = null;
            thumbnailExists = false;
            thumbnailHeightMaxPx = com.google.common.base.Optional.absent();
            thumbnailWidthMaxPx = com.google.common.base.Optional.absent();
        }

        public Builder(final ObjectFacets other) {
            this.agentNameTexts = other.getAgentNameTexts();
            this.categories = other.getCategories();
            this.collectionHits = other.getCollectionHits();
            this.institutionHits = other.getInstitutionHits();
            this.subjectTermTexts = other.getSubjectTermTexts();
            this.thumbnailExists = other.getThumbnailExists();
            this.thumbnailHeightMaxPx = other.getThumbnailHeightMaxPx();
            this.thumbnailWidthMaxPx = other.getThumbnailWidthMaxPx();
        }

        protected ObjectFacets _build(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts, final boolean thumbnailExists, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailHeightMaxPx, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailWidthMaxPx) {
            return new ObjectFacets(agentNameTexts, categories, collectionHits, institutionHits, subjectTermTexts, thumbnailExists, thumbnailHeightMaxPx, thumbnailWidthMaxPx);
        }

        public ObjectFacets build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing agentNameTexts"), com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.services.object.ObjectFacets: missing categories"), com.google.common.base.Preconditions.checkNotNull(collectionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing collectionHits"), com.google.common.base.Preconditions.checkNotNull(institutionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing institutionHits"), com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing subjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(thumbnailExists, "net.lab1318.costume.api.services.object.ObjectFacets: missing thumbnailExists"), com.google.common.base.Preconditions.checkNotNull(thumbnailHeightMaxPx, "net.lab1318.costume.api.services.object.ObjectFacets: missing thumbnailHeightMaxPx"), com.google.common.base.Preconditions.checkNotNull(thumbnailWidthMaxPx, "net.lab1318.costume.api.services.object.ObjectFacets: missing thumbnailWidthMaxPx"));
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

        public final boolean getThumbnailExists() {
            return thumbnailExists;
        }

        public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getThumbnailHeightMaxPx() {
            return thumbnailHeightMaxPx;
        }

        public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getThumbnailWidthMaxPx() {
            return thumbnailWidthMaxPx;
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
            thumbnailExists = iprot.readBool();
            if (__list.getSize() > 6) {
                try {
                    thumbnailHeightMaxPx = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 7) {
                try {
                    thumbnailWidthMaxPx = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
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
                case "thumbnail_exists": {
                    thumbnailExists = iprot.readBool();
                    break;
                }
                case "thumbnail_height_max_px": {
                    try {
                        thumbnailHeightMaxPx = com.google.common.base.Optional.of(iprot.readU32());
                    } catch (final NumberFormatException e) {
                    }
                    break;
                }
                case "thumbnail_width_max_px": {
                    try {
                        thumbnailWidthMaxPx = com.google.common.base.Optional.of(iprot.readU32());
                    } catch (final NumberFormatException e) {
                    }
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
            setThumbnailExists(other.getThumbnailExists());
            if (other.getThumbnailHeightMaxPx().isPresent()) {
                setThumbnailHeightMaxPx(other.getThumbnailHeightMaxPx());
            }
            if (other.getThumbnailWidthMaxPx().isPresent()) {
                setThumbnailWidthMaxPx(other.getThumbnailWidthMaxPx());
            }

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

        public Builder setThumbnailExists(final boolean thumbnailExists) {
            this.thumbnailExists = com.google.common.base.Preconditions.checkNotNull(thumbnailExists);
            return this;
        }

        public Builder setThumbnailHeightMaxPx(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailHeightMaxPx) {
            this.thumbnailHeightMaxPx = com.google.common.base.Preconditions.checkNotNull(thumbnailHeightMaxPx);
            return this;
        }

        public Builder setThumbnailHeightMaxPx(@javax.annotation.Nullable final com.google.common.primitives.UnsignedInteger thumbnailHeightMaxPx) {
            this.thumbnailHeightMaxPx = com.google.common.base.Optional.fromNullable(thumbnailHeightMaxPx);
            return this;
        }

        public Builder setThumbnailWidthMaxPx(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailWidthMaxPx) {
            this.thumbnailWidthMaxPx = com.google.common.base.Preconditions.checkNotNull(thumbnailWidthMaxPx);
            return this;
        }

        public Builder setThumbnailWidthMaxPx(@javax.annotation.Nullable final com.google.common.primitives.UnsignedInteger thumbnailWidthMaxPx) {
            this.thumbnailWidthMaxPx = com.google.common.base.Optional.fromNullable(thumbnailWidthMaxPx);
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
            case "thumbnail_exists": setThumbnailExists((boolean)value); return this;
            case "thumbnail_height_max_px": setThumbnailHeightMaxPx((com.google.common.primitives.UnsignedInteger)value); return this;
            case "thumbnail_width_max_px": setThumbnailWidthMaxPx((com.google.common.primitives.UnsignedInteger)value); return this;
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

        public Builder unsetThumbnailExists() {
            this.thumbnailExists = false;
            return this;
        }

        public Builder unsetThumbnailHeightMaxPx() {
            this.thumbnailHeightMaxPx = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetThumbnailWidthMaxPx() {
            this.thumbnailWidthMaxPx = com.google.common.base.Optional.absent();
            return this;
        }

        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories;
        private com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits;
        private com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts;
        private Boolean thumbnailExists;
        private com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailHeightMaxPx;
        private com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailWidthMaxPx;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        AGENT_NAME_TEXTS("agentNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "agent_name_texts", org.thryft.protocol.Type.MAP),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "categories", org.thryft.protocol.Type.MAP),
        COLLECTION_HITS("collectionHits", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "collection_hits", org.thryft.protocol.Type.MAP),
        INSTITUTION_HITS("institutionHits", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "institution_hits", org.thryft.protocol.Type.MAP),
        SUBJECT_TERM_TEXTS("subjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "subject_term_texts", org.thryft.protocol.Type.MAP),
        THUMBNAIL_EXISTS("thumbnailExists", new com.google.common.reflect.TypeToken<Boolean>() {}, true, 0, "thumbnail_exists", org.thryft.protocol.Type.BOOL),
        THUMBNAIL_HEIGHT_MAX_PX("thumbnailHeightMaxPx", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 0, "thumbnail_height_max_px", org.thryft.protocol.Type.I32),
        THUMBNAIL_WIDTH_MAX_PX("thumbnailWidthMaxPx", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, false, 0, "thumbnail_width_max_px", org.thryft.protocol.Type.I32);

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
            case "thumbnailExists": return THUMBNAIL_EXISTS;
            case "thumbnailHeightMaxPx": return THUMBNAIL_HEIGHT_MAX_PX;
            case "thumbnailWidthMaxPx": return THUMBNAIL_WIDTH_MAX_PX;
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
            case "thumbnail_exists": return THUMBNAIL_EXISTS;
            case "thumbnail_height_max_px": return THUMBNAIL_HEIGHT_MAX_PX;
            case "thumbnail_width_max_px": return THUMBNAIL_WIDTH_MAX_PX;
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
        this(other.getAgentNameTexts(), other.getCategories(), other.getCollectionHits(), other.getInstitutionHits(), other.getSubjectTermTexts(), other.getThumbnailExists(), other.getThumbnailHeightMaxPx(), other.getThumbnailWidthMaxPx());
    }

    /**
     * Required constructor
     */
    public ObjectFacets(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts, final boolean thumbnailExists) {
        this.agentNameTexts = com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing agentNameTexts");
        this.categories = com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.services.object.ObjectFacets: missing categories");
        this.collectionHits = com.google.common.base.Preconditions.checkNotNull(collectionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing collectionHits");
        this.institutionHits = com.google.common.base.Preconditions.checkNotNull(institutionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing institutionHits");
        this.subjectTermTexts = com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing subjectTermTexts");
        this.thumbnailExists = thumbnailExists;
        this.thumbnailHeightMaxPx = com.google.common.base.Optional.absent();
        this.thumbnailWidthMaxPx = com.google.common.base.Optional.absent();
    }

    /**
     * Total boxed constructor
     */
    public ObjectFacets(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts, final Boolean thumbnailExists, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailHeightMaxPx, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailWidthMaxPx) {
        this.agentNameTexts = com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing agentNameTexts");
        this.categories = com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.services.object.ObjectFacets: missing categories");
        this.collectionHits = com.google.common.base.Preconditions.checkNotNull(collectionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing collectionHits");
        this.institutionHits = com.google.common.base.Preconditions.checkNotNull(institutionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing institutionHits");
        this.subjectTermTexts = com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing subjectTermTexts");
        this.thumbnailExists = com.google.common.base.Preconditions.checkNotNull(thumbnailExists, "net.lab1318.costume.api.services.object.ObjectFacets: missing thumbnailExists");
        this.thumbnailHeightMaxPx = com.google.common.base.Preconditions.checkNotNull(thumbnailHeightMaxPx, "net.lab1318.costume.api.services.object.ObjectFacets: missing thumbnailHeightMaxPx");
        this.thumbnailWidthMaxPx = com.google.common.base.Preconditions.checkNotNull(thumbnailWidthMaxPx, "net.lab1318.costume.api.services.object.ObjectFacets: missing thumbnailWidthMaxPx");
    }

    /**
     * Total Nullable constructor
     */
    public ObjectFacets(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts, final boolean thumbnailExists, final @javax.annotation.Nullable com.google.common.primitives.UnsignedInteger thumbnailHeightMaxPx, final @javax.annotation.Nullable com.google.common.primitives.UnsignedInteger thumbnailWidthMaxPx) {
        this.agentNameTexts = com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing agentNameTexts");
        this.categories = com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.services.object.ObjectFacets: missing categories");
        this.collectionHits = com.google.common.base.Preconditions.checkNotNull(collectionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing collectionHits");
        this.institutionHits = com.google.common.base.Preconditions.checkNotNull(institutionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing institutionHits");
        this.subjectTermTexts = com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing subjectTermTexts");
        this.thumbnailExists = thumbnailExists;
        this.thumbnailHeightMaxPx = com.google.common.base.Optional.fromNullable(thumbnailHeightMaxPx);
        this.thumbnailWidthMaxPx = com.google.common.base.Optional.fromNullable(thumbnailWidthMaxPx);
    }

    /**
     * Optional constructor
     */
    public ObjectFacets(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits, final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts, final boolean thumbnailExists, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailHeightMaxPx, final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailWidthMaxPx) {
        this.agentNameTexts = com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing agentNameTexts");
        this.categories = com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.services.object.ObjectFacets: missing categories");
        this.collectionHits = com.google.common.base.Preconditions.checkNotNull(collectionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing collectionHits");
        this.institutionHits = com.google.common.base.Preconditions.checkNotNull(institutionHits, "net.lab1318.costume.api.services.object.ObjectFacets: missing institutionHits");
        this.subjectTermTexts = com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.services.object.ObjectFacets: missing subjectTermTexts");
        this.thumbnailExists = thumbnailExists;
        this.thumbnailHeightMaxPx = com.google.common.base.Preconditions.checkNotNull(thumbnailHeightMaxPx, "net.lab1318.costume.api.services.object.ObjectFacets: missing thumbnailHeightMaxPx");
        this.thumbnailWidthMaxPx = com.google.common.base.Preconditions.checkNotNull(thumbnailWidthMaxPx, "net.lab1318.costume.api.services.object.ObjectFacets: missing thumbnailWidthMaxPx");
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
            getSubjectTermTexts().equals(other.getSubjectTermTexts()) &&
            getThumbnailExists() == other.getThumbnailExists() &&
            getThumbnailHeightMaxPx().equals(other.getThumbnailHeightMaxPx()) &&
            getThumbnailWidthMaxPx().equals(other.getThumbnailWidthMaxPx());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "agent_name_texts": return getAgentNameTexts();
        case "categories": return getCategories();
        case "collection_hits": return getCollectionHits();
        case "institution_hits": return getInstitutionHits();
        case "subject_term_texts": return getSubjectTermTexts();
        case "thumbnail_exists": return getThumbnailExists();
        case "thumbnail_height_max_px": return getThumbnailHeightMaxPx();
        case "thumbnail_width_max_px": return getThumbnailWidthMaxPx();
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

    public final boolean getThumbnailExists() {
        return thumbnailExists;
    }

    public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getThumbnailHeightMaxPx() {
        return thumbnailHeightMaxPx;
    }

    public final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> getThumbnailWidthMaxPx() {
        return thumbnailWidthMaxPx;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getAgentNameTexts().hashCode();
        hashCode = 31 * hashCode + getCategories().hashCode();
        hashCode = 31 * hashCode + getCollectionHits().hashCode();
        hashCode = 31 * hashCode + getInstitutionHits().hashCode();
        hashCode = 31 * hashCode + getSubjectTermTexts().hashCode();
        hashCode = 31 * hashCode + (getThumbnailExists() ? 1 : 0);
        if (getThumbnailHeightMaxPx().isPresent()) {
            hashCode = 31 * hashCode + getThumbnailHeightMaxPx().get().hashCode();
        }
        if (getThumbnailWidthMaxPx().isPresent()) {
            hashCode = 31 * hashCode + getThumbnailWidthMaxPx().get().hashCode();
        }
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
        boolean thumbnailExists = false;
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailHeightMaxPx = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailWidthMaxPx = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
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
        thumbnailExists = iprot.readBool();
        if (__list.getSize() > 6) {
            try {
                thumbnailHeightMaxPx = com.google.common.base.Optional.of(iprot.readU32());
            } catch (final NumberFormatException e) {
            }
        }
        if (__list.getSize() > 7) {
            try {
                thumbnailWidthMaxPx = com.google.common.base.Optional.of(iprot.readU32());
            } catch (final NumberFormatException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new ObjectFacets(agentNameTexts, categories, collectionHits, institutionHits, subjectTermTexts, thumbnailExists, thumbnailHeightMaxPx, thumbnailWidthMaxPx);
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
        boolean thumbnailExists = false;
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailHeightMaxPx = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailWidthMaxPx = com.google.common.base.Optional.absent();

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
            case "thumbnail_exists": {
                thumbnailExists = iprot.readBool();
                break;
            }
            case "thumbnail_height_max_px": {
                try {
                    thumbnailHeightMaxPx = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
                break;
            }
            case "thumbnail_width_max_px": {
                try {
                    thumbnailWidthMaxPx = com.google.common.base.Optional.of(iprot.readU32());
                } catch (final NumberFormatException e) {
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new ObjectFacets(agentNameTexts, categories, collectionHits, institutionHits, subjectTermTexts, thumbnailExists, thumbnailHeightMaxPx, thumbnailWidthMaxPx);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectFacets replaceAgentNameTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts) {
        return new ObjectFacets(agentNameTexts, this.categories, this.collectionHits, this.institutionHits, this.subjectTermTexts, this.thumbnailExists, this.thumbnailHeightMaxPx, this.thumbnailWidthMaxPx);
    }

    public ObjectFacets replaceCategories(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories) {
        return new ObjectFacets(this.agentNameTexts, categories, this.collectionHits, this.institutionHits, this.subjectTermTexts, this.thumbnailExists, this.thumbnailHeightMaxPx, this.thumbnailWidthMaxPx);
    }

    public ObjectFacets replaceCollectionHits(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits) {
        return new ObjectFacets(this.agentNameTexts, this.categories, collectionHits, this.institutionHits, this.subjectTermTexts, this.thumbnailExists, this.thumbnailHeightMaxPx, this.thumbnailWidthMaxPx);
    }

    public ObjectFacets replaceInstitutionHits(final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, institutionHits, this.subjectTermTexts, this.thumbnailExists, this.thumbnailHeightMaxPx, this.thumbnailWidthMaxPx);
    }

    public ObjectFacets replaceSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, this.institutionHits, subjectTermTexts, this.thumbnailExists, this.thumbnailHeightMaxPx, this.thumbnailWidthMaxPx);
    }

    public ObjectFacets replaceThumbnailExists(final boolean thumbnailExists) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, this.institutionHits, this.subjectTermTexts, thumbnailExists, this.thumbnailHeightMaxPx, this.thumbnailWidthMaxPx);
    }

    public ObjectFacets replaceThumbnailHeightMaxPx(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailHeightMaxPx) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, this.institutionHits, this.subjectTermTexts, this.thumbnailExists, thumbnailHeightMaxPx, this.thumbnailWidthMaxPx);
    }

    public ObjectFacets replaceThumbnailHeightMaxPx(final com.google.common.primitives.UnsignedInteger thumbnailHeightMaxPx) {
        return replaceThumbnailHeightMaxPx(com.google.common.base.Optional.fromNullable(thumbnailHeightMaxPx));
    }

    public ObjectFacets replaceThumbnailWidthMaxPx(final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailWidthMaxPx) {
        return new ObjectFacets(this.agentNameTexts, this.categories, this.collectionHits, this.institutionHits, this.subjectTermTexts, this.thumbnailExists, this.thumbnailHeightMaxPx, thumbnailWidthMaxPx);
    }

    public ObjectFacets replaceThumbnailWidthMaxPx(final com.google.common.primitives.UnsignedInteger thumbnailWidthMaxPx) {
        return replaceThumbnailWidthMaxPx(com.google.common.base.Optional.fromNullable(thumbnailWidthMaxPx));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("agent_name_texts", getAgentNameTexts()).add("categories", getCategories()).add("collection_hits", getCollectionHits()).add("institution_hits", getInstitutionHits()).add("subject_term_texts", getSubjectTermTexts()).add("thumbnail_exists", getThumbnailExists()).add("thumbnail_height_max_px", getThumbnailHeightMaxPx().orNull()).add("thumbnail_width_max_px", getThumbnailWidthMaxPx().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 8);

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

        oprot.writeBool(getThumbnailExists());

        if (getThumbnailHeightMaxPx().isPresent()) {
            oprot.writeU32(getThumbnailHeightMaxPx().get());
        } else {
            oprot.writeNull();
        }

        if (getThumbnailWidthMaxPx().isPresent()) {
            oprot.writeU32(getThumbnailWidthMaxPx().get());
        } else {
            oprot.writeNull();
        }

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

        oprot.writeFieldBegin("thumbnail_exists", org.thryft.protocol.Type.BOOL, (short)0);
        oprot.writeBool(getThumbnailExists());
        oprot.writeFieldEnd();

        if (getThumbnailHeightMaxPx().isPresent()) {
            oprot.writeFieldBegin("thumbnail_height_max_px", org.thryft.protocol.Type.I32, (short)0);
            oprot.writeU32(getThumbnailHeightMaxPx().get());
            oprot.writeFieldEnd();
        }

        if (getThumbnailWidthMaxPx().isPresent()) {
            oprot.writeFieldBegin("thumbnail_width_max_px", org.thryft.protocol.Type.I32, (short)0);
            oprot.writeU32(getThumbnailWidthMaxPx().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> agentNameTexts;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories;

    private final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collectionHits;

    private final com.google.common.collect.ImmutableMap<net.lab1318.costume.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutionHits;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts;

    private final boolean thumbnailExists;

    private final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailHeightMaxPx;

    private final com.google.common.base.Optional<com.google.common.primitives.UnsignedInteger> thumbnailWidthMaxPx;
}
