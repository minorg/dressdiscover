import Marionette = require("backbone.marionette");

export class ModalRegion extends Marionette.Region {
    constructor() {
        super({ el: "#modal" } as any);
        (this as any)._ensureElement();
        (this as any).$el.on("hidden", { region: this }, (event: any) => {
            event.data.region.close();
        });
    }

    onShow() {
        (this as any).$el.modal('show');
    }

    onClose() {
        (this as any).$el.modal('hide');
    }
}
