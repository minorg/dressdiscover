package org.dressdiscover.api.services.user;

@com.google.inject.Singleton
public class ValidatingUserSettingsQueryService implements org.dressdiscover.api.services.user.UserSettingsQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.user.ValidatingUserSettingsQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingUserSettingsQueryService(@com.google.inject.name.Named("org.dressdiscover.api.services.user.ValidatingUserSettingsQueryService.delegate") org.dressdiscover.api.services.user.UserSettingsQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final org.dressdiscover.api.models.user.UserSettings getUserSettings(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException, org.dressdiscover.api.services.user.NoSuchUserSettingsException {
        {
            if (id == null) {
                throw new NullPointerException("org.dressdiscover.api.services.user.ValidatingUserSettingsQueryService.getUserSettings: id is null");
            }
        }
        final org.dressdiscover.api.models.user.UserSettings __returnValue = delegate.getUserSettings(id);
        {
            if (__returnValue == null) {
                throw new NullPointerException("org.dressdiscover.api.services.user.ValidatingUserSettingsQueryService.getUserSettings: __returnValue is null");
            }
        }
        return __returnValue;
    }

    private final org.dressdiscover.api.services.user.UserSettingsQueryService delegate;
}
