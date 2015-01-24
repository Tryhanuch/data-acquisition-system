package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.SessionVisitor;

import java.sql.SQLException;

/**
 * Created by Vova on 24.01.2015.
 */
public interface SessionVisitorDAO {
    public void addSessionVisitor(SessionVisitor sessionVisitor) throws SQLException;
}
