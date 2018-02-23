package org.dressdiscover.api.models.worksheet;

public final class WorksheetFeatureValueDefinition implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            id = null;
            displayName = com.google.common.base.Optional.<String> absent();
            image = com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> absent();
        }

        public Builder(final WorksheetFeatureValueDefinition other) {
            this.id = other.getId();
            this.displayName = other.getDisplayName();
            this.image = other.getImage();
        }

        protected WorksheetFeatureValueDefinition _build(final String id, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image) {
            return new WorksheetFeatureValueDefinition(id, displayName, image);
        }

        public WorksheetFeatureValueDefinition build() {
            UncheckedValidator.validate(id, displayName, image);

            return _build(id, displayName, image);
        }

        public final com.google.common.base.Optional<String> getDisplayName() {
            return displayName;
        }

        public final @javax.annotation.Nullable String getId() {
            return id;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> getImage() {
            return image;
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
                    image = com.google.common.base.Optional.of(org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.readAsStruct(iprot));
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
                    case "image": {
                        image = com.google.common.base.Optional.of(org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.readAsStruct(iprot, unknownFieldCallback));
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

        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case ID: setId((String)value); return this;
            case DISPLAY_NAME: setDisplayName((String)value); return this;
            case IMAGE: setImage((org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage)value); return this;
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

        public Builder setId(final String id) {
            UncheckedValidator.validateId(id);
            this.id = id;
            return this;
        }

        public Builder setIfPresent(final WorksheetFeatureValueDefinition other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setId(other.getId());
            if (other.getDisplayName().isPresent()) {
                setDisplayName(other.getDisplayName());
            }
            if (other.getImage().isPresent()) {
                setImage(other.getImage());
            }

            return this;
        }

        public Builder setImage(final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image) {
            UncheckedValidator.validateImage(image);
            this.image = image;
            return this;
        }

        public Builder setImage(final @javax.annotation.Nullable org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage image) {
            return setImage(com.google.common.base.Optional.fromNullable(image));
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
            case IMAGE: return unsetImage();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetDisplayName() {
            this.displayName = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetId() {
            this.id = null;
            return this;
        }

        public Builder unsetImage() {
            this.image = com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> absent();
            return this;
        }

        private @javax.annotation.Nullable String id;
        private com.google.common.base.Optional<String> displayName;
        private com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<WorksheetFeatureValueDefinition> {
        @Override
        public WorksheetFeatureValueDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueDefinition.readAs(iprot, type);
        }

        @Override
        public WorksheetFeatureValueDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueDefinition.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public WorksheetFeatureValueDefinition readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueDefinition.readAsList(iprot);
        }

        @Override
        public WorksheetFeatureValueDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueDefinition.readAsStruct(iprot);
        }

        @Override
        public WorksheetFeatureValueDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return WorksheetFeatureValueDefinition.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        ID("id", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "id", org.thryft.protocol.Type.STRING),
        DISPLAY_NAME("displayName", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "display_name", org.thryft.protocol.Type.STRING),
        IMAGE("image", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage>() {}, false, (short)0, "image", org.thryft.protocol.Type.STRUCT);

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
            case "image": return IMAGE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "id": return ID;
            case "display_name": return DISPLAY_NAME;
            case "image": return IMAGE;
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
        public static void validate(final String id, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image) throws org.thryft.protocol.InputProtocolException {
            validateId(id);
            validateDisplayName(displayName);
            validateImage(image);
        }

        public static void validateId(final String id) throws org.thryft.protocol.InputProtocolException {
            if (id == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition: id is null");
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
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition.id: blank '%s' (length=%d)", id, __strLen));
                }
            }
            if (id.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.ID, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition.id: less than min length 1");
            }
        }

        public static void validateDisplayName(final com.google.common.base.Optional<String> displayName) throws org.thryft.protocol.InputProtocolException {
            if (displayName == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DISPLAY_NAME, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition: displayName is null");
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
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DISPLAY_NAME, String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition.displayName: blank '%s' (length=%d)", displayName.get(), __strLen));
                }
            }
            if (displayName.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DISPLAY_NAME, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition.displayName: less than min length 1");
            }
        }

        public static void validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image) throws org.thryft.protocol.InputProtocolException {
            if (image == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IMAGE, "org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition: image is null");
            }
            if (!image.isPresent()) {
                return;
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final String id, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image) {
            validateId(id);
            validateDisplayName(displayName);
            validateImage(image);
        }

        public static void validateId(final String id) {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition: id is null");
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
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition.id: blank '%s' (length=%d)", id, __strLen));
                }
            }
            if (id.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition.id: less than min length 1");
            }
        }

        public static void validateDisplayName(final com.google.common.base.Optional<String> displayName) {
            if (displayName == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition: displayName is null");
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
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition.displayName: blank '%s' (length=%d)", displayName.get(), __strLen));
                }
            }
            if (displayName.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition.displayName: less than min length 1");
            }
        }

        public static void validateImage(final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image) {
            if (image == null) {
                throw new NullPointerException("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition: image is null");
            }
            if (!image.isPresent()) {
                return;
            }
        }
    }

    /**
     * Copy constructor
     */
    public WorksheetFeatureValueDefinition(final WorksheetFeatureValueDefinition other) {
        this(other.getId(), other.getDisplayName(), other.getImage());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected WorksheetFeatureValueDefinition(final String id, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image) {
        this.id = id;
        this.displayName = displayName;
        this.image = image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final WorksheetFeatureValueDefinition other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<WorksheetFeatureValueDefinition> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static WorksheetFeatureValueDefinition create(final String id) {
        UncheckedValidator.validate(id, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> absent());
        return new WorksheetFeatureValueDefinition(id, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static WorksheetFeatureValueDefinition create(final String id, @javax.annotation.Nullable final String displayName, @javax.annotation.Nullable final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage image) {
        final com.google.common.base.Optional<String> displayNameOptional = com.google.common.base.Optional.fromNullable(displayName);
        final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> imageOptional = com.google.common.base.Optional.fromNullable(image);
        UncheckedValidator.validate(id, displayNameOptional, imageOptional);
        return new WorksheetFeatureValueDefinition(id, displayNameOptional, imageOptional);
    }

    /**
     * Optional factory method
     */
    public static WorksheetFeatureValueDefinition create(final String id, final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image) {
        UncheckedValidator.validate(id, displayName, image);
        return new WorksheetFeatureValueDefinition(id, displayName, image);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof WorksheetFeatureValueDefinition)) {
            return false;
        }

        final WorksheetFeatureValueDefinition other = (WorksheetFeatureValueDefinition)otherObject;

        if (!(getId().equals(other.getId()))) {
            return false;
        }

        if (!(((getDisplayName().isPresent() && other.getDisplayName().isPresent()) ? (getDisplayName().get().equals(other.getDisplayName().get())) : (!getDisplayName().isPresent() && !other.getDisplayName().isPresent())))) {
            return false;
        }

        if (!(((getImage().isPresent() && other.getImage().isPresent()) ? (getImage().get().equals(other.getImage().get())) : (!getImage().isPresent() && !other.getImage().isPresent())))) {
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
        case IMAGE: return getImage();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getDisplayName() {
        return displayName;
    }

    public final String getId() {
        return id;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> getImage() {
        return image;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getId().hashCode();
        if (getDisplayName().isPresent()) {
            hashCode = 31 * hashCode + getDisplayName().get().hashCode();
        }
        if (getImage().isPresent()) {
            hashCode = 31 * hashCode + getImage().get().hashCode();
        }
        return hashCode;
    }

    public static WorksheetFeatureValueDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureValueDefinition readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static WorksheetFeatureValueDefinition readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String id;
        com.google.common.base.Optional<String> displayName = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image = com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            id = iprot.readString();
            if (__list.getSize() > 1) {
                displayName = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                image = com.google.common.base.Optional.of(org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(id, displayName, image);

        return new WorksheetFeatureValueDefinition(id, displayName, image);
    }

    public static WorksheetFeatureValueDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static WorksheetFeatureValueDefinition readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable String id = null;
        com.google.common.base.Optional<String> displayName = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image = com.google.common.base.Optional.<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> absent();

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
                case "image": {
                    image = com.google.common.base.Optional.of(org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage.readAsStruct(iprot, unknownFieldCallback));
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

        ReadValidator.validate(id, displayName, image);

        return new WorksheetFeatureValueDefinition(id, displayName, image);
    }

    public WorksheetFeatureValueDefinition replaceDisplayName(final com.google.common.base.Optional<String> displayName) {
        UncheckedValidator.validateDisplayName(displayName);
        return new WorksheetFeatureValueDefinition(this.id, displayName, this.image);
    }

    public WorksheetFeatureValueDefinition replaceDisplayName(@javax.annotation.Nullable final String displayName) {
        return replaceDisplayName(com.google.common.base.Optional.fromNullable(displayName));
    }

    public WorksheetFeatureValueDefinition replaceId(final String id) {
        UncheckedValidator.validateId(id);
        return new WorksheetFeatureValueDefinition(id, this.displayName, this.image);
    }

    public WorksheetFeatureValueDefinition replaceImage(final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image) {
        UncheckedValidator.validateImage(image);
        return new WorksheetFeatureValueDefinition(this.id, this.displayName, image);
    }

    public WorksheetFeatureValueDefinition replaceImage(@javax.annotation.Nullable final org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage image) {
        return replaceImage(com.google.common.base.Optional.fromNullable(image));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("id", getId()).add("display_name", getDisplayName().orNull()).add("image", getImage().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 3);

        oprot.writeString(getId());

        if (getDisplayName().isPresent()) {
            oprot.writeString(getDisplayName().get());
        } else {
            oprot.writeNull();
        }

        if (getImage().isPresent()) {
            getImage().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition");
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

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeIdField(oprot);

        writeDisplayNameField(oprot);

        writeImageField(oprot);

        oprot.writeFieldStop();
    }

    public void writeIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.ID);
        oprot.writeString(getId());
        oprot.writeFieldEnd();
    }

    public void writeImageField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getImage().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.IMAGE);
            getImage().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    private final String id;

    private final com.google.common.base.Optional<String> displayName;

    private final com.google.common.base.Optional<org.dressdiscover.api.models.worksheet.WorksheetFeatureValueImage> image;
}
