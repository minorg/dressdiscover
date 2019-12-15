import { UserId } from "../../models/user/user_id";

export class NoSuchUserSettingsException implements Exception {
    constructor(kwds?: {id?: UserId}) {
        if (!kwds) {
            return;
        }
        this.id = (kwds.id != null) ? kwds.id : undefined;
    }

    public deepCopy(): NoSuchUserSettingsException {
        return new NoSuchUserSettingsException({ id: this.id });
    }

    public equals(other: NoSuchUserSettingsException): boolean {
        if (!((!((typeof (this.id)) === "undefined") && !((typeof (other.id)) === "undefined")) ? ((this.id as UserId).equals((other.id as UserId))) : (((typeof (this.id)) === "undefined") && ((typeof (other.id)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): NoSuchUserSettingsException {
        let id: UserId | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = UserId.parse(json[fieldName]);
            }
        }

        return new NoSuchUserSettingsException({id});
    }

    public toJsonObject(): {id: string | undefined} {
        return {
            id: this.id != null ? this.id.toString() : undefined
        };
    }

    public toString(): string {
        return "NoSuchUserSettingsException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {id: string | undefined} {
        return {
            id: this.id != null ? this.id.toString() : undefined
        };
    }

    public readonly id?: UserId;
}
