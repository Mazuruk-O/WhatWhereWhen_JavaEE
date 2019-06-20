package bean;

import bean.AllEnum.Language;
import bean.intfc.Question;

import java.io.Serializable;

public class QuestionImpl implements Question, Serializable, Cloneable {
    public static final Question NULL_QUESTION = new QuestionImpl();
    private long id;
    private String question;
    private String hint;
    private String answer;
    private Language language;

    public QuestionImpl(long id, String question, String hint, String answer, Language language) {
        this.id = id;
        this.question = question;
        this.hint = hint;
        this.answer = answer;
        this.language = language;
        return;
    }

    public QuestionImpl() {
        this.id = 0;
        this.question = "";
        this.hint = "";
        this.answer = "";
        this.language = Language.values()[0];
        return;
    }

    @Override
    public Question clone() {
        try {
            return (Question) super.clone();
        } catch (CloneNotSupportedException ignored) {
            return NULL_QUESTION;
        }
    }

    @Override
    public Question clone(long newId) {
        if (this == NULL_QUESTION) return NULL_QUESTION;

        return new QuestionImpl(newId, question, hint, answer, language);
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String getHint() {
        return hint;
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public Language getLanguage() {
        return language;
    }

    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public void setLanguage(Language language) {
        this.language = language;
    }
}
