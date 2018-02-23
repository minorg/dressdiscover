package org.dressdiscover.api.models.worksheet;

public final class WorksheetFeatureSetDefinition implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            id = null;
            childFeatureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> absent();
            displayName = com.google.common.base.Optional.<String> absent();
            features = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> absent();
        }

        public Builder(final WorksheetFeatureSetDefinition other) {
            this.id = other.getId();
            this.childFeatureSets = other.getChildFeatureSets();
            this.displayName = other.getDisplayName();
            this.features = other.getFeatures();
        }

        protected WorksheetFeatureSetDefinition _build(final String id, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features) {
            return new WorksheetFeatureSetDefinition(id, childFeatureSets, displayName, features);
        }

        public WorksheetFeatureSetDefinition build() {
            UncheckedValidator.validate(id, childFeatureSets, displayName, features);

            return _build(id, childFeatureSets, displayName, features);
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> getChildFeatureSets() {
            return childFeatureSets;
        }

        public final com.google.common.base.Optional<String> getDisplayName() {
            return displayName;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> getFeatures() {
            return features;
        }

        public final @javax.annotation.Nullable String getId() {
            return id;
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
                id = iprot.readString();
                if (__list.getSize() > 1) {
                    try {
                        childFeatureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CHILD_FEATURE_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 2) {
                    displayName = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 3) {
                    try {
                        features = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURES, e.getCause());
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
                    case "id": {
                        id = iprot.readString();
                        break;
                    }
                    case "child_feature_sets": {
                        try {
                            childFeatureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot, unknownFieldCallback));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CHILD_FEATURE_SETS, e.getCause());
                        }
                        break;
                    }
                    case "display_name": {
                        displayName = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "features": {
                        try {
                            features = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition.readAsStruct(iprot, unknownFieldCallback));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURES, e.getCause());
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
            case ID: setId((String)value); return this;
            case CHILD_FEATURE_SETS: setChildFeatureSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>)value); return this;
            case DISPLAY_NAME: setDisplayName((String)value); return this;
            case FEATURES: setFeatures((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setChildFeatureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets) {
            UncheckedValidator.validateChildFeatureSets(childFeatureSets);
            this.childFeatureSets = childFeatureSets;
            return this;
        }

        public Builder setChildFeatureSets(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> childFeatureSets) {
            return setChildFeatureSets(com.google.common.base.Optional.fromNullable(childFeatureSets));
        }

        public Builder setDisplayName(final com.google.common.base.Optional<String> displayName) {
            UncheckedValidator.validateDisplayName(displayName);
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(final @javax.annotation.Nullable String displayName) {
            return setDisplayName(com.google.common.base.Optional.fromNullable(displayName));
        }

        public Builder setFeatures(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features) {
            UncheckedValidator.validateFeatures(features);
            this.features = features;
            return this;
        }

        public Builder setFeatures(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> features) {
            return setFeatures(com.google.common.base.Optional.fromNullable(features));
        }

        public Builder setId(final String id) {
            UncheckedValidator.validateId(id);
            this.id = id;
            return this;
        }

        public Builder setIfPresent(final WorksheetFeatureSetDefinition other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            if (other.getChildFeatureSets().isPresent()) {
                setChildFeatureSets(other.getChildFeatureSets());
            }
            if (other.getDisplayName().isPresent()) {
                setDisplayName(other.getDisplayName());
            }
            if (other.getFeatures().isPresent()) {
                setFeatures(other.getFeatures());
            }

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
            case ID: return unsetId();
            case CHILD_FEATURE_SETS: return unsetChildFeatureSets();
            case DISPLAY_NAME: return unsetDisplayName();
            case FEATURES: return unsetFeatures();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetChildFeatureSets() {
            this.childFeatureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> absent();
            return this;
        }

        public Builder unsetDisplayName() {
            this.displayName = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetFeatures() {
            this.features = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> absent();
            return this;
        }

        public Builder unsetId() {
            this.id = null;
            return this;
        }

        private @javax.annotation.Nullable String id;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets;
        private com.google.common.base.Optional<String> displayName;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<WorksheetFeatureSetDefinition> {
        @Override
        public WorksheetFeatureSetDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureSetDefinition.readAs(iprot, type);
        }

        @Override
        public WorksheetFeatureSetDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureSetDefinition.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public WorksheetFeatureSetDefinition readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureSetDefinition.readAsList(iprot);
        }

        @Override
        public WorksheetFeatureSetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureSetDefinition.readAsStruct(iprot);
        }

        @Override
        public WorksheetFeatureSetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureSetDefinition.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "id", org.thryft.protocol.Type.STRING),
        CHILD_FEATURE_SETS("childFeatureSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>>() {}, false, (short)0, "child_feature_sets", org.thryft.protocol.Type.LIST),
        DISPLAY_NAME("displayName", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "display_name", org.thryft.protocol.Type.STRING),
        FEATURES("features", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>>() {}, false, (short)0, "features", org.thryft.protocol.Type.LIST);

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
            case "id": return ID;
            case "childFeatureSets": return CHILD_FEATURE_SETS;
            case "displayName": return DISPLAY_NAME;
            case "features": return FEATURES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "id": return ID;
            case "child_feature_sets": return CHILD_FEATURE_SETS;
            case "display_name": return DISPLAY_NAME;
            case "features": return FEATURES;
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
        public static void validate(final String id, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features) throws org.thryft.protocol.InputProtocolException {
            validateId(id);
            validateChildFeatureSets(childFeatureSets);
            validateDisplayName(displayName);
            validateFeatures(features);
        }

        public static void validateId(final String id) throws org.thryft.protocol.InputProtocolException {
            if (id == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: id is null");
            }
            {
                final int __strLen = id.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(id.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.id: blank '%s' (length=%d)", id, __strLen));
                }
            }
            if (id.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.id: less than min length 1");
            }
        }

        public static void validateChildFeatureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets) throws org.thryft.protocol.InputProtocolException {
            if (childFeatureSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CHILD_FEATURE_SETS, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: childFeatureSets is null");
            }
            if (!childFeatureSets.isPresent()) {
                return;
            }
            if (childFeatureSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CHILD_FEATURE_SETS, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.childFeatureSets: less than min length 1");
            }
        }

        public static void validateDisplayName(final com.google.common.base.Optional<String> displayName) throws org.thryft.protocol.InputProtocolException {
            if (displayName == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DISPLAY_NAME, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: displayName is null");
            }
            if (!displayName.isPresent()) {
                return;
            }
            {
                final int __strLen = displayName.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(displayName.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DISPLAY_NAME, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.displayName: blank '%s' (length=%d)", displayName.get(), __strLen));
                }
            }
            if (displayName.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DISPLAY_NAME, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.displayName: less than min length 1");
            }
        }

        public static void validateFeatures(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features) throws org.thryft.protocol.InputProtocolException {
            if (features == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FEATURES, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: features is null");
            }
            if (!features.isPresent()) {
                return;
            }
            if (features.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURES, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.features: less than min length 1");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final String id, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features) {
            validateId(id);
            validateChildFeatureSets(childFeatureSets);
            validateDisplayName(displayName);
            validateFeatures(features);
        }

        public static void validateId(final String id) {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: id is null");
            }
            {
                final int __strLen = id.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(id.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.id: blank '%s' (length=%d)", id, __strLen));
                }
            }
            if (id.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.id: less than min length 1");
            }
        }

        public static void validateChildFeatureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets) {
            if (childFeatureSets == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: childFeatureSets is null");
            }
            if (!childFeatureSets.isPresent()) {
                return;
            }
            if (childFeatureSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.childFeatureSets: less than min length 1");
            }
        }

        public static void validateDisplayName(final com.google.common.base.Optional<String> displayName) {
            if (displayName == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: displayName is null");
            }
            if (!displayName.isPresent()) {
                return;
            }
            {
                final int __strLen = displayName.get().length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(displayName.get().charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.displayName: blank '%s' (length=%d)", displayName.get(), __strLen));
                }
            }
            if (displayName.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.displayName: less than min length 1");
            }
        }

        public static void validateFeatures(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features) {
            if (features == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: features is null");
            }
            if (!features.isPresent()) {
                return;
            }
            if (features.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.features: less than min length 1");
            }
        }
    }

    /**
     * Copy constructor
     */
    public WorksheetFeatureSetDefinition(final WorksheetFeatureSetDefinition other) {
        this(other.getId(), other.getChildFeatureSets(), other.getDisplayName(), other.getFeatures());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetFeatureSetDefinition(final String id, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features) {
        this.id = id;
        this.childFeatureSets = childFeatureSets;
        this.displayName = displayName;
        this.features = features;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final WorksheetFeatureSetDefinition other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<WorksheetFeatureSetDefinition> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static WorksheetFeatureSetDefinition create(final String id) {
        UncheckedValidator.validate(id, com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> absent());
        return new WorksheetFeatureSetDefinition(id, com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static WorksheetFeatureSetDefinition create(final String id, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> childFeatureSets, @javax.annotation.Nullable final String displayName, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> features) {
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSetsOptional = com.google.common.base.Optional.fromNullable(childFeatureSets);
        final com.google.common.base.Optional<String> displayNameOptional = com.google.common.base.Optional.fromNullable(displayName);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> featuresOptional = com.google.common.base.Optional.fromNullable(features);
        UncheckedValidator.validate(id, childFeatureSetsOptional, displayNameOptional, featuresOptional);
        return new WorksheetFeatureSetDefinition(id, childFeatureSetsOptional, displayNameOptional, featuresOptional);
    }

    /**
     * Optional factory method
     */
    public static WorksheetFeatureSetDefinition create(final String id, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features) {
        UncheckedValidator.validate(id, childFeatureSets, displayName, features);
        return new WorksheetFeatureSetDefinition(id, childFeatureSets, displayName, features);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof WorksheetFeatureSetDefinition)) {
            return false;
        }

        final WorksheetFeatureSetDefinition other = (WorksheetFeatureSetDefinition)otherObject;

        if (!(getId().equals(other.getId()))) {
            return false;
        }

        if (!(((getChildFeatureSets().isPresent() && other.getChildFeatureSets().isPresent()) ? (getChildFeatureSets().get().equals(other.getChildFeatureSets().get())) : (!getChildFeatureSets().isPresent() && !other.getChildFeatureSets().isPresent())))) {
            return false;
        }

        if (!(((getDisplayName().isPresent() && other.getDisplayName().isPresent()) ? (getDisplayName().get().equals(other.getDisplayName().get())) : (!getDisplayName().isPresent() && !other.getDisplayName().isPresent())))) {
            return false;
        }

        if (!(((getFeatures().isPresent() && other.getFeatures().isPresent()) ? (getFeatures().get().equals(other.getFeatures().get())) : (!getFeatures().isPresent() && !other.getFeatures().isPresent())))) {
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
        case ID: return getId();
        case CHILD_FEATURE_SETS: return getChildFeatureSets();
        case DISPLAY_NAME: return getDisplayName();
        case FEATURES: return getFeatures();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> getChildFeatureSets() {
        return childFeatureSets;
    }

    public final com.google.common.base.Optional<String> getDisplayName() {
        return displayName;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> getFeatures() {
        return features;
    }

    public final String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        if (getChildFeatureSets().isPresent()) {
            hashCode = 31 * hashCode + getChildFeatureSets().get().hashCode();
        }
        if (getDisplayName().isPresent()) {
            hashCode = 31 * hashCode + getDisplayName().get().hashCode();
        }
        if (getFeatures().isPresent()) {
            hashCode = 31 * hashCode + getFeatures().get().hashCode();
        }
        return hashCode;
    }

    public static WorksheetFeatureSetDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureSetDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static WorksheetFeatureSetDefinition readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String id;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> absent();
        com.google.common.base.Optional<String> displayName = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            id = iprot.readString();
            if (__list.getSize() > 1) {
                try {
                    childFeatureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CHILD_FEATURE_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 2) {
                displayName = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 3) {
                try {
                    features = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURES, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(id, childFeatureSets, displayName, features);

        return new WorksheetFeatureSetDefinition(id, childFeatureSets, displayName, features);
    }

    public static WorksheetFeatureSetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureSetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable String id = null;
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> absent();
        com.google.common.base.Optional<String> displayName = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "id": {
                    id = iprot.readString();
                    break;
                }
                case "child_feature_sets": {
                    try {
                        childFeatureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.readAsStruct(iprot, unknownFieldCallback));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CHILD_FEATURE_SETS, e.getCause());
                    }
                    break;
                }
                case "display_name": {
                    displayName = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "features": {
                    try {
                        features = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition.readAsStruct(iprot, unknownFieldCallback));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURES, e.getCause());
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

        ReadValidator.validate(id, childFeatureSets, displayName, features);

        return new WorksheetFeatureSetDefinition(id, childFeatureSets, displayName, features);
    }

    public WorksheetFeatureSetDefinition replaceChildFeatureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets) {
        UncheckedValidator.validateChildFeatureSets(childFeatureSets);
        return new WorksheetFeatureSetDefinition(this.id, childFeatureSets, this.displayName, this.features);
    }

    public WorksheetFeatureSetDefinition replaceChildFeatureSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition> childFeatureSets) {
        return replaceChildFeatureSets(com.google.common.base.Optional.fromNullable(childFeatureSets));
    }

    public WorksheetFeatureSetDefinition replaceDisplayName(final com.google.common.base.Optional<String> displayName) {
        UncheckedValidator.validateDisplayName(displayName);
        return new WorksheetFeatureSetDefinition(this.id, this.childFeatureSets, displayName, this.features);
    }

    public WorksheetFeatureSetDefinition replaceDisplayName(@javax.annotation.Nullable final String displayName) {
        return replaceDisplayName(com.google.common.base.Optional.fromNullable(displayName));
    }

    public WorksheetFeatureSetDefinition replaceFeatures(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features) {
        UncheckedValidator.validateFeatures(features);
        return new WorksheetFeatureSetDefinition(this.id, this.childFeatureSets, this.displayName, features);
    }

    public WorksheetFeatureSetDefinition replaceFeatures(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition> features) {
        return replaceFeatures(com.google.common.base.Optional.fromNullable(features));
    }

    public WorksheetFeatureSetDefinition replaceId(final String id) {
        UncheckedValidator.validateId(id);
        return new WorksheetFeatureSetDefinition(id, this.childFeatureSets, this.displayName, this.features);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("child_feature_sets", getChildFeatureSets().orNull()).add("display_name", getDisplayName().orNull()).add("features", getFeatures().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getId());

        if (getChildFeatureSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getChildFeatureSets().get().size());
            for (final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition _iter0 : getChildFeatureSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getDisplayName().isPresent()) {
            oprot.writeString(getDisplayName().get());
        } else {
            oprot.writeNull();
        }

        if (getFeatures().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getFeatures().get().size());
            for (final org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition _iter0 : getFeatures().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeChildFeatureSetsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getChildFeatureSets().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.CHILD_FEATURE_SETS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getChildFeatureSets().get().size());
            for (final org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition _iter0 : getChildFeatureSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeDisplayNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDisplayName().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DISPLAY_NAME);
            oprot.writeString(getDisplayName().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeFeaturesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFeatures().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.FEATURES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getFeatures().get().size());
            for (final org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition _iter0 : getFeatures().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeIdField(oprot);

        writeChildFeatureSetsField(oprot);

        writeDisplayNameField(oprot);

        writeFeaturesField(oprot);

        oprot.writeFieldStop();
    }

    public void writeIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.ID);
        oprot.writeString(getId());
        oprot.writeFieldEnd();
    }

    private final String id;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition>> childFeatureSets;

    private final com.google.common.base.Optional<String> displayName;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.worksheet.WorksheetFeatureDefinition>> features;
}
