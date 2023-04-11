package vasiliy.gorbunov.dao;

import vasiliy.gorbunov.model.User;

import java.util.ArrayList;

public interface UserDao {
    User getUserByName(String name);
    ArrayList<User> findAllUsers();
}
