export class WorksheetRightsLicense {
  constructor(kwds: {nickname: string; statement: string; uri: string}) {
    this.nickname = WorksheetRightsLicense.validateNickname(kwds.nickname);
    this.statement = WorksheetRightsLicense.validateStatement(kwds.statement);
    this.uri = WorksheetRightsLicense.validateUri(kwds.uri);
  }

  public deepCopy(): WorksheetRightsLicense {
    return new WorksheetRightsLicense({
      nickname: this.nickname,
      statement: this.statement,
      uri: this.uri,
    });
  }

  public equals(other: WorksheetRightsLicense): boolean {
    if (this.nickname !== other.nickname) {
      return false;
    }

    if (this.statement !== other.statement) {
      return false;
    }

    if (this.uri !== other.uri) {
      return false;
    }

    return true;
  }

  public static fromThryftJsonObject(json: any): WorksheetRightsLicense {
    let nickname: string | undefined;
    let statement: string | undefined;
    let uri: string | undefined;
    for (const fieldName in json) {
      if (fieldName === "nickname") {
        nickname = json[fieldName];
      } else if (fieldName === "statement") {
        statement = json[fieldName];
      } else if (fieldName === "uri") {
        uri = json[fieldName];
      }
    }
    if (nickname == null) {
      throw new TypeError("nickname is required");
    }
    if (statement == null) {
      throw new TypeError("statement is required");
    }
    if (uri == null) {
      throw new TypeError("uri is required");
    }
    return new WorksheetRightsLicense({nickname, statement, uri});
  }

  public toJsonObject(): {nickname: string; statement: string; uri: string} {
    return {
      nickname: this.nickname,
      statement: this.statement,
      uri: this.uri,
    };
  }

  public toString(): string {
    return (
      "WorksheetRightsLicense(" +
      JSON.stringify(this.toThryftJsonObject()) +
      ")"
    );
  }

  public toThryftJsonObject(): {
    nickname: string;
    statement: string;
    uri: string;
  } {
    return {
      nickname: this.nickname,
      statement: this.statement,
      uri: this.uri,
    };
  }

  private static validateNickname(nickname: string): string {
    if (nickname == null) {
      throw new RangeError("nickname is null or undefined");
    }
    if (nickname.trim().length === 0) {
      throw new RangeError("nickname is blank");
    }
    if (nickname.length < 1) {
      throw new RangeError(
        "expected len(nickname) to be >= 1, was " + nickname.length
      );
    }
    return nickname;
  }

  private static validateStatement(statement: string): string {
    if (statement == null) {
      throw new RangeError("statement is null or undefined");
    }
    if (statement.trim().length === 0) {
      throw new RangeError("statement is blank");
    }
    if (statement.length < 1) {
      throw new RangeError(
        "expected len(statement) to be >= 1, was " + statement.length
      );
    }
    return statement;
  }

  private static validateUri(uri: string): string {
    if (uri == null) {
      throw new RangeError("uri is null or undefined");
    }
    return uri;
  }

  public readonly nickname: string;
  public readonly statement: string;
  public readonly uri: string;
}
