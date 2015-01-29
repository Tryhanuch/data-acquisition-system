package main.java.com.netcracker.course.das.server.dao.impl;

import main.java.com.netcracker.course.das.server.bean.Browser;
import main.java.com.netcracker.course.das.server.dao.BrowserDAO;
import main.java.com.netcracker.course.das.server.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Vova on 23.01.2015.
 */

public class BrowserDAOImpl implements BrowserDAO {
    @Override
    public void addBrowser(Browser browser) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
//            Long result = null;
//            SQLQuery query = session.createSQLQuery("SELECT * FROM browsers where browser_name = :name AND browser_version = :version");
//            query.setParameter("name", browser.getName());
//            query.setParameter("version", browser.getVersion());
//            List<Object> records = query.list();
//            Iterator itr = records.iterator();
//            while(itr.hasNext()){
//                Object[] obj = (Object[]) itr.next();
//                //now you have one array of Object for each row
//                result = Long.parseLong(String.valueOf(obj[0]));
//                System.out.println(result);
//            }
//            if (result == null) {
//                session.save(browser);
//            }
            session.save(browser);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
    }

    @Override
    public Browser getBrowser(Long id) throws SQLException {
        Browser result = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Browser) session.load(Browser.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if((session != null) && (session.isOpen()))session.close();
        }
        return result;
    }
}
