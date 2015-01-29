package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.bean.OperatingSystem;
import main.java.com.netcracker.course.das.server.dao.OperatingSystemDAO;
import main.java.com.netcracker.course.das.server.util.HibernateUtil;
import org.hibernate.Session;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Vova on 23.01.2015.
 */
public class OperatingSystemDAOImpl implements OperatingSystemDAO {
    @Override
    public void addOperatingSystem(OperatingSystem operatingSystem) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(operatingSystem);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
    }

    @Override
    public OperatingSystem getOperatingSystem(Long id) throws SQLException {
        Session session = null;
        OperatingSystem result = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (OperatingSystem) session.load(OperatingSystem.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
        return result;
    }
}
