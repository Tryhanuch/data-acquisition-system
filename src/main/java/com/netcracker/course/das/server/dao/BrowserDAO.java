package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.Browser;

import java.sql.SQLException;

/**
 * Created by Vova on 23.01.2015.
 */
public interface BrowserDAO {
    public void addBrowser(Browser browser) throws SQLException;
}
