import {WorksheetRights} from "./WorksheetRights";

export class WorksheetDescription {
  constructor(kwds: {rights: WorksheetRights; textEn: string}) {
    this.rights = WorksheetDescription.validateRights(kwds.rights);
    this.textEn = WorksheetDescription.validateTextEn(kwds.textEn);
  }

  public deepCopy(): WorksheetDescription {
    return new WorksheetDescription({
      rights: this.rights.deepCopy(),
      textEn: this.textEn,
    });
  }

  public equals(other: WorksheetDescription): boolean {
    if (!this.rights.equals(other.rights)) {
      return false;
    }

    if (this.textEn !== other.textEn) {
      return false;
    }

    return true;
  }

  public static fromThryftJsonObject(json: any): WorksheetDescription {
    let rights: WorksheetRights | undefined;
    let textEn: string | undefined;
    for (const fieldName in json) {
      if (fieldName === "rights") {
        rights = WorksheetRights.fromThryftJsonObject(json[fieldName]);
      } else if (fieldName === "text_en") {
        textEn = json[fieldName];
      }
    }
    if (rights == null) {
      throw new TypeError("rights is required");
    }
    if (textEn == null) {
      throw new TypeError("textEn is required");
    }
    return new WorksheetDescription({rights, textEn});
  }

  public toJsonObject(): {
    rights: {
      author: string;
      license: {nickname: string; statement: string; uri: string};
      source: {name: string; url: string};
    };
    text_en: string;
  } {
    return {
      rights: this.rights.toJsonObject(),
      text_en: this.textEn,
    };
  }

  public toString(): string {
    return (
      "WorksheetDescription(" + JSON.stringify(this.toThryftJsonObject()) + ")"
    );
  }

  public toThryftJsonObject(): {
    rights: {
      author: string;
      license: {nickname: string; statement: string; uri: string};
      source: {name: string; url: string};
    };
    text_en: string;
  } {
    return {
      rights: this.rights.toThryftJsonObject(),
      text_en: this.textEn,
    };
  }

  private static validateRights(rights: WorksheetRights): WorksheetRights {
    if (rights == null) {
      throw new RangeError("rights is null or undefined");
    }
    return rights;
  }

  private static validateTextEn(textEn: string): string {
    if (textEn == null) {
      throw new RangeError("textEn is null or undefined");
    }
    if (textEn.trim().length === 0) {
      throw new RangeError("textEn is blank");
    }
    if (textEn.length < 1) {
      throw new RangeError(
        "expected len(textEn) to be >= 1, was " + textEn.length
      );
    }
    return textEn;
  }

  public readonly rights: WorksheetRights;
  public readonly textEn: string;
}
