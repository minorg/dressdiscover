export class WorksheetFeatureValueId {
  public static parse(id: string): WorksheetFeatureValueId {
    if (id.trim().length === 0) {
      throw new RangeError("id is empty");
    }
    return new WorksheetFeatureValueId(id);
  }

  public equals(other?: WorksheetFeatureValueId): boolean {
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
