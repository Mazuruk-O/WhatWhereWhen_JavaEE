package model.repository;

import bean.intfc.Question;

import java.sql.Connection;
import java.util.List;

public class RepositoryQuestion implements Repository<Question>{
    private Connection connection;

    public RepositoryQuestion(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void add(Question add) {

    }

    @Override
    public void remove(Question remove) {

    }

    @Override
    public void update(Question update) {

    }

    @Override
    public void setConnection(Connection connection) {

    }

    @Override
    public List<Question> query(Specification specification) {
        return null;
    }
}
