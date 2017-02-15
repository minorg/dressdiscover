import { Answer } from "dressdiscover/api/models/qa/answer";
import { QaObject } from "dressdiscover/api/models/qa/qa_object";
import { QaObjectId } from "dressdiscover/api/models/qa/qa_object_id";
import { QaUserId } from "dressdiscover/api/models/qa/qa_user_id";
import { Question } from "dressdiscover/api/models/qa/question";
import { QuestionId } from "dressdiscover/api/models/qa/question_id";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
import { QuestionSetId } from "dressdiscover/api/models/qa/question_set_id";
import { AsyncToSyncQaQueryService } from "dressdiscover/api/services/qa/async_to_sync_qa_query_service";

declare var OBJECTS: any[];
declare var QUESTIONS: any[];
declare var QUESTION_SETS: any[];

export class LocalQaQueryService extends AsyncToSyncQaQueryService {
    constructor() {
        super();
        for (let objectJson of OBJECTS) {
            this._objects.push(QaObject.fromThryftJSON(objectJson));
        }
        for (let questionJson of QUESTIONS) {
            const question = Question.fromThryftJSON(questionJson);
            this._questionsById[question.id.toString()] = question;
        }
        for (let questionSetJson of QUESTION_SETS) {
            this._questionSets.push(QuestionSet.fromThryftJSON(questionSetJson));
        }
    }

    getAnswersSync(kwds: { objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId }): Answer[] {
        return [];
    }

    getObjectsSync(): QaObject[] {
        return this._objects;
    }

    getQuestionSetsSync(kwds: { ids: QuestionSetId[] }): QuestionSet[] {
        const result: QuestionSet[] = [];
        for (let id of kwds.ids) {
            for (let questionSet of this._questionSets) {
                if (questionSet.id.toString() === id.toString()) {
                    result.push(questionSet);
                }
            }
        }
        return result;
    }

    private _objects: QaObject[] = [];
    private _questionsById: { [questionId: string]: Question } = {};
    private _questionSets: QuestionSet[] = [];
}