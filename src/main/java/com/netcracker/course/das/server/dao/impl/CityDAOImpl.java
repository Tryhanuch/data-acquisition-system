package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.bean.City;
import main.java.com.netcracker.course.das.server.dao.CityDAO;
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
public class CityDAOImpl implements CityDAO {
    @Override
    public void addCity(City city) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(city);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
    }

    @Override
    public City getCity(Long id) throws SQLException {
        Session session = null;
        City result = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (City) session.load(City.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
        return result;
    }
}
