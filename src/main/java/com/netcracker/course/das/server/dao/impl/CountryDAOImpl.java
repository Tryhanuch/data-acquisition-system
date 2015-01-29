package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.bean.Country;
import main.java.com.netcracker.course.das.server.dao.CountryDAO;
import main.java.com.netcracker.course.das.server.util.HibernateUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vova on 23.01.2015.
 */
public class CountryDAOImpl implements CountryDAO {
    @Override
    public void addCountry(Country country) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(country);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
    }

    @Override
    public Country getCountry(Long id) throws SQLException {
        Session session = null;
        Country result = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Country) session.load(Country.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
        return result;
    }
}
