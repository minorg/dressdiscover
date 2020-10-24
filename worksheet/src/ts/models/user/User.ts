import {UserIdentityProvider} from "./UserIdentityProvider";

export interface User {
  readonly emailAddress: string;
  readonly emailAddressVerified?: boolean;
  readonly familyName?: string;
  readonly givenName?: string;
  readonly identityProvider: UserIdentityProvider;
  readonly identityProviderId: string;
  readonly locale?: string;
  readonly name?: string;
  readonly nickname?: string;
  readonly pictureUrl?: string;
}
