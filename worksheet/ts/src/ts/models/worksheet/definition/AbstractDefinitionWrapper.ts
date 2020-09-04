import {WorksheetDescription} from "~/models/worksheet/definition/WorksheetDescription";

interface Definition<IdT> {
  readonly description?: WorksheetDescription;
  readonly displayNameEn: string;
  readonly id: IdT;
}

export abstract class AbstractDefinitionWrapper<
  DefinitionT extends Definition<IdT>,
  IdT
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
