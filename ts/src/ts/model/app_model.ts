/// <reference path="../../../typings/index.d.ts" />

import Backbone = require("backbone");

class AppModel extends Backbone.Model {
    toJSON(): any {
        return {};
    }
}

export = AppModel;
