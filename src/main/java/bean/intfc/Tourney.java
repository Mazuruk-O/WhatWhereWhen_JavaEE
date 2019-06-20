package bean.intfc;

import bean.AllEnum.TypeTeam;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

public interface Tourney {
    Tourney clone();
    Tourney clone(long newId);

    long getId();
    String getNameTourney();
    Date getDateBeginTourney();
    long getNumberQuestion();
    TypeTeam getTypeTeam();
    User getUserCreator();
    Collection<Team> getTeams();
    Collection<Question> getQuestions();

    void setNameTourney(String naeTourney);
    void setDateBeginTourney(Date dateBeginTourney);
    void setNumberQuestion(long numberQuestion);
    void setTypeTeam(TypeTeam typeTeam);
    void setUserCreator(User creatorTourney);
    void setTeams(Collection<Team> teams);
    void setQuestions(Collection<Question> questions);

}
