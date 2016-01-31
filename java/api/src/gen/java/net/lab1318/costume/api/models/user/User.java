package net.lab1318.costume.api.models.user;

public class User implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public static class Builder {
        public Builder() {
            emailAddress = null;
            modelMetadata = null;
        }

        public Builder(final User other) {
            this.emailAddress = other.getEmailAddress();
            this.modelMetadata = other.getModelMetadata();
        }

        protected User _build(final org.thryft.native_.EmailAddress emailAddress, final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
            return new User(emailAddress, modelMetadata);
        }

        public User build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(emailAddress, "net.lab1318.costume.api.models.user.User: missing emailAddress"), com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.user.User: missing modelMetadata"));
        }

        public final org.thryft.native_.EmailAddress getEmailAddress() {
            return emailAddress;
        }

        public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
            return modelMetadata;
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
            iprot.readListBegin();
            emailAddress = new org.thryft.native_.EmailAddress(iprot.readString());
            modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
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
                case "email_address": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        emailAddress = new org.thryft.native_.EmailAddress(iprot.readString());
                    }
                    break;
                }
                case "model_metadata": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
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

        public Builder setEmailAddress(final org.thryft.native_.EmailAddress emailAddress) {
            this.emailAddress = com.google.common.base.Preconditions.checkNotNull(emailAddress);
            return this;
        }

        public Builder setIfPresent(final User other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setEmailAddress(other.getEmailAddress());
            setModelMetadata(other.getModelMetadata());

            return this;
        }

        public Builder setModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
            this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata);
            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "email_address": setEmailAddress((org.thryft.native_.EmailAddress)value); return this;
            case "model_metadata": setModelMetadata((net.lab1318.costume.api.models.ModelMetadata)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetEmailAddress() {
            this.emailAddress = null;
            return this;
        }

        public Builder unsetModelMetadata() {
            this.modelMetadata = null;
            return this;
        }

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "email_address": return unsetEmailAddress();
            case "model_metadata": return unsetModelMetadata();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private org.thryft.native_.EmailAddress emailAddress;
        private net.lab1318.costume.api.models.ModelMetadata modelMetadata;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        EMAIL_ADDRESS("emailAddress", new com.google.common.reflect.TypeToken<org.thryft.native_.EmailAddress>() {}, true, 2, "email_address", org.thryft.protocol.Type.STRING),
        MODEL_METADATA("modelMetadata", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.ModelMetadata>() {}, true, 1, "model_metadata", org.thryft.protocol.Type.STRUCT);

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
            case "emailAddress": return EMAIL_ADDRESS;
            case "modelMetadata": return MODEL_METADATA;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "email_address": return EMAIL_ADDRESS;
            case "model_metadata": return MODEL_METADATA;
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
    public User(final User other) {
        this(other.getEmailAddress(), other.getModelMetadata());
    }

    /**
     * Optional constructor
     */
    public User(final org.thryft.native_.EmailAddress emailAddress, final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
        this.emailAddress = com.google.common.base.Preconditions.checkNotNull(emailAddress, "net.lab1318.costume.api.models.user.User: missing emailAddress");
        this.modelMetadata = com.google.common.base.Preconditions.checkNotNull(modelMetadata, "net.lab1318.costume.api.models.user.User: missing modelMetadata");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final User other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<User> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof User)) {
            return false;
        }

        final User other = (User)otherObject;
        return
            getEmailAddress().equals(other.getEmailAddress()) &&
            getModelMetadata().equals(other.getModelMetadata());
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
        case EMAIL_ADDRESS: return getEmailAddress();
        case MODEL_METADATA: return getModelMetadata();
        default:
            throw new IllegalStateException();
        }
    }

    public final org.thryft.native_.EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public final net.lab1318.costume.api.models.ModelMetadata getModelMetadata() {
        return modelMetadata;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getEmailAddress().hashCode();
        hashCode = 31 * hashCode + getModelMetadata().hashCode();
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static User readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static User readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.EmailAddress emailAddress = null;
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;

        iprot.readListBegin();
        emailAddress = new org.thryft.native_.EmailAddress(iprot.readString());
        modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
        iprot.readListEnd();
        try {
            return new User(emailAddress, modelMetadata);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static User readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static User readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        org.thryft.native_.EmailAddress emailAddress = null;
        net.lab1318.costume.api.models.ModelMetadata modelMetadata = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "email_address": {
                if (!ifield.hasId() || ifield.getId() == 2) {
                    emailAddress = new org.thryft.native_.EmailAddress(iprot.readString());
                }
                break;
            }
            case "model_metadata": {
                if (!ifield.hasId() || ifield.getId() == 1) {
                    modelMetadata = net.lab1318.costume.api.models.ModelMetadata.readAsStruct(iprot);
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
            return new User(emailAddress, modelMetadata);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public User replaceEmailAddress(final org.thryft.native_.EmailAddress emailAddress) {
        return new User(emailAddress, this.modelMetadata);
    }

    public User replaceModelMetadata(final net.lab1318.costume.api.models.ModelMetadata modelMetadata) {
        return new User(this.emailAddress, modelMetadata);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("email_address", getEmailAddress()).add("model_metadata", getModelMetadata()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeString(getEmailAddress().toString());

        getModelMetadata().writeAsStruct(oprot);

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.models.user.User");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("email_address", org.thryft.protocol.Type.STRING, (short)2);
        oprot.writeString(getEmailAddress().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("model_metadata", org.thryft.protocol.Type.STRUCT, (short)1);
        getModelMetadata().writeAsStruct(oprot);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final org.thryft.native_.EmailAddress emailAddress;

    private final net.lab1318.costume.api.models.ModelMetadata modelMetadata;
}
