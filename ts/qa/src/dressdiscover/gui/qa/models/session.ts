export class Session {
    get currentUserId(): string | null {
        return sessionStorage.getItem("currentUserId");
    }

    set currentUserId(value: string | null) {
        if (value) {
            sessionStorage.setItem("currentUserId", value);
        } else {
            sessionStorage.removeItem("currentUserId");
        }
    }
}
