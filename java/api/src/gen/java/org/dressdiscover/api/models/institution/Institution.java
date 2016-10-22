package org.dressdiscover.api.models.institution;

public final class Institution implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            title = null;
            dataRights = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> absent();
            external = com.google.common.base.Optional.<Boolean> absent();
            hidden = com.google.common.base.Optional.<Boolean> absent();
            locations = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> absent();
            url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        }

        public Builder(final Institution other) {
            this.title = other.getTitle();
            this.dataRights = other.getDataRights();
            this.external = other.getExternal();
            this.hidden = other.getHidden();
            this.locations = other.getLocations();
            this.url = other.getUrl();
        }

        protected Institution _build(final String title, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations, final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            return new Institution(title, dataRights, external, hidden, locations, url, DefaultConstructionValidator.getInstance());
        }

        public Institution build() {
            return _build(title, dataRights, external, hidden, locations, url);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> getDataRights() {
            return dataRights;
        }

        public final com.google.common.base.Optional<Boolean> getExternal() {
            return external;
        }

        public final com.google.common.base.Optional<Boolean> getHidden() {
            return hidden;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> getLocations() {
            return locations;
        }

        public final String getTitle() {
            return title;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
            return url;
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
                title = iprot.readString();
                if (__list.getSize() > 1) {
                    dataRights = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 2) {
                    external = com.google.common.base.Optional.of(iprot.readBool());
                }
                if (__list.getSize() > 3) {
                    hidden = com.google.common.base.Optional.of(iprot.readBool());
                }
                if (__list.getSize() > 4) {
                    locations = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot));
                }
                if (__list.getSize() > 5) {
                    try {
                        url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                    } catch (final java.lang.IllegalArgumentException e) {
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
                    case "title": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            title = iprot.readString();
                        }
                        break;
                    }
                    case "data_rights": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            dataRights = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "external": {
                        if (!ifield.hasId() || ifield.getId() == 7) {
                            external = com.google.common.base.Optional.of(iprot.readBool());
                        }
                        break;
                    }
                    case "hidden": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                            hidden = com.google.common.base.Optional.of(iprot.readBool());
                        }
                        break;
                    }
                    case "locations": {
                        if (!ifield.hasId() || ifield.getId() == 8) {
                            locations = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "url": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            try {
                                url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                            } catch (final java.lang.IllegalArgumentException e) {
                            }
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

        public Builder set(final FieldMetadata fieldMetadata, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(fieldMetadata);

            switch (fieldMetadata) {
            case TITLE: setTitle((String)value); return this;
            case DATA_RIGHTS: setDataRights((org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet)value); return this;
            case EXTERNAL: setExternal((Boolean)value); return this;
            case HIDDEN: setHidden((Boolean)value); return this;
            case LOCATIONS: setLocations((org.dressdiscover.api.vocabularies.vra_core.location.LocationSet)value); return this;
            case URL: setUrl((org.thryft.native_.Url)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setDataRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights) {
            this.dataRights = DefaultConstructionValidator.getInstance().validateDataRights(dataRights);
            return this;
        }

        public Builder setDataRights(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet dataRights) {
            return setDataRights(com.google.common.base.Optional.fromNullable(dataRights));
        }

        public Builder setExternal(final com.google.common.base.Optional<Boolean> external) {
            this.external = DefaultConstructionValidator.getInstance().validateExternal(external);
            return this;
        }

        public Builder setExternal(@javax.annotation.Nullable final Boolean external) {
            return setExternal(com.google.common.base.Optional.fromNullable(external));
        }

        public Builder setHidden(final com.google.common.base.Optional<Boolean> hidden) {
            this.hidden = DefaultConstructionValidator.getInstance().validateHidden(hidden);
            return this;
        }

        public Builder setHidden(@javax.annotation.Nullable final Boolean hidden) {
            return setHidden(com.google.common.base.Optional.fromNullable(hidden));
        }

        public Builder setIfPresent(final Institution other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setTitle(other.getTitle());
            if (other.getDataRights().isPresent()) {
                setDataRights(other.getDataRights());
            }
            if (other.getExternal().isPresent()) {
                setExternal(other.getExternal());
            }
            if (other.getHidden().isPresent()) {
                setHidden(other.getHidden());
            }
            if (other.getLocations().isPresent()) {
                setLocations(other.getLocations());
            }
            if (other.getUrl().isPresent()) {
                setUrl(other.getUrl());
            }

            return this;
        }

        public Builder setLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) {
            this.locations = DefaultConstructionValidator.getInstance().validateLocations(locations);
            return this;
        }

        public Builder setLocations(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.location.LocationSet locations) {
            return setLocations(com.google.common.base.Optional.fromNullable(locations));
        }

        public Builder setTitle(final String title) {
            this.title = DefaultConstructionValidator.getInstance().validateTitle(title);
            return this;
        }

        public Builder setUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            this.url = DefaultConstructionValidator.getInstance().validateUrl(url);
            return this;
        }

        public Builder setUrl(@javax.annotation.Nullable final org.thryft.native_.Url url) {
            return setUrl(com.google.common.base.Optional.fromNullable(url));
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
            case TITLE: return unsetTitle();
            case DATA_RIGHTS: return unsetDataRights();
            case EXTERNAL: return unsetExternal();
            case HIDDEN: return unsetHidden();
            case LOCATIONS: return unsetLocations();
            case URL: return unsetUrl();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetDataRights() {
            this.dataRights = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> absent();
            return this;
        }

        public Builder unsetExternal() {
            this.external = com.google.common.base.Optional.<Boolean> absent();
            return this;
        }

        public Builder unsetHidden() {
            this.hidden = com.google.common.base.Optional.<Boolean> absent();
            return this;
        }

        public Builder unsetLocations() {
            this.locations = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> absent();
            return this;
        }

        public Builder unsetTitle() {
            this.title = null;
            return this;
        }

        public Builder unsetUrl() {
            this.url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
            return this;
        }

        private String title;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights;
        private com.google.common.base.Optional<Boolean> external;
        private com.google.common.base.Optional<Boolean> hidden;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations;
        private com.google.common.base.Optional<org.thryft.native_.Url> url;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Institution> {
        @Override
        public Institution readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Institution.readAs(iprot, type);
        }

        @Override
        public Institution readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Institution.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Institution readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Institution.readAsList(iprot);
        }

        @Override
        public Institution readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Institution.readAsStruct(iprot);
        }

        @Override
        public Institution readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Institution.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, 1, "title", org.thryft.protocol.Type.STRING),
        DATA_RIGHTS("dataRights", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet>() {}, false, 5, "data_rights", org.thryft.protocol.Type.STRUCT),
        EXTERNAL("external", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 7, "external", org.thryft.protocol.Type.BOOL),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 6, "hidden", org.thryft.protocol.Type.BOOL),
        LOCATIONS("locations", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>() {}, false, 8, "locations", org.thryft.protocol.Type.STRUCT),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, 3, "url", org.thryft.protocol.Type.STRING);

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
            case "title": return TITLE;
            case "dataRights": return DATA_RIGHTS;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "url": return URL;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "title": return TITLE;
            case "data_rights": return DATA_RIGHTS;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "url": return URL;
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
        public String validateTitle(final String title) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> validateDataRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights) throws ExceptionT;

        public com.google.common.base.Optional<Boolean> validateExternal(final com.google.common.base.Optional<Boolean> external) throws ExceptionT;

        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) throws ExceptionT;

        public com.google.common.base.Optional<org.thryft.native_.Url> validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) throws ExceptionT;
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
        public String validateTitle(final String title) throws RuntimeException {
            if (title == null) {
                throw new NullPointerException("org.dressdiscover.api.models.institution.Institution: title is null");
            }
            return title;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> validateDataRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights) throws RuntimeException {
            if (dataRights == null) {
                throw new NullPointerException("org.dressdiscover.api.models.institution.Institution: dataRights is null");
            }
            if (!dataRights.isPresent()) {
                return dataRights;
            }
            return dataRights;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateExternal(final com.google.common.base.Optional<Boolean> external) throws RuntimeException {
            if (!external.isPresent()) {
                return external;
            }
            if (!external.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.institution.Institution: external is not true");
            }
            return external;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws RuntimeException {
            if (!hidden.isPresent()) {
                return hidden;
            }
            if (!hidden.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.institution.Institution: hidden is not true");
            }
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) throws RuntimeException {
            if (locations == null) {
                throw new NullPointerException("org.dressdiscover.api.models.institution.Institution: locations is null");
            }
            if (!locations.isPresent()) {
                return locations;
            }
            return locations;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) throws RuntimeException {
            if (url == null) {
                throw new NullPointerException("org.dressdiscover.api.models.institution.Institution: url is null");
            }
            if (!url.isPresent()) {
                return url;
            }
            return url;
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
        public String validateTitle(final String title) {
            return title;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> validateDataRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights) {
            return dataRights;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateExternal(final com.google.common.base.Optional<Boolean> external) {
            return external;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) {
            return locations;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            return url;
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
        public String validateTitle(final String title) throws org.thryft.protocol.InputProtocolException {
            if (title == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.models.institution.Institution: title is null");
            }
            return title;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> validateDataRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights) throws org.thryft.protocol.InputProtocolException {
            if (dataRights == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DATA_RIGHTS, "org.dressdiscover.api.models.institution.Institution: dataRights is null");
            }
            if (!dataRights.isPresent()) {
                return dataRights;
            }
            return dataRights;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateExternal(final com.google.common.base.Optional<Boolean> external) throws org.thryft.protocol.InputProtocolException {
            if (!external.isPresent()) {
                return external;
            }
            if (!external.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTERNAL, "org.dressdiscover.api.models.institution.Institution: external is not true");
            }
            return external;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws org.thryft.protocol.InputProtocolException {
            if (!hidden.isPresent()) {
                return hidden;
            }
            if (!hidden.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HIDDEN, "org.dressdiscover.api.models.institution.Institution: hidden is not true");
            }
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) throws org.thryft.protocol.InputProtocolException {
            if (locations == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LOCATIONS, "org.dressdiscover.api.models.institution.Institution: locations is null");
            }
            if (!locations.isPresent()) {
                return locations;
            }
            return locations;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) throws org.thryft.protocol.InputProtocolException {
            if (url == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.URL, "org.dressdiscover.api.models.institution.Institution: url is null");
            }
            if (!url.isPresent()) {
                return url;
            }
            return url;
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
        public String validateTitle(final String title) {
            return title;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> validateDataRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights) {
            return dataRights;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateExternal(final com.google.common.base.Optional<Boolean> external) {
            return external;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) {
            return locations;
        }

        @Override
        public com.google.common.base.Optional<org.thryft.native_.Url> validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            return url;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Copy constructor
     */
    public Institution(final Institution other) {
        this(other.getTitle(), other.getDataRights(), other.getExternal(), other.getHidden(), other.getLocations(), other.getUrl(), NopConstructionValidator.getInstance());
    }

    protected Institution(final String title, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations, final com.google.common.base.Optional<org.thryft.native_.Url> url, ConstructionValidator validator) {
        this.title = validator.validateTitle(title);
        this.dataRights = validator.validateDataRights(dataRights);
        this.external = validator.validateExternal(external);
        this.hidden = validator.validateHidden(hidden);
        this.locations = validator.validateLocations(locations);
        this.url = validator.validateUrl(url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Institution other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Institution> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static Institution create(final String title) {
        return new Institution(title, com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> absent(), com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> absent(), com.google.common.base.Optional.<org.thryft.native_.Url> absent(), DefaultConstructionValidator.getInstance());
    }

    /**
     * Total Nullable factory method
     */
    public static Institution create(final String title, final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet dataRights, final @javax.annotation.Nullable Boolean external, final @javax.annotation.Nullable Boolean hidden, final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.location.LocationSet locations, final @javax.annotation.Nullable org.thryft.native_.Url url) {
        return new Institution(title, com.google.common.base.Optional.fromNullable(dataRights), com.google.common.base.Optional.fromNullable(external), com.google.common.base.Optional.fromNullable(hidden), com.google.common.base.Optional.fromNullable(locations), com.google.common.base.Optional.fromNullable(url), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Institution create(final String title, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations, final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        return new Institution(title, dataRights, external, hidden, locations, url, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Institution)) {
            return false;
        }

        final Institution other = (Institution)otherObject;

        if (!(getTitle().equals(other.getTitle()))) {
            return false;
        }

        if (!(((getDataRights().isPresent() && other.getDataRights().isPresent()) ? (getDataRights().get().equals(other.getDataRights().get())) : (!getDataRights().isPresent() && !other.getDataRights().isPresent())))) {
            return false;
        }

        if (!(((getExternal().isPresent() && other.getExternal().isPresent()) ? (getExternal().get().booleanValue() == other.getExternal().get().booleanValue()) : (!getExternal().isPresent() && !other.getExternal().isPresent())))) {
            return false;
        }

        if (!(((getHidden().isPresent() && other.getHidden().isPresent()) ? (getHidden().get().booleanValue() == other.getHidden().get().booleanValue()) : (!getHidden().isPresent() && !other.getHidden().isPresent())))) {
            return false;
        }

        if (!(((getLocations().isPresent() && other.getLocations().isPresent()) ? (getLocations().get().equals(other.getLocations().get())) : (!getLocations().isPresent() && !other.getLocations().isPresent())))) {
            return false;
        }

        if (!(((getUrl().isPresent() && other.getUrl().isPresent()) ? (getUrl().get().equals(other.getUrl().get())) : (!getUrl().isPresent() && !other.getUrl().isPresent())))) {
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
        case TITLE: return getTitle();
        case DATA_RIGHTS: return getDataRights();
        case EXTERNAL: return getExternal();
        case HIDDEN: return getHidden();
        case LOCATIONS: return getLocations();
        case URL: return getUrl();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> getDataRights() {
        return dataRights;
    }

    public final com.google.common.base.Optional<Boolean> getExternal() {
        return external;
    }

    public final com.google.common.base.Optional<Boolean> getHidden() {
        return hidden;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> getLocations() {
        return locations;
    }

    public final String getTitle() {
        return title;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDataRights().isPresent()) {
            hashCode = 31 * hashCode + getDataRights().get().hashCode();
        }
        if (getExternal().isPresent()) {
            hashCode = 31 * hashCode + (getExternal().get() ? 1 : 0);
        }
        if (getHidden().isPresent()) {
            hashCode = 31 * hashCode + (getHidden().get() ? 1 : 0);
        }
        if (getLocations().isPresent()) {
            hashCode = 31 * hashCode + getLocations().get().hashCode();
        }
        if (getUrl().isPresent()) {
            hashCode = 31 * hashCode + getUrl().get().hashCode();
        }
        return hashCode;
    }

    public static Institution readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Institution readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Institution readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String title = null;
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> absent();
        com.google.common.base.Optional<Boolean> external = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            title = iprot.readString();
            if (__list.getSize() > 1) {
                dataRights = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                external = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 3) {
                hidden = com.google.common.base.Optional.of(iprot.readBool());
            }
            if (__list.getSize() > 4) {
                locations = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot));
            }
            if (__list.getSize() > 5) {
                try {
                    url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                } catch (final java.lang.IllegalArgumentException e) {
                }
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Institution(DefaultReadValidator.getInstance().validateTitle(title), DefaultReadValidator.getInstance().validateDataRights(dataRights), DefaultReadValidator.getInstance().validateExternal(external), DefaultReadValidator.getInstance().validateHidden(hidden), DefaultReadValidator.getInstance().validateLocations(locations), DefaultReadValidator.getInstance().validateUrl(url), NopConstructionValidator.getInstance());
    }

    public static Institution readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Institution readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        String title = null;
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> absent();
        com.google.common.base.Optional<Boolean> external = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        title = iprot.readString();
                    }
                    break;
                }
                case "data_rights": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        dataRights = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "external": {
                    if (!ifield.hasId() || ifield.getId() == 7) {
                        external = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                case "hidden": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        hidden = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    break;
                }
                case "locations": {
                    if (!ifield.hasId() || ifield.getId() == 8) {
                        locations = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot));
                    }
                    break;
                }
                case "url": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
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
        return new Institution(DefaultReadValidator.getInstance().validateTitle(title), DefaultReadValidator.getInstance().validateDataRights(dataRights), DefaultReadValidator.getInstance().validateExternal(external), DefaultReadValidator.getInstance().validateHidden(hidden), DefaultReadValidator.getInstance().validateLocations(locations), DefaultReadValidator.getInstance().validateUrl(url), NopConstructionValidator.getInstance());
    }

    public Institution replaceDataRights(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights) {
        return new Institution(this.title, DefaultConstructionValidator.getInstance().validateDataRights(dataRights), this.external, this.hidden, this.locations, this.url, NopConstructionValidator.getInstance());
    }

    public Institution replaceDataRights(final org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet dataRights) {
        return replaceDataRights(com.google.common.base.Optional.fromNullable(dataRights));
    }

    public Institution replaceExternal(final com.google.common.base.Optional<Boolean> external) {
        return new Institution(this.title, this.dataRights, DefaultConstructionValidator.getInstance().validateExternal(external), this.hidden, this.locations, this.url, NopConstructionValidator.getInstance());
    }

    public Institution replaceExternal(final boolean external) {
        return replaceExternal(com.google.common.base.Optional.fromNullable(external));
    }

    public Institution replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        return new Institution(this.title, this.dataRights, this.external, DefaultConstructionValidator.getInstance().validateHidden(hidden), this.locations, this.url, NopConstructionValidator.getInstance());
    }

    public Institution replaceHidden(final boolean hidden) {
        return replaceHidden(com.google.common.base.Optional.fromNullable(hidden));
    }

    public Institution replaceLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) {
        return new Institution(this.title, this.dataRights, this.external, this.hidden, DefaultConstructionValidator.getInstance().validateLocations(locations), this.url, NopConstructionValidator.getInstance());
    }

    public Institution replaceLocations(final org.dressdiscover.api.vocabularies.vra_core.location.LocationSet locations) {
        return replaceLocations(com.google.common.base.Optional.fromNullable(locations));
    }

    public Institution replaceTitle(final String title) {
        return new Institution(DefaultConstructionValidator.getInstance().validateTitle(title), this.dataRights, this.external, this.hidden, this.locations, this.url, NopConstructionValidator.getInstance());
    }

    public Institution replaceUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        return new Institution(this.title, this.dataRights, this.external, this.hidden, this.locations, DefaultConstructionValidator.getInstance().validateUrl(url), NopConstructionValidator.getInstance());
    }

    public Institution replaceUrl(final org.thryft.native_.Url url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("title", getTitle()).add("data_rights", getDataRights().orNull()).add("external", getExternal().orNull()).add("hidden", getHidden().orNull()).add("locations", getLocations().orNull()).add("url", getUrl().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 6);

        oprot.writeString(getTitle());

        if (getDataRights().isPresent()) {
            getDataRights().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getExternal().isPresent()) {
            oprot.writeBool(getExternal().get());
        } else {
            oprot.writeNull();
        }

        if (getHidden().isPresent()) {
            oprot.writeBool(getHidden().get());
        } else {
            oprot.writeNull();
        }

        if (getLocations().isPresent()) {
            getLocations().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getUrl().isPresent()) {
            oprot.writeString(getUrl().get().toString());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.institution.Institution");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("title", org.thryft.protocol.Type.STRING, (short)1);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();

        if (getDataRights().isPresent()) {
            oprot.writeFieldBegin("data_rights", org.thryft.protocol.Type.STRUCT, (short)5);
            getDataRights().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getExternal().isPresent()) {
            oprot.writeFieldBegin("external", org.thryft.protocol.Type.BOOL, (short)7);
            oprot.writeBool(getExternal().get());
            oprot.writeFieldEnd();
        }

        if (getHidden().isPresent()) {
            oprot.writeFieldBegin("hidden", org.thryft.protocol.Type.BOOL, (short)6);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }

        if (getLocations().isPresent()) {
            oprot.writeFieldBegin("locations", org.thryft.protocol.Type.STRUCT, (short)8);
            getLocations().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getUrl().isPresent()) {
            oprot.writeFieldBegin("url", org.thryft.protocol.Type.STRING, (short)3);
            oprot.writeString(getUrl().get().toString());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final String title;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.rights.RightsSet> dataRights;

    private final com.google.common.base.Optional<Boolean> external;

    private final com.google.common.base.Optional<Boolean> hidden;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations;

    private final com.google.common.base.Optional<org.thryft.native_.Url> url;
}
