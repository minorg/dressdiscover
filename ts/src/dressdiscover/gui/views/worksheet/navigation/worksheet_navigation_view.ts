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
        for (let featureSet of this.model.rootFeatureSet.childFeatureSets.models) {
            this._tree.push(this.__constructFeatureSetTree(featureSet));
        }
        _.bindAll(this, "onNodeSelected");
    }

    initialize() {
        this.listenTo(Application.instance.radio.globalChannel, WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
        this.listenTo(Application.instance.radio.globalChannel, WorksheetFeatureNavigationEvent.NAME, this.onFeatureNavigation);
    }

    onBeforeShow() {
        (this.$el as any).treeview({
            data: this._tree,
            levels: 0,
            onNodeSelected: this.onNodeSelected
        });
    }

    onFeatureInput(event: WorksheetFeatureInputEvent) {
        const treeview = this.__treeview;
        const nodeId = this._featureCidToNodeIdMap[event.feature.cid];
        const node = treeview.getNode(nodeId);
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

    onFeatureNavigation(event: WorksheetFeatureNavigationEvent) {
        const nodeId = this._featureCidToNodeIdMap[event.feature.cid];
        this.__treeview.selectNode(nodeId);
    }

    onNodeSelected(event: any, node: any) {
        if (node.feature) {
            Application.instance.radio.globalChannel.trigger(WorksheetFeatureNavigationEvent.NAME, new WorksheetFeatureNavigationEvent({ feature: node.feature }));
        } else {
            const treeview = this.__treeview;
            treeview.toggleNodeExpanded(node.nodeId, { silent: true });
            treeview.unselectNode(node.nodeId, { silent: true });
        }
        return true;
    }

    private __constructFeatureSetTree(featureSet: WorksheetFeatureSet) {
        const tree: any = { ddId: this._nodeId++, text: featureSet.displayName };
        
        const nodes: any[] = [];
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

    private get __treeview() {
        return (this.$el as any).treeview(true);
    }

    private _tree: any[] = [];
    private _nodeId: number = 0;
    private _featureCidToNodeIdMap: { [index: string]: number } = {};
}
