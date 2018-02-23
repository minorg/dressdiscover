package org.dressdiscover.api.models.object;

public final class ObjectSummary implements org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            collectionId = null;
            institutionId = null;
            title = null;
            agentNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            categories = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            colorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            culturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            date = com.google.common.base.Optional.<String> absent();
            description = com.google.common.base.Optional.<String> absent();
            gender = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent();
            hidden = com.google.common.base.Optional.<Boolean> absent();
            image = com.google.common.base.Optional.<org.dressdiscover.api.models.image.Image> absent();
            locationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            materialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            relationTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            structureTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();
            subjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            techniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
            workTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        }

        public Builder(final ObjectSummary other) {
            this.collectionId = other.getCollectionId();
            this.institutionId = other.getInstitutionId();
            this.title = other.getTitle();
            this.agentNameTexts = other.getAgentNameTexts();
            this.categories = other.getCategories();
            this.colorTexts = other.getColorTexts();
            this.culturalContextTexts = other.getCulturalContextTexts();
            this.date = other.getDate();
            this.description = other.getDescription();
            this.gender = other.getGender();
            this.hidden = other.getHidden();
            this.image = other.getImage();
            this.locationNameTexts = other.getLocationNameTexts();
            this.materialTexts = other.getMaterialTexts();
            this.relationTexts = other.getRelationTexts();
            this.structureTexts = other.getStructureTexts();
            this.subjectTermTexts = other.getSubjectTermTexts();
            this.techniqueTexts = other.getTechniqueTexts();
            this.url = other.getUrl();
            this.workTypeTexts = other.getWorkTypeTexts();
        }

        protected ObjectSummary _build(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
            return new ObjectSummary(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);
        }

        public ObjectSummary build() {
            UncheckedValidator.validate(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);

            return _build(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAgentNameTexts() {
            return agentNameTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCategories() {
            return categories;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.collection.CollectionId getCollectionId() {
            return collectionId;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getColorTexts() {
            return colorTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCulturalContextTexts() {
            return culturalContextTexts;
        }

        /**
         * Dublin Core date
         */
        public final com.google.common.base.Optional<String> getDate() {
            return date;
        }

        /**
         * Dublin Core description
         */
        public final com.google.common.base.Optional<String> getDescription() {
            return description;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> getGender() {
            return gender;
        }

        public final com.google.common.base.Optional<Boolean> getHidden() {
            return hidden;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> getImage() {
            return image;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId getInstitutionId() {
            return institutionId;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getLocationNameTexts() {
            return locationNameTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getMaterialTexts() {
            return materialTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRelationTexts() {
            return relationTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> getStructureTexts() {
            return structureTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSubjectTermTexts() {
            return subjectTermTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTechniqueTexts() {
            return techniqueTexts;
        }

        /**
         * Dublin Core title
         */
        public final @javax.annotation.Nullable String getTitle() {
            return title;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
            return url;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getWorkTypeTexts() {
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
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                try {
                    collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                }
                try {
                    institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                }
                title = iprot.readString();
                if (__list.getSize() > 3) {
                    try {
                        agentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_NAME_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 4) {
                    try {
                        categories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                    }
                }
                if (__list.getSize() > 5) {
                    try {
                        colorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 6) {
                    try {
                        culturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 7) {
                    date = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 8) {
                    description = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 9) {
                    gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                }
                if (__list.getSize() > 10) {
                    hidden = org.thryft.Optionals.of(iprot.readBool());
                }
                if (__list.getSize() > 11) {
                    image = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.Image.readAsStruct(iprot));
                }
                if (__list.getSize() > 12) {
                    try {
                        locationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 13) {
                    try {
                        materialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 14) {
                    try {
                        relationTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 15) {
                    try {
                        structureTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final String value;
                                        value = iprot.readString();
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 16) {
                    try {
                        subjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 17) {
                    try {
                        techniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 18) {
                    try {
                        url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
                }
                if (__list.getSize() > 19) {
                    try {
                        workTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, e.getCause());
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
                    case "collection_id": {
                        try {
                            collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                        }
                        break;
                    }
                    case "institution_id": {
                        try {
                            institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                        }
                        break;
                    }
                    case "title": {
                        title = iprot.readString();
                        break;
                    }
                    case "agent_name_texts": {
                        try {
                            agentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_NAME_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "categories": {
                        try {
                            categories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                        }
                        break;
                    }
                    case "color_texts": {
                        try {
                            colorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "cultural_context_texts": {
                        try {
                            culturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "date": {
                        date = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "description": {
                        description = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "gender": {
                        gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                        break;
                    }
                    case "hidden": {
                        hidden = org.thryft.Optionals.of(iprot.readBool());
                        break;
                    }
                    case "image": {
                        image = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.Image.readAsStruct(iprot, unknownFieldCallback));
                        break;
                    }
                    case "location_name_texts": {
                        try {
                            locationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "material_texts": {
                        try {
                            materialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "relation_texts": {
                        try {
                            relationTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "structure_texts": {
                        try {
                            structureTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final String value;
                                            value = iprot.readString();
                                            map.put(key, value);
                                        }
                                        iprot.readMapEnd();
                                        return map.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "subject_term_texts": {
                        try {
                            subjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "technique_texts": {
                        try {
                            techniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "url": {
                        try {
                            url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
                        break;
                    }
                    case "work_type_texts": {
                        try {
                            workTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
            case COLLECTION_ID: setCollectionId((org.dressdiscover.api.models.collection.CollectionId)value); return this;
            case INSTITUTION_ID: setInstitutionId((org.dressdiscover.api.models.institution.InstitutionId)value); return this;
            case TITLE: setTitle((String)value); return this;
            case AGENT_NAME_TEXTS: setAgentNameTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            case CATEGORIES: setCategories((com.google.common.collect.ImmutableList<String>)value); return this;
            case COLOR_TEXTS: setColorTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            case CULTURAL_CONTEXT_TEXTS: setCulturalContextTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            case DATE: setDate((String)value); return this;
            case DESCRIPTION: setDescription((String)value); return this;
            case GENDER: setGender((org.dressdiscover.api.vocabularies.costume_core.gender.Gender)value); return this;
            case HIDDEN: setHidden((Boolean)value); return this;
            case IMAGE: setImage((org.dressdiscover.api.models.image.Image)value); return this;
            case LOCATION_NAME_TEXTS: setLocationNameTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            case MATERIAL_TEXTS: setMaterialTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            case RELATION_TEXTS: setRelationTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            case STRUCTURE_TEXTS: setStructureTexts((com.google.common.collect.ImmutableMap<String, String>)value); return this;
            case SUBJECT_TERM_TEXTS: setSubjectTermTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            case TECHNIQUE_TEXTS: setTechniqueTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            case URL: setUrl((org.thryft.native_.Url)value); return this;
            case WORK_TYPE_TEXTS: setWorkTypeTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) {
            UncheckedValidator.validateAgentNameTexts(agentNameTexts);
            this.agentNameTexts = agentNameTexts;
            return this;
        }

        public Builder setAgentNameTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> agentNameTexts) {
            return setAgentNameTexts(com.google.common.base.Optional.fromNullable(agentNameTexts));
        }

        public Builder setCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
            UncheckedValidator.validateCategories(categories);
            this.categories = categories;
            return this;
        }

        public Builder setCategories(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> categories) {
            return setCategories(com.google.common.base.Optional.fromNullable(categories));
        }

        public Builder setCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
            UncheckedValidator.validateCollectionId(collectionId);
            this.collectionId = collectionId;
            return this;
        }

        public Builder setColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) {
            UncheckedValidator.validateColorTexts(colorTexts);
            this.colorTexts = colorTexts;
            return this;
        }

        public Builder setColorTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> colorTexts) {
            return setColorTexts(com.google.common.base.Optional.fromNullable(colorTexts));
        }

        public Builder setCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) {
            UncheckedValidator.validateCulturalContextTexts(culturalContextTexts);
            this.culturalContextTexts = culturalContextTexts;
            return this;
        }

        public Builder setCulturalContextTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> culturalContextTexts) {
            return setCulturalContextTexts(com.google.common.base.Optional.fromNullable(culturalContextTexts));
        }

        public Builder setDate(final com.google.common.base.Optional<String> date) {
            UncheckedValidator.validateDate(date);
            this.date = date;
            return this;
        }

        public Builder setDate(final @javax.annotation.Nullable String date) {
            return setDate(com.google.common.base.Optional.fromNullable(date));
        }

        public Builder setDescription(final com.google.common.base.Optional<String> description) {
            UncheckedValidator.validateDescription(description);
            this.description = description;
            return this;
        }

        public Builder setDescription(final @javax.annotation.Nullable String description) {
            return setDescription(com.google.common.base.Optional.fromNullable(description));
        }

        public Builder setGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) {
            UncheckedValidator.validateGender(gender);
            this.gender = gender;
            return this;
        }

        public Builder setGender(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.gender.Gender gender) {
            return setGender(com.google.common.base.Optional.fromNullable(gender));
        }

        public Builder setHidden(final com.google.common.base.Optional<Boolean> hidden) {
            UncheckedValidator.validateHidden(hidden);
            this.hidden = hidden;
            return this;
        }

        public Builder setHidden(final @javax.annotation.Nullable Boolean hidden) {
            return setHidden(org.thryft.Optionals.fromNullable(hidden));
        }

        public Builder setHidden(final boolean hidden) {
            return setHidden(org.thryft.Optionals.of(hidden));
        }

        public Builder setIfPresent(final ObjectSummary other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCollectionId(other.getCollectionId());
            setInstitutionId(other.getInstitutionId());
            setTitle(other.getTitle());
            if (other.getAgentNameTexts().isPresent()) {
                setAgentNameTexts(other.getAgentNameTexts());
            }
            if (other.getCategories().isPresent()) {
                setCategories(other.getCategories());
            }
            if (other.getColorTexts().isPresent()) {
                setColorTexts(other.getColorTexts());
            }
            if (other.getCulturalContextTexts().isPresent()) {
                setCulturalContextTexts(other.getCulturalContextTexts());
            }
            if (other.getDate().isPresent()) {
                setDate(other.getDate());
            }
            if (other.getDescription().isPresent()) {
                setDescription(other.getDescription());
            }
            if (other.getGender().isPresent()) {
                setGender(other.getGender());
            }
            if (other.getHidden().isPresent()) {
                setHidden(other.getHidden());
            }
            if (other.getImage().isPresent()) {
                setImage(other.getImage());
            }
            if (other.getLocationNameTexts().isPresent()) {
                setLocationNameTexts(other.getLocationNameTexts());
            }
            if (other.getMaterialTexts().isPresent()) {
                setMaterialTexts(other.getMaterialTexts());
            }
            if (other.getRelationTexts().isPresent()) {
                setRelationTexts(other.getRelationTexts());
            }
            if (other.getStructureTexts().isPresent()) {
                setStructureTexts(other.getStructureTexts());
            }
            if (other.getSubjectTermTexts().isPresent()) {
                setSubjectTermTexts(other.getSubjectTermTexts());
            }
            if (other.getTechniqueTexts().isPresent()) {
                setTechniqueTexts(other.getTechniqueTexts());
            }
            if (other.getUrl().isPresent()) {
                setUrl(other.getUrl());
            }
            if (other.getWorkTypeTexts().isPresent()) {
                setWorkTypeTexts(other.getWorkTypeTexts());
            }

            return this;
        }

        public Builder setImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) {
            UncheckedValidator.validateImage(image);
            this.image = image;
            return this;
        }

        public Builder setImage(final @javax.annotation.Nullable org.dressdiscover.api.models.image.Image image) {
            return setImage(com.google.common.base.Optional.fromNullable(image));
        }

        public Builder setInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
            UncheckedValidator.validateInstitutionId(institutionId);
            this.institutionId = institutionId;
            return this;
        }

        public Builder setLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) {
            UncheckedValidator.validateLocationNameTexts(locationNameTexts);
            this.locationNameTexts = locationNameTexts;
            return this;
        }

        public Builder setLocationNameTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> locationNameTexts) {
            return setLocationNameTexts(com.google.common.base.Optional.fromNullable(locationNameTexts));
        }

        public Builder setMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) {
            UncheckedValidator.validateMaterialTexts(materialTexts);
            this.materialTexts = materialTexts;
            return this;
        }

        public Builder setMaterialTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> materialTexts) {
            return setMaterialTexts(com.google.common.base.Optional.fromNullable(materialTexts));
        }

        public Builder setRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) {
            UncheckedValidator.validateRelationTexts(relationTexts);
            this.relationTexts = relationTexts;
            return this;
        }

        public Builder setRelationTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> relationTexts) {
            return setRelationTexts(com.google.common.base.Optional.fromNullable(relationTexts));
        }

        public Builder setStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) {
            UncheckedValidator.validateStructureTexts(structureTexts);
            this.structureTexts = structureTexts;
            return this;
        }

        public Builder setStructureTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableMap<String, String> structureTexts) {
            return setStructureTexts(com.google.common.base.Optional.fromNullable(structureTexts));
        }

        public Builder setSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) {
            UncheckedValidator.validateSubjectTermTexts(subjectTermTexts);
            this.subjectTermTexts = subjectTermTexts;
            return this;
        }

        public Builder setSubjectTermTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> subjectTermTexts) {
            return setSubjectTermTexts(com.google.common.base.Optional.fromNullable(subjectTermTexts));
        }

        public Builder setTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) {
            UncheckedValidator.validateTechniqueTexts(techniqueTexts);
            this.techniqueTexts = techniqueTexts;
            return this;
        }

        public Builder setTechniqueTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> techniqueTexts) {
            return setTechniqueTexts(com.google.common.base.Optional.fromNullable(techniqueTexts));
        }

        public Builder setTitle(final String title) {
            UncheckedValidator.validateTitle(title);
            this.title = title;
            return this;
        }

        public Builder setUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            UncheckedValidator.validateUrl(url);
            this.url = url;
            return this;
        }

        public Builder setUrl(final @javax.annotation.Nullable org.thryft.native_.Url url) {
            return setUrl(com.google.common.base.Optional.fromNullable(url));
        }

        public Builder setWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
            UncheckedValidator.validateWorkTypeTexts(workTypeTexts);
            this.workTypeTexts = workTypeTexts;
            return this;
        }

        public Builder setWorkTypeTexts(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> workTypeTexts) {
            return setWorkTypeTexts(com.google.common.base.Optional.fromNullable(workTypeTexts));
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
            case COLLECTION_ID: return unsetCollectionId();
            case INSTITUTION_ID: return unsetInstitutionId();
            case TITLE: return unsetTitle();
            case AGENT_NAME_TEXTS: return unsetAgentNameTexts();
            case CATEGORIES: return unsetCategories();
            case COLOR_TEXTS: return unsetColorTexts();
            case CULTURAL_CONTEXT_TEXTS: return unsetCulturalContextTexts();
            case DATE: return unsetDate();
            case DESCRIPTION: return unsetDescription();
            case GENDER: return unsetGender();
            case HIDDEN: return unsetHidden();
            case IMAGE: return unsetImage();
            case LOCATION_NAME_TEXTS: return unsetLocationNameTexts();
            case MATERIAL_TEXTS: return unsetMaterialTexts();
            case RELATION_TEXTS: return unsetRelationTexts();
            case STRUCTURE_TEXTS: return unsetStructureTexts();
            case SUBJECT_TERM_TEXTS: return unsetSubjectTermTexts();
            case TECHNIQUE_TEXTS: return unsetTechniqueTexts();
            case URL: return unsetUrl();
            case WORK_TYPE_TEXTS: return unsetWorkTypeTexts();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetAgentNameTexts() {
            this.agentNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetCategories() {
            this.categories = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetCollectionId() {
            this.collectionId = null;
            return this;
        }

        public Builder unsetColorTexts() {
            this.colorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetCulturalContextTexts() {
            this.culturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetDate() {
            this.date = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetDescription() {
            this.description = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetGender() {
            this.gender = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent();
            return this;
        }

        public Builder unsetHidden() {
            this.hidden = com.google.common.base.Optional.<Boolean> absent();
            return this;
        }

        public Builder unsetImage() {
            this.image = com.google.common.base.Optional.<org.dressdiscover.api.models.image.Image> absent();
            return this;
        }

        public Builder unsetInstitutionId() {
            this.institutionId = null;
            return this;
        }

        public Builder unsetLocationNameTexts() {
            this.locationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetMaterialTexts() {
            this.materialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetRelationTexts() {
            this.relationTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetStructureTexts() {
            this.structureTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();
            return this;
        }

        public Builder unsetSubjectTermTexts() {
            this.subjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetTechniqueTexts() {
            this.techniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetTitle() {
            this.title = null;
            return this;
        }

        public Builder unsetUrl() {
            this.url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
            return this;
        }

        public Builder unsetWorkTypeTexts() {
            this.workTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        private @javax.annotation.Nullable org.dressdiscover.api.models.collection.CollectionId collectionId;
        private @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId institutionId;
        /**
         * Dublin Core title
         */
        private @javax.annotation.Nullable String title;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts;
        /**
         * Dublin Core date
         */
        private com.google.common.base.Optional<String> date;
        /**
         * Dublin Core description
         */
        private com.google.common.base.Optional<String> description;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender;
        private com.google.common.base.Optional<Boolean> hidden;
        private com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts;
        private com.google.common.base.Optional<org.thryft.native_.Url> url;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ObjectSummary> {
        @Override
        public ObjectSummary readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return ObjectSummary.readAs(iprot, type);
        }

        @Override
        public ObjectSummary readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectSummary.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public ObjectSummary readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectSummary.readAsList(iprot);
        }

        @Override
        public ObjectSummary readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectSummary.readAsStruct(iprot);
        }

        @Override
        public ObjectSummary readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectSummary.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.collection.CollectionId>() {}, true, (short)0, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, true, (short)0, "institution_id", org.thryft.protocol.Type.STRING),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "title", org.thryft.protocol.Type.STRING),
        AGENT_NAME_TEXTS("agentNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "agent_name_texts", org.thryft.protocol.Type.LIST),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "categories", org.thryft.protocol.Type.LIST),
        COLOR_TEXTS("colorTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "color_texts", org.thryft.protocol.Type.LIST),
        CULTURAL_CONTEXT_TEXTS("culturalContextTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "cultural_context_texts", org.thryft.protocol.Type.LIST),
        DATE("date", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "date", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "description", org.thryft.protocol.Type.STRING),
        GENDER("gender", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>() {}, false, (short)0, "gender", org.thryft.protocol.Type.STRING),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)0, "hidden", org.thryft.protocol.Type.BOOL),
        IMAGE("image", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.image.Image>() {}, false, (short)0, "image", org.thryft.protocol.Type.STRUCT),
        LOCATION_NAME_TEXTS("locationNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "location_name_texts", org.thryft.protocol.Type.LIST),
        MATERIAL_TEXTS("materialTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "material_texts", org.thryft.protocol.Type.LIST),
        RELATION_TEXTS("relationTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "relation_texts", org.thryft.protocol.Type.LIST),
        STRUCTURE_TEXTS("structureTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, String>>() {}, false, (short)0, "structure_texts", org.thryft.protocol.Type.MAP),
        SUBJECT_TERM_TEXTS("subjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "subject_term_texts", org.thryft.protocol.Type.LIST),
        TECHNIQUE_TEXTS("techniqueTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "technique_texts", org.thryft.protocol.Type.LIST),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, (short)0, "url", org.thryft.protocol.Type.STRING),
        WORK_TYPE_TEXTS("workTypeTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "work_type_texts", org.thryft.protocol.Type.LIST);

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
            case "collectionId": return COLLECTION_ID;
            case "institutionId": return INSTITUTION_ID;
            case "title": return TITLE;
            case "agentNameTexts": return AGENT_NAME_TEXTS;
            case "categories": return CATEGORIES;
            case "colorTexts": return COLOR_TEXTS;
            case "culturalContextTexts": return CULTURAL_CONTEXT_TEXTS;
            case "date": return DATE;
            case "description": return DESCRIPTION;
            case "gender": return GENDER;
            case "hidden": return HIDDEN;
            case "image": return IMAGE;
            case "locationNameTexts": return LOCATION_NAME_TEXTS;
            case "materialTexts": return MATERIAL_TEXTS;
            case "relationTexts": return RELATION_TEXTS;
            case "structureTexts": return STRUCTURE_TEXTS;
            case "subjectTermTexts": return SUBJECT_TERM_TEXTS;
            case "techniqueTexts": return TECHNIQUE_TEXTS;
            case "url": return URL;
            case "workTypeTexts": return WORK_TYPE_TEXTS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "collection_id": return COLLECTION_ID;
            case "institution_id": return INSTITUTION_ID;
            case "title": return TITLE;
            case "agent_name_texts": return AGENT_NAME_TEXTS;
            case "categories": return CATEGORIES;
            case "color_texts": return COLOR_TEXTS;
            case "cultural_context_texts": return CULTURAL_CONTEXT_TEXTS;
            case "date": return DATE;
            case "description": return DESCRIPTION;
            case "gender": return GENDER;
            case "hidden": return HIDDEN;
            case "image": return IMAGE;
            case "location_name_texts": return LOCATION_NAME_TEXTS;
            case "material_texts": return MATERIAL_TEXTS;
            case "relation_texts": return RELATION_TEXTS;
            case "structure_texts": return STRUCTURE_TEXTS;
            case "subject_term_texts": return SUBJECT_TERM_TEXTS;
            case "technique_texts": return TECHNIQUE_TEXTS;
            case "url": return URL;
            case "work_type_texts": return WORK_TYPE_TEXTS;
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
        public static void validate(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) throws org.thryft.protocol.InputProtocolException {
            validateCollectionId(collectionId);
            validateInstitutionId(institutionId);
            validateTitle(title);
            validateAgentNameTexts(agentNameTexts);
            validateCategories(categories);
            validateColorTexts(colorTexts);
            validateCulturalContextTexts(culturalContextTexts);
            validateDate(date);
            validateDescription(description);
            validateGender(gender);
            validateHidden(hidden);
            validateImage(image);
            validateLocationNameTexts(locationNameTexts);
            validateMaterialTexts(materialTexts);
            validateRelationTexts(relationTexts);
            validateStructureTexts(structureTexts);
            validateSubjectTermTexts(subjectTermTexts);
            validateTechniqueTexts(techniqueTexts);
            validateUrl(url);
            validateWorkTypeTexts(workTypeTexts);
        }

        public static void validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.thryft.protocol.InputProtocolException {
            if (collectionId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLLECTION_ID, "org.dressdiscover.api.models.object.ObjectSummary: collectionId is null");
            }
        }

        public static void validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.thryft.protocol.InputProtocolException {
            if (institutionId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, "org.dressdiscover.api.models.object.ObjectSummary: institutionId is null");
            }
        }

        public static void validateTitle(final String title) throws org.thryft.protocol.InputProtocolException {
            if (title == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.models.object.ObjectSummary: title is null");
            }
            if (title.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.models.object.ObjectSummary.title: less than min length 1");
            }
        }

        public static void validateAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) throws org.thryft.protocol.InputProtocolException {
            if (agentNameTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.AGENT_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: agentNameTexts is null");
            }
            if (!agentNameTexts.isPresent()) {
                return;
            }
            if (agentNameTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary.agentNameTexts: less than min length 1");
            }
        }

        public static void validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) throws org.thryft.protocol.InputProtocolException {
            if (categories == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CATEGORIES, "org.dressdiscover.api.models.object.ObjectSummary: categories is null");
            }
            if (!categories.isPresent()) {
                return;
            }
            if (categories.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, "org.dressdiscover.api.models.object.ObjectSummary.categories: less than min length 1");
            }
        }

        public static void validateColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) throws org.thryft.protocol.InputProtocolException {
            if (colorTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: colorTexts is null");
            }
            if (!colorTexts.isPresent()) {
                return;
            }
            if (colorTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary.colorTexts: less than min length 1");
            }
        }

        public static void validateCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) throws org.thryft.protocol.InputProtocolException {
            if (culturalContextTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: culturalContextTexts is null");
            }
            if (!culturalContextTexts.isPresent()) {
                return;
            }
            if (culturalContextTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary.culturalContextTexts: less than min length 1");
            }
        }

        public static void validateDate(final com.google.common.base.Optional<String> date) throws org.thryft.protocol.InputProtocolException {
            if (date == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DATE, "org.dressdiscover.api.models.object.ObjectSummary: date is null");
            }
            if (!date.isPresent()) {
                return;
            }
            if (date.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE, "org.dressdiscover.api.models.object.ObjectSummary.date: less than min length 1");
            }
        }

        public static void validateDescription(final com.google.common.base.Optional<String> description) throws org.thryft.protocol.InputProtocolException {
            if (description == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DESCRIPTION, "org.dressdiscover.api.models.object.ObjectSummary: description is null");
            }
            if (!description.isPresent()) {
                return;
            }
            if (description.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION, "org.dressdiscover.api.models.object.ObjectSummary.description: less than min length 1");
            }
        }

        public static void validateGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) throws org.thryft.protocol.InputProtocolException {
            if (gender == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GENDER, "org.dressdiscover.api.models.object.ObjectSummary: gender is null");
            }
            if (!gender.isPresent()) {
                return;
            }
        }

        public static void validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws org.thryft.protocol.InputProtocolException {
            if (hidden == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HIDDEN, "org.dressdiscover.api.models.object.ObjectSummary: hidden is null");
            }
            if (!hidden.isPresent()) {
                return;
            }
            if (!hidden.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HIDDEN, "org.dressdiscover.api.models.object.ObjectSummary.hidden: not true");
            }
        }

        public static void validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) throws org.thryft.protocol.InputProtocolException {
            if (image == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IMAGE, "org.dressdiscover.api.models.object.ObjectSummary: image is null");
            }
            if (!image.isPresent()) {
                return;
            }
        }

        public static void validateLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) throws org.thryft.protocol.InputProtocolException {
            if (locationNameTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: locationNameTexts is null");
            }
            if (!locationNameTexts.isPresent()) {
                return;
            }
            if (locationNameTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary.locationNameTexts: less than min length 1");
            }
        }

        public static void validateMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) throws org.thryft.protocol.InputProtocolException {
            if (materialTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: materialTexts is null");
            }
            if (!materialTexts.isPresent()) {
                return;
            }
            if (materialTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary.materialTexts: less than min length 1");
            }
        }

        public static void validateRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) throws org.thryft.protocol.InputProtocolException {
            if (relationTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RELATION_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: relationTexts is null");
            }
            if (!relationTexts.isPresent()) {
                return;
            }
            if (relationTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary.relationTexts: less than min length 1");
            }
        }

        public static void validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) throws org.thryft.protocol.InputProtocolException {
            if (structureTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: structureTexts is null");
            }
            if (!structureTexts.isPresent()) {
                return;
            }
            if (structureTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary.structureTexts: less than min length 1");
            }
        }

        public static void validateSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) throws org.thryft.protocol.InputProtocolException {
            if (subjectTermTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: subjectTermTexts is null");
            }
            if (!subjectTermTexts.isPresent()) {
                return;
            }
            if (subjectTermTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary.subjectTermTexts: less than min length 1");
            }
        }

        public static void validateTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) throws org.thryft.protocol.InputProtocolException {
            if (techniqueTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: techniqueTexts is null");
            }
            if (!techniqueTexts.isPresent()) {
                return;
            }
            if (techniqueTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary.techniqueTexts: less than min length 1");
            }
        }

        public static void validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) throws org.thryft.protocol.InputProtocolException {
            if (url == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.URL, "org.dressdiscover.api.models.object.ObjectSummary: url is null");
            }
            if (!url.isPresent()) {
                return;
            }
        }

        public static void validateWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) throws org.thryft.protocol.InputProtocolException {
            if (workTypeTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: workTypeTexts is null");
            }
            if (!workTypeTexts.isPresent()) {
                return;
            }
            if (workTypeTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary.workTypeTexts: less than min length 1");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
            validateCollectionId(collectionId);
            validateInstitutionId(institutionId);
            validateTitle(title);
            validateAgentNameTexts(agentNameTexts);
            validateCategories(categories);
            validateColorTexts(colorTexts);
            validateCulturalContextTexts(culturalContextTexts);
            validateDate(date);
            validateDescription(description);
            validateGender(gender);
            validateHidden(hidden);
            validateImage(image);
            validateLocationNameTexts(locationNameTexts);
            validateMaterialTexts(materialTexts);
            validateRelationTexts(relationTexts);
            validateStructureTexts(structureTexts);
            validateSubjectTermTexts(subjectTermTexts);
            validateTechniqueTexts(techniqueTexts);
            validateUrl(url);
            validateWorkTypeTexts(workTypeTexts);
        }

        public static void validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
            if (collectionId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: collectionId is null");
            }
        }

        public static void validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
            if (institutionId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: institutionId is null");
            }
        }

        public static void validateTitle(final String title) {
            if (title == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: title is null");
            }
            if (title.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.title: less than min length 1");
            }
        }

        public static void validateAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) {
            if (agentNameTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: agentNameTexts is null");
            }
            if (!agentNameTexts.isPresent()) {
                return;
            }
            if (agentNameTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.agentNameTexts: less than min length 1");
            }
        }

        public static void validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
            if (categories == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: categories is null");
            }
            if (!categories.isPresent()) {
                return;
            }
            if (categories.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.categories: less than min length 1");
            }
        }

        public static void validateColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) {
            if (colorTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: colorTexts is null");
            }
            if (!colorTexts.isPresent()) {
                return;
            }
            if (colorTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.colorTexts: less than min length 1");
            }
        }

        public static void validateCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) {
            if (culturalContextTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: culturalContextTexts is null");
            }
            if (!culturalContextTexts.isPresent()) {
                return;
            }
            if (culturalContextTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.culturalContextTexts: less than min length 1");
            }
        }

        public static void validateDate(final com.google.common.base.Optional<String> date) {
            if (date == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: date is null");
            }
            if (!date.isPresent()) {
                return;
            }
            if (date.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.date: less than min length 1");
            }
        }

        public static void validateDescription(final com.google.common.base.Optional<String> description) {
            if (description == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: description is null");
            }
            if (!description.isPresent()) {
                return;
            }
            if (description.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.description: less than min length 1");
            }
        }

        public static void validateGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) {
            if (gender == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: gender is null");
            }
            if (!gender.isPresent()) {
                return;
            }
        }

        public static void validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            if (hidden == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: hidden is null");
            }
            if (!hidden.isPresent()) {
                return;
            }
            if (!hidden.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.hidden: not true");
            }
        }

        public static void validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) {
            if (image == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: image is null");
            }
            if (!image.isPresent()) {
                return;
            }
        }

        public static void validateLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) {
            if (locationNameTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: locationNameTexts is null");
            }
            if (!locationNameTexts.isPresent()) {
                return;
            }
            if (locationNameTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.locationNameTexts: less than min length 1");
            }
        }

        public static void validateMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) {
            if (materialTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: materialTexts is null");
            }
            if (!materialTexts.isPresent()) {
                return;
            }
            if (materialTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.materialTexts: less than min length 1");
            }
        }

        public static void validateRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) {
            if (relationTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: relationTexts is null");
            }
            if (!relationTexts.isPresent()) {
                return;
            }
            if (relationTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.relationTexts: less than min length 1");
            }
        }

        public static void validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) {
            if (structureTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: structureTexts is null");
            }
            if (!structureTexts.isPresent()) {
                return;
            }
            if (structureTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.structureTexts: less than min length 1");
            }
        }

        public static void validateSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) {
            if (subjectTermTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: subjectTermTexts is null");
            }
            if (!subjectTermTexts.isPresent()) {
                return;
            }
            if (subjectTermTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.subjectTermTexts: less than min length 1");
            }
        }

        public static void validateTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) {
            if (techniqueTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: techniqueTexts is null");
            }
            if (!techniqueTexts.isPresent()) {
                return;
            }
            if (techniqueTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.techniqueTexts: less than min length 1");
            }
        }

        public static void validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            if (url == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: url is null");
            }
            if (!url.isPresent()) {
                return;
            }
        }

        public static void validateWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
            if (workTypeTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: workTypeTexts is null");
            }
            if (!workTypeTexts.isPresent()) {
                return;
            }
            if (workTypeTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary.workTypeTexts: less than min length 1");
            }
        }
    }

    /**
     * Copy constructor
     */
    public ObjectSummary(final ObjectSummary other) {
        this(other.getCollectionId(), other.getInstitutionId(), other.getTitle(), other.getAgentNameTexts(), other.getCategories(), other.getColorTexts(), other.getCulturalContextTexts(), other.getDate(), other.getDescription(), other.getGender(), other.getHidden(), other.getImage(), other.getLocationNameTexts(), other.getMaterialTexts(), other.getRelationTexts(), other.getStructureTexts(), other.getSubjectTermTexts(), other.getTechniqueTexts(), other.getUrl(), other.getWorkTypeTexts());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected ObjectSummary(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
        this.collectionId = collectionId;
        this.institutionId = institutionId;
        this.title = title;
        this.agentNameTexts = agentNameTexts;
        this.categories = categories;
        this.colorTexts = colorTexts;
        this.culturalContextTexts = culturalContextTexts;
        this.date = date;
        this.description = description;
        this.gender = gender;
        this.hidden = hidden;
        this.image = image;
        this.locationNameTexts = locationNameTexts;
        this.materialTexts = materialTexts;
        this.relationTexts = relationTexts;
        this.structureTexts = structureTexts;
        this.subjectTermTexts = subjectTermTexts;
        this.techniqueTexts = techniqueTexts;
        this.url = url;
        this.workTypeTexts = workTypeTexts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final ObjectSummary other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<ObjectSummary> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static ObjectSummary create(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title) {
        UncheckedValidator.validate(collectionId, institutionId, title, com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent(), com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.image.Image> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<org.thryft.native_.Url> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent());
        return new ObjectSummary(collectionId, institutionId, title, com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent(), com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.image.Image> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<org.thryft.native_.Url> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static ObjectSummary create(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> agentNameTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> categories, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> colorTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> culturalContextTexts, @javax.annotation.Nullable final String date, @javax.annotation.Nullable final String description, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.costume_core.gender.Gender gender, @javax.annotation.Nullable final Boolean hidden, @javax.annotation.Nullable final org.dressdiscover.api.models.image.Image image, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> locationNameTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> materialTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> relationTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, String> structureTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> subjectTermTexts, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> techniqueTexts, @javax.annotation.Nullable final org.thryft.native_.Url url, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> workTypeTexts) {
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTextsOptional = com.google.common.base.Optional.fromNullable(agentNameTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categoriesOptional = com.google.common.base.Optional.fromNullable(categories);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTextsOptional = com.google.common.base.Optional.fromNullable(colorTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTextsOptional = com.google.common.base.Optional.fromNullable(culturalContextTexts);
        final com.google.common.base.Optional<String> dateOptional = com.google.common.base.Optional.fromNullable(date);
        final com.google.common.base.Optional<String> descriptionOptional = com.google.common.base.Optional.fromNullable(description);
        final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> genderOptional = com.google.common.base.Optional.fromNullable(gender);
        final com.google.common.base.Optional<Boolean> hiddenOptional = org.thryft.Optionals.fromNullable(hidden);
        final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> imageOptional = com.google.common.base.Optional.fromNullable(image);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTextsOptional = com.google.common.base.Optional.fromNullable(locationNameTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTextsOptional = com.google.common.base.Optional.fromNullable(materialTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTextsOptional = com.google.common.base.Optional.fromNullable(relationTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTextsOptional = com.google.common.base.Optional.fromNullable(structureTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTextsOptional = com.google.common.base.Optional.fromNullable(subjectTermTexts);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTextsOptional = com.google.common.base.Optional.fromNullable(techniqueTexts);
        final com.google.common.base.Optional<org.thryft.native_.Url> urlOptional = com.google.common.base.Optional.fromNullable(url);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTextsOptional = com.google.common.base.Optional.fromNullable(workTypeTexts);
        UncheckedValidator.validate(collectionId, institutionId, title, agentNameTextsOptional, categoriesOptional, colorTextsOptional, culturalContextTextsOptional, dateOptional, descriptionOptional, genderOptional, hiddenOptional, imageOptional, locationNameTextsOptional, materialTextsOptional, relationTextsOptional, structureTextsOptional, subjectTermTextsOptional, techniqueTextsOptional, urlOptional, workTypeTextsOptional);
        return new ObjectSummary(collectionId, institutionId, title, agentNameTextsOptional, categoriesOptional, colorTextsOptional, culturalContextTextsOptional, dateOptional, descriptionOptional, genderOptional, hiddenOptional, imageOptional, locationNameTextsOptional, materialTextsOptional, relationTextsOptional, structureTextsOptional, subjectTermTextsOptional, techniqueTextsOptional, urlOptional, workTypeTextsOptional);
    }

    /**
     * Optional factory method
     */
    public static ObjectSummary create(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
        UncheckedValidator.validate(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);
        return new ObjectSummary(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof ObjectSummary)) {
            return false;
        }

        final ObjectSummary other = (ObjectSummary)otherObject;

        if (!(getCollectionId().equals(other.getCollectionId()))) {
            return false;
        }

        if (!(getInstitutionId().equals(other.getInstitutionId()))) {
            return false;
        }

        if (!(getTitle().equals(other.getTitle()))) {
            return false;
        }

        if (!(((getAgentNameTexts().isPresent() && other.getAgentNameTexts().isPresent()) ? (getAgentNameTexts().get().equals(other.getAgentNameTexts().get())) : (!getAgentNameTexts().isPresent() && !other.getAgentNameTexts().isPresent())))) {
            return false;
        }

        if (!(((getCategories().isPresent() && other.getCategories().isPresent()) ? (getCategories().get().equals(other.getCategories().get())) : (!getCategories().isPresent() && !other.getCategories().isPresent())))) {
            return false;
        }

        if (!(((getColorTexts().isPresent() && other.getColorTexts().isPresent()) ? (getColorTexts().get().equals(other.getColorTexts().get())) : (!getColorTexts().isPresent() && !other.getColorTexts().isPresent())))) {
            return false;
        }

        if (!(((getCulturalContextTexts().isPresent() && other.getCulturalContextTexts().isPresent()) ? (getCulturalContextTexts().get().equals(other.getCulturalContextTexts().get())) : (!getCulturalContextTexts().isPresent() && !other.getCulturalContextTexts().isPresent())))) {
            return false;
        }

        if (!(((getDate().isPresent() && other.getDate().isPresent()) ? (getDate().get().equals(other.getDate().get())) : (!getDate().isPresent() && !other.getDate().isPresent())))) {
            return false;
        }

        if (!(((getDescription().isPresent() && other.getDescription().isPresent()) ? (getDescription().get().equals(other.getDescription().get())) : (!getDescription().isPresent() && !other.getDescription().isPresent())))) {
            return false;
        }

        if (!(((getGender().isPresent() && other.getGender().isPresent()) ? (getGender().get().equals(other.getGender().get())) : (!getGender().isPresent() && !other.getGender().isPresent())))) {
            return false;
        }

        if (!(((getHidden().isPresent() && other.getHidden().isPresent()) ? (getHidden().get().booleanValue() == other.getHidden().get().booleanValue()) : (!getHidden().isPresent() && !other.getHidden().isPresent())))) {
            return false;
        }

        if (!(((getImage().isPresent() && other.getImage().isPresent()) ? (getImage().get().equals(other.getImage().get())) : (!getImage().isPresent() && !other.getImage().isPresent())))) {
            return false;
        }

        if (!(((getLocationNameTexts().isPresent() && other.getLocationNameTexts().isPresent()) ? (getLocationNameTexts().get().equals(other.getLocationNameTexts().get())) : (!getLocationNameTexts().isPresent() && !other.getLocationNameTexts().isPresent())))) {
            return false;
        }

        if (!(((getMaterialTexts().isPresent() && other.getMaterialTexts().isPresent()) ? (getMaterialTexts().get().equals(other.getMaterialTexts().get())) : (!getMaterialTexts().isPresent() && !other.getMaterialTexts().isPresent())))) {
            return false;
        }

        if (!(((getRelationTexts().isPresent() && other.getRelationTexts().isPresent()) ? (getRelationTexts().get().equals(other.getRelationTexts().get())) : (!getRelationTexts().isPresent() && !other.getRelationTexts().isPresent())))) {
            return false;
        }

        if (!(((getStructureTexts().isPresent() && other.getStructureTexts().isPresent()) ? (getStructureTexts().get().equals(other.getStructureTexts().get())) : (!getStructureTexts().isPresent() && !other.getStructureTexts().isPresent())))) {
            return false;
        }

        if (!(((getSubjectTermTexts().isPresent() && other.getSubjectTermTexts().isPresent()) ? (getSubjectTermTexts().get().equals(other.getSubjectTermTexts().get())) : (!getSubjectTermTexts().isPresent() && !other.getSubjectTermTexts().isPresent())))) {
            return false;
        }

        if (!(((getTechniqueTexts().isPresent() && other.getTechniqueTexts().isPresent()) ? (getTechniqueTexts().get().equals(other.getTechniqueTexts().get())) : (!getTechniqueTexts().isPresent() && !other.getTechniqueTexts().isPresent())))) {
            return false;
        }

        if (!(((getUrl().isPresent() && other.getUrl().isPresent()) ? (getUrl().get().equals(other.getUrl().get())) : (!getUrl().isPresent() && !other.getUrl().isPresent())))) {
            return false;
        }

        if (!(((getWorkTypeTexts().isPresent() && other.getWorkTypeTexts().isPresent()) ? (getWorkTypeTexts().get().equals(other.getWorkTypeTexts().get())) : (!getWorkTypeTexts().isPresent() && !other.getWorkTypeTexts().isPresent())))) {
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
        case COLLECTION_ID: return getCollectionId();
        case INSTITUTION_ID: return getInstitutionId();
        case TITLE: return getTitle();
        case AGENT_NAME_TEXTS: return getAgentNameTexts();
        case CATEGORIES: return getCategories();
        case COLOR_TEXTS: return getColorTexts();
        case CULTURAL_CONTEXT_TEXTS: return getCulturalContextTexts();
        case DATE: return getDate();
        case DESCRIPTION: return getDescription();
        case GENDER: return getGender();
        case HIDDEN: return getHidden();
        case IMAGE: return getImage();
        case LOCATION_NAME_TEXTS: return getLocationNameTexts();
        case MATERIAL_TEXTS: return getMaterialTexts();
        case RELATION_TEXTS: return getRelationTexts();
        case STRUCTURE_TEXTS: return getStructureTexts();
        case SUBJECT_TERM_TEXTS: return getSubjectTermTexts();
        case TECHNIQUE_TEXTS: return getTechniqueTexts();
        case URL: return getUrl();
        case WORK_TYPE_TEXTS: return getWorkTypeTexts();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAgentNameTexts() {
        return agentNameTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCategories() {
        return categories;
    }

    public final org.dressdiscover.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getColorTexts() {
        return colorTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCulturalContextTexts() {
        return culturalContextTexts;
    }

    /**
     * Dublin Core date
     */
    public final com.google.common.base.Optional<String> getDate() {
        return date;
    }

    /**
     * Dublin Core description
     */
    public final com.google.common.base.Optional<String> getDescription() {
        return description;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> getGender() {
        return gender;
    }

    public final com.google.common.base.Optional<Boolean> getHidden() {
        return hidden;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> getImage() {
        return image;
    }

    public final org.dressdiscover.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getLocationNameTexts() {
        return locationNameTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getMaterialTexts() {
        return materialTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getRelationTexts() {
        return relationTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> getStructureTexts() {
        return structureTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSubjectTermTexts() {
        return subjectTermTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getTechniqueTexts() {
        return techniqueTexts;
    }

    /**
     * Dublin Core title
     */
    public final String getTitle() {
        return title;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
        return url;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getWorkTypeTexts() {
        return workTypeTexts;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCollectionId().hashCode();
        hashCode = 31 * hashCode + getInstitutionId().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getAgentNameTexts().isPresent()) {
            hashCode = 31 * hashCode + getAgentNameTexts().get().hashCode();
        }
        if (getCategories().isPresent()) {
            hashCode = 31 * hashCode + getCategories().get().hashCode();
        }
        if (getColorTexts().isPresent()) {
            hashCode = 31 * hashCode + getColorTexts().get().hashCode();
        }
        if (getCulturalContextTexts().isPresent()) {
            hashCode = 31 * hashCode + getCulturalContextTexts().get().hashCode();
        }
        if (getDate().isPresent()) {
            hashCode = 31 * hashCode + getDate().get().hashCode();
        }
        if (getDescription().isPresent()) {
            hashCode = 31 * hashCode + getDescription().get().hashCode();
        }
        if (getGender().isPresent()) {
            hashCode = 31 * hashCode + getGender().get().ordinal();
        }
        if (getHidden().isPresent()) {
            hashCode = 31 * hashCode + (getHidden().get() ? 1 : 0);
        }
        if (getImage().isPresent()) {
            hashCode = 31 * hashCode + getImage().get().hashCode();
        }
        if (getLocationNameTexts().isPresent()) {
            hashCode = 31 * hashCode + getLocationNameTexts().get().hashCode();
        }
        if (getMaterialTexts().isPresent()) {
            hashCode = 31 * hashCode + getMaterialTexts().get().hashCode();
        }
        if (getRelationTexts().isPresent()) {
            hashCode = 31 * hashCode + getRelationTexts().get().hashCode();
        }
        if (getStructureTexts().isPresent()) {
            hashCode = 31 * hashCode + getStructureTexts().get().hashCode();
        }
        if (getSubjectTermTexts().isPresent()) {
            hashCode = 31 * hashCode + getSubjectTermTexts().get().hashCode();
        }
        if (getTechniqueTexts().isPresent()) {
            hashCode = 31 * hashCode + getTechniqueTexts().get().hashCode();
        }
        if (getUrl().isPresent()) {
            hashCode = 31 * hashCode + getUrl().get().hashCode();
        }
        if (getWorkTypeTexts().isPresent()) {
            hashCode = 31 * hashCode + getWorkTypeTexts().get().hashCode();
        }
        return hashCode;
    }

    public static ObjectSummary readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectSummary readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectSummary readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.collection.CollectionId collectionId;
        org.dressdiscover.api.models.institution.InstitutionId institutionId;
        String title;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<String> date = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image = com.google.common.base.Optional.<org.dressdiscover.api.models.image.Image> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
            } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
            }
            try {
                institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
            } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
            }
            title = iprot.readString();
            if (__list.getSize() > 3) {
                try {
                    agentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_NAME_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 4) {
                try {
                    categories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                }
            }
            if (__list.getSize() > 5) {
                try {
                    colorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 6) {
                try {
                    culturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 7) {
                date = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 8) {
                description = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 9) {
                gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
            }
            if (__list.getSize() > 10) {
                hidden = org.thryft.Optionals.of(iprot.readBool());
            }
            if (__list.getSize() > 11) {
                image = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.Image.readAsStruct(iprot));
            }
            if (__list.getSize() > 12) {
                try {
                    locationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 13) {
                try {
                    materialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 14) {
                try {
                    relationTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 15) {
                try {
                    structureTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final String value;
                                    value = iprot.readString();
                                    map.put(key, value);
                                }
                                iprot.readMapEnd();
                                return map.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 16) {
                try {
                    subjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 17) {
                try {
                    techniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 18) {
                try {
                    url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 19) {
                try {
                    workTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);

        return new ObjectSummary(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);
    }

    public static ObjectSummary readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectSummary readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable org.dressdiscover.api.models.collection.CollectionId collectionId = null;
        @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId institutionId = null;
        @javax.annotation.Nullable String title = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<String> date = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image = com.google.common.base.Optional.<org.dressdiscover.api.models.image.Image> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "collection_id": {
                    try {
                        collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLLECTION_ID, e);
                    }
                    break;
                }
                case "institution_id": {
                    try {
                        institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, e);
                    }
                    break;
                }
                case "title": {
                    title = iprot.readString();
                    break;
                }
                case "agent_name_texts": {
                    try {
                        agentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_NAME_TEXTS, e.getCause());
                    }
                    break;
                }
                case "categories": {
                    try {
                        categories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, e.getCause());
                    }
                    break;
                }
                case "color_texts": {
                    try {
                        colorTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, e.getCause());
                    }
                    break;
                }
                case "cultural_context_texts": {
                    try {
                        culturalContextTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, e.getCause());
                    }
                    break;
                }
                case "date": {
                    date = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "description": {
                    description = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "gender": {
                    gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.Factory.getInstance()));
                    break;
                }
                case "hidden": {
                    hidden = org.thryft.Optionals.of(iprot.readBool());
                    break;
                }
                case "image": {
                    image = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.Image.readAsStruct(iprot, unknownFieldCallback));
                    break;
                }
                case "location_name_texts": {
                    try {
                        locationNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, e.getCause());
                    }
                    break;
                }
                case "material_texts": {
                    try {
                        materialTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, e.getCause());
                    }
                    break;
                }
                case "relation_texts": {
                    try {
                        relationTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_TEXTS, e.getCause());
                    }
                    break;
                }
                case "structure_texts": {
                    try {
                        structureTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, String>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, String> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final String value;
                                        value = iprot.readString();
                                        map.put(key, value);
                                    }
                                    iprot.readMapEnd();
                                    return map.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, e.getCause());
                    }
                    break;
                }
                case "subject_term_texts": {
                    try {
                        subjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, e.getCause());
                    }
                    break;
                }
                case "technique_texts": {
                    try {
                        techniqueTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, e.getCause());
                    }
                    break;
                }
                case "url": {
                    try {
                        url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
                    break;
                }
                case "work_type_texts": {
                    try {
                        workTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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

        ReadValidator.validate(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);

        return new ObjectSummary(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);
    }

    public ObjectSummary replaceAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) {
        UncheckedValidator.validateAgentNameTexts(agentNameTexts);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceAgentNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> agentNameTexts) {
        return replaceAgentNameTexts(com.google.common.base.Optional.fromNullable(agentNameTexts));
    }

    public ObjectSummary replaceCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
        UncheckedValidator.validateCategories(categories);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> categories) {
        return replaceCategories(com.google.common.base.Optional.fromNullable(categories));
    }

    public ObjectSummary replaceCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
        UncheckedValidator.validateCollectionId(collectionId);
        return new ObjectSummary(collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) {
        UncheckedValidator.validateColorTexts(colorTexts);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceColorTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> colorTexts) {
        return replaceColorTexts(com.google.common.base.Optional.fromNullable(colorTexts));
    }

    public ObjectSummary replaceCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) {
        UncheckedValidator.validateCulturalContextTexts(culturalContextTexts);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceCulturalContextTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> culturalContextTexts) {
        return replaceCulturalContextTexts(com.google.common.base.Optional.fromNullable(culturalContextTexts));
    }

    public ObjectSummary replaceDate(final com.google.common.base.Optional<String> date) {
        UncheckedValidator.validateDate(date);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceDate(@javax.annotation.Nullable final String date) {
        return replaceDate(com.google.common.base.Optional.fromNullable(date));
    }

    public ObjectSummary replaceDescription(final com.google.common.base.Optional<String> description) {
        UncheckedValidator.validateDescription(description);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceDescription(@javax.annotation.Nullable final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public ObjectSummary replaceGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) {
        UncheckedValidator.validateGender(gender);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceGender(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.costume_core.gender.Gender gender) {
        return replaceGender(com.google.common.base.Optional.fromNullable(gender));
    }

    public ObjectSummary replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        UncheckedValidator.validateHidden(hidden);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceHidden(@javax.annotation.Nullable final Boolean hidden) {
        return replaceHidden(org.thryft.Optionals.fromNullable(hidden));
    }

    public ObjectSummary replaceHidden(final boolean hidden) {
        return replaceHidden(org.thryft.Optionals.of(hidden));
    }

    public ObjectSummary replaceImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) {
        UncheckedValidator.validateImage(image);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceImage(@javax.annotation.Nullable final org.dressdiscover.api.models.image.Image image) {
        return replaceImage(com.google.common.base.Optional.fromNullable(image));
    }

    public ObjectSummary replaceInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
        UncheckedValidator.validateInstitutionId(institutionId);
        return new ObjectSummary(this.collectionId, institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) {
        UncheckedValidator.validateLocationNameTexts(locationNameTexts);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceLocationNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> locationNameTexts) {
        return replaceLocationNameTexts(com.google.common.base.Optional.fromNullable(locationNameTexts));
    }

    public ObjectSummary replaceMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) {
        UncheckedValidator.validateMaterialTexts(materialTexts);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceMaterialTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> materialTexts) {
        return replaceMaterialTexts(com.google.common.base.Optional.fromNullable(materialTexts));
    }

    public ObjectSummary replaceRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) {
        UncheckedValidator.validateRelationTexts(relationTexts);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceRelationTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> relationTexts) {
        return replaceRelationTexts(com.google.common.base.Optional.fromNullable(relationTexts));
    }

    public ObjectSummary replaceStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) {
        UncheckedValidator.validateStructureTexts(structureTexts);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceStructureTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, String> structureTexts) {
        return replaceStructureTexts(com.google.common.base.Optional.fromNullable(structureTexts));
    }

    public ObjectSummary replaceSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) {
        UncheckedValidator.validateSubjectTermTexts(subjectTermTexts);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceSubjectTermTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> subjectTermTexts) {
        return replaceSubjectTermTexts(com.google.common.base.Optional.fromNullable(subjectTermTexts));
    }

    public ObjectSummary replaceTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) {
        UncheckedValidator.validateTechniqueTexts(techniqueTexts);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceTechniqueTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> techniqueTexts) {
        return replaceTechniqueTexts(com.google.common.base.Optional.fromNullable(techniqueTexts));
    }

    public ObjectSummary replaceTitle(final String title) {
        UncheckedValidator.validateTitle(title);
        return new ObjectSummary(this.collectionId, this.institutionId, title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        UncheckedValidator.validateUrl(url);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, url, this.workTypeTexts);
    }

    public ObjectSummary replaceUrl(@javax.annotation.Nullable final org.thryft.native_.Url url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    public ObjectSummary replaceWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
        UncheckedValidator.validateWorkTypeTexts(workTypeTexts);
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, workTypeTexts);
    }

    public ObjectSummary replaceWorkTypeTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> workTypeTexts) {
        return replaceWorkTypeTexts(com.google.common.base.Optional.fromNullable(workTypeTexts));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("title", getTitle()).add("agent_name_texts", getAgentNameTexts().orNull()).add("categories", getCategories().orNull()).add("color_texts", getColorTexts().orNull()).add("cultural_context_texts", getCulturalContextTexts().orNull()).add("date", getDate().orNull()).add("description", getDescription().orNull()).add("gender", getGender().orNull()).add("hidden", getHidden().orNull()).add("image", getImage().orNull()).add("location_name_texts", getLocationNameTexts().orNull()).add("material_texts", getMaterialTexts().orNull()).add("relation_texts", getRelationTexts().orNull()).add("structure_texts", getStructureTexts().orNull()).add("subject_term_texts", getSubjectTermTexts().orNull()).add("technique_texts", getTechniqueTexts().orNull()).add("url", getUrl().orNull()).add("work_type_texts", getWorkTypeTexts().orNull()).toString();
    }

    public void writeAgentNameTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getAgentNameTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.AGENT_NAME_TEXTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAgentNameTexts().get().size());
            for (final String _iter0 : getAgentNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 20);

        oprot.writeString(getCollectionId().toString());

        oprot.writeString(getInstitutionId().toString());

        oprot.writeString(getTitle());

        if (getAgentNameTexts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAgentNameTexts().get().size());
            for (final String _iter0 : getAgentNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getCategories().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCategories().get().size());
            for (final String _iter0 : getCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getColorTexts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getColorTexts().get().size());
            for (final String _iter0 : getColorTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getCulturalContextTexts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCulturalContextTexts().get().size());
            for (final String _iter0 : getCulturalContextTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getDate().isPresent()) {
            oprot.writeString(getDate().get());
        } else {
            oprot.writeNull();
        }

        if (getDescription().isPresent()) {
            oprot.writeString(getDescription().get());
        } else {
            oprot.writeNull();
        }

        if (getGender().isPresent()) {
            oprot.writeEnum(getGender().get());
        } else {
            oprot.writeNull();
        }

        if (getHidden().isPresent()) {
            oprot.writeBool(getHidden().get());
        } else {
            oprot.writeNull();
        }

        if (getImage().isPresent()) {
            getImage().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getLocationNameTexts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getLocationNameTexts().get().size());
            for (final String _iter0 : getLocationNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getMaterialTexts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getMaterialTexts().get().size());
            for (final String _iter0 : getMaterialTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getRelationTexts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRelationTexts().get().size());
            for (final String _iter0 : getRelationTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getStructureTexts().isPresent()) {
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRING, getStructureTexts().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, String> _iter0 : getStructureTexts().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeString(_iter0.getValue());
            }
            oprot.writeMapEnd();
        } else {
            oprot.writeNull();
        }

        if (getSubjectTermTexts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSubjectTermTexts().get().size());
            for (final String _iter0 : getSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getTechniqueTexts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTechniqueTexts().get().size());
            for (final String _iter0 : getTechniqueTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getUrl().isPresent()) {
            oprot.writeString(getUrl().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getWorkTypeTexts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getWorkTypeTexts().get().size());
            for (final String _iter0 : getWorkTypeTexts().get()) {
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
        oprot.writeStructBegin("org.dressdiscover.api.models.object.ObjectSummary");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeCategoriesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCategories().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.CATEGORIES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCategories().get().size());
            for (final String _iter0 : getCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeCollectionIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.COLLECTION_ID);
        oprot.writeString(getCollectionId().toString());
        oprot.writeFieldEnd();
    }

    public void writeColorTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getColorTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.COLOR_TEXTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getColorTexts().get().size());
            for (final String _iter0 : getColorTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeCulturalContextTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCulturalContextTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.CULTURAL_CONTEXT_TEXTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCulturalContextTexts().get().size());
            for (final String _iter0 : getCulturalContextTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeDateField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDate().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DATE);
            oprot.writeString(getDate().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeDescriptionField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDescription().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DESCRIPTION);
            oprot.writeString(getDescription().get());
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeCollectionIdField(oprot);

        writeInstitutionIdField(oprot);

        writeTitleField(oprot);

        writeAgentNameTextsField(oprot);

        writeCategoriesField(oprot);

        writeColorTextsField(oprot);

        writeCulturalContextTextsField(oprot);

        writeDateField(oprot);

        writeDescriptionField(oprot);

        writeGenderField(oprot);

        writeHiddenField(oprot);

        writeImageField(oprot);

        writeLocationNameTextsField(oprot);

        writeMaterialTextsField(oprot);

        writeRelationTextsField(oprot);

        writeStructureTextsField(oprot);

        writeSubjectTermTextsField(oprot);

        writeTechniqueTextsField(oprot);

        writeUrlField(oprot);

        writeWorkTypeTextsField(oprot);

        oprot.writeFieldStop();
    }

    public void writeGenderField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getGender().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.GENDER);
            oprot.writeEnum(getGender().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeHiddenField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getHidden().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.HIDDEN);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeImageField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getImage().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.IMAGE);
            getImage().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeInstitutionIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.INSTITUTION_ID);
        oprot.writeString(getInstitutionId().toString());
        oprot.writeFieldEnd();
    }

    public void writeLocationNameTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getLocationNameTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.LOCATION_NAME_TEXTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getLocationNameTexts().get().size());
            for (final String _iter0 : getLocationNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeMaterialTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getMaterialTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.MATERIAL_TEXTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getMaterialTexts().get().size());
            for (final String _iter0 : getMaterialTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeRelationTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getRelationTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.RELATION_TEXTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRelationTexts().get().size());
            for (final String _iter0 : getRelationTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeStructureTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getStructureTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.STRUCTURE_TEXTS);
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRING, getStructureTexts().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, String> _iter0 : getStructureTexts().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeString(_iter0.getValue());
            }
            oprot.writeMapEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeSubjectTermTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getSubjectTermTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.SUBJECT_TERM_TEXTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSubjectTermTexts().get().size());
            for (final String _iter0 : getSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTechniqueTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getTechniqueTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.TECHNIQUE_TEXTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTechniqueTexts().get().size());
            for (final String _iter0 : getTechniqueTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeTitleField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TITLE);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();
    }

    public void writeUrlField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getUrl().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.URL);
            oprot.writeString(getUrl().get().toString());
            oprot.writeFieldEnd();
        }
    }

    public void writeWorkTypeTextsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getWorkTypeTexts().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.WORK_TYPE_TEXTS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getWorkTypeTexts().get().size());
            for (final String _iter0 : getWorkTypeTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    private final org.dressdiscover.api.models.collection.CollectionId collectionId;

    private final org.dressdiscover.api.models.institution.InstitutionId institutionId;

    /**
     * Dublin Core title
     */
    private final String title;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts;

    /**
     * Dublin Core date
     */
    private final com.google.common.base.Optional<String> date;

    /**
     * Dublin Core description
     */
    private final com.google.common.base.Optional<String> description;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender;

    private final com.google.common.base.Optional<Boolean> hidden;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts;

    private final com.google.common.base.Optional<org.thryft.native_.Url> url;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts;
}
