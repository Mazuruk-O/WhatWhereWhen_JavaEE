package model.repository;

import java.util.List;

public interface Repository<T> {
    void add(T add);
    void remove(T remove);
    void update(T update);

    List<T> query(Specification specification);
}
