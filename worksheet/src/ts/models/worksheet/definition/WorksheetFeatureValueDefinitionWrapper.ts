import {WorksheetFeatureValueDefinition} from "~/models/worksheet/definition/WorksheetFeatureValueDefinition";
import {AbstractDefinitionWrapper} from "~/models/worksheet/definition/AbstractDefinitionWrapper";

export class WorksheetFeatureValueDefinitionWrapper extends AbstractDefinitionWrapper<
  WorksheetFeatureValueDefinition
> {
  get image() {
    return this.definition.image;
  }
}
