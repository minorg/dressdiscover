import { UserId } from "../../models/user/user_id";

export class NoSuchUserSettingsException implements Exception {
    constructor(kwds?: {id?: UserId}) {
        if (!kwds) {
            return;
        }
        if (kwds.id != null) {
            this.id = NoSuchUserSettingsException.validateId(kwds.id);
        } else {
            this.id = undefined;
        }
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

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        if (this.id != null) {
            json.id = this.id.toString();
        }
        return json;
    }

    public toString(): string {
        return "NoSuchUserSettingsException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        if (this.id != null) {
            json.id = this.id.toString();
        }
        return json;
    }

    private static validateId(id: UserId | undefined): UserId | undefined {
        return id;
    }

    public readonly id?: UserId;
}
