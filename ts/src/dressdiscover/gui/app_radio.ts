//import Backbone = require("backbone");
import "../../../node_modules/backbone.radio/build/backbone.radio.js";

declare namespace Backbone {
    var Radio: any;
}

export class AppRadio {
    static get channel(): any {
        return AppRadio._channel;
    }

    private static _channel = Backbone.Radio.channel("global");
}
