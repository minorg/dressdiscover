package org.dressdiscover.api.models.collection;

public final class Collection implements org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            title = null;
            description = com.google.common.base.Optional.<String> absent();
            external = com.google.common.base.Optional.<Boolean> absent();
            hidden = com.google.common.base.Optional.<Boolean> absent();
            locations = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> absent();
            url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
            workTypes = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> absent();
        }

        public Builder(final Collection other) {
            this.title = other.getTitle();
            this.description = other.getDescription();
            this.external = other.getExternal();
            this.hidden = other.getHidden();
            this.locations = other.getLocations();
            this.url = other.getUrl();
            this.workTypes = other.getWorkTypes();
        }

        protected Collection _build(final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes) {
            return new Collection(title, description, external, hidden, locations, url, workTypes);
        }

        public Collection build() {
            UncheckedValidator.validate(title, description, external, hidden, locations, url, workTypes);

            return _build(title, description, external, hidden, locations, url, workTypes);
        }

        public final com.google.common.base.Optional<String> getDescription() {
            return description;
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

        public final @javax.annotation.Nullable String getTitle() {
            return title;
        }

        public final com.google.common.base.Optional<org.thryft.native_.Url> getUrl() {
            return url;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> getWorkTypes() {
            return workTypes;
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
                    description = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.getSize() > 2) {
                    external = org.thryft.Optionals.of(iprot.readBool());
                }
                if (__list.getSize() > 3) {
                    hidden = org.thryft.Optionals.of(iprot.readBool());
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
                if (__list.getSize() > 6) {
                    workTypes = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet.readAsStruct(iprot));
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
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            title = iprot.readString();
                        }
                        break;
                    }
                    case "description": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            description = com.google.common.base.Optional.of(iprot.readString());
                        }
                        break;
                    }
                    case "external": {
                        if (!ifield.hasId() || ifield.getId() == 7) {
                            external = org.thryft.Optionals.of(iprot.readBool());
                        }
                        break;
                    }
                    case "hidden": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            hidden = org.thryft.Optionals.of(iprot.readBool());
                        }
                        break;
                    }
                    case "locations": {
                        if (!ifield.hasId() || ifield.getId() == 8) {
                            locations = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "url": {
                        if (!ifield.hasId() || ifield.getId() == 9) {
                            try {
                                url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                            } catch (final java.lang.IllegalArgumentException e) {
                            }
                        }
                        break;
                    }
                    case "work_types": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                            workTypes = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet.readAsStruct(iprot, unknownFieldCallback));
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
            case DESCRIPTION: setDescription((String)value); return this;
            case EXTERNAL: setExternal((Boolean)value); return this;
            case HIDDEN: setHidden((Boolean)value); return this;
            case LOCATIONS: setLocations((org.dressdiscover.api.vocabularies.vra_core.location.LocationSet)value); return this;
            case URL: setUrl((org.thryft.native_.Url)value); return this;
            case WORK_TYPES: setWorkTypes((org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setDescription(final com.google.common.base.Optional<String> description) {
            UncheckedValidator.validateDescription(description);
            this.description = description;
            return this;
        }

        public Builder setDescription(final @javax.annotation.Nullable String description) {
            return setDescription(com.google.common.base.Optional.fromNullable(description));
        }

        public Builder setExternal(final com.google.common.base.Optional<Boolean> external) {
            UncheckedValidator.validateExternal(external);
            this.external = external;
            return this;
        }

        public Builder setExternal(final @javax.annotation.Nullable Boolean external) {
            return setExternal(org.thryft.Optionals.fromNullable(external));
        }

        public Builder setExternal(final boolean external) {
            return setExternal(org.thryft.Optionals.of(external));
        }

        public Builder setHidden(final com.google.common.base.Optional<Boolean> hidden) {
            UncheckedValidator.validateHidden(hidden);
            this.hidden = hidden;
            return this;
        }

        public Builder setHidden(final @javax.annotation.Nullable Boolean hidden) {
            return setHidden(org.thryft.Optionals.fromNullable(hidden));
        }

        public Builder setHidden(final boolean hidden) {
            return setHidden(org.thryft.Optionals.of(hidden));
        }

        public Builder setIfPresent(final Collection other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setTitle(other.getTitle());
            if (other.getDescription().isPresent()) {
                setDescription(other.getDescription());
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
            if (other.getWorkTypes().isPresent()) {
                setWorkTypes(other.getWorkTypes());
            }

            return this;
        }

        public Builder setLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) {
            UncheckedValidator.validateLocations(locations);
            this.locations = locations;
            return this;
        }

        public Builder setLocations(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.location.LocationSet locations) {
            return setLocations(com.google.common.base.Optional.fromNullable(locations));
        }

        public Builder setTitle(final String title) {
            UncheckedValidator.validateTitle(title);
            this.title = title;
            return this;
        }

        public Builder setUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            UncheckedValidator.validateUrl(url);
            this.url = url;
            return this;
        }

        public Builder setUrl(final @javax.annotation.Nullable org.thryft.native_.Url url) {
            return setUrl(com.google.common.base.Optional.fromNullable(url));
        }

        public Builder setWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes) {
            UncheckedValidator.validateWorkTypes(workTypes);
            this.workTypes = workTypes;
            return this;
        }

        public Builder setWorkTypes(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet workTypes) {
            return setWorkTypes(com.google.common.base.Optional.fromNullable(workTypes));
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
            case DESCRIPTION: return unsetDescription();
            case EXTERNAL: return unsetExternal();
            case HIDDEN: return unsetHidden();
            case LOCATIONS: return unsetLocations();
            case URL: return unsetUrl();
            case WORK_TYPES: return unsetWorkTypes();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetDescription() {
            this.description = com.google.common.base.Optional.<String> absent();
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

        public Builder unsetWorkTypes() {
            this.workTypes = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> absent();
            return this;
        }

        private @javax.annotation.Nullable String title;
        private com.google.common.base.Optional<String> description;
        private com.google.common.base.Optional<Boolean> external;
        private com.google.common.base.Optional<Boolean> hidden;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations;
        private com.google.common.base.Optional<org.thryft.native_.Url> url;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Collection> {
        @Override
        public Collection readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Collection.readAs(iprot, type);
        }

        @Override
        public Collection readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Collection.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Collection readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Collection.readAsList(iprot);
        }

        @Override
        public Collection readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Collection.readAsStruct(iprot);
        }

        @Override
        public Collection readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Collection.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        TITLE("title", new com.google.common.reflect.TypeToken<String>() {}, true, (short)2, "title", org.thryft.protocol.Type.STRING),
        DESCRIPTION("description", new com.google.common.reflect.TypeToken<String>() {}, false, (short)4, "description", org.thryft.protocol.Type.STRING),
        EXTERNAL("external", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)7, "external", org.thryft.protocol.Type.BOOL),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)5, "hidden", org.thryft.protocol.Type.BOOL),
        LOCATIONS("locations", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet>() {}, false, (short)8, "locations", org.thryft.protocol.Type.STRUCT),
        URL("url", new com.google.common.reflect.TypeToken<org.thryft.native_.Url>() {}, false, (short)9, "url", org.thryft.protocol.Type.STRING),
        WORK_TYPES("workTypes", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet>() {}, false, (short)6, "work_types", org.thryft.protocol.Type.STRUCT);

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
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "url": return URL;
            case "workTypes": return WORK_TYPES;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "title": return TITLE;
            case "description": return DESCRIPTION;
            case "external": return EXTERNAL;
            case "hidden": return HIDDEN;
            case "locations": return LOCATIONS;
            case "url": return URL;
            case "work_types": return WORK_TYPES;
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
        public static void validate(final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes) throws org.thryft.protocol.InputProtocolException {
            validateTitle(title);
            validateDescription(description);
            validateExternal(external);
            validateHidden(hidden);
            validateLocations(locations);
            validateUrl(url);
            validateWorkTypes(workTypes);
        }

        public static void validateTitle(final String title) throws org.thryft.protocol.InputProtocolException {
            if (title == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.models.collection.Collection: title is null");
            }
            if (title.isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.TITLE, "org.dressdiscover.api.models.collection.Collection.title: less than min length 1");
            }
        }

        public static void validateDescription(final com.google.common.base.Optional<String> description) throws org.thryft.protocol.InputProtocolException {
            if (description == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DESCRIPTION, "org.dressdiscover.api.models.collection.Collection: description is null");
            }
            if (!description.isPresent()) {
                return;
            }
            if (description.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.DESCRIPTION, "org.dressdiscover.api.models.collection.Collection.description: less than min length 1");
            }
        }

        public static void validateExternal(final com.google.common.base.Optional<Boolean> external) throws org.thryft.protocol.InputProtocolException {
            if (external == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.EXTERNAL, "org.dressdiscover.api.models.collection.Collection: external is null");
            }
            if (!external.isPresent()) {
                return;
            }
            if (!external.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.EXTERNAL, "org.dressdiscover.api.models.collection.Collection.external: not true");
            }
        }

        public static void validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws org.thryft.protocol.InputProtocolException {
            if (hidden == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HIDDEN, "org.dressdiscover.api.models.collection.Collection: hidden is null");
            }
            if (!hidden.isPresent()) {
                return;
            }
            if (!hidden.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HIDDEN, "org.dressdiscover.api.models.collection.Collection.hidden: not true");
            }
        }

        public static void validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) throws org.thryft.protocol.InputProtocolException {
            if (locations == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.LOCATIONS, "org.dressdiscover.api.models.collection.Collection: locations is null");
            }
            if (!locations.isPresent()) {
                return;
            }
        }

        public static void validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) throws org.thryft.protocol.InputProtocolException {
            if (url == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.URL, "org.dressdiscover.api.models.collection.Collection: url is null");
            }
            if (!url.isPresent()) {
                return;
            }
        }

        public static void validateWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes) throws org.thryft.protocol.InputProtocolException {
            if (workTypes == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.WORK_TYPES, "org.dressdiscover.api.models.collection.Collection: workTypes is null");
            }
            if (!workTypes.isPresent()) {
                return;
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes) {
            validateTitle(title);
            validateDescription(description);
            validateExternal(external);
            validateHidden(hidden);
            validateLocations(locations);
            validateUrl(url);
            validateWorkTypes(workTypes);
        }

        public static void validateTitle(final String title) {
            if (title == null) {
                throw new NullPointerException("org.dressdiscover.api.models.collection.Collection: title is null");
            }
            if (title.isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.collection.Collection.title: less than min length 1");
            }
        }

        public static void validateDescription(final com.google.common.base.Optional<String> description) {
            if (description == null) {
                throw new NullPointerException("org.dressdiscover.api.models.collection.Collection: description is null");
            }
            if (!description.isPresent()) {
                return;
            }
            if (description.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.collection.Collection.description: less than min length 1");
            }
        }

        public static void validateExternal(final com.google.common.base.Optional<Boolean> external) {
            if (external == null) {
                throw new NullPointerException("org.dressdiscover.api.models.collection.Collection: external is null");
            }
            if (!external.isPresent()) {
                return;
            }
            if (!external.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.collection.Collection.external: not true");
            }
        }

        public static void validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            if (hidden == null) {
                throw new NullPointerException("org.dressdiscover.api.models.collection.Collection: hidden is null");
            }
            if (!hidden.isPresent()) {
                return;
            }
            if (!hidden.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.collection.Collection.hidden: not true");
            }
        }

        public static void validateLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) {
            if (locations == null) {
                throw new NullPointerException("org.dressdiscover.api.models.collection.Collection: locations is null");
            }
            if (!locations.isPresent()) {
                return;
            }
        }

        public static void validateUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
            if (url == null) {
                throw new NullPointerException("org.dressdiscover.api.models.collection.Collection: url is null");
            }
            if (!url.isPresent()) {
                return;
            }
        }

        public static void validateWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes) {
            if (workTypes == null) {
                throw new NullPointerException("org.dressdiscover.api.models.collection.Collection: workTypes is null");
            }
            if (!workTypes.isPresent()) {
                return;
            }
        }
    }

    /**
     * Copy constructor
     */
    public Collection(final Collection other) {
        this(other.getTitle(), other.getDescription(), other.getExternal(), other.getHidden(), other.getLocations(), other.getUrl(), other.getWorkTypes());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected Collection(final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes) {
        this.title = title;
        this.description = description;
        this.external = external;
        this.hidden = hidden;
        this.locations = locations;
        this.url = url;
        this.workTypes = workTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Collection other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Collection> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    /**
     * Required factory method
     */
    public static Collection create(final String title) {
        UncheckedValidator.validate(title, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> absent(), com.google.common.base.Optional.<org.thryft.native_.Url> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> absent());
        return new Collection(title, com.google.common.base.Optional.<String> absent(), com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<Boolean> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> absent(), com.google.common.base.Optional.<org.thryft.native_.Url> absent(), com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> absent());
    }

    /**
     * Total Nullable factory method
     */
    public static Collection create(final String title, @javax.annotation.Nullable final String description, @javax.annotation.Nullable final Boolean external, @javax.annotation.Nullable final Boolean hidden, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.location.LocationSet locations, @javax.annotation.Nullable final org.thryft.native_.Url url, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet workTypes) {
        final com.google.common.base.Optional<String> descriptionOptional = com.google.common.base.Optional.fromNullable(description);
        final com.google.common.base.Optional<Boolean> externalOptional = org.thryft.Optionals.fromNullable(external);
        final com.google.common.base.Optional<Boolean> hiddenOptional = org.thryft.Optionals.fromNullable(hidden);
        final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locationsOptional = com.google.common.base.Optional.fromNullable(locations);
        final com.google.common.base.Optional<org.thryft.native_.Url> urlOptional = com.google.common.base.Optional.fromNullable(url);
        final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypesOptional = com.google.common.base.Optional.fromNullable(workTypes);
        UncheckedValidator.validate(title, descriptionOptional, externalOptional, hiddenOptional, locationsOptional, urlOptional, workTypesOptional);
        return new Collection(title, descriptionOptional, externalOptional, hiddenOptional, locationsOptional, urlOptional, workTypesOptional);
    }

    /**
     * Optional factory method
     */
    public static Collection create(final String title, final com.google.common.base.Optional<String> description, final com.google.common.base.Optional<Boolean> external, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations, final com.google.common.base.Optional<org.thryft.native_.Url> url, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes) {
        UncheckedValidator.validate(title, description, external, hidden, locations, url, workTypes);
        return new Collection(title, description, external, hidden, locations, url, workTypes);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Collection)) {
            return false;
        }

        final Collection other = (Collection)otherObject;

        if (!(getTitle().equals(other.getTitle()))) {
            return false;
        }

        if (!(((getDescription().isPresent() && other.getDescription().isPresent()) ? (getDescription().get().equals(other.getDescription().get())) : (!getDescription().isPresent() && !other.getDescription().isPresent())))) {
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

        if (!(((getWorkTypes().isPresent() && other.getWorkTypes().isPresent()) ? (getWorkTypes().get().equals(other.getWorkTypes().get())) : (!getWorkTypes().isPresent() && !other.getWorkTypes().isPresent())))) {
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
        case DESCRIPTION: return getDescription();
        case EXTERNAL: return getExternal();
        case HIDDEN: return getHidden();
        case LOCATIONS: return getLocations();
        case URL: return getUrl();
        case WORK_TYPES: return getWorkTypes();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<String> getDescription() {
        return description;
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

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> getWorkTypes() {
        return workTypes;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getTitle().hashCode();
        if (getDescription().isPresent()) {
            hashCode = 31 * hashCode + getDescription().get().hashCode();
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
        if (getWorkTypes().isPresent()) {
            hashCode = 31 * hashCode + getWorkTypes().get().hashCode();
        }
        return hashCode;
    }

    public static Collection readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Collection readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Collection readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        String title;
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<Boolean> external = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            title = iprot.readString();
            if (__list.getSize() > 1) {
                description = com.google.common.base.Optional.of(iprot.readString());
            }
            if (__list.getSize() > 2) {
                external = org.thryft.Optionals.of(iprot.readBool());
            }
            if (__list.getSize() > 3) {
                hidden = org.thryft.Optionals.of(iprot.readBool());
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
            if (__list.getSize() > 6) {
                workTypes = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(title, description, external, hidden, locations, url, workTypes);

        return new Collection(title, description, external, hidden, locations, url, workTypes);
    }

    public static Collection readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Collection readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        @javax.annotation.Nullable String title = null;
        com.google.common.base.Optional<String> description = com.google.common.base.Optional.<String> absent();
        com.google.common.base.Optional<Boolean> external = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> absent();
        com.google.common.base.Optional<org.thryft.native_.Url> url = com.google.common.base.Optional.<org.thryft.native_.Url> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "title": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        title = iprot.readString();
                    }
                    break;
                }
                case "description": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        description = com.google.common.base.Optional.of(iprot.readString());
                    }
                    break;
                }
                case "external": {
                    if (!ifield.hasId() || ifield.getId() == 7) {
                        external = org.thryft.Optionals.of(iprot.readBool());
                    }
                    break;
                }
                case "hidden": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        hidden = org.thryft.Optionals.of(iprot.readBool());
                    }
                    break;
                }
                case "locations": {
                    if (!ifield.hasId() || ifield.getId() == 8) {
                        locations = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.location.LocationSet.readAsStruct(iprot, unknownFieldCallback));
                    }
                    break;
                }
                case "url": {
                    if (!ifield.hasId() || ifield.getId() == 9) {
                        try {
                            url = com.google.common.base.Optional.of(org.thryft.native_.Url.parse(iprot.readString()));
                        } catch (final java.lang.IllegalArgumentException e) {
                        }
                    }
                    break;
                }
                case "work_types": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        workTypes = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet.readAsStruct(iprot, unknownFieldCallback));
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

        ReadValidator.validate(title, description, external, hidden, locations, url, workTypes);

        return new Collection(title, description, external, hidden, locations, url, workTypes);
    }

    public Collection replaceDescription(final com.google.common.base.Optional<String> description) {
        UncheckedValidator.validateDescription(description);
        return new Collection(this.title, description, this.external, this.hidden, this.locations, this.url, this.workTypes);
    }

    public Collection replaceDescription(@javax.annotation.Nullable final String description) {
        return replaceDescription(com.google.common.base.Optional.fromNullable(description));
    }

    public Collection replaceExternal(final com.google.common.base.Optional<Boolean> external) {
        UncheckedValidator.validateExternal(external);
        return new Collection(this.title, this.description, external, this.hidden, this.locations, this.url, this.workTypes);
    }

    public Collection replaceExternal(@javax.annotation.Nullable final Boolean external) {
        return replaceExternal(org.thryft.Optionals.fromNullable(external));
    }

    public Collection replaceExternal(final boolean external) {
        return replaceExternal(org.thryft.Optionals.of(external));
    }

    public Collection replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        UncheckedValidator.validateHidden(hidden);
        return new Collection(this.title, this.description, this.external, hidden, this.locations, this.url, this.workTypes);
    }

    public Collection replaceHidden(@javax.annotation.Nullable final Boolean hidden) {
        return replaceHidden(org.thryft.Optionals.fromNullable(hidden));
    }

    public Collection replaceHidden(final boolean hidden) {
        return replaceHidden(org.thryft.Optionals.of(hidden));
    }

    public Collection replaceLocations(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations) {
        UncheckedValidator.validateLocations(locations);
        return new Collection(this.title, this.description, this.external, this.hidden, locations, this.url, this.workTypes);
    }

    public Collection replaceLocations(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.location.LocationSet locations) {
        return replaceLocations(com.google.common.base.Optional.fromNullable(locations));
    }

    public Collection replaceTitle(final String title) {
        UncheckedValidator.validateTitle(title);
        return new Collection(title, this.description, this.external, this.hidden, this.locations, this.url, this.workTypes);
    }

    public Collection replaceUrl(final com.google.common.base.Optional<org.thryft.native_.Url> url) {
        UncheckedValidator.validateUrl(url);
        return new Collection(this.title, this.description, this.external, this.hidden, this.locations, url, this.workTypes);
    }

    public Collection replaceUrl(@javax.annotation.Nullable final org.thryft.native_.Url url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    public Collection replaceWorkTypes(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes) {
        UncheckedValidator.validateWorkTypes(workTypes);
        return new Collection(this.title, this.description, this.external, this.hidden, this.locations, this.url, workTypes);
    }

    public Collection replaceWorkTypes(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet workTypes) {
        return replaceWorkTypes(com.google.common.base.Optional.fromNullable(workTypes));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("title", getTitle()).add("description", getDescription().orNull()).add("external", getExternal().orNull()).add("hidden", getHidden().orNull()).add("locations", getLocations().orNull()).add("url", getUrl().orNull()).add("work_types", getWorkTypes().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 7);

        oprot.writeString(getTitle());

        if (getDescription().isPresent()) {
            oprot.writeString(getDescription().get());
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

        if (getWorkTypes().isPresent()) {
            getWorkTypes().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.collection.Collection");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeDescriptionField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDescription().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DESCRIPTION);
            oprot.writeString(getDescription().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeExternalField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getExternal().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.EXTERNAL);
            oprot.writeBool(getExternal().get());
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeTitleField(oprot);

        writeDescriptionField(oprot);

        writeExternalField(oprot);

        writeHiddenField(oprot);

        writeLocationsField(oprot);

        writeUrlField(oprot);

        writeWorkTypesField(oprot);

        oprot.writeFieldStop();
    }

    public void writeHiddenField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getHidden().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.HIDDEN);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeLocationsField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getLocations().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.LOCATIONS);
            getLocations().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeTitleField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin(FieldMetadata.TITLE);
        oprot.writeString(getTitle());
        oprot.writeFieldEnd();
    }

    public void writeUrlField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getUrl().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.URL);
            oprot.writeString(getUrl().get().toString());
            oprot.writeFieldEnd();
        }
    }

    public void writeWorkTypesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getWorkTypes().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.WORK_TYPES);
            getWorkTypes().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    private final String title;

    private final com.google.common.base.Optional<String> description;

    private final com.google.common.base.Optional<Boolean> external;

    private final com.google.common.base.Optional<Boolean> hidden;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.location.LocationSet> locations;

    private final com.google.common.base.Optional<org.thryft.native_.Url> url;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.work_type.WorkTypeSet> workTypes;
}
