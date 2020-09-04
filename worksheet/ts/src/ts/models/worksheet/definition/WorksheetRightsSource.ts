export class WorksheetRightsSource {
  constructor(kwds: {name: string; url: string}) {
    this.name = WorksheetRightsSource.validateName(kwds.name);
    this.url = WorksheetRightsSource.validateUrl(kwds.url);
  }

  public deepCopy(): WorksheetRightsSource {
    return new WorksheetRightsSource({name: this.name, url: this.url});
  }

  public equals(other: WorksheetRightsSource): boolean {
    if (this.name !== other.name) {
      return false;
    }

    if (this.url !== other.url) {
      return false;
    }

    return true;
  }

  public static fromThryftJsonObject(json: any): WorksheetRightsSource {
    let name: string | undefined;
    let url: string | undefined;
    for (const fieldName in json) {
      if (fieldName === "name") {
        name = json[fieldName];
      } else if (fieldName === "url") {
        url = json[fieldName];
      }
    }
    if (name == null) {
      throw new TypeError("name is required");
    }
    if (url == null) {
      throw new TypeError("url is required");
    }
    return new WorksheetRightsSource({name, url});
  }

  public toJsonObject(): {name: string; url: string} {
    return {
      name: this.name,
      url: this.url,
    };
  }

  public toString(): string {
    return (
      "WorksheetRightsSource(" + JSON.stringify(this.toThryftJsonObject()) + ")"
    );
  }

  public toThryftJsonObject(): {name: string; url: string} {
    return {
      name: this.name,
      url: this.url,
    };
  }

  private static validateName(name: string): string {
    if (name == null) {
      throw new RangeError("name is null or undefined");
    }
    if (name.trim().length === 0) {
      throw new RangeError("name is blank");
    }
    if (name.length < 1) {
      throw new RangeError("expected len(name) to be >= 1, was " + name.length);
    }
    return name;
  }

  private static validateUrl(url: string): string {
    if (url == null) {
      throw new RangeError("url is null or undefined");
    }
    return url;
  }

  public readonly name: string;
  public readonly url: string;
}
