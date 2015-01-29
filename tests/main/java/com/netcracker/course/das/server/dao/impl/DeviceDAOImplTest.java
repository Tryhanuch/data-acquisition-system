package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Country;
import main.java.com.netcracker.course.das.server.bean.Device;
import main.java.com.netcracker.course.das.server.dao.CountryDAO;
import main.java.com.netcracker.course.das.server.dao.DeviceDAO;
import main.java.com.netcracker.course.das.server.util.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by Vova on 29.01.2015.
 */
public class DeviceDAOImplTest {
    private Factory factory = Factory.getInstance();
    private DeviceDAO deviceDAO = factory.getDeviceDAO();
    private Device testDevice = new Device();

    @Before
    public void init() {
        testDevice.setId(4l);
        testDevice.setType(1);
        testDevice.setInformation("Asus");
        testDevice.setScreenResolution("444 X 444");
    }

    @Test
    public void testGetBrowser() throws SQLException {
        Device device = deviceDAO.getDevice(4l);
        Assert.assertEquals(device, testDevice);
        Assert.assertTrue(device.getId() > 0);
    }
}
