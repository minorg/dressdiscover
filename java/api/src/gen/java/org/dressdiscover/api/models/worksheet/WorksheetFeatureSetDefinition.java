package org.dressdiscover.api.models.worksheet;

public final class WorksheetFeatureSetDefinition implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            id = null;
            displayName = com.google.common.base.Optional.<String> absent();
            extentIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            featureIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
        }

        public Builder(final WorksheetFeatureSetDefinition other) {
            this.id = other.getId();
            this.displayName = other.getDisplayName();
            this.extentIds = other.getExtentIds();
            this.featureIds = other.getFeatureIds();
        }

        protected WorksheetFeatureSetDefinition _build(final String id, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds) {
            return new WorksheetFeatureSetDefinition(id, displayName, extentIds, featureIds);
        }

        public WorksheetFeatureSetDefinition build() {
            UncheckedValidator.validate(id, displayName, extentIds, featureIds);

            return _build(id, displayName, extentIds, featureIds);
        }

        public final com.google.common.base.Optional<String> getDisplayName() {
            return displayName;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExtentIds() {
            return extentIds;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getFeatureIds() {
            return featureIds;
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
                    displayName = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 2) {
                    try {
                        extentIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT_IDS, e.getCause());
                    }
                }
                if (__list.getSize() > 3) {
                    try {
                        featureIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_IDS, e.getCause());
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
                    case "display_name": {
                        displayName = com.google.common.base.Optional.of(iprot.readString());
                        break;
                    }
                    case "extent_ids": {
                        try {
                            extentIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                                @Override
                                public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                        final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(iprot.readString());
                                        }
                                        iprot.readSetEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT_IDS, e.getCause());
                        }
                        break;
                    }
                    case "feature_ids": {
                        try {
                            featureIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_IDS, e.getCause());
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
            case DISPLAY_NAME: setDisplayName((String)value); return this;
            case EXTENT_IDS: setExtentIds((com.google.common.collect.ImmutableSet<String>)value); return this;
            case FEATURE_IDS: setFeatureIds((com.google.common.collect.ImmutableList<String>)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setDisplayName(final com.google.common.base.Optional<String> displayName) {
            UncheckedValidator.validateDisplayName(displayName);
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(final @javax.annotation.Nullable String displayName) {
            return setDisplayName(com.google.common.base.Optional.fromNullable(displayName));
        }

        public Builder setExtentIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds) {
            UncheckedValidator.validateExtentIds(extentIds);
            this.extentIds = extentIds;
            return this;
        }

        public Builder setExtentIds(final @javax.annotation.Nullable com.google.common.collect.ImmutableSet<String> extentIds) {
            return setExtentIds(com.google.common.base.Optional.fromNullable(extentIds));
        }

        public Builder setFeatureIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds) {
            UncheckedValidator.validateFeatureIds(featureIds);
            this.featureIds = featureIds;
            return this;
        }

        public Builder setFeatureIds(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<String> featureIds) {
            return setFeatureIds(com.google.common.base.Optional.fromNullable(featureIds));
        }

        public Builder setId(final String id) {
            UncheckedValidator.validateId(id);
            this.id = id;
            return this;
        }

        public Builder setIfPresent(final WorksheetFeatureSetDefinition other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            if (other.getDisplayName().isPresent()) {
                setDisplayName(other.getDisplayName());
            }
            if (other.getExtentIds().isPresent()) {
                setExtentIds(other.getExtentIds());
            }
            if (other.getFeatureIds().isPresent()) {
                setFeatureIds(other.getFeatureIds());
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
            case DISPLAY_NAME: return unsetDisplayName();
            case EXTENT_IDS: return unsetExtentIds();
            case FEATURE_IDS: return unsetFeatureIds();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetDisplayName() {
            this.displayName = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetExtentIds() {
            this.extentIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
            return this;
        }

        public Builder unsetFeatureIds() {
            this.featureIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();
            return this;
        }

        public Builder unsetId() {
            this.id = null;
            return this;
        }

        private @javax.annotation.Nullable String id;
        private com.google.common.base.Optional<String> displayName;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds;
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
        DISPLAY_NAME("displayName", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "display_name", org.thryft.protocol.Type.STRING),
        EXTENT_IDS("extentIds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableSet<String>>() {}, false, (short)0, "extent_ids", org.thryft.protocol.Type.SET),
        FEATURE_IDS("featureIds", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<String>>() {}, false, (short)0, "feature_ids", org.thryft.protocol.Type.LIST);

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
            case "displayName": return DISPLAY_NAME;
            case "extentIds": return EXTENT_IDS;
            case "featureIds": return FEATURE_IDS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "id": return ID;
            case "display_name": return DISPLAY_NAME;
            case "extent_ids": return EXTENT_IDS;
            case "feature_ids": return FEATURE_IDS;
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
        public static void validate(final String id, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds) throws org.thryft.protocol.InputProtocolException {
            validateId(id);
            validateDisplayName(displayName);
            validateExtentIds(extentIds);
            validateFeatureIds(featureIds);
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

        public static void validateDisplayName(final com.google.common.base.Optional<String> displayName) throws org.thryft.protocol.InputProtocolException {
            if (displayName == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DISPLAY_NAME, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: displayName is null");
            }
            if (!displayName.isPresent()) {
                return;
            }
            if (displayName.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DISPLAY_NAME, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.displayName: less than min length 1");
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
        }

        public static void validateExtentIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds) throws org.thryft.protocol.InputProtocolException {
            if (extentIds == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXTENT_IDS, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: extentIds is null");
            }
            if (!extentIds.isPresent()) {
                return;
            }
            if (extentIds.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT_IDS, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.extentIds: less than min length 1");
            }
            for (final String __element0 : extentIds.get()) {
                {
                    final int __strLen = __element0.length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(__element0.charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT_IDS, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.extentIds: element: blank '%s' (length=%d)", __element0, __strLen));
                    }
                }
                if (__element0.isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT_IDS, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.extentIds: element: less than min length 1");
                }
            }
        }

        public static void validateFeatureIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds) throws org.thryft.protocol.InputProtocolException {
            if (featureIds == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.FEATURE_IDS, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: featureIds is null");
            }
            if (!featureIds.isPresent()) {
                return;
            }
            if (featureIds.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_IDS, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.featureIds: less than min length 1");
            }
            for (final String __element0 : featureIds.get()) {
                {
                    final int __strLen = __element0.length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(__element0.charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_IDS, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.featureIds: element: blank '%s' (length=%d)", __element0, __strLen));
                    }
                }
                if (__element0.isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_IDS, "org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.featureIds: element: less than min length 1");
                }
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final String id, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds) {
            validateId(id);
            validateDisplayName(displayName);
            validateExtentIds(extentIds);
            validateFeatureIds(featureIds);
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

        public static void validateDisplayName(final com.google.common.base.Optional<String> displayName) {
            if (displayName == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: displayName is null");
            }
            if (!displayName.isPresent()) {
                return;
            }
            if (displayName.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.displayName: less than min length 1");
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
        }

        public static void validateExtentIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds) {
            if (extentIds == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: extentIds is null");
            }
            if (!extentIds.isPresent()) {
                return;
            }
            if (extentIds.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.extentIds: less than min length 1");
            }
            for (final String __element0 : extentIds.get()) {
                {
                    final int __strLen = __element0.length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(__element0.charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.extentIds: element: blank '%s' (length=%d)", __element0, __strLen));
                    }
                }
                if (__element0.isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.extentIds: element: less than min length 1");
                }
            }
        }

        public static void validateFeatureIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds) {
            if (featureIds == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition: featureIds is null");
            }
            if (!featureIds.isPresent()) {
                return;
            }
            if (featureIds.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.featureIds: less than min length 1");
            }
            for (final String __element0 : featureIds.get()) {
                {
                    final int __strLen = __element0.length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(__element0.charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.featureIds: element: blank '%s' (length=%d)", __element0, __strLen));
                    }
                }
                if (__element0.isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.featureIds: element: less than min length 1");
                }
            }
        }
    }

    /**
     * Copy constructor
     */
    public WorksheetFeatureSetDefinition(final WorksheetFeatureSetDefinition other) {
        this(other.getId(), other.getDisplayName(), other.getExtentIds(), other.getFeatureIds());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetFeatureSetDefinition(final String id, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds) {
        this.id = id;
        this.displayName = displayName;
        this.extentIds = extentIds;
        this.featureIds = featureIds;
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
        UncheckedValidator.validate(id, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent());
        return new WorksheetFeatureSetDefinition(id, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent(), com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static WorksheetFeatureSetDefinition create(final String id, @javax.annotation.Nullable final String displayName, @javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> extentIds, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> featureIds) {
        final com.google.common.base.Optional<String> displayNameOptional = com.google.common.base.Optional.fromNullable(displayName);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIdsOptional = com.google.common.base.Optional.fromNullable(extentIds);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIdsOptional = com.google.common.base.Optional.fromNullable(featureIds);
        UncheckedValidator.validate(id, displayNameOptional, extentIdsOptional, featureIdsOptional);
        return new WorksheetFeatureSetDefinition(id, displayNameOptional, extentIdsOptional, featureIdsOptional);
    }

    /**
     * Optional factory method
     */
    public static WorksheetFeatureSetDefinition create(final String id, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds) {
        UncheckedValidator.validate(id, displayName, extentIds, featureIds);
        return new WorksheetFeatureSetDefinition(id, displayName, extentIds, featureIds);
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

        if (!(((getDisplayName().isPresent() && other.getDisplayName().isPresent()) ? (getDisplayName().get().equals(other.getDisplayName().get())) : (!getDisplayName().isPresent() && !other.getDisplayName().isPresent())))) {
            return false;
        }

        if (!(((getExtentIds().isPresent() && other.getExtentIds().isPresent()) ? (getExtentIds().get().equals(other.getExtentIds().get())) : (!getExtentIds().isPresent() && !other.getExtentIds().isPresent())))) {
            return false;
        }

        if (!(((getFeatureIds().isPresent() && other.getFeatureIds().isPresent()) ? (getFeatureIds().get().equals(other.getFeatureIds().get())) : (!getFeatureIds().isPresent() && !other.getFeatureIds().isPresent())))) {
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
        case DISPLAY_NAME: return getDisplayName();
        case EXTENT_IDS: return getExtentIds();
        case FEATURE_IDS: return getFeatureIds();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getDisplayName() {
        return displayName;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> getExtentIds() {
        return extentIds;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getFeatureIds() {
        return featureIds;
    }

    public final String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        if (getDisplayName().isPresent()) {
            hashCode = 31 * hashCode + getDisplayName().get().hashCode();
        }
        if (getExtentIds().isPresent()) {
            hashCode = 31 * hashCode + getExtentIds().get().hashCode();
        }
        if (getFeatureIds().isPresent()) {
            hashCode = 31 * hashCode + getFeatureIds().get().hashCode();
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
        com.google.common.base.Optional<String> displayName = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            id = iprot.readString();
            if (__list.getSize() > 1) {
                displayName = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                try {
                    extentIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(iprot.readString());
                                }
                                iprot.readSetEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT_IDS, e.getCause());
                }
            }
            if (__list.getSize() > 3) {
                try {
                    featureIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_IDS, e.getCause());
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(id, displayName, extentIds, featureIds);

        return new WorksheetFeatureSetDefinition(id, displayName, extentIds, featureIds);
    }

    public static WorksheetFeatureSetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureSetDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable String id = null;
        com.google.common.base.Optional<String> displayName = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableSet<String>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<String>> absent();

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
                case "display_name": {
                    displayName = com.google.common.base.Optional.of(iprot.readString());
                    break;
                }
                case "extent_ids": {
                    try {
                        extentIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.SetBegin sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequenceBuilder = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTENT_IDS, e.getCause());
                    }
                    break;
                }
                case "feature_ids": {
                    try {
                        featureIds = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<String>>() {
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
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.FEATURE_IDS, e.getCause());
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

        ReadValidator.validate(id, displayName, extentIds, featureIds);

        return new WorksheetFeatureSetDefinition(id, displayName, extentIds, featureIds);
    }

    public WorksheetFeatureSetDefinition replaceDisplayName(final com.google.common.base.Optional<String> displayName) {
        UncheckedValidator.validateDisplayName(displayName);
        return new WorksheetFeatureSetDefinition(this.id, displayName, this.extentIds, this.featureIds);
    }

    public WorksheetFeatureSetDefinition replaceDisplayName(@javax.annotation.Nullable final String displayName) {
        return replaceDisplayName(com.google.common.base.Optional.fromNullable(displayName));
    }

    public WorksheetFeatureSetDefinition replaceExtentIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds) {
        UncheckedValidator.validateExtentIds(extentIds);
        return new WorksheetFeatureSetDefinition(this.id, this.displayName, extentIds, this.featureIds);
    }

    public WorksheetFeatureSetDefinition replaceExtentIds(@javax.annotation.Nullable final com.google.common.collect.ImmutableSet<String> extentIds) {
        return replaceExtentIds(com.google.common.base.Optional.fromNullable(extentIds));
    }

    public WorksheetFeatureSetDefinition replaceFeatureIds(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds) {
        UncheckedValidator.validateFeatureIds(featureIds);
        return new WorksheetFeatureSetDefinition(this.id, this.displayName, this.extentIds, featureIds);
    }

    public WorksheetFeatureSetDefinition replaceFeatureIds(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<String> featureIds) {
        return replaceFeatureIds(com.google.common.base.Optional.fromNullable(featureIds));
    }

    public WorksheetFeatureSetDefinition replaceId(final String id) {
        UncheckedValidator.validateId(id);
        return new WorksheetFeatureSetDefinition(id, this.displayName, this.extentIds, this.featureIds);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("display_name", getDisplayName().orNull()).add("extent_ids", getExtentIds().orNull()).add("feature_ids", getFeatureIds().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 4);

        oprot.writeString(getId());

        if (getDisplayName().isPresent()) {
            oprot.writeString(getDisplayName().get());
        } else {
            oprot.writeNull();
        }

        if (getExtentIds().isPresent()) {
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExtentIds().get().size());
            for (final String _iter0 : getExtentIds().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
        } else {
            oprot.writeNull();
        }

        if (getFeatureIds().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getFeatureIds().get().size());
            for (final String _iter0 : getFeatureIds().get()) {
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
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeDisplayNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDisplayName().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DISPLAY_NAME);
            oprot.writeString(getDisplayName().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeExtentIdsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExtentIds().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXTENT_IDS);
            oprot.writeSetBegin(org.thryft.protocol.Type.STRING, getExtentIds().get().size());
            for (final String _iter0 : getExtentIds().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeSetEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeFeatureIdsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFeatureIds().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.FEATURE_IDS);
            oprot.writeListBegin(org.thryft.protocol.Type.STRING, getFeatureIds().get().size());
            for (final String _iter0 : getFeatureIds().get()) {
                oprot.writeString(_iter0);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeIdField(oprot);

        writeDisplayNameField(oprot);

        writeExtentIdsField(oprot);

        writeFeatureIdsField(oprot);

        oprot.writeFieldStop();
    }

    public void writeIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.ID);
        oprot.writeString(getId());
        oprot.writeFieldEnd();
    }

    private final String id;

    private final com.google.common.base.Optional<String> displayName;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<String>> extentIds;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> featureIds;
}
