package main.java.com.netcracker.course.das.server.util;

import main.java.com.netcracker.course.das.server.bean.*;
import main.java.com.netcracker.course.das.server.dao.*;

import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Vova on 21.01.2015.
 */
public class Project {
    public static void main(String[] args) throws SQLException {
        Factory factory = Factory.getInstance();
        SessionVisitorDAO sessionVisitorDAO = factory.getSessionVisitorDAO();
        BrowserDAO browserDAO = factory.getBrowserDAO();
        CityDAO cityDAO = factory.getCityDAO();
        CountryDAO countryDAO = factory.getCountryDAO();
        DeviceDAO deviceDAO = factory.getDeviceDAO();
        OperatingSystemDAO operatingSystemDAO = factory.getOperatingSystemDAO();
        UserDAO userDAO = factory.getUserDAO();
        VisitorDAO visitorDAO = factory.getVisitorDAO();

        SessionVisitor sessionVisitor = new SessionVisitor();
        Browser browser = new Browser();
        City city = new City();
        Country country = new Country();
        Device device = new Device();
        OperatingSystem operatingSystem = new OperatingSystem();
        User user = new User();
        Visitor visitor = new Visitor();

        sessionVisitor.setDateInput(new Date());
        sessionVisitor.setDateOutput(new Date());
        sessionVisitorDAO.addSessionVisitor(sessionVisitor);

        browser.setName("Opera");
        browser.setVersion("12.2.3.1");
        browserDAO.addBrowser(browser);

        city.setName("Kiev");
        cityDAO.addCity(city);

        country.setName("Ukraine");
        countryDAO.addCountry(country);

        device.setType(1);
        device.setInformation("Android");
        device.setScreenResolution("125 x 340");
        deviceDAO.addDevice(device);

        operatingSystem.setName("Opera");
        operatingSystem.setVersion("2.2.3.1");
        operatingSystemDAO.addOperatingSystem(operatingSystem);



        user.setName("Admin");
        user.setPassword("1111");
        userDAO.addUser(user);

        visitor.setIpAddress("192.168.1.0");
        visitor.setDataFirstVisit(new Date());
        visitor.setIdentifier("identifier");
        visitorDAO.addVisitor(visitor);

        System.out.println("Congretulation!");
    }
}
