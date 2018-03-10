package org.dressdiscover.api.models.object;

public final class Object implements org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            costumeCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> absent();
            dublinCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> absent();
            hidden = com.google.common.base.Optional.<Boolean> absent();
            images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
            vraCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> absent();
        }

        public Builder(final Object other) {
            this.costumeCore = other.getCostumeCore();
            this.dublinCore = other.getDublinCore();
            this.hidden = other.getHidden();
            this.images = other.getImages();
            this.vraCore = other.getVraCore();
        }

        protected Object _build(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
            return new Object(costumeCore, dublinCore, hidden, images, vraCore);
        }

        public Object build() {
            UncheckedValidator.validate(costumeCore, dublinCore, hidden, images, vraCore);

            return _build(costumeCore, dublinCore, hidden, images, vraCore);
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> getCostumeCore() {
            return costumeCore;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> getDublinCore() {
            return dublinCore;
        }

        public final com.google.common.base.Optional<Boolean> getHidden() {
            return hidden;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> getImages() {
            return images;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> getVraCore() {
            return vraCore;
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
                if (__list.getSize() > 0) {
                    costumeCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject.readAsStruct(iprot));
                }
                if (__list.getSize() > 1) {
                    dublinCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject.readAsStruct(iprot));
                }
                if (__list.getSize() > 2) {
                    hidden = org.thryft.Optionals.of(iprot.readBool());
                }
                if (__list.getSize() > 3) {
                    try {
                        images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.models.image.Image.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, e.getCause());
                    }
                }
                if (__list.getSize() > 4) {
                    vraCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VraCoreObject.readAsStruct(iprot));
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
                    case "costume_core": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            costumeCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "dublin_core": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            dublinCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject.readAsStruct(iprot, unknownFieldCallback));
                        }
                        break;
                    }
                    case "hidden": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            hidden = org.thryft.Optionals.of(iprot.readBool());
                        }
                        break;
                    }
                    case "images": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            try {
                                images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.models.image.Image.readAsStruct(iprot, unknownFieldCallback));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, e.getCause());
                            }
                        }
                        break;
                    }
                    case "vra_core": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                            vraCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VraCoreObject.readAsStruct(iprot, unknownFieldCallback));
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
            case COSTUME_CORE: setCostumeCore((org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject)value); return this;
            case DUBLIN_CORE: setDublinCore((org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject)value); return this;
            case HIDDEN: setHidden((Boolean)value); return this;
            case IMAGES: setImages((com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>)value); return this;
            case VRA_CORE: setVraCore((org.dressdiscover.api.vocabularies.vra_core.VraCoreObject)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) {
            UncheckedValidator.validateCostumeCore(costumeCore);
            this.costumeCore = costumeCore;
            return this;
        }

        public Builder setCostumeCore(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject costumeCore) {
            return setCostumeCore(com.google.common.base.Optional.fromNullable(costumeCore));
        }

        public Builder setDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) {
            UncheckedValidator.validateDublinCore(dublinCore);
            this.dublinCore = dublinCore;
            return this;
        }

        public Builder setDublinCore(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject dublinCore) {
            return setDublinCore(com.google.common.base.Optional.fromNullable(dublinCore));
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

        public Builder setIfPresent(final Object other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getCostumeCore().isPresent()) {
                setCostumeCore(other.getCostumeCore());
            }
            if (other.getDublinCore().isPresent()) {
                setDublinCore(other.getDublinCore());
            }
            if (other.getHidden().isPresent()) {
                setHidden(other.getHidden());
            }
            if (other.getImages().isPresent()) {
                setImages(other.getImages());
            }
            if (other.getVraCore().isPresent()) {
                setVraCore(other.getVraCore());
            }

            return this;
        }

        public Builder setImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
            UncheckedValidator.validateImages(images);
            this.images = images;
            return this;
        }

        public Builder setImages(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> images) {
            return setImages(com.google.common.base.Optional.fromNullable(images));
        }

        public Builder setVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
            UncheckedValidator.validateVraCore(vraCore);
            this.vraCore = vraCore;
            return this;
        }

        public Builder setVraCore(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.VraCoreObject vraCore) {
            return setVraCore(com.google.common.base.Optional.fromNullable(vraCore));
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
            case COSTUME_CORE: return unsetCostumeCore();
            case DUBLIN_CORE: return unsetDublinCore();
            case HIDDEN: return unsetHidden();
            case IMAGES: return unsetImages();
            case VRA_CORE: return unsetVraCore();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetCostumeCore() {
            this.costumeCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> absent();
            return this;
        }

        public Builder unsetDublinCore() {
            this.dublinCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> absent();
            return this;
        }

        public Builder unsetHidden() {
            this.hidden = com.google.common.base.Optional.<Boolean> absent();
            return this;
        }

        public Builder unsetImages() {
            this.images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
            return this;
        }

        public Builder unsetVraCore() {
            this.vraCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> absent();
            return this;
        }

        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore;
        private com.google.common.base.Optional<Boolean> hidden;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<Object> {
        @Override
        public Object readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return Object.readAs(iprot, type);
        }

        @Override
        public Object readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Object.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public Object readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Object.readAsList(iprot);
        }

        @Override
        public Object readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return Object.readAsStruct(iprot);
        }

        @Override
        public Object readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return Object.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        COSTUME_CORE("costumeCore", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject>() {}, false, (short)1, "costume_core", org.thryft.protocol.Type.STRUCT),
        DUBLIN_CORE("dublinCore", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject>() {}, false, (short)2, "dublin_core", org.thryft.protocol.Type.STRUCT),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, (short)3, "hidden", org.thryft.protocol.Type.BOOL),
        IMAGES("images", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {}, false, (short)4, "images", org.thryft.protocol.Type.LIST),
        VRA_CORE("vraCore", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject>() {}, false, (short)6, "vra_core", org.thryft.protocol.Type.STRUCT);

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
            case "costumeCore": return COSTUME_CORE;
            case "dublinCore": return DUBLIN_CORE;
            case "hidden": return HIDDEN;
            case "images": return IMAGES;
            case "vraCore": return VRA_CORE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "costume_core": return COSTUME_CORE;
            case "dublin_core": return DUBLIN_CORE;
            case "hidden": return HIDDEN;
            case "images": return IMAGES;
            case "vra_core": return VRA_CORE;
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
        public static void validate(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) throws org.thryft.protocol.InputProtocolException {
            validateCostumeCore(costumeCore);
            validateDublinCore(dublinCore);
            validateHidden(hidden);
            validateImages(images);
            validateVraCore(vraCore);
        }

        public static void validateCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) throws org.thryft.protocol.InputProtocolException {
            if (costumeCore == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COSTUME_CORE, "org.dressdiscover.api.models.object.Object: costumeCore is null");
            }
        }

        public static void validateDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) throws org.thryft.protocol.InputProtocolException {
            if (dublinCore == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DUBLIN_CORE, "org.dressdiscover.api.models.object.Object: dublinCore is null");
            }
        }

        public static void validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws org.thryft.protocol.InputProtocolException {
            if (hidden == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.HIDDEN, "org.dressdiscover.api.models.object.Object: hidden is null");
            }
            if (hidden.isPresent()) {
                if (!hidden.get()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HIDDEN, "org.dressdiscover.api.models.object.Object: hidden: not true");
                }
            }
        }

        public static void validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) throws org.thryft.protocol.InputProtocolException {
            if (images == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IMAGES, "org.dressdiscover.api.models.object.Object: images is null");
            }
            if (images.isPresent()) {
                if (images.get().isEmpty()) {
                    throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, "org.dressdiscover.api.models.object.Object: images: less than min length 1");
                }
            }
        }

        public static void validateVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) throws org.thryft.protocol.InputProtocolException {
            if (vraCore == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VRA_CORE, "org.dressdiscover.api.models.object.Object: vraCore is null");
            }
        }
    }

    public final static class UncheckedValidator {
        public static void validate(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
            validateCostumeCore(costumeCore);
            validateDublinCore(dublinCore);
            validateHidden(hidden);
            validateImages(images);
            validateVraCore(vraCore);
        }

        public static void validateCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) {
            if (costumeCore == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: costumeCore is null");
            }
        }

        public static void validateDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) {
            if (dublinCore == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: dublinCore is null");
            }
        }

        public static void validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            if (hidden == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: hidden is null");
            }
            if (hidden.isPresent()) {
                if (!hidden.get()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.Object: hidden: not true");
                }
            }
        }

        public static void validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
            if (images == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: images is null");
            }
            if (images.isPresent()) {
                if (images.get().isEmpty()) {
                    throw new IllegalArgumentException("org.dressdiscover.api.models.object.Object: images: less than min length 1");
                }
            }
        }

        public static void validateVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
            if (vraCore == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: vraCore is null");
            }
        }
    }

    /**
     * Default constructor
     */
    @Deprecated
    public Object() {
        costumeCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> absent();
        dublinCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> absent();
        hidden = com.google.common.base.Optional.<Boolean> absent();
        images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
        vraCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> absent();
    }

    /**
     * Copy constructor
     */
    public Object(final Object other) {
        this(other.getCostumeCore(), other.getDublinCore(), other.getHidden(), other.getImages(), other.getVraCore());
    }

    /**
     * Total constructor
     *
     * All fields should have been validated before calling this.
     */
    protected Object(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
        this.costumeCore = costumeCore;
        this.dublinCore = dublinCore;
        this.hidden = hidden;
        this.images = images;
        this.vraCore = vraCore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final Object other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<Object> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Deprecated
    public static Object create() {
        return new Object();
    }

    /**
     * Total Nullable factory method
     */
    public static Object create(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject costumeCore, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject dublinCore, @javax.annotation.Nullable final Boolean hidden, @javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> images, @javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.VraCoreObject vraCore) {
        final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCoreOptional = com.google.common.base.Optional.fromNullable(costumeCore);
        final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCoreOptional = com.google.common.base.Optional.fromNullable(dublinCore);
        final com.google.common.base.Optional<Boolean> hiddenOptional = org.thryft.Optionals.fromNullable(hidden);
        final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> imagesOptional = com.google.common.base.Optional.fromNullable(images);
        final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCoreOptional = com.google.common.base.Optional.fromNullable(vraCore);
        UncheckedValidator.validate(costumeCoreOptional, dublinCoreOptional, hiddenOptional, imagesOptional, vraCoreOptional);
        return new Object(costumeCoreOptional, dublinCoreOptional, hiddenOptional, imagesOptional, vraCoreOptional);
    }

    /**
     * Optional factory method
     */
    public static Object create(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
        UncheckedValidator.validate(costumeCore, dublinCore, hidden, images, vraCore);
        return new Object(costumeCore, dublinCore, hidden, images, vraCore);
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof Object)) {
            return false;
        }

        final Object other = (Object)otherObject;

        if (!(((getCostumeCore().isPresent() && other.getCostumeCore().isPresent()) ? (getCostumeCore().get().equals(other.getCostumeCore().get())) : (!getCostumeCore().isPresent() && !other.getCostumeCore().isPresent())))) {
            return false;
        }

        if (!(((getDublinCore().isPresent() && other.getDublinCore().isPresent()) ? (getDublinCore().get().equals(other.getDublinCore().get())) : (!getDublinCore().isPresent() && !other.getDublinCore().isPresent())))) {
            return false;
        }

        if (!(((getHidden().isPresent() && other.getHidden().isPresent()) ? (getHidden().get().booleanValue() == other.getHidden().get().booleanValue()) : (!getHidden().isPresent() && !other.getHidden().isPresent())))) {
            return false;
        }

        if (!(((getImages().isPresent() && other.getImages().isPresent()) ? (getImages().get().equals(other.getImages().get())) : (!getImages().isPresent() && !other.getImages().isPresent())))) {
            return false;
        }

        if (!(((getVraCore().isPresent() && other.getVraCore().isPresent()) ? (getVraCore().get().equals(other.getVraCore().get())) : (!getVraCore().isPresent() && !other.getVraCore().isPresent())))) {
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
        case COSTUME_CORE: return getCostumeCore();
        case DUBLIN_CORE: return getDublinCore();
        case HIDDEN: return getHidden();
        case IMAGES: return getImages();
        case VRA_CORE: return getVraCore();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> getCostumeCore() {
        return costumeCore;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> getDublinCore() {
        return dublinCore;
    }

    public final com.google.common.base.Optional<Boolean> getHidden() {
        return hidden;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> getImages() {
        return images;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> getVraCore() {
        return vraCore;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getCostumeCore().isPresent()) {
            hashCode = 31 * hashCode + getCostumeCore().get().hashCode();
        }
        if (getDublinCore().isPresent()) {
            hashCode = 31 * hashCode + getDublinCore().get().hashCode();
        }
        if (getHidden().isPresent()) {
            hashCode = 31 * hashCode + (getHidden().get() ? 1 : 0);
        }
        if (getImages().isPresent()) {
            hashCode = 31 * hashCode + getImages().get().hashCode();
        }
        if (getVraCore().isPresent()) {
            hashCode = 31 * hashCode + getVraCore().get().hashCode();
        }
        return hashCode;
    }

    public static Object readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Object readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static Object readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                costumeCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject.readAsStruct(iprot));
            }
            if (__list.getSize() > 1) {
                dublinCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject.readAsStruct(iprot));
            }
            if (__list.getSize() > 2) {
                hidden = org.thryft.Optionals.of(iprot.readBool());
            }
            if (__list.getSize() > 3) {
                try {
                    images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.models.image.Image.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, e.getCause());
                }
            }
            if (__list.getSize() > 4) {
                vraCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VraCoreObject.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }

        ReadValidator.validate(costumeCore, dublinCore, hidden, images, vraCore);

        return new Object(costumeCore, dublinCore, hidden, images, vraCore);
    }

    public static Object readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Object readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "costume_core": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        costumeCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject.readAsStruct(iprot, unknownFieldCallback));
                    }
                    break;
                }
                case "dublin_core": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        dublinCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject.readAsStruct(iprot, unknownFieldCallback));
                    }
                    break;
                }
                case "hidden": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        hidden = org.thryft.Optionals.of(iprot.readBool());
                    }
                    break;
                }
                case "images": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        try {
                            images = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.models.image.Image> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.models.image.Image.readAsStruct(iprot, unknownFieldCallback));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, e.getCause());
                        }
                    }
                    break;
                }
                case "vra_core": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        vraCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VraCoreObject.readAsStruct(iprot, unknownFieldCallback));
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

        ReadValidator.validate(costumeCore, dublinCore, hidden, images, vraCore);

        return new Object(costumeCore, dublinCore, hidden, images, vraCore);
    }

    public Object replaceCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) {
        UncheckedValidator.validateCostumeCore(costumeCore);
        return new Object(costumeCore, this.dublinCore, this.hidden, this.images, this.vraCore);
    }

    public Object replaceCostumeCore(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject costumeCore) {
        return replaceCostumeCore(com.google.common.base.Optional.fromNullable(costumeCore));
    }

    public Object replaceDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) {
        UncheckedValidator.validateDublinCore(dublinCore);
        return new Object(this.costumeCore, dublinCore, this.hidden, this.images, this.vraCore);
    }

    public Object replaceDublinCore(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject dublinCore) {
        return replaceDublinCore(com.google.common.base.Optional.fromNullable(dublinCore));
    }

    public Object replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        UncheckedValidator.validateHidden(hidden);
        return new Object(this.costumeCore, this.dublinCore, hidden, this.images, this.vraCore);
    }

    public Object replaceHidden(@javax.annotation.Nullable final Boolean hidden) {
        return replaceHidden(org.thryft.Optionals.fromNullable(hidden));
    }

    public Object replaceHidden(final boolean hidden) {
        return replaceHidden(org.thryft.Optionals.of(hidden));
    }

    public Object replaceImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
        UncheckedValidator.validateImages(images);
        return new Object(this.costumeCore, this.dublinCore, this.hidden, images, this.vraCore);
    }

    public Object replaceImages(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> images) {
        return replaceImages(com.google.common.base.Optional.fromNullable(images));
    }

    public Object replaceVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
        UncheckedValidator.validateVraCore(vraCore);
        return new Object(this.costumeCore, this.dublinCore, this.hidden, this.images, vraCore);
    }

    public Object replaceVraCore(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.VraCoreObject vraCore) {
        return replaceVraCore(com.google.common.base.Optional.fromNullable(vraCore));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("costume_core", getCostumeCore().orNull()).add("dublin_core", getDublinCore().orNull()).add("hidden", getHidden().orNull()).add("images", getImages().orNull()).add("vra_core", getVraCore().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 5);

        if (getCostumeCore().isPresent()) {
            getCostumeCore().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getDublinCore().isPresent()) {
            getDublinCore().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        if (getHidden().isPresent()) {
            oprot.writeBool(getHidden().get());
        } else {
            oprot.writeNull();
        }

        if (getImages().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getImages().get().size());
            for (final org.dressdiscover.api.models.image.Image _iter0 : getImages().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getVraCore().isPresent()) {
            getVraCore().get().writeAsStruct(oprot);
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.models.object.Object");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    public void writeCostumeCoreField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCostumeCore().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.COSTUME_CORE);
            getCostumeCore().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public void writeDublinCoreField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getDublinCore().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.DUBLIN_CORE);
            getDublinCore().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        writeCostumeCoreField(oprot);

        writeDublinCoreField(oprot);

        writeHiddenField(oprot);

        writeImagesField(oprot);

        writeVraCoreField(oprot);

        oprot.writeFieldStop();
    }

    public void writeHiddenField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getHidden().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.HIDDEN);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }
    }

    public void writeImagesField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getImages().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.IMAGES);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getImages().get().size());
            for (final org.dressdiscover.api.models.image.Image _iter0 : getImages().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }
    }

    public void writeVraCoreField(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getVraCore().isPresent()) {
            oprot.writeFieldBegin(FieldMetadata.VRA_CORE);
            getVraCore().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }
    }

    public final static Object EMPTY = new Object();

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore;

    private final com.google.common.base.Optional<Boolean> hidden;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore;
}
