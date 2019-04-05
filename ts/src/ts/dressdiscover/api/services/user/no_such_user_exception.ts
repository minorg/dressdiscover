import { UserId } from "../../models/user/user_id";

export class NoSuchUserException {
    constructor(kwds?: {id?: UserId}) {
        if (!kwds) {
            return;
        }
        if (kwds.id != null) {
            this.id = NoSuchUserException.validateId(kwds.id);
        } else {
            this.id = undefined;
        }
    }

    public deepCopy(): NoSuchUserException {
        return new NoSuchUserException({ id: this.id });
    }

    public equals(other: NoSuchUserException): boolean {
        if (!((!((typeof (this.id)) === "undefined") && !((typeof (other.id)) === "undefined")) ? ((this.id as UserId).equals((other.id as UserId))) : (((typeof (this.id)) === "undefined") && ((typeof (other.id)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): NoSuchUserException {
        let id: UserId | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = UserId.parse(json[fieldName]);
            }
        }

        return new NoSuchUserException({id});
    }

    public toJsonObject(): {id: string | undefined} {
        return {
            id: this.id != null ? this.id.toString() : undefined
        };
    }

    public toString(): string {
        return "NoSuchUserException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {id: string | undefined} {
        return {
            id: this.id != null ? this.id.toString() : undefined
        };
    }

    private static validateId(id: UserId | undefined): UserId | undefined {
        return id;
    }

    public readonly id?: UserId;
}
