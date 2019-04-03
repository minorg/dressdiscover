package org.dressdiscover.api.models.user;

public final class User implements org.thryft.waf.api.models.Model {
    public final static class Builder implements org.thryft.CompoundType.Builder<Builder, User> {
        public Builder() {
            emailAddress = null;
            identityProvider = null;
            identityProviderId = null;
            emailAddressVerified = com.google.common.base.Optional.<Boolean> absent();
            familyName = com.google.common.base.Optional.<String> absent();
            givenName = com.google.common.base.Optional.<String> absent();
            locale = com.google.common.base.Optional.<String> absent();
            name = com.google.common.base.Optional.<String> absent();
            nickname = com.google.common.base.Optional.<String> absent();
            pictureUrl = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        }

        public Builder(final User other) {
            this.emailAddress = other.getEmailAddress();
            this.identityProvider = other.getIdentityProvider();
            this.identityProviderId = other.getIdentityProviderId();
            this.emailAddressVerified = other.getEmailAddressVerified();
            this.familyName = other.getFamilyName();
            this.givenName = other.getGivenName();
            this.locale = other.getLocale();
            this.name = other.getName();
            this.nickname = other.getNickname();
            this.pictureUrl = other.getPictureUrl();
        }

        protected User _build(final String emailAddress, final org.dressdiscover.api.models.user.UserIdentityProvider identityProvider, final String identityProviderId, final com.google.common.base.Optional<Boolean> emailAddressVerified, final com.google.common.base.Optional<String> familyName, final com.google.common.base.Optional<String> givenName, final com.google.common.base.Optional<String> locale, final com.google.common.base.Optional<String> name, final com.google.common.base.Optional<String> nickname, final com.google.common.base.Optional<org.thryft.native_.Url> pictureUrl) {
            return new User(emailAddress, identityProvider, identityProviderId, emailAddressVerified, familyName, givenName, locale, name, nickname, pictureUrl);
        }

        public User build() {
            Validator.validate(emailAddress, identityProvider, identityProviderId, emailAddressVerified, familyName, givenName, locale, name, nickname, pictureUrl);

            return _build(emailAddress, identityProvider, identityProviderId, emailAddressVerified, familyName, givenName, locale, name, nickname, pictureUrl);
        }

        /**
         * date_time.DateTime ctime;
         */
        public final @javax.annotation.Nullable String getEmailAddress() {
            return emailAddress;
        }

        public final com.google.common.base.Optional<Boolean> getEmailAddressVerified() {
            return emailAddressVerified;
        }

        public final com.google.common.base.Optional<String> getFamilyName() {
            return familyName;
        }

        public final com.google.common.base.Optional<String> getGivenName() {
            return givenName;
        }

        public final @javax.annotation.Nullable org.dressdiscover.api.models.user.UserIdentityProvider getIdentityProvider() {
            return identityProvider;
        }

        public final @javax.annotation.Nullable String getIdentityProviderId() {
            return identityProviderId;
        }

        public final com.google.common.base.Optional<String> getLocale() {
            return locale;
        }

        public final com.google.common.base.Optional<String> getName() {
            return name;
        }

        public final com.google.common.base.Optional<String> getNickname() {
            return nickname;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getPictureUrl() {
            return pictureUrl;
        }

        public Builder readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            try {
                final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
                this.setEmailAddress(iprot.readString());
                this.setIdentityProvider(iprot.readEnum(org.dressdiscover.api.models.user.UserIdentityProvider.Factory.getInstance()));
                this.setIdentityProviderId(iprot.readString());
                if (__list.getSize() > 3) {
                    this.setEmailAddressVerified(org.thryft.Optionals.of(iprot.readBool()));
                }
                if (__list.getSize() > 4) {
                    this.setFamilyName(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 5) {
                    this.setGivenName(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 6) {
                    this.setLocale(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 7) {
                    this.setName(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 8) {
                    this.setNickname(com.google.common.base.Optional.of(iprot.readString()));
                }
                if (__list.getSize() > 9) {
                    try {
                        this.setPictureUrl(com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString())));
                    } catch (final java.lang.IllegalArgumentException e) {
                    }
                }
                iprot.readListEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            try {
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                    if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                        break;
                    }
                    switch (ifield.getName()) {
                    case "email_address": {
                        this.setEmailAddress(iprot.readString());
                        break;
                    }
                    case "identity_provider": {
                        this.setIdentityProvider(iprot.readEnum(org.dressdiscover.api.models.user.UserIdentityProvider.Factory.getInstance()));
                        break;
                    }
                    case "identity_provider_id": {
                        this.setIdentityProviderId(iprot.readString());
                        break;
                    }
                    case "email_address_verified": {
                        this.setEmailAddressVerified(org.thryft.Optionals.of(iprot.readBool()));
                        break;
                    }
                    case "family_name": {
                        this.setFamilyName(com.google.common.base.Optional.of(iprot.readString()));
                        break;
                    }
                    case "given_name": {
                        this.setGivenName(com.google.common.base.Optional.of(iprot.readString()));
                        break;
                    }
                    case "locale": {
                        this.setLocale(com.google.common.base.Optional.of(iprot.readString()));
                        break;
                    }
                    case "name": {
                        this.setName(com.google.common.base.Optional.of(iprot.readString()));
                        break;
                    }
                    case "nickname": {
                        this.setNickname(com.google.common.base.Optional.of(iprot.readString()));
                        break;
                    }
                    case "picture_url": {
                        try {
                            this.setPictureUrl(com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString())));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
                        break;
                    }
                    default:
                        unknownFieldCallback.apply(ifield);
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                return this;
            } catch (final org.thryft.ThryftValidationException e) {
                throw new org.thryft.protocol.InputProtocolException(e);
            } catch (final RuntimeException e) {
                throw new IllegalStateException(e);
            }
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
            case EMAIL_ADDRESS: setEmailAddress((String)value); return this;
            case IDENTITY_PROVIDER: setIdentityProvider((org.dressdiscover.api.models.user.UserIdentityProvider)value); return this;
            case IDENTITY_PROVIDER_ID: setIdentityProviderId((String)value); return this;
            case EMAIL_ADDRESS_VERIFIED: setEmailAddressVerified((Boolean)value); return this;
            case FAMILY_NAME: setFamilyName((String)value); return this;
            case GIVEN_NAME: setGivenName((String)value); return this;
            case LOCALE: setLocale((String)value); return this;
            case NAME: setName((String)value); return this;
            case NICKNAME: setNickname((String)value); return this;
            case PICTURE_URL: setPictureUrl((org.thryft.native_.Url)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setEmailAddress(final String emailAddress) {
            Validator.validateEmailAddress(emailAddress);
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setEmailAddressVerified(final com.google.common.base.Optional<Boolean> emailAddressVerified) {
            Validator.validateEmailAddressVerified(emailAddressVerified);
            this.emailAddressVerified = emailAddressVerified;
            return this;
        }

        public Builder setEmailAddressVerified(final @javax.annotation.Nullable Boolean emailAddressVerified) {
            return setEmailAddressVerified(org.thryft.Optionals.fromNullable(emailAddressVerified));
        }

        public Builder setEmailAddressVerified(final boolean emailAddressVerified) {
            return setEmailAddressVerified(org.thryft.Optionals.of(emailAddressVerified));
        }

        public Builder setFamilyName(final com.google.common.base.Optional<String> familyName) {
            Validator.validateFamilyName(familyName);
            this.familyName = familyName;
            return this;
        }

        public Builder setFamilyName(final @javax.annotation.Nullable String familyName) {
            return setFamilyName(com.google.common.base.Optional.fromNullable(familyName));
        }

        public Builder setGivenName(final com.google.common.base.Optional<String> givenName) {
            Validator.validateGivenName(givenName);
            this.givenName = givenName;
            return this;
        }

        public Builder setGivenName(final @javax.annotation.Nullable String givenName) {
            return setGivenName(com.google.common.base.Optional.fromNullable(givenName));
        }

        public Builder setIdentityProvider(final org.dressdiscover.api.models.user.UserIdentityProvider identityProvider) {
            Validator.validateIdentityProvider(identityProvider);
            this.identityProvider = identityProvider;
            return this;
        }

        public Builder setIdentityProviderId(final String identityProviderId) {
            Validator.validateIdentityProviderId(identityProviderId);
            this.identityProviderId = identityProviderId;
            return this;
        }

        public Builder setIfPresent(final User other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setEmailAddress(other.getEmailAddress());
            setIdentityProvider(other.getIdentityProvider());
            setIdentityProviderId(other.getIdentityProviderId());
            if (other.getEmailAddressVerified().isPresent()) {
                setEmailAddressVerified(other.getEmailAddressVerified());
            }
            if (other.getFamilyName().isPresent()) {
                setFamilyName(other.getFamilyName());
            }
            if (other.getGivenName().isPresent()) {
                setGivenName(other.getGivenName());
            }
            if (other.getLocale().isPresent()) {
                setLocale(other.getLocale());
            }
            if (other.getName().isPresent()) {
                setName(other.getName());
            }
            if (other.getNickname().isPresent()) {
                setNickname(other.getNickname());
            }
            if (other.getPictureUrl().isPresent()) {
                setPictureUrl(other.getPictureUrl());
            }

            return this;
        }

        public Builder setLocale(final com.google.common.base.Optional<String> locale) {
            Validator.validateLocale(locale);
            this.locale = locale;
            return this;
        }

        public Builder setLocale(final @javax.annotation.Nullable String locale) {
            return setLocale(com.google.common.base.Optional.fromNullable(locale));
        }

        public Builder setName(final com.google.common.base.Optional<String> name) {
            Validator.validateName(name);
            this.name = name;
            return this;
        }

        public Builder setName(final @javax.annotation.Nullable String name) {
            return setName(com.google.common.base.Optional.fromNullable(name));
        }

        public Builder setNickname(final com.google.common.base.Optional<String> nickname) {
            Validator.validateNickname(nickname);
            this.nickname = nickname;
            return this;
        }

        public Builder setNickname(final @javax.annotation.Nullable String nickname) {
            return setNickname(com.google.common.base.Optional.fromNullable(nickname));
        }

        public Builder setPictureUrl(final com.google.common.base.Optional<org.thryft.native_.Url> pictureUrl) {
            Validator.validatePictureUrl(pictureUrl);
            this.pictureUrl = pictureUrl;
            return this;
        }

        public Builder setPictureUrl(final @javax.annotation.Nullable org.thryft.native_.Url pictureUrl) {
            return setPictureUrl(com.google.common.base.Optional.fromNullable(pictureUrl));
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
            case EMAIL_ADDRESS: return unsetEmailAddress();
            case IDENTITY_PROVIDER: return unsetIdentityProvider();
            case IDENTITY_PROVIDER_ID: return unsetIdentityProviderId();
            case EMAIL_ADDRESS_VERIFIED: return unsetEmailAddressVerified();
            case FAMILY_NAME: return unsetFamilyName();
            case GIVEN_NAME: return unsetGivenName();
            case LOCALE: return unsetLocale();
            case NAME: return unsetName();
            case NICKNAME: return unsetNickname();
            case PICTURE_URL: return unsetPictureUrl();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetEmailAddress() {
            this.emailAddress = null;
            return this;
        }

        public Builder unsetEmailAddressVerified() {
            this.emailAddressVerified = com.google.common.base.Optional.<Boolean> absent();
            return this;
        }

        public Builder unsetFamilyName() {
            this.familyName = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetGivenName() {
            this.givenName = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetIdentityProvider() {
            this.identityProvider = null;
            return this;
        }

        public Builder unsetIdentityProviderId() {
            this.identityProviderId = null;
            return this;
        }

        public Builder unsetLocale() {
            this.locale = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetName() {
            this.name = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetNickname() {
            this.nickname = com.google.common.base.Optional.<String> absent();
            return this;
        }

        public Builder unsetPictureUrl() {
            this.pictureUrl = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
            return this;
        }

        /**
         * date_time.DateTime ctime;
         */
        private @javax.annotation.Nullable String emailAddress;
        private @javax.annotation.Nullable org.dressdiscover.api.models.user.UserIdentityProvider identityProvider;
        private @javax.annotation.Nullable String identityProviderId;
        private com.google.common.base.Optional<Boolean> emailAddressVerified;
        private com.google.common.base.Optional<String> familyName;
        private com.google.common.base.Optional<String> givenName;
        private com.google.common.base.Optional<String> locale;
        private com.google.common.base.Optional<String> name;
        private com.google.common.base.Optional<String> nickname;
        private com.google.common.base.Optional<org.thryft.native_.Url> pictureUrl;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<User> {
        @Override
        public User readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return User.readAsList(iprot);
        }

        @Override
        public User readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return User.readAsStruct(iprot);
        }

        @Override
        public User readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return User.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        EMAIL_ADDRESS("emailAddress", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "email_address", "email_address", org.thryft.protocol.Type.STRING),
        IDENTITY_PROVIDER("identityProvider", new com.google.common.reflect.TypeToken<org.dressdiscover.api.models.user.UserIdentityProvider>() {}, true, (short)0, "identity_provider", "identity_provider", org.thryft.protocol.Type.STRING),
        IDENTITY_PROVIDER_ID("identityProviderId", new com.google.common.reflect.TypeToken<String>() {}, true, (short)0, "identity_provider_id", "identity_provider_id", org.thryft.protocol.Type.STRING),
        EMAIL_ADDRESS_VERIFIED("emailAddressVerified", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)0, "email_address_verified", "email_address_verified", org.thryft.protocol.Type.BOOL),
        FAMILY_NAME("familyName", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "family_name", "family_name", org.thryft.protocol.Type.STRING),
        GIVEN_NAME("givenName", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "given_name", "given_name", org.thryft.protocol.Type.STRING),
        LOCALE("locale", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "locale", "locale", org.thryft.protocol.Type.STRING),
        NAME("name", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "name", "name", org.thryft.protocol.Type.STRING),
        NICKNAME("nickname", new com.google.common.reflect.TypeToken<String>() {}, false, (short)0, "nickname", "nickname", org.thryft.protocol.Type.STRING),
        PICTURE_URL("pictureUrl", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, (short)0, "picture_url", "picture_url", org.thryft.protocol.Type.STRING);

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
            case "emailAddress": return EMAIL_ADDRESS;
            case "identityProvider": return IDENTITY_PROVIDER;
            case "identityProviderId": return IDENTITY_PROVIDER_ID;
            case "emailAddressVerified": return EMAIL_ADDRESS_VERIFIED;
            case "familyName": return FAMILY_NAME;
            case "givenName": return GIVEN_NAME;
            case "locale": return LOCALE;
            case "name": return NAME;
            case "nickname": return NICKNAME;
            case "pictureUrl": return PICTURE_URL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "email_address": return EMAIL_ADDRESS;
            case "identity_provider": return IDENTITY_PROVIDER;
            case "identity_provider_id": return IDENTITY_PROVIDER_ID;
            case "email_address_verified": return EMAIL_ADDRESS_VERIFIED;
            case "family_name": return FAMILY_NAME;
            case "given_name": return GIVEN_NAME;
            case "locale": return LOCALE;
            case "name": return NAME;
            case "nickname": return NICKNAME;
            case "picture_url": return PICTURE_URL;
            default:
                throw new IllegalArgumentException(thriftName);
            }
        }

        private FieldMetadata(final String javaName, final com.google.common.reflect.TypeToken<?> javaType, final boolean required, final short thriftId, final String thriftName, final String thriftProtocolKey, final org.thryft.protocol.Type thriftProtocolType) {
            this.javaName = javaName;
            this.javaType = javaType;
            this.required = required;
            this.thriftId = thriftId;
            this.thriftName = thriftName;
            this.thriftProtocolKey = thriftProtocolKey;
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

    public final static class Validator {
        public static void validate(final String emailAddress, final org.dressdiscover.api.models.user.UserIdentityProvider identityProvider, final String identityProviderId, final com.google.common.base.Optional<Boolean> emailAddressVerified, final com.google.common.base.Optional<String> familyName, final com.google.common.base.Optional<String> givenName, final com.google.common.base.Optional<String> locale, final com.google.common.base.Optional<String> name, final com.google.common.base.Optional<String> nickname, final com.google.common.base.Optional<org.thryft.native_.Url> pictureUrl) {
            validateEmailAddress(emailAddress);
            validateIdentityProvider(identityProvider);
            validateIdentityProviderId(identityProviderId);
            validateEmailAddressVerified(emailAddressVerified);
            validateFamilyName(familyName);
            validateGivenName(givenName);
            validateLocale(locale);
            validateName(name);
            validateNickname(nickname);
            validatePictureUrl(pictureUrl);
        }

        public static void validateEmailAddress(final String emailAddress) {
            if (emailAddress == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: emailAddress is missing");
            }
            if (!emailAddress.matches("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+")) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: emailAddress: not a valid email address");
            }
            if (emailAddress.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: emailAddress: less than min length 1");
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
                    throw new org.thryft.ThryftValidationException(String.format("org.dressdiscover.api.models.user.User: emailAddress: blank '%s' (length=%d)", emailAddress, __strLen));
                }
            }
        }

        public static void validateIdentityProvider(final org.dressdiscover.api.models.user.UserIdentityProvider identityProvider) {
            if (identityProvider == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: identityProvider is missing");
            }
        }

        public static void validateIdentityProviderId(final String identityProviderId) {
            if (identityProviderId == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: identityProviderId is missing");
            }
            if (identityProviderId.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: identityProviderId: less than min length 1");
            }
            {
                final int __strLen = identityProviderId.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(identityProviderId.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.ThryftValidationException(String.format("org.dressdiscover.api.models.user.User: identityProviderId: blank '%s' (length=%d)", identityProviderId, __strLen));
                }
            }
        }

        public static void validateEmailAddressVerified(final com.google.common.base.Optional<Boolean> emailAddressVerified) {
            if (emailAddressVerified == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: emailAddressVerified is missing");
            }
        }

        public static void validateFamilyName(final com.google.common.base.Optional<String> familyName) {
            if (familyName == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: familyName is missing");
            }
            if (familyName.isPresent()) {
                if (familyName.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: familyName: less than min length 1");
                }
                {
                    final int __strLen = familyName.get().length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(familyName.get().charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new org.thryft.ThryftValidationException(String.format("org.dressdiscover.api.models.user.User: familyName: blank '%s' (length=%d)", familyName.get(), __strLen));
                    }
                }
            }
        }

        public static void validateGivenName(final com.google.common.base.Optional<String> givenName) {
            if (givenName == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: givenName is missing");
            }
            if (givenName.isPresent()) {
                if (givenName.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: givenName: less than min length 1");
                }
                {
                    final int __strLen = givenName.get().length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(givenName.get().charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new org.thryft.ThryftValidationException(String.format("org.dressdiscover.api.models.user.User: givenName: blank '%s' (length=%d)", givenName.get(), __strLen));
                    }
                }
            }
        }

        public static void validateLocale(final com.google.common.base.Optional<String> locale) {
            if (locale == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: locale is missing");
            }
            if (locale.isPresent()) {
                if (locale.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: locale: less than min length 1");
                }
                {
                    final int __strLen = locale.get().length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(locale.get().charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new org.thryft.ThryftValidationException(String.format("org.dressdiscover.api.models.user.User: locale: blank '%s' (length=%d)", locale.get(), __strLen));
                    }
                }
            }
        }

        public static void validateName(final com.google.common.base.Optional<String> name) {
            if (name == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: name is missing");
            }
            if (name.isPresent()) {
                if (name.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: name: less than min length 1");
                }
                {
                    final int __strLen = name.get().length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(name.get().charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new org.thryft.ThryftValidationException(String.format("org.dressdiscover.api.models.user.User: name: blank '%s' (length=%d)", name.get(), __strLen));
                    }
                }
            }
        }

        public static void validateNickname(final com.google.common.base.Optional<String> nickname) {
            if (nickname == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: nickname is missing");
            }
            if (nickname.isPresent()) {
                if (nickname.get().isEmpty()) {
                    throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: nickname: less than min length 1");
                }
                {
                    final int __strLen = nickname.get().length();
                    boolean __blank = true;
                    for (int i = 0; i < __strLen; i++) {
                        if (!Character.isWhitespace(nickname.get().charAt(i))) {
                            __blank = false;
                            break;
                        }
                    }
                    if (__blank) {
                        throw new org.thryft.ThryftValidationException(String.format("org.dressdiscover.api.models.user.User: nickname: blank '%s' (length=%d)", nickname.get(), __strLen));
                    }
                }
            }
        }

        public static void validatePictureUrl(final com.google.common.base.Optional<org.thryft.native_.Url> pictureUrl) {
            if (pictureUrl == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.models.user.User: pictureUrl is missing");
            }
        }
    }

    /**
     * Copy constructor
     */
    public User(final User other) {
        this(other.getEmailAddress(), other.getIdentityProvider(), other.getIdentityProviderId(), other.getEmailAddressVerified(), other.getFamilyName(), other.getGivenName(), other.getLocale(), other.getName(), other.getNickname(), other.getPictureUrl());
    }

    /**
     * Required constructor
     */
    public User(final String emailAddress, final org.dressdiscover.api.models.user.UserIdentityProvider identityProvider, final String identityProviderId) {
        this(emailAddress, identityProvider, identityProviderId, com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<org.thryft.native_.Url> absent());
    }

    /**
     * Total constructor
     */
    public User(final String emailAddress, final org.dressdiscover.api.models.user.UserIdentityProvider identityProvider, final String identityProviderId, final com.google.common.base.Optional<Boolean> emailAddressVerified, final com.google.common.base.Optional<String> familyName, final com.google.common.base.Optional<String> givenName, final com.google.common.base.Optional<String> locale, final com.google.common.base.Optional<String> name, final com.google.common.base.Optional<String> nickname, final com.google.common.base.Optional<org.thryft.native_.Url> pictureUrl) {
        Validator.validate(emailAddress, identityProvider, identityProviderId, emailAddressVerified, familyName, givenName, locale, name, nickname, pictureUrl);
        this.emailAddress = emailAddress;
        this.identityProvider = identityProvider;
        this.identityProviderId = identityProviderId;
        this.emailAddressVerified = emailAddressVerified;
        this.familyName = familyName;
        this.givenName = givenName;
        this.locale = locale;
        this.name = name;
        this.nickname = nickname;
        this.pictureUrl = pictureUrl;
    }

    /**
     * Total Nullable constructor
     */
    public User(final String emailAddress, final org.dressdiscover.api.models.user.UserIdentityProvider identityProvider, final String identityProviderId, @javax.annotation.Nullable final Boolean emailAddressVerified, @javax.annotation.Nullable final String familyName, @javax.annotation.Nullable final String givenName, @javax.annotation.Nullable final String locale, @javax.annotation.Nullable final String name, @javax.annotation.Nullable final String nickname, @javax.annotation.Nullable final org.thryft.native_.Url pictureUrl) {
        this(emailAddress, identityProvider, identityProviderId, org.thryft.Optionals.fromNullable(emailAddressVerified), com.google.common.base.Optional.fromNullable(familyName), com.google.common.base.Optional.fromNullable(givenName), com.google.common.base.Optional.fromNullable(locale), com.google.common.base.Optional.fromNullable(name), com.google.common.base.Optional.fromNullable(nickname), com.google.common.base.Optional.fromNullable(pictureUrl));
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
        }
        if (!(otherObject instanceof User)) {
            return false;
        }

        final User other = (User)otherObject;

        if (!(getEmailAddress().equals(other.getEmailAddress()))) {
            return false;
        }

        if (!(getIdentityProvider().equals(other.getIdentityProvider()))) {
            return false;
        }

        if (!(getIdentityProviderId().equals(other.getIdentityProviderId()))) {
            return false;
        }

        if (!(((getEmailAddressVerified().isPresent() && other.getEmailAddressVerified().isPresent()) ? (getEmailAddressVerified().get().booleanValue() == other.getEmailAddressVerified().get().booleanValue()) : (!getEmailAddressVerified().isPresent() && !other.getEmailAddressVerified().isPresent())))) {
            return false;
        }

        if (!(((getFamilyName().isPresent() && other.getFamilyName().isPresent()) ? (getFamilyName().get().equals(other.getFamilyName().get())) : (!getFamilyName().isPresent() && !other.getFamilyName().isPresent())))) {
            return false;
        }

        if (!(((getGivenName().isPresent() && other.getGivenName().isPresent()) ? (getGivenName().get().equals(other.getGivenName().get())) : (!getGivenName().isPresent() && !other.getGivenName().isPresent())))) {
            return false;
        }

        if (!(((getLocale().isPresent() && other.getLocale().isPresent()) ? (getLocale().get().equals(other.getLocale().get())) : (!getLocale().isPresent() && !other.getLocale().isPresent())))) {
            return false;
        }

        if (!(((getName().isPresent() && other.getName().isPresent()) ? (getName().get().equals(other.getName().get())) : (!getName().isPresent() && !other.getName().isPresent())))) {
            return false;
        }

        if (!(((getNickname().isPresent() && other.getNickname().isPresent()) ? (getNickname().get().equals(other.getNickname().get())) : (!getNickname().isPresent() && !other.getNickname().isPresent())))) {
            return false;
        }

        if (!(((getPictureUrl().isPresent() && other.getPictureUrl().isPresent()) ? (getPictureUrl().get().equals(other.getPictureUrl().get())) : (!getPictureUrl().isPresent() && !other.getPictureUrl().isPresent())))) {
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
        case EMAIL_ADDRESS: return getEmailAddress();
        case IDENTITY_PROVIDER: return getIdentityProvider();
        case IDENTITY_PROVIDER_ID: return getIdentityProviderId();
        case EMAIL_ADDRESS_VERIFIED: return getEmailAddressVerified();
        case FAMILY_NAME: return getFamilyName();
        case GIVEN_NAME: return getGivenName();
        case LOCALE: return getLocale();
        case NAME: return getName();
        case NICKNAME: return getNickname();
        case PICTURE_URL: return getPictureUrl();
        default:
            throw new IllegalStateException();
        }
    }

    /**
     * date_time.DateTime ctime;
     */
    public final String getEmailAddress() {
        return emailAddress;
    }

    public final com.google.common.base.Optional<Boolean> getEmailAddressVerified() {
        return emailAddressVerified;
    }

    public final com.google.common.base.Optional<String> getFamilyName() {
        return familyName;
    }

    public final com.google.common.base.Optional<String> getGivenName() {
        return givenName;
    }

    public final org.dressdiscover.api.models.user.UserIdentityProvider getIdentityProvider() {
        return identityProvider;
    }

    public final String getIdentityProviderId() {
        return identityProviderId;
    }

    public final com.google.common.base.Optional<String> getLocale() {
        return locale;
    }

    public final com.google.common.base.Optional<String> getName() {
        return name;
    }

    public final com.google.common.base.Optional<String> getNickname() {
        return nickname;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getPictureUrl() {
        return pictureUrl;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getEmailAddress().hashCode();
        hashCode = 31 * hashCode + getIdentityProvider().ordinal();
        hashCode = 31 * hashCode + getIdentityProviderId().hashCode();
        if (getEmailAddressVerified().isPresent()) {
            hashCode = 31 * hashCode + (getEmailAddressVerified().get() ? 1 : 0);
        }
        if (getFamilyName().isPresent()) {
            hashCode = 31 * hashCode + getFamilyName().get().hashCode();
        }
        if (getGivenName().isPresent()) {
            hashCode = 31 * hashCode + getGivenName().get().hashCode();
        }
        if (getLocale().isPresent()) {
            hashCode = 31 * hashCode + getLocale().get().hashCode();
        }
        if (getName().isPresent()) {
            hashCode = 31 * hashCode + getName().get().hashCode();
        }
        if (getNickname().isPresent()) {
            hashCode = 31 * hashCode + getNickname().get().hashCode();
        }
        if (getPictureUrl().isPresent()) {
            hashCode = 31 * hashCode + getPictureUrl().get().hashCode();
        }
        return hashCode;
    }

    public static User readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsList(iprot).build();
    }

    public static User readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, NopUnknownFieldCallback.getInstance());
    }

    public static User readAsStruct(final org.thryft.protocol.InputProtocol iprot, final UnknownFieldCallback unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        return builder().readAsStruct(iprot, unknownFieldCallback).build();
    }

    public User replaceEmailAddress(final String emailAddress) {
        Validator.validateEmailAddress(emailAddress);
        return new User(emailAddress, this.identityProvider, this.identityProviderId, this.emailAddressVerified, this.familyName, this.givenName, this.locale, this.name, this.nickname, this.pictureUrl);
    }

    public User replaceEmailAddressVerified(final com.google.common.base.Optional<Boolean> emailAddressVerified) {
        Validator.validateEmailAddressVerified(emailAddressVerified);
        return new User(this.emailAddress, this.identityProvider, this.identityProviderId, emailAddressVerified, this.familyName, this.givenName, this.locale, this.name, this.nickname, this.pictureUrl);
    }

    public User replaceEmailAddressVerified(@javax.annotation.Nullable final Boolean emailAddressVerified) {
        return replaceEmailAddressVerified(org.thryft.Optionals.fromNullable(emailAddressVerified));
    }

    public User replaceEmailAddressVerified(final boolean emailAddressVerified) {
        return replaceEmailAddressVerified(org.thryft.Optionals.of(emailAddressVerified));
    }

    public User replaceFamilyName(final com.google.common.base.Optional<String> familyName) {
        Validator.validateFamilyName(familyName);
        return new User(this.emailAddress, this.identityProvider, this.identityProviderId, this.emailAddressVerified, familyName, this.givenName, this.locale, this.name, this.nickname, this.pictureUrl);
    }

    public User replaceFamilyName(@javax.annotation.Nullable final String familyName) {
        return replaceFamilyName(com.google.common.base.Optional.fromNullable(familyName));
    }

    public User replaceGivenName(final com.google.common.base.Optional<String> givenName) {
        Validator.validateGivenName(givenName);
        return new User(this.emailAddress, this.identityProvider, this.identityProviderId, this.emailAddressVerified, this.familyName, givenName, this.locale, this.name, this.nickname, this.pictureUrl);
    }

    public User replaceGivenName(@javax.annotation.Nullable final String givenName) {
        return replaceGivenName(com.google.common.base.Optional.fromNullable(givenName));
    }

    public User replaceIdentityProvider(final org.dressdiscover.api.models.user.UserIdentityProvider identityProvider) {
        Validator.validateIdentityProvider(identityProvider);
        return new User(this.emailAddress, identityProvider, this.identityProviderId, this.emailAddressVerified, this.familyName, this.givenName, this.locale, this.name, this.nickname, this.pictureUrl);
    }

    public User replaceIdentityProviderId(final String identityProviderId) {
        Validator.validateIdentityProviderId(identityProviderId);
        return new User(this.emailAddress, this.identityProvider, identityProviderId, this.emailAddressVerified, this.familyName, this.givenName, this.locale, this.name, this.nickname, this.pictureUrl);
    }

    public User replaceLocale(final com.google.common.base.Optional<String> locale) {
        Validator.validateLocale(locale);
        return new User(this.emailAddress, this.identityProvider, this.identityProviderId, this.emailAddressVerified, this.familyName, this.givenName, locale, this.name, this.nickname, this.pictureUrl);
    }

    public User replaceLocale(@javax.annotation.Nullable final String locale) {
        return replaceLocale(com.google.common.base.Optional.fromNullable(locale));
    }

    public User replaceName(final com.google.common.base.Optional<String> name) {
        Validator.validateName(name);
        return new User(this.emailAddress, this.identityProvider, this.identityProviderId, this.emailAddressVerified, this.familyName, this.givenName, this.locale, name, this.nickname, this.pictureUrl);
    }

    public User replaceName(@javax.annotation.Nullable final String name) {
        return replaceName(com.google.common.base.Optional.fromNullable(name));
    }

    public User replaceNickname(final com.google.common.base.Optional<String> nickname) {
        Validator.validateNickname(nickname);
        return new User(this.emailAddress, this.identityProvider, this.identityProviderId, this.emailAddressVerified, this.familyName, this.givenName, this.locale, this.name, nickname, this.pictureUrl);
    }

    public User replaceNickname(@javax.annotation.Nullable final String nickname) {
        return replaceNickname(com.google.common.base.Optional.fromNullable(nickname));
    }

    public User replacePictureUrl(final com.google.common.base.Optional<org.thryft.native_.Url> pictureUrl) {
        Validator.validatePictureUrl(pictureUrl);
        return new User(this.emailAddress, this.identityProvider, this.identityProviderId, this.emailAddressVerified, this.familyName, this.givenName, this.locale, this.name, this.nickname, pictureUrl);
    }

    public User replacePictureUrl(@javax.annotation.Nullable final org.thryft.native_.Url pictureUrl) {
        return replacePictureUrl(com.google.common.base.Optional.fromNullable(pictureUrl));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("email_address", getEmailAddress()).add("identity_provider", getIdentityProvider()).add("identity_provider_id", getIdentityProviderId()).add("email_address_verified", getEmailAddressVerified().orNull()).add("family_name", getFamilyName().orNull()).add("given_name", getGivenName().orNull()).add("locale", getLocale().orNull()).add("name", getName().orNull()).add("nickname", getNickname().orNull()).add("picture_url", getPictureUrl().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 10);
        writeFieldValues(oprot);
        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.user.User");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeEmailAddressField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.EMAIL_ADDRESS);
        oprot.writeString(getEmailAddress());
        oprot.writeFieldEnd();
    }

    public void writeEmailAddressVerifiedField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getEmailAddressVerified().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EMAIL_ADDRESS_VERIFIED);
            oprot.writeBool(getEmailAddressVerified().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeFamilyNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getFamilyName().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.FAMILY_NAME);
            oprot.writeString(getFamilyName().get());
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFieldValues(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeString(getEmailAddress());
        oprot.writeEnum(getIdentityProvider());
        oprot.writeString(getIdentityProviderId());
        if (getEmailAddressVerified().isPresent()) {
            oprot.writeBool(getEmailAddressVerified().get());
        } else {
            oprot.writeNull();
        }
        if (getFamilyName().isPresent()) {
            oprot.writeString(getFamilyName().get());
        } else {
            oprot.writeNull();
        }
        if (getGivenName().isPresent()) {
            oprot.writeString(getGivenName().get());
        } else {
            oprot.writeNull();
        }
        if (getLocale().isPresent()) {
            oprot.writeString(getLocale().get());
        } else {
            oprot.writeNull();
        }
        if (getName().isPresent()) {
            oprot.writeString(getName().get());
        } else {
            oprot.writeNull();
        }
        if (getNickname().isPresent()) {
            oprot.writeString(getNickname().get());
        } else {
            oprot.writeNull();
        }
        if (getPictureUrl().isPresent()) {
            oprot.writeString(getPictureUrl().get().toString());
        } else {
            oprot.writeNull();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeEmailAddressField(oprot);

        writeIdentityProviderField(oprot);

        writeIdentityProviderIdField(oprot);

        writeEmailAddressVerifiedField(oprot);

        writeFamilyNameField(oprot);

        writeGivenNameField(oprot);

        writeLocaleField(oprot);

        writeNameField(oprot);

        writeNicknameField(oprot);

        writePictureUrlField(oprot);

        oprot.writeFieldStop();
    }

    public void writeGivenNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getGivenName().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.GIVEN_NAME);
            oprot.writeString(getGivenName().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeIdentityProviderField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.IDENTITY_PROVIDER);
        oprot.writeEnum(getIdentityProvider());
        oprot.writeFieldEnd();
    }

    public void writeIdentityProviderIdField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.IDENTITY_PROVIDER_ID);
        oprot.writeString(getIdentityProviderId());
        oprot.writeFieldEnd();
    }

    public void writeLocaleField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getLocale().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.LOCALE);
            oprot.writeString(getLocale().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeNameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getName().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.NAME);
            oprot.writeString(getName().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeNicknameField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getNickname().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.NICKNAME);
            oprot.writeString(getNickname().get());
            oprot.writeFieldEnd();
        }
    }

    public void writePictureUrlField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getPictureUrl().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.PICTURE_URL);
            oprot.writeString(getPictureUrl().get().toString());
            oprot.writeFieldEnd();
        }
    }

    /**
     * date_time.DateTime ctime;
     */
    private final String emailAddress;

    private final org.dressdiscover.api.models.user.UserIdentityProvider identityProvider;

    private final String identityProviderId;

    private final com.google.common.base.Optional<Boolean> emailAddressVerified;

    private final com.google.common.base.Optional<String> familyName;

    private final com.google.common.base.Optional<String> givenName;

    private final com.google.common.base.Optional<String> locale;

    private final com.google.common.base.Optional<String> name;

    private final com.google.common.base.Optional<String> nickname;

    private final com.google.common.base.Optional<org.thryft.native_.Url> pictureUrl;
}
