package vasiliy.gorbunov.dao;

import vasiliy.gorbunov.model.User;

import java.awt.*;

public interface UserDao {
    User getUserByName(String name);
    List findAllUsers();
}
