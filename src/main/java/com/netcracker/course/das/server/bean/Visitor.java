package main.java.com.netcracker.course.das.server.bean;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by Vova on 23.01.2015.
 */
@Entity
@Table(name = "VISITORS")
public class Visitor {
    @Id
    @Column(name = "VISITOR_ID")
    private long id;
    @Column(name = "IP_ADDRESS")
    private String ipAddress;
    @Column(name = "DATA_FIRST_VISIT")
    private Date dataFirstVisit;
    @Column(name = "IDENTIFIER")
    private String identifier;

    public Visitor(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
