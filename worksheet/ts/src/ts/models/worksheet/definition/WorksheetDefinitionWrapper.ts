import {WorksheetDefinition} from "~/models/worksheet/definition/WorksheetDefinition";
import {WorksheetFeatureId} from "~/models/worksheet/WorksheetFeatureId";
import {WorksheetFeatureSetId} from "~/models/worksheet/WorksheetFeatureSetId";
import {WorksheetFeatureValueId} from "~/models/worksheet/WorksheetFeatureValueId";
import {NoSuchWorksheetFeatureDefinitionException} from "~/services/worksheet/definition/NoSuchWorksheetFeatureDefinitionException";
import {NoSuchWorksheetFeatureSetDefinitionException} from "~/services/worksheet/definition/NoSuchWorksheetFeatureSetDefinitionException";
import {NoSuchWorksheetFeatureValueDefinitionException} from "~/services/worksheet/definition/NoSuchWorksheetFeatureValueDefinitionException";
import {WorksheetFeatureDefinitionWrapper} from "~/models/worksheet/definition/WorksheetFeatureDefinitionWrapper";
import {WorksheetFeatureSetDefinitionWrapper} from "~/models/worksheet/definition/WorksheetFeatureSetDefinitionWrapper";
import {WorksheetFeatureValueDefinitionWrapper} from "~/models/worksheet/definition/WorksheetFeatureValueDefinitionWrapper";

export class WorksheetDefinitionWrapper {
  constructor(readonly definition: WorksheetDefinition) {
    // Order is important
    for (const featureValue of definition.featureValues) {
      this.featureValues.push(
        new WorksheetFeatureValueDefinitionWrapper(featureValue)
      );
    }
    for (const feature of definition.features) {
      this.features.push(new WorksheetFeatureDefinitionWrapper(feature, this));
    }
    for (const featureSet of definition.featureSets) {
      this.featureSets.push(
        new WorksheetFeatureSetDefinitionWrapper(featureSet, this)
      );
    }
  }

  featureSetById(
    featureSetId: WorksheetFeatureSetId
  ): WorksheetFeatureSetDefinitionWrapper {
    for (const featureSetDefinition of this.featureSets) {
      if (featureSetDefinition.id.equals(featureSetId)) {
        return featureSetDefinition;
      }
    }
    throw new NoSuchWorksheetFeatureSetDefinitionException({id: featureSetId});
  }

  featureById(
    featureId: WorksheetFeatureId
  ): WorksheetFeatureDefinitionWrapper {
    for (const featureDefinition of this.features) {
      if (featureDefinition.id.equals(featureId)) {
        return featureDefinition;
      }
    }
    throw new NoSuchWorksheetFeatureDefinitionException({id: featureId});
  }

  featureValueById(
    featureValueId: WorksheetFeatureValueId
  ): WorksheetFeatureValueDefinitionWrapper {
    for (const featureValueDefinition of this.featureValues) {
      if (featureValueDefinition.id.equals(featureValueId)) {
        return featureValueDefinition;
      }
    }
    throw new NoSuchWorksheetFeatureValueDefinitionException({
      id: featureValueId,
    });
  }

  // getNextFeatureId(kwds: { currentFeatureId: WorksheetFeatureId, currentFeatureSetDefinition: WorksheetFeatureSetDefinition }): WorksheetFeatureId | undefined {
  //     let currentFeatureIndex: number = 0;
  //     for (; currentFeatureIndex < kwds.currentFeatureSetDefinition.featureIds.length; currentFeatureIndex++) {
  //         if (kwds.currentFeatureSetDefinition.featureIds[currentFeatureIndex].equals(kwds.currentFeatureId)) {
  //             break;
  //         }
  //     }
  //     if (currentFeatureIndex == kwds.currentFeatureSetDefinition.featureIds.length) {
  //         throw new NoSuchWorksheetFeatureDefinitionException({ id: kwds.currentFeatureId });
  //     }

  //     if (currentFeatureIndex + 1 < kwds.currentFeatureSetDefinition.featureIds.length) {
  //         return kwds.currentFeatureSetDefinition.featureIds[currentFeatureIndex + 1];
  //     } else {
  //         return undefined;
  //     }
  // }

  // getNextFeatureSetId(kwds: { currentFeatureSetId: WorksheetFeatureSetId, featureSetIds: WorksheetFeatureSetId[] }) {
  //     let currentFeatureSetIndex: number = 0;
  //     for (; currentFeatureSetIndex < kwds.featureSetIds.length; currentFeatureSetIndex++) {
  //         if (kwds.featureSetIds[currentFeatureSetIndex].equals(kwds.currentFeatureSetId)) {
  //             break;
  //         }
  //     }
  //     if (currentFeatureSetIndex == kwds.featureSetIds.length) {
  //         throw new NoSuchWorksheetFeatureSetDefinitionException({ id: kwds.currentFeatureSetId });
  //     }

  //     if (currentFeatureSetIndex + 1 < kwds.featureSetIds.length) {
  //         return kwds.featureSetIds[currentFeatureSetIndex + 1];
  //     } else {
  //         return undefined;
  //     }
  // }

  readonly featureSets: WorksheetFeatureSetDefinitionWrapper[] = [];
  readonly featureValues: WorksheetFeatureValueDefinitionWrapper[] = [];
  readonly features: WorksheetFeatureDefinitionWrapper[] = [];
}
