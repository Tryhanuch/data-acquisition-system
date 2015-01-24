package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.OperatingSystem;
import java.sql.SQLException;

/**
 * Created by Vova on 23.01.2015.
 */
public interface OperatingSystemDAO {
    public void addOperatingSystem(OperatingSystem operatingSystem) throws SQLException;
}
