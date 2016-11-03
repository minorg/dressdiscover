/// <reference path="../../typings/index.d.ts" />

import Backbone = require("backbone");

export class AppModel extends Backbone.Model {
    toJSON(): any {
        return {};
    }
}
