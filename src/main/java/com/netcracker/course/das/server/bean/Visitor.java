package main.java.com.netcracker.course.das.server.bean;


import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Vova on 23.01.2015.
 */
@Entity
@Table(name = "VISITORS")
@Proxy(lazy=false)
public class Visitor {
    @Id
    @Column(name = "VISITOR_ID")
    private String id;
    @Column(name = "IP_ADDRESS")
    private String ipAddress;
    @Column(name = "DATA_FIRST_VISIT")
    private Date dataFirstVisit;
    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
    private Country country;
    @ManyToOne
    @JoinColumn(name = "CITY_ID", referencedColumnName = "CITY_ID")
    private City city;

    public Visitor(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Date getDataFirstVisit() {
        return dataFirstVisit;
    }

    public void setDataFirstVisit(Date dataFirstVisit) {
        this.dataFirstVisit = dataFirstVisit;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
