package model.service;

import bean.AllEnum.Language;
import bean.intfc.Question;
import model.repository.Repository;
import model.repository.RepositoryQuestion;

import java.sql.Connection;
import java.util.List;

public class QuestionServiceImpl implements QuestionService {
    private Repository<Question> questionRepositoty;
    private Connection connection;

    public QuestionServiceImpl(Connection connection) {
        this.connection = connection;
        this.questionRepositoty = new RepositoryQuestion(connection);
    }

    public void setQuestionRepositoty(Repository<Question> questionRepository) {
        this.questionRepositoty = questionRepository;
        this.questionRepositoty.setConnection(connection);
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
        questionRepositoty.setConnection(connection);
    }

    @Override
    public Question deleteQuestion(String question) {
        return null;
    }

    @Override
    public Question createOrUpdateQuestion(String question) {
        return null;
    }

    @Override
    public Question getQuestionByText(String text) {
        return null;
    }

    @Override
    public List<Question> getQuestionByLanguage(Language language, int countQuestion) {
        return null;
    }
}
