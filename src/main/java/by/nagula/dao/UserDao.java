package by.nagula.dao;

import by.nagula.entity.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);
    User showUserById(int id);
    User showUserByLogin(String login);
    List<User> showAll();
    void remove(int id);
    void update(int id);
    boolean containsUserId(int id);
    boolean containsUserLogin(String login);
    boolean containsUserPassword(String password);
}
