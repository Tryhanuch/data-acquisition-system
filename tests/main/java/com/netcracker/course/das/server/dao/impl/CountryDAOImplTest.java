package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.City;
import main.java.com.netcracker.course.das.server.bean.Country;
import main.java.com.netcracker.course.das.server.dao.CityDAO;
import main.java.com.netcracker.course.das.server.dao.CountryDAO;
import main.java.com.netcracker.course.das.server.util.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by Vova on 29.01.2015.
 */
public class CountryDAOImplTest {
    private Factory factory = Factory.getInstance();
    private CountryDAO countryDAO = factory.getCountryDAO();
    private Country testCountry = new Country();

    @Before
    public void init() {
        testCountry.setId(4l);
        testCountry.setName("Kiev");
    }

    @Test
    public void testGetBrowser() throws SQLException {
        Country country = countryDAO.getCountry(4l);
        Assert.assertEquals(country, testCountry);
        Assert.assertTrue(country.getId() > 0);
    }
}
