/// <reference path="../../../../../../typings/index.d.ts" />

import Backbone = require("backbone");
import Mustache = require("mustache");
import AppModel = require("../models/app_model");
import AppRouter = require("../app_router");

declare function require(moduleName: string): any;

class AppView extends Backbone.View<AppModel> {
    model: AppModel;
    template: string;

    constructor(options?: any) {
        super(options);
        this.setElement($('#root'), true);
        this.template = require("raw!./app_view.html");

        //const router = new AppRouter.AppRouter();
        //Backbone.history.start();
    }

    render() {
        this.$el
            .html(Mustache.render(this.template, this.model.toJSON()));
//            .toggleClass('completed', this.model.get('completed'));
        //this.input = this.$('.todo-input');
        return this;
    }
}

export = AppView;
