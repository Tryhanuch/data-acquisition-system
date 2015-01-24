package main.java.com.netcracker.course.das.server.dao;

import main.java.com.netcracker.course.das.server.bean.Country;

import java.sql.SQLException;

/**
 * Created by Vova on 23.01.2015.
 */
public interface CountryDAO {
    public void addCountry(Country country) throws SQLException;
}
