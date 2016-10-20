package org.dressdiscover.api.models.object;

public final class ObjectFacets implements org.thryft.Struct {
    public final static class Builder {
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

        protected ObjectFacets _build(final com.google.common.collect.ImmutableMap<String, Integer> categories, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections, final com.google.common.collect.ImmutableMap<String, Integer> colorTexts, final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions, final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts, final com.google.common.collect.ImmutableMap<String, Integer> materialTexts, final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts, final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts, final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts) {
            return new ObjectFacets(categories, collections, colorTexts, culturalContextTexts, genders, institutions, locationNameTexts, materialTexts, subjectTermTexts, techniqueTexts, workTypeTexts, DefaultConstructionValidator.getInstance());
        }

        public ObjectFacets build() {
            return _build(categories, collections, colorTexts, culturalContextTexts, genders, institutions, locationNameTexts, materialTexts, subjectTermTexts, techniqueTexts, workTypeTexts);
        }

        public final com.google.common.collect.ImmutableMap<String, Integer> getCategories() {
            return categories;
        }

        public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> getCollections() {
            return collections;
        }

        public final com.google.common.collect.ImmutableMap<String, Integer> getColorTexts() {
            return colorTexts;
        }

        public final com.google.common.collect.ImmutableMap<String, Integer> getCulturalContextTexts() {
            return culturalContextTexts;
        }

        public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> getGenders() {
            return genders;
        }

        public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> getInstitutions() {
            return institutions;
        }

        public final com.google.common.collect.ImmutableMap<String, Integer> getLocationNameTexts() {
            return locationNameTexts;
        }

        public final com.google.common.collect.ImmutableMap<String, Integer> getMaterialTexts() {
            return materialTexts;
        }

        public final com.google.common.collect.ImmutableMap<String, Integer> getSubjectTermTexts() {
            return subjectTermTexts;
        }

        public final com.google.common.collect.ImmutableMap<String, Integer> getTechniqueTexts() {
            return techniqueTexts;
        }

        public final com.google.common.collect.ImmutableMap<String, Integer> getWorkTypeTexts() {
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
            try {
                iprot.readListBegin();
                try {
                    categories = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                }
                try {
                    collections = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.collection.CollectionId, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final org.dressdiscover.api.models.collection.CollectionId key;
                                    try {
                                        key = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTIONS, e.getCause());
                }
                try {
                    colorTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, e.getCause());
                }
                try {
                    culturalContextTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, e.getCause());
                }
                try {
                    genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final org.dressdiscover.api.vocabularies.costume_core.gender.Gender key;
                                    key = iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.class);
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.GENDERS, e.getCause());
                }
                try {
                    institutions = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.institution.InstitutionId, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final org.dressdiscover.api.models.institution.InstitutionId key;
                                    try {
                                        key = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTIONS, e.getCause());
                }
                try {
                    locationNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, e.getCause());
                }
                try {
                    materialTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, e.getCause());
                }
                try {
                    subjectTermTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, e.getCause());
                }
                try {
                    techniqueTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, e.getCause());
                }
                try {
                    workTypeTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final Integer value;
                                    try {
                                        value = iprot.readI32();
                                    } catch (final NumberFormatException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, e.getCause());
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
                    case "categories": {
                        try {
                            categories = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                        }
                        break;
                    }
                    case "collections": {
                        try {
                            collections = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.collection.CollectionId, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final org.dressdiscover.api.models.collection.CollectionId key;
                                            try {
                                                key = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                                            } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTIONS, e.getCause());
                        }
                        break;
                    }
                    case "color_texts": {
                        try {
                            colorTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "cultural_context_texts": {
                        try {
                            culturalContextTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "genders": {
                        try {
                            genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final org.dressdiscover.api.vocabularies.costume_core.gender.Gender key;
                                            key = iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.class);
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.GENDERS, e.getCause());
                        }
                        break;
                    }
                    case "institutions": {
                        try {
                            institutions = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.institution.InstitutionId, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final org.dressdiscover.api.models.institution.InstitutionId key;
                                            try {
                                                key = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                                            } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTIONS, e.getCause());
                        }
                        break;
                    }
                    case "location_name_texts": {
                        try {
                            locationNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "material_texts": {
                        try {
                            materialTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "subject_term_texts": {
                        try {
                            subjectTermTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "technique_texts": {
                        try {
                            techniqueTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "work_type_texts": {
                        try {
                            workTypeTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final Integer value;
                                            try {
                                                value = iprot.readI32();
                                            } catch (final NumberFormatException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot);
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, e.getCause());
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
            case CATEGORIES: setCategories((com.google.common.collect.ImmutableMap<String, Integer>)value); return this;
            case COLLECTIONS: setCollections((com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer>)value); return this;
            case COLOR_TEXTS: setColorTexts((com.google.common.collect.ImmutableMap<String, Integer>)value); return this;
            case CULTURAL_CONTEXT_TEXTS: setCulturalContextTexts((com.google.common.collect.ImmutableMap<String, Integer>)value); return this;
            case GENDERS: setGenders((com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer>)value); return this;
            case INSTITUTIONS: setInstitutions((com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer>)value); return this;
            case LOCATION_NAME_TEXTS: setLocationNameTexts((com.google.common.collect.ImmutableMap<String, Integer>)value); return this;
            case MATERIAL_TEXTS: setMaterialTexts((com.google.common.collect.ImmutableMap<String, Integer>)value); return this;
            case SUBJECT_TERM_TEXTS: setSubjectTermTexts((com.google.common.collect.ImmutableMap<String, Integer>)value); return this;
            case TECHNIQUE_TEXTS: setTechniqueTexts((com.google.common.collect.ImmutableMap<String, Integer>)value); return this;
            case WORK_TYPE_TEXTS: setWorkTypeTexts((com.google.common.collect.ImmutableMap<String, Integer>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCategories(final com.google.common.collect.ImmutableMap<String, Integer> categories) {
            this.categories = DefaultConstructionValidator.getInstance().validateCategories(categories);
            return this;
        }

        public Builder setCollections(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections) {
            this.collections = DefaultConstructionValidator.getInstance().validateCollections(collections);
            return this;
        }

        public Builder setColorTexts(final com.google.common.collect.ImmutableMap<String, Integer> colorTexts) {
            this.colorTexts = DefaultConstructionValidator.getInstance().validateColorTexts(colorTexts);
            return this;
        }

        public Builder setCulturalContextTexts(final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts) {
            this.culturalContextTexts = DefaultConstructionValidator.getInstance().validateCulturalContextTexts(culturalContextTexts);
            return this;
        }

        public Builder setGenders(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders) {
            this.genders = DefaultConstructionValidator.getInstance().validateGenders(genders);
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

        public Builder setInstitutions(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions) {
            this.institutions = DefaultConstructionValidator.getInstance().validateInstitutions(institutions);
            return this;
        }

        public Builder setLocationNameTexts(final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts) {
            this.locationNameTexts = DefaultConstructionValidator.getInstance().validateLocationNameTexts(locationNameTexts);
            return this;
        }

        public Builder setMaterialTexts(final com.google.common.collect.ImmutableMap<String, Integer> materialTexts) {
            this.materialTexts = DefaultConstructionValidator.getInstance().validateMaterialTexts(materialTexts);
            return this;
        }

        public Builder setSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts) {
            this.subjectTermTexts = DefaultConstructionValidator.getInstance().validateSubjectTermTexts(subjectTermTexts);
            return this;
        }

        public Builder setTechniqueTexts(final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts) {
            this.techniqueTexts = DefaultConstructionValidator.getInstance().validateTechniqueTexts(techniqueTexts);
            return this;
        }

        public Builder setWorkTypeTexts(final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts) {
            this.workTypeTexts = DefaultConstructionValidator.getInstance().validateWorkTypeTexts(workTypeTexts);
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

        private com.google.common.collect.ImmutableMap<String, Integer> categories;
        private com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections;
        private com.google.common.collect.ImmutableMap<String, Integer> colorTexts;
        private com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts;
        private com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders;
        private com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions;
        private com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts;
        private com.google.common.collect.ImmutableMap<String, Integer> materialTexts;
        private com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts;
        private com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts;
        private com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ObjectFacets> {
        @Override
        public ObjectFacets readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return ObjectFacets.readAs(iprot, type);
        }

        @Override
        public ObjectFacets readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectFacets.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public ObjectFacets readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectFacets.readAsList(iprot);
        }

        @Override
        public ObjectFacets readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectFacets.readAsStruct(iprot);
        }

        @Override
        public ObjectFacets readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectFacets.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, Integer>>() {}, true, 0, "categories", org.thryft.protocol.Type.MAP),
        COLLECTIONS("collections", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer>>() {}, true, 0, "collections", org.thryft.protocol.Type.MAP),
        COLOR_TEXTS("colorTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, Integer>>() {}, true, 0, "color_texts", org.thryft.protocol.Type.MAP),
        CULTURAL_CONTEXT_TEXTS("culturalContextTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, Integer>>() {}, true, 0, "cultural_context_texts", org.thryft.protocol.Type.MAP),
        GENDERS("genders", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer>>() {}, true, 0, "genders", org.thryft.protocol.Type.MAP),
        INSTITUTIONS("institutions", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer>>() {}, true, 0, "institutions", org.thryft.protocol.Type.MAP),
        LOCATION_NAME_TEXTS("locationNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, Integer>>() {}, true, 0, "location_name_texts", org.thryft.protocol.Type.MAP),
        MATERIAL_TEXTS("materialTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, Integer>>() {}, true, 0, "material_texts", org.thryft.protocol.Type.MAP),
        SUBJECT_TERM_TEXTS("subjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, Integer>>() {}, true, 0, "subject_term_texts", org.thryft.protocol.Type.MAP),
        TECHNIQUE_TEXTS("techniqueTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, Integer>>() {}, true, 0, "technique_texts", org.thryft.protocol.Type.MAP),
        WORK_TYPE_TEXTS("workTypeTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, Integer>>() {}, true, 0, "work_type_texts", org.thryft.protocol.Type.MAP);

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

    public interface Validator<ExceptionT extends Exception> {
        public com.google.common.collect.ImmutableMap<String, Integer> validateCategories(final com.google.common.collect.ImmutableMap<String, Integer> categories) throws ExceptionT;

        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> validateCollections(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections) throws ExceptionT;

        public com.google.common.collect.ImmutableMap<String, Integer> validateColorTexts(final com.google.common.collect.ImmutableMap<String, Integer> colorTexts) throws ExceptionT;

        public com.google.common.collect.ImmutableMap<String, Integer> validateCulturalContextTexts(final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts) throws ExceptionT;

        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> validateGenders(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders) throws ExceptionT;

        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> validateInstitutions(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions) throws ExceptionT;

        public com.google.common.collect.ImmutableMap<String, Integer> validateLocationNameTexts(final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts) throws ExceptionT;

        public com.google.common.collect.ImmutableMap<String, Integer> validateMaterialTexts(final com.google.common.collect.ImmutableMap<String, Integer> materialTexts) throws ExceptionT;

        public com.google.common.collect.ImmutableMap<String, Integer> validateSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts) throws ExceptionT;

        public com.google.common.collect.ImmutableMap<String, Integer> validateTechniqueTexts(final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts) throws ExceptionT;

        public com.google.common.collect.ImmutableMap<String, Integer> validateWorkTypeTexts(final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts) throws ExceptionT;
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
        public com.google.common.collect.ImmutableMap<String, Integer> validateCategories(final com.google.common.collect.ImmutableMap<String, Integer> categories) throws RuntimeException {
            if (categories == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: categories is null");
            }
            return categories;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> validateCollections(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections) throws RuntimeException {
            if (collections == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: collections is null");
            }
            return collections;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateColorTexts(final com.google.common.collect.ImmutableMap<String, Integer> colorTexts) throws RuntimeException {
            if (colorTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: colorTexts is null");
            }
            return colorTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateCulturalContextTexts(final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts) throws RuntimeException {
            if (culturalContextTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: culturalContextTexts is null");
            }
            return culturalContextTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> validateGenders(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders) throws RuntimeException {
            if (genders == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: genders is null");
            }
            return genders;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> validateInstitutions(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions) throws RuntimeException {
            if (institutions == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: institutions is null");
            }
            return institutions;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateLocationNameTexts(final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts) throws RuntimeException {
            if (locationNameTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: locationNameTexts is null");
            }
            return locationNameTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateMaterialTexts(final com.google.common.collect.ImmutableMap<String, Integer> materialTexts) throws RuntimeException {
            if (materialTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: materialTexts is null");
            }
            return materialTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts) throws RuntimeException {
            if (subjectTermTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: subjectTermTexts is null");
            }
            return subjectTermTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateTechniqueTexts(final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts) throws RuntimeException {
            if (techniqueTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: techniqueTexts is null");
            }
            return techniqueTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateWorkTypeTexts(final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts) throws RuntimeException {
            if (workTypeTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectFacets: workTypeTexts is null");
            }
            return workTypeTexts;
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
        public com.google.common.collect.ImmutableMap<String, Integer> validateCategories(final com.google.common.collect.ImmutableMap<String, Integer> categories) {
            return categories;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> validateCollections(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections) {
            return collections;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateColorTexts(final com.google.common.collect.ImmutableMap<String, Integer> colorTexts) {
            return colorTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateCulturalContextTexts(final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts) {
            return culturalContextTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> validateGenders(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders) {
            return genders;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> validateInstitutions(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions) {
            return institutions;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateLocationNameTexts(final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts) {
            return locationNameTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateMaterialTexts(final com.google.common.collect.ImmutableMap<String, Integer> materialTexts) {
            return materialTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts) {
            return subjectTermTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateTechniqueTexts(final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts) {
            return techniqueTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateWorkTypeTexts(final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts) {
            return workTypeTexts;
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
        public com.google.common.collect.ImmutableMap<String, Integer> validateCategories(final com.google.common.collect.ImmutableMap<String, Integer> categories) throws org.thryft.protocol.InputProtocolException {
            if (categories == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CATEGORIES, "org.dressdiscover.api.models.object.ObjectFacets: categories is null");
            }
            return categories;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> validateCollections(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections) throws org.thryft.protocol.InputProtocolException {
            if (collections == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLLECTIONS, "org.dressdiscover.api.models.object.ObjectFacets: collections is null");
            }
            return collections;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateColorTexts(final com.google.common.collect.ImmutableMap<String, Integer> colorTexts) throws org.thryft.protocol.InputProtocolException {
            if (colorTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectFacets: colorTexts is null");
            }
            return colorTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateCulturalContextTexts(final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts) throws org.thryft.protocol.InputProtocolException {
            if (culturalContextTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectFacets: culturalContextTexts is null");
            }
            return culturalContextTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> validateGenders(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders) throws org.thryft.protocol.InputProtocolException {
            if (genders == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GENDERS, "org.dressdiscover.api.models.object.ObjectFacets: genders is null");
            }
            return genders;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> validateInstitutions(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions) throws org.thryft.protocol.InputProtocolException {
            if (institutions == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSTITUTIONS, "org.dressdiscover.api.models.object.ObjectFacets: institutions is null");
            }
            return institutions;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateLocationNameTexts(final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts) throws org.thryft.protocol.InputProtocolException {
            if (locationNameTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectFacets: locationNameTexts is null");
            }
            return locationNameTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateMaterialTexts(final com.google.common.collect.ImmutableMap<String, Integer> materialTexts) throws org.thryft.protocol.InputProtocolException {
            if (materialTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectFacets: materialTexts is null");
            }
            return materialTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts) throws org.thryft.protocol.InputProtocolException {
            if (subjectTermTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectFacets: subjectTermTexts is null");
            }
            return subjectTermTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateTechniqueTexts(final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts) throws org.thryft.protocol.InputProtocolException {
            if (techniqueTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacets: techniqueTexts is null");
            }
            return techniqueTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateWorkTypeTexts(final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts) throws org.thryft.protocol.InputProtocolException {
            if (workTypeTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectFacets: workTypeTexts is null");
            }
            return workTypeTexts;
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
        public com.google.common.collect.ImmutableMap<String, Integer> validateCategories(final com.google.common.collect.ImmutableMap<String, Integer> categories) {
            return categories;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> validateCollections(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections) {
            return collections;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateColorTexts(final com.google.common.collect.ImmutableMap<String, Integer> colorTexts) {
            return colorTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateCulturalContextTexts(final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts) {
            return culturalContextTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> validateGenders(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders) {
            return genders;
        }

        @Override
        public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> validateInstitutions(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions) {
            return institutions;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateLocationNameTexts(final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts) {
            return locationNameTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateMaterialTexts(final com.google.common.collect.ImmutableMap<String, Integer> materialTexts) {
            return materialTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts) {
            return subjectTermTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateTechniqueTexts(final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts) {
            return techniqueTexts;
        }

        @Override
        public com.google.common.collect.ImmutableMap<String, Integer> validateWorkTypeTexts(final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts) {
            return workTypeTexts;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public ObjectFacets(final ObjectFacets other) {
        this(other.getCategories(), other.getCollections(), other.getColorTexts(), other.getCulturalContextTexts(), other.getGenders(), other.getInstitutions(), other.getLocationNameTexts(), other.getMaterialTexts(), other.getSubjectTermTexts(), other.getTechniqueTexts(), other.getWorkTypeTexts(), NopConstructionValidator.getInstance());
    }

    protected ObjectFacets(final com.google.common.collect.ImmutableMap<String, Integer> categories, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections, final com.google.common.collect.ImmutableMap<String, Integer> colorTexts, final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions, final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts, final com.google.common.collect.ImmutableMap<String, Integer> materialTexts, final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts, final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts, final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts, ConstructionValidator validator) {
        this.categories = validator.validateCategories(categories);
        this.collections = validator.validateCollections(collections);
        this.colorTexts = validator.validateColorTexts(colorTexts);
        this.culturalContextTexts = validator.validateCulturalContextTexts(culturalContextTexts);
        this.genders = validator.validateGenders(genders);
        this.institutions = validator.validateInstitutions(institutions);
        this.locationNameTexts = validator.validateLocationNameTexts(locationNameTexts);
        this.materialTexts = validator.validateMaterialTexts(materialTexts);
        this.subjectTermTexts = validator.validateSubjectTermTexts(subjectTermTexts);
        this.techniqueTexts = validator.validateTechniqueTexts(techniqueTexts);
        this.workTypeTexts = validator.validateWorkTypeTexts(workTypeTexts);
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

    /**
     * Optional factory method
     */
    public static ObjectFacets create(final com.google.common.collect.ImmutableMap<String, Integer> categories, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections, final com.google.common.collect.ImmutableMap<String, Integer> colorTexts, final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders, final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions, final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts, final com.google.common.collect.ImmutableMap<String, Integer> materialTexts, final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts, final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts, final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts) {
        return new ObjectFacets(categories, collections, colorTexts, culturalContextTexts, genders, institutions, locationNameTexts, materialTexts, subjectTermTexts, techniqueTexts, workTypeTexts, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof ObjectFacets)) {
            return false;
        }

        final ObjectFacets other = (ObjectFacets)otherObject;

        if (!(getCategories().equals(other.getCategories()))) {
            return false;
        }

        if (!(getCollections().equals(other.getCollections()))) {
            return false;
        }

        if (!(getColorTexts().equals(other.getColorTexts()))) {
            return false;
        }

        if (!(getCulturalContextTexts().equals(other.getCulturalContextTexts()))) {
            return false;
        }

        if (!(getGenders().equals(other.getGenders()))) {
            return false;
        }

        if (!(getInstitutions().equals(other.getInstitutions()))) {
            return false;
        }

        if (!(getLocationNameTexts().equals(other.getLocationNameTexts()))) {
            return false;
        }

        if (!(getMaterialTexts().equals(other.getMaterialTexts()))) {
            return false;
        }

        if (!(getSubjectTermTexts().equals(other.getSubjectTermTexts()))) {
            return false;
        }

        if (!(getTechniqueTexts().equals(other.getTechniqueTexts()))) {
            return false;
        }

        if (!(getWorkTypeTexts().equals(other.getWorkTypeTexts()))) {
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

    public final com.google.common.collect.ImmutableMap<String, Integer> getCategories() {
        return categories;
    }

    public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> getCollections() {
        return collections;
    }

    public final com.google.common.collect.ImmutableMap<String, Integer> getColorTexts() {
        return colorTexts;
    }

    public final com.google.common.collect.ImmutableMap<String, Integer> getCulturalContextTexts() {
        return culturalContextTexts;
    }

    public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> getGenders() {
        return genders;
    }

    public final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> getInstitutions() {
        return institutions;
    }

    public final com.google.common.collect.ImmutableMap<String, Integer> getLocationNameTexts() {
        return locationNameTexts;
    }

    public final com.google.common.collect.ImmutableMap<String, Integer> getMaterialTexts() {
        return materialTexts;
    }

    public final com.google.common.collect.ImmutableMap<String, Integer> getSubjectTermTexts() {
        return subjectTermTexts;
    }

    public final com.google.common.collect.ImmutableMap<String, Integer> getTechniqueTexts() {
        return techniqueTexts;
    }

    public final com.google.common.collect.ImmutableMap<String, Integer> getWorkTypeTexts() {
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
        com.google.common.collect.ImmutableMap<String, Integer> categories = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections = null;
        com.google.common.collect.ImmutableMap<String, Integer> colorTexts = null;
        com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions = null;
        com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts = null;
        com.google.common.collect.ImmutableMap<String, Integer> materialTexts = null;
        com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts = null;
        com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts = null;
        com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts = null;

        try {
            iprot.readListBegin();
            try {
                categories = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
            }
            try {
                collections = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.collection.CollectionId, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final org.dressdiscover.api.models.collection.CollectionId key;
                                try {
                                    key = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                                } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTIONS, e.getCause());
            }
            try {
                colorTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, e.getCause());
            }
            try {
                culturalContextTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, e.getCause());
            }
            try {
                genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final org.dressdiscover.api.vocabularies.costume_core.gender.Gender key;
                                key = iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.class);
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.GENDERS, e.getCause());
            }
            try {
                institutions = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.institution.InstitutionId, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final org.dressdiscover.api.models.institution.InstitutionId key;
                                try {
                                    key = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTIONS, e.getCause());
            }
            try {
                locationNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, e.getCause());
            }
            try {
                materialTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, e.getCause());
            }
            try {
                subjectTermTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, e.getCause());
            }
            try {
                techniqueTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, e.getCause());
            }
            try {
                workTypeTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                    @Override
                    public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                            final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                            for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                final String key;
                                key = iprot.readString();
                                final Integer value;
                                try {
                                    value = iprot.readI32();
                                } catch (final NumberFormatException e) {
                                     throw new org.thryft.protocol.InputProtocolException(e);
                                }
                                map.put(key, value);
                            }
                            iprot.readMapEnd();
                            return map.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, e.getCause());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new ObjectFacets(DefaultReadValidator.getInstance().validateCategories(categories), DefaultReadValidator.getInstance().validateCollections(collections), DefaultReadValidator.getInstance().validateColorTexts(colorTexts), DefaultReadValidator.getInstance().validateCulturalContextTexts(culturalContextTexts), DefaultReadValidator.getInstance().validateGenders(genders), DefaultReadValidator.getInstance().validateInstitutions(institutions), DefaultReadValidator.getInstance().validateLocationNameTexts(locationNameTexts), DefaultReadValidator.getInstance().validateMaterialTexts(materialTexts), DefaultReadValidator.getInstance().validateSubjectTermTexts(subjectTermTexts), DefaultReadValidator.getInstance().validateTechniqueTexts(techniqueTexts), DefaultReadValidator.getInstance().validateWorkTypeTexts(workTypeTexts), NopConstructionValidator.getInstance());
    }

    public static ObjectFacets readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectFacets readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableMap<String, Integer> categories = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections = null;
        com.google.common.collect.ImmutableMap<String, Integer> colorTexts = null;
        com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders = null;
        com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions = null;
        com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts = null;
        com.google.common.collect.ImmutableMap<String, Integer> materialTexts = null;
        com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts = null;
        com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts = null;
        com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "categories": {
                    try {
                        categories = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                    }
                    break;
                }
                case "collections": {
                    try {
                        collections = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.collection.CollectionId, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final org.dressdiscover.api.models.collection.CollectionId key;
                                        try {
                                            key = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTIONS, e.getCause());
                    }
                    break;
                }
                case "color_texts": {
                    try {
                        colorTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, e.getCause());
                    }
                    break;
                }
                case "cultural_context_texts": {
                    try {
                        culturalContextTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, e.getCause());
                    }
                    break;
                }
                case "genders": {
                    try {
                        genders = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final org.dressdiscover.api.vocabularies.costume_core.gender.Gender key;
                                        key = iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.class);
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.GENDERS, e.getCause());
                    }
                    break;
                }
                case "institutions": {
                    try {
                        institutions = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<org.dressdiscover.api.models.institution.InstitutionId, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final org.dressdiscover.api.models.institution.InstitutionId key;
                                        try {
                                            key = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTIONS, e.getCause());
                    }
                    break;
                }
                case "location_name_texts": {
                    try {
                        locationNameTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, e.getCause());
                    }
                    break;
                }
                case "material_texts": {
                    try {
                        materialTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, e.getCause());
                    }
                    break;
                }
                case "subject_term_texts": {
                    try {
                        subjectTermTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, e.getCause());
                    }
                    break;
                }
                case "technique_texts": {
                    try {
                        techniqueTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, e.getCause());
                    }
                    break;
                }
                case "work_type_texts": {
                    try {
                        workTypeTexts = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, Integer>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, Integer> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, Integer> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final Integer value;
                                        try {
                                            value = iprot.readI32();
                                        } catch (final NumberFormatException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot);
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, e.getCause());
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
        return new ObjectFacets(DefaultReadValidator.getInstance().validateCategories(categories), DefaultReadValidator.getInstance().validateCollections(collections), DefaultReadValidator.getInstance().validateColorTexts(colorTexts), DefaultReadValidator.getInstance().validateCulturalContextTexts(culturalContextTexts), DefaultReadValidator.getInstance().validateGenders(genders), DefaultReadValidator.getInstance().validateInstitutions(institutions), DefaultReadValidator.getInstance().validateLocationNameTexts(locationNameTexts), DefaultReadValidator.getInstance().validateMaterialTexts(materialTexts), DefaultReadValidator.getInstance().validateSubjectTermTexts(subjectTermTexts), DefaultReadValidator.getInstance().validateTechniqueTexts(techniqueTexts), DefaultReadValidator.getInstance().validateWorkTypeTexts(workTypeTexts), NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceCategories(final com.google.common.collect.ImmutableMap<String, Integer> categories) {
        return new ObjectFacets(DefaultConstructionValidator.getInstance().validateCategories(categories), this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceCollections(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections) {
        return new ObjectFacets(this.categories, DefaultConstructionValidator.getInstance().validateCollections(collections), this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceColorTexts(final com.google.common.collect.ImmutableMap<String, Integer> colorTexts) {
        return new ObjectFacets(this.categories, this.collections, DefaultConstructionValidator.getInstance().validateColorTexts(colorTexts), this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceCulturalContextTexts(final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, DefaultConstructionValidator.getInstance().validateCulturalContextTexts(culturalContextTexts), this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceGenders(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, DefaultConstructionValidator.getInstance().validateGenders(genders), this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceInstitutions(final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, DefaultConstructionValidator.getInstance().validateInstitutions(institutions), this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceLocationNameTexts(final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, DefaultConstructionValidator.getInstance().validateLocationNameTexts(locationNameTexts), this.materialTexts, this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceMaterialTexts(final com.google.common.collect.ImmutableMap<String, Integer> materialTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, DefaultConstructionValidator.getInstance().validateMaterialTexts(materialTexts), this.subjectTermTexts, this.techniqueTexts, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceSubjectTermTexts(final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, DefaultConstructionValidator.getInstance().validateSubjectTermTexts(subjectTermTexts), this.techniqueTexts, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceTechniqueTexts(final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, DefaultConstructionValidator.getInstance().validateTechniqueTexts(techniqueTexts), this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectFacets replaceWorkTypeTexts(final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts) {
        return new ObjectFacets(this.categories, this.collections, this.colorTexts, this.culturalContextTexts, this.genders, this.institutions, this.locationNameTexts, this.materialTexts, this.subjectTermTexts, this.techniqueTexts, DefaultConstructionValidator.getInstance().validateWorkTypeTexts(workTypeTexts), NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("categories", getCategories()).add("collections", getCollections()).add("color_texts", getColorTexts()).add("cultural_context_texts", getCulturalContextTexts()).add("genders", getGenders()).add("institutions", getInstitutions()).add("location_name_texts", getLocationNameTexts()).add("material_texts", getMaterialTexts()).add("subject_term_texts", getSubjectTermTexts()).add("technique_texts", getTechniqueTexts()).add("work_type_texts", getWorkTypeTexts()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 11);

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCategories().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getCategories().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCollections().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.models.collection.CollectionId, Integer> _iter0 : getCollections().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getColorTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getColorTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCulturalContextTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getCulturalContextTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getGenders().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> _iter0 : getGenders().entrySet()) {
            oprot.writeEnum(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getInstitutions().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.models.institution.InstitutionId, Integer> _iter0 : getInstitutions().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getLocationNameTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getLocationNameTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getMaterialTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getMaterialTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getSubjectTermTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getSubjectTermTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getTechniqueTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getTechniqueTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();

        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getWorkTypeTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getWorkTypeTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
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
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getCategories().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("collections", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCollections().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.models.collection.CollectionId, Integer> _iter0 : getCollections().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("color_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getColorTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getColorTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("cultural_context_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getCulturalContextTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getCulturalContextTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("genders", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getGenders().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> _iter0 : getGenders().entrySet()) {
            oprot.writeEnum(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("institutions", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getInstitutions().size());
        for (com.google.common.collect.ImmutableMap.Entry<org.dressdiscover.api.models.institution.InstitutionId, Integer> _iter0 : getInstitutions().entrySet()) {
            oprot.writeString(_iter0.getKey().toString());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("location_name_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getLocationNameTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getLocationNameTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("material_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getMaterialTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getMaterialTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("subject_term_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getSubjectTermTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getSubjectTermTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("technique_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getTechniqueTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getTechniqueTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("work_type_texts", org.thryft.protocol.Type.MAP, (short)0);
        oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.I32, getWorkTypeTexts().size());
        for (com.google.common.collect.ImmutableMap.Entry<String, Integer> _iter0 : getWorkTypeTexts().entrySet()) {
            oprot.writeString(_iter0.getKey());
            oprot.writeI32(_iter0.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final com.google.common.collect.ImmutableMap<String, Integer> categories;

    private final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.collection.CollectionId, Integer> collections;

    private final com.google.common.collect.ImmutableMap<String, Integer> colorTexts;

    private final com.google.common.collect.ImmutableMap<String, Integer> culturalContextTexts;

    private final com.google.common.collect.ImmutableMap<org.dressdiscover.api.vocabularies.costume_core.gender.Gender, Integer> genders;

    private final com.google.common.collect.ImmutableMap<org.dressdiscover.api.models.institution.InstitutionId, Integer> institutions;

    private final com.google.common.collect.ImmutableMap<String, Integer> locationNameTexts;

    private final com.google.common.collect.ImmutableMap<String, Integer> materialTexts;

    private final com.google.common.collect.ImmutableMap<String, Integer> subjectTermTexts;

    private final com.google.common.collect.ImmutableMap<String, Integer> techniqueTexts;

    private final com.google.common.collect.ImmutableMap<String, Integer> workTypeTexts;
}
