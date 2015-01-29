package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.OperatingSystem;
import main.java.com.netcracker.course.das.server.bean.User;

import java.sql.SQLException;

/**
 * Created by Vova on 23.01.2015.
 */
public interface UserDAO {
    public void addUser(User user) throws SQLException;

    public User getUser(Long id) throws SQLException;
}
