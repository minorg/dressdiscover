import { CurrentUser } from 'dressdiscover/gui/worksheet/models/current_user/CurrentUser';
import { action, observable } from 'mobx';

export class CurrentUserStore {
    @observable currentUser: CurrentUser | undefined;

    @action
    async loginUser(kwds: { googleAccessToken: string }) {
        gapi.client.setToken({ access_token: kwds.googleAccessToken });
    }

    @action
    logoutCurrentUser() {
        this.currentUser = undefined;
    }
}
