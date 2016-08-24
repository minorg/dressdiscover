package org.dressdiscover.api.models.object;

public class ObjectSummary implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public static class Builder {
        public Builder() {
            collectionId = null;
            institutionId = null;
            title = null;
            agentNameTexts = com.google.common.base.Optional.absent();
            categories = com.google.common.base.Optional.absent();
            colorTexts = com.google.common.base.Optional.absent();
            culturalContextTexts = com.google.common.base.Optional.absent();
            date = com.google.common.base.Optional.absent();
            description = com.google.common.base.Optional.absent();
            gender = com.google.common.base.Optional.absent();
            hidden = com.google.common.base.Optional.absent();
            image = com.google.common.base.Optional.absent();
            locationNameTexts = com.google.common.base.Optional.absent();
            materialTexts = com.google.common.base.Optional.absent();
            relationTexts = com.google.common.base.Optional.absent();
            structureTexts = com.google.common.base.Optional.absent();
            subjectTermTexts = com.google.common.base.Optional.absent();
            techniqueTexts = com.google.common.base.Optional.absent();
            url = com.google.common.base.Optional.absent();
            workTypeTexts = com.google.common.base.Optional.absent();
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

        protected ObjectSummary _build(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
            return new ObjectSummary(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);
        }

        public ObjectSummary build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(collectionId, "org.dressdiscover.api.models.object.ObjectSummary: missing collectionId"), com.google.common.base.Preconditions.checkNotNull(institutionId, "org.dressdiscover.api.models.object.ObjectSummary: missing institutionId"), com.google.common.base.Preconditions.checkNotNull(title, "org.dressdiscover.api.models.object.ObjectSummary: missing title"), com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing agentNameTexts"), com.google.common.base.Preconditions.checkNotNull(categories, "org.dressdiscover.api.models.object.ObjectSummary: missing categories"), com.google.common.base.Preconditions.checkNotNull(colorTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing colorTexts"), com.google.common.base.Preconditions.checkNotNull(culturalContextTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing culturalContextTexts"), com.google.common.base.Preconditions.checkNotNull(date, "org.dressdiscover.api.models.object.ObjectSummary: missing date"), com.google.common.base.Preconditions.checkNotNull(description, "org.dressdiscover.api.models.object.ObjectSummary: missing description"), com.google.common.base.Preconditions.checkNotNull(gender, "org.dressdiscover.api.models.object.ObjectSummary: missing gender"), com.google.common.base.Preconditions.checkNotNull(hidden, "org.dressdiscover.api.models.object.ObjectSummary: missing hidden"), com.google.common.base.Preconditions.checkNotNull(image, "org.dressdiscover.api.models.object.ObjectSummary: missing image"), com.google.common.base.Preconditions.checkNotNull(locationNameTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing locationNameTexts"), com.google.common.base.Preconditions.checkNotNull(materialTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing materialTexts"), com.google.common.base.Preconditions.checkNotNull(relationTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing relationTexts"), com.google.common.base.Preconditions.checkNotNull(structureTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing structureTexts"), com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing subjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(techniqueTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing techniqueTexts"), com.google.common.base.Preconditions.checkNotNull(url, "org.dressdiscover.api.models.object.ObjectSummary: missing url"), com.google.common.base.Preconditions.checkNotNull(workTypeTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing workTypeTexts"));
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

        public final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> getGender() {
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
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            try {
                collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
            } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            try {
                institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
            } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
                }
            }
            if (__list.getSize() > 7) {
                date = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 8) {
                description = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 9) {
                try {
                    gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 10) {
                hidden = com.google.common.base.Optional.of(iprot.readBool());
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                                return com.google.common.collect.ImmutableMap.of();
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
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
                     throw e.getCause();
                }
            }
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
                case "collection_id": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
                        }
                    }
                    break;
                }
                case "institution_id": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
                        }
                    }
                    break;
                }
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        title = iprot.readString();
                    }
                    break;
                }
                case "agent_name_texts": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
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
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "categories": {
                    if (!ifield.hasId() || ifield.getId() == 7) {
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
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "color_texts": {
                    if (!ifield.hasId() || ifield.getId() == 17) {
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
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "cultural_context_texts": {
                    if (!ifield.hasId() || ifield.getId() == 18) {
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
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "date": {
                    if (!ifield.hasId() || ifield.getId() == 12) {
                        date = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "description": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        description = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "gender": {
                    if (!ifield.hasId() || ifield.getId() == 8) {
                        try {
                            gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                        } catch (final IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "hidden": {
                    if (!ifield.hasId() || ifield.getId() == 22) {
                        hidden = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                case "image": {
                    if (!ifield.hasId() || ifield.getId() == 21) {
                        image = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.Image.readAsStruct(iprot));
                    }
                    break;
                }
                case "location_name_texts": {
                    if (!ifield.hasId() || ifield.getId() == 19) {
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
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "material_texts": {
                    if (!ifield.hasId() || ifield.getId() == 14) {
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
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "relation_texts": {
                    if (!ifield.hasId() || ifield.getId() == 16) {
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
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "structure_texts": {
                    if (!ifield.hasId() || ifield.getId() == 20) {
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
                                        return com.google.common.collect.ImmutableMap.of();
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "subject_term_texts": {
                    if (!ifield.hasId() || ifield.getId() == 9) {
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
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "technique_texts": {
                    if (!ifield.hasId() || ifield.getId() == 15) {
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
                             throw e.getCause();
                        }
                    }
                    break;
                }
                case "url": {
                    if (!ifield.hasId() || ifield.getId() == 13) {
                        try {
                            url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "work_type_texts": {
                    if (!ifield.hasId() || ifield.getId() == 11) {
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
                             throw e.getCause();
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
            case GENDER: setGender((org.dressdiscover.api.models.gender.Gender)value); return this;
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
            this.agentNameTexts = com.google.common.base.Preconditions.checkNotNull(agentNameTexts);
            return this;
        }

        public Builder setAgentNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> agentNameTexts) {
            this.agentNameTexts = com.google.common.base.Optional.fromNullable(agentNameTexts);
            return this;
        }

        public Builder setCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
            this.categories = com.google.common.base.Preconditions.checkNotNull(categories);
            return this;
        }

        public Builder setCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> categories) {
            this.categories = com.google.common.base.Optional.fromNullable(categories);
            return this;
        }

        public Builder setCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
            this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId);
            return this;
        }

        public Builder setColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) {
            this.colorTexts = com.google.common.base.Preconditions.checkNotNull(colorTexts);
            return this;
        }

        public Builder setColorTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> colorTexts) {
            this.colorTexts = com.google.common.base.Optional.fromNullable(colorTexts);
            return this;
        }

        public Builder setCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) {
            this.culturalContextTexts = com.google.common.base.Preconditions.checkNotNull(culturalContextTexts);
            return this;
        }

        public Builder setCulturalContextTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> culturalContextTexts) {
            this.culturalContextTexts = com.google.common.base.Optional.fromNullable(culturalContextTexts);
            return this;
        }

        public Builder setDate(final com.google.common.base.Optional<String> date) {
            this.date = com.google.common.base.Preconditions.checkNotNull(date);
            return this;
        }

        public Builder setDate(@javax.annotation.Nullable final String date) {
            this.date = com.google.common.base.Optional.fromNullable(date);
            return this;
        }

        public Builder setDescription(final com.google.common.base.Optional<String> description) {
            this.description = com.google.common.base.Preconditions.checkNotNull(description);
            return this;
        }

        public Builder setDescription(@javax.annotation.Nullable final String description) {
            this.description = com.google.common.base.Optional.fromNullable(description);
            return this;
        }

        public Builder setGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) {
            this.gender = com.google.common.base.Preconditions.checkNotNull(gender);
            return this;
        }

        public Builder setGender(@javax.annotation.Nullable final org.dressdiscover.api.models.gender.Gender gender) {
            this.gender = com.google.common.base.Optional.fromNullable(gender);
            return this;
        }

        public Builder setHidden(final com.google.common.base.Optional<Boolean> hidden) {
            this.hidden = com.google.common.base.Preconditions.checkNotNull(hidden);
            return this;
        }

        public Builder setHidden(@javax.annotation.Nullable final Boolean hidden) {
            this.hidden = com.google.common.base.Optional.fromNullable(hidden);
            return this;
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
            this.image = com.google.common.base.Preconditions.checkNotNull(image);
            return this;
        }

        public Builder setImage(@javax.annotation.Nullable final org.dressdiscover.api.models.image.Image image) {
            this.image = com.google.common.base.Optional.fromNullable(image);
            return this;
        }

        public Builder setInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
            this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId);
            return this;
        }

        public Builder setLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) {
            this.locationNameTexts = com.google.common.base.Preconditions.checkNotNull(locationNameTexts);
            return this;
        }

        public Builder setLocationNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> locationNameTexts) {
            this.locationNameTexts = com.google.common.base.Optional.fromNullable(locationNameTexts);
            return this;
        }

        public Builder setMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) {
            this.materialTexts = com.google.common.base.Preconditions.checkNotNull(materialTexts);
            return this;
        }

        public Builder setMaterialTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> materialTexts) {
            this.materialTexts = com.google.common.base.Optional.fromNullable(materialTexts);
            return this;
        }

        public Builder setRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) {
            this.relationTexts = com.google.common.base.Preconditions.checkNotNull(relationTexts);
            return this;
        }

        public Builder setRelationTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> relationTexts) {
            this.relationTexts = com.google.common.base.Optional.fromNullable(relationTexts);
            return this;
        }

        public Builder setStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) {
            this.structureTexts = com.google.common.base.Preconditions.checkNotNull(structureTexts);
            return this;
        }

        public Builder setStructureTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, String> structureTexts) {
            this.structureTexts = com.google.common.base.Optional.fromNullable(structureTexts);
            return this;
        }

        public Builder setSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) {
            this.subjectTermTexts = com.google.common.base.Preconditions.checkNotNull(subjectTermTexts);
            return this;
        }

        public Builder setSubjectTermTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> subjectTermTexts) {
            this.subjectTermTexts = com.google.common.base.Optional.fromNullable(subjectTermTexts);
            return this;
        }

        public Builder setTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) {
            this.techniqueTexts = com.google.common.base.Preconditions.checkNotNull(techniqueTexts);
            return this;
        }

        public Builder setTechniqueTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> techniqueTexts) {
            this.techniqueTexts = com.google.common.base.Optional.fromNullable(techniqueTexts);
            return this;
        }

        public Builder setTitle(final String title) {
            this.title = com.google.common.base.Preconditions.checkNotNull(title);
            return this;
        }

        public Builder setUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            this.url = com.google.common.base.Preconditions.checkNotNull(url);
            return this;
        }

        public Builder setUrl(@javax.annotation.Nullable final org.thryft.native_.Url url) {
            this.url = com.google.common.base.Optional.fromNullable(url);
            return this;
        }

        public Builder setWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
            this.workTypeTexts = com.google.common.base.Preconditions.checkNotNull(workTypeTexts);
            return this;
        }

        public Builder setWorkTypeTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> workTypeTexts) {
            this.workTypeTexts = com.google.common.base.Optional.fromNullable(workTypeTexts);
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
            this.agentNameTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetCategories() {
            this.categories = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetCollectionId() {
            this.collectionId = null;
            return this;
        }

        public Builder unsetColorTexts() {
            this.colorTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetCulturalContextTexts() {
            this.culturalContextTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetDate() {
            this.date = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetDescription() {
            this.description = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetGender() {
            this.gender = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetHidden() {
            this.hidden = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetImage() {
            this.image = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetInstitutionId() {
            this.institutionId = null;
            return this;
        }

        public Builder unsetLocationNameTexts() {
            this.locationNameTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetMaterialTexts() {
            this.materialTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetRelationTexts() {
            this.relationTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetStructureTexts() {
            this.structureTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetSubjectTermTexts() {
            this.subjectTermTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetTechniqueTexts() {
            this.techniqueTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetTitle() {
            this.title = null;
            return this;
        }

        public Builder unsetUrl() {
            this.url = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetWorkTypeTexts() {
            this.workTypeTexts = com.google.common.base.Optional.absent();
            return this;
        }

        private org.dressdiscover.api.models.collection.CollectionId collectionId;
        private org.dressdiscover.api.models.institution.InstitutionId institutionId;
        /**
         * Dublin Core title
         */
        private String title;
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
        private com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender;
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

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.collection.CollectionId>() {}, true, 1, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, true, 2, "institution_id", org.thryft.protocol.Type.STRING),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 4, "title", org.thryft.protocol.Type.STRING),
        AGENT_NAME_TEXTS("agentNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 6, "agent_name_texts", org.thryft.protocol.Type.LIST),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 7, "categories", org.thryft.protocol.Type.LIST),
        COLOR_TEXTS("colorTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 17, "color_texts", org.thryft.protocol.Type.LIST),
        CULTURAL_CONTEXT_TEXTS("culturalContextTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 18, "cultural_context_texts", org.thryft.protocol.Type.LIST),
        DATE("date", new com.google.common.reflect.TypeToken<String>() {}, false, 12, "date", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "description", org.thryft.protocol.Type.STRING),
        GENDER("gender", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.gender.Gender>() {}, false, 8, "gender", org.thryft.protocol.Type.STRING),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 22, "hidden", org.thryft.protocol.Type.BOOL),
        IMAGE("image", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.image.Image>() {}, false, 21, "image", org.thryft.protocol.Type.STRUCT),
        LOCATION_NAME_TEXTS("locationNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 19, "location_name_texts", org.thryft.protocol.Type.LIST),
        MATERIAL_TEXTS("materialTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 14, "material_texts", org.thryft.protocol.Type.LIST),
        RELATION_TEXTS("relationTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 16, "relation_texts", org.thryft.protocol.Type.LIST),
        STRUCTURE_TEXTS("structureTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, String>>() {}, false, 20, "structure_texts", org.thryft.protocol.Type.MAP),
        SUBJECT_TERM_TEXTS("subjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 9, "subject_term_texts", org.thryft.protocol.Type.LIST),
        TECHNIQUE_TEXTS("techniqueTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 15, "technique_texts", org.thryft.protocol.Type.LIST),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 13, "url", org.thryft.protocol.Type.STRING),
        WORK_TYPE_TEXTS("workTypeTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 11, "work_type_texts", org.thryft.protocol.Type.LIST);

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
    public ObjectSummary(final ObjectSummary other) {
        this(other.getCollectionId(), other.getInstitutionId(), other.getTitle(), other.getAgentNameTexts(), other.getCategories(), other.getColorTexts(), other.getCulturalContextTexts(), other.getDate(), other.getDescription(), other.getGender(), other.getHidden(), other.getImage(), other.getLocationNameTexts(), other.getMaterialTexts(), other.getRelationTexts(), other.getStructureTexts(), other.getSubjectTermTexts(), other.getTechniqueTexts(), other.getUrl(), other.getWorkTypeTexts());
    }

    /**
     * Required constructor
     */
    public ObjectSummary(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "org.dressdiscover.api.models.object.ObjectSummary: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "org.dressdiscover.api.models.object.ObjectSummary: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "org.dressdiscover.api.models.object.ObjectSummary: missing title"), "org.dressdiscover.api.models.object.ObjectSummary: title is empty");
        this.agentNameTexts = com.google.common.base.Optional.absent();
        this.categories = com.google.common.base.Optional.absent();
        this.colorTexts = com.google.common.base.Optional.absent();
        this.culturalContextTexts = com.google.common.base.Optional.absent();
        this.date = com.google.common.base.Optional.absent();
        this.description = com.google.common.base.Optional.absent();
        this.gender = com.google.common.base.Optional.absent();
        this.hidden = com.google.common.base.Optional.absent();
        this.image = com.google.common.base.Optional.absent();
        this.locationNameTexts = com.google.common.base.Optional.absent();
        this.materialTexts = com.google.common.base.Optional.absent();
        this.relationTexts = com.google.common.base.Optional.absent();
        this.structureTexts = com.google.common.base.Optional.absent();
        this.subjectTermTexts = com.google.common.base.Optional.absent();
        this.techniqueTexts = com.google.common.base.Optional.absent();
        this.url = com.google.common.base.Optional.absent();
        this.workTypeTexts = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public ObjectSummary(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> agentNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> categories, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> colorTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> culturalContextTexts, final @javax.annotation.Nullable String date, final @javax.annotation.Nullable String description, final @javax.annotation.Nullable org.dressdiscover.api.models.gender.Gender gender, final @javax.annotation.Nullable Boolean hidden, final @javax.annotation.Nullable org.dressdiscover.api.models.image.Image image, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> locationNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> materialTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> relationTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableMap<String, String> structureTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> subjectTermTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> techniqueTexts, final @javax.annotation.Nullable org.thryft.native_.Url url, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> workTypeTexts) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "org.dressdiscover.api.models.object.ObjectSummary: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "org.dressdiscover.api.models.object.ObjectSummary: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "org.dressdiscover.api.models.object.ObjectSummary: missing title"), "org.dressdiscover.api.models.object.ObjectSummary: title is empty");
        this.agentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(agentNameTexts), "org.dressdiscover.api.models.object.ObjectSummary: agentNameTexts is empty");
        this.categories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(categories), "org.dressdiscover.api.models.object.ObjectSummary: categories is empty");
        this.colorTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(colorTexts), "org.dressdiscover.api.models.object.ObjectSummary: colorTexts is empty");
        this.culturalContextTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(culturalContextTexts), "org.dressdiscover.api.models.object.ObjectSummary: culturalContextTexts is empty");
        this.date = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(date), "org.dressdiscover.api.models.object.ObjectSummary: date is empty");
        this.description = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(description), "org.dressdiscover.api.models.object.ObjectSummary: description is empty");
        this.gender = com.google.common.base.Optional.fromNullable(gender);
        this.hidden = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Optional.fromNullable(hidden), "org.dressdiscover.api.models.object.ObjectSummary: hidden must be true");
        this.image = com.google.common.base.Optional.fromNullable(image);
        this.locationNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(locationNameTexts), "org.dressdiscover.api.models.object.ObjectSummary: locationNameTexts is empty");
        this.materialTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(materialTexts), "org.dressdiscover.api.models.object.ObjectSummary: materialTexts is empty");
        this.relationTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(relationTexts), "org.dressdiscover.api.models.object.ObjectSummary: relationTexts is empty");
        this.structureTexts = org.thryft.Preconditions.checkOptionalMapNotEmpty(com.google.common.base.Optional.fromNullable(structureTexts), "org.dressdiscover.api.models.object.ObjectSummary: structureTexts is empty");
        this.subjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(subjectTermTexts), "org.dressdiscover.api.models.object.ObjectSummary: subjectTermTexts is empty");
        this.techniqueTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(techniqueTexts), "org.dressdiscover.api.models.object.ObjectSummary: techniqueTexts is empty");
        this.url = com.google.common.base.Optional.fromNullable(url);
        this.workTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(workTypeTexts), "org.dressdiscover.api.models.object.ObjectSummary: workTypeTexts is empty");
    }

    /**
     * Optional constructor
     */
    public ObjectSummary(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "org.dressdiscover.api.models.object.ObjectSummary: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "org.dressdiscover.api.models.object.ObjectSummary: missing institutionId");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "org.dressdiscover.api.models.object.ObjectSummary: missing title"), "org.dressdiscover.api.models.object.ObjectSummary: title is empty");
        this.agentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing agentNameTexts"), "org.dressdiscover.api.models.object.ObjectSummary: agentNameTexts is empty");
        this.categories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(categories, "org.dressdiscover.api.models.object.ObjectSummary: missing categories"), "org.dressdiscover.api.models.object.ObjectSummary: categories is empty");
        this.colorTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(colorTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing colorTexts"), "org.dressdiscover.api.models.object.ObjectSummary: colorTexts is empty");
        this.culturalContextTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(culturalContextTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing culturalContextTexts"), "org.dressdiscover.api.models.object.ObjectSummary: culturalContextTexts is empty");
        this.date = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(date, "org.dressdiscover.api.models.object.ObjectSummary: missing date"), "org.dressdiscover.api.models.object.ObjectSummary: date is empty");
        this.description = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(description, "org.dressdiscover.api.models.object.ObjectSummary: missing description"), "org.dressdiscover.api.models.object.ObjectSummary: description is empty");
        this.gender = com.google.common.base.Preconditions.checkNotNull(gender, "org.dressdiscover.api.models.object.ObjectSummary: missing gender");
        this.hidden = org.thryft.Preconditions.checkOptionalBooleanTrue(com.google.common.base.Preconditions.checkNotNull(hidden, "org.dressdiscover.api.models.object.ObjectSummary: missing hidden"), "org.dressdiscover.api.models.object.ObjectSummary: hidden must be true");
        this.image = com.google.common.base.Preconditions.checkNotNull(image, "org.dressdiscover.api.models.object.ObjectSummary: missing image");
        this.locationNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(locationNameTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing locationNameTexts"), "org.dressdiscover.api.models.object.ObjectSummary: locationNameTexts is empty");
        this.materialTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(materialTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing materialTexts"), "org.dressdiscover.api.models.object.ObjectSummary: materialTexts is empty");
        this.relationTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(relationTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing relationTexts"), "org.dressdiscover.api.models.object.ObjectSummary: relationTexts is empty");
        this.structureTexts = org.thryft.Preconditions.checkOptionalMapNotEmpty(com.google.common.base.Preconditions.checkNotNull(structureTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing structureTexts"), "org.dressdiscover.api.models.object.ObjectSummary: structureTexts is empty");
        this.subjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing subjectTermTexts"), "org.dressdiscover.api.models.object.ObjectSummary: subjectTermTexts is empty");
        this.techniqueTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(techniqueTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing techniqueTexts"), "org.dressdiscover.api.models.object.ObjectSummary: techniqueTexts is empty");
        this.url = com.google.common.base.Preconditions.checkNotNull(url, "org.dressdiscover.api.models.object.ObjectSummary: missing url");
        this.workTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(workTypeTexts, "org.dressdiscover.api.models.object.ObjectSummary: missing workTypeTexts"), "org.dressdiscover.api.models.object.ObjectSummary: workTypeTexts is empty");
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

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ObjectSummary)) {
            return false;
        }

        final ObjectSummary other = (ObjectSummary)otherObject;
        return
            getCollectionId().equals(other.getCollectionId()) &&
            getInstitutionId().equals(other.getInstitutionId()) &&
            getTitle().equals(other.getTitle()) &&
            ((getAgentNameTexts().isPresent() && other.getAgentNameTexts().isPresent()) ? (getAgentNameTexts().get().equals(other.getAgentNameTexts().get())) : (!getAgentNameTexts().isPresent() && !other.getAgentNameTexts().isPresent())) &&
            ((getCategories().isPresent() && other.getCategories().isPresent()) ? (getCategories().get().equals(other.getCategories().get())) : (!getCategories().isPresent() && !other.getCategories().isPresent())) &&
            ((getColorTexts().isPresent() && other.getColorTexts().isPresent()) ? (getColorTexts().get().equals(other.getColorTexts().get())) : (!getColorTexts().isPresent() && !other.getColorTexts().isPresent())) &&
            ((getCulturalContextTexts().isPresent() && other.getCulturalContextTexts().isPresent()) ? (getCulturalContextTexts().get().equals(other.getCulturalContextTexts().get())) : (!getCulturalContextTexts().isPresent() && !other.getCulturalContextTexts().isPresent())) &&
            ((getDate().isPresent() && other.getDate().isPresent()) ? (getDate().get().equals(other.getDate().get())) : (!getDate().isPresent() && !other.getDate().isPresent())) &&
            ((getDescription().isPresent() && other.getDescription().isPresent()) ? (getDescription().get().equals(other.getDescription().get())) : (!getDescription().isPresent() && !other.getDescription().isPresent())) &&
            ((getGender().isPresent() && other.getGender().isPresent()) ? (getGender().get().equals(other.getGender().get())) : (!getGender().isPresent() && !other.getGender().isPresent())) &&
            ((getHidden().isPresent() && other.getHidden().isPresent()) ? (getHidden().get() == other.getHidden().get()) : (!getHidden().isPresent() && !other.getHidden().isPresent())) &&
            ((getImage().isPresent() && other.getImage().isPresent()) ? (getImage().get().equals(other.getImage().get())) : (!getImage().isPresent() && !other.getImage().isPresent())) &&
            ((getLocationNameTexts().isPresent() && other.getLocationNameTexts().isPresent()) ? (getLocationNameTexts().get().equals(other.getLocationNameTexts().get())) : (!getLocationNameTexts().isPresent() && !other.getLocationNameTexts().isPresent())) &&
            ((getMaterialTexts().isPresent() && other.getMaterialTexts().isPresent()) ? (getMaterialTexts().get().equals(other.getMaterialTexts().get())) : (!getMaterialTexts().isPresent() && !other.getMaterialTexts().isPresent())) &&
            ((getRelationTexts().isPresent() && other.getRelationTexts().isPresent()) ? (getRelationTexts().get().equals(other.getRelationTexts().get())) : (!getRelationTexts().isPresent() && !other.getRelationTexts().isPresent())) &&
            ((getStructureTexts().isPresent() && other.getStructureTexts().isPresent()) ? (getStructureTexts().get().equals(other.getStructureTexts().get())) : (!getStructureTexts().isPresent() && !other.getStructureTexts().isPresent())) &&
            ((getSubjectTermTexts().isPresent() && other.getSubjectTermTexts().isPresent()) ? (getSubjectTermTexts().get().equals(other.getSubjectTermTexts().get())) : (!getSubjectTermTexts().isPresent() && !other.getSubjectTermTexts().isPresent())) &&
            ((getTechniqueTexts().isPresent() && other.getTechniqueTexts().isPresent()) ? (getTechniqueTexts().get().equals(other.getTechniqueTexts().get())) : (!getTechniqueTexts().isPresent() && !other.getTechniqueTexts().isPresent())) &&
            ((getUrl().isPresent() && other.getUrl().isPresent()) ? (getUrl().get().equals(other.getUrl().get())) : (!getUrl().isPresent() && !other.getUrl().isPresent())) &&
            ((getWorkTypeTexts().isPresent() && other.getWorkTypeTexts().isPresent()) ? (getWorkTypeTexts().get().equals(other.getWorkTypeTexts().get())) : (!getWorkTypeTexts().isPresent() && !other.getWorkTypeTexts().isPresent()));
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

    public final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> getGender() {
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
        org.dressdiscover.api.models.collection.CollectionId collectionId = null;
        org.dressdiscover.api.models.institution.InstitutionId institutionId = null;
        String title = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> date = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        try {
            collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        try {
            institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
            }
        }
        if (__list.getSize() > 7) {
            date = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 8) {
            description = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 9) {
            try {
                gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
            } catch (final IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 10) {
            hidden = com.google.common.base.Optional.of(iprot.readBool());
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                            return com.google.common.collect.ImmutableMap.of();
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
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
                 throw e.getCause();
            }
        }
        iprot.readListEnd();
        try {
            return new ObjectSummary(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectSummary readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectSummary readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.collection.CollectionId collectionId = null;
        org.dressdiscover.api.models.institution.InstitutionId institutionId = null;
        String title = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> date = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts = com.google.common.base.Optional.absent();

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "collection_id": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    try {
                        collectionId = org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                }
                break;
            }
            case "institution_id": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    try {
                        institutionId = org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                }
                break;
            }
            case "title": {
                if (!ifield.hasId() || ifield.getId() == 4) {
                    title = iprot.readString();
                }
                break;
            }
            case "agent_name_texts": {
                if (!ifield.hasId() || ifield.getId() == 6) {
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
                         throw e.getCause();
                    }
                }
                break;
            }
            case "categories": {
                if (!ifield.hasId() || ifield.getId() == 7) {
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
                         throw e.getCause();
                    }
                }
                break;
            }
            case "color_texts": {
                if (!ifield.hasId() || ifield.getId() == 17) {
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
                         throw e.getCause();
                    }
                }
                break;
            }
            case "cultural_context_texts": {
                if (!ifield.hasId() || ifield.getId() == 18) {
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
                         throw e.getCause();
                    }
                }
                break;
            }
            case "date": {
                if (!ifield.hasId() || ifield.getId() == 12) {
                    date = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "description": {
                if (!ifield.hasId() || ifield.getId() == 5) {
                    description = com.google.common.base.Optional.of(iprot.readString());
                }
                break;
            }
            case "gender": {
                if (!ifield.hasId() || ifield.getId() == 8) {
                    try {
                        gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.models.gender.Gender.class));
                    } catch (final IllegalArgumentException e) {
                    }
                }
                break;
            }
            case "hidden": {
                if (!ifield.hasId() || ifield.getId() == 22) {
                    hidden = com.google.common.base.Optional.of(iprot.readBool());
                }
                break;
            }
            case "image": {
                if (!ifield.hasId() || ifield.getId() == 21) {
                    image = com.google.common.base.Optional.of(org.dressdiscover.api.models.image.Image.readAsStruct(iprot));
                }
                break;
            }
            case "location_name_texts": {
                if (!ifield.hasId() || ifield.getId() == 19) {
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
                         throw e.getCause();
                    }
                }
                break;
            }
            case "material_texts": {
                if (!ifield.hasId() || ifield.getId() == 14) {
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
                         throw e.getCause();
                    }
                }
                break;
            }
            case "relation_texts": {
                if (!ifield.hasId() || ifield.getId() == 16) {
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
                         throw e.getCause();
                    }
                }
                break;
            }
            case "structure_texts": {
                if (!ifield.hasId() || ifield.getId() == 20) {
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
                                    return com.google.common.collect.ImmutableMap.of();
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw e.getCause();
                    }
                }
                break;
            }
            case "subject_term_texts": {
                if (!ifield.hasId() || ifield.getId() == 9) {
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
                         throw e.getCause();
                    }
                }
                break;
            }
            case "technique_texts": {
                if (!ifield.hasId() || ifield.getId() == 15) {
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
                         throw e.getCause();
                    }
                }
                break;
            }
            case "url": {
                if (!ifield.hasId() || ifield.getId() == 13) {
                    try {
                        url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
                }
                break;
            }
            case "work_type_texts": {
                if (!ifield.hasId() || ifield.getId() == 11) {
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
                         throw e.getCause();
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
        try {
            return new ObjectSummary(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectSummary replaceAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceAgentNameTexts(final com.google.common.collect.ImmutableList<String> agentNameTexts) {
        return replaceAgentNameTexts(com.google.common.base.Optional.fromNullable(agentNameTexts));
    }

    public ObjectSummary replaceCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceCategories(final com.google.common.collect.ImmutableList<String> categories) {
        return replaceCategories(com.google.common.base.Optional.fromNullable(categories));
    }

    public ObjectSummary replaceCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
        return new ObjectSummary(collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceColorTexts(final com.google.common.collect.ImmutableList<String> colorTexts) {
        return replaceColorTexts(com.google.common.base.Optional.fromNullable(colorTexts));
    }

    public ObjectSummary replaceCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceCulturalContextTexts(final com.google.common.collect.ImmutableList<String> culturalContextTexts) {
        return replaceCulturalContextTexts(com.google.common.base.Optional.fromNullable(culturalContextTexts));
    }

    public ObjectSummary replaceDate(final com.google.common.base.Optional<String> date) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceDate(final String date) {
        return replaceDate(com.google.common.base.Optional.fromNullable(date));
    }

    public ObjectSummary replaceDescription(final com.google.common.base.Optional<String> description) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceDescription(final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public ObjectSummary replaceGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceGender(final org.dressdiscover.api.models.gender.Gender gender) {
        return replaceGender(com.google.common.base.Optional.fromNullable(gender));
    }

    public ObjectSummary replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceHidden(final boolean hidden) {
        return replaceHidden(com.google.common.base.Optional.fromNullable(hidden));
    }

    public ObjectSummary replaceImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceImage(final org.dressdiscover.api.models.image.Image image) {
        return replaceImage(com.google.common.base.Optional.fromNullable(image));
    }

    public ObjectSummary replaceInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
        return new ObjectSummary(this.collectionId, institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceLocationNameTexts(final com.google.common.collect.ImmutableList<String> locationNameTexts) {
        return replaceLocationNameTexts(com.google.common.base.Optional.fromNullable(locationNameTexts));
    }

    public ObjectSummary replaceMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceMaterialTexts(final com.google.common.collect.ImmutableList<String> materialTexts) {
        return replaceMaterialTexts(com.google.common.base.Optional.fromNullable(materialTexts));
    }

    public ObjectSummary replaceRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceRelationTexts(final com.google.common.collect.ImmutableList<String> relationTexts) {
        return replaceRelationTexts(com.google.common.base.Optional.fromNullable(relationTexts));
    }

    public ObjectSummary replaceStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceStructureTexts(final com.google.common.collect.ImmutableMap<String, String> structureTexts) {
        return replaceStructureTexts(com.google.common.base.Optional.fromNullable(structureTexts));
    }

    public ObjectSummary replaceSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceSubjectTermTexts(final com.google.common.collect.ImmutableList<String> subjectTermTexts) {
        return replaceSubjectTermTexts(com.google.common.base.Optional.fromNullable(subjectTermTexts));
    }

    public ObjectSummary replaceTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceTechniqueTexts(final com.google.common.collect.ImmutableList<String> techniqueTexts) {
        return replaceTechniqueTexts(com.google.common.base.Optional.fromNullable(techniqueTexts));
    }

    public ObjectSummary replaceTitle(final String title) {
        return new ObjectSummary(this.collectionId, this.institutionId, title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, url, this.workTypeTexts);
    }

    public ObjectSummary replaceUrl(final org.thryft.native_.Url url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    public ObjectSummary replaceWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, workTypeTexts);
    }

    public ObjectSummary replaceWorkTypeTexts(final com.google.common.collect.ImmutableList<String> workTypeTexts) {
        return replaceWorkTypeTexts(com.google.common.base.Optional.fromNullable(workTypeTexts));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("title", getTitle()).add("agent_name_texts", getAgentNameTexts().orNull()).add("categories", getCategories().orNull()).add("color_texts", getColorTexts().orNull()).add("cultural_context_texts", getCulturalContextTexts().orNull()).add("date", getDate().orNull()).add("description", getDescription().orNull()).add("gender", getGender().orNull()).add("hidden", getHidden().orNull()).add("image", getImage().orNull()).add("location_name_texts", getLocationNameTexts().orNull()).add("material_texts", getMaterialTexts().orNull()).add("relation_texts", getRelationTexts().orNull()).add("structure_texts", getStructureTexts().orNull()).add("subject_term_texts", getSubjectTermTexts().orNull()).add("technique_texts", getTechniqueTexts().orNull()).add("url", getUrl().orNull()).add("work_type_texts", getWorkTypeTexts().orNull()).toString();
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

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("collection_id", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getCollectionId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getInstitutionId().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)4);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        if (getAgentNameTexts().isPresent()) {
            oprot.writeFieldBegin("agent_name_texts", org.thryft.protocol.Type.LIST, (short)6);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getAgentNameTexts().get().size());
            for (final String _iter0 : getAgentNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getCategories().isPresent()) {
            oprot.writeFieldBegin("categories", org.thryft.protocol.Type.LIST, (short)7);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCategories().get().size());
            for (final String _iter0 : getCategories().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getColorTexts().isPresent()) {
            oprot.writeFieldBegin("color_texts", org.thryft.protocol.Type.LIST, (short)17);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getColorTexts().get().size());
            for (final String _iter0 : getColorTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getCulturalContextTexts().isPresent()) {
            oprot.writeFieldBegin("cultural_context_texts", org.thryft.protocol.Type.LIST, (short)18);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getCulturalContextTexts().get().size());
            for (final String _iter0 : getCulturalContextTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getDate().isPresent()) {
            oprot.writeFieldBegin("date", org.thryft.protocol.Type.STRING, (short)12);
            oprot.writeString(getDate().get());
            oprot.writeFieldEnd();
        }

        if (getDescription().isPresent()) {
            oprot.writeFieldBegin("description", org.thryft.protocol.Type.STRING, (short)5);
            oprot.writeString(getDescription().get());
            oprot.writeFieldEnd();
        }

        if (getGender().isPresent()) {
            oprot.writeFieldBegin("gender", org.thryft.protocol.Type.STRING, (short)8);
            oprot.writeEnum(getGender().get());
            oprot.writeFieldEnd();
        }

        if (getHidden().isPresent()) {
            oprot.writeFieldBegin("hidden", org.thryft.protocol.Type.BOOL, (short)22);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }

        if (getImage().isPresent()) {
            oprot.writeFieldBegin("image", org.thryft.protocol.Type.STRUCT, (short)21);
            getImage().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getLocationNameTexts().isPresent()) {
            oprot.writeFieldBegin("location_name_texts", org.thryft.protocol.Type.LIST, (short)19);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getLocationNameTexts().get().size());
            for (final String _iter0 : getLocationNameTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getMaterialTexts().isPresent()) {
            oprot.writeFieldBegin("material_texts", org.thryft.protocol.Type.LIST, (short)14);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getMaterialTexts().get().size());
            for (final String _iter0 : getMaterialTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getRelationTexts().isPresent()) {
            oprot.writeFieldBegin("relation_texts", org.thryft.protocol.Type.LIST, (short)16);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getRelationTexts().get().size());
            for (final String _iter0 : getRelationTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getStructureTexts().isPresent()) {
            oprot.writeFieldBegin("structure_texts", org.thryft.protocol.Type.MAP, (short)20);
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.STRING, getStructureTexts().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, String> _iter0 : getStructureTexts().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeString(_iter0.getValue());
            }
            oprot.writeMapEnd();
            oprot.writeFieldEnd();
        }

        if (getSubjectTermTexts().isPresent()) {
            oprot.writeFieldBegin("subject_term_texts", org.thryft.protocol.Type.LIST, (short)9);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSubjectTermTexts().get().size());
            for (final String _iter0 : getSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getTechniqueTexts().isPresent()) {
            oprot.writeFieldBegin("technique_texts", org.thryft.protocol.Type.LIST, (short)15);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getTechniqueTexts().get().size());
            for (final String _iter0 : getTechniqueTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getUrl().isPresent()) {
            oprot.writeFieldBegin("url", org.thryft.protocol.Type.STRING, (short)13);
            oprot.writeString(getUrl().get().toString());
            oprot.writeFieldEnd();
        }

        if (getWorkTypeTexts().isPresent()) {
            oprot.writeFieldBegin("work_type_texts", org.thryft.protocol.Type.LIST, (short)11);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getWorkTypeTexts().get().size());
            for (final String _iter0 : getWorkTypeTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
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

    private final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender;

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
