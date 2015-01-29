package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.*;
import main.java.com.netcracker.course.das.server.dao.*;
import main.java.com.netcracker.course.das.server.util.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Vova on 29.01.2015.
 */
public class SessionVisitorDAOImplTest {
    private Factory factory = Factory.getInstance();
    private SessionVisitorDAO sessionVisitorDAO = factory.getSessionVisitorDAO();
    private BrowserDAO browserDAO = factory.getBrowserDAO();
    private DeviceDAO deviceDAO = factory.getDeviceDAO();
    private OperatingSystemDAO operatingSystemDAO = factory.getOperatingSystemDAO();
    private VisitorDAO visitorDAO = factory.getVisitorDAO();
    private SessionVisitor testSessionVisitor = new SessionVisitor();

    @Before
    public void init() throws SQLException {
        testSessionVisitor.setId(4l);
        testSessionVisitor.setDateInput(new Date());
        testSessionVisitor.setDateInput(new Date());
        testSessionVisitor.setBrowser(browserDAO.getBrowser(4l));
        testSessionVisitor.setDevice(deviceDAO.getDevice(4l));
        testSessionVisitor.setOperatingSystem(operatingSystemDAO.getOperatingSystem(4l));
        testSessionVisitor.setVisitor(visitorDAO.getVisitor("44444-4444-444"));
    }

    @Test
    public void testGetBrowser() throws SQLException {
        SessionVisitor sessionVisitor = sessionVisitorDAO.getSessionVisitor(4l);
        Assert.assertEquals(sessionVisitor, testSessionVisitor);
        Assert.assertTrue(sessionVisitor.getId() > 0);
    }
}
