import { WorksheetRights } from "./worksheet_rights";

export class WorksheetDescription {
    constructor(kwds: {rights: WorksheetRights, text: string}) {
        this.rightsPrivate = WorksheetDescription.validateRights(kwds.rights);
        this.textPrivate = WorksheetDescription.validateText(kwds.text);
    }

    get rights(): WorksheetRights {
        return this.rightsPrivate;
    }

    set rights(rights: WorksheetRights) {
        this.rightsPrivate = WorksheetDescription.validateRights(rights);
    }

    get text(): string {
        return this.textPrivate;
    }

    set text(text: string) {
        this.textPrivate = WorksheetDescription.validateText(text);
    }

    public deepCopy(): WorksheetDescription {
        return new WorksheetDescription({ rights: this.rights.deepCopy(), text: this.text });
    }

    public equals(other: WorksheetDescription): boolean {
        if (!(this.rights.equals(other.rights))) {
            return false;
        }

        if (!(this.text === other.text)) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetDescription {
        let rights: WorksheetRights | undefined;
        let text: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "rights") {
                rights = WorksheetRights.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "text") {
                text = json[fieldName];
            }
        }
        if (rights == null) {
            throw new TypeError("rights is required");
        }
        if (text == null) {
            throw new TypeError("text is required");
        }
        return new WorksheetDescription({rights, text});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.rights = this.rights.toJsonObject();
        json.text = this.text;
        return json;
    }

    public toString(): string {
        return "WorksheetDescription(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.rights = this.rights.toThryftJsonObject();
        json.text = this.text;
        return json;
    }

    private static validateRights(rights: WorksheetRights): WorksheetRights {
        if (rights == null) {
            throw new RangeError("rights is null or undefined");
        }
        return rights;
    }

    private static validateText(text: string): string {
        if (text == null) {
            throw new RangeError("text is null or undefined");
        }
        if (text.trim().length === 0) {
            throw new RangeError("text is blank");
        }
        if (text.length < 1) {
            throw new RangeError("expected len(text) to be >= 1, was " + text.length);
        }
        return text;
    }

    private rightsPrivate: WorksheetRights;

    private textPrivate: string;
}
