package model.repository;

import java.sql.Connection;
import java.util.List;

public interface Repository<T> {
    void add(T add);
    void remove(T remove);
    void update(T update);

    public void setConnection(Connection connection);
    List<T> query(Specification specification);
}
