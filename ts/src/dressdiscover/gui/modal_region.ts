import Marionette = require("backbone.marionette");

export class ModalRegion extends Marionette.Region {
    constructor() {
        super({ el: "#modal" } as any);
        (this as any)._ensureElement();
    }

    getEl(selector: any): any {
        var $el = $(selector);
        $el.on("hidden", this.empty);
        return $el;
    }

    onEmpty() {
        (this as any).$el.modal('hide');
    }

    onShow() {
        (this as any).$el.on('hidden', { region: this }, (event: any) => {
            event.data.region.close();
        });
        (this as any).$el.modal('show');
    }
}
