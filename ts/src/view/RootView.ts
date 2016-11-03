/// <reference path="../../typings/index.d.ts" />

import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import RootModel = require("../model/RootModel");

declare var require: (moduleId: string) => any;

export class RootView extends Marionette.LayoutView<RootModel.RootModel> {
    el: "body";

    protected template: (params?: any) => string;

    initialize(options: any = {}) {
        this.template = require('text!../template/RootView.html');
        alert("Hello " + this.template);
        //options.model.on("change", this.updateFullName.bind(this));
    }
}
