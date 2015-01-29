package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Device;
import main.java.com.netcracker.course.das.server.bean.OperatingSystem;
import main.java.com.netcracker.course.das.server.dao.DeviceDAO;
import main.java.com.netcracker.course.das.server.dao.OperatingSystemDAO;
import main.java.com.netcracker.course.das.server.util.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by Vova on 29.01.2015.
 */
public class OperatingSystemDAOImplTest {
    private Factory factory = Factory.getInstance();
    private OperatingSystemDAO operatingSystemDAO = factory.getOperatingSystemDAO();
    private OperatingSystem testOperatingSystem = new OperatingSystem();

    @Before
    public void init() {
        testOperatingSystem.setId(4l);
        testOperatingSystem.setName("Windows");
        testOperatingSystem.setVersion("7");
    }

    @Test
    public void testGetBrowser() throws SQLException {
        OperatingSystem operatingSystem = operatingSystemDAO.getOperatingSystem(4l);
        Assert.assertEquals(operatingSystem, testOperatingSystem);
        Assert.assertTrue(operatingSystem.getId() > 0);
    }
}
