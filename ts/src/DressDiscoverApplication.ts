/// <reference path="../typings/index.d.ts" />
/// <reference path="view/RootView" />

import Marionette = require("backbone.marionette");
import RootView = require("./view/RootView");

export class DressDiscoverApplication extends Marionette.Application {
    contentRegion: Marionette.Region;

    constructor() {
        super();
        this.on("initialize:after", this.initializeAfter);
        this.addRegions({ contentRegion: "#content" });
    }

    initializeAfter() {
        this.contentRegion.show(new RootView.RootView());
    }
}
