package org.dressdiscover.api.vocabularies.costume_core;

public final class CostumeCoreObject implements org.thryft.Struct {
    public final static class Builder {
        public Builder() {
            closureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> absent();
            colorSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> absent();
            componentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> absent();
            condition = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> absent();
            gender = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent();
            quantity = com.google.common.base.Optional.<Integer> absent();
            structureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> absent();
            viewType = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> absent();
        }

        public Builder(final CostumeCoreObject other) {
            this.closureSets = other.getClosureSets();
            this.colorSets = other.getColorSets();
            this.componentSets = other.getComponentSets();
            this.condition = other.getCondition();
            this.gender = other.getGender();
            this.quantity = other.getQuantity();
            this.structureSets = other.getStructureSets();
            this.viewType = other.getViewType();
        }

        protected CostumeCoreObject _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender, final com.google.common.base.Optional<Integer> quantity, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType) {
            return new CostumeCoreObject(closureSets, colorSets, componentSets, condition, gender, quantity, structureSets, viewType, DefaultConstructionValidator.getInstance());
        }

        public CostumeCoreObject build() {
            return _build(closureSets, colorSets, componentSets, condition, gender, quantity, structureSets, viewType);
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> getClosureSets() {
            return closureSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> getColorSets() {
            return colorSets;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> getComponentSets() {
            return componentSets;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> getCondition() {
            return condition;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> getGender() {
            return gender;
        }

        public final com.google.common.base.Optional<Integer> getQuantity() {
            return quantity;
        }

        public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> getStructureSets() {
            return structureSets;
        }

        public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> getViewType() {
            return viewType;
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
                    try {
                        closureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CLOSURE_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 1) {
                    try {
                        colorSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.color.ColorSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 2) {
                    try {
                        componentSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COMPONENT_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 3) {
                    condition = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.condition.Condition.class));
                }
                if (__list.getSize() > 4) {
                    gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.class));
                }
                if (__list.getSize() > 5) {
                    try {
                        quantity = com.google.common.base.Optional.of(iprot.readI32());
                    } catch (final NumberFormatException e) {
                    }
                }
                if (__list.getSize() > 6) {
                    try {
                        structureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                try {
                                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                        sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet.readAsStruct(iprot));
                                    }
                                    iprot.readListEnd();
                                    return sequenceBuilder.build();
                                } catch (final org.thryft.protocol.InputProtocolException e) {
                                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                }
                            }
                        }).apply(iprot));
                    } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                         throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_SETS, e.getCause());
                    }
                }
                if (__list.getSize() > 7) {
                    viewType = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType.class));
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
                    case "closure_sets": {
                        if (!ifield.hasId() || ifield.getId() == 1) {
                            try {
                                closureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CLOSURE_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "color_sets": {
                        if (!ifield.hasId() || ifield.getId() == 2) {
                            try {
                                colorSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.color.ColorSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "component_sets": {
                        if (!ifield.hasId() || ifield.getId() == 3) {
                            try {
                                componentSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COMPONENT_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "condition": {
                        if (!ifield.hasId() || ifield.getId() == 4) {
                            condition = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.condition.Condition.class));
                        }
                        break;
                    }
                    case "gender": {
                        if (!ifield.hasId() || ifield.getId() == 5) {
                            gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.class));
                        }
                        break;
                    }
                    case "quantity": {
                        if (!ifield.hasId() || ifield.getId() == 8) {
                            try {
                                quantity = com.google.common.base.Optional.of(iprot.readI32());
                            } catch (final NumberFormatException e) {
                            }
                        }
                        break;
                    }
                    case "structure_sets": {
                        if (!ifield.hasId() || ifield.getId() == 6) {
                            try {
                                structureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                            final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                                sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet.readAsStruct(iprot));
                                            }
                                            iprot.readListEnd();
                                            return sequenceBuilder.build();
                                        } catch (final org.thryft.protocol.InputProtocolException e) {
                                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                        }
                                    }
                                }).apply(iprot));
                            } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                                 throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_SETS, e.getCause());
                            }
                        }
                        break;
                    }
                    case "view_type": {
                        if (!ifield.hasId() || ifield.getId() == 7) {
                            viewType = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType.class));
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
            case CLOSURE_SETS: setClosureSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>)value); return this;
            case COLOR_SETS: setColorSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>)value); return this;
            case COMPONENT_SETS: setComponentSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>)value); return this;
            case CONDITION: setCondition((org.dressdiscover.api.vocabularies.costume_core.condition.Condition)value); return this;
            case GENDER: setGender((org.dressdiscover.api.vocabularies.costume_core.gender.Gender)value); return this;
            case QUANTITY: setQuantity((Integer)value); return this;
            case STRUCTURE_SETS: setStructureSets((com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>)value); return this;
            case VIEW_TYPE: setViewType((org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType)value); return this;
            default:
                throw new IllegalStateException();
            }
        }

        public Builder setClosureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets) {
            this.closureSets = DefaultConstructionValidator.getInstance().validateClosureSets(closureSets);
            return this;
        }

        public Builder setClosureSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> closureSets) {
            return setClosureSets(com.google.common.base.Optional.fromNullable(closureSets));
        }

        public Builder setColorSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets) {
            this.colorSets = DefaultConstructionValidator.getInstance().validateColorSets(colorSets);
            return this;
        }

        public Builder setColorSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> colorSets) {
            return setColorSets(com.google.common.base.Optional.fromNullable(colorSets));
        }

        public Builder setComponentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets) {
            this.componentSets = DefaultConstructionValidator.getInstance().validateComponentSets(componentSets);
            return this;
        }

        public Builder setComponentSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> componentSets) {
            return setComponentSets(com.google.common.base.Optional.fromNullable(componentSets));
        }

        public Builder setCondition(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition) {
            this.condition = DefaultConstructionValidator.getInstance().validateCondition(condition);
            return this;
        }

        public Builder setCondition(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.costume_core.condition.Condition condition) {
            return setCondition(com.google.common.base.Optional.fromNullable(condition));
        }

        public Builder setGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) {
            this.gender = DefaultConstructionValidator.getInstance().validateGender(gender);
            return this;
        }

        public Builder setGender(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.costume_core.gender.Gender gender) {
            return setGender(com.google.common.base.Optional.fromNullable(gender));
        }

        public Builder setIfPresent(final CostumeCoreObject other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            if (other.getClosureSets().isPresent()) {
                setClosureSets(other.getClosureSets());
            }
            if (other.getColorSets().isPresent()) {
                setColorSets(other.getColorSets());
            }
            if (other.getComponentSets().isPresent()) {
                setComponentSets(other.getComponentSets());
            }
            if (other.getCondition().isPresent()) {
                setCondition(other.getCondition());
            }
            if (other.getGender().isPresent()) {
                setGender(other.getGender());
            }
            if (other.getQuantity().isPresent()) {
                setQuantity(other.getQuantity());
            }
            if (other.getStructureSets().isPresent()) {
                setStructureSets(other.getStructureSets());
            }
            if (other.getViewType().isPresent()) {
                setViewType(other.getViewType());
            }

            return this;
        }

        public Builder setQuantity(final com.google.common.base.Optional<Integer> quantity) {
            this.quantity = DefaultConstructionValidator.getInstance().validateQuantity(quantity);
            return this;
        }

        public Builder setQuantity(@javax.annotation.Nullable final Integer quantity) {
            return setQuantity(com.google.common.base.Optional.fromNullable(quantity));
        }

        public Builder setStructureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets) {
            this.structureSets = DefaultConstructionValidator.getInstance().validateStructureSets(structureSets);
            return this;
        }

        public Builder setStructureSets(@javax.annotation.Nullable final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structureSets) {
            return setStructureSets(com.google.common.base.Optional.fromNullable(structureSets));
        }

        public Builder setViewType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType) {
            this.viewType = DefaultConstructionValidator.getInstance().validateViewType(viewType);
            return this;
        }

        public Builder setViewType(@javax.annotation.Nullable final org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType viewType) {
            return setViewType(com.google.common.base.Optional.fromNullable(viewType));
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
            case CLOSURE_SETS: return unsetClosureSets();
            case COLOR_SETS: return unsetColorSets();
            case COMPONENT_SETS: return unsetComponentSets();
            case CONDITION: return unsetCondition();
            case GENDER: return unsetGender();
            case QUANTITY: return unsetQuantity();
            case STRUCTURE_SETS: return unsetStructureSets();
            case VIEW_TYPE: return unsetViewType();
            default:
                throw new IllegalStateException();
            }
        }

        public Builder unsetClosureSets() {
            this.closureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> absent();
            return this;
        }

        public Builder unsetColorSets() {
            this.colorSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> absent();
            return this;
        }

        public Builder unsetComponentSets() {
            this.componentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> absent();
            return this;
        }

        public Builder unsetCondition() {
            this.condition = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> absent();
            return this;
        }

        public Builder unsetGender() {
            this.gender = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent();
            return this;
        }

        public Builder unsetQuantity() {
            this.quantity = com.google.common.base.Optional.<Integer> absent();
            return this;
        }

        public Builder unsetStructureSets() {
            this.structureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> absent();
            return this;
        }

        public Builder unsetViewType() {
            this.viewType = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> absent();
            return this;
        }

        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender;
        private com.google.common.base.Optional<Integer> quantity;
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets;
        private com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType;
    }

    public final static class Factory implements org.thryft.CompoundType.Factory<CostumeCoreObject> {
        @Override
        public CostumeCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
            return CostumeCoreObject.readAs(iprot, type);
        }

        @Override
        public CostumeCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return CostumeCoreObject.readAs(iprot, type, unknownFieldCallback);
        }

        @Override
        public CostumeCoreObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return CostumeCoreObject.readAsList(iprot);
        }

        @Override
        public CostumeCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            return CostumeCoreObject.readAsStruct(iprot);
        }

        @Override
        public CostumeCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot,
                final com.google.common.base.Optional<org.thryft.CompoundType.UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
            return CostumeCoreObject.readAsStruct(iprot, unknownFieldCallback);
        }
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        CLOSURE_SETS("closureSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>>() {}, false, 1, "closure_sets", org.thryft.protocol.Type.LIST),
        COLOR_SETS("colorSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>>() {}, false, 2, "color_sets", org.thryft.protocol.Type.LIST),
        COMPONENT_SETS("componentSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>>() {}, false, 3, "component_sets", org.thryft.protocol.Type.LIST),
        CONDITION("condition", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.costume_core.condition.Condition>() {}, false, 4, "condition", org.thryft.protocol.Type.STRING),
        GENDER("gender", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.costume_core.gender.Gender>() {}, false, 5, "gender", org.thryft.protocol.Type.STRING),
        QUANTITY("quantity", new com.google.common.reflect.TypeToken<Integer>() {}, false, 8, "quantity", org.thryft.protocol.Type.I32),
        STRUCTURE_SETS("structureSets", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>>() {}, false, 6, "structure_sets", org.thryft.protocol.Type.LIST),
        VIEW_TYPE("viewType", new com.google.common.reflect.TypeToken<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType>() {}, false, 7, "view_type", org.thryft.protocol.Type.STRING);

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
            case "closureSets": return CLOSURE_SETS;
            case "colorSets": return COLOR_SETS;
            case "componentSets": return COMPONENT_SETS;
            case "condition": return CONDITION;
            case "gender": return GENDER;
            case "quantity": return QUANTITY;
            case "structureSets": return STRUCTURE_SETS;
            case "viewType": return VIEW_TYPE;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "closure_sets": return CLOSURE_SETS;
            case "color_sets": return COLOR_SETS;
            case "component_sets": return COMPONENT_SETS;
            case "condition": return CONDITION;
            case "gender": return GENDER;
            case "quantity": return QUANTITY;
            case "structure_sets": return STRUCTURE_SETS;
            case "view_type": return VIEW_TYPE;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> validateClosureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> validateColorSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> validateComponentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> validateCondition(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) throws ExceptionT;

        public com.google.common.base.Optional<Integer> validateQuantity(final com.google.common.base.Optional<Integer> quantity) throws ExceptionT;

        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> validateStructureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets) throws ExceptionT;

        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> validateViewType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType) throws ExceptionT;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> validateClosureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets) throws RuntimeException {
            if (closureSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: closureSets is null");
            }
            if (!closureSets.isPresent()) {
                return closureSets;
            }
            if (closureSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: closureSets is less than min length 1");
            }
            return closureSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> validateColorSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets) throws RuntimeException {
            if (colorSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: colorSets is null");
            }
            if (!colorSets.isPresent()) {
                return colorSets;
            }
            if (colorSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: colorSets is less than min length 1");
            }
            return colorSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> validateComponentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets) throws RuntimeException {
            if (componentSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: componentSets is null");
            }
            if (!componentSets.isPresent()) {
                return componentSets;
            }
            if (componentSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: componentSets is less than min length 1");
            }
            return componentSets;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> validateCondition(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition) throws RuntimeException {
            if (condition == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: condition is null");
            }
            if (!condition.isPresent()) {
                return condition;
            }
            return condition;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) throws RuntimeException {
            if (gender == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: gender is null");
            }
            if (!gender.isPresent()) {
                return gender;
            }
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateQuantity(final com.google.common.base.Optional<Integer> quantity) throws RuntimeException {
            if (!quantity.isPresent()) {
                return quantity;
            }
            if (quantity.get().intValue() < ((int)1)) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: quantity is less than min 1");
            }
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> validateStructureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets) throws RuntimeException {
            if (structureSets == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: structureSets is null");
            }
            if (!structureSets.isPresent()) {
                return structureSets;
            }
            if (structureSets.get().isEmpty()) {
                throw new IllegalArgumentException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: structureSets is less than min length 1");
            }
            return structureSets;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> validateViewType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType) throws RuntimeException {
            if (viewType == null) {
                throw new NullPointerException("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: viewType is null");
            }
            if (!viewType.isPresent()) {
                return viewType;
            }
            return viewType;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> validateClosureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets) {
            return closureSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> validateColorSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets) {
            return colorSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> validateComponentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets) {
            return componentSets;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> validateCondition(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition) {
            return condition;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) {
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateQuantity(final com.google.common.base.Optional<Integer> quantity) {
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> validateStructureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets) {
            return structureSets;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> validateViewType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType) {
            return viewType;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> validateClosureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets) throws org.thryft.protocol.InputProtocolException {
            if (closureSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CLOSURE_SETS, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: closureSets is null");
            }
            if (!closureSets.isPresent()) {
                return closureSets;
            }
            if (closureSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CLOSURE_SETS, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: closureSets is less than min length 1");
            }
            return closureSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> validateColorSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets) throws org.thryft.protocol.InputProtocolException {
            if (colorSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COLOR_SETS, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: colorSets is null");
            }
            if (!colorSets.isPresent()) {
                return colorSets;
            }
            if (colorSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_SETS, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: colorSets is less than min length 1");
            }
            return colorSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> validateComponentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets) throws org.thryft.protocol.InputProtocolException {
            if (componentSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.COMPONENT_SETS, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: componentSets is null");
            }
            if (!componentSets.isPresent()) {
                return componentSets;
            }
            if (componentSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COMPONENT_SETS, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: componentSets is less than min length 1");
            }
            return componentSets;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> validateCondition(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition) throws org.thryft.protocol.InputProtocolException {
            if (condition == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.CONDITION, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: condition is null");
            }
            if (!condition.isPresent()) {
                return condition;
            }
            return condition;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) throws org.thryft.protocol.InputProtocolException {
            if (gender == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.GENDER, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: gender is null");
            }
            if (!gender.isPresent()) {
                return gender;
            }
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateQuantity(final com.google.common.base.Optional<Integer> quantity) throws org.thryft.protocol.InputProtocolException {
            if (!quantity.isPresent()) {
                return quantity;
            }
            if (quantity.get().intValue() < ((int)1)) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.QUANTITY, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: quantity is less than min 1");
            }
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> validateStructureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets) throws org.thryft.protocol.InputProtocolException {
            if (structureSets == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.STRUCTURE_SETS, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: structureSets is null");
            }
            if (!structureSets.isPresent()) {
                return structureSets;
            }
            if (structureSets.get().isEmpty()) {
                throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_SETS, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: structureSets is less than min length 1");
            }
            return structureSets;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> validateViewType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType) throws org.thryft.protocol.InputProtocolException {
            if (viewType == null) {
                throw new org.thryft.protocol.MissingFieldInputProtocolException(FieldMetadata.VIEW_TYPE, "org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject: viewType is null");
            }
            if (!viewType.isPresent()) {
                return viewType;
            }
            return viewType;
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
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> validateClosureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets) {
            return closureSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> validateColorSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets) {
            return colorSets;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> validateComponentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets) {
            return componentSets;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> validateCondition(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition) {
            return condition;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> validateGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) {
            return gender;
        }

        @Override
        public com.google.common.base.Optional<Integer> validateQuantity(final com.google.common.base.Optional<Integer> quantity) {
            return quantity;
        }

        @Override
        public com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> validateStructureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets) {
            return structureSets;
        }

        @Override
        public com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> validateViewType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType) {
            return viewType;
        }

        private final static NopReadValidator instance = new NopReadValidator();
    }

    /**
     * Default constructor
     */
    public CostumeCoreObject() {
        closureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> absent();
        colorSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> absent();
        componentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> absent();
        condition = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> absent();
        gender = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent();
        quantity = com.google.common.base.Optional.<Integer> absent();
        structureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> absent();
        viewType = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> absent();
    }

    /**
     * Copy constructor
     */
    public CostumeCoreObject(final CostumeCoreObject other) {
        this(other.getClosureSets(), other.getColorSets(), other.getComponentSets(), other.getCondition(), other.getGender(), other.getQuantity(), other.getStructureSets(), other.getViewType(), NopConstructionValidator.getInstance());
    }

    protected CostumeCoreObject(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender, final com.google.common.base.Optional<Integer> quantity, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType, ConstructionValidator validator) {
        this.closureSets = validator.validateClosureSets(closureSets);
        this.colorSets = validator.validateColorSets(colorSets);
        this.componentSets = validator.validateComponentSets(componentSets);
        this.condition = validator.validateCondition(condition);
        this.gender = validator.validateGender(gender);
        this.quantity = validator.validateQuantity(quantity);
        this.structureSets = validator.validateStructureSets(structureSets);
        this.viewType = validator.validateViewType(viewType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final CostumeCoreObject other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<CostumeCoreObject> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    public static CostumeCoreObject create() {
        return new CostumeCoreObject();
    }

    /**
     * Total Nullable factory method
     */
    public static CostumeCoreObject create(final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> closureSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> colorSets, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> componentSets, final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.condition.Condition condition, final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.gender.Gender gender, final @javax.annotation.Nullable Integer quantity, final @javax.annotation.Nullable com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structureSets, final @javax.annotation.Nullable org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType viewType) {
        return new CostumeCoreObject(com.google.common.base.Optional.fromNullable(closureSets), com.google.common.base.Optional.fromNullable(colorSets), com.google.common.base.Optional.fromNullable(componentSets), com.google.common.base.Optional.fromNullable(condition), com.google.common.base.Optional.fromNullable(gender), com.google.common.base.Optional.fromNullable(quantity), com.google.common.base.Optional.fromNullable(structureSets), com.google.common.base.Optional.fromNullable(viewType), DefaultConstructionValidator.getInstance());
    }

    /**
     * Optional factory method
     */
    public static CostumeCoreObject create(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender, final com.google.common.base.Optional<Integer> quantity, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets, final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType) {
        return new CostumeCoreObject(closureSets, colorSets, componentSets, condition, gender, quantity, structureSets, viewType, DefaultConstructionValidator.getInstance());
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (!(otherObject instanceof CostumeCoreObject)) {
            return false;
        }

        final CostumeCoreObject other = (CostumeCoreObject)otherObject;

        if (!(((getClosureSets().isPresent() && other.getClosureSets().isPresent()) ? (getClosureSets().get().equals(other.getClosureSets().get())) : (!getClosureSets().isPresent() && !other.getClosureSets().isPresent())))) {
            return false;
        }

        if (!(((getColorSets().isPresent() && other.getColorSets().isPresent()) ? (getColorSets().get().equals(other.getColorSets().get())) : (!getColorSets().isPresent() && !other.getColorSets().isPresent())))) {
            return false;
        }

        if (!(((getComponentSets().isPresent() && other.getComponentSets().isPresent()) ? (getComponentSets().get().equals(other.getComponentSets().get())) : (!getComponentSets().isPresent() && !other.getComponentSets().isPresent())))) {
            return false;
        }

        if (!(((getCondition().isPresent() && other.getCondition().isPresent()) ? (getCondition().get().equals(other.getCondition().get())) : (!getCondition().isPresent() && !other.getCondition().isPresent())))) {
            return false;
        }

        if (!(((getGender().isPresent() && other.getGender().isPresent()) ? (getGender().get().equals(other.getGender().get())) : (!getGender().isPresent() && !other.getGender().isPresent())))) {
            return false;
        }

        if (!(((getQuantity().isPresent() && other.getQuantity().isPresent()) ? (getQuantity().get().intValue() == other.getQuantity().get().intValue()) : (!getQuantity().isPresent() && !other.getQuantity().isPresent())))) {
            return false;
        }

        if (!(((getStructureSets().isPresent() && other.getStructureSets().isPresent()) ? (getStructureSets().get().equals(other.getStructureSets().get())) : (!getStructureSets().isPresent() && !other.getStructureSets().isPresent())))) {
            return false;
        }

        if (!(((getViewType().isPresent() && other.getViewType().isPresent()) ? (getViewType().get().equals(other.getViewType().get())) : (!getViewType().isPresent() && !other.getViewType().isPresent())))) {
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
        case CLOSURE_SETS: return getClosureSets();
        case COLOR_SETS: return getColorSets();
        case COMPONENT_SETS: return getComponentSets();
        case CONDITION: return getCondition();
        case GENDER: return getGender();
        case QUANTITY: return getQuantity();
        case STRUCTURE_SETS: return getStructureSets();
        case VIEW_TYPE: return getViewType();
        default:
            throw new IllegalStateException();
        }
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> getClosureSets() {
        return closureSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> getColorSets() {
        return colorSets;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> getComponentSets() {
        return componentSets;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> getCondition() {
        return condition;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> getGender() {
        return gender;
    }

    public final com.google.common.base.Optional<Integer> getQuantity() {
        return quantity;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> getStructureSets() {
        return structureSets;
    }

    public final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> getViewType() {
        return viewType;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getClosureSets().isPresent()) {
            hashCode = 31 * hashCode + getClosureSets().get().hashCode();
        }
        if (getColorSets().isPresent()) {
            hashCode = 31 * hashCode + getColorSets().get().hashCode();
        }
        if (getComponentSets().isPresent()) {
            hashCode = 31 * hashCode + getComponentSets().get().hashCode();
        }
        if (getCondition().isPresent()) {
            hashCode = 31 * hashCode + getCondition().get().ordinal();
        }
        if (getGender().isPresent()) {
            hashCode = 31 * hashCode + getGender().get().ordinal();
        }
        if (getQuantity().isPresent()) {
            hashCode = 31 * hashCode + getQuantity().get().hashCode();
        }
        if (getStructureSets().isPresent()) {
            hashCode = 31 * hashCode + getStructureSets().get().hashCode();
        }
        if (getViewType().isPresent()) {
            hashCode = 31 * hashCode + getViewType().get().ordinal();
        }
        return hashCode;
    }

    public static CostumeCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        return readAs(iprot, type, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static CostumeCoreObject readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot, unknownFieldCallback);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static CostumeCoreObject readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent();
        com.google.common.base.Optional<Integer> quantity = com.google.common.base.Optional.<Integer> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> absent();

        try {
            final org.thryft.protocol.ListBegin __list = iprot.readListBegin();
            if (__list.getSize() > 0) {
                try {
                    closureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CLOSURE_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 1) {
                try {
                    colorSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.color.ColorSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 2) {
                try {
                    componentSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COMPONENT_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 3) {
                condition = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.condition.Condition.class));
            }
            if (__list.getSize() > 4) {
                gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.class));
            }
            if (__list.getSize() > 5) {
                try {
                    quantity = com.google.common.base.Optional.of(iprot.readI32());
                } catch (final NumberFormatException e) {
                }
            }
            if (__list.getSize() > 6) {
                try {
                    structureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequenceBuilder.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot));
                } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                     throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_SETS, e.getCause());
                }
            }
            if (__list.getSize() > 7) {
                viewType = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType.class));
            }
            iprot.readListEnd();
        } catch (final RuntimeException e) {
            throw new IllegalStateException(e);
        }
        return new CostumeCoreObject(DefaultReadValidator.getInstance().validateClosureSets(closureSets), DefaultReadValidator.getInstance().validateColorSets(colorSets), DefaultReadValidator.getInstance().validateComponentSets(componentSets), DefaultReadValidator.getInstance().validateCondition(condition), DefaultReadValidator.getInstance().validateGender(gender), DefaultReadValidator.getInstance().validateQuantity(quantity), DefaultReadValidator.getInstance().validateStructureSets(structureSets), DefaultReadValidator.getInstance().validateViewType(viewType), NopConstructionValidator.getInstance());
    }

    public static CostumeCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        return readAsStruct(iprot, com.google.common.base.Optional.<UnknownFieldCallback> absent());
    }

    public static CostumeCoreObject readAsStruct(final org.thryft.protocol.InputProtocol iprot, final com.google.common.base.Optional<UnknownFieldCallback> unknownFieldCallback) throws org.thryft.protocol.InputProtocolException {
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> absent();
        com.google.common.base.Optional<Integer> quantity = com.google.common.base.Optional.<Integer> absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets = com.google.common.base.Optional.<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> absent();
        com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType = com.google.common.base.Optional.<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> absent();

        try {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "closure_sets": {
                    if (!ifield.hasId() || ifield.getId() == 1) {
                        try {
                            closureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.CLOSURE_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "color_sets": {
                    if (!ifield.hasId() || ifield.getId() == 2) {
                        try {
                            colorSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.color.ColorSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COLOR_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "component_sets": {
                    if (!ifield.hasId() || ifield.getId() == 3) {
                        try {
                            componentSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.COMPONENT_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "condition": {
                    if (!ifield.hasId() || ifield.getId() == 4) {
                        condition = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.condition.Condition.class));
                    }
                    break;
                }
                case "gender": {
                    if (!ifield.hasId() || ifield.getId() == 5) {
                        gender = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.gender.Gender.class));
                    }
                    break;
                }
                case "quantity": {
                    if (!ifield.hasId() || ifield.getId() == 8) {
                        try {
                            quantity = com.google.common.base.Optional.of(iprot.readI32());
                        } catch (final NumberFormatException e) {
                        }
                    }
                    break;
                }
                case "structure_sets": {
                    if (!ifield.hasId() || ifield.getId() == 6) {
                        try {
                            structureSets = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> apply(final org.thryft.protocol.InputProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                        final com.google.common.collect.ImmutableList.Builder<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> sequenceBuilder = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                            sequenceBuilder.add(org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet.readAsStruct(iprot));
                                        }
                                        iprot.readListEnd();
                                        return sequenceBuilder.build();
                                    } catch (final org.thryft.protocol.InputProtocolException e) {
                                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                                    }
                                }
                            }).apply(iprot));
                        } catch (final org.thryft.protocol.UncheckedInputProtocolException e) {
                             throw new org.thryft.protocol.InvalidFieldInputProtocolException(FieldMetadata.STRUCTURE_SETS, e.getCause());
                        }
                    }
                    break;
                }
                case "view_type": {
                    if (!ifield.hasId() || ifield.getId() == 7) {
                        viewType = com.google.common.base.Optional.of(iprot.readEnum(org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType.class));
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
        return new CostumeCoreObject(DefaultReadValidator.getInstance().validateClosureSets(closureSets), DefaultReadValidator.getInstance().validateColorSets(colorSets), DefaultReadValidator.getInstance().validateComponentSets(componentSets), DefaultReadValidator.getInstance().validateCondition(condition), DefaultReadValidator.getInstance().validateGender(gender), DefaultReadValidator.getInstance().validateQuantity(quantity), DefaultReadValidator.getInstance().validateStructureSets(structureSets), DefaultReadValidator.getInstance().validateViewType(viewType), NopConstructionValidator.getInstance());
    }

    public CostumeCoreObject replaceClosureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets) {
        return new CostumeCoreObject(DefaultConstructionValidator.getInstance().validateClosureSets(closureSets), this.colorSets, this.componentSets, this.condition, this.gender, this.quantity, this.structureSets, this.viewType, NopConstructionValidator.getInstance());
    }

    public CostumeCoreObject replaceClosureSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet> closureSets) {
        return replaceClosureSets(com.google.common.base.Optional.fromNullable(closureSets));
    }

    public CostumeCoreObject replaceColorSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets) {
        return new CostumeCoreObject(this.closureSets, DefaultConstructionValidator.getInstance().validateColorSets(colorSets), this.componentSets, this.condition, this.gender, this.quantity, this.structureSets, this.viewType, NopConstructionValidator.getInstance());
    }

    public CostumeCoreObject replaceColorSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet> colorSets) {
        return replaceColorSets(com.google.common.base.Optional.fromNullable(colorSets));
    }

    public CostumeCoreObject replaceComponentSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets) {
        return new CostumeCoreObject(this.closureSets, this.colorSets, DefaultConstructionValidator.getInstance().validateComponentSets(componentSets), this.condition, this.gender, this.quantity, this.structureSets, this.viewType, NopConstructionValidator.getInstance());
    }

    public CostumeCoreObject replaceComponentSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet> componentSets) {
        return replaceComponentSets(com.google.common.base.Optional.fromNullable(componentSets));
    }

    public CostumeCoreObject replaceCondition(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition) {
        return new CostumeCoreObject(this.closureSets, this.colorSets, this.componentSets, DefaultConstructionValidator.getInstance().validateCondition(condition), this.gender, this.quantity, this.structureSets, this.viewType, NopConstructionValidator.getInstance());
    }

    public CostumeCoreObject replaceCondition(final org.dressdiscover.api.vocabularies.costume_core.condition.Condition condition) {
        return replaceCondition(com.google.common.base.Optional.fromNullable(condition));
    }

    public CostumeCoreObject replaceGender(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender) {
        return new CostumeCoreObject(this.closureSets, this.colorSets, this.componentSets, this.condition, DefaultConstructionValidator.getInstance().validateGender(gender), this.quantity, this.structureSets, this.viewType, NopConstructionValidator.getInstance());
    }

    public CostumeCoreObject replaceGender(final org.dressdiscover.api.vocabularies.costume_core.gender.Gender gender) {
        return replaceGender(com.google.common.base.Optional.fromNullable(gender));
    }

    public CostumeCoreObject replaceQuantity(final com.google.common.base.Optional<Integer> quantity) {
        return new CostumeCoreObject(this.closureSets, this.colorSets, this.componentSets, this.condition, this.gender, DefaultConstructionValidator.getInstance().validateQuantity(quantity), this.structureSets, this.viewType, NopConstructionValidator.getInstance());
    }

    public CostumeCoreObject replaceQuantity(final int quantity) {
        return replaceQuantity(com.google.common.base.Optional.fromNullable(quantity));
    }

    public CostumeCoreObject replaceStructureSets(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets) {
        return new CostumeCoreObject(this.closureSets, this.colorSets, this.componentSets, this.condition, this.gender, this.quantity, DefaultConstructionValidator.getInstance().validateStructureSets(structureSets), this.viewType, NopConstructionValidator.getInstance());
    }

    public CostumeCoreObject replaceStructureSets(final com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet> structureSets) {
        return replaceStructureSets(com.google.common.base.Optional.fromNullable(structureSets));
    }

    public CostumeCoreObject replaceViewType(final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType) {
        return new CostumeCoreObject(this.closureSets, this.colorSets, this.componentSets, this.condition, this.gender, this.quantity, this.structureSets, DefaultConstructionValidator.getInstance().validateViewType(viewType), NopConstructionValidator.getInstance());
    }

    public CostumeCoreObject replaceViewType(final org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType viewType) {
        return replaceViewType(com.google.common.base.Optional.fromNullable(viewType));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("closure_sets", getClosureSets().orNull()).add("color_sets", getColorSets().orNull()).add("component_sets", getComponentSets().orNull()).add("condition", getCondition().orNull()).add("gender", getGender().orNull()).add("quantity", getQuantity().orNull()).add("structure_sets", getStructureSets().orNull()).add("view_type", getViewType().orNull()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 8);

        if (getClosureSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getClosureSets().get().size());
            for (final org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet _iter0 : getClosureSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getColorSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getColorSets().get().size());
            for (final org.dressdiscover.api.vocabularies.costume_core.color.ColorSet _iter0 : getColorSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getComponentSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getComponentSets().get().size());
            for (final org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet _iter0 : getComponentSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getCondition().isPresent()) {
            oprot.writeEnum(getCondition().get());
        } else {
            oprot.writeNull();
        }

        if (getGender().isPresent()) {
            oprot.writeEnum(getGender().get());
        } else {
            oprot.writeNull();
        }

        if (getQuantity().isPresent()) {
            oprot.writeI32(getQuantity().get());
        } else {
            oprot.writeNull();
        }

        if (getStructureSets().isPresent()) {
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getStructureSets().get().size());
            for (final org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet _iter0 : getStructureSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
        } else {
            oprot.writeNull();
        }

        if (getViewType().isPresent()) {
            oprot.writeEnum(getViewType().get());
        } else {
            oprot.writeNull();
        }

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("org.dressdiscover.api.vocabularies.costume_core.CostumeCoreObject");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        if (getClosureSets().isPresent()) {
            oprot.writeFieldBegin("closure_sets", org.thryft.protocol.Type.LIST, (short)1);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getClosureSets().get().size());
            for (final org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet _iter0 : getClosureSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getColorSets().isPresent()) {
            oprot.writeFieldBegin("color_sets", org.thryft.protocol.Type.LIST, (short)2);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getColorSets().get().size());
            for (final org.dressdiscover.api.vocabularies.costume_core.color.ColorSet _iter0 : getColorSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getComponentSets().isPresent()) {
            oprot.writeFieldBegin("component_sets", org.thryft.protocol.Type.LIST, (short)3);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getComponentSets().get().size());
            for (final org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet _iter0 : getComponentSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getCondition().isPresent()) {
            oprot.writeFieldBegin("condition", org.thryft.protocol.Type.STRING, (short)4);
            oprot.writeEnum(getCondition().get());
            oprot.writeFieldEnd();
        }

        if (getGender().isPresent()) {
            oprot.writeFieldBegin("gender", org.thryft.protocol.Type.STRING, (short)5);
            oprot.writeEnum(getGender().get());
            oprot.writeFieldEnd();
        }

        if (getQuantity().isPresent()) {
            oprot.writeFieldBegin("quantity", org.thryft.protocol.Type.I32, (short)8);
            oprot.writeI32(getQuantity().get());
            oprot.writeFieldEnd();
        }

        if (getStructureSets().isPresent()) {
            oprot.writeFieldBegin("structure_sets", org.thryft.protocol.Type.LIST, (short)6);
            oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getStructureSets().get().size());
            for (final org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet _iter0 : getStructureSets().get()) {
                _iter0.writeAsStruct(oprot);
            }
            oprot.writeListEnd();
            oprot.writeFieldEnd();
        }

        if (getViewType().isPresent()) {
            oprot.writeFieldBegin("view_type", org.thryft.protocol.Type.STRING, (short)7);
            oprot.writeEnum(getViewType().get());
            oprot.writeFieldEnd();
        }

        oprot.writeFieldStop();
    }

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.closure.ClosureSet>> closureSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.color.ColorSet>> colorSets;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.component.ComponentSet>> componentSets;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.condition.Condition> condition;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.gender.Gender> gender;

    private final com.google.common.base.Optional<Integer> quantity;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.dressdiscover.api.vocabularies.costume_core.structure.StructureSet>> structureSets;

    private final com.google.common.base.Optional<org.dressdiscover.api.vocabularies.costume_core.view_type.ViewType> viewType;
}
