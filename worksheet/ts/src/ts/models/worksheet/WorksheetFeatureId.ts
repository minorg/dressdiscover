export class WorksheetFeatureId {
  public static parse(id: string): WorksheetFeatureId {
    if (id.trim().length === 0) {
      throw new RangeError("id is empty");
    }
    return new WorksheetFeatureId(id);
  }

  public equals(other?: WorksheetFeatureId): boolean {
    if (typeof other === "undefined") {
      return false;
    }
    return this.id === other.id;
  }

  public toString(): string {
    return this.id;
  }

  private constructor(private readonly id: string) {}
}
