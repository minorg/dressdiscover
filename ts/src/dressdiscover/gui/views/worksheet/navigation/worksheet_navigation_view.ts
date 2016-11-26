import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import { WorksheetFeatureNavigationEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_navigation_event";
import { WorksheetFeatureSet } from "dressdiscover/gui/models/worksheet/worksheet_feature_set";
import { Worksheet } from "dressdiscover/gui/models/worksheet/worksheet";

export class WorksheetNavigationView extends Marionette.ItemView<Worksheet> {
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
        this.listenTo(Application.instance.radio.globalChannel, WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
    }

    onFeatureInput(event: WorksheetFeatureInputEvent) {
        let treeview = (this.$el as any).treeview(true);
        let nodeId = this._featureCidToNodeIdMap[event.feature.cid];
        let node = treeview.getNode(nodeId);
        if (node.feature.id != event.feature.id) {
            throw new Error("map mismatch");
        }
        if (event.feature.currentState) {
            node["icon"] = "glyphicon glyphicon-check";
        } else {
            delete node["icon"];
        }
        treeview.selectNode(nodeId); // Force re-render
    }

    onNodeSelected(event: any, node: any) {
        if (!node.feature) {
            return true;
        }
        Application.instance.radio.globalChannel.trigger(WorksheetFeatureNavigationEvent.NAME, new WorksheetFeatureNavigationEvent({ feature: node.feature }));
        return true;
    }

    private __constructFeatureSetTree(featureSet: WorksheetFeatureSet) {
        let tree: any = { ddId: this._nodeId++, text: featureSet.displayName };
        
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
                    ddId: this._nodeId++,
                    icon: feature.currentState ? "glyphicon glyphicon-check" : undefined,
                    text: feature.displayName,
                    state: {
                        selected: feature.selected
                    }
                };
                this._featureCidToNodeIdMap[feature.cid] = node.ddId;
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
    private _nodeId: number = 0;
    private _featureCidToNodeIdMap: { [index: string]: number } = {};
}
