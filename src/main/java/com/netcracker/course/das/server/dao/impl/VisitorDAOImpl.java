package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.bean.Visitor;
import main.java.com.netcracker.course.das.server.dao.VisitorDAO;
import main.java.com.netcracker.course.das.server.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.hibernate.exception.ConstraintViolationException;

import java.sql.SQLException;

/**
 * Created by Vova on 23.01.2015.
 */
public class VisitorDAOImpl implements VisitorDAO {
    @Override
    public void addVisitor(Visitor visitor) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(visitor);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
    }

    @Override
    public Visitor getVisitor(String id) throws SQLException {
        Session session = null;
        Visitor result = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Visitor) session.load(Visitor.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
        return result;
    }
}
