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
        BrowserDAO browserDAO = factory.getBrowserDAO();
        CityDAO cityDAO = factory.getCityDAO();
        CountryDAO countryDAO = factory.getCountryDAO();
        DeviceDAO deviceDAO = factory.getDeviceDAO();
        OperatingSystemDAO operatingSystemDAO = factory.getOperatingSystemDAO();
        UserDAO userDAO = factory.getUserDAO();
        VisitorDAO visitorDAO = factory.getVisitorDAO();
        SessionVisitorDAO sessionVisitorDAO = factory.getSessionVisitorDAO();

        Browser browser = new Browser();
        City city = new City();
        Country country = new Country();
        Device device = new Device();
        OperatingSystem operatingSystem = new OperatingSystem();
        User user = new User();
        Visitor visitor = new Visitor();
        SessionVisitor sessionVisitor = new SessionVisitor();

        browser.setName("Explorer");
        browser.setVersion("12.2.3.1");
        browserDAO.addBrowser(browser);

        city.setName("Kiev");
        cityDAO.addCity(city);

        country.setName("Ukraine");
        countryDAO.addCountry(country);

        device.setType(0);
        device.setInformation("Android");
        device.setScreenResolution("125 x 340");
        deviceDAO.addDevice(device);

        operatingSystem.setName("Opera");
        operatingSystem.setVersion("2.2.3.1");
        operatingSystemDAO.addOperatingSystem(operatingSystem);

        user.setName("Admin");
        user.setPassword("1111");
        userDAO.addUser(user);

        visitor.setId("BC88D4D4-0DE8-4954-9E57-B3D3F4AEEFB6");
        visitor.setIpAddress("192.168.1.0");
        visitor.setDataFirstVisit(new Date());
        visitor.setCountry(country);
        visitor.setCity(city);
        visitorDAO.addVisitor(visitor);


        sessionVisitor.setDateInput(new Date());
        sessionVisitor.setDateOutput(new Date());
        sessionVisitor.setUrl("htt://google.com.ua");
        sessionVisitor.setBrowser(browser);
        sessionVisitor.setDevice(device);
        sessionVisitor.setOperatingSystem(operatingSystem);
        sessionVisitor.setVisitor(visitor);
        sessionVisitorDAO.addSessionVisitor(sessionVisitor);
        System.out.println("Congretulation!");

//        Browser browser1 = browserDAO.getBrowser(4l);
//        System.out.println(browser1.getId() + "  " + browser1.getName() + "  " + browser1.getVersion());

    }
}
