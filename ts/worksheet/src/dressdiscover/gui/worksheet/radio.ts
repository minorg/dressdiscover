import "../../../../node_modules/backbone.radio/build/backbone.radio.js";

declare namespace Backbone {
    var Radio: any;
}

export class Radio {
    get globalChannel(): any {
        return this._globalChannel;
    }

    private _globalChannel = Backbone.Radio.channel("global");
}
