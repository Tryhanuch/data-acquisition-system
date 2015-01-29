package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.OperatingSystem;
import main.java.com.netcracker.course.das.server.bean.User;
import main.java.com.netcracker.course.das.server.dao.OperatingSystemDAO;
import main.java.com.netcracker.course.das.server.dao.UserDAO;
import main.java.com.netcracker.course.das.server.util.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by Vova on 29.01.2015.
 */
public class UserDAOImplTest {
    private Factory factory = Factory.getInstance();
    private UserDAO userDAO = factory.getUserDAO();
    private User testUser = new User();

    @Before
    public void init() {
        testUser.setId(4l);
        testUser.setName("Admin");
        testUser.setPassword("11111");
    }

    @Test
    public void testGetBrowser() throws SQLException {
        User user = userDAO.getUser(4l);
        Assert.assertEquals(user, testUser);
        Assert.assertTrue(user.getId() > 0);
    }
}
