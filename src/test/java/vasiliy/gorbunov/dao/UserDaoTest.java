package vasiliy.gorbunov.dao;

import org.junit.jupiter.api.Test;
import vasiliy.gorbunov.model.User;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    UserDaoImpl dao = new UserDaoImpl();

    @Test
    void shouldReturnTrueByFindUserFromList() {
        String name = "Alex";
        User actual = dao.getUserByName(name);
        User expected = new User("Alex", 28, true);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFalseByFindUserFromList() {
        String name = "Jerry";
        User actual = dao.getUserByName(name);
        User expected = new User("Jerry", 38, true);
        assertNotEquals(expected, actual);
        assertNull(actual);
    }
}