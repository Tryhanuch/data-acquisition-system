package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.Device;

import java.sql.SQLException;

/**
 * Created by Vova on 23.01.2015.
 */
public interface DeviceDAO {
    public void addDevice(Device device) throws SQLException;
}
