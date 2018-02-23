package org.dressdiscover.api.models.user;

public final class User implements org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            ctime = null;
            emailAddress = null;
        }

        public Builder(final User other) {
            this.ctime = other.getCtime();
            this.emailAddress = other.getEmailAddress();
        }

        protected User _build(final java.util.Date ctime, final String emailAddress) {
            return new User(ctime, emailAddress);
        }

        public User build() {
            UncheckedValidator.validate(ctime, emailAddress);

            return _build(ctime, emailAddress);
        }

        public final @javax.annotation.Nullable java.util.Date getCtime() {
            return ctime;
        }

        public final @javax.annotation.Nullable String getEmailAddress() {
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
            try {
                iprot.readListBegin();
                try {
                    ctime = iprot.readDateTime();
                } catch (final IllegalArgumentException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CTIME, e);
                }
                emailAddress = iprot.readString();
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
                    case "ctime": {
                        try {
                            ctime = iprot.readDateTime();
                        } catch (final IllegalArgumentException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CTIME, e);
                        }
                        break;
                    }
                    case "email_address": {
                        emailAddress = iprot.readString();
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
            case CTIME: setCtime((java.util.Date)value); return this;
            case EMAIL_ADDRESS: setEmailAddress((String)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCtime(final java.util.Date ctime) {
            UncheckedValidator.validateCtime(ctime);
            this.ctime = ctime;
            return this;
        }

        public Builder setEmailAddress(final String emailAddress) {
            UncheckedValidator.validateEmailAddress(emailAddress);
            this.emailAddress = emailAddress;
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

        private @javax.annotation.Nullable java.util.Date ctime;
        private @javax.annotation.Nullable String emailAddress;
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
        CTIME("ctime", new com.google.common.reflect.TypeToken<java.util.Date>() {}, true, (short)0, "ctime", org.thryft.protocol.Type.I64),
        EMAIL_ADDRESS("emailAddress", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "email_address", org.thryft.protocol.Type.STRING);

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
        public static void validate(final java.util.Date ctime, final String emailAddress) throws org.thryft.protocol.InputProtocolException {
            validateCtime(ctime);
            validateEmailAddress(emailAddress);
        }

        public static void validateCtime(final java.util.Date ctime) throws org.thryft.protocol.InputProtocolException {
            if (ctime == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CTIME, "org.dressdiscover.api.models.user.User: ctime is null");
            }
        }

        public static void validateEmailAddress(final String emailAddress) throws org.thryft.protocol.InputProtocolException {
            if (emailAddress == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EMAIL_ADDRESS, "org.dressdiscover.api.models.user.User: emailAddress is null");
            }
            if (!emailAddress.matches("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+")) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EMAIL_ADDRESS, "org.dressdiscover.api.models.user.User.emailAddress: not a valid email address");
            }
            if (emailAddress.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EMAIL_ADDRESS, "org.dressdiscover.api.models.user.User.emailAddress: less than min length 1");
            }
            {
                final int __strLen = emailAddress.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(emailAddress.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EMAIL_ADDRESS, String.format("org.dressdiscover.api.models.user.User.emailAddress: blank '%s' (length=%d)", emailAddress, __strLen));
                }
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final java.util.Date ctime, final String emailAddress) {
            validateCtime(ctime);
            validateEmailAddress(emailAddress);
        }

        public static void validateCtime(final java.util.Date ctime) {
            if (ctime == null) {
                throw new NullPointerException("org.dressdiscover.api.models.user.User: ctime is null");
            }
        }

        public static void validateEmailAddress(final String emailAddress) {
            if (emailAddress == null) {
                throw new NullPointerException("org.dressdiscover.api.models.user.User: emailAddress is null");
            }
            if (!emailAddress.matches("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+")) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.user.User.emailAddress: not a valid email address");
            }
            if (emailAddress.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.user.User.emailAddress: less than min length 1");
            }
            {
                final int __strLen = emailAddress.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(emailAddress.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new IllegalArgumentException(String.format("org.dressdiscover.api.models.user.User.emailAddress: blank '%s' (length=%d)", emailAddress, __strLen));
                }
            }
        }
    }

    /**
     * Copy constructor
     */
    public User(final User other) {
        this(other.getCtime(), other.getEmailAddress());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected User(final java.util.Date ctime, final String emailAddress) {
        this.ctime = ctime;
        this.emailAddress = emailAddress;
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
    public static User create(final java.util.Date ctime, final String emailAddress) {
        UncheckedValidator.validate(ctime, emailAddress);
        return new User(ctime, emailAddress);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof User)) {
            return false;
        }

        final User other = (User)otherObject;

        if (!(getCtime().equals(other.getCtime()))) {
            return false;
        }

        if (!(getEmailAddress().equals(other.getEmailAddress()))) {
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
        case CTIME: return getCtime();
        case EMAIL_ADDRESS: return getEmailAddress();
        default:
            throw new IllegalStateException();
        }
    }

    public final java.util.Date getCtime() {
        return ctime;
    }

    public final String getEmailAddress() {
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
        java.util.Date ctime;
        String emailAddress;

        try {
            iprot.readListBegin();
            try {
                ctime = iprot.readDateTime();
            } catch (final IllegalArgumentException e) {
                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CTIME, e);
            }
            emailAddress = iprot.readString();
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(ctime, emailAddress);

        return new User(ctime, emailAddress);
    }

    public static User readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static User readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable java.util.Date ctime = null;
        @javax.annotation.Nullable String emailAddress = null;

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "ctime": {
                    try {
                        ctime = iprot.readDateTime();
                    } catch (final IllegalArgumentException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CTIME, e);
                    }
                    break;
                }
                case "email_address": {
                    emailAddress = iprot.readString();
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

        ReadValidator.validate(ctime, emailAddress);

        return new User(ctime, emailAddress);
    }

    public User replaceCtime(final java.util.Date ctime) {
        UncheckedValidator.validateCtime(ctime);
        return new User(ctime, this.emailAddress);
    }

    public User replaceEmailAddress(final String emailAddress) {
        UncheckedValidator.validateEmailAddress(emailAddress);
        return new User(this.ctime, emailAddress);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("ctime", getCtime()).add("email_address", getEmailAddress()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeDateTime(getCtime());

        oprot.writeString(getEmailAddress());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.user.User");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeCtimeField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.CTIME);
        oprot.writeDateTime(getCtime());
        oprot.writeFieldEnd();
    }

    public void writeEmailAddressField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.EMAIL_ADDRESS);
        oprot.writeString(getEmailAddress());
        oprot.writeFieldEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeCtimeField(oprot);

        writeEmailAddressField(oprot);

        oprot.writeFieldStop();
    }

    private final java.util.Date ctime;

    private final String emailAddress;
}
