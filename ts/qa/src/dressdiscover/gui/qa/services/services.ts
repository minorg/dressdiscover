import { AnswerCommandService } from "dressdiscover/api/services/qa/answer_command_service";
import { AnswerQueryService } from "dressdiscover/api/services/qa/answer_query_service";
import { JsonRpcAnswerCommandService } from "dressdiscover/api/services/qa/json_rpc_answer_command_service";
import { JsonRpcAnswerQueryService } from "dressdiscover/api/services/qa/json_rpc_answer_Query_service";
import { LocalQaObjectQueryService } from "dressdiscover/gui/qa/services/local_qa_object_query_service";
import { LocalQuestionQueryService } from "dressdiscover/gui/qa/services/local_question_query_service";
import { LocalQuestionSetQueryService } from "dressdiscover/gui/qa/services/local_question_set_query_service";
import { QaObjectQueryService } from "dressdiscover/api/services/qa/qa_object_query_service";
import { QuestionQueryService } from "dressdiscover/api/services/qa/question_query_service";
import { QuestionSetQueryService } from "dressdiscover/api/services/qa/question_set_query_service";

export class Services {
    get answerCommandService() {
        return this._answerCommandService;
    }

    get answerQueryService() {
        return this._answerQueryService;
    }

    get objectQueryService() {
        return this._objectQueryService;
    }

    get questionQueryService() {
        return this._questionQueryService;
    }

    get questionSetQueryService() {
        return this._questionSetQueryService;
    }

    private _answerCommandService: AnswerCommandService = new JsonRpcAnswerCommandService("http://api.dressdiscover.org");
    private _answerQueryService: AnswerQueryService = new JsonRpcAnswerQueryService("http://api.dressdiscover.org");
    private _objectQueryService: QaObjectQueryService = new LocalQaObjectQueryService();
    private _questionQueryService: QuestionQueryService = new LocalQuestionQueryService();
    private _questionSetQueryService: QuestionSetQueryService = new LocalQuestionSetQueryService();
}
