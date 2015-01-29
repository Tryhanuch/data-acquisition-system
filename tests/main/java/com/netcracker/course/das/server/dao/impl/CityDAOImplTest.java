package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.bean.City;
import main.java.com.netcracker.course.das.server.dao.BrowserDAO;
import main.java.com.netcracker.course.das.server.dao.CityDAO;
import main.java.com.netcracker.course.das.server.util.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by Vova on 29.01.2015.
 */
public class CityDAOImplTest {
    private Factory factory = Factory.getInstance();
    private CityDAO cityDAO = factory.getCityDAO();
    private City testCity = new City();

    @Before
    public void init() {
        testCity.setId(4l);
        testCity.setName("Kiev");
    }

    @Test
    public void testGetBrowser() throws SQLException {
        City city = cityDAO.getCity(4l);
        Assert.assertEquals(city, testCity);
        Assert.assertTrue(city.getId() > 0);
    }
}
