import { UserIdentityProvider } from "./user_identity_provider";

export class User {
    constructor(kwds: {emailAddress: string, identityProvider: UserIdentityProvider, identityProviderId: string, emailAddressVerified?: boolean, familyName?: string, givenName?: string, locale?: string, name?: string, nickname?: string, pictureUrl?: string}) {
        this.emailAddress = User.validateEmailAddress(kwds.emailAddress);
        this.identityProvider = User.validateIdentityProvider(kwds.identityProvider);
        this.identityProviderId = User.validateIdentityProviderId(kwds.identityProviderId);
        this.emailAddressVerified = (kwds.emailAddressVerified != null) ? kwds.emailAddressVerified : undefined;
        this.familyName = User.validateFamilyName(kwds.familyName);
        this.givenName = User.validateGivenName(kwds.givenName);
        this.locale = User.validateLocale(kwds.locale);
        this.name = User.validateName(kwds.name);
        this.nickname = User.validateNickname(kwds.nickname);
        this.pictureUrl = (kwds.pictureUrl != null) ? kwds.pictureUrl : undefined;
    }

    public deepCopy(): User {
        return new User({ emailAddress: this.emailAddress, identityProvider: this.identityProvider, identityProviderId: this.identityProviderId, emailAddressVerified: this.emailAddressVerified, familyName: this.familyName, givenName: this.givenName, locale: this.locale, name: this.name, nickname: this.nickname, pictureUrl: this.pictureUrl });
    }

    public equals(other: User): boolean {
        if (this.emailAddress !== other.emailAddress) {
            return false;
        }

        if (this.identityProvider !== other.identityProvider) {
            return false;
        }

        if (this.identityProviderId !== other.identityProviderId) {
            return false;
        }

        if (this.emailAddressVerified !== other.emailAddressVerified) {
            return false;
        }

        if (this.familyName !== other.familyName) {
            return false;
        }

        if (this.givenName !== other.givenName) {
            return false;
        }

        if (this.locale !== other.locale) {
            return false;
        }

        if (this.name !== other.name) {
            return false;
        }

        if (this.nickname !== other.nickname) {
            return false;
        }

        if (this.pictureUrl !== other.pictureUrl) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): User {
        let emailAddress: string | undefined;
        let identityProvider: UserIdentityProvider | undefined;
        let identityProviderId: string | undefined;
        let emailAddressVerified: boolean | undefined;
        let familyName: string | undefined;
        let givenName: string | undefined;
        let locale: string | undefined;
        let name: string | undefined;
        let nickname: string | undefined;
        let pictureUrl: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "email_address") {
                emailAddress = json[fieldName];
            } else if (fieldName === "identity_provider") {
                identityProvider = (UserIdentityProvider as any)[json[fieldName] as string];
            } else if (fieldName === "identity_provider_id") {
                identityProviderId = json[fieldName];
            } else if (fieldName === "email_address_verified") {
                emailAddressVerified = json[fieldName];
            } else if (fieldName === "family_name") {
                familyName = json[fieldName];
            } else if (fieldName === "given_name") {
                givenName = json[fieldName];
            } else if (fieldName === "locale") {
                locale = json[fieldName];
            } else if (fieldName === "name") {
                name = json[fieldName];
            } else if (fieldName === "nickname") {
                nickname = json[fieldName];
            } else if (fieldName === "picture_url") {
                pictureUrl = json[fieldName];
            }
        }
        if (emailAddress == null) {
            throw new TypeError("emailAddress is required");
        }
        if (identityProvider == null) {
            throw new TypeError("identityProvider is required");
        }
        if (identityProviderId == null) {
            throw new TypeError("identityProviderId is required");
        }
        return new User({emailAddress, identityProvider, identityProviderId, emailAddressVerified, familyName, givenName, locale, name, nickname, pictureUrl});
    }

    public toJsonObject(): {email_address: string, email_address_verified: boolean | undefined, family_name: string | undefined, given_name: string | undefined, identity_provider: string, identity_provider_id: string, locale: string | undefined, name: string | undefined, nickname: string | undefined, picture_url: string | undefined} {
        return {
            email_address: this.emailAddress,
            email_address_verified: this.emailAddressVerified != null ? this.emailAddressVerified : undefined,
            family_name: this.familyName != null ? this.familyName : undefined,
            given_name: this.givenName != null ? this.givenName : undefined,
            identity_provider: UserIdentityProvider[this.identityProvider],
            identity_provider_id: this.identityProviderId,
            locale: this.locale != null ? this.locale : undefined,
            name: this.name != null ? this.name : undefined,
            nickname: this.nickname != null ? this.nickname : undefined,
            picture_url: this.pictureUrl != null ? this.pictureUrl : undefined
        };
    }

    public toString(): string {
        return "User(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {email_address: string, email_address_verified: boolean | undefined, family_name: string | undefined, given_name: string | undefined, identity_provider: string, identity_provider_id: string, locale: string | undefined, name: string | undefined, nickname: string | undefined, picture_url: string | undefined} {
        return {
            email_address: this.emailAddress,
            email_address_verified: this.emailAddressVerified != null ? this.emailAddressVerified : undefined,
            family_name: this.familyName != null ? this.familyName : undefined,
            given_name: this.givenName != null ? this.givenName : undefined,
            identity_provider: UserIdentityProvider[this.identityProvider],
            identity_provider_id: this.identityProviderId,
            locale: this.locale != null ? this.locale : undefined,
            name: this.name != null ? this.name : undefined,
            nickname: this.nickname != null ? this.nickname : undefined,
            picture_url: this.pictureUrl != null ? this.pictureUrl : undefined
        };
    }

    private static validateEmailAddress(emailAddress: string): string {
        if (emailAddress == null) {
            throw new RangeError("emailAddress is null or undefined");
        }
        if (emailAddress.trim().length === 0) {
            throw new RangeError("emailAddress is blank");
        }
        if (emailAddress.length < 1) {
            throw new RangeError("expected len(emailAddress) to be >= 1, was " + emailAddress.length);
        }
        return emailAddress;
    }

    private static validateFamilyName(familyName: string | undefined): string | undefined {
        if (familyName != null) {
            if (familyName.trim().length === 0) {
                throw new RangeError("familyName is blank");
            }
            if (familyName.length < 1) {
                throw new RangeError("expected len(familyName) to be >= 1, was " + familyName.length);
            }
        }
        return familyName;
    }

    private static validateGivenName(givenName: string | undefined): string | undefined {
        if (givenName != null) {
            if (givenName.trim().length === 0) {
                throw new RangeError("givenName is blank");
            }
            if (givenName.length < 1) {
                throw new RangeError("expected len(givenName) to be >= 1, was " + givenName.length);
            }
        }
        return givenName;
    }

    private static validateIdentityProvider(identityProvider: UserIdentityProvider): UserIdentityProvider {
        if (identityProvider == null) {
            throw new RangeError("identityProvider is null or undefined");
        }
        return identityProvider;
    }

    private static validateIdentityProviderId(identityProviderId: string): string {
        if (identityProviderId == null) {
            throw new RangeError("identityProviderId is null or undefined");
        }
        if (identityProviderId.trim().length === 0) {
            throw new RangeError("identityProviderId is blank");
        }
        if (identityProviderId.length < 1) {
            throw new RangeError("expected len(identityProviderId) to be >= 1, was " + identityProviderId.length);
        }
        return identityProviderId;
    }

    private static validateLocale(locale: string | undefined): string | undefined {
        if (locale != null) {
            if (locale.trim().length === 0) {
                throw new RangeError("locale is blank");
            }
            if (locale.length < 1) {
                throw new RangeError("expected len(locale) to be >= 1, was " + locale.length);
            }
        }
        return locale;
    }

    private static validateName(name: string | undefined): string | undefined {
        if (name != null) {
            if (name.trim().length === 0) {
                throw new RangeError("name is blank");
            }
            if (name.length < 1) {
                throw new RangeError("expected len(name) to be >= 1, was " + name.length);
            }
        }
        return name;
    }

    private static validateNickname(nickname: string | undefined): string | undefined {
        if (nickname != null) {
            if (nickname.trim().length === 0) {
                throw new RangeError("nickname is blank");
            }
            if (nickname.length < 1) {
                throw new RangeError("expected len(nickname) to be >= 1, was " + nickname.length);
            }
        }
        return nickname;
    }

    /**
     * date_time.DateTime ctime;
     */
    public readonly emailAddress: string;
    public readonly emailAddressVerified?: boolean;
    public readonly familyName?: string;
    public readonly givenName?: string;
    public readonly identityProvider: UserIdentityProvider;
    public readonly identityProviderId: string;
    public readonly locale?: string;
    public readonly name?: string;
    public readonly nickname?: string;
    public readonly pictureUrl?: string;
}
