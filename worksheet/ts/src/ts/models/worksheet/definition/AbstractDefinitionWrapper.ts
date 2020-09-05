import {WorksheetDescription} from "~/models/worksheet/definition/WorksheetDescription";

export abstract class AbstractDefinitionWrapper<
  DefinitionT extends {
    readonly description?: WorksheetDescription;
    readonly displayNameEn: string;
    readonly id: string;
  }
> {
  constructor(public readonly definition: DefinitionT) {}

  get description() {
    return this.definition.description;
  }

  get displayName() {
    return this.definition.displayNameEn;
  }

  get id() {
    return this.definition.id;
  }
}
