package org.dressdiscover.api.models.object;

public class ObjectFacets implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            categories = null;
            collections = null;
            colorTexts = null;
            culturalContextTexts = null;
            genders = null;
            institutions = null;
            locationNameTexts = null;
            materialTexts = null;
            subjectTermTexts = null;
            techniqueTexts = null;
            workTypeTexts = null;
        }

        public Builder(final ObjectFacets other) {
            this.categories = other.getCategories();
            this.collections = other.getCollections();
            this.colorTexts = other.getColorTexts();
            this.culturalContextTexts = other.getCulturalContextTexts();
            this.genders = other.getGenders();
            this.institutions = other.getInstitutions();
            this.locationNameTexts = other.getLocationNameTexts();
            this.materialTexts = other.getMaterialTexts();
            this.subjectTermTexts = other.getSubjectTermTexts();
            this.techniqueTexts = other.getTechniqueTexts();
            this.workTypeTexts = other.getWorkTypeTexts();
        }

        protected ObjectFacets _build(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collections, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> colorTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> culturalContextTexts, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutions, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> locationNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts) {
            return new ObjectFacets(categories, collections, colorTexts, culturalContextTexts, genders, institutions, locationNameTexts, materialTexts, subjectTermTexts, techniqueTexts, workTypeTexts);
        }

        public ObjectFacets build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(categories, "org.dressdiscover.api.models.object.ObjectFacets: missing categories"), com.google.common.base.Preconditions.checkNotNull(collections, "org.dressdiscover.api.models.object.ObjectFacets: missing collections"), com.google.common.base.Preconditions.checkNotNull(colorTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing colorTexts"), com.google.common.base.Preconditions.checkNotNull(culturalContextTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing culturalContextTexts"), com.google.common.base.Preconditions.checkNotNull(genders, "org.dressdiscover.api.models.object.ObjectFacets: missing genders"), com.google.common.base.Preconditions.checkNotNull(institutions, "org.dressdiscover.api.models.object.ObjectFacets: missing institutions"), com.google.common.base.Preconditions.checkNotNull(locationNameTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing locationNameTexts"), com.google.common.base.Preconditions.checkNotNull(materialTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing materialTexts"), com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing subjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(techniqueTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing techniqueTexts"), com.google.common.base.Preconditions.checkNotNull(workTypeTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing workTypeTexts"));
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getCategories() {
            return categories;
        }

        public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> getCollections() {
            return collections;
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getColorTexts() {
            return colorTexts;
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getCulturalContextTexts() {
            return culturalContextTexts;
        }

        public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> getGenders() {
            return genders;
        }

        public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> getInstitutions() {
            return institutions;
        }

        public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getLocationNameTexts() {
            return locationNameTexts;
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
            iprot.readListBegin();
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
            collections = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {
                @Override
                public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                        final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                            final org.dressdiscover.api.models.collection.CollectionId key;
                            try {
                                key = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                            } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
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
            colorTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            culturalContextTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>>() {
                @Override
                public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                        final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                            final org.dressdiscover.api.models.gender.Gender key;
                            try {
                                key = iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class);
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
            institutions = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {
                @Override
                public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                        final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                            final org.dressdiscover.api.models.institution.InstitutionId key;
                            try {
                                key = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                            } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
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
            locationNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
                case "collections": {
                    collections = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final org.dressdiscover.api.models.collection.CollectionId key;
                                    try {
                                        key = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
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
                case "color_texts": {
                    colorTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
                case "cultural_context_texts": {
                    culturalContextTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
                case "genders": {
                    genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final org.dressdiscover.api.models.gender.Gender key;
                                    try {
                                        key = iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class);
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
                case "institutions": {
                    institutions = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final org.dressdiscover.api.models.institution.InstitutionId key;
                                    try {
                                        key = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
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
                case "location_name_texts": {
                    locationNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            case CATEGORIES: setCategories((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case COLLECTIONS: setCollections((com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>)value); return this;
            case COLOR_TEXTS: setColorTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case CULTURAL_CONTEXT_TEXTS: setCulturalContextTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case GENDERS: setGenders((com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>)value); return this;
            case INSTITUTIONS: setInstitutions((com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>)value); return this;
            case LOCATION_NAME_TEXTS: setLocationNameTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case MATERIAL_TEXTS: setMaterialTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case SUBJECT_TERM_TEXTS: setSubjectTermTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case TECHNIQUE_TEXTS: setTechniqueTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            case WORK_TYPE_TEXTS: setWorkTypeTexts((com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCategories(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories) {
            this.categories = com.google.common.base.Preconditions.checkNotNull(categories);
            return this;
        }

        public Builder setCollections(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collections) {
            this.collections = com.google.common.base.Preconditions.checkNotNull(collections);
            return this;
        }

        public Builder setColorTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> colorTexts) {
            this.colorTexts = com.google.common.base.Preconditions.checkNotNull(colorTexts);
            return this;
        }

        public Builder setCulturalContextTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> culturalContextTexts) {
            this.culturalContextTexts = com.google.common.base.Preconditions.checkNotNull(culturalContextTexts);
            return this;
        }

        public Builder setGenders(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders) {
            this.genders = com.google.common.base.Preconditions.checkNotNull(genders);
            return this;
        }

        public Builder setIfPresent(final ObjectFacets other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCategories(other.getCategories());
            setCollections(other.getCollections());
            setColorTexts(other.getColorTexts());
            setCulturalContextTexts(other.getCulturalContextTexts());
            setGenders(other.getGenders());
            setInstitutions(other.getInstitutions());
            setLocationNameTexts(other.getLocationNameTexts());
            setMaterialTexts(other.getMaterialTexts());
            setSubjectTermTexts(other.getSubjectTermTexts());
            setTechniqueTexts(other.getTechniqueTexts());
            setWorkTypeTexts(other.getWorkTypeTexts());

            return this;
        }

        public Builder setInstitutions(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutions) {
            this.institutions = com.google.common.base.Preconditions.checkNotNull(institutions);
            return this;
        }

        public Builder setLocationNameTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> locationNameTexts) {
            this.locationNameTexts = com.google.common.base.Preconditions.checkNotNull(locationNameTexts);
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
            case CATEGORIES: return unsetCategories();
            case COLLECTIONS: return unsetCollections();
            case COLOR_TEXTS: return unsetColorTexts();
            case CULTURAL_CONTEXT_TEXTS: return unsetCulturalContextTexts();
            case GENDERS: return unsetGenders();
            case INSTITUTIONS: return unsetInstitutions();
            case LOCATION_NAME_TEXTS: return unsetLocationNameTexts();
            case MATERIAL_TEXTS: return unsetMaterialTexts();
            case SUBJECT_TERM_TEXTS: return unsetSubjectTermTexts();
            case TECHNIQUE_TEXTS: return unsetTechniqueTexts();
            case WORK_TYPE_TEXTS: return unsetWorkTypeTexts();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCategories() {
            this.categories = null;
            return this;
        }

        public Builder unsetCollections() {
            this.collections = null;
            return this;
        }

        public Builder unsetColorTexts() {
            this.colorTexts = null;
            return this;
        }

        public Builder unsetCulturalContextTexts() {
            this.culturalContextTexts = null;
            return this;
        }

        public Builder unsetGenders() {
            this.genders = null;
            return this;
        }

        public Builder unsetInstitutions() {
            this.institutions = null;
            return this;
        }

        public Builder unsetLocationNameTexts() {
            this.locationNameTexts = null;
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

        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories;
        private com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collections;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> colorTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> culturalContextTexts;
        private com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders;
        private com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutions;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> locationNameTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts;
        private com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "categories", org.thryft.protocol.Type.MAP),
        COLLECTIONS("collections", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "collections", org.thryft.protocol.Type.MAP),
        COLOR_TEXTS("colorTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "color_texts", org.thryft.protocol.Type.MAP),
        CULTURAL_CONTEXT_TEXTS("culturalContextTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "cultural_context_texts", org.thryft.protocol.Type.MAP),
        GENDERS("genders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "genders", org.thryft.protocol.Type.MAP),
        INSTITUTIONS("institutions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "institutions", org.thryft.protocol.Type.MAP),
        LOCATION_NAME_TEXTS("locationNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {}, true, 0, "location_name_texts", org.thryft.protocol.Type.MAP),
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
            case "categories": return CATEGORIES;
            case "collections": return COLLECTIONS;
            case "colorTexts": return COLOR_TEXTS;
            case "culturalContextTexts": return CULTURAL_CONTEXT_TEXTS;
            case "genders": return GENDERS;
            case "institutions": return INSTITUTIONS;
            case "locationNameTexts": return LOCATION_NAME_TEXTS;
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
            case "categories": return CATEGORIES;
            case "collections": return COLLECTIONS;
            case "color_texts": return COLOR_TEXTS;
            case "cultural_context_texts": return CULTURAL_CONTEXT_TEXTS;
            case "genders": return GENDERS;
            case "institutions": return INSTITUTIONS;
            case "location_name_texts": return LOCATION_NAME_TEXTS;
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
        this(other.getCategories(), other.getCollections(), other.getColorTexts(), other.getCulturalContextTexts(), other.getGenders(), other.getInstitutions(), other.getLocationNameTexts(), other.getMaterialTexts(), other.getSubjectTermTexts(), other.getTechniqueTexts(), other.getWorkTypeTexts());
    }

    /**
     * Optional constructor
     */
    public ObjectFacets(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collections, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> colorTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> culturalContextTexts, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutions, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> locationNameTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts, final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts) {
        this.categories = com.google.common.base.Preconditions.checkNotNull(categories, "org.dressdiscover.api.models.object.ObjectFacets: missing categories");
        this.collections = com.google.common.base.Preconditions.checkNotNull(collections, "org.dressdiscover.api.models.object.ObjectFacets: missing collections");
        this.colorTexts = com.google.common.base.Preconditions.checkNotNull(colorTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing colorTexts");
        this.culturalContextTexts = com.google.common.base.Preconditions.checkNotNull(culturalContextTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing culturalContextTexts");
        this.genders = com.google.common.base.Preconditions.checkNotNull(genders, "org.dressdiscover.api.models.object.ObjectFacets: missing genders");
        this.institutions = com.google.common.base.Preconditions.checkNotNull(institutions, "org.dressdiscover.api.models.object.ObjectFacets: missing institutions");
        this.locationNameTexts = com.google.common.base.Preconditions.checkNotNull(locationNameTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing locationNameTexts");
        this.materialTexts = com.google.common.base.Preconditions.checkNotNull(materialTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing materialTexts");
        this.subjectTermTexts = com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing subjectTermTexts");
        this.techniqueTexts = com.google.common.base.Preconditions.checkNotNull(techniqueTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing techniqueTexts");
        this.workTypeTexts = com.google.common.base.Preconditions.checkNotNull(workTypeTexts, "org.dressdiscover.api.models.object.ObjectFacets: missing workTypeTexts");
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
            getCategories().equals(other.getCategories()) &&
            getCollections().equals(other.getCollections()) &&
            getColorTexts().equals(other.getColorTexts()) &&
            getCulturalContextTexts().equals(other.getCulturalContextTexts()) &&
            getGenders().equals(other.getGenders()) &&
            getInstitutions().equals(other.getInstitutions()) &&
            getLocationNameTexts().equals(other.getLocationNameTexts()) &&
            getMaterialTexts().equals(other.getMaterialTexts()) &&
            getSubjectTermTexts().equals(other.getSubjectTermTexts()) &&
            getTechniqueTexts().equals(other.getTechniqueTexts()) &&
            getWorkTypeTexts().equals(other.getWorkTypeTexts());
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
        case CATEGORIES: return getCategories();
        case COLLECTIONS: return getCollections();
        case COLOR_TEXTS: return getColorTexts();
        case CULTURAL_CONTEXT_TEXTS: return getCulturalContextTexts();
        case GENDERS: return getGenders();
        case INSTITUTIONS: return getInstitutions();
        case LOCATION_NAME_TEXTS: return getLocationNameTexts();
        case MATERIAL_TEXTS: return getMaterialTexts();
        case SUBJECT_TERM_TEXTS: return getSubjectTermTexts();
        case TECHNIQUE_TEXTS: return getTechniqueTexts();
        case WORK_TYPE_TEXTS: return getWorkTypeTexts();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getCategories() {
        return categories;
    }

    public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> getCollections() {
        return collections;
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getColorTexts() {
        return colorTexts;
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getCulturalContextTexts() {
        return culturalContextTexts;
    }

    public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> getGenders() {
        return genders;
    }

    public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> getInstitutions() {
        return institutions;
    }

    public final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> getLocationNameTexts() {
        return locationNameTexts;
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
        hashCode = 31 * hashCode + getCategories().hashCode();
        hashCode = 31 * hashCode + getCollections().hashCode();
        hashCode = 31 * hashCode + getColorTexts().hashCode();
        hashCode = 31 * hashCode + getCulturalContextTexts().hashCode();
        hashCode = 31 * hashCode + getGenders().hashCode();
        hashCode = 31 * hashCode + getInstitutions().hashCode();
        hashCode = 31 * hashCode + getLocationNameTexts().hashCode();
        hashCode = 31 * hashCode + getMaterialTexts().hashCode();
        hashCode = 31 * hashCode + getSubjectTermTexts().hashCode();
        hashCode = 31 * hashCode + getTechniqueTexts().hashCode();
        hashCode = 31 * hashCode + getWorkTypeTexts().hashCode();
        return hashCode;
    }

    public static ObjectFacets readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectFacets readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectFacets readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collections = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> colorTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> culturalContextTexts = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutions = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> locationNameTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts = null;

        iprot.readListBegin();
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
        collections = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {
            @Override
            public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                    final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                        final org.dressdiscover.api.models.collection.CollectionId key;
                        try {
                            key = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
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
        colorTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
        culturalContextTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
        genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>>() {
            @Override
            public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                    final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                        final org.dressdiscover.api.models.gender.Gender key;
                        try {
                            key = iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class);
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
        institutions = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {
            @Override
            public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                    final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                        final org.dressdiscover.api.models.institution.InstitutionId key;
                        try {
                            key = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
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
        locationNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            return new ObjectFacets(categories, collections, colorTexts, culturalContextTexts, genders, institutions, locationNameTexts, materialTexts, subjectTermTexts, techniqueTexts, workTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectFacets readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectFacets readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collections = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> colorTexts = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> culturalContextTexts = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutions = null;
        com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> locationNameTexts = null;
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
            case "collections": {
                collections = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final org.dressdiscover.api.models.collection.CollectionId key;
                                try {
                                    key = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                                } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
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
            case "color_texts": {
                colorTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            case "cultural_context_texts": {
                culturalContextTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            case "genders": {
                genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final org.dressdiscover.api.models.gender.Gender key;
                                try {
                                    key = iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class);
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
            case "institutions": {
                institutions = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final org.dressdiscover.api.models.institution.InstitutionId key;
                                try {
                                    key = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
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
            case "location_name_texts": {
                locationNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger>>() {
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
            return new ObjectFacets(categories, collections, colorTexts, culturalContextTexts, genders, institutions, locationNameTexts, materialTexts, subjectTermTexts, techniqueTexts, workTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectFacets replaceCategories(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories) {
        return new ObjectFacets(categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceCollections(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collections) {
        return new ObjectFacets(this.categories, collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceColorTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> colorTexts) {
        return new ObjectFacets(this.categories, this.collections, colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceCulturalContextTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> culturalContextTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceGenders(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceInstitutions(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutions) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceLocationNameTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> locationNameTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceMaterialTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, subjectTermTexts, this.techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceTechniqueTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, techniqueTexts, this.workTypeTexts);
    }

    public ObjectFacets replaceWorkTypeTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, workTypeTexts);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("categories", getCategories()).add("collections", getCollections()).add("color_texts", getColorTexts()).add("cultural_context_texts", getCulturalContextTexts()).add("genders", getGenders()).add("institutions", getInstitutions()).add("location_name_texts", getLocationNameTexts()).add("material_texts", getMaterialTexts()).add("subject_term_texts", getSubjectTermTexts()).add("technique_texts", getTechniqueTexts()).add("work_type_texts", getWorkTypeTexts()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 11);

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCategories().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getCategories().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCollections().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> _iter0 : getCollections().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getColorTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getColorTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCulturalContextTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getCulturalContextTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getGenders().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> _iter0 : getGenders().entrySet()) {
            oprot.writeEnum(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getInstitutions().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> _iter0 : getInstitutions().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getLocationNameTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getLocationNameTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
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
        oprot.writeStructBegin("org.dressdiscover.api.models.object.ObjectFacets");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("categories", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCategories().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getCategories().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("collections", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCollections().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> _iter0 : getCollections().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("color_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getColorTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getColorTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("cultural_context_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCulturalContextTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getCulturalContextTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("genders", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getGenders().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> _iter0 : getGenders().entrySet()) {
            oprot.writeEnum(_iter0.getKey());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("institutions", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getInstitutions().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> _iter0 : getInstitutions().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeU32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("location_name_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getLocationNameTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.primitives.UnsignedInteger> _iter0 : getLocationNameTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
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

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> categories;

    private final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, com.google.common.primitives.UnsignedInteger> collections;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> colorTexts;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> culturalContextTexts;

    private final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.gender.Gender, com.google.common.primitives.UnsignedInteger> genders;

    private final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, com.google.common.primitives.UnsignedInteger> institutions;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> locationNameTexts;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> materialTexts;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> subjectTermTexts;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> techniqueTexts;

    private final com.google.common.collect.ImmutableMap<String, com.google.common.primitives.UnsignedInteger> workTypeTexts;
}
