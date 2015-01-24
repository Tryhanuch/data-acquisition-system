package main.java.com.netcracker.course.das.server.util;

import main.java.com.netcracker.course.das.server.dao.*;
import main.java.com.netcracker.course.das.server.dao.impl.*;

/**
 * Created by Vova on 21.01.2015.
 */
public class Factory {
    private static Factory instance = new Factory();
    private BrowserDAO browserDAO;
    private CityDAO cityDAO;
    private CountryDAO countryDAO;
    private DeviceDAO deviceDAO;
    private OperatingSystemDAO operatingSystemDAO;
    private SessionVisitorDAO sessionVisitorDAO;
    private UserDAO userDAO;
    private VisitorDAO visitorDAO;

    private Factory() {}

    public static Factory getInstance() {
        return Factory.instance;
    }

    public BrowserDAO getBrowserDAO() {
        if(browserDAO == null) {
            browserDAO = new BrowserDAOImpl();
        }
        return browserDAO;
    }

    public CityDAO getCityDAO() {
        if(cityDAO == null) {
            cityDAO = new CityDAOImpl();
        }
        return cityDAO;
    }

    public CountryDAO getCountryDAO() {
        if(countryDAO == null) {
            countryDAO = new CountryDAOImpl();
        }
        return countryDAO;
    }

    public DeviceDAO getDeviceDAO() {
        if(deviceDAO == null) {
            deviceDAO = new DeviceDAOImpl();
        }
        return deviceDAO;
    }

    public OperatingSystemDAO getOperatingSystemDAO() {
        if(operatingSystemDAO == null) {
            operatingSystemDAO = new OperatingSystemDAOImpl();
        }
        return operatingSystemDAO;
    }

    public SessionVisitorDAO getSessionVisitorDAO() {
        if(sessionVisitorDAO == null) {
            sessionVisitorDAO = new SessionVisitorDAOImpl();
        }
        return sessionVisitorDAO;
    }

    public UserDAO getUserDAO() {
        if(userDAO == null) {
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }

    public VisitorDAO getVisitorDAO() {
        if(visitorDAO == null) {
            visitorDAO = new VisitorDAOImpl();
        }
        return visitorDAO;
    }
}
