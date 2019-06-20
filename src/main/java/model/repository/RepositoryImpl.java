package model.repository;

import java.sql.Connection;
import java.util.List;

public class RepositoryImpl<T> implements Repository<T> {
    private Connection connection;

    public RepositoryImpl(Connection connection){
        this.connection = connection;
    }

    @Override
    public void add(T add) {

    }

    @Override
    public void remove(T remove) {

    }

    @Override
    public void update(T update) {

    }

    @Override
    public List<T> query(Specification specification) {
        return null;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
