import { NoSuchQuestionSetException } from "dressdiscover/api/services/qa/no_such_question_set_exception";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
import { QuestionSetId } from "dressdiscover/api/models/qa/question_set_id";
import { AsyncToSyncQuestionSetQueryService } from "dressdiscover/api/services/qa/async_to_sync_question_set_query_service";

declare var QUESTION_SETS: any[];

export class LocalQuestionSetQueryService extends AsyncToSyncQuestionSetQueryService {
    constructor() {
        super();
        for (let questionSetJson of QUESTION_SETS) {
            const questionSet = QuestionSet.fromThryftJSON(questionSetJson);
            this._questionSetsById[questionSet.id.toString()] = questionSet;
        }
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

    private _questionSetsById: { [questionSetId: string]: QuestionSet } = {};
}
