package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.Browser;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Vova on 23.01.2015.
 */
public interface BrowserDAO {
    public void addBrowser(Browser browser) throws SQLException;

    public Browser getBrowser(Long id) throws SQLException;
}
