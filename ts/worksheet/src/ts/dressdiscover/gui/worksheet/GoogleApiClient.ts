export class GoogleApiClient {
    static readonly GOOGLE_OAUTH_CLIENT_ID = "768033890505-b9u6s293d52k4f1v4bav9fif7feoe4b4.apps.googleusercontent.com";

    load(callback: () => void) {
        if (this.loaded) {
            callback();
            return;
        }

    }

    private loaded = false;
    static readonly instance = new GoogleApiClient();
}