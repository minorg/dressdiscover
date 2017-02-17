import * as Sammy from "sammy";
import * as _ from "underscore";
import { Application } from "dressdiscover/gui/qa/application";
import { ObjectsView } from "dressdiscover/gui/qa/views/objects_view";
import { ObjectsViewModel } from "dressdiscover/gui/qa/view_models/objects_view_model";
import { QaObjectId } from "dressdiscover/api/models/qa/qa_object_id";
import { Question } from "dressdiscover/api/models/qa/question";
import { QuestionId } from "dressdiscover/api/models/qa/question_id";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
import { QuestionSetId } from "dressdiscover/api/models/qa/question_set_id";
import { QuestionView } from "dressdiscover/gui/qa/views/question_view";
import { QuestionViewModel } from "dressdiscover/gui/qa/view_models/question_view_model";
import { UserIdInputView } from "dressdiscover/gui/qa/views/user_id_input_view";

export class Router {
    constructor() {
        const self = this;
        this._sammy.get('#/question/:objectId/:questionSetId/:questionId', (context: any) => {
            self.onGetQuestion(context);
        });
        this._sammy.get('#/question/:objectId/:questionSetId', (context: any) => {
            self.onGetQuestion(context);
        });
        this._sammy.get('', (context: any) => {
            self.onGetRoot(context);
        });
    }

    private checkAuthentication(onSuccess: () => void) {
        if (Application.instance.session.currentUserId) {
            onSuccess();
        } else {
            new UserIdInputView(onSuccess).show();
        }       
    }

    goToQuestion(objectId: QaObjectId, questionId: QuestionId, questionSetId: QuestionSetId) {
        this._sammy.setLocation("#/question/" + objectId.toString() + "/" + questionSetId.toString() + "/" + questionId.toString());
    }

    goToQuestionSet(objectId: QaObjectId, questionSetId: QuestionSetId) {
        this._sammy.setLocation("#/question/" + objectId.toString() + "/" + questionSetId.toString());
    }

    run() {
        this._sammy.run();
    }

    private onGetQuestion(context: any) {
        this.checkAuthentication(() => {
            const objectId = QaObjectId.parse(context.params.objectId);
            const questionSetId = QuestionSetId.parse(context.params.questionSetId);

            const object = Application.instance.services.queryService.getObjectByIdSync({ id: objectId });
            const questionSet = Application.instance.services.queryService.getQuestionSetsSync({ ids: [questionSetId] })[0];
            const questions = Application.instance.services.queryService.getQuestionsSync({ ids: questionSet.questionIds });

            var currentQuestion: Question | undefined;
            if (context.params.questionId) {
                const currentQuestionId = QuestionId.parse(context.params.questionId);
                currentQuestion = Application.instance.services.queryService.getQuestionsSync({ ids: [currentQuestionId] })[0];
            }

            new QuestionView(new QuestionViewModel(object, questionSet, questions, currentQuestion)).show();
        });
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

    private _sammy: Sammy.Application = Sammy();
}