// <amd-dependency path="text!../template/UserView.html" />
/// <reference path="../../typings/index.d.ts" />

import Backbone = require("backbone");
import RootModel = require("../model/RootModel");

declare var require: (moduleId: string) => any;

export class RootView extends Backbone.View<RootModel.RootModel> {
    protected template: (params?: any) => string;

    initialize(options: any = {}) {
        this.template = require("../template/UserView.html");
        //options.model.on("change", this.updateFullName.bind(this));
    }
}
