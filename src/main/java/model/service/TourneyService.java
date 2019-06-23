package model.service;

import bean.AllEnum.TypeTeam;
import bean.intfc.Question;
import bean.intfc.Team;
import bean.intfc.Tourney;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

public interface TourneyService {
    Tourney deleteTourney(long id);
    Tourney createOrUpdateTourney(String nameTourey, Date dateBegin, int numberQuestion, TypeTeam typeTeam, Collection<Team> teams, Collection<Question> questions);
    Tourney getTourneyById(long id);
    List<Tourney> getTourneyByName(String name);
}
