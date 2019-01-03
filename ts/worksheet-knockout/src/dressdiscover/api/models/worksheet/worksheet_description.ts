import { WorksheetRights } from "./worksheet_rights";

export class WorksheetDescription {
    constructor(kwds: {rights: WorksheetRights, text: string}) {
        this._rights = WorksheetDescription._validateRights(kwds.rights);
        this._text = WorksheetDescription._validateText(kwds.text);
    }

    get rights(): WorksheetRights {
        return this._rights;
    }

    set rights(rights: WorksheetRights) {
        this._rights = WorksheetDescription._validateRights(rights);
    }

    get text(): string {
        return this._text;
    }

    set text(text: string) {
        this._text = WorksheetDescription._validateText(text);
    }

    private static _validateRights(rights: WorksheetRights): WorksheetRights {
        if (rights == null) {
            throw new RangeError('rights is null or undefined');
        }
        return rights;
    }

    private static _validateText(text: string): string {
        if (text == null) {
            throw new RangeError('text is null or undefined');
        }
        if (text.trim().length == 0) {
            throw new RangeError('text is blank');
        }
        if (text.length < 1) {
            throw new RangeError("expected len(text) to be >= 1, was " + text.length);
        }
        return text;
    }

    deepCopy(): WorksheetDescription {
        return new WorksheetDescription({ rights: this.rights.deepCopy(), text: this.text });
    }

    equals(other: WorksheetDescription): boolean {
        if (!(this.rights.equals(other.rights))) {
            return false;
        }

        if (!(this.text === other.text)) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetDescription {
        var rights: WorksheetRights | undefined;
        var text: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "rights") {
                rights = WorksheetRights.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            }
        }
        if (rights == null) {
            throw new TypeError('rights is required');
        }
        if (text == null) {
            throw new TypeError('text is required');
        }
        return new WorksheetDescription({rights: rights, text: text});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["rights"] = this.rights.toJsonObject();
        json["text"] = this.text;
        return json;
    }

    toString(): string {
        return "WorksheetDescription(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["rights"] = this.rights.toThryftJsonObject();
        json["text"] = this.text;
        return json;
    }

    private _rights: WorksheetRights;

    private _text: string;
}
