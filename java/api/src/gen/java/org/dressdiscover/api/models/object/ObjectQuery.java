package org.dressdiscover.api.models.object;

public final class ObjectQuery implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            collectionId = com.google.common.base.Optional.<org.dressdiscover.api.models.collection.CollectionId> absent();
            facetFilters = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacetFilters> absent();
            includeHidden = com.google.common.base.Optional.<Boolean> absent();
            institutionId = com.google.common.base.Optional.<org.dressdiscover.api.models.institution.InstitutionId> absent();
            moreLikeObjectId = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectId> absent();
            objectIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent();
            queryString = com.google.common.base.Optional.<String> absent();
            relationText = com.google.common.base.Optional.<String> absent();
            structureTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> absent();
            workTypeText = com.google.common.base.Optional.<String> absent();
        }

        public Builder(final ObjectQuery other) {
            this.collectionId = other.getCollectionId();
            this.facetFilters = other.getFacetFilters();
            this.includeHidden = other.getIncludeHidden();
            this.institutionId = other.getInstitutionId();
            this.moreLikeObjectId = other.getMoreLikeObjectId();
            this.objectIds = other.getObjectIds();
            this.queryString = other.getQueryString();
            this.relationText = other.getRelationText();
            this.structureTexts = other.getStructureTexts();
            this.workTypeText = other.getWorkTypeText();
        }

        protected ObjectQuery _build(final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters, final com.google.common.base.Optional<Boolean> includeHidden, final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds, final com.google.common.base.Optional<String> queryString, final com.google.common.base.Optional<String> relationText, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts, final com.google.common.base.Optional<String> workTypeText) {
            return new ObjectQuery(collectionId, facetFilters, includeHidden, institutionId, moreLikeObjectId, objectIds, queryString, relationText, structureTexts, workTypeText, DefaultConstructionValidator.getInstance());
        }

        public ObjectQuery build() {
            return _build(collectionId, facetFilters, includeHidden, institutionId, moreLikeObjectId, objectIds, queryString, relationText, structureTexts, workTypeText);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> getCollectionId() {
            return collectionId;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> getFacetFilters() {
            return facetFilters;
        }

        public final com.google.common.base.Optional<Boolean> getIncludeHidden() {
            return includeHidden;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> getInstitutionId() {
            return institutionId;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> getMoreLikeObjectId() {
            return moreLikeObjectId;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> getObjectIds() {
            return objectIds;
        }

        public final com.google.common.base.Optional<String> getQueryString() {
            return queryString;
        }

        public final com.google.common.base.Optional<String> getRelationText() {
            return relationText;
        }

        /**
         * key=(value OR value...) AND key=(value OR value...)
         */
        public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> getStructureTexts() {
            return structureTexts;
        }

        public final com.google.common.base.Optional<String> getWorkTypeText() {
            return workTypeText;
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
                if (__list.getSize() > 0) {
                    try {
                        collectionId = com.google.common.base.Optional.of(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                    }
                }
                if (__list.getSize() > 1) {
                    facetFilters = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacetFilters.readAsStruct(iprot));
                }
                if (__list.getSize() > 2) {
                    includeHidden = com.google.common.base.Optional.of(iprot.readBool());
                }
                if (__list.getSize() > 3) {
                    try {
                        institutionId = com.google.common.base.Optional.of(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                    }
                }
                if (__list.getSize() > 4) {
                    try {
                        moreLikeObjectId = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                    } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                    }
                }
                if (__list.getSize() > 5) {
                    try {
                        objectIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                                        } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_IDS, e.getCause());
                    }
                }
                if (__list.getSize() > 6) {
                    queryString = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 7) {
                    relationText = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 8) {
                    try {
                        structureTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.collect.ImmutableList<String>> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final com.google.common.collect.ImmutableList<String> value;
                                        try {
                                            value = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                            }).apply(iprot);
                                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, e.getCause());
                    }
                }
                if (__list.getSize() > 9) {
                    workTypeText = com.google.common.base.Optional.of(iprot.readString());
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
                            collectionId = com.google.common.base.Optional.of(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                        }
                        break;
                    }
                    case "facet_filters": {
                        facetFilters = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacetFilters.readAsStruct(iprot));
                        break;
                    }
                    case "include_hidden": {
                        includeHidden = com.google.common.base.Optional.of(iprot.readBool());
                        break;
                    }
                    case "institution_id": {
                        try {
                            institutionId = com.google.common.base.Optional.of(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                        }
                        break;
                    }
                    case "more_like_object_id": {
                        try {
                            moreLikeObjectId = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                        } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                        }
                        break;
                    }
                    case "object_ids": {
                        try {
                            objectIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {
                                @Override
                                public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                        final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            try {
                                                sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                                            } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                                                 throw new org.thryft.protocol.InputProtocolException(e);
                                            }
                                        }
                                        iprot.readSetEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_IDS, e.getCause());
                        }
                        break;
                    }
                    case "query_string": {
                        queryString = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "relation_text": {
                        relationText = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "structure_texts": {
                        try {
                            structureTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>>() {
                                @Override
                                public com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                        final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.collect.ImmutableList<String>> map = com.google.common.collect.ImmutableMap.builder();
                                        for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                            final String key;
                                            key = iprot.readString();
                                            final com.google.common.collect.ImmutableList<String> value;
                                            try {
                                                value = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                                }).apply(iprot);
                                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, e.getCause());
                        }
                        break;
                    }
                    case "work_type_text": {
                        workTypeText = com.google.common.base.Optional.of(iprot.readString());
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
            case FACET_FILTERS: setFacetFilters((org.dressdiscover.api.models.object.ObjectFacetFilters)value); return this;
            case INCLUDE_HIDDEN: setIncludeHidden((Boolean)value); return this;
            case INSTITUTION_ID: setInstitutionId((org.dressdiscover.api.models.institution.InstitutionId)value); return this;
            case MORE_LIKE_OBJECT_ID: setMoreLikeObjectId((org.dressdiscover.api.models.object.ObjectId)value); return this;
            case OBJECT_IDS: setObjectIds((com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>)value); return this;
            case QUERY_STRING: setQueryString((String)value); return this;
            case RELATION_TEXT: setRelationText((String)value); return this;
            case STRUCTURE_TEXTS: setStructureTexts((com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>)value); return this;
            case WORK_TYPE_TEXT: setWorkTypeText((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCollectionId(final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId) {
            this.collectionId = DefaultConstructionValidator.getInstance().validateCollectionId(collectionId);
            return this;
        }

        public Builder setCollectionId(@javax.annotation.Nullable final org.dressdiscover.api.models.collection.CollectionId collectionId) {
            return setCollectionId(com.google.common.base.Optional.fromNullable(collectionId));
        }

        public Builder setFacetFilters(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters) {
            this.facetFilters = DefaultConstructionValidator.getInstance().validateFacetFilters(facetFilters);
            return this;
        }

        public Builder setFacetFilters(@javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectFacetFilters facetFilters) {
            return setFacetFilters(com.google.common.base.Optional.fromNullable(facetFilters));
        }

        public Builder setIfPresent(final ObjectQuery other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getCollectionId().isPresent()) {
                setCollectionId(other.getCollectionId());
            }
            if (other.getFacetFilters().isPresent()) {
                setFacetFilters(other.getFacetFilters());
            }
            if (other.getIncludeHidden().isPresent()) {
                setIncludeHidden(other.getIncludeHidden());
            }
            if (other.getInstitutionId().isPresent()) {
                setInstitutionId(other.getInstitutionId());
            }
            if (other.getMoreLikeObjectId().isPresent()) {
                setMoreLikeObjectId(other.getMoreLikeObjectId());
            }
            if (other.getObjectIds().isPresent()) {
                setObjectIds(other.getObjectIds());
            }
            if (other.getQueryString().isPresent()) {
                setQueryString(other.getQueryString());
            }
            if (other.getRelationText().isPresent()) {
                setRelationText(other.getRelationText());
            }
            if (other.getStructureTexts().isPresent()) {
                setStructureTexts(other.getStructureTexts());
            }
            if (other.getWorkTypeText().isPresent()) {
                setWorkTypeText(other.getWorkTypeText());
            }

            return this;
        }

        public Builder setIncludeHidden(final com.google.common.base.Optional<Boolean> includeHidden) {
            this.includeHidden = DefaultConstructionValidator.getInstance().validateIncludeHidden(includeHidden);
            return this;
        }

        public Builder setIncludeHidden(@javax.annotation.Nullable final Boolean includeHidden) {
            return setIncludeHidden(com.google.common.base.Optional.fromNullable(includeHidden));
        }

        public Builder setInstitutionId(final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId) {
            this.institutionId = DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId);
            return this;
        }

        public Builder setInstitutionId(@javax.annotation.Nullable final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
            return setInstitutionId(com.google.common.base.Optional.fromNullable(institutionId));
        }

        public Builder setMoreLikeObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId) {
            this.moreLikeObjectId = DefaultConstructionValidator.getInstance().validateMoreLikeObjectId(moreLikeObjectId);
            return this;
        }

        public Builder setMoreLikeObjectId(@javax.annotation.Nullable final org.dressdiscover.api.models.object.ObjectId moreLikeObjectId) {
            return setMoreLikeObjectId(com.google.common.base.Optional.fromNullable(moreLikeObjectId));
        }

        public Builder setObjectIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds) {
            this.objectIds = DefaultConstructionValidator.getInstance().validateObjectIds(objectIds);
            return this;
        }

        public Builder setObjectIds(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> objectIds) {
            return setObjectIds(com.google.common.base.Optional.fromNullable(objectIds));
        }

        public Builder setQueryString(final com.google.common.base.Optional<String> queryString) {
            this.queryString = DefaultConstructionValidator.getInstance().validateQueryString(queryString);
            return this;
        }

        public Builder setQueryString(@javax.annotation.Nullable final String queryString) {
            return setQueryString(com.google.common.base.Optional.fromNullable(queryString));
        }

        public Builder setRelationText(final com.google.common.base.Optional<String> relationText) {
            this.relationText = DefaultConstructionValidator.getInstance().validateRelationText(relationText);
            return this;
        }

        public Builder setRelationText(@javax.annotation.Nullable final String relationText) {
            return setRelationText(com.google.common.base.Optional.fromNullable(relationText));
        }

        public Builder setStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts) {
            this.structureTexts = DefaultConstructionValidator.getInstance().validateStructureTexts(structureTexts);
            return this;
        }

        public Builder setStructureTexts(@javax.annotation.Nullable final com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>> structureTexts) {
            return setStructureTexts(com.google.common.base.Optional.fromNullable(structureTexts));
        }

        public Builder setWorkTypeText(final com.google.common.base.Optional<String> workTypeText) {
            this.workTypeText = DefaultConstructionValidator.getInstance().validateWorkTypeText(workTypeText);
            return this;
        }

        public Builder setWorkTypeText(@javax.annotation.Nullable final String workTypeText) {
            return setWorkTypeText(com.google.common.base.Optional.fromNullable(workTypeText));
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
            case FACET_FILTERS: return unsetFacetFilters();
            case INCLUDE_HIDDEN: return unsetIncludeHidden();
            case INSTITUTION_ID: return unsetInstitutionId();
            case MORE_LIKE_OBJECT_ID: return unsetMoreLikeObjectId();
            case OBJECT_IDS: return unsetObjectIds();
            case QUERY_STRING: return unsetQueryString();
            case RELATION_TEXT: return unsetRelationText();
            case STRUCTURE_TEXTS: return unsetStructureTexts();
            case WORK_TYPE_TEXT: return unsetWorkTypeText();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCollectionId() {
            this.collectionId = com.google.common.base.Optional.<org.dressdiscover.api.models.collection.CollectionId> absent();
            return this;
        }

        public Builder unsetFacetFilters() {
            this.facetFilters = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacetFilters> absent();
            return this;
        }

        public Builder unsetIncludeHidden() {
            this.includeHidden = com.google.common.base.Optional.<Boolean> absent();
            return this;
        }

        public Builder unsetInstitutionId() {
            this.institutionId = com.google.common.base.Optional.<org.dressdiscover.api.models.institution.InstitutionId> absent();
            return this;
        }

        public Builder unsetMoreLikeObjectId() {
            this.moreLikeObjectId = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectId> absent();
            return this;
        }

        public Builder unsetObjectIds() {
            this.objectIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent();
            return this;
        }

        public Builder unsetQueryString() {
            this.queryString = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetRelationText() {
            this.relationText = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetStructureTexts() {
            this.structureTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> absent();
            return this;
        }

        public Builder unsetWorkTypeText() {
            this.workTypeText = com.google.common.base.Optional.<String> absent();
            return this;
        }

        private com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId;
        private com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters;
        private com.google.common.base.Optional<Boolean> includeHidden;
        private com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId;
        private com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds;
        private com.google.common.base.Optional<String> queryString;
        private com.google.common.base.Optional<String> relationText;
        /**
         * key=(value OR value...) AND key=(value OR value...)
         */
        private com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts;
        private com.google.common.base.Optional<String> workTypeText;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<ObjectQuery> {
        @Override
        public ObjectQuery readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return ObjectQuery.readAs(iprot, type);
        }

        @Override
        public ObjectQuery readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectQuery.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public ObjectQuery readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectQuery.readAsList(iprot);
        }

        @Override
        public ObjectQuery readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return ObjectQuery.readAsStruct(iprot);
        }

        @Override
        public ObjectQuery readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return ObjectQuery.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COLLECTION_ID("collectionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.collection.CollectionId>() {}, false, 0, "collection_id", org.thryft.protocol.Type.STRING),
        FACET_FILTERS("facetFilters", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectFacetFilters>() {}, false, 0, "facet_filters", org.thryft.protocol.Type.STRUCT),
        INCLUDE_HIDDEN("includeHidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 0, "include_hidden", org.thryft.protocol.Type.BOOL),
        INSTITUTION_ID("institutionId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.institution.InstitutionId>() {}, false, 0, "institution_id", org.thryft.protocol.Type.STRING),
        MORE_LIKE_OBJECT_ID("moreLikeObjectId", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.object.ObjectId>() {}, false, 0, "more_like_object_id", org.thryft.protocol.Type.STRING),
        OBJECT_IDS("objectIds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {}, false, 0, "object_ids", org.thryft.protocol.Type.SET),
        QUERY_STRING("queryString", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "query_string", org.thryft.protocol.Type.STRING),
        RELATION_TEXT("relationText", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "relation_text", org.thryft.protocol.Type.STRING),
        STRUCTURE_TEXTS("structureTexts", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>>() {}, false, 0, "structure_texts", org.thryft.protocol.Type.MAP),
        WORK_TYPE_TEXT("workTypeText", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "work_type_text", org.thryft.protocol.Type.STRING);

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
            case "facetFilters": return FACET_FILTERS;
            case "includeHidden": return INCLUDE_HIDDEN;
            case "institutionId": return INSTITUTION_ID;
            case "moreLikeObjectId": return MORE_LIKE_OBJECT_ID;
            case "objectIds": return OBJECT_IDS;
            case "queryString": return QUERY_STRING;
            case "relationText": return RELATION_TEXT;
            case "structureTexts": return STRUCTURE_TEXTS;
            case "workTypeText": return WORK_TYPE_TEXT;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "collection_id": return COLLECTION_ID;
            case "facet_filters": return FACET_FILTERS;
            case "include_hidden": return INCLUDE_HIDDEN;
            case "institution_id": return INSTITUTION_ID;
            case "more_like_object_id": return MORE_LIKE_OBJECT_ID;
            case "object_ids": return OBJECT_IDS;
            case "query_string": return QUERY_STRING;
            case "relation_text": return RELATION_TEXT;
            case "structure_texts": return STRUCTURE_TEXTS;
            case "work_type_text": return WORK_TYPE_TEXT;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> validateCollectionId(final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> validateFacetFilters(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters) throws ExceptionT;

        public com.google.common.base.Optional<Boolean> validateIncludeHidden(final com.google.common.base.Optional<Boolean> includeHidden) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> validateInstitutionId(final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> validateMoreLikeObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> validateObjectIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds) throws ExceptionT;

        public com.google.common.base.Optional<String> validateQueryString(final com.google.common.base.Optional<String> queryString) throws ExceptionT;

        public com.google.common.base.Optional<String> validateRelationText(final com.google.common.base.Optional<String> relationText) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts) throws ExceptionT;

        public com.google.common.base.Optional<String> validateWorkTypeText(final com.google.common.base.Optional<String> workTypeText) throws ExceptionT;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> validateCollectionId(final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId) throws RuntimeException {
            if (collectionId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectQuery: collectionId is null");
            }
            if (!collectionId.isPresent()) {
                return collectionId;
            }
            return collectionId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> validateFacetFilters(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters) throws RuntimeException {
            if (facetFilters == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectQuery: facetFilters is null");
            }
            if (!facetFilters.isPresent()) {
                return facetFilters;
            }
            return facetFilters;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateIncludeHidden(final com.google.common.base.Optional<Boolean> includeHidden) throws RuntimeException {
            if (!includeHidden.isPresent()) {
                return includeHidden;
            }
            if (!includeHidden.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectQuery: includeHidden is not true");
            }
            return includeHidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> validateInstitutionId(final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId) throws RuntimeException {
            if (institutionId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectQuery: institutionId is null");
            }
            if (!institutionId.isPresent()) {
                return institutionId;
            }
            return institutionId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> validateMoreLikeObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId) throws RuntimeException {
            if (moreLikeObjectId == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectQuery: moreLikeObjectId is null");
            }
            if (!moreLikeObjectId.isPresent()) {
                return moreLikeObjectId;
            }
            return moreLikeObjectId;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> validateObjectIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds) throws RuntimeException {
            if (objectIds == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectQuery: objectIds is null");
            }
            if (!objectIds.isPresent()) {
                return objectIds;
            }
            return objectIds;
        }

        @Override
        public com.google.common.base.Optional<String> validateQueryString(final com.google.common.base.Optional<String> queryString) throws RuntimeException {
            if (queryString == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectQuery: queryString is null");
            }
            if (!queryString.isPresent()) {
                return queryString;
            }
            if (queryString.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectQuery: queryString is less than min length 1");
            }
            return queryString;
        }

        @Override
        public com.google.common.base.Optional<String> validateRelationText(final com.google.common.base.Optional<String> relationText) throws RuntimeException {
            if (relationText == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectQuery: relationText is null");
            }
            if (!relationText.isPresent()) {
                return relationText;
            }
            if (relationText.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectQuery: relationText is less than min length 1");
            }
            return relationText;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts) throws RuntimeException {
            if (structureTexts == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectQuery: structureTexts is null");
            }
            if (!structureTexts.isPresent()) {
                return structureTexts;
            }
            if (structureTexts.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectQuery: structureTexts is less than min length 1");
            }
            return structureTexts;
        }

        @Override
        public com.google.common.base.Optional<String> validateWorkTypeText(final com.google.common.base.Optional<String> workTypeText) throws RuntimeException {
            if (workTypeText == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.ObjectQuery: workTypeText is null");
            }
            if (!workTypeText.isPresent()) {
                return workTypeText;
            }
            if (workTypeText.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.ObjectQuery: workTypeText is less than min length 1");
            }
            return workTypeText;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> validateCollectionId(final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId) {
            return collectionId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> validateFacetFilters(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters) {
            return facetFilters;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateIncludeHidden(final com.google.common.base.Optional<Boolean> includeHidden) {
            return includeHidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> validateInstitutionId(final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId) {
            return institutionId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> validateMoreLikeObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId) {
            return moreLikeObjectId;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> validateObjectIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds) {
            return objectIds;
        }

        @Override
        public com.google.common.base.Optional<String> validateQueryString(final com.google.common.base.Optional<String> queryString) {
            return queryString;
        }

        @Override
        public com.google.common.base.Optional<String> validateRelationText(final com.google.common.base.Optional<String> relationText) {
            return relationText;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts) {
            return structureTexts;
        }

        @Override
        public com.google.common.base.Optional<String> validateWorkTypeText(final com.google.common.base.Optional<String> workTypeText) {
            return workTypeText;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> validateCollectionId(final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId) throws org.thryft.protocol.InputProtocolException {
            if (collectionId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLLECTION_ID, "org.dressdiscover.api.models.object.ObjectQuery: collectionId is null");
            }
            if (!collectionId.isPresent()) {
                return collectionId;
            }
            return collectionId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> validateFacetFilters(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters) throws org.thryft.protocol.InputProtocolException {
            if (facetFilters == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FACET_FILTERS, "org.dressdiscover.api.models.object.ObjectQuery: facetFilters is null");
            }
            if (!facetFilters.isPresent()) {
                return facetFilters;
            }
            return facetFilters;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateIncludeHidden(final com.google.common.base.Optional<Boolean> includeHidden) throws org.thryft.protocol.InputProtocolException {
            if (!includeHidden.isPresent()) {
                return includeHidden;
            }
            if (!includeHidden.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.INCLUDE_HIDDEN, "org.dressdiscover.api.models.object.ObjectQuery: includeHidden is not true");
            }
            return includeHidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> validateInstitutionId(final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId) throws org.thryft.protocol.InputProtocolException {
            if (institutionId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.INSTITUTION_ID, "org.dressdiscover.api.models.object.ObjectQuery: institutionId is null");
            }
            if (!institutionId.isPresent()) {
                return institutionId;
            }
            return institutionId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> validateMoreLikeObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId) throws org.thryft.protocol.InputProtocolException {
            if (moreLikeObjectId == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.MORE_LIKE_OBJECT_ID, "org.dressdiscover.api.models.object.ObjectQuery: moreLikeObjectId is null");
            }
            if (!moreLikeObjectId.isPresent()) {
                return moreLikeObjectId;
            }
            return moreLikeObjectId;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> validateObjectIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds) throws org.thryft.protocol.InputProtocolException {
            if (objectIds == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.OBJECT_IDS, "org.dressdiscover.api.models.object.ObjectQuery: objectIds is null");
            }
            if (!objectIds.isPresent()) {
                return objectIds;
            }
            return objectIds;
        }

        @Override
        public com.google.common.base.Optional<String> validateQueryString(final com.google.common.base.Optional<String> queryString) throws org.thryft.protocol.InputProtocolException {
            if (queryString == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.QUERY_STRING, "org.dressdiscover.api.models.object.ObjectQuery: queryString is null");
            }
            if (!queryString.isPresent()) {
                return queryString;
            }
            if (queryString.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUERY_STRING, "org.dressdiscover.api.models.object.ObjectQuery: queryString is less than min length 1");
            }
            return queryString;
        }

        @Override
        public com.google.common.base.Optional<String> validateRelationText(final com.google.common.base.Optional<String> relationText) throws org.thryft.protocol.InputProtocolException {
            if (relationText == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.RELATION_TEXT, "org.dressdiscover.api.models.object.ObjectQuery: relationText is null");
            }
            if (!relationText.isPresent()) {
                return relationText;
            }
            if (relationText.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.RELATION_TEXT, "org.dressdiscover.api.models.object.ObjectQuery: relationText is less than min length 1");
            }
            return relationText;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts) throws org.thryft.protocol.InputProtocolException {
            if (structureTexts == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, "org.dressdiscover.api.models.object.ObjectQuery: structureTexts is null");
            }
            if (!structureTexts.isPresent()) {
                return structureTexts;
            }
            if (structureTexts.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, "org.dressdiscover.api.models.object.ObjectQuery: structureTexts is less than min length 1");
            }
            return structureTexts;
        }

        @Override
        public com.google.common.base.Optional<String> validateWorkTypeText(final com.google.common.base.Optional<String> workTypeText) throws org.thryft.protocol.InputProtocolException {
            if (workTypeText == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXT, "org.dressdiscover.api.models.object.ObjectQuery: workTypeText is null");
            }
            if (!workTypeText.isPresent()) {
                return workTypeText;
            }
            if (workTypeText.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.WORK_TYPE_TEXT, "org.dressdiscover.api.models.object.ObjectQuery: workTypeText is less than min length 1");
            }
            return workTypeText;
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
        public com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> validateCollectionId(final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId) {
            return collectionId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> validateFacetFilters(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters) {
            return facetFilters;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateIncludeHidden(final com.google.common.base.Optional<Boolean> includeHidden) {
            return includeHidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> validateInstitutionId(final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId) {
            return institutionId;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> validateMoreLikeObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId) {
            return moreLikeObjectId;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> validateObjectIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds) {
            return objectIds;
        }

        @Override
        public com.google.common.base.Optional<String> validateQueryString(final com.google.common.base.Optional<String> queryString) {
            return queryString;
        }

        @Override
        public com.google.common.base.Optional<String> validateRelationText(final com.google.common.base.Optional<String> relationText) {
            return relationText;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> validateStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts) {
            return structureTexts;
        }

        @Override
        public com.google.common.base.Optional<String> validateWorkTypeText(final com.google.common.base.Optional<String> workTypeText) {
            return workTypeText;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
    public ObjectQuery() {
        collectionId = com.google.common.base.Optional.<org.dressdiscover.api.models.collection.CollectionId> absent();
        facetFilters = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacetFilters> absent();
        includeHidden = com.google.common.base.Optional.<Boolean> absent();
        institutionId = com.google.common.base.Optional.<org.dressdiscover.api.models.institution.InstitutionId> absent();
        moreLikeObjectId = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectId> absent();
        objectIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent();
        queryString = com.google.common.base.Optional.<String> absent();
        relationText = com.google.common.base.Optional.<String> absent();
        structureTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> absent();
        workTypeText = com.google.common.base.Optional.<String> absent();
    }

    /**
     * Copy constructor
     */
    public ObjectQuery(final ObjectQuery other) {
        this(other.getCollectionId(), other.getFacetFilters(), other.getIncludeHidden(), other.getInstitutionId(), other.getMoreLikeObjectId(), other.getObjectIds(), other.getQueryString(), other.getRelationText(), other.getStructureTexts(), other.getWorkTypeText(), NopConstructionValidator.getInstance());
    }

    protected ObjectQuery(final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters, final com.google.common.base.Optional<Boolean> includeHidden, final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds, final com.google.common.base.Optional<String> queryString, final com.google.common.base.Optional<String> relationText, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts, final com.google.common.base.Optional<String> workTypeText, ConstructionValidator validator) {
        this.collectionId = validator.validateCollectionId(collectionId);
        this.facetFilters = validator.validateFacetFilters(facetFilters);
        this.includeHidden = validator.validateIncludeHidden(includeHidden);
        this.institutionId = validator.validateInstitutionId(institutionId);
        this.moreLikeObjectId = validator.validateMoreLikeObjectId(moreLikeObjectId);
        this.objectIds = validator.validateObjectIds(objectIds);
        this.queryString = validator.validateQueryString(queryString);
        this.relationText = validator.validateRelationText(relationText);
        this.structureTexts = validator.validateStructureTexts(structureTexts);
        this.workTypeText = validator.validateWorkTypeText(workTypeText);
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

    public static ObjectQuery create() {
        return new ObjectQuery();
    }

    /**
     * Total Nullable factory method
     */
    public static ObjectQuery create(final @javax.annotation.Nullable org.dressdiscover.api.models.collection.CollectionId collectionId, final @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectFacetFilters facetFilters, final @javax.annotation.Nullable Boolean includeHidden, final @javax.annotation.Nullable org.dressdiscover.api.models.institution.InstitutionId institutionId, final @javax.annotation.Nullable org.dressdiscover.api.models.object.ObjectId moreLikeObjectId, final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> objectIds, final @javax.annotation.Nullable String queryString, final @javax.annotation.Nullable String relationText, final @javax.annotation.Nullable com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>> structureTexts, final @javax.annotation.Nullable String workTypeText) {
        return new ObjectQuery(com.google.common.base.Optional.fromNullable(collectionId), com.google.common.base.Optional.fromNullable(facetFilters), com.google.common.base.Optional.fromNullable(includeHidden), com.google.common.base.Optional.fromNullable(institutionId), com.google.common.base.Optional.fromNullable(moreLikeObjectId), com.google.common.base.Optional.fromNullable(objectIds), com.google.common.base.Optional.fromNullable(queryString), com.google.common.base.Optional.fromNullable(relationText), com.google.common.base.Optional.fromNullable(structureTexts), com.google.common.base.Optional.fromNullable(workTypeText), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static ObjectQuery create(final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters, final com.google.common.base.Optional<Boolean> includeHidden, final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId, final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds, final com.google.common.base.Optional<String> queryString, final com.google.common.base.Optional<String> relationText, final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts, final com.google.common.base.Optional<String> workTypeText) {
        return new ObjectQuery(collectionId, facetFilters, includeHidden, institutionId, moreLikeObjectId, objectIds, queryString, relationText, structureTexts, workTypeText, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof ObjectQuery)) {
            return false;
        }

        final ObjectQuery other = (ObjectQuery)otherObject;

        if (!(((getCollectionId().isPresent() && other.getCollectionId().isPresent()) ? (getCollectionId().get().equals(other.getCollectionId().get())) : (!getCollectionId().isPresent() && !other.getCollectionId().isPresent())))) {
            return false;
        }

        if (!(((getFacetFilters().isPresent() && other.getFacetFilters().isPresent()) ? (getFacetFilters().get().equals(other.getFacetFilters().get())) : (!getFacetFilters().isPresent() && !other.getFacetFilters().isPresent())))) {
            return false;
        }

        if (!(((getIncludeHidden().isPresent() && other.getIncludeHidden().isPresent()) ? (getIncludeHidden().get().booleanValue() == other.getIncludeHidden().get().booleanValue()) : (!getIncludeHidden().isPresent() && !other.getIncludeHidden().isPresent())))) {
            return false;
        }

        if (!(((getInstitutionId().isPresent() && other.getInstitutionId().isPresent()) ? (getInstitutionId().get().equals(other.getInstitutionId().get())) : (!getInstitutionId().isPresent() && !other.getInstitutionId().isPresent())))) {
            return false;
        }

        if (!(((getMoreLikeObjectId().isPresent() && other.getMoreLikeObjectId().isPresent()) ? (getMoreLikeObjectId().get().equals(other.getMoreLikeObjectId().get())) : (!getMoreLikeObjectId().isPresent() && !other.getMoreLikeObjectId().isPresent())))) {
            return false;
        }

        if (!(((getObjectIds().isPresent() && other.getObjectIds().isPresent()) ? (getObjectIds().get().equals(other.getObjectIds().get())) : (!getObjectIds().isPresent() && !other.getObjectIds().isPresent())))) {
            return false;
        }

        if (!(((getQueryString().isPresent() && other.getQueryString().isPresent()) ? (getQueryString().get().equals(other.getQueryString().get())) : (!getQueryString().isPresent() && !other.getQueryString().isPresent())))) {
            return false;
        }

        if (!(((getRelationText().isPresent() && other.getRelationText().isPresent()) ? (getRelationText().get().equals(other.getRelationText().get())) : (!getRelationText().isPresent() && !other.getRelationText().isPresent())))) {
            return false;
        }

        if (!(((getStructureTexts().isPresent() && other.getStructureTexts().isPresent()) ? (getStructureTexts().get().equals(other.getStructureTexts().get())) : (!getStructureTexts().isPresent() && !other.getStructureTexts().isPresent())))) {
            return false;
        }

        if (!(((getWorkTypeText().isPresent() && other.getWorkTypeText().isPresent()) ? (getWorkTypeText().get().equals(other.getWorkTypeText().get())) : (!getWorkTypeText().isPresent() && !other.getWorkTypeText().isPresent())))) {
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
        case FACET_FILTERS: return getFacetFilters();
        case INCLUDE_HIDDEN: return getIncludeHidden();
        case INSTITUTION_ID: return getInstitutionId();
        case MORE_LIKE_OBJECT_ID: return getMoreLikeObjectId();
        case OBJECT_IDS: return getObjectIds();
        case QUERY_STRING: return getQueryString();
        case RELATION_TEXT: return getRelationText();
        case STRUCTURE_TEXTS: return getStructureTexts();
        case WORK_TYPE_TEXT: return getWorkTypeText();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> getCollectionId() {
        return collectionId;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> getFacetFilters() {
        return facetFilters;
    }

    public final com.google.common.base.Optional<Boolean> getIncludeHidden() {
        return includeHidden;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> getInstitutionId() {
        return institutionId;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> getMoreLikeObjectId() {
        return moreLikeObjectId;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> getObjectIds() {
        return objectIds;
    }

    public final com.google.common.base.Optional<String> getQueryString() {
        return queryString;
    }

    public final com.google.common.base.Optional<String> getRelationText() {
        return relationText;
    }

    /**
     * key=(value OR value...) AND key=(value OR value...)
     */
    public final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> getStructureTexts() {
        return structureTexts;
    }

    public final com.google.common.base.Optional<String> getWorkTypeText() {
        return workTypeText;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getCollectionId().isPresent()) {
            hashCode = 31 * hashCode + getCollectionId().get().hashCode();
        }
        if (getFacetFilters().isPresent()) {
            hashCode = 31 * hashCode + getFacetFilters().get().hashCode();
        }
        if (getIncludeHidden().isPresent()) {
            hashCode = 31 * hashCode + (getIncludeHidden().get() ? 1 : 0);
        }
        if (getInstitutionId().isPresent()) {
            hashCode = 31 * hashCode + getInstitutionId().get().hashCode();
        }
        if (getMoreLikeObjectId().isPresent()) {
            hashCode = 31 * hashCode + getMoreLikeObjectId().get().hashCode();
        }
        if (getObjectIds().isPresent()) {
            hashCode = 31 * hashCode + getObjectIds().get().hashCode();
        }
        if (getQueryString().isPresent()) {
            hashCode = 31 * hashCode + getQueryString().get().hashCode();
        }
        if (getRelationText().isPresent()) {
            hashCode = 31 * hashCode + getRelationText().get().hashCode();
        }
        if (getStructureTexts().isPresent()) {
            hashCode = 31 * hashCode + getStructureTexts().get().hashCode();
        }
        if (getWorkTypeText().isPresent()) {
            hashCode = 31 * hashCode + getWorkTypeText().get().hashCode();
        }
        return hashCode;
    }

    public static ObjectQuery readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectQuery readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static ObjectQuery readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId = com.google.common.base.Optional.<org.dressdiscover.api.models.collection.CollectionId> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacetFilters> absent();
        com.google.common.base.Optional<Boolean> includeHidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId = com.google.common.base.Optional.<org.dressdiscover.api.models.institution.InstitutionId> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectId> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent();
        com.google.common.base.Optional<String> queryString = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> relationText = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> absent();
        com.google.common.base.Optional<String> workTypeText = com.google.common.base.Optional.<String> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                try {
                    collectionId = com.google.common.base.Optional.of(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                }
            }
            if (__list.getSize() > 1) {
                facetFilters = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacetFilters.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                includeHidden = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 3) {
                try {
                    institutionId = com.google.common.base.Optional.of(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                }
            }
            if (__list.getSize() > 4) {
                try {
                    moreLikeObjectId = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                }
            }
            if (__list.getSize() > 5) {
                try {
                    objectIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    try {
                                        sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                                    } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                                         throw new org.thryft.protocol.InputProtocolException(e);
                                    }
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_IDS, e.getCause());
                }
            }
            if (__list.getSize() > 6) {
                queryString = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 7) {
                relationText = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 8) {
                try {
                    structureTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>>() {
                        @Override
                        public com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.collect.ImmutableList<String>> map = com.google.common.collect.ImmutableMap.builder();
                                for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                    final String key;
                                    key = iprot.readString();
                                    final com.google.common.collect.ImmutableList<String> value;
                                    try {
                                        value = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                        }).apply(iprot);
                                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, e.getCause());
                }
            }
            if (__list.getSize() > 9) {
                workTypeText = com.google.common.base.Optional.of(iprot.readString());
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new ObjectQuery(DefaultReadValidator.getInstance().validateCollectionId(collectionId), DefaultReadValidator.getInstance().validateFacetFilters(facetFilters), DefaultReadValidator.getInstance().validateIncludeHidden(includeHidden), DefaultReadValidator.getInstance().validateInstitutionId(institutionId), DefaultReadValidator.getInstance().validateMoreLikeObjectId(moreLikeObjectId), DefaultReadValidator.getInstance().validateObjectIds(objectIds), DefaultReadValidator.getInstance().validateQueryString(queryString), DefaultReadValidator.getInstance().validateRelationText(relationText), DefaultReadValidator.getInstance().validateStructureTexts(structureTexts), DefaultReadValidator.getInstance().validateWorkTypeText(workTypeText), NopConstructionValidator.getInstance());
    }

    public static ObjectQuery readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static ObjectQuery readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId = com.google.common.base.Optional.<org.dressdiscover.api.models.collection.CollectionId> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectFacetFilters> absent();
        com.google.common.base.Optional<Boolean> includeHidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId = com.google.common.base.Optional.<org.dressdiscover.api.models.institution.InstitutionId> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId = com.google.common.base.Optional.<org.dressdiscover.api.models.object.ObjectId> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> absent();
        com.google.common.base.Optional<String> queryString = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<String> relationText = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts = com.google.common.base.Optional.<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> absent();
        com.google.common.base.Optional<String> workTypeText = com.google.common.base.Optional.<String> absent();

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
                        collectionId = com.google.common.base.Optional.of(org.dressdiscover.api.models.collection.CollectionId.parse(iprot.readString()));
                    } catch (final org.dressdiscover.api.models.collection.InvalidCollectionIdException e) {
                    }
                    break;
                }
                case "facet_filters": {
                    facetFilters = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectFacetFilters.readAsStruct(iprot));
                    break;
                }
                case "include_hidden": {
                    includeHidden = com.google.common.base.Optional.of(iprot.readBool());
                    break;
                }
                case "institution_id": {
                    try {
                        institutionId = com.google.common.base.Optional.of(org.dressdiscover.api.models.institution.InstitutionId.parse(iprot.readString()));
                    } catch (final org.dressdiscover.api.models.institution.InvalidInstitutionIdException e) {
                    }
                    break;
                }
                case "more_like_object_id": {
                    try {
                        moreLikeObjectId = com.google.common.base.Optional.of(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                    } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                    }
                    break;
                }
                case "object_ids": {
                    try {
                        objectIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<org.dressdiscover.api.models.object.ObjectId> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        try {
                                            sequenceBuilder.add(org.dressdiscover.api.models.object.ObjectId.parse(iprot.readString()));
                                        } catch (final org.dressdiscover.api.models.object.InvalidObjectIdException e) {
                                             throw new org.thryft.protocol.InputProtocolException(e);
                                        }
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.OBJECT_IDS, e.getCause());
                    }
                    break;
                }
                case "query_string": {
                    queryString = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "relation_text": {
                    relationText = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "structure_texts": {
                    try {
                        structureTexts = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>>() {
                            @Override
                            public com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.MapBegin mapBegin = iprot.readMapBegin();
                                    final com.google.common.collect.ImmutableMap.Builder<String, com.google.common.collect.ImmutableList<String>> map = com.google.common.collect.ImmutableMap.builder();
                                    for (int entryI = 0; entryI < mapBegin.getSize(); entryI++) {
                                        final String key;
                                        key = iprot.readString();
                                        final com.google.common.collect.ImmutableList<String> value;
                                        try {
                                            value = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                                            }).apply(iprot);
                                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
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
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_TEXTS, e.getCause());
                    }
                    break;
                }
                case "work_type_text": {
                    workTypeText = com.google.common.base.Optional.of(iprot.readString());
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
        return new ObjectQuery(DefaultReadValidator.getInstance().validateCollectionId(collectionId), DefaultReadValidator.getInstance().validateFacetFilters(facetFilters), DefaultReadValidator.getInstance().validateIncludeHidden(includeHidden), DefaultReadValidator.getInstance().validateInstitutionId(institutionId), DefaultReadValidator.getInstance().validateMoreLikeObjectId(moreLikeObjectId), DefaultReadValidator.getInstance().validateObjectIds(objectIds), DefaultReadValidator.getInstance().validateQueryString(queryString), DefaultReadValidator.getInstance().validateRelationText(relationText), DefaultReadValidator.getInstance().validateStructureTexts(structureTexts), DefaultReadValidator.getInstance().validateWorkTypeText(workTypeText), NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceCollectionId(final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId) {
        return new ObjectQuery(DefaultConstructionValidator.getInstance().validateCollectionId(collectionId), this.facetFilters, this.includeHidden, this.institutionId, this.moreLikeObjectId, this.objectIds, this.queryString, this.relationText, this.structureTexts, this.workTypeText, NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceCollectionId(final org.dressdiscover.api.models.collection.CollectionId collectionId) {
        return replaceCollectionId(com.google.common.base.Optional.fromNullable(collectionId));
    }

    public ObjectQuery replaceFacetFilters(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters) {
        return new ObjectQuery(this.collectionId, DefaultConstructionValidator.getInstance().validateFacetFilters(facetFilters), this.includeHidden, this.institutionId, this.moreLikeObjectId, this.objectIds, this.queryString, this.relationText, this.structureTexts, this.workTypeText, NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceFacetFilters(final org.dressdiscover.api.models.object.ObjectFacetFilters facetFilters) {
        return replaceFacetFilters(com.google.common.base.Optional.fromNullable(facetFilters));
    }

    public ObjectQuery replaceIncludeHidden(final com.google.common.base.Optional<Boolean> includeHidden) {
        return new ObjectQuery(this.collectionId, this.facetFilters, DefaultConstructionValidator.getInstance().validateIncludeHidden(includeHidden), this.institutionId, this.moreLikeObjectId, this.objectIds, this.queryString, this.relationText, this.structureTexts, this.workTypeText, NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceIncludeHidden(final boolean includeHidden) {
        return replaceIncludeHidden(com.google.common.base.Optional.fromNullable(includeHidden));
    }

    public ObjectQuery replaceInstitutionId(final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId) {
        return new ObjectQuery(this.collectionId, this.facetFilters, this.includeHidden, DefaultConstructionValidator.getInstance().validateInstitutionId(institutionId), this.moreLikeObjectId, this.objectIds, this.queryString, this.relationText, this.structureTexts, this.workTypeText, NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceInstitutionId(final org.dressdiscover.api.models.institution.InstitutionId institutionId) {
        return replaceInstitutionId(com.google.common.base.Optional.fromNullable(institutionId));
    }

    public ObjectQuery replaceMoreLikeObjectId(final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId) {
        return new ObjectQuery(this.collectionId, this.facetFilters, this.includeHidden, this.institutionId, DefaultConstructionValidator.getInstance().validateMoreLikeObjectId(moreLikeObjectId), this.objectIds, this.queryString, this.relationText, this.structureTexts, this.workTypeText, NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceMoreLikeObjectId(final org.dressdiscover.api.models.object.ObjectId moreLikeObjectId) {
        return replaceMoreLikeObjectId(com.google.common.base.Optional.fromNullable(moreLikeObjectId));
    }

    public ObjectQuery replaceObjectIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds) {
        return new ObjectQuery(this.collectionId, this.facetFilters, this.includeHidden, this.institutionId, this.moreLikeObjectId, DefaultConstructionValidator.getInstance().validateObjectIds(objectIds), this.queryString, this.relationText, this.structureTexts, this.workTypeText, NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceObjectIds(final com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId> objectIds) {
        return replaceObjectIds(com.google.common.base.Optional.fromNullable(objectIds));
    }

    public ObjectQuery replaceQueryString(final com.google.common.base.Optional<String> queryString) {
        return new ObjectQuery(this.collectionId, this.facetFilters, this.includeHidden, this.institutionId, this.moreLikeObjectId, this.objectIds, DefaultConstructionValidator.getInstance().validateQueryString(queryString), this.relationText, this.structureTexts, this.workTypeText, NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceQueryString(final String queryString) {
        return replaceQueryString(com.google.common.base.Optional.fromNullable(queryString));
    }

    public ObjectQuery replaceRelationText(final com.google.common.base.Optional<String> relationText) {
        return new ObjectQuery(this.collectionId, this.facetFilters, this.includeHidden, this.institutionId, this.moreLikeObjectId, this.objectIds, this.queryString, DefaultConstructionValidator.getInstance().validateRelationText(relationText), this.structureTexts, this.workTypeText, NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceRelationText(final String relationText) {
        return replaceRelationText(com.google.common.base.Optional.fromNullable(relationText));
    }

    public ObjectQuery replaceStructureTexts(final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts) {
        return new ObjectQuery(this.collectionId, this.facetFilters, this.includeHidden, this.institutionId, this.moreLikeObjectId, this.objectIds, this.queryString, this.relationText, DefaultConstructionValidator.getInstance().validateStructureTexts(structureTexts), this.workTypeText, NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceStructureTexts(final com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>> structureTexts) {
        return replaceStructureTexts(com.google.common.base.Optional.fromNullable(structureTexts));
    }

    public ObjectQuery replaceWorkTypeText(final com.google.common.base.Optional<String> workTypeText) {
        return new ObjectQuery(this.collectionId, this.facetFilters, this.includeHidden, this.institutionId, this.moreLikeObjectId, this.objectIds, this.queryString, this.relationText, this.structureTexts, DefaultConstructionValidator.getInstance().validateWorkTypeText(workTypeText), NopConstructionValidator.getInstance());
    }

    public ObjectQuery replaceWorkTypeText(final String workTypeText) {
        return replaceWorkTypeText(com.google.common.base.Optional.fromNullable(workTypeText));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("collection_id", getCollectionId().orNull()).add("facet_filters", getFacetFilters().orNull()).add("include_hidden", getIncludeHidden().orNull()).add("institution_id", getInstitutionId().orNull()).add("more_like_object_id", getMoreLikeObjectId().orNull()).add("object_ids", getObjectIds().orNull()).add("query_string", getQueryString().orNull()).add("relation_text", getRelationText().orNull()).add("structure_texts", getStructureTexts().orNull()).add("work_type_text", getWorkTypeText().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 10);

        if (getCollectionId().isPresent()) {
            oprot.writeString(getCollectionId().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getFacetFilters().isPresent()) {
            getFacetFilters().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getIncludeHidden().isPresent()) {
            oprot.writeBool(getIncludeHidden().get());
        } else {
            oprot.writeNull();
        }

        if (getInstitutionId().isPresent()) {
            oprot.writeString(getInstitutionId().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getMoreLikeObjectId().isPresent()) {
            oprot.writeString(getMoreLikeObjectId().get().toString());
        } else {
            oprot.writeNull();
        }

        if (getObjectIds().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getObjectIds().get().size());
            for (final org.dressdiscover.api.models.object.ObjectId _iter0 : getObjectIds().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getQueryString().isPresent()) {
            oprot.writeString(getQueryString().get());
        } else {
            oprot.writeNull();
        }

        if (getRelationText().isPresent()) {
            oprot.writeString(getRelationText().get());
        } else {
            oprot.writeNull();
        }

        if (getStructureTexts().isPresent()) {
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.LIST, getStructureTexts().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.collect.ImmutableList<String>> _iter0 : getStructureTexts().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeListBegin(org.thryft.protocol.Type.STRING, _iter0.getValue().size());
                for (final String _iter1 : _iter0.getValue()) {
                    oprot.writeString(_iter1);
                }
                oprot.writeListEnd();
            }
            oprot.writeMapEnd();
        } else {
            oprot.writeNull();
        }

        if (getWorkTypeText().isPresent()) {
            oprot.writeString(getWorkTypeText().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.object.ObjectQuery");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCollectionId().isPresent()) {
            oprot.writeFieldBegin("collection_id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getCollectionId().get().toString());
            oprot.writeFieldEnd();
        }

        if (getFacetFilters().isPresent()) {
            oprot.writeFieldBegin("facet_filters", org.thryft.protocol.Type.STRUCT, (short)0);
            getFacetFilters().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getIncludeHidden().isPresent()) {
            oprot.writeFieldBegin("include_hidden", org.thryft.protocol.Type.BOOL, (short)0);
            oprot.writeBool(getIncludeHidden().get());
            oprot.writeFieldEnd();
        }

        if (getInstitutionId().isPresent()) {
            oprot.writeFieldBegin("institution_id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getInstitutionId().get().toString());
            oprot.writeFieldEnd();
        }

        if (getMoreLikeObjectId().isPresent()) {
            oprot.writeFieldBegin("more_like_object_id", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getMoreLikeObjectId().get().toString());
            oprot.writeFieldEnd();
        }

        if (getObjectIds().isPresent()) {
            oprot.writeFieldBegin("object_ids", org.thryft.protocol.Type.SET, (short)0);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getObjectIds().get().size());
            for (final org.dressdiscover.api.models.object.ObjectId _iter0 : getObjectIds().get()) {
                oprot.writeString(_iter0.toString());
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }

        if (getQueryString().isPresent()) {
            oprot.writeFieldBegin("query_string", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getQueryString().get());
            oprot.writeFieldEnd();
        }

        if (getRelationText().isPresent()) {
            oprot.writeFieldBegin("relation_text", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getRelationText().get());
            oprot.writeFieldEnd();
        }

        if (getStructureTexts().isPresent()) {
            oprot.writeFieldBegin("structure_texts", org.thryft.protocol.Type.MAP, (short)0);
            oprot.writeMapBegin(org.thryft.protocol.Type.STRING, org.thryft.protocol.Type.LIST, getStructureTexts().get().size());
            for (com.google.common.collect.ImmutableMap.Entry<String, com.google.common.collect.ImmutableList<String>> _iter0 : getStructureTexts().get().entrySet()) {
                oprot.writeString(_iter0.getKey());
                oprot.writeListBegin(org.thryft.protocol.Type.STRING, _iter0.getValue().size());
                for (final String _iter1 : _iter0.getValue()) {
                    oprot.writeString(_iter1);
                }
                oprot.writeListEnd();
            }
            oprot.writeMapEnd();
            oprot.writeFieldEnd();
        }

        if (getWorkTypeText().isPresent()) {
            oprot.writeFieldBegin("work_type_text", org.thryft.protocol.Type.STRING, (short)0);
            oprot.writeString(getWorkTypeText().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<org.dressdiscover.api.models.collection.CollectionId> collectionId;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectFacetFilters> facetFilters;

    private final com.google.common.base.Optional<Boolean> includeHidden;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.institution.InstitutionId> institutionId;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.object.ObjectId> moreLikeObjectId;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<org.dressdiscover.api.models.object.ObjectId>> objectIds;

    private final com.google.common.base.Optional<String> queryString;

    private final com.google.common.base.Optional<String> relationText;

    /**
     * key=(value OR value...) AND key=(value OR value...)
     */
    private final com.google.common.base.Optional<com.google.common.collect.ImmutableMap<String, com.google.common.collect.ImmutableList<String>>> structureTexts;

    private final com.google.common.base.Optional<String> workTypeText;
}
