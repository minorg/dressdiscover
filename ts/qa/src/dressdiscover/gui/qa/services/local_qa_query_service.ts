import { Answer } from "dressdiscover/api/models/qa/answer";
import { NoSuchObjectException } from "dressdiscover/api/services/qa/no_such_object_exception";
import { NoSuchQuestionException } from "dressdiscover/api/services/qa/no_such_question_exception";
import { NoSuchQuestionSetException } from "dressdiscover/api/services/qa/no_such_question_set_exception";
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
            const object = QaObject.fromThryftJSON(objectJson);
            this._objects.push(object);
            this._objectsById[object.id.toString()] = object;
        }
        for (let questionJson of QUESTIONS) {
            const question = Question.fromThryftJSON(questionJson);
            this._questionsById[question.id.toString()] = question;
        }
        for (let questionSetJson of QUESTION_SETS) {
            const questionSet = QuestionSet.fromThryftJSON(questionSetJson);
            this._questionSetsById[questionSet.id.toString()] = questionSet;
        }
    }

    getAnswersSync(kwds: { objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId }): Answer[] {
        return [];
    }

    getObjectByIdSync(kwds: { id: QaObjectId }): QaObject {
        const object = this._objectsById[kwds.id.toString()];
        if (object) {
            return object;
        } else {
            throw new NoSuchObjectException(kwds.id);
        }
    }

    getObjectsSync(): QaObject[] {
        return this._objects;
    }

    getQuestionsSync(kwds: { ids: QuestionId[] }): Question[] {
        const result: Question[] = [];
        for (let id of kwds.ids) {
            const question = this._questionsById[id.toString()];
            if (!question) {
                throw new NoSuchQuestionException(id);
            }
            result.push(question);
        }
        return result;
    }

    getQuestionSetsSync(kwds: { ids: QuestionSetId[] }): QuestionSet[] {
        const result: QuestionSet[] = [];
        for (let id of kwds.ids) {
            const questionSet = this._questionSetsById[id.toString()];
            if (!questionSet) {
                throw new NoSuchQuestionSetException(id);
            }
            result.push(questionSet);
        }
        return result;
    }

    private _objects: QaObject[] = [];
    private _objectsById: { [objectId: string]: QaObject } = {};
    private _questionsById: { [questionId: string]: Question } = {};
    private _questionSetsById: { [questionSetId: string]: QuestionSet } = {};
}