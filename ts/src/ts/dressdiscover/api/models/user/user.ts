import { UserIdentityProvider } from "./user_identity_provider";

export class User {
    constructor(kwds: {emailAddress: string, identityProvider: UserIdentityProvider, identityProviderId: string, emailAddressVerified?: boolean, familyName?: string, givenName?: string, locale?: string, name?: string, nickname?: string, pictureUrl?: string}) {
        this.emailAddress = User.validateEmailAddress(kwds.emailAddress);
        this.identityProvider = User.validateIdentityProvider(kwds.identityProvider);
        this.identityProviderId = User.validateIdentityProviderId(kwds.identityProviderId);
        if (kwds.emailAddressVerified != null) {
            this.emailAddressVerified = User.validateEmailAddressVerified(kwds.emailAddressVerified);
        } else {
            this.emailAddressVerified = undefined;
        }
        if (kwds.familyName != null) {
            this.familyName = User.validateFamilyName(kwds.familyName);
        } else {
            this.familyName = undefined;
        }
        if (kwds.givenName != null) {
            this.givenName = User.validateGivenName(kwds.givenName);
        } else {
            this.givenName = undefined;
        }
        if (kwds.locale != null) {
            this.locale = User.validateLocale(kwds.locale);
        } else {
            this.locale = undefined;
        }
        if (kwds.name != null) {
            this.name = User.validateName(kwds.name);
        } else {
            this.name = undefined;
        }
        if (kwds.nickname != null) {
            this.nickname = User.validateNickname(kwds.nickname);
        } else {
            this.nickname = undefined;
        }
        if (kwds.pictureUrl != null) {
            this.pictureUrl = User.validatePictureUrl(kwds.pictureUrl);
        } else {
            this.pictureUrl = undefined;
        }
    }

    public deepCopy(): User {
        return new User({ emailAddress: this.emailAddress, identityProvider: this.identityProvider, identityProviderId: this.identityProviderId, emailAddressVerified: this.emailAddressVerified, familyName: this.familyName, givenName: this.givenName, locale: this.locale, name: this.name, nickname: this.nickname, pictureUrl: this.pictureUrl });
    }

    public equals(other: User): boolean {
        if (!(this.emailAddress === other.emailAddress)) {
            return false;
        }

        if (!(this.identityProvider === other.identityProvider)) {
            return false;
        }

        if (!(this.identityProviderId === other.identityProviderId)) {
            return false;
        }

        if (!((!((typeof (this.emailAddressVerified)) === "undefined") && !((typeof (other.emailAddressVerified)) === "undefined")) ? ((this.emailAddressVerified as boolean) === (other.emailAddressVerified as boolean)) : (((typeof (this.emailAddressVerified)) === "undefined") && ((typeof (other.emailAddressVerified)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.familyName)) === "undefined") && !((typeof (other.familyName)) === "undefined")) ? ((this.familyName as string) === (other.familyName as string)) : (((typeof (this.familyName)) === "undefined") && ((typeof (other.familyName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.givenName)) === "undefined") && !((typeof (other.givenName)) === "undefined")) ? ((this.givenName as string) === (other.givenName as string)) : (((typeof (this.givenName)) === "undefined") && ((typeof (other.givenName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.locale)) === "undefined") && !((typeof (other.locale)) === "undefined")) ? ((this.locale as string) === (other.locale as string)) : (((typeof (this.locale)) === "undefined") && ((typeof (other.locale)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.name)) === "undefined") && !((typeof (other.name)) === "undefined")) ? ((this.name as string) === (other.name as string)) : (((typeof (this.name)) === "undefined") && ((typeof (other.name)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.nickname)) === "undefined") && !((typeof (other.nickname)) === "undefined")) ? ((this.nickname as string) === (other.nickname as string)) : (((typeof (this.nickname)) === "undefined") && ((typeof (other.nickname)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.pictureUrl)) === "undefined") && !((typeof (other.pictureUrl)) === "undefined")) ? ((this.pictureUrl as string) === (other.pictureUrl as string)) : (((typeof (this.pictureUrl)) === "undefined") && ((typeof (other.pictureUrl)) === "undefined")))) {
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

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.email_address = this.emailAddress;
        json.identity_provider = UserIdentityProvider[this.identityProvider];
        json.identity_provider_id = this.identityProviderId;
        if (this.emailAddressVerified != null) {
            json.email_address_verified = this.emailAddressVerified;
        }
        if (this.familyName != null) {
            json.family_name = this.familyName;
        }
        if (this.givenName != null) {
            json.given_name = this.givenName;
        }
        if (this.locale != null) {
            json.locale = this.locale;
        }
        if (this.name != null) {
            json.name = this.name;
        }
        if (this.nickname != null) {
            json.nickname = this.nickname;
        }
        if (this.pictureUrl != null) {
            json.picture_url = this.pictureUrl;
        }
        return json;
    }

    public toString(): string {
        return "User(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.email_address = this.emailAddress;
        json.identity_provider = UserIdentityProvider[this.identityProvider];
        json.identity_provider_id = this.identityProviderId;
        if (this.emailAddressVerified != null) {
            json.email_address_verified = this.emailAddressVerified;
        }
        if (this.familyName != null) {
            json.family_name = this.familyName;
        }
        if (this.givenName != null) {
            json.given_name = this.givenName;
        }
        if (this.locale != null) {
            json.locale = this.locale;
        }
        if (this.name != null) {
            json.name = this.name;
        }
        if (this.nickname != null) {
            json.nickname = this.nickname;
        }
        if (this.pictureUrl != null) {
            json.picture_url = this.pictureUrl;
        }
        return json;
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

    private static validateEmailAddressVerified(emailAddressVerified: boolean | undefined): boolean | undefined {
        return emailAddressVerified;
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

    private static validatePictureUrl(pictureUrl: string | undefined): string | undefined {
        return pictureUrl;
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
