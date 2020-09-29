package by.nagula.dao;

import by.nagula.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryUserDao implements UserDao{
    private List<User> users = new ArrayList<>();

    {
        users.add(new User( "Kirill", "kirill", "123"));
        users.add(new User( "Kirill", "kirill2", "1234"));
        users.add(new User( "Kirill", "kirill3", "012"));
    }


    @Override
    public void createUser(User user) {
        users.add(user);
    }

    @Override
    public User showUserById(int id) {
        for (User user: users){
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User showUserByLogin(String login) {
        for (User user: users){
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> showAll() {
        return users;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update(int id) {

    }

    @Override
    public boolean containsUserLogin(String login) {
        for (User user: users){
            if (user.getLogin().equals(login))
                return true;
        }
        return false;
    }

    @Override
    public boolean containsUserPassword(String password) {
        for (User user: users){
            if (user.getPassword().equals(password))
                return true;
        }
        return false;
    }

    @Override
    public boolean containsUserId(int id) {
        for (User user: users){
            if (user.getId() == id)
                return true;
        }
        return false;
    }
}
