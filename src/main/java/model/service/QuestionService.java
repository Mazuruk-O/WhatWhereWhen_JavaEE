package model.service;

import bean.AllEnum.Language;
import bean.intfc.Question;

import java.util.List;

public interface QuestionService {
    Question deleteQuestion(String question);
    Question createOrUpdateQuestion(String question);
    Question getQuestionByText(String text);
    List<Question> getQuestionByLanguage(Language language, int countQuestion);
}
