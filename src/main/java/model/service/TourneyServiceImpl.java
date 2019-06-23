package model.service;

import bean.AllEnum.TypeTeam;
import bean.intfc.Question;
import bean.intfc.Team;
import bean.intfc.Tourney;
import model.repository.RepositoryTourney;

import java.sql.Connection;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

public class TourneyServiceImpl implements TourneyService {
    private Connection connection;
    private RepositoryTourney repositoryTourney;

    public TourneyServiceImpl(Connection connection) {
        this.connection = connection;
        repositoryTourney = new RepositoryTourney(connection);
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
        repositoryTourney.setConnection(connection);
    }

    public void setRepositoryTourney(RepositoryTourney repositoryTourney) {
        this.repositoryTourney = repositoryTourney;
        this.repositoryTourney.setConnection(connection);
    }

    @Override
    public Tourney deleteTourney(long id) {
        return null;
    }

    @Override
    public Tourney createOrUpdateTourney(String nameTourey, Date dateBegin, int numberQuestion, TypeTeam typeTeam, Collection<Team> teams, Collection<Question> questions) {
        return null;
    }

    @Override
    public Tourney getTourneyById(long id) {
        return null;
    }

    @Override
    public List<Tourney> getTourneyByName(String name) {
        return null;
    }
}
