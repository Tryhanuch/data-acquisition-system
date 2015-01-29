package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.Country;
import main.java.com.netcracker.course.das.server.bean.Device;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Vova on 23.01.2015.
 */
public interface DeviceDAO {
    public void addDevice(Device device) throws SQLException;

    public Device getDevice(Long id) throws SQLException;
}
