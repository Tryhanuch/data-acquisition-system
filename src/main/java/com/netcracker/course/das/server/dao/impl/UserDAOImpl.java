package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.bean.User;
import main.java.com.netcracker.course.das.server.dao.UserDAO;
import main.java.com.netcracker.course.das.server.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by Vova on 23.01.2015.
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void addUser(User user) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
    }

    @Override
    public User getUser(Long id) throws SQLException {
        Session session = null;
        User result = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (User) session.load(User.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
        return result;
    }
}
