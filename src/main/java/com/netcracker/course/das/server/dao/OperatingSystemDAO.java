package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.Country;
import main.java.com.netcracker.course.das.server.bean.OperatingSystem;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Vova on 23.01.2015.
 */
public interface OperatingSystemDAO {
    public void addOperatingSystem(OperatingSystem operatingSystem) throws SQLException;

    public OperatingSystem getOperatingSystem(Long id) throws SQLException;
}
