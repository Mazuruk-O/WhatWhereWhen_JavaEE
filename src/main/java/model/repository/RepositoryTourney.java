package model.repository;

import bean.intfc.Tourney;

import java.sql.Connection;
import java.util.List;

public class RepositoryTourney implements Repository<Tourney> {
    private Connection connection;

    public RepositoryTourney(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void add(Tourney add) {

    }

    @Override
    public void remove(Tourney remove) {

    }

    @Override
    public void update(Tourney update) {

    }

    @Override
    public void setConnection(Connection connection) {

    }

    @Override
    public List<Tourney> query(Specification specification) {
        return null;
    }
}
