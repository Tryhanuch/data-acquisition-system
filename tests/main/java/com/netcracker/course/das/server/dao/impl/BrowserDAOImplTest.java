package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.dao.BrowserDAO;
import main.java.com.netcracker.course.das.server.util.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by Vova on 29.01.2015.
 */
public class BrowserDAOImplTest {
    private Factory factory = Factory.getInstance();
    private BrowserDAO browserDAO = factory.getBrowserDAO();
    private Browser testBrowser = new Browser();

    @Before
    public void init() {
        testBrowser.setId(4l);
        testBrowser.setName("Opera");
        testBrowser.setVersion("3.2.0");
    }

    @Test
    public void testGetBrowser() throws SQLException {
        Browser browser = browserDAO.getBrowser(4l);
        Assert.assertEquals(browser, testBrowser);
        Assert.assertTrue(browser.getId() > 0);
    }
}
