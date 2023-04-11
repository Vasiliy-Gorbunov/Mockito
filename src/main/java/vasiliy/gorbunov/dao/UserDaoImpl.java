package vasiliy.gorbunov.dao;

import vasiliy.gorbunov.model.User;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {

    ArrayList<User> UserList = new ArrayList<>();

    public UserDaoImpl() {
        UserList.add(new User("Anton", 30, true));
        UserList.add(new User("Alex", 28, true));
        UserList.add(new User("John", 42, true));
        UserList.add(new User("Anna", 25, false));
        UserList.add(new User("Jane", 32, false));
    }

    @Override
    public User getUserByName(String name) {
        for (User user : UserList) {
            if (user.name().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public ArrayList<User> findAllUsers() {
        return UserList;
    }


}
