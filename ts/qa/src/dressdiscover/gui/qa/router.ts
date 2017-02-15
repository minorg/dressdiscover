import * as Sammy from "sammy";
import * as _ from "underscore";
import { Application } from "dressdiscover/gui/qa/application";
import { ObjectsView } from "dressdiscover/gui/qa/views/objects_view";
import { ObjectsViewModel } from "dressdiscover/gui/qa/view_models/objects_view_model";
import { QaObjectId } from "dressdiscover/api/models/qa/qa_object_id";
import { QuestionId } from "dressdiscover/api/models/qa/question_id";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
import { QuestionSetId } from "dressdiscover/api/models/qa/question_set_id";
import { UserIdInputView } from "dressdiscover/gui/qa/views/user_id_input_view";

export class Router {
    constructor() {
        const self = this;
        this._sammy.get('', (context: any) => {
            self.onGetRoot(context);
        });
        this._sammy.get('#/question/:objectId/:questionSetId/:questionId', (context: any) => {
            self.onGetQuestion(context);
        });
    }

    private checkAuthentication(onSuccess: () => void) {
        if (Application.instance.session.currentUserId) {
            onSuccess();
        } else {
            new UserIdInputView(onSuccess).show();
        }       
    }

    private onGetRoot(context: any) {
        this.checkAuthentication(() => {
            const objects = Application.instance.services.queryService.getObjectsSync();

            const questionSetIds: { [index: string]: QuestionSetId } = {};
            for (let object of objects) {
                for (let questionSetId of object.questionSetIds) {
                    if (!(questionSetId.toString() in questionSetIds)) {
                        questionSetIds[questionSetId.toString()] = questionSetId;
                    }
                }
            }

            const questionSets = Application.instance.services.queryService.getQuestionSetsSync({ ids: _.values(questionSetIds) });
            const questionSetsById: { [index: string]: QuestionSet } = {};
            for (let questionSet of questionSets) {
                questionSetsById[questionSet.id.toString()] = questionSet;
            }

            new ObjectsView(new ObjectsViewModel(objects, questionSetsById)).show();
        });
    }

    goToQuestionSet(objectId: QaObjectId, questionSetId: QuestionSetId) {
    
    }

    goToQuestion(objectId: QaObjectId, questionId: QuestionId, questionSetId: QuestionSetId) {
    }

    run() {
        this._sammy.run();
    }

    private onGetQuestion(context: any) {
        this.checkAuthentication(() => {
        
        });
    }

    private _sammy: Sammy.Application = Sammy();
}