import { CurrentUser } from 'dressdiscover/gui/worksheet/models/current_user/CurrentUser';
import { ILogger } from 'dressdiscover/gui/worksheet/util/logging/ILogger';
import { action, observable } from 'mobx';

export class CurrentUserStore {
    constructor(private readonly logger: ILogger) {
    }

    @observable currentUser: CurrentUser | undefined;

    @action
    async fetchCurrentUser() {
        if (this.currentUser) {
            this.logger.debug("already have current user");
            return;
        }

        // let currentUser: CurrentUser;
        // try {
        //     currentUser = await Api.getCurrentUser();
        // } catch (e) {
        //     this.logger.error("Error getting current user: " + e);
        //     return;
        // }
        // runInAction(() => {
        //     this.currentUser = currentUser;
        // });
    }

    @action
    async logoutCurrentUser() {
        // await Api.logoutCurrentUser();
        // runInAction(() => {
        //     console.info("Undefining current user");
        //     this.currentUser = undefined;
        // });
    }
}
