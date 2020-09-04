import {WorksheetFeatureValueDefinition} from "~/models/worksheet/definition/WorksheetFeatureValueDefinition";
import {WorksheetFeatureValueId} from "~/models/worksheet/WorksheetFeatureValueId";
import {AbstractDefinitionWrapper} from "~/models/worksheet/definition/AbstractDefinitionWrapper";

export class WorksheetFeatureValueDefinitionWrapper extends AbstractDefinitionWrapper<
  WorksheetFeatureValueDefinition,
  WorksheetFeatureValueId
> {
  get image() {
    return this.definition.image;
  }
}
