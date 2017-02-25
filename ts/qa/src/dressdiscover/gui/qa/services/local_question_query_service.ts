import { NoSuchQuestionException } from "dressdiscover/api/services/qa/no_such_question_exception";
import { Question } from "dressdiscover/api/models/qa/question";
import { QuestionId } from "dressdiscover/api/models/qa/question_id";
import { AsyncToSyncQuestionQueryService } from "dressdiscover/api/services/qa/async_to_sync_question_query_service";

declare var QUESTIONS: any[];

export class LocalQuestionQueryService extends AsyncToSyncQuestionQueryService {
    constructor() {
        super();
        for (let questionJson of QUESTIONS) {
            const question = Question.fromThryftJSON(questionJson);
            this._questionsById[question.id.toString()] = question;
        }
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

    private _questionsById: { [questionId: string]: Question } = {};
}