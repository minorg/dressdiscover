import * as _ from "underscore";
import * as Backbone from "backbone";
import * as Marionette from "backbone.marionette";
import "./home_content_view.less";

declare function require(moduleName: string): any;

export class HomeContentView extends Marionette.ItemView<Backbone.Model> {
    constructor(options?: any) {
        super(_.extend({
            model: new Backbone.Model(),
            template: _.template(require("raw!./home_content_view.html"))
        }));
    }
}
