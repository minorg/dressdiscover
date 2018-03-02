export class NoSuchWorksheetFeatureDefinitionException {
    constructor(kwds: {id: string}) {
        this._id = NoSuchWorksheetFeatureDefinitionException._validateId(kwds.id);
    }

    get id(): string {
        return this._id;
    }

    set id(id: string) {
        this._id = NoSuchWorksheetFeatureDefinitionException._validateId(id);
    }

    private static _validateId(id: string): string {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        if (id.trim().length == 0) {
            throw new RangeError('id is blank');
        }
        if (id.length < 1) {
            throw new RangeError("expected len(id) to be >= 1, was " + id.length);
        }
        return id;
    }

    deepCopy(): NoSuchWorksheetFeatureDefinitionException {
        return new NoSuchWorksheetFeatureDefinitionException({ id: this.id });
    }

    equals(other: NoSuchWorksheetFeatureDefinitionException): boolean {
        if (!(this.id === other.id)) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): NoSuchWorksheetFeatureDefinitionException {
        var id: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new NoSuchWorksheetFeatureDefinitionException({id: id});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        return json;
    }

    toString(): string {
        return "NoSuchWorksheetFeatureDefinitionException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        return json;
    }

    private _id: string;
}
