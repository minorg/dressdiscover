import { QaUserId } from "dressdiscover/api/models/qa/qa_user_id";

export class Session {
    get currentUserId(): QaUserId | null {
        const value = sessionStorage.getItem("currentUserId");
        return value ? QaUserId.parse(value) : null;
    }

    set currentUserId(value: QaUserId | null) {
        if (value) {
            sessionStorage.setItem("currentUserId", value.toString());
        } else {
            sessionStorage.removeItem("currentUserId");
        }
    }
}
