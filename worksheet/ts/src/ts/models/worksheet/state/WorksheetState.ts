import {WorksheetFeatureSetState} from "./WorksheetFeatureSetState";
import {WorksheetStateId} from "./WorksheetStateId";

export class WorksheetState {
  constructor(kwds: {
    ctime: Date;
    featureSets: WorksheetFeatureSetState[];
    id: WorksheetStateId;
    mtime: Date;
    text?: string;
  }) {
    this.ctimePrivate = WorksheetState.validateCtime(kwds.ctime);
    this.featureSetsPrivate = WorksheetState.validateFeatureSets(
      kwds.featureSets
    );
    this.idPrivate = WorksheetState.validateId(kwds.id);
    this.mtimePrivate = WorksheetState.validateMtime(kwds.mtime);
    this.textPrivate = WorksheetState.validateText(kwds.text);
  }

  get ctime(): Date {
    return this.ctimePrivate;
  }

  set ctime(ctime: Date) {
    this.ctimePrivate = WorksheetState.validateCtime(ctime);
  }

  get featureSets(): WorksheetFeatureSetState[] {
    return this.featureSetsPrivate;
  }

  set featureSets(featureSets: WorksheetFeatureSetState[]) {
    this.featureSetsPrivate = WorksheetState.validateFeatureSets(featureSets);
  }

  get id(): WorksheetStateId {
    return this.idPrivate;
  }

  set id(id: WorksheetStateId) {
    this.idPrivate = WorksheetState.validateId(id);
  }

  get mtime(): Date {
    return this.mtimePrivate;
  }

  set mtime(mtime: Date) {
    this.mtimePrivate = WorksheetState.validateMtime(mtime);
  }

  get text(): string | undefined {
    return this.textPrivate;
  }

  set text(text: string | undefined) {
    this.textPrivate = WorksheetState.validateText(text);
  }

  public deepCopy(): WorksheetState {
    return new WorksheetState({
      ctime: this.ctime,
      featureSets: this.featureSets.map((value0) => value0.deepCopy()),
      id: this.id,
      mtime: this.mtime,
      text: this.text,
    });
  }

  public equals(other: WorksheetState): boolean {
    if (!(this.ctime.getTime() === other.ctime.getTime())) {
      return false;
    }

    if (
      !((
        left: WorksheetFeatureSetState[],
        right: WorksheetFeatureSetState[]
      ): boolean => {
        if (left.length !== right.length) {
          return false;
        }
        for (let elementI = 0; elementI < left.length; elementI++) {
          if (!left[elementI].equals(right[elementI])) {
            return false;
          }
        }
        return true;
      })(this.featureSets, other.featureSets)
    ) {
      return false;
    }

    if (!this.id.equals(other.id)) {
      return false;
    }

    if (!(this.mtime.getTime() === other.mtime.getTime())) {
      return false;
    }

    if (this.text !== other.text) {
      return false;
    }

    return true;
  }

  public static fromThryftJsonObject(json: any): WorksheetState {
    let ctime: Date | undefined;
    let featureSets: WorksheetFeatureSetState[] | undefined;
    let id: WorksheetStateId | undefined;
    let mtime: Date | undefined;
    let text: string | undefined;
    for (const fieldName in json) {
      if (fieldName === "ctime") {
        ctime = new Date(json[fieldName]);
      } else if (fieldName === "feature_sets") {
        featureSets = json[fieldName].map((element: any) =>
          WorksheetFeatureSetState.fromThryftJsonObject(element)
        );
      } else if (fieldName === "id") {
        id = WorksheetStateId.parse(json[fieldName]);
      } else if (fieldName === "mtime") {
        mtime = new Date(json[fieldName]);
      } else if (fieldName === "text") {
        text = json[fieldName];
      }
    }
    if (ctime == null) {
      throw new TypeError("ctime is required");
    }
    if (featureSets == null) {
      throw new TypeError("featureSets is required");
    }
    if (id == null) {
      throw new TypeError("id is required");
    }
    if (mtime == null) {
      throw new TypeError("mtime is required");
    }
    return new WorksheetState({ctime, featureSets, id, mtime, text});
  }

  public toJsonObject(): {
    ctime: number;
    feature_sets: Array<{
      features: Array<{
        id: string;
        selected_value_ids: Array<string> | undefined;
        text: string | undefined;
      }>;
      id: string;
    }>;
    id: string;
    mtime: number;
    text: string | undefined;
  } {
    return {
      ctime: this.ctime.getTime(),
      feature_sets: this.featureSets.map((inElement) =>
        inElement.toJsonObject()
      ),
      id: this.id.toString(),
      mtime: this.mtime.getTime(),
      text: this.text != null ? this.text : undefined,
    };
  }

  public toString(): string {
    return "WorksheetState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
  }

  public toThryftJsonObject(): {
    ctime: number;
    feature_sets: Array<{
      features: Array<{
        id: string;
        selected_value_ids: Array<string> | undefined;
        text: string | undefined;
      }>;
      id: string;
    }>;
    id: string;
    mtime: number;
    text: string | undefined;
  } {
    return {
      ctime: this.ctime.getTime(),
      feature_sets: this.featureSets.map((inElement) =>
        inElement.toThryftJsonObject()
      ),
      id: this.id.toString(),
      mtime: this.mtime.getTime(),
      text: this.text != null ? this.text : undefined,
    };
  }

  private static validateCtime(ctime: Date): Date {
    if (ctime == null) {
      throw new RangeError("ctime is null or undefined");
    }
    return ctime;
  }

  private static validateFeatureSets(
    featureSets: WorksheetFeatureSetState[]
  ): WorksheetFeatureSetState[] {
    if (featureSets == null) {
      throw new RangeError("featureSets is null or undefined");
    }
    return featureSets;
  }

  private static validateId(id: WorksheetStateId): WorksheetStateId {
    if (id == null) {
      throw new RangeError("id is null or undefined");
    }
    return id;
  }

  private static validateMtime(mtime: Date): Date {
    if (mtime == null) {
      throw new RangeError("mtime is null or undefined");
    }
    return mtime;
  }

  private static validateText(text: string | undefined): string | undefined {
    if (text != null) {
      if (text.trim().length === 0) {
        throw new RangeError("text is blank");
      }
      if (text.length < 1) {
        throw new RangeError(
          "expected len(text) to be >= 1, was " + text.length
        );
      }
    }
    return text;
  }

  private ctimePrivate: Date;
  private featureSetsPrivate: WorksheetFeatureSetState[];
  private idPrivate: WorksheetStateId;
  private mtimePrivate: Date;
  private textPrivate?: string;
}
