package org.dressdiscover.api.models.object;

public final class ObjectSummary implements org.thryft.Struct, org.thryft.waf.api.models.Model {
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
            gender = com.google.common.base.Optional.<org.dressdiscover.api.models.gender.Gender> absent();
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

        protected ObjectSummary _build(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
            return new ObjectSummary(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts, DefaultConstructionValidator.getInstance());
        }

        public ObjectSummary build() {
            return _build(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts);
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
            this.agentNameTexts = DefaultConstructionValidator.getInstance().validateAgentNameTexts(agentNameTexts);
            return this;
        }

        public Builder setAgentNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> agentNameTexts) {
            return setAgentNameTexts(com.google.common.base.Optional.fromNullable(agentNameTexts));
        }

        public Builder setCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
            this.categories = DefaultConstructionValidator.getInstance().validateCategories(categories);
            return this;
        }

        public Builder setCategories(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> categories) {
            return setCategories(com.google.common.base.Optional.fromNullable(categories));
        }

        public Builder setCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
            this.collectionId = DefaultConstructionValidator.getInstance().validateCollectionId(collectionId);
            return this;
        }

        public Builder setColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) {
            this.colorTexts = DefaultConstructionValidator.getInstance().validateColorTexts(colorTexts);
            return this;
        }

        public Builder setColorTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> colorTexts) {
            return setColorTexts(com.google.common.base.Optional.fromNullable(colorTexts));
        }

        public Builder setCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) {
            this.culturalContextTexts = DefaultConstructionValidator.getInstance().validateCulturalContextTexts(culturalContextTexts);
            return this;
        }

        public Builder setCulturalContextTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> culturalContextTexts) {
            return setCulturalContextTexts(com.google.common.base.Optional.fromNullable(culturalContextTexts));
        }

        public Builder setDate(final com.google.common.base.Optional<String> date) {
            this.date = DefaultConstructionValidator.getInstance().validateDate(date);
            return this;
        }

        public Builder setDate(@javax.annotation.Nullable final String date) {
            return setDate(com.google.common.base.Optional.fromNullable(date));
        }

        public Builder setDescription(final com.google.common.base.Optional<String> description) {
            this.description = DefaultConstructionValidator.getInstance().validateDescription(description);
            return this;
        }

        public Builder setDescription(@javax.annotation.Nullable final String description) {
            return setDescription(com.google.common.base.Optional.fromNullable(description));
        }

        public Builder setGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) {
            this.gender = DefaultConstructionValidator.getInstance().validateGender(gender);
            return this;
        }

        public Builder setGender(@javax.annotation.Nullable final org.dressdiscover.api.models.gender.Gender gender) {
            return setGender(com.google.common.base.Optional.fromNullable(gender));
        }

        public Builder setHidden(final com.google.common.base.Optional<Boolean> hidden) {
            this.hidden = DefaultConstructionValidator.getInstance().validateHidden(hidden);
            return this;
        }

        public Builder setHidden(@javax.annotation.Nullable final Boolean hidden) {
            return setHidden(com.google.common.base.Optional.fromNullable(hidden));
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
            this.image = DefaultConstructionValidator.getInstance().validateImage(image);
            return this;
        }

        public Builder setImage(@javax.annotation.Nullable final org.dressdiscover.api.models.image.Image image) {
            return setImage(com.google.common.base.Optional.fromNullable(image));
        }

        public Builder setInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
            this.institutionId = DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId);
            return this;
        }

        public Builder setLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) {
            this.locationNameTexts = DefaultConstructionValidator.getInstance().validateLocationNameTexts(locationNameTexts);
            return this;
        }

        public Builder setLocationNameTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> locationNameTexts) {
            return setLocationNameTexts(com.google.common.base.Optional.fromNullable(locationNameTexts));
        }

        public Builder setMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) {
            this.materialTexts = DefaultConstructionValidator.getInstance().validateMaterialTexts(materialTexts);
            return this;
        }

        public Builder setMaterialTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> materialTexts) {
            return setMaterialTexts(com.google.common.base.Optional.fromNullable(materialTexts));
        }

        public Builder setRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) {
            this.relationTexts = DefaultConstructionValidator.getInstance().validateRelationTexts(relationTexts);
            return this;
        }

        public Builder setRelationTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> relationTexts) {
            return setRelationTexts(com.google.common.base.Optional.fromNullable(relationTexts));
        }

        public Builder setStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) {
            this.structureTexts = DefaultConstructionValidator.getInstance().validateStructureTexts(structureTexts);
            return this;
        }

        public Builder setStructureTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, String> structureTexts) {
            return setStructureTexts(com.google.common.base.Optional.fromNullable(structureTexts));
        }

        public Builder setSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) {
            this.subjectTermTexts = DefaultConstructionValidator.getInstance().validateSubjectTermTexts(subjectTermTexts);
            return this;
        }

        public Builder setSubjectTermTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> subjectTermTexts) {
            return setSubjectTermTexts(com.google.common.base.Optional.fromNullable(subjectTermTexts));
        }

        public Builder setTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) {
            this.techniqueTexts = DefaultConstructionValidator.getInstance().validateTechniqueTexts(techniqueTexts);
            return this;
        }

        public Builder setTechniqueTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> techniqueTexts) {
            return setTechniqueTexts(com.google.common.base.Optional.fromNullable(techniqueTexts));
        }

        public Builder setTitle(final String title) {
            this.title = DefaultConstructionValidator.getInstance().validateTitle(title);
            return this;
        }

        public Builder setUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            this.url = DefaultConstructionValidator.getInstance().validateUrl(url);
            return this;
        }

        public Builder setUrl(@javax.annotation.Nullable final org.thryft.native_.Url url) {
            return setUrl(com.google.common.base.Optional.fromNullable(url));
        }

        public Builder setWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
            this.workTypeTexts = DefaultConstructionValidator.getInstance().validateWorkTypeTexts(workTypeTexts);
            return this;
        }

        public Builder setWorkTypeTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> workTypeTexts) {
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
            this.gender = com.google.common.base.Optional.<org.dressdiscover.api.models.gender.Gender> absent();
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

    public interface Validator<ExceptionT extends Exception> {
        public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws ExceptionT;

        public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws ExceptionT;

        public String validateTitle(final String title) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) throws ExceptionT;

        public com.google.common.base.Optional<String> validateDate(final com.google.common.base.Optional<String> date) throws ExceptionT;

        public com.google.common.base.Optional<String> validateDescription(final com.google.common.base.Optional<String> description) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) throws ExceptionT;

        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) throws ExceptionT;

        public com.google.common.base.Optional<org.thryft.native_.Url> validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) throws ExceptionT;
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
        public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws RuntimeException {
            if (collectionId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: collectionId is null");
            }
            return collectionId;
        }

        @Override
        public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws RuntimeException {
            if (institutionId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: institutionId is null");
            }
            return institutionId;
        }

        @Override
        public String validateTitle(final String title) throws RuntimeException {
            if (title == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: title is null");
            }
            if (title.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: title is less than min length 1");
            }
            return title;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) throws RuntimeException {
            if (agentNameTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: agentNameTexts is null");
            }
            if (!agentNameTexts.isPresent()) {
                return agentNameTexts;
            }
            if (agentNameTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: agentNameTexts is less than min length 1");
            }
            return agentNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) throws RuntimeException {
            if (categories == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: categories is null");
            }
            if (!categories.isPresent()) {
                return categories;
            }
            if (categories.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: categories is less than min length 1");
            }
            return categories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) throws RuntimeException {
            if (colorTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: colorTexts is null");
            }
            if (!colorTexts.isPresent()) {
                return colorTexts;
            }
            if (colorTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: colorTexts is less than min length 1");
            }
            return colorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) throws RuntimeException {
            if (culturalContextTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: culturalContextTexts is null");
            }
            if (!culturalContextTexts.isPresent()) {
                return culturalContextTexts;
            }
            if (culturalContextTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: culturalContextTexts is less than min length 1");
            }
            return culturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<String> validateDate(final com.google.common.base.Optional<String> date) throws RuntimeException {
            if (date == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: date is null");
            }
            if (!date.isPresent()) {
                return date;
            }
            if (date.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: date is less than min length 1");
            }
            return date;
        }

        @Override
        public com.google.common.base.Optional<String> validateDescription(final com.google.common.base.Optional<String> description) throws RuntimeException {
            if (description == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: description is null");
            }
            if (!description.isPresent()) {
                return description;
            }
            if (description.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: description is less than min length 1");
            }
            return description;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) throws RuntimeException {
            if (gender == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: gender is null");
            }
            if (!gender.isPresent()) {
                return gender;
            }
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws RuntimeException {
            if (!hidden.isPresent()) {
                return hidden;
            }
            if (!hidden.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: hidden is not true");
            }
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) throws RuntimeException {
            if (image == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: image is null");
            }
            if (!image.isPresent()) {
                return image;
            }
            return image;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) throws RuntimeException {
            if (locationNameTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: locationNameTexts is null");
            }
            if (!locationNameTexts.isPresent()) {
                return locationNameTexts;
            }
            if (locationNameTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: locationNameTexts is less than min length 1");
            }
            return locationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) throws RuntimeException {
            if (materialTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: materialTexts is null");
            }
            if (!materialTexts.isPresent()) {
                return materialTexts;
            }
            if (materialTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: materialTexts is less than min length 1");
            }
            return materialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) throws RuntimeException {
            if (relationTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: relationTexts is null");
            }
            if (!relationTexts.isPresent()) {
                return relationTexts;
            }
            if (relationTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: relationTexts is less than min length 1");
            }
            return relationTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) throws RuntimeException {
            if (structureTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: structureTexts is null");
            }
            if (!structureTexts.isPresent()) {
                return structureTexts;
            }
            if (structureTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: structureTexts is less than min length 1");
            }
            return structureTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) throws RuntimeException {
            if (subjectTermTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: subjectTermTexts is null");
            }
            if (!subjectTermTexts.isPresent()) {
                return subjectTermTexts;
            }
            if (subjectTermTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: subjectTermTexts is less than min length 1");
            }
            return subjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) throws RuntimeException {
            if (techniqueTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: techniqueTexts is null");
            }
            if (!techniqueTexts.isPresent()) {
                return techniqueTexts;
            }
            if (techniqueTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: techniqueTexts is less than min length 1");
            }
            return techniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) throws RuntimeException {
            if (url == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: url is null");
            }
            if (!url.isPresent()) {
                return url;
            }
            return url;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) throws RuntimeException {
            if (workTypeTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectSummary: workTypeTexts is null");
            }
            if (!workTypeTexts.isPresent()) {
                return workTypeTexts;
            }
            if (workTypeTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectSummary: workTypeTexts is less than min length 1");
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
        public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
            return collectionId;
        }

        @Override
        public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
            return institutionId;
        }

        @Override
        public String validateTitle(final String title) {
            return title;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) {
            return agentNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
            return categories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) {
            return colorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) {
            return culturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<String> validateDate(final com.google.common.base.Optional<String> date) {
            return date;
        }

        @Override
        public com.google.common.base.Optional<String> validateDescription(final com.google.common.base.Optional<String> description) {
            return description;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) {
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) {
            return image;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) {
            return locationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) {
            return materialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) {
            return relationTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) {
            return structureTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) {
            return subjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) {
            return techniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            return url;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
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
        public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) throws org.thryft.protocol.InputProtocolException {
            if (collectionId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLLECTION_ID, "org.dressdiscover.api.models.object.ObjectSummary: collectionId is null");
            }
            return collectionId;
        }

        @Override
        public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) throws org.thryft.protocol.InputProtocolException {
            if (institutionId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, "org.dressdiscover.api.models.object.ObjectSummary: institutionId is null");
            }
            return institutionId;
        }

        @Override
        public String validateTitle(final String title) throws org.thryft.protocol.InputProtocolException {
            if (title == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.models.object.ObjectSummary: title is null");
            }
            if (title.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.models.object.ObjectSummary: title is less than min length 1");
            }
            return title;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) throws org.thryft.protocol.InputProtocolException {
            if (agentNameTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.AGENT_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: agentNameTexts is null");
            }
            if (!agentNameTexts.isPresent()) {
                return agentNameTexts;
            }
            if (agentNameTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.AGENT_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: agentNameTexts is less than min length 1");
            }
            return agentNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) throws org.thryft.protocol.InputProtocolException {
            if (categories == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CATEGORIES, "org.dressdiscover.api.models.object.ObjectSummary: categories is null");
            }
            if (!categories.isPresent()) {
                return categories;
            }
            if (categories.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CATEGORIES, "org.dressdiscover.api.models.object.ObjectSummary: categories is less than min length 1");
            }
            return categories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) throws org.thryft.protocol.InputProtocolException {
            if (colorTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: colorTexts is null");
            }
            if (!colorTexts.isPresent()) {
                return colorTexts;
            }
            if (colorTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: colorTexts is less than min length 1");
            }
            return colorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) throws org.thryft.protocol.InputProtocolException {
            if (culturalContextTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: culturalContextTexts is null");
            }
            if (!culturalContextTexts.isPresent()) {
                return culturalContextTexts;
            }
            if (culturalContextTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CULTURAL_CONTEXT_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: culturalContextTexts is less than min length 1");
            }
            return culturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<String> validateDate(final com.google.common.base.Optional<String> date) throws org.thryft.protocol.InputProtocolException {
            if (date == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DATE, "org.dressdiscover.api.models.object.ObjectSummary: date is null");
            }
            if (!date.isPresent()) {
                return date;
            }
            if (date.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DATE, "org.dressdiscover.api.models.object.ObjectSummary: date is less than min length 1");
            }
            return date;
        }

        @Override
        public com.google.common.base.Optional<String> validateDescription(final com.google.common.base.Optional<String> description) throws org.thryft.protocol.InputProtocolException {
            if (description == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DESCRIPTION, "org.dressdiscover.api.models.object.ObjectSummary: description is null");
            }
            if (!description.isPresent()) {
                return description;
            }
            if (description.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION, "org.dressdiscover.api.models.object.ObjectSummary: description is less than min length 1");
            }
            return description;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) throws org.thryft.protocol.InputProtocolException {
            if (gender == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GENDER, "org.dressdiscover.api.models.object.ObjectSummary: gender is null");
            }
            if (!gender.isPresent()) {
                return gender;
            }
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws org.thryft.protocol.InputProtocolException {
            if (!hidden.isPresent()) {
                return hidden;
            }
            if (!hidden.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HIDDEN, "org.dressdiscover.api.models.object.ObjectSummary: hidden is not true");
            }
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) throws org.thryft.protocol.InputProtocolException {
            if (image == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IMAGE, "org.dressdiscover.api.models.object.ObjectSummary: image is null");
            }
            if (!image.isPresent()) {
                return image;
            }
            return image;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) throws org.thryft.protocol.InputProtocolException {
            if (locationNameTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: locationNameTexts is null");
            }
            if (!locationNameTexts.isPresent()) {
                return locationNameTexts;
            }
            if (locationNameTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.LOCATION_NAME_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: locationNameTexts is less than min length 1");
            }
            return locationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) throws org.thryft.protocol.InputProtocolException {
            if (materialTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: materialTexts is null");
            }
            if (!materialTexts.isPresent()) {
                return materialTexts;
            }
            if (materialTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.MATERIAL_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: materialTexts is less than min length 1");
            }
            return materialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) throws org.thryft.protocol.InputProtocolException {
            if (relationTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RELATION_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: relationTexts is null");
            }
            if (!relationTexts.isPresent()) {
                return relationTexts;
            }
            if (relationTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: relationTexts is less than min length 1");
            }
            return relationTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) throws org.thryft.protocol.InputProtocolException {
            if (structureTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: structureTexts is null");
            }
            if (!structureTexts.isPresent()) {
                return structureTexts;
            }
            if (structureTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: structureTexts is less than min length 1");
            }
            return structureTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) throws org.thryft.protocol.InputProtocolException {
            if (subjectTermTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: subjectTermTexts is null");
            }
            if (!subjectTermTexts.isPresent()) {
                return subjectTermTexts;
            }
            if (subjectTermTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.SUBJECT_TERM_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: subjectTermTexts is less than min length 1");
            }
            return subjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) throws org.thryft.protocol.InputProtocolException {
            if (techniqueTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: techniqueTexts is null");
            }
            if (!techniqueTexts.isPresent()) {
                return techniqueTexts;
            }
            if (techniqueTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TECHNIQUE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: techniqueTexts is less than min length 1");
            }
            return techniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) throws org.thryft.protocol.InputProtocolException {
            if (url == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.URL, "org.dressdiscover.api.models.object.ObjectSummary: url is null");
            }
            if (!url.isPresent()) {
                return url;
            }
            return url;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) throws org.thryft.protocol.InputProtocolException {
            if (workTypeTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: workTypeTexts is null");
            }
            if (!workTypeTexts.isPresent()) {
                return workTypeTexts;
            }
            if (workTypeTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXTS, "org.dressdiscover.api.models.object.ObjectSummary: workTypeTexts is less than min length 1");
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
        public org.dressdiscover.api.models.collection.CollectionId validateCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
            return collectionId;
        }

        @Override
        public org.dressdiscover.api.models.institution.InstitutionId validateInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
            return institutionId;
        }

        @Override
        public String validateTitle(final String title) {
            return title;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) {
            return agentNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
            return categories;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) {
            return colorTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) {
            return culturalContextTexts;
        }

        @Override
        public com.google.common.base.Optional<String> validateDate(final com.google.common.base.Optional<String> date) {
            return date;
        }

        @Override
        public com.google.common.base.Optional<String> validateDescription(final com.google.common.base.Optional<String> description) {
            return description;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) {
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) {
            return image;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) {
            return locationNameTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) {
            return materialTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) {
            return relationTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) {
            return structureTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) {
            return subjectTermTexts;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) {
            return techniqueTexts;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            return url;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> validateWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
            return workTypeTexts;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public ObjectSummary(final ObjectSummary other) {
        this(other.getCollectionId(), other.getInstitutionId(), other.getTitle(), other.getAgentNameTexts(), other.getCategories(), other.getColorTexts(), other.getCulturalContextTexts(), other.getDate(), other.getDescription(), other.getGender(), other.getHidden(), other.getImage(), other.getLocationNameTexts(), other.getMaterialTexts(), other.getRelationTexts(), other.getStructureTexts(), other.getSubjectTermTexts(), other.getTechniqueTexts(), other.getUrl(), other.getWorkTypeTexts(), NopConstructionValidator.getInstance());
    }

    protected ObjectSummary(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts, ConstructionValidator validator) {
        this.collectionId = validator.validateCollectionId(collectionId);
        this.institutionId = validator.validateInstitutionId(institutionId);
        this.title = validator.validateTitle(title);
        this.agentNameTexts = validator.validateAgentNameTexts(agentNameTexts);
        this.categories = validator.validateCategories(categories);
        this.colorTexts = validator.validateColorTexts(colorTexts);
        this.culturalContextTexts = validator.validateCulturalContextTexts(culturalContextTexts);
        this.date = validator.validateDate(date);
        this.description = validator.validateDescription(description);
        this.gender = validator.validateGender(gender);
        this.hidden = validator.validateHidden(hidden);
        this.image = validator.validateImage(image);
        this.locationNameTexts = validator.validateLocationNameTexts(locationNameTexts);
        this.materialTexts = validator.validateMaterialTexts(materialTexts);
        this.relationTexts = validator.validateRelationTexts(relationTexts);
        this.structureTexts = validator.validateStructureTexts(structureTexts);
        this.subjectTermTexts = validator.validateSubjectTermTexts(subjectTermTexts);
        this.techniqueTexts = validator.validateTechniqueTexts(techniqueTexts);
        this.url = validator.validateUrl(url);
        this.workTypeTexts = validator.validateWorkTypeTexts(workTypeTexts);
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
        return new ObjectSummary(collectionId, institutionId, title, com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.gender.Gender> absent(), com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.image.Image> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), com.google.common.base.Optional.<org.thryft.native_.Url> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static ObjectSummary create(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> agentNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> categories, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> colorTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> culturalContextTexts, final @javax.annotation.Nullable String date, final @javax.annotation.Nullable String description, final @javax.annotation.Nullable org.dressdiscover.api.models.gender.Gender gender, final @javax.annotation.Nullable Boolean hidden, final @javax.annotation.Nullable org.dressdiscover.api.models.image.Image image, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> locationNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> materialTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> relationTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableMap<String, String> structureTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> subjectTermTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> techniqueTexts, final @javax.annotation.Nullable org.thryft.native_.Url url, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> workTypeTexts) {
        return new ObjectSummary(collectionId, institutionId, title, com.google.common.base.Optional.fromNullable(agentNameTexts), com.google.common.base.Optional.fromNullable(categories), com.google.common.base.Optional.fromNullable(colorTexts), com.google.common.base.Optional.fromNullable(culturalContextTexts), com.google.common.base.Optional.fromNullable(date), com.google.common.base.Optional.fromNullable(description), com.google.common.base.Optional.fromNullable(gender), com.google.common.base.Optional.fromNullable(hidden), com.google.common.base.Optional.fromNullable(image), com.google.common.base.Optional.fromNullable(locationNameTexts), com.google.common.base.Optional.fromNullable(materialTexts), com.google.common.base.Optional.fromNullable(relationTexts), com.google.common.base.Optional.fromNullable(structureTexts), com.google.common.base.Optional.fromNullable(subjectTermTexts), com.google.common.base.Optional.fromNullable(techniqueTexts), com.google.common.base.Optional.fromNullable(url), com.google.common.base.Optional.fromNullable(workTypeTexts), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static ObjectSummary create(final org.dressdiscover.api.models.collection.CollectionId collectionId, final org.dressdiscover.api.models.institution.InstitutionId institutionId, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
        return new ObjectSummary(collectionId, institutionId, title, agentNameTexts, categories, colorTexts, culturalContextTexts, date, description, gender, hidden, image, locationNameTexts, materialTexts, relationTexts, structureTexts, subjectTermTexts, techniqueTexts, url, workTypeTexts, DefaultConstructionValidator.getInstance());
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
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<String> date = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender = com.google.common.base.Optional.<org.dressdiscover.api.models.gender.Gender> absent();
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
        return new ObjectSummary(DefaultReadValidator.getInstance().validateCollectionId(collectionId), DefaultReadValidator.getInstance().validateInstitutionId(institutionId), DefaultReadValidator.getInstance().validateTitle(title), DefaultReadValidator.getInstance().validateAgentNameTexts(agentNameTexts), DefaultReadValidator.getInstance().validateCategories(categories), DefaultReadValidator.getInstance().validateColorTexts(colorTexts), DefaultReadValidator.getInstance().validateCulturalContextTexts(culturalContextTexts), DefaultReadValidator.getInstance().validateDate(date), DefaultReadValidator.getInstance().validateDescription(description), DefaultReadValidator.getInstance().validateGender(gender), DefaultReadValidator.getInstance().validateHidden(hidden), DefaultReadValidator.getInstance().validateImage(image), DefaultReadValidator.getInstance().validateLocationNameTexts(locationNameTexts), DefaultReadValidator.getInstance().validateMaterialTexts(materialTexts), DefaultReadValidator.getInstance().validateRelationTexts(relationTexts), DefaultReadValidator.getInstance().validateStructureTexts(structureTexts), DefaultReadValidator.getInstance().validateSubjectTermTexts(subjectTermTexts), DefaultReadValidator.getInstance().validateTechniqueTexts(techniqueTexts), DefaultReadValidator.getInstance().validateUrl(url), DefaultReadValidator.getInstance().validateWorkTypeTexts(workTypeTexts), NopConstructionValidator.getInstance());
    }

    public static ObjectSummary readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectSummary readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.dressdiscover.api.models.collection.CollectionId collectionId = null;
        org.dressdiscover.api.models.institution.InstitutionId institutionId = null;
        String title = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        com.google.common.base.Optional<String> date = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender = com.google.common.base.Optional.<org.dressdiscover.api.models.gender.Gender> absent();
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
        return new ObjectSummary(DefaultReadValidator.getInstance().validateCollectionId(collectionId), DefaultReadValidator.getInstance().validateInstitutionId(institutionId), DefaultReadValidator.getInstance().validateTitle(title), DefaultReadValidator.getInstance().validateAgentNameTexts(agentNameTexts), DefaultReadValidator.getInstance().validateCategories(categories), DefaultReadValidator.getInstance().validateColorTexts(colorTexts), DefaultReadValidator.getInstance().validateCulturalContextTexts(culturalContextTexts), DefaultReadValidator.getInstance().validateDate(date), DefaultReadValidator.getInstance().validateDescription(description), DefaultReadValidator.getInstance().validateGender(gender), DefaultReadValidator.getInstance().validateHidden(hidden), DefaultReadValidator.getInstance().validateImage(image), DefaultReadValidator.getInstance().validateLocationNameTexts(locationNameTexts), DefaultReadValidator.getInstance().validateMaterialTexts(materialTexts), DefaultReadValidator.getInstance().validateRelationTexts(relationTexts), DefaultReadValidator.getInstance().validateStructureTexts(structureTexts), DefaultReadValidator.getInstance().validateSubjectTermTexts(subjectTermTexts), DefaultReadValidator.getInstance().validateTechniqueTexts(techniqueTexts), DefaultReadValidator.getInstance().validateUrl(url), DefaultReadValidator.getInstance().validateWorkTypeTexts(workTypeTexts), NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, DefaultConstructionValidator.getInstance().validateAgentNameTexts(agentNameTexts), this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceAgentNameTexts(final com.google.common.collect.ImmutableList<String> agentNameTexts) {
        return replaceAgentNameTexts(com.google.common.base.Optional.fromNullable(agentNameTexts));
    }

    public ObjectSummary replaceCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, DefaultConstructionValidator.getInstance().validateCategories(categories), this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceCategories(final com.google.common.collect.ImmutableList<String> categories) {
        return replaceCategories(com.google.common.base.Optional.fromNullable(categories));
    }

    public ObjectSummary replaceCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
        return new ObjectSummary(DefaultConstructionValidator.getInstance().validateCollectionId(collectionId), this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceColorTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> colorTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, DefaultConstructionValidator.getInstance().validateColorTexts(colorTexts), this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceColorTexts(final com.google.common.collect.ImmutableList<String> colorTexts) {
        return replaceColorTexts(com.google.common.base.Optional.fromNullable(colorTexts));
    }

    public ObjectSummary replaceCulturalContextTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> culturalContextTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, DefaultConstructionValidator.getInstance().validateCulturalContextTexts(culturalContextTexts), this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceCulturalContextTexts(final com.google.common.collect.ImmutableList<String> culturalContextTexts) {
        return replaceCulturalContextTexts(com.google.common.base.Optional.fromNullable(culturalContextTexts));
    }

    public ObjectSummary replaceDate(final com.google.common.base.Optional<String> date) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, DefaultConstructionValidator.getInstance().validateDate(date), this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceDate(final String date) {
        return replaceDate(com.google.common.base.Optional.fromNullable(date));
    }

    public ObjectSummary replaceDescription(final com.google.common.base.Optional<String> description) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, DefaultConstructionValidator.getInstance().validateDescription(description), this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceDescription(final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public ObjectSummary replaceGender(final com.google.common.base.Optional<org.dressdiscover.api.models.gender.Gender> gender) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, DefaultConstructionValidator.getInstance().validateGender(gender), this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceGender(final org.dressdiscover.api.models.gender.Gender gender) {
        return replaceGender(com.google.common.base.Optional.fromNullable(gender));
    }

    public ObjectSummary replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, DefaultConstructionValidator.getInstance().validateHidden(hidden), this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceHidden(final boolean hidden) {
        return replaceHidden(com.google.common.base.Optional.fromNullable(hidden));
    }

    public ObjectSummary replaceImage(final com.google.common.base.Optional<org.dressdiscover.api.models.image.Image> image) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, DefaultConstructionValidator.getInstance().validateImage(image), this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceImage(final org.dressdiscover.api.models.image.Image image) {
        return replaceImage(com.google.common.base.Optional.fromNullable(image));
    }

    public ObjectSummary replaceInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
        return new ObjectSummary(this.collectionId, DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId), this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceLocationNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> locationNameTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, DefaultConstructionValidator.getInstance().validateLocationNameTexts(locationNameTexts), this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceLocationNameTexts(final com.google.common.collect.ImmutableList<String> locationNameTexts) {
        return replaceLocationNameTexts(com.google.common.base.Optional.fromNullable(locationNameTexts));
    }

    public ObjectSummary replaceMaterialTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> materialTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, DefaultConstructionValidator.getInstance().validateMaterialTexts(materialTexts), this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceMaterialTexts(final com.google.common.collect.ImmutableList<String> materialTexts) {
        return replaceMaterialTexts(com.google.common.base.Optional.fromNullable(materialTexts));
    }

    public ObjectSummary replaceRelationTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> relationTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, DefaultConstructionValidator.getInstance().validateRelationTexts(relationTexts), this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceRelationTexts(final com.google.common.collect.ImmutableList<String> relationTexts) {
        return replaceRelationTexts(com.google.common.base.Optional.fromNullable(relationTexts));
    }

    public ObjectSummary replaceStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, String>> structureTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, DefaultConstructionValidator.getInstance().validateStructureTexts(structureTexts), this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceStructureTexts(final com.google.common.collect.ImmutableMap<String, String> structureTexts) {
        return replaceStructureTexts(com.google.common.base.Optional.fromNullable(structureTexts));
    }

    public ObjectSummary replaceSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, DefaultConstructionValidator.getInstance().validateSubjectTermTexts(subjectTermTexts), this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceSubjectTermTexts(final com.google.common.collect.ImmutableList<String> subjectTermTexts) {
        return replaceSubjectTermTexts(com.google.common.base.Optional.fromNullable(subjectTermTexts));
    }

    public ObjectSummary replaceTechniqueTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> techniqueTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, DefaultConstructionValidator.getInstance().validateTechniqueTexts(techniqueTexts), this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceTechniqueTexts(final com.google.common.collect.ImmutableList<String> techniqueTexts) {
        return replaceTechniqueTexts(com.google.common.base.Optional.fromNullable(techniqueTexts));
    }

    public ObjectSummary replaceTitle(final String title) {
        return new ObjectSummary(this.collectionId, this.institutionId, DefaultConstructionValidator.getInstance().validateTitle(title), this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, DefaultConstructionValidator.getInstance().validateUrl(url), this.workTypeTexts, NopConstructionValidator.getInstance());
    }

    public ObjectSummary replaceUrl(final org.thryft.native_.Url url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    public ObjectSummary replaceWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.title, this.agentNameTexts, this.categories, this.colorTexts, this.culturalContextTexts, this.date, this.description, this.gender, this.hidden, this.image, this.locationNameTexts, this.materialTexts, this.relationTexts, this.structureTexts, this.subjectTermTexts, this.techniqueTexts, this.url, DefaultConstructionValidator.getInstance().validateWorkTypeTexts(workTypeTexts), NopConstructionValidator.getInstance());
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
