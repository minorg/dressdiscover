/// <reference path="../typings/index.d.ts" />
/// <reference path="view/RootView" />

import Marionette = require("backbone.marionette");
import RootView = require("./view/RootView");

export class DressDiscoverApplication extends Marionette.Application {
    constructor() {
        super();
        this.rootView = new RootView.RootView();
    }

    rootView: RootView.RootView;
}
