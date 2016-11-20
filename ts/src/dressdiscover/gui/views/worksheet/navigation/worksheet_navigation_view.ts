import _ = require("underscore");
import { AppRadio } from "dressdiscover/gui/app_radio";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureNavigationEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_navigation_event";
import { WorksheetFeatureSetModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_set_model";
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";

export class WorksheetNavigationView extends Marionette.ItemView<WorksheetModel> {
    constructor(options?: any) {
        super(_.extend(options, {
            template: _.template("")
        }));
        if (this.model.rootFeatureSets) {
            for (let featureSet of this.model.rootFeatureSets.models) {
                this._tree.push(this.__constructFeatureSetTree(featureSet));
            }
        }
    }

    onNodeSelected(event: any, node: any) {
        if (!node.feature) {
            return;
        }
        AppRadio.channel.trigger(WorksheetFeatureNavigationEvent.NAME, new WorksheetFeatureNavigationEvent({ feature: node.feature }));
    }

    private __constructFeatureSetTree(featureSet: WorksheetFeatureSetModel) {
        let tree: any = { text: featureSet.displayName };
        let nodes: any[] = [];
        if (featureSet.childFeatureSets) {
            for (let childFeatureSet of featureSet.childFeatureSets.models) {
                nodes.push(this.__constructFeatureSetTree(childFeatureSet));
            }
        }
        if (featureSet.features) {
            for (let feature of featureSet.features.models) {
                nodes.push({
                    feature: feature,
                    text: feature.displayName
                });
            }
        }
        if (nodes.length > 0) {
            tree["nodes"] = nodes;
        }
        return tree;
    }

    onBeforeShow() {
        (this.$el as any).treeview({
            data: this._tree,
            levels: 10,
            onNodeSelected: this.onNodeSelected
        });
    }

    private _tree: any[] = [];
}
