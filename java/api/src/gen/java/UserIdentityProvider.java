public enum UserIdentityProvider implements org.thryft.ThryftEnum {
    GOOGLE_OAUTH2(0);

    public final static class Factory implements org.thryft.ThryftEnum.Factory<UserIdentityProvider> {
        public final static Factory getInstance() {
            return instance;
        }

        public final UserIdentityProvider valueOf(final String name) {
            return UserIdentityProvider.valueOf(name);
        }

        public final UserIdentityProvider valueOf(final int value) {
            return UserIdentityProvider.valueOf(value);
        }

        private Factory() {
        }

        private final static Factory instance = new Factory();
    }

    private UserIdentityProvider(int value) {
        this.value = value;
    }

    public static UserIdentityProvider valueOf(final int value) {
        switch (value) {
        case 0: return GOOGLE_OAUTH2;
        default: throw new IllegalArgumentException();
        }
    }

    public final int value() {
        return value;
    }

    private final int value;
}
