package net.lab1318.costume.gui.models.user;

public class UserBookmarkBean implements org.thryft.StructBean {
    @SuppressWarnings("serial")
    public enum FieldMetadata implements org.thryft.CompoundType.FieldMetadata {
        NAME("name", new com.google.common.reflect.TypeToken<String>() {}, true, 0, "name", org.thryft.protocol.Type.STRING),
        USER_ID("userId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.user.UserId>() {}, true, 0, "user_id", org.thryft.protocol.Type.STRING),
        FOLDER("folder", new com.google.common.reflect.TypeToken<String>() {}, false, 0, "folder", org.thryft.protocol.Type.STRING),
        OBJECT_ID("objectId", new com.google.common.reflect.TypeToken<net.lab1318.costume.api.models.object.ObjectId>() {}, false, 0, "object_id", org.thryft.protocol.Type.STRING),
        OBJECT_QUERY("objectQuery", new com.google.common.reflect.TypeToken<net.lab1318.costume.gui.models.object.ObjectQueryBean>() {}, false, 0, "object_query", org.thryft.protocol.Type.STRUCT);

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
            case "name": return NAME;
            case "userId": return USER_ID;
            case "folder": return FOLDER;
            case "objectId": return OBJECT_ID;
            case "objectQuery": return OBJECT_QUERY;
            default:
                throw new IllegalArgumentException(javaName);
            }
        }

        public static FieldMetadata valueOfThriftName(final String thriftName) {
            switch (thriftName) {
            case "name": return NAME;
            case "user_id": return USER_ID;
            case "folder": return FOLDER;
            case "object_id": return OBJECT_ID;
            case "object_query": return OBJECT_QUERY;
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

    public UserBookmarkBean() {
        name = null;
        userId = null;
        folder = null;
        objectId = null;
        objectQuery = null;
    }

    public UserBookmarkBean(final net.lab1318.costume.api.models.user.UserBookmark other) {
        this.name = other.getName();
        this.userId = other.getUserId();
        this.folder = other.getFolder().isPresent() ? other.getFolder().get() : null;
        this.objectId = other.getObjectId().isPresent() ? other.getObjectId().get() : null;
        this.objectQuery = other.getObjectQuery().isPresent() ? new net.lab1318.costume.gui.models.object.ObjectQueryBean(other.getObjectQuery().get()) : null;
    }

    @Override
    public boolean equals(final java.lang.Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof UserBookmarkBean)) {
            return false;
        }

        final UserBookmarkBean other = (UserBookmarkBean)otherObject;
        return
            getName().equals(other.getName()) &&
            getUserId().equals(other.getUserId()) &&
            (getFolder() != null ? getFolder().equals(other.getFolder()) : other.getFolder() == null) &&
            (getObjectId() != null ? getObjectId().equals(other.getObjectId()) : other.getObjectId() == null) &&
            (getObjectQuery() != null ? getObjectQuery().equals(other.getObjectQuery()) : other.getObjectQuery() == null);
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
        case NAME: return getName();
        case USER_ID: return getUserId();
        case FOLDER: return getFolder();
        case OBJECT_ID: return getObjectId();
        case OBJECT_QUERY: return getObjectQuery();
        default:
            throw new IllegalStateException();
        }
    }

    public String getFolder() {
        return folder;
    }

    public String getName() {
        return name;
    }

    public net.lab1318.costume.api.models.object.ObjectId getObjectId() {
        return objectId;
    }

    public net.lab1318.costume.gui.models.object.ObjectQueryBean getObjectQuery() {
        return objectQuery;
    }

    public net.lab1318.costume.api.models.user.UserId getUserId() {
        return userId;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getName().hashCode();
        hashCode = 31 * hashCode + getUserId().hashCode();
        if (getFolder() != null) {
            hashCode = 31 * hashCode + getFolder().hashCode();
        }
        if (getObjectId() != null) {
            hashCode = 31 * hashCode + getObjectId().hashCode();
        }
        if (getObjectQuery() != null) {
            hashCode = 31 * hashCode + getObjectQuery().hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void setFolder(final String folder) {
        this.folder = folder;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setObjectId(final net.lab1318.costume.api.models.object.ObjectId objectId) {
        this.objectId = objectId;
    }

    public void setObjectQuery(final net.lab1318.costume.gui.models.object.ObjectQueryBean objectQuery) {
        this.objectQuery = objectQuery;
    }

    public void setUserId(final net.lab1318.costume.api.models.user.UserId userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).omitNullValues().add("name", getName()).add("user_id", getUserId()).add("folder", getFolder()).add("object_id", getObjectId()).add("object_query", getObjectQuery()).toString();
    }

    private String name;

    private net.lab1318.costume.api.models.user.UserId userId;

    private String folder;

    private net.lab1318.costume.api.models.object.ObjectId objectId;

    private net.lab1318.costume.gui.models.object.ObjectQueryBean objectQuery;
}
