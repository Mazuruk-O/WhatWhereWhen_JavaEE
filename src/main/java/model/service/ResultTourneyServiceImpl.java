package model.service;

import bean.intfc.ResultTourney;
import bean.intfc.Team;
import bean.intfc.Tourney;
import model.repository.Repository;
import model.repository.RepositoryResultTourney;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public class ResultTourneyServiceImpl implements ResultTourneyService {
    private Connection connection;
    private Repository<ResultTourney> repositoryResultTourney;

    public ResultTourneyServiceImpl(Connection connection, Repository repositoryResultTourney) {
        this.connection = connection;
        this.repositoryResultTourney = new RepositoryResultTourney(connection);
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
        repositoryResultTourney.setConnection(connection);
    }

    public void setRepositoryResultTourney(Repository<ResultTourney> repositoryResultTourney) {
        this.repositoryResultTourney = repositoryResultTourney;
        this.repositoryResultTourney.setConnection(connection);
    }

    @Override
    public ResultTourney createOrUpdateResultTourney(String nameTourney, long id, Map<Team, Integer> numberRightAnswerTeam) {
        return null;
    }

    @Override
    public ResultTourney deleteResultTourney(long id) {
        return null;
    }

    @Override
    public List<Tourney> getTourneysByName(String nameTourney) {
        return null;
    }

    @Override
    public List<Tourney> getTourneysByTeam(String nameTeam) {
        return null;
    }

    @Override
    public List<Tourney> getTourneysById(long id) {
        return null;
    }
}
