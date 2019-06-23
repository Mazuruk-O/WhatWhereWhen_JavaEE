package model.service;

import bean.AllEnum.TypeTeam;
import bean.intfc.Team;
import bean.intfc.User;
import model.repository.Repository;
import model.repository.RepositoryTeam;

import java.sql.Connection;
import java.util.Collection;
import java.util.List;

public class TeamServiceImpl implements TeamService{
    private Connection connection;
    private Repository<Team> teamRepository;

    public TeamServiceImpl(Connection connection) {
        this.connection = connection;
        this.teamRepository = new RepositoryTeam(connection);
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
        teamRepository.setConnection(connection);
    }

    public void setTeamRepository(Repository<Team> teamRepository) {
        this.teamRepository = teamRepository;
        this.teamRepository.setConnection(connection);
    }

    @Override
    public Team deleteTeam(long id) {
        return null;
    }

    @Override
    public Team createOrUpdateTeam(String nameTeam, User captain, TypeTeam typeTeam, Collection<User> member) {
        return null;
    }

    @Override
    public List<Team> getTeamsByName(String nameTeam) {
        return null;
    }

    @Override
    public Team getTeamById(long id) {
        return null;
    }
}
