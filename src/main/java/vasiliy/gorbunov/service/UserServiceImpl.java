package vasiliy.gorbunov.service;

import vasiliy.gorbunov.dao.UserDaoImpl;
import vasiliy.gorbunov.model.User;

public class UserServiceImpl implements UserService {

    UserDaoImpl dao = new UserDaoImpl();

    @Override
    public boolean checkUserExist(User user) {
        return dao.findAllUsers().contains(user);
    }
}