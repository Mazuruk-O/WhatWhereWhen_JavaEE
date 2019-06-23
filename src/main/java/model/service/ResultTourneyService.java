package model.service;

import bean.intfc.ResultTourney;
import bean.intfc.Team;
import bean.intfc.Tourney;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface ResultTourneyService {
    ResultTourney createOrUpdateResultTourney(String nameTourney, long id, Map<Team,Integer> numberRightAnswerTeam);
    ResultTourney deleteResultTourney(long id);
    List<Tourney> getTourneysByName(String nameTourney);
    List<Tourney> getTourneysByTeam(String nameTeam);
    List<Tourney> getTourneysById(long id);
}
