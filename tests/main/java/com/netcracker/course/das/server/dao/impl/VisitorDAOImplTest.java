package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Device;
import main.java.com.netcracker.course.das.server.bean.Visitor;
import main.java.com.netcracker.course.das.server.dao.CityDAO;
import main.java.com.netcracker.course.das.server.dao.CountryDAO;
import main.java.com.netcracker.course.das.server.dao.DeviceDAO;
import main.java.com.netcracker.course.das.server.dao.VisitorDAO;
import main.java.com.netcracker.course.das.server.util.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Vova on 29.01.2015.
 */
public class VisitorDAOImplTest {
    private Factory factory = Factory.getInstance();
    private VisitorDAO visitorDAO = factory.getVisitorDAO();
    private CountryDAO countryDAO = factory.getCountryDAO();
    private CityDAO cityDAO = factory.getCityDAO();
    private Visitor testVisitor = new Visitor();

    @Before
    public void init() throws SQLException {
        testVisitor.setId("");
        testVisitor.setIpAddress("192.168.0.1");
        testVisitor.setDataFirstVisit(new Date());
        testVisitor.setCountry(countryDAO.getCountry(4l));
        testVisitor.setCity(cityDAO.getCity(4l));
    }

    @Test
    public void testGetBrowser() throws SQLException {
        Visitor visitor = visitorDAO.getVisitor("");
        Assert.assertEquals(visitor, testVisitor);
    }
}
