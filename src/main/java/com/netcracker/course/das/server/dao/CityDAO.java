package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.bean.City;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Vova on 23.01.2015.
 */
public interface CityDAO {
    public void addCity(City city) throws SQLException;

    public City getCity(Long id) throws SQLException;
}
