package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.Visitor;

import java.sql.SQLException;

/**
 * Created by Vova on 23.01.2015.
 */
public interface VisitorDAO {
    public void addVisitor(Visitor visitor) throws SQLException;
}
