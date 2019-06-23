package model.repository;

import bean.intfc.ResultTourney;

import java.sql.Connection;
import java.util.List;

public class RepositoryResultTourney implements Repository<ResultTourney> {
    private Connection connection;

    public RepositoryResultTourney(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void add(ResultTourney add) {

    }

    @Override
    public void remove(ResultTourney remove) {

    }

    @Override
    public void update(ResultTourney update) {

    }

    @Override
    public void setConnection(Connection connection) {

    }

    @Override
    public List<ResultTourney> query(Specification specification) {
        return null;
    }
}
