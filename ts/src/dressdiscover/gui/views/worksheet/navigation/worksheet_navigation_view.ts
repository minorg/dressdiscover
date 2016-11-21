import _ = require("underscore");
import { AppRadio } from "dressdiscover/gui/app_radio";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
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

    initialize() {
        this.listenTo(AppRadio.channel, WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
    }

    onFeatureInput(event: WorksheetFeatureInputEvent) {
        // TODO: need to work with the numeric node id, see #195
        // That means reproducing the algorithm for assigning node id's,
        // which appears to be depth-first: assign parent a node id, then assign all its children a node id,
        // then assign the next parent a node id, etc.
        // Currently this is not how our tree construction traverses.
        //let node = this._featureCidToTreeNodeMap[event.feature.cid];
        //if (!node) {
        //    throw new Error("node for feature " + event.feature.cid + " not found in map");
        //}
        //if (event.feature.currentState) {
        //    console.info("Check " + event.feature.id);
        //    node["icon"] = "glyphicon glyphicon-check";
        //} else {
        //    console.info("Uncheck " + event.feature.id);
        //    delete node["icon"];
        //}
        //let treeview = (this.$el as any).treeview(true);
    }

    onNodeSelected(event: any, node: any) {
        if (!node.feature) {
            return true;
        }
        AppRadio.channel.trigger(WorksheetFeatureNavigationEvent.NAME, new WorksheetFeatureNavigationEvent({ feature: node.feature }));
        return true;
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
                let node: any = {
                    feature: feature,
                    icon: feature.currentState ? "glyphicon glyphicon-check" : undefined,
                    text: feature.displayName,
                    state: {
                        selected: feature.selected
                    }
                };
                nodes.push(node);
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
