package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.OperatingSystem;
import main.java.com.netcracker.course.das.server.bean.SessionVisitor;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Vova on 24.01.2015.
 */
public interface SessionVisitorDAO {
    public void addSessionVisitor(SessionVisitor sessionVisitor) throws SQLException;

    public SessionVisitor getSessionVisitor(Long id) throws SQLException;
}
