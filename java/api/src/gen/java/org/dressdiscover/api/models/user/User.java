package org.dressdiscover.api.models.user;

public final class User implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            ctime = null;
            emailAddress = null;
        }

        public Builder(final User other) {
            this.ctime = other.getCtime();
            this.emailAddress = other.getEmailAddress();
        }

        protected User _build(final java.util.Date ctime, final org.thryft.native_.EmailAddress emailAddress) {
            return new User(ctime, emailAddress, DefaultConstructionValidator.getInstance());
        }

        public User build() {
            return _build(ctime, emailAddress);
        }

        public final java.util.Date getCtime() {
            return ctime;
        }

        public final org.thryft.native_.EmailAddress getEmailAddress() {
            return emailAddress;
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
            iprot.readListBegin();
            ctime = iprot.readDateTime();
            emailAddress = new org.thryft.native_.EmailAddress(iprot.readString());
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
                case "ctime": {
                    ctime = iprot.readDateTime();
                    break;
                }
                case "email_address": {
                    emailAddress = new org.thryft.native_.EmailAddress(iprot.readString());
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

        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case CTIME: setCtime((java.util.Date)value); return this;
            case EMAIL_ADDRESS: setEmailAddress((org.thryft.native_.EmailAddress)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCtime(final java.util.Date ctime) {
            this.ctime = DefaultConstructionValidator.getInstance().validateCtime(ctime);
            return this;
        }

        public Builder setEmailAddress(final org.thryft.native_.EmailAddress emailAddress) {
            this.emailAddress = DefaultConstructionValidator.getInstance().validateEmailAddress(emailAddress);
            return this;
        }

        public Builder setIfPresent(final User other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCtime(other.getCtime());
            setEmailAddress(other.getEmailAddress());

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
            case CTIME: return unsetCtime();
            case EMAIL_ADDRESS: return unsetEmailAddress();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCtime() {
            this.ctime = null;
            return this;
        }

        public Builder unsetEmailAddress() {
            this.emailAddress = null;
            return this;
        }

        private java.util.Date ctime;
        private org.thryft.native_.EmailAddress emailAddress;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<User> {
        @Override
        public User readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return User.readAs(iprot, type);
        }

        @Override
        public User readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return User.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public User readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return User.readAsList(iprot);
        }

        @Override
        public User readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return User.readAsStruct(iprot);
        }

        @Override
        public User readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return User.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CTIME("ctime", new com.google.common.reflect.TypeToken<java.util.Date>() {}, true, 0, "ctime", org.thryft.protocol.Type.I64),
        EMAIL_ADDRESS("emailAddress", new com.google.common.reflect.TypeToken<org.thryft.native_.EmailAddress>() {}, true, 0, "email_address", org.thryft.protocol.Type.STRING);

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
            case "ctime": return CTIME;
            case "emailAddress": return EMAIL_ADDRESS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "ctime": return CTIME;
            case "email_address": return EMAIL_ADDRESS;
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
        public java.util.Date validateCtime(final java.util.Date ctime) throws ExceptionT;

        public org.thryft.native_.EmailAddress validateEmailAddress(final org.thryft.native_.EmailAddress emailAddress) throws ExceptionT;
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
        public java.util.Date validateCtime(final java.util.Date ctime) throws RuntimeException {
            if (ctime == null) {
                throw new NullPointerException("org.dressdiscover.api.models.user.User: ctime is null");
            }
            return ctime;
        }

        @Override
        public org.thryft.native_.EmailAddress validateEmailAddress(final org.thryft.native_.EmailAddress emailAddress) throws RuntimeException {
            if (emailAddress == null) {
                throw new NullPointerException("org.dressdiscover.api.models.user.User: emailAddress is null");
            }
            return emailAddress;
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
        public java.util.Date validateCtime(final java.util.Date ctime) {
            return ctime;
        }

        @Override
        public org.thryft.native_.EmailAddress validateEmailAddress(final org.thryft.native_.EmailAddress emailAddress) {
            return emailAddress;
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
        public java.util.Date validateCtime(final java.util.Date ctime) throws org.thryft.protocol.InputProtocolException {
            if (ctime == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CTIME, "org.dressdiscover.api.models.user.User: ctime is null");
            }
            return ctime;
        }

        @Override
        public org.thryft.native_.EmailAddress validateEmailAddress(final org.thryft.native_.EmailAddress emailAddress) throws org.thryft.protocol.InputProtocolException {
            if (emailAddress == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EMAIL_ADDRESS, "org.dressdiscover.api.models.user.User: emailAddress is null");
            }
            return emailAddress;
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
        public java.util.Date validateCtime(final java.util.Date ctime) {
            return ctime;
        }

        @Override
        public org.thryft.native_.EmailAddress validateEmailAddress(final org.thryft.native_.EmailAddress emailAddress) {
            return emailAddress;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public User(final User other) {
        this(other.getCtime(), other.getEmailAddress(), NopConstructionValidator.getInstance());
    }

    protected User(final java.util.Date ctime, final org.thryft.native_.EmailAddress emailAddress, ConstructionValidator validator) {
        this.ctime = validator.validateCtime(ctime);
        this.emailAddress = validator.validateEmailAddress(emailAddress);
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

    /**
     * Optional factory method
     */
    public static User create(final java.util.Date ctime, final org.thryft.native_.EmailAddress emailAddress) {
        return new User(ctime, emailAddress, DefaultConstructionValidator.getInstance());
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
            getCtime().equals(other.getCtime()) &&
            getEmailAddress().equals(other.getEmailAddress());
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
        case CTIME: return getCtime();
        case EMAIL_ADDRESS: return getEmailAddress();
        default:
            throw new IllegalStateException();
        }
    }

    public final java.util.Date getCtime() {
        return ctime;
    }

    public final org.thryft.native_.EmailAddress getEmailAddress() {
        return emailAddress;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCtime().hashCode();
        hashCode = 31 * hashCode + getEmailAddress().hashCode();
        return hashCode;
    }

    public static User readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static User readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static User readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        java.util.Date ctime = null;
        org.thryft.native_.EmailAddress emailAddress = null;

        iprot.readListBegin();
        ctime = iprot.readDateTime();
        emailAddress = new org.thryft.native_.EmailAddress(iprot.readString());
        iprot.readListEnd();
        return new User(DefaultReadValidator.getInstance().validateCtime(ctime), DefaultReadValidator.getInstance().validateEmailAddress(emailAddress), NopConstructionValidator.getInstance());
    }

    public static User readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static User readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        java.util.Date ctime = null;
        org.thryft.native_.EmailAddress emailAddress = null;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "ctime": {
                ctime = iprot.readDateTime();
                break;
            }
            case "email_address": {
                emailAddress = new org.thryft.native_.EmailAddress(iprot.readString());
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
        return new User(DefaultReadValidator.getInstance().validateCtime(ctime), DefaultReadValidator.getInstance().validateEmailAddress(emailAddress), NopConstructionValidator.getInstance());
    }

    public User replaceCtime(final java.util.Date ctime) {
        return new User(DefaultConstructionValidator.getInstance().validateCtime(ctime), this.emailAddress, NopConstructionValidator.getInstance());
    }

    public User replaceEmailAddress(final org.thryft.native_.EmailAddress emailAddress) {
        return new User(this.ctime, DefaultConstructionValidator.getInstance().validateEmailAddress(emailAddress), NopConstructionValidator.getInstance());
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("ctime", getCtime()).add("email_address", getEmailAddress()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeDateTime(getCtime());

        oprot.writeString(getEmailAddress().toString());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.user.User");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("ctime", org.thryft.protocol.Type.I64, (short)0);
        oprot.writeDateTime(getCtime());
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("email_address", org.thryft.protocol.Type.STRING, (short)0);
        oprot.writeString(getEmailAddress().toString());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final java.util.Date ctime;

    private final org.thryft.native_.EmailAddress emailAddress;
}
