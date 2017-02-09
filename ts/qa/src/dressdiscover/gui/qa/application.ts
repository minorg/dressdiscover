import * as Sammy from "sammy";
import { UserIdInputView } from "dressdiscover/gui/qa/views/user_id_input_view";

export class Application {
    private constructor() {
        this.sammy.get('', (context: any) => {
            new UserIdInputView();
        });
        this.sammy.get('/:questionid', (context: any) => {
            alert("Question route");
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
