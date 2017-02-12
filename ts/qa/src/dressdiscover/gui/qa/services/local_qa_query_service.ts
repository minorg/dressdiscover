import { Answer } from "dressdiscover/api/models/qa/answer";
import { QaObject } from "dressdiscover/api/models/qa/qa_object";
import { Question } from "dressdiscover/api/models/qa/question";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
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
            this._questionsById[question.id] = question;
        }
        for (let questionSetJson of QUESTION_SETS) {
            this._questionSets.push(QuestionSet.fromThryftJSON(questionSetJson));
        }
    }

    getAnswersSync(kwds: { objectId: string, questionSetId: string, questionIds?: string[], userId?: string }): Answer[] {
        return [];
    }

    getObjectsSync(): QaObject[] {
        return this._objects;
    }

    getQuestionSetsSync(kwds: { ids: string[] }): QuestionSet[] {
        return this._questionSets;
    }

    private _objects: QaObject[] = [];
    private _questionsById: { [questionId: string]: Question } = {};
    private _questionSets: QuestionSet[] = [];
}