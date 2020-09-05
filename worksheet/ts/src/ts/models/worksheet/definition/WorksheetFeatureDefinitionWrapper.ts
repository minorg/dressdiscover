import {WorksheetFeatureDefinition} from "~/models/worksheet/definition/WorksheetFeatureDefinition";
import {AbstractDefinitionWrapper} from "~/models/worksheet/definition/AbstractDefinitionWrapper";
import {WorksheetDefinitionWrapper} from "~/models/worksheet/definition/WorksheetDefinitionWrapper";
import {WorksheetFeatureValueDefinitionWrapper} from "~/models/worksheet/definition/WorksheetFeatureValueDefinitionWrapper";

export class WorksheetFeatureDefinitionWrapper extends AbstractDefinitionWrapper<
  WorksheetFeatureDefinition,
  string
> {
  constructor(
    definition: WorksheetFeatureDefinition,
    root: WorksheetDefinitionWrapper
  ) {
    super(definition);
    for (let valueId of this.valueIds) {
      this.values.push(root.featureValueById(valueId));
    }
  }

  get valueIds() {
    return this.definition.valueIds;
  }

  readonly values: WorksheetFeatureValueDefinitionWrapper[] = [];
}
