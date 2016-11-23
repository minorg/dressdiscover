import Marionette = require("backbone.marionette");

export class ModalRegion extends Marionette.Region {
    constructor() {
        super({ el: "#modal" } as any);
        (this as any)._ensureElement();
    }

    getEl(selector: any): any {
        var $el = $(selector);
        $el.on("hidden.bs.modal", this.empty);
        return $el;
    }

    onEmpty() {
        (this as any).$el.modal('hide');
    }

    onShow() {
        (this as any).$el.on('hidden.bs.modal', { region: this }, (event: any) => {
            event.data.region.empty();
        });
        (this as any).$el.modal('show');
    }
}
