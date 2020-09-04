export class WorksheetStateId {
  public static parse(id: string): WorksheetStateId {
    if (id.trim().length === 0) {
      throw new RangeError("id is empty");
    }
    return new WorksheetStateId(id);
  }

  public equals(other?: WorksheetStateId): boolean {
    if (typeof other === "undefined") {
      return false;
    }
    return this.id === other.id;
  }

  public toString(): string {
    return this.id;
  }

  private constructor(id: string) {
    this.id = id;
  }

  private id: string;
}
