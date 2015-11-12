package net.lab1318.costume.api.services.object;

public class GetObjectsResult implements org.thryft.Struct {
    public static class Builder {
        public Builder() {
            objects = null;
            totalHits = com.google.common.primitives.UnsignedInteger.ZERO;
        }

        public Builder(final GetObjectsResult other) {
            this.objects = other.getObjects();
            this.totalHits = other.getTotalHits();
        }

        protected GetObjectsResult _build(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects, final com.google.common.primitives.UnsignedInteger totalHits) {
            return new GetObjectsResult(objects, totalHits);
        }

        public GetObjectsResult build() {
            return _build(com.google.common.base.Preconditions.checkNotNull(objects, "net.lab1318.costume.api.services.object.GetObjectsResult: missing objects"), com.google.common.base.Preconditions.checkNotNull(totalHits, "net.lab1318.costume.api.services.object.GetObjectsResult: missing totalHits"));
        }

        public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjects() {
            return objects;
        }

        public final com.google.common.primitives.UnsignedInteger getTotalHits() {
            return totalHits;
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
            objects = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                @Override
                public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                    try {
                        final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                        final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                        for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                            sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                        }
                        iprot.readListEnd();
                        return sequence.build();
                    } catch (final org.thryft.protocol.InputProtocolException e) {
                        throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                    }
                }
            }).apply(iprot);
            totalHits = iprot.readU32();
            iprot.readListEnd();
            return this;
        }

        public Builder readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
            iprot.readStructBegin();
            while (true) {
                final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
                if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                    break;
                }
                switch (ifield.getName()) {
                case "objects": {
                    objects = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                            try {
                                final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                    sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final org.thryft.protocol.InputProtocolException e) {
                                throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                            }
                        }
                    }).apply(iprot);
                    break;
                }
                case "total_hits": {
                    totalHits = iprot.readU32();
                    break;
                }
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            return this;
        }

        public Builder setIfPresent(final GetObjectsResult other) {
            com.google.common.base.Preconditions.checkNotNull(other);

            setObjects(other.getObjects());
            setTotalHits(other.getTotalHits());

            return this;
        }

        public Builder setObjects(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects) {
            this.objects = com.google.common.base.Preconditions.checkNotNull(objects);
            return this;
        }

        public Builder setTotalHits(final com.google.common.primitives.UnsignedInteger totalHits) {
            this.totalHits = com.google.common.base.Preconditions.checkNotNull(totalHits);
            return this;
        }

        @SuppressWarnings({"unchecked"})
        public Builder set(final String name, @javax.annotation.Nullable final java.lang.Object value) {
            com.google.common.base.Preconditions.checkNotNull(name);

            switch (name.toLowerCase()) {
            case "objects": setObjects((com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>)value); return this;
            case "total_hits": setTotalHits((com.google.common.primitives.UnsignedInteger)value); return this;
            default:
                throw new IllegalArgumentException(name);
            }
        }

        public Builder unsetObjects() {
            this.objects = null;
            return this;
        }

        public Builder unsetTotalHits() {
            this.totalHits = com.google.common.primitives.UnsignedInteger.ZERO;
            return this;
        }

        private com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects;
        private com.google.common.primitives.UnsignedInteger totalHits;
    }

    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        OBJECTS("objects", new com.google.common.reflect.TypeToken<com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {}, true, 0, "objects", org.thryft.protocol.Type.LIST),
        TOTAL_HITS("totalHits", new com.google.common.reflect.TypeToken<com.google.common.primitives.UnsignedInteger>() {}, true, 0, "total_hits", org.thryft.protocol.Type.I32);

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
            case "objects": return OBJECTS;
            case "totalHits": return TOTAL_HITS;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "objects": return OBJECTS;
            case "total_hits": return TOTAL_HITS;
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
    public GetObjectsResult(final GetObjectsResult other) {
        this(other.getObjects(), other.getTotalHits());
    }

    /**
     * Optional constructor
     */
    public GetObjectsResult(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects, final com.google.common.primitives.UnsignedInteger totalHits) {
        this.objects = com.google.common.base.Preconditions.checkNotNull(objects, "net.lab1318.costume.api.services.object.GetObjectsResult: missing objects");
        this.totalHits = com.google.common.base.Preconditions.checkNotNull(totalHits, "net.lab1318.costume.api.services.object.GetObjectsResult: missing totalHits");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(final GetObjectsResult other) {
        return new Builder(other);
    }

    public static Builder builder(final com.google.common.base.Optional<GetObjectsResult> other) {
        return other.isPresent() ? new Builder(other.get()) : new Builder();
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof GetObjectsResult)) {
            return false;
        }

        final GetObjectsResult other = (GetObjectsResult)otherObject;
        return
            getObjects().equals(other.getObjects()) &&
            getTotalHits().equals(other.getTotalHits());
    }

    @Override
    public java.lang.Object get(final String fieldName) {
        switch (fieldName) {
        case "objects": return getObjects();
        case "total_hits": return getTotalHits();
        default:
            throw new IllegalArgumentException(fieldName);
        }
    }

    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> getObjects() {
        return objects;
    }

    public final com.google.common.primitives.UnsignedInteger getTotalHits() {
        return totalHits;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getObjects().hashCode();
        hashCode = 31 * hashCode + getTotalHits().hashCode();
        return hashCode;
    }

    public static GetObjectsResult readAs(final org.thryft.protocol.InputProtocol iprot, final org.thryft.protocol.Type type) throws org.thryft.protocol.InputProtocolException {
        switch (type) {
        case LIST:
            return readAsList(iprot);
        case STRUCT:
            return readAsStruct(iprot);
        default:
            throw new IllegalArgumentException("cannot read as " + type);
        }
    }

    public static GetObjectsResult readAsList(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects = null;
        com.google.common.primitives.UnsignedInteger totalHits = com.google.common.primitives.UnsignedInteger.ZERO;

        iprot.readListBegin();
        objects = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
            @Override
            public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                try {
                    final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                    final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                    for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                        sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                    }
                    iprot.readListEnd();
                    return sequence.build();
                } catch (final org.thryft.protocol.InputProtocolException e) {
                    throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                }
            }
        }).apply(iprot);
        totalHits = iprot.readU32();
        iprot.readListEnd();
        try {
            return new GetObjectsResult(objects, totalHits);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public static GetObjectsResult readAsStruct(final org.thryft.protocol.InputProtocol iprot) throws org.thryft.protocol.InputProtocolException {
        com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects = null;
        com.google.common.primitives.UnsignedInteger totalHits = com.google.common.primitives.UnsignedInteger.ZERO;

        iprot.readStructBegin();
        while (true) {
            final org.thryft.protocol.FieldBegin ifield = iprot.readFieldBegin();
            if (ifield.getType() == org.thryft.protocol.Type.STOP) {
                break;
            }
            switch (ifield.getName()) {
            case "objects": {
                objects = (new com.google.common.base.Function<org.thryft.protocol.InputProtocol, com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> apply(final org.thryft.protocol.InputProtocol iprot) {
                        try {
                            final org.thryft.protocol.ListBegin sequenceBegin = iprot.readListBegin();
                            final com.google.common.collect.ImmutableList.Builder<net.lab1318.costume.api.models.object.ObjectEntry> sequence = com.google.common.collect.ImmutableList.builder();
                            for (int elementI = 0; elementI < sequenceBegin.getSize(); elementI++) {
                                sequence.add(net.lab1318.costume.api.models.object.ObjectEntry.readAsStruct(iprot));
                            }
                            iprot.readListEnd();
                            return sequence.build();
                        } catch (final org.thryft.protocol.InputProtocolException e) {
                            throw new org.thryft.protocol.UncheckedInputProtocolException(e);
                        }
                    }
                }).apply(iprot);
                break;
            }
            case "total_hits": {
                totalHits = iprot.readU32();
                break;
            }
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        try {
            return new GetObjectsResult(objects, totalHits);
        } catch (final IllegalArgumentException | NullPointerException e) {
            throw new org.thryft.protocol.InputProtocolException(e);
        }
    }

    public GetObjectsResult replaceObjects(final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects) {
        return new GetObjectsResult(objects, this.totalHits);
    }

    public GetObjectsResult replaceTotalHits(final com.google.common.primitives.UnsignedInteger totalHits) {
        return new GetObjectsResult(this.objects, totalHits);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("objects", getObjects()).add("total_hits", getTotalHits()).toString();
    }

    @Override
    public void writeAsList(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeListBegin(org.thryft.protocol.Type.VOID_, 2);

        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getObjects().size());
        for (final net.lab1318.costume.api.models.object.ObjectEntry _iter0 : getObjects()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();

        oprot.writeU32(getTotalHits());

        oprot.writeListEnd();
    }

    @Override
    public void writeAsStruct(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeStructBegin("net.lab1318.costume.api.services.object.GetObjectsResult");
        writeFields(oprot);
        oprot.writeStructEnd();
    }

    @Override
    public void writeFields(final org.thryft.protocol.OutputProtocol oprot) throws org.thryft.protocol.OutputProtocolException {
        oprot.writeFieldBegin("objects", org.thryft.protocol.Type.LIST, (short)0);
        oprot.writeListBegin(org.thryft.protocol.Type.STRUCT, getObjects().size());
        for (final net.lab1318.costume.api.models.object.ObjectEntry _iter0 : getObjects()) {
            _iter0.writeAsStruct(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldBegin("total_hits", org.thryft.protocol.Type.I32, (short)0);
        oprot.writeU32(getTotalHits());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
    }

    private final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.object.ObjectEntry> objects;

    private final com.google.common.primitives.UnsignedInteger totalHits;
}
