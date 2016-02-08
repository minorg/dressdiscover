package net.lab1318.costume.api.models.user;

public class User implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public static class Builder {
        public Builder() {
            ctime = null;
            emailAddress = null;
        }

        public Builder(final User other) {
            this.ctime = other.getCtime();
            this.emailAddress = other.getEmailAddress();
        }

        protected User _build(final java.util.Date ctime, final org.thryft.native_.EmailAddress emailAddress) {
            return new User(ctime, emailAddress);
        }

        public User build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(ctime, "net.lab1318.costume.api.models.user.User: missing ctime"), com.google.common.base.Preconditions.checkNotNull(emailAddress, "net.lab1318.costume.api.models.user.User: missing emailAddress"));
        }

        public final java.util.Date getCtime() {
            return ctime;
        }

        public final org.thryft.native_.EmailAddress getEmailAddress() {
            return emailAddress;
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

        public Builder setCtime(final java.util.Date ctime) {
            this.ctime = com.google.common.base.Preconditions.checkNotNull(ctime);
            return this;
        }

        public Builder setEmailAddress(final org.thryft.native_.EmailAddress emailAddress) {
            this.emailAddress = com.google.common.base.Preconditions.checkNotNull(emailAddress);
            return this;
        }

        public Builder setIfPresent(final User other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setCtime(other.getCtime());
            setEmailAddress(other.getEmailAddress());

            return this;
        }

        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "ctime": setCtime((java.util.Date)value); return this;
            case "email_address": setEmailAddress((org.thryft.native_.EmailAddress)value); return this;
            default:
                throw new IllegalArgumentException(name);
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

        public Builder unset(final String name) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "ctime": return unsetCtime();
            case "email_address": return unsetEmailAddress();
            default:
                throw new IllegalArgumentException(name);
            }
        }

        private java.util.Date ctime;
        private org.thryft.native_.EmailAddress emailAddress;
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

    /**
     * Copy constructor
     */
    public User(final User other) {
        this(other.getCtime(), other.getEmailAddress());
    }

    /**
     * Optional constructor
     */
    public User(final java.util.Date ctime, final org.thryft.native_.EmailAddress emailAddress) {
        this.ctime = com.google.common.base.Preconditions.checkNotNull(ctime, "net.lab1318.costume.api.models.user.User: missing ctime");
        this.emailAddress = com.google.common.base.Preconditions.checkNotNull(emailAddress, "net.lab1318.costume.api.models.user.User: missing emailAddress");
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
        java.util.Date ctime = null;
        org.thryft.native_.EmailAddress emailAddress = null;

        iprot.readListBegin();
        ctime = iprot.readDateTime();
        emailAddress = new org.thryft.native_.EmailAddress(iprot.readString());
        iprot.readListEnd();
        try {
            return new User(ctime, emailAddress);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
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
        try {
            return new User(ctime, emailAddress);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public User replaceCtime(final java.util.Date ctime) {
        return new User(ctime, this.emailAddress);
    }

    public User replaceEmailAddress(final org.thryft.native_.EmailAddress emailAddress) {
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

        oprot.writeString(getEmailAddress().toString());

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