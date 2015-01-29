package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.City;
import main.java.com.netcracker.course.das.server.bean.Country;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Vova on 23.01.2015.
 */
public interface CountryDAO {
    public void addCountry(Country country) throws SQLException;

    public Country getCountry(Long id) throws SQLException;
}
