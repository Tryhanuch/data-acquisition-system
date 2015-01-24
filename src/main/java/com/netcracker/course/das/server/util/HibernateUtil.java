package main.java.com.netcracker.course.das.server.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by Vova on 21.01.2015.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    private HibernateUtil() {}

    static {
        try {
            sessionFactory = new Configuration().configure("main/resources/hibernate/hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable throwable) {
            throw new ExceptionInInitializerError(throwable);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
