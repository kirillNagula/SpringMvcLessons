package by.nagula.service;

import by.nagula.dao.UserDao;
import by.nagula.entity.User;
import by.nagula.service.exceptions.DuplicateUserException;
import by.nagula.service.exceptions.NoUserException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void createUser(User user){
        if (userDao.containsUserLogin(user.getLogin())){
            throw new DuplicateUserException("This user contains in DB");
        } else {
            userDao.createUser(user);
        }
    }

    public List<User> showAll(){
       return userDao.showAll();
    }

    public User showById(int id){
        if (userDao.containsUserId(id)){
            return userDao.showUserById(id);
        }
        throw new NoUserException("No user in DB");
    }

    public User showByLogin(String login){
        if (userDao.containsUserLogin(login)){
            return userDao.showUserByLogin(login);
        }
        throw new NoUserException("No user in DB");
    }


    public void removeUser(int id){

    }

    public void updateUser(int id){

    }
}
