package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.bean.Device;
import main.java.com.netcracker.course.das.server.dao.DeviceDAO;
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
public class DeviceDAOImpl implements DeviceDAO {
    @Override
    public void addDevice(Device device) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(device);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
    }

    @Override
    public Device getDevice(Long id) throws SQLException {
        Session session = null;
        Device result = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Device) session.load(Device.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
        return result;
    }
}
