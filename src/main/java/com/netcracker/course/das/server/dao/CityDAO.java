package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.City;

import java.sql.SQLException;

/**
 * Created by Vova on 23.01.2015.
 */
public interface CityDAO {
    public void addCity(City city) throws SQLException;
}
