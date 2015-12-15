package net.lab1318.costume.api.models.object;

public class ObjectSummary implements org.thryft.Struct, org.notaweb.api.models.Model {
    public static class Builder {
        public Builder() {
            collectionId = null;
            institutionId = null;
            modelMetadata = null;
            title = null;
            agentNameTexts = com.google.common.base.Optional.absent();
            categories = com.google.common.base.Optional.absent();
            date = com.google.common.base.Optional.absent();
            description = com.google.common.base.Optional.absent();
            gender = com.google.common.base.Optional.absent();
            subjectTermTexts = com.google.common.base.Optional.absent();
            thumbnail = com.google.common.base.Optional.absent();
            url = com.google.common.base.Optional.absent();
            workTypeTexts = com.google.common.base.Optional.absent();
        }

        public Builder(final ObjectSummary other) {
            this.collectionId = other.getCollectionId();
            this.institutionId = other.getInstitutionId();
            this.modelMetadata = other.getModelMetadata();
            this.title = other.getTitle();
            this.agentNameTexts = other.getAgentNameTexts();
            this.categories = other.getCategories();
            this.date = other.getDate();
            this.description = other.getDescription();
            this.gender = other.getGender();
            this.subjectTermTexts = other.getSubjectTermTexts();
            this.thumbnail = other.getThumbnail();
            this.url = other.getUrl();
            this.workTypeTexts = other.getWorkTypeTexts();
        }

        protected ObjectSummary _build(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
            return new ObjectSummary(collectionId, institutionId, modelMetadata, title, agentNameTexts, categories, date, description, gender, subjectTermTexts, thumbnail, url, workTypeTexts);
        }

        public ObjectSummary build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.ObjectSummary: missing collectionId"), com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.ObjectSummary: missing institutionId"), com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.object.ObjectSummary: missing modelMetadata"), com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.ObjectSummary: missing title"), com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.models.object.ObjectSummary: missing agentNameTexts"), com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.models.object.ObjectSummary: missing categories"), com.google.common.base.Preconditions.checkNotNull(date, "net.lab1318.costume.api.models.object.ObjectSummary: missing date"), com.google.common.base.Preconditions.checkNotNull(description, "net.lab1318.costume.api.models.object.ObjectSummary: missing description"), com.google.common.base.Preconditions.checkNotNull(gender, "net.lab1318.costume.api.models.object.ObjectSummary: missing gender"), com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.models.object.ObjectSummary: missing subjectTermTexts"), com.google.common.base.Preconditions.checkNotNull(thumbnail, "net.lab1318.costume.api.models.object.ObjectSummary: missing thumbnail"), com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.object.ObjectSummary: missing url"), com.google.common.base.Preconditions.checkNotNull(workTypeTexts, "net.lab1318.costume.api.models.object.ObjectSummary: missing workTypeTexts"));
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAgentNameTexts() {
            return agentNameTexts;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCategories() {
            return categories;
        }

        public final net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
            return collectionId;
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

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> getGender() {
            return gender;
        }

        public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
            return institutionId;
        }

        public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
            return modelMetadata;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSubjectTermTexts() {
            return subjectTermTexts;
        }

        public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getThumbnail() {
            return thumbnail;
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
            try {
                collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            try {
                institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
            } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                 throw new org.thryft.protocol.InputProtocolException(e);
            }
            modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
            title = iprot.readString();
            if (__list.getSize() > 4) {
                try {
                    agentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readListEnd();
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
                    categories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readListEnd();
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
                date = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 7) {
                description = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 8) {
                try {
                    gender = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                } catch (final IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 9) {
                try {
                    subjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readListEnd();
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
                thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
            }
            if (__list.getSize() > 11) {
                try {
                    url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
            if (__list.getSize() > 12) {
                try {
                    workTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
                case "collection_id": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
                        }
                    }
                    break;
                }
                case "institution_id": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                             throw new org.thryft.protocol.InputProtocolException(e);
                        }
                    }
                    break;
                }
                case "model_metadata": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
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
                                        final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequence.add(iprot.readString());
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
                                        final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequence.add(iprot.readString());
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
                            gender = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                        } catch (final IllegalArgumentException e) {
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
                                        final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequence.add(iprot.readString());
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                        }
                    }
                    break;
                }
                case "thumbnail": {
                    if (!ifield.hasId() || ifield.getId() == 10) {
                        thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
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
                                        final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequence.add(iprot.readString());
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                        }
                    }
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
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

        public Builder setCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
            this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId);
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

        public Builder setGender(final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender) {
            this.gender = com.google.common.base.Preconditions.checkNotNull(gender);
            return this;
        }

        public Builder setGender(@javax.annotation.Nullable final net.lab1318.costume.api.models.gender.Gender gender) {
            this.gender = com.google.common.base.Optional.fromNullable(gender);
            return this;
        }

        public Builder setIfPresent(final ObjectSummary other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCollectionId(other.getCollectionId());
            setInstitutionId(other.getInstitutionId());
            setModelMetadata(other.getModelMetadata());
            setTitle(other.getTitle());
            if (other.getAgentNameTexts().isPresent()) {
                setAgentNameTexts(other.getAgentNameTexts());
            }
            if (other.getCategories().isPresent()) {
                setCategories(other.getCategories());
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
            if (other.getSubjectTermTexts().isPresent()) {
                setSubjectTermTexts(other.getSubjectTermTexts());
            }
            if (other.getThumbnail().isPresent()) {
                setThumbnail(other.getThumbnail());
            }
            if (other.getUrl().isPresent()) {
                setUrl(other.getUrl());
            }
            if (other.getWorkTypeTexts().isPresent()) {
                setWorkTypeTexts(other.getWorkTypeTexts());
            }

            return this;
        }

        public Builder setInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
            this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId);
            return this;
        }

        public Builder setModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
            this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata);
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

        public Builder setThumbnail(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail) {
            this.thumbnail = com.google.common.base.Preconditions.checkNotNull(thumbnail);
            return this;
        }

        public Builder setThumbnail(@javax.annotation.Nullable final net.lab1318.costume.api.models.image.ImageVersion thumbnail) {
            this.thumbnail = com.google.common.base.Optional.fromNullable(thumbnail);
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

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "collection_id": setCollectionId((net.lab1318.costume.api.models.collection.CollectionId)value); return this;
            case "institution_id": setInstitutionId((net.lab1318.costume.api.models.institution.InstitutionId)value); return this;
            case "model_metadata": setModelMetadata((net.lab1318.costume.api.models.ModelMetadata)value); return this;
            case "title": setTitle((String)value); return this;
            case "agent_name_texts": setAgentNameTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            case "categories": setCategories((com.google.common.collect.ImmutableList<String>)value); return this;
            case "date": setDate((String)value); return this;
            case "description": setDescription((String)value); return this;
            case "gender": setGender((net.lab1318.costume.api.models.gender.Gender)value); return this;
            case "subject_term_texts": setSubjectTermTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            case "thumbnail": setThumbnail((net.lab1318.costume.api.models.image.ImageVersion)value); return this;
            case "url": setUrl((org.thryft.native_.Url)value); return this;
            case "work_type_texts": setWorkTypeTexts((com.google.common.collect.ImmutableList<String>)value); return this;
            default:
                throw new IllegalArgumentException(name);
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

        public Builder unsetInstitutionId() {
            this.institutionId = null;
            return this;
        }

        public Builder unsetModelMetadata() {
            this.modelMetadata = null;
            return this;
        }

        public Builder unsetSubjectTermTexts() {
            this.subjectTermTexts = com.google.common.base.Optional.absent();
            return this;
        }

        public Builder unsetThumbnail() {
            this.thumbnail = com.google.common.base.Optional.absent();
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

        private net.lab1318.costume.api.models.collection.CollectionId collectionId;
        private net.lab1318.costume.api.models.institution.InstitutionId institutionId;
        private net.lab1318.costume.api.models.ModelMetadata modelMetadata;
        /**
         * Dublin Core title
         */
        private String title;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories;
        /**
         * Dublin Core date
         */
        private com.google.common.base.Optional<String> date;
        /**
         * Dublin Core description
         */
        private com.google.common.base.Optional<String> description;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts;
        private com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail;
        private com.google.common.base.Optional<org.thryft.native_.Url> url;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.collection.CollectionId>() {}, true, 1, "collection_id", org.thryft.protocol.Type.STRING),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.institution.InstitutionId>() {}, true, 2, "institution_id", org.thryft.protocol.Type.STRING),
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.ModelMetadata>() {}, true, 3, "model_metadata", org.thryft.protocol.Type.STRUCT),
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 4, "title", org.thryft.protocol.Type.STRING),
        AGENT_NAME_TEXTS("agentNameTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 6, "agent_name_texts", org.thryft.protocol.Type.LIST),
        CATEGORIES("categories", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 7, "categories", org.thryft.protocol.Type.LIST),
        DATE("date", new com.google.common.reflect.TypeToken<String>() {}, false, 12, "date", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, 5, "description", org.thryft.protocol.Type.STRING),
        GENDER("gender", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.gender.Gender>() {}, false, 8, "gender", org.thryft.protocol.Type.STRING),
        SUBJECT_TERM_TEXTS("subjectTermTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, 9, "subject_term_texts", org.thryft.protocol.Type.LIST),
        THUMBNAIL("thumbnail", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.image.ImageVersion>() {}, false, 10, "thumbnail", org.thryft.protocol.Type.STRUCT),
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
            case "modelMetadata": return MODEL_METADATA;
            case "title": return TITLE;
            case "agentNameTexts": return AGENT_NAME_TEXTS;
            case "categories": return CATEGORIES;
            case "date": return DATE;
            case "description": return DESCRIPTION;
            case "gender": return GENDER;
            case "subjectTermTexts": return SUBJECT_TERM_TEXTS;
            case "thumbnail": return THUMBNAIL;
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
            case "model_metadata": return MODEL_METADATA;
            case "title": return TITLE;
            case "agent_name_texts": return AGENT_NAME_TEXTS;
            case "categories": return CATEGORIES;
            case "date": return DATE;
            case "description": return DESCRIPTION;
            case "gender": return GENDER;
            case "subject_term_texts": return SUBJECT_TERM_TEXTS;
            case "thumbnail": return THUMBNAIL;
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
        this(other.getCollectionId(), other.getInstitutionId(), other.getModelMetadata(), other.getTitle(), other.getAgentNameTexts(), other.getCategories(), other.getDate(), other.getDescription(), other.getGender(), other.getSubjectTermTexts(), other.getThumbnail(), other.getUrl(), other.getWorkTypeTexts());
    }

    /**
     * Required constructor
     */
    public ObjectSummary(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.ObjectSummary: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.ObjectSummary: missing institutionId");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.object.ObjectSummary: missing modelMetadata");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.ObjectSummary: missing title"), "net.lab1318.costume.api.models.object.ObjectSummary: title is empty");
        this.agentNameTexts = com.google.common.base.Optional.absent();
        this.categories = com.google.common.base.Optional.absent();
        this.date = com.google.common.base.Optional.absent();
        this.description = com.google.common.base.Optional.absent();
        this.gender = com.google.common.base.Optional.absent();
        this.subjectTermTexts = com.google.common.base.Optional.absent();
        this.thumbnail = com.google.common.base.Optional.absent();
        this.url = com.google.common.base.Optional.absent();
        this.workTypeTexts = com.google.common.base.Optional.absent();
    }

    /**
     * Total Nullable constructor
     */
    public ObjectSummary(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> agentNameTexts, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> categories, final @javax.annotation.Nullable String date, final @javax.annotation.Nullable String description, final @javax.annotation.Nullable net.lab1318.costume.api.models.gender.Gender gender, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> subjectTermTexts, final @javax.annotation.Nullable net.lab1318.costume.api.models.image.ImageVersion thumbnail, final @javax.annotation.Nullable org.thryft.native_.Url url, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> workTypeTexts) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.ObjectSummary: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.ObjectSummary: missing institutionId");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.object.ObjectSummary: missing modelMetadata");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.ObjectSummary: missing title"), "net.lab1318.costume.api.models.object.ObjectSummary: title is empty");
        this.agentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(agentNameTexts), "net.lab1318.costume.api.models.object.ObjectSummary: agentNameTexts is empty");
        this.categories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(categories), "net.lab1318.costume.api.models.object.ObjectSummary: categories is empty");
        this.date = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(date), "net.lab1318.costume.api.models.object.ObjectSummary: date is empty");
        this.description = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Optional.fromNullable(description), "net.lab1318.costume.api.models.object.ObjectSummary: description is empty");
        this.gender = com.google.common.base.Optional.fromNullable(gender);
        this.subjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(subjectTermTexts), "net.lab1318.costume.api.models.object.ObjectSummary: subjectTermTexts is empty");
        this.thumbnail = com.google.common.base.Optional.fromNullable(thumbnail);
        this.url = com.google.common.base.Optional.fromNullable(url);
        this.workTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Optional.fromNullable(workTypeTexts), "net.lab1318.costume.api.models.object.ObjectSummary: workTypeTexts is empty");
    }

    /**
     * Optional constructor
     */
    public ObjectSummary(final net.lab1318.costume.api.models.collection.CollectionId collectionId, final net.lab1318.costume.api.models.institution.InstitutionId institutionId, final net.lab1318.costume.api.models.ModelMetadata modelMetadata, final String title, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories, final com.google.common.base.Optional<String> date, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts, final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
        this.collectionId = com.google.common.base.Preconditions.checkNotNull(collectionId, "net.lab1318.costume.api.models.object.ObjectSummary: missing collectionId");
        this.institutionId = com.google.common.base.Preconditions.checkNotNull(institutionId, "net.lab1318.costume.api.models.object.ObjectSummary: missing institutionId");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.object.ObjectSummary: missing modelMetadata");
        this.title = org.thryft.Preconditions.checkStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(title, "net.lab1318.costume.api.models.object.ObjectSummary: missing title"), "net.lab1318.costume.api.models.object.ObjectSummary: title is empty");
        this.agentNameTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(agentNameTexts, "net.lab1318.costume.api.models.object.ObjectSummary: missing agentNameTexts"), "net.lab1318.costume.api.models.object.ObjectSummary: agentNameTexts is empty");
        this.categories = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(categories, "net.lab1318.costume.api.models.object.ObjectSummary: missing categories"), "net.lab1318.costume.api.models.object.ObjectSummary: categories is empty");
        this.date = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(date, "net.lab1318.costume.api.models.object.ObjectSummary: missing date"), "net.lab1318.costume.api.models.object.ObjectSummary: date is empty");
        this.description = org.thryft.Preconditions.checkOptionalStringNotEmpty(com.google.common.base.Preconditions.checkNotNull(description, "net.lab1318.costume.api.models.object.ObjectSummary: missing description"), "net.lab1318.costume.api.models.object.ObjectSummary: description is empty");
        this.gender = com.google.common.base.Preconditions.checkNotNull(gender, "net.lab1318.costume.api.models.object.ObjectSummary: missing gender");
        this.subjectTermTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(subjectTermTexts, "net.lab1318.costume.api.models.object.ObjectSummary: missing subjectTermTexts"), "net.lab1318.costume.api.models.object.ObjectSummary: subjectTermTexts is empty");
        this.thumbnail = com.google.common.base.Preconditions.checkNotNull(thumbnail, "net.lab1318.costume.api.models.object.ObjectSummary: missing thumbnail");
        this.url = com.google.common.base.Preconditions.checkNotNull(url, "net.lab1318.costume.api.models.object.ObjectSummary: missing url");
        this.workTypeTexts = org.thryft.Preconditions.checkOptionalCollectionNotEmpty(com.google.common.base.Preconditions.checkNotNull(workTypeTexts, "net.lab1318.costume.api.models.object.ObjectSummary: missing workTypeTexts"), "net.lab1318.costume.api.models.object.ObjectSummary: workTypeTexts is empty");
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
            getModelMetadata().equals(other.getModelMetadata()) &&
            getTitle().equals(other.getTitle()) &&
            getAgentNameTexts().equals(other.getAgentNameTexts()) &&
            getCategories().equals(other.getCategories()) &&
            getDate().equals(other.getDate()) &&
            getDescription().equals(other.getDescription()) &&
            getGender().equals(other.getGender()) &&
            getSubjectTermTexts().equals(other.getSubjectTermTexts()) &&
            getThumbnail().equals(other.getThumbnail()) &&
            getUrl().equals(other.getUrl()) &&
            getWorkTypeTexts().equals(other.getWorkTypeTexts());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "collection_id": return getCollectionId();
        case "institution_id": return getInstitutionId();
        case "model_metadata": return getModelMetadata();
        case "title": return getTitle();
        case "agent_name_texts": return getAgentNameTexts();
        case "categories": return getCategories();
        case "date": return getDate();
        case "description": return getDescription();
        case "gender": return getGender();
        case "subject_term_texts": return getSubjectTermTexts();
        case "thumbnail": return getThumbnail();
        case "url": return getUrl();
        case "work_type_texts": return getWorkTypeTexts();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getAgentNameTexts() {
        return agentNameTexts;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getCategories() {
        return categories;
    }

    public final net.lab1318.costume.api.models.collection.CollectionId getCollectionId() {
        return collectionId;
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

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> getGender() {
        return gender;
    }

    public final net.lab1318.costume.api.models.institution.InstitutionId getInstitutionId() {
        return institutionId;
    }

    public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
        return modelMetadata;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getSubjectTermTexts() {
        return subjectTermTexts;
    }

    public final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> getThumbnail() {
        return thumbnail;
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
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getAgentNameTexts().isPresent()) {
            hashCode = 31 * hashCode + getAgentNameTexts().get().hashCode();
        }
        if (getCategories().isPresent()) {
            hashCode = 31 * hashCode + getCategories().get().hashCode();
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
        if (getSubjectTermTexts().isPresent()) {
            hashCode = 31 * hashCode + getSubjectTermTexts().get().hashCode();
        }
        if (getThumbnail().isPresent()) {
            hashCode = 31 * hashCode + getThumbnail().get().hashCode();
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
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectSummary readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.collection.CollectionId collectionId = null;
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        String title = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> date = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts = com.google.common.base.Optional.absent();

        final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
        try {
            collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        try {
            institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
        } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
             throw new org.thryft.protocol.InputProtocolException(e);
        }
        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
        title = iprot.readString();
        if (__list.getSize() > 4) {
            try {
                agentNameTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readListEnd();
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
                categories = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readListEnd();
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
            date = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 7) {
            description = com.google.common.base.Optional.of(iprot.readString());
        }
        if (__list.getSize() > 8) {
            try {
                gender = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
            } catch (final IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 9) {
            try {
                subjectTermTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readListEnd();
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
            thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
        }
        if (__list.getSize() > 11) {
            try {
                url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
            } catch (final java.lang.IllegalArgumentException e) {
            }
        }
        if (__list.getSize() > 12) {
            try {
                workTypeTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readListEnd();
                            return sequence.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot));
            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
            }
        }
        iprot.readListEnd();
        try {
            return new ObjectSummary(collectionId, institutionId, modelMetadata, title, agentNameTexts, categories, date, description, gender, subjectTermTexts, thumbnail, url, workTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static ObjectSummary readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        net.lab1318.costume.api.models.collection.CollectionId collectionId = null;
        net.lab1318.costume.api.models.institution.InstitutionId institutionId = null;
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;
        String title = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> date = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail = com.google.common.base.Optional.absent();
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
                        collectionId = net.lab1318.costume.api.models.collection.CollectionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.collection.InvalidCollectionIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                }
                break;
            }
            case "institution_id": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    try {
                        institutionId = net.lab1318.costume.api.models.institution.InstitutionId.parse(iprot.readString());
                    } catch (final net.lab1318.costume.api.models.institution.InvalidInstitutionIdException e) {
                         throw new org.thryft.protocol.InputProtocolException(e);
                    }
                }
                break;
            }
            case "model_metadata": {
                if (!ifield.hasId() || ifield.getId() == 3) {
                    modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
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
                                    final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
                                    final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
                        gender = com.google.common.base.Optional.of(iprot.readEnum(net.lab1318.costume.api.models.gender.Gender.class));
                    } catch (final IllegalArgumentException e) {
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
                                    final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                }
                break;
            }
            case "thumbnail": {
                if (!ifield.hasId() || ifield.getId() == 10) {
                    thumbnail = com.google.common.base.Optional.of(net.lab1318.costume.api.models.image.ImageVersion.readAsStruct(iprot));
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
                                    final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                    }
                }
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new ObjectSummary(collectionId, institutionId, modelMetadata, title, agentNameTexts, categories, date, description, gender, subjectTermTexts, thumbnail, url, workTypeTexts);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public ObjectSummary replaceAgentNameTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.modelMetadata, this.title, agentNameTexts, this.categories, this.date, this.description, this.gender, this.subjectTermTexts, this.thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceAgentNameTexts(final com.google.common.collect.ImmutableList<String> agentNameTexts) {
        return replaceAgentNameTexts(com.google.common.base.Optional.fromNullable(agentNameTexts));
    }

    public ObjectSummary replaceCategories(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.modelMetadata, this.title, this.agentNameTexts, categories, this.date, this.description, this.gender, this.subjectTermTexts, this.thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceCategories(final com.google.common.collect.ImmutableList<String> categories) {
        return replaceCategories(com.google.common.base.Optional.fromNullable(categories));
    }

    public ObjectSummary replaceCollectionId(final net.lab1318.costume.api.models.collection.CollectionId collectionId) {
        return new ObjectSummary(collectionId, this.institutionId, this.modelMetadata, this.title, this.agentNameTexts, this.categories, this.date, this.description, this.gender, this.subjectTermTexts, this.thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceDate(final com.google.common.base.Optional<String> date) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.modelMetadata, this.title, this.agentNameTexts, this.categories, date, this.description, this.gender, this.subjectTermTexts, this.thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceDate(final String date) {
        return replaceDate(com.google.common.base.Optional.fromNullable(date));
    }

    public ObjectSummary replaceDescription(final com.google.common.base.Optional<String> description) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.modelMetadata, this.title, this.agentNameTexts, this.categories, this.date, description, this.gender, this.subjectTermTexts, this.thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceDescription(final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public ObjectSummary replaceGender(final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.modelMetadata, this.title, this.agentNameTexts, this.categories, this.date, this.description, gender, this.subjectTermTexts, this.thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceGender(final net.lab1318.costume.api.models.gender.Gender gender) {
        return replaceGender(com.google.common.base.Optional.fromNullable(gender));
    }

    public ObjectSummary replaceInstitutionId(final net.lab1318.costume.api.models.institution.InstitutionId institutionId) {
        return new ObjectSummary(this.collectionId, institutionId, this.modelMetadata, this.title, this.agentNameTexts, this.categories, this.date, this.description, this.gender, this.subjectTermTexts, this.thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
        return new ObjectSummary(this.collectionId, this.institutionId, modelMetadata, this.title, this.agentNameTexts, this.categories, this.date, this.description, this.gender, this.subjectTermTexts, this.thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceSubjectTermTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.modelMetadata, this.title, this.agentNameTexts, this.categories, this.date, this.description, this.gender, subjectTermTexts, this.thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceSubjectTermTexts(final com.google.common.collect.ImmutableList<String> subjectTermTexts) {
        return replaceSubjectTermTexts(com.google.common.base.Optional.fromNullable(subjectTermTexts));
    }

    public ObjectSummary replaceThumbnail(final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.modelMetadata, this.title, this.agentNameTexts, this.categories, this.date, this.description, this.gender, this.subjectTermTexts, thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceThumbnail(final net.lab1318.costume.api.models.image.ImageVersion thumbnail) {
        return replaceThumbnail(com.google.common.base.Optional.fromNullable(thumbnail));
    }

    public ObjectSummary replaceTitle(final String title) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.modelMetadata, title, this.agentNameTexts, this.categories, this.date, this.description, this.gender, this.subjectTermTexts, this.thumbnail, this.url, this.workTypeTexts);
    }

    public ObjectSummary replaceUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.modelMetadata, this.title, this.agentNameTexts, this.categories, this.date, this.description, this.gender, this.subjectTermTexts, this.thumbnail, url, this.workTypeTexts);
    }

    public ObjectSummary replaceUrl(final org.thryft.native_.Url url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    public ObjectSummary replaceWorkTypeTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts) {
        return new ObjectSummary(this.collectionId, this.institutionId, this.modelMetadata, this.title, this.agentNameTexts, this.categories, this.date, this.description, this.gender, this.subjectTermTexts, this.thumbnail, this.url, workTypeTexts);
    }

    public ObjectSummary replaceWorkTypeTexts(final com.google.common.collect.ImmutableList<String> workTypeTexts) {
        return replaceWorkTypeTexts(com.google.common.base.Optional.fromNullable(workTypeTexts));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId()).add("institution_id", getInstitutionId()).add("model_metadata", getModelMetadata()).add("title", getTitle()).add("agent_name_texts", getAgentNameTexts().orNull()).add("categories", getCategories().orNull()).add("date", getDate().orNull()).add("description", getDescription().orNull()).add("gender", getGender().orNull()).add("subject_term_texts", getSubjectTermTexts().orNull()).add("thumbnail", getThumbnail().orNull()).add("url", getUrl().orNull()).add("work_type_texts", getWorkTypeTexts().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 13);

        oprot.writeString(getCollectionId().toString());

        oprot.writeString(getInstitutionId().toString());

        getModelMetadata().writeAsStruct(oprot);

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

        if (getSubjectTermTexts().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSubjectTermTexts().get().size());
            for (final String _iter0 : getSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getThumbnail().isPresent()) {
            getThumbnail().get().writeAsStruct(oprot);
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
        oprot.writeStructBegin("net.lab1318.costume.api.models.object.ObjectSummary");
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

        oprot.writeFieldBegin("model_metadata", org.thryft.protocol.Type.STRUCT, (short)3);
        getModelMetadata().writeAsStruct(oprot);
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

        if (getSubjectTermTexts().isPresent()) {
            oprot.writeFieldBegin("subject_term_texts", org.thryft.protocol.Type.LIST, (short)9);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getSubjectTermTexts().get().size());
            for (final String _iter0 : getSubjectTermTexts().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getThumbnail().isPresent()) {
            oprot.writeFieldBegin("thumbnail", org.thryft.protocol.Type.STRUCT, (short)10);
            getThumbnail().get().writeAsStruct(oprot);
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

    private final net.lab1318.costume.api.models.collection.CollectionId collectionId;

    private final net.lab1318.costume.api.models.institution.InstitutionId institutionId;

    private final net.lab1318.costume.api.models.ModelMetadata modelMetadata;

    /**
     * Dublin Core title
     */
    private final String title;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> agentNameTexts;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> categories;

    /**
     * Dublin Core date
     */
    private final com.google.common.base.Optional<String> date;

    /**
     * Dublin Core description
     */
    private final com.google.common.base.Optional<String> description;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.gender.Gender> gender;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> subjectTermTexts;

    private final com.google.common.base.Optional<net.lab1318.costume.api.models.image.ImageVersion> thumbnail;

    private final com.google.common.base.Optional<org.thryft.native_.Url> url;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> workTypeTexts;
}