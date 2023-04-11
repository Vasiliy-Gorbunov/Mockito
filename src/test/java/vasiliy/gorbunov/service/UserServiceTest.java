package vasiliy.gorbunov.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import vasiliy.gorbunov.dao.UserDaoImpl;
import vasiliy.gorbunov.model.User;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserDaoImpl daoMock;

    @InjectMocks
    private UserServiceImpl out;


    private ArrayList<User> daoList;
    private User user1;
    private User user2;
    private User user3;
    private User user4;
    private User user5;

    @BeforeEach
    public void setUp() {
        user1 = new User("Anton", 30, true);
        user2 = new User("Alex", 28, true);
        user3 = new User("John", 42, true);
        user4 = new User("Anna", 25, false);
        user5 = new User("Jane", 32, false);
        daoList = new ArrayList<>();
        daoList.add(user1);
        daoList.add(user2);
        daoList.add(user3);
        daoList.add(user4);
    }

    @Test
    void shouldReturnTrueByCheckUserExistInDao() {
        when(daoMock.findAllUsers()).thenReturn(daoList);
        assertTrue(out.checkUserExist(user1));
    }

    @Test
    void shouldReturnFalseByCheckUserExistInDao() {
        when(daoMock.findAllUsers()).thenReturn(daoList);
        assertFalse(out.checkUserExist(user5));
    }
}