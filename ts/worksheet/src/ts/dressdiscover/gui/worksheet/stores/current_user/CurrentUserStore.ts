import { CurrentUser } from 'dressdiscover/gui/worksheet/models/current_user/CurrentUser';
import { action, observable, runInAction } from 'mobx';

export class CurrentUserStore {
    @observable.ref currentUser?: CurrentUser | null;

    constructor() {
        runInAction("constructor", () => {
            this.currentUser = null;
        });
    }

    @action
    async loginUser(kwds: { googleAccessToken: string }) {
        gapi.client.setToken({ access_token: kwds.googleAccessToken });

        const userinfo = await (gapi.client as any).oauth2.userinfo.get({
        });
        runInAction("loginUser continuation", () => {
            this.currentUser = new CurrentUser({ email: userinfo.result.email, name: userinfo.result.name });
        });
    }

    @action
    logoutCurrentUser() {
        this.currentUser = null;
    }
}
