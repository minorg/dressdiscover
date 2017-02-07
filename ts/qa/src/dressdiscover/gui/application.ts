import * as Sammy from "sammy";

export class Application {
    private constructor() {
        this.sammy.get('', (context: any) => {
            alert("Default route");
            ////doStuff 
            //var baz = context.params.foobar;
        });
    }

    static get instance() {
        return Application._instance;
    }

    run() {
        this.sammy.run();
    }

    private sammy: Sammy.Application = Sammy();
    private static _instance: Application = new Application();
}

$(() => {
    Application.instance.run();
});
