package model.service;

import bean.AllEnum.TypeTeam;
import bean.intfc.Team;
import bean.intfc.User;

import java.util.Collection;
import java.util.List;

public interface TeamService {
    Team deleteTeam(long id);
    Team createOrUpdateTeam(String nameTeam, User captain, TypeTeam typeTeam, Collection<User> member);
    List<Team> getTeamsByName(String nameTeam);
    Team getTeamById(long id);
}
