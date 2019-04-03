package org.dressdiscover.api.services.user;

@com.google.inject.Singleton
public class ValidatingUserSettingsCommandService implements org.dressdiscover.api.services.user.UserSettingsCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.api.services.user.ValidatingUserSettingsCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingUserSettingsCommandService(@com.google.inject.name.Named("org.dressdiscover.api.services.user.ValidatingUserSettingsCommandService.delegate") org.dressdiscover.api.services.user.UserSettingsCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void putUserSettings(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.UserSettings userSettings) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserSettingsCommandService.putUserSettings: id is missing");
            }
        }
        {
            if (userSettings == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserSettingsCommandService.putUserSettings: userSettings is missing");
            }
        }
        delegate.putUserSettings(id, userSettings);
    }

    private final org.dressdiscover.api.services.user.UserSettingsCommandService delegate;
}
