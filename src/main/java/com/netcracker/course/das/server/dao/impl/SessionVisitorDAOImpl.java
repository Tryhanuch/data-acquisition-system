package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.bean.SessionVisitor;
import main.java.com.netcracker.course.das.server.dao.SessionVisitorDAO;
import main.java.com.netcracker.course.das.server.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by Vova on 24.01.2015.
 */
public class SessionVisitorDAOImpl implements SessionVisitorDAO {
    @Override
    public void addSessionVisitor(SessionVisitor sessionVisitor) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(sessionVisitor);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
    }

    @Override
    public SessionVisitor getSessionVisitor(Long id) throws SQLException {
        Session session = null;
        SessionVisitor result = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (SessionVisitor) session.load(SessionVisitor.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
        return result;
    }
}
