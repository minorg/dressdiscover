import { CurrentUser } from 'dressdiscover/gui/worksheet/models/current_user/CurrentUser';
import { action, observable } from 'mobx';

import { CognitoUserPool } from '../../CognitoUserPool';

export class CurrentUserStore {
    // constructor(private readonly logger: ILogger) {
    // }

    @observable currentUser: CurrentUser | undefined;

    @action
    async loginUser(code: string) {
    }

    @action
    logoutCurrentUser() {
        this.currentUser = undefined;
    }

    private readonly userPool: CognitoUserPool = new CognitoUserPool();
}
