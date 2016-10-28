package org.dressdiscover.api.models.object;

public final class Object implements org.thryft.Struct, org.thryft.waf.api.models.Model {
    public final static class Builder {
        public Builder() {
            costumeCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> absent();
            dublinCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> absent();
            hidden = com.google.common.base.Optional.<Boolean> absent();
            images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
            quantity = com.google.common.base.Optional.<Integer> absent();
            vraCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> absent();
        }

        public Builder(final Object other) {
            this.costumeCore = other.getCostumeCore();
            this.dublinCore = other.getDublinCore();
            this.hidden = other.getHidden();
            this.images = other.getImages();
            this.quantity = other.getQuantity();
            this.vraCore = other.getVraCore();
        }

        protected Object _build(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<Integer> quantity, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
            return new Object(costumeCore, dublinCore, hidden, images, quantity, vraCore, DefaultConstructionValidator.getInstance());
        }

        public Object build() {
            return _build(costumeCore, dublinCore, hidden, images, quantity, vraCore);
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

        public final com.google.common.base.Optional<Integer> getQuantity() {
            return quantity;
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
                    hidden = com.google.common.base.Optional.of(iprot.readBool());
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
                    try {
                        quantity = com.google.common.base.Optional.of(iprot.readI32());
                    } catch (final NumberFormatException e) {
                    }
                }
                if (__list.getSize() > 5) {
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
                            costumeCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "dublin_core": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            dublinCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject.readAsStruct(iprot));
                        }
                        break;
                    }
                    case "hidden": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            hidden = com.google.common.base.Optional.of(iprot.readBool());
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
                        break;
                    }
                    case "quantity": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            try {
                                quantity = com.google.common.base.Optional.of(iprot.readI32());
                            } catch (final NumberFormatException e) {
                            }
                        }
                        break;
                    }
                    case "vra_core": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                            vraCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VraCoreObject.readAsStruct(iprot));
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
            case QUANTITY: setQuantity((Integer)value); return this;
            case VRA_CORE: setVraCore((org.dressdiscover.api.vocabularies.vra_core.VraCoreObject)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) {
            this.costumeCore = DefaultConstructionValidator.getInstance().validateCostumeCore(costumeCore);
            return this;
        }

        public Builder setCostumeCore(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject costumeCore) {
            return setCostumeCore(com.google.common.base.Optional.fromNullable(costumeCore));
        }

        public Builder setDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) {
            this.dublinCore = DefaultConstructionValidator.getInstance().validateDublinCore(dublinCore);
            return this;
        }

        public Builder setDublinCore(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject dublinCore) {
            return setDublinCore(com.google.common.base.Optional.fromNullable(dublinCore));
        }

        public Builder setHidden(final com.google.common.base.Optional<Boolean> hidden) {
            this.hidden = DefaultConstructionValidator.getInstance().validateHidden(hidden);
            return this;
        }

        public Builder setHidden(@javax.annotation.Nullable final Boolean hidden) {
            return setHidden(com.google.common.base.Optional.fromNullable(hidden));
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
            if (other.getQuantity().isPresent()) {
                setQuantity(other.getQuantity());
            }
            if (other.getVraCore().isPresent()) {
                setVraCore(other.getVraCore());
            }

            return this;
        }

        public Builder setImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
            this.images = DefaultConstructionValidator.getInstance().validateImages(images);
            return this;
        }

        public Builder setImages(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> images) {
            return setImages(com.google.common.base.Optional.fromNullable(images));
        }

        public Builder setQuantity(final com.google.common.base.Optional<Integer> quantity) {
            this.quantity = DefaultConstructionValidator.getInstance().validateQuantity(quantity);
            return this;
        }

        public Builder setQuantity(@javax.annotation.Nullable final Integer quantity) {
            return setQuantity(com.google.common.base.Optional.fromNullable(quantity));
        }

        public Builder setVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
            this.vraCore = DefaultConstructionValidator.getInstance().validateVraCore(vraCore);
            return this;
        }

        public Builder setVraCore(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.vra_core.VraCoreObject vraCore) {
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
            case QUANTITY: return unsetQuantity();
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

        public Builder unsetQuantity() {
            this.quantity = com.google.common.base.Optional.<Integer> absent();
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
        private com.google.common.base.Optional<Integer> quantity;
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
        COSTUME_CORE("costumeCore", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject>() {}, false, 1, "costume_core", org.thryft.protocol.Type.STRUCT),
        DUBLIN_CORE("dublinCore", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject>() {}, false, 2, "dublin_core", org.thryft.protocol.Type.STRUCT),
        HIDDEN("hidden", new com.google.common.reflect.TypeToken<Boolean>() {}, false, 3, "hidden", org.thryft.protocol.Type.BOOL),
        IMAGES("images", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>>() {}, false, 4, "images", org.thryft.protocol.Type.LIST),
        QUANTITY("quantity", new com.google.common.reflect.TypeToken<Integer>() {}, false, 5, "quantity", org.thryft.protocol.Type.I32),
        VRA_CORE("vraCore", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject>() {}, false, 6, "vra_core", org.thryft.protocol.Type.STRUCT);

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
            case "costumeCore": return COSTUME_CORE;
            case "dublinCore": return DUBLIN_CORE;
            case "hidden": return HIDDEN;
            case "images": return IMAGES;
            case "quantity": return QUANTITY;
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
            case "quantity": return QUANTITY;
            case "vra_core": return VRA_CORE;
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
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> validateCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> validateDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) throws ExceptionT;

        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) throws ExceptionT;

        public com.google.common.base.Optional<Integer> validateQuantity(final com.google.common.base.Optional<Integer> quantity) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> validateVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) throws ExceptionT;
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
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> validateCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) throws RuntimeException {
            if (costumeCore == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: costumeCore is null");
            }
            if (!costumeCore.isPresent()) {
                return costumeCore;
            }
            return costumeCore;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> validateDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) throws RuntimeException {
            if (dublinCore == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: dublinCore is null");
            }
            if (!dublinCore.isPresent()) {
                return dublinCore;
            }
            return dublinCore;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws RuntimeException {
            if (!hidden.isPresent()) {
                return hidden;
            }
            if (!hidden.get()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.Object: hidden is not true");
            }
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) throws RuntimeException {
            if (images == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: images is null");
            }
            if (!images.isPresent()) {
                return images;
            }
            if (images.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.Object: images is less than min length 1");
            }
            return images;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateQuantity(final com.google.common.base.Optional<Integer> quantity) throws RuntimeException {
            if (!quantity.isPresent()) {
                return quantity;
            }
            if (quantity.get().intValue() < ((int)1)) {
                throw new IllegalArgumentException("org.dressdiscover.api.models.object.Object: quantity is less than min 1");
            }
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> validateVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) throws RuntimeException {
            if (vraCore == null) {
                throw new NullPointerException("org.dressdiscover.api.models.object.Object: vraCore is null");
            }
            if (!vraCore.isPresent()) {
                return vraCore;
            }
            return vraCore;
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
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> validateCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) {
            return costumeCore;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> validateDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) {
            return dublinCore;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
            return images;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateQuantity(final com.google.common.base.Optional<Integer> quantity) {
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> validateVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
            return vraCore;
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
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> validateCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) throws org.thryft.protocol.InputProtocolException {
            if (costumeCore == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COSTUME_CORE, "org.dressdiscover.api.models.object.Object: costumeCore is null");
            }
            if (!costumeCore.isPresent()) {
                return costumeCore;
            }
            return costumeCore;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> validateDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) throws org.thryft.protocol.InputProtocolException {
            if (dublinCore == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.DUBLIN_CORE, "org.dressdiscover.api.models.object.Object: dublinCore is null");
            }
            if (!dublinCore.isPresent()) {
                return dublinCore;
            }
            return dublinCore;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) throws org.thryft.protocol.InputProtocolException {
            if (!hidden.isPresent()) {
                return hidden;
            }
            if (!hidden.get()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.HIDDEN, "org.dressdiscover.api.models.object.Object: hidden is not true");
            }
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) throws org.thryft.protocol.InputProtocolException {
            if (images == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.IMAGES, "org.dressdiscover.api.models.object.Object: images is null");
            }
            if (!images.isPresent()) {
                return images;
            }
            if (images.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.IMAGES, "org.dressdiscover.api.models.object.Object: images is less than min length 1");
            }
            return images;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateQuantity(final com.google.common.base.Optional<Integer> quantity) throws org.thryft.protocol.InputProtocolException {
            if (!quantity.isPresent()) {
                return quantity;
            }
            if (quantity.get().intValue() < ((int)1)) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUANTITY, "org.dressdiscover.api.models.object.Object: quantity is less than min 1");
            }
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> validateVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) throws org.thryft.protocol.InputProtocolException {
            if (vraCore == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VRA_CORE, "org.dressdiscover.api.models.object.Object: vraCore is null");
            }
            if (!vraCore.isPresent()) {
                return vraCore;
            }
            return vraCore;
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
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> validateCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) {
            return costumeCore;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> validateDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) {
            return dublinCore;
        }

        @Override
        public com.google.common.base.Optional<Boolean> validateHidden(final com.google.common.base.Optional<Boolean> hidden) {
            return hidden;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> validateImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
            return images;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateQuantity(final com.google.common.base.Optional<Integer> quantity) {
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> validateVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
            return vraCore;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
    public Object() {
        costumeCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> absent();
        dublinCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> absent();
        hidden = com.google.common.base.Optional.<Boolean> absent();
        images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
        quantity = com.google.common.base.Optional.<Integer> absent();
        vraCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> absent();
    }

    /**
     * Copy constructor
     */
    public Object(final Object other) {
        this(other.getCostumeCore(), other.getDublinCore(), other.getHidden(), other.getImages(), other.getQuantity(), other.getVraCore(), NopConstructionValidator.getInstance());
    }

    protected Object(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<Integer> quantity, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore, ConstructionValidator validator) {
        this.costumeCore = validator.validateCostumeCore(costumeCore);
        this.dublinCore = validator.validateDublinCore(dublinCore);
        this.hidden = validator.validateHidden(hidden);
        this.images = validator.validateImages(images);
        this.quantity = validator.validateQuantity(quantity);
        this.vraCore = validator.validateVraCore(vraCore);
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

    public static Object create() {
        return new Object();
    }

    /**
     * Total Nullable factory method
     */
    public static Object create(final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject costumeCore, final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject dublinCore, final @javax.annotation.Nullable Boolean hidden, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> images, final @javax.annotation.Nullable Integer quantity, final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.vra_core.VraCoreObject vraCore) {
        return new Object(com.google.common.base.Optional.fromNullable(costumeCore), com.google.common.base.Optional.fromNullable(dublinCore), com.google.common.base.Optional.fromNullable(hidden), com.google.common.base.Optional.fromNullable(images), com.google.common.base.Optional.fromNullable(quantity), com.google.common.base.Optional.fromNullable(vraCore), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static Object create(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore, final com.google.common.base.Optional<Boolean> hidden, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images, final com.google.common.base.Optional<Integer> quantity, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
        return new Object(costumeCore, dublinCore, hidden, images, quantity, vraCore, DefaultConstructionValidator.getInstance());
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

        if (!(((getQuantity().isPresent() && other.getQuantity().isPresent()) ? (getQuantity().get().intValue() == other.getQuantity().get().intValue()) : (!getQuantity().isPresent() && !other.getQuantity().isPresent())))) {
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
        case QUANTITY: return getQuantity();
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

    public final com.google.common.base.Optional<Integer> getQuantity() {
        return quantity;
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
        if (getQuantity().isPresent()) {
            hashCode = 31 * hashCode + getQuantity().get().hashCode();
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
        com.google.common.base.Optional<Integer> quantity = com.google.common.base.Optional.<Integer> absent();
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
                hidden = com.google.common.base.Optional.of(iprot.readBool());
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
                try {
                    quantity = com.google.common.base.Optional.of(iprot.readI32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 5) {
                vraCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VraCoreObject.readAsStruct(iprot));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new Object(DefaultReadValidator.getInstance().validateCostumeCore(costumeCore), DefaultReadValidator.getInstance().validateDublinCore(dublinCore), DefaultReadValidator.getInstance().validateHidden(hidden), DefaultReadValidator.getInstance().validateImages(images), DefaultReadValidator.getInstance().validateQuantity(quantity), DefaultReadValidator.getInstance().validateVraCore(vraCore), NopConstructionValidator.getInstance());
    }

    public static Object readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static Object readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> absent();
        com.google.common.base.Optional<Boolean> hidden = com.google.common.base.Optional.<Boolean> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> absent();
        com.google.common.base.Optional<Integer> quantity = com.google.common.base.Optional.<Integer> absent();
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
                        costumeCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject.readAsStruct(iprot));
                    }
                    break;
                }
                case "dublin_core": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        dublinCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject.readAsStruct(iprot));
                    }
                    break;
                }
                case "hidden": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        hidden = com.google.common.base.Optional.of(iprot.readBool());
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
                    break;
                }
                case "quantity": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        try {
                            quantity = com.google.common.base.Optional.of(iprot.readI32());
                        } catch (final NumberFormatException e) {
                        }
                    }
                    break;
                }
                case "vra_core": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        vraCore = com.google.common.base.Optional.of(org.dressdiscover.api.vocabularies.vra_core.VraCoreObject.readAsStruct(iprot));
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
        return new Object(DefaultReadValidator.getInstance().validateCostumeCore(costumeCore), DefaultReadValidator.getInstance().validateDublinCore(dublinCore), DefaultReadValidator.getInstance().validateHidden(hidden), DefaultReadValidator.getInstance().validateImages(images), DefaultReadValidator.getInstance().validateQuantity(quantity), DefaultReadValidator.getInstance().validateVraCore(vraCore), NopConstructionValidator.getInstance());
    }

    public Object replaceCostumeCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore) {
        return new Object(DefaultConstructionValidator.getInstance().validateCostumeCore(costumeCore), this.dublinCore, this.hidden, this.images, this.quantity, this.vraCore, NopConstructionValidator.getInstance());
    }

    public Object replaceCostumeCore(final org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject costumeCore) {
        return replaceCostumeCore(com.google.common.base.Optional.fromNullable(costumeCore));
    }

    public Object replaceDublinCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore) {
        return new Object(this.costumeCore, DefaultConstructionValidator.getInstance().validateDublinCore(dublinCore), this.hidden, this.images, this.quantity, this.vraCore, NopConstructionValidator.getInstance());
    }

    public Object replaceDublinCore(final org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject dublinCore) {
        return replaceDublinCore(com.google.common.base.Optional.fromNullable(dublinCore));
    }

    public Object replaceHidden(final com.google.common.base.Optional<Boolean> hidden) {
        return new Object(this.costumeCore, this.dublinCore, DefaultConstructionValidator.getInstance().validateHidden(hidden), this.images, this.quantity, this.vraCore, NopConstructionValidator.getInstance());
    }

    public Object replaceHidden(final boolean hidden) {
        return replaceHidden(com.google.common.base.Optional.fromNullable(hidden));
    }

    public Object replaceImages(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images) {
        return new Object(this.costumeCore, this.dublinCore, this.hidden, DefaultConstructionValidator.getInstance().validateImages(images), this.quantity, this.vraCore, NopConstructionValidator.getInstance());
    }

    public Object replaceImages(final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image> images) {
        return replaceImages(com.google.common.base.Optional.fromNullable(images));
    }

    public Object replaceQuantity(final com.google.common.base.Optional<Integer> quantity) {
        return new Object(this.costumeCore, this.dublinCore, this.hidden, this.images, DefaultConstructionValidator.getInstance().validateQuantity(quantity), this.vraCore, NopConstructionValidator.getInstance());
    }

    public Object replaceQuantity(final int quantity) {
        return replaceQuantity(com.google.common.base.Optional.fromNullable(quantity));
    }

    public Object replaceVraCore(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore) {
        return new Object(this.costumeCore, this.dublinCore, this.hidden, this.images, this.quantity, DefaultConstructionValidator.getInstance().validateVraCore(vraCore), NopConstructionValidator.getInstance());
    }

    public Object replaceVraCore(final org.dressdiscover.api.vocabularies.vra_core.VraCoreObject vraCore) {
        return replaceVraCore(com.google.common.base.Optional.fromNullable(vraCore));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("costume_core", getCostumeCore().orNull()).add("dublin_core", getDublinCore().orNull()).add("hidden", getHidden().orNull()).add("images", getImages().orNull()).add("quantity", getQuantity().orNull()).add("vra_core", getVraCore().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 6);

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

        if (getQuantity().isPresent()) {
            oprot.writeI32(getQuantity().get());
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

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getCostumeCore().isPresent()) {
            oprot.writeFieldBegin("costume_core", org.thryft.protocol.Type.STRUCT, (short)1);
            getCostumeCore().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getDublinCore().isPresent()) {
            oprot.writeFieldBegin("dublin_core", org.thryft.protocol.Type.STRUCT, (short)2);
            getDublinCore().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        if (getHidden().isPresent()) {
            oprot.writeFieldBegin("hidden", org.thryft.protocol.Type.BOOL, (short)3);
            oprot.writeBool(getHidden().get());
            oprot.writeFieldEnd();
        }

        if (getImages().isPresent()) {
            oprot.writeFieldBegin("images", org.thryft.protocol.Type.LIST, (short)4);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getImages().get().size());
            for (final org.dressdiscover.api.models.image.Image _iter0 : getImages().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getQuantity().isPresent()) {
            oprot.writeFieldBegin("quantity", org.thryft.protocol.Type.I32, (short)5);
            oprot.writeI32(getQuantity().get());
            oprot.writeFieldEnd();
        }

        if (getVraCore().isPresent()) {
            oprot.writeFieldBegin("vra_core", org.thryft.protocol.Type.STRUCT, (short)6);
            getVraCore().get().writeAsStruct(oprot);
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject> costumeCore;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.dublin_core.DublinCoreObject> dublinCore;

    private final com.google.common.base.Optional<Boolean> hidden;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.models.image.Image>> images;

    private final com.google.common.base.Optional<Integer> quantity;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.vra_core.VraCoreObject> vraCore;
}
