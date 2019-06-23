package model.service;

import bean.intfc.User;
import model.repository.*;

import java.sql.Connection;
import java.util.List;

public class UserServiceImpl implements UserService {
    private Repository userRepositoty;
    private Connection connection;

    public UserServiceImpl(Connection connection){
        this.connection = connection;
        this.userRepositoty = new RepositoryUser(connection);
    }

    public void setUserRepositoty(Repository userRepositoty) {
        this.userRepositoty = userRepositoty;
        this.userRepositoty.setConnection(connection);
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
        this.userRepositoty.setConnection(connection);
    }

    @Override
    public User deleteUser(long id) {
        return null;
    }

    @Override
    public User createOrUpdateUser(String name, long id, int level) {
        return null;
    }

    @Override
    public List<User> getUsersByName(String name) {
        return null;
    }

    @Override
    public List<User> getAllDeletedUsers() {
        return null;
    }

    @Override
    public List<User> getUsersBetweenLevels(int fromLevel, int toLevel) {
        return null;
    }

    @Override
    public List<User> filterOnlyActiveUsers(List<User> allUsers) {
        return null;
    }

    @Override
    public User getUsersById(long userId) {
        return null;
    }
}
