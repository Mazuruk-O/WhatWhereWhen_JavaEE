package bean.intfc;

import bean.AllEnum.Language;

public interface Question{
    Question clone();
    Question clone(long newId);

    long getId();
    Language getLanguage();
    String getQuestion();
    String getHint();
    String getAnswer();

    void setLanguage(Language language);
    void setQuestion(String question);
    void setHint(String hint);
    void setAnswer(String answer);
}
