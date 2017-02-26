package org.dressdiscover.lib.services.qa;

import org.bson.types.ObjectId;
import org.dressdiscover.api.models.qa.Answer;
import org.dressdiscover.api.models.qa.AnswerValue;
import org.dressdiscover.api.models.qa.QaObjectId;
import org.dressdiscover.api.models.qa.QaUserId;
import org.dressdiscover.api.models.qa.QuestionId;
import org.dressdiscover.api.models.qa.QuestionSetId;
import org.dressdiscover.api.services.qa.AnswerCommandService;
import org.dressdiscover.lib.services.ServiceTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public final class AnswerCommandServiceTest extends ServiceTest {
    private static Answer __newAnswer() {
        return Answer.builder().setObjectId(QaObjectId.parse(new ObjectId().toString()))
                .setQuestionId(QuestionId.parse(new ObjectId().toString()))
                .setQuestionSetId(QuestionSetId.parse(new ObjectId().toString()))
                .setUserId(QaUserId.parse(new ObjectId().toString()))
                .setValues(ImmutableList.of(AnswerValue.builder().setValueString("test").build())).build();
    }

    @Before
    public void setUp() throws Exception {
        answerCommandService = _getInjector().getInstance(AnswerCommandService.class);
        tearDown();
    }

    @After
    public void tearDown() throws Exception {
        answerCommandService.deleteAnswers();
    }

    @Test
    public void testPutAnswer() throws Exception {
        answerCommandService.putAnswer(__newAnswer());
    }

    @Test
    public void testPutAnswerOverwrite() throws Exception {
        final Answer answer = __newAnswer();
        answerCommandService.putAnswer(answer);
        answerCommandService.putAnswer(answer); // Overwrite
    }

    private AnswerCommandService answerCommandService;
}
