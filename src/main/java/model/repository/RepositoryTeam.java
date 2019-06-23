package model.repository;

import bean.intfc.Team;

import java.sql.Connection;
import java.util.List;

public class RepositoryTeam implements Repository<Team>{
    private Connection connection;

    public RepositoryTeam(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void add(Team add) {

    }

    @Override
    public void remove(Team remove) {

    }

    @Override
    public void update(Team update) {

    }

    @Override
    public void setConnection(Connection connection) {

    }

    @Override
    public List<Team> query(Specification specification) {
        return null;
    }
}
