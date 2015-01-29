package main.java.com.netcracker.course.das.server.bean;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Vova on 24.01.2015.
 */
@Entity
@Table(name = "SESSIONS")
@Proxy(lazy=false)
public class SessionVisitor {
    @Id
    @Column(name = "SESSION_ID")
    @GeneratedValue(generator = "SESSIONS_SEQ")
    @SequenceGenerator(name = "SESSIONS_SEQ", sequenceName = "SESSIONS_SEQ")
    private long id;
    @Column(name = "DATE_INPUT")
    private Date dateInput;
    @Column(name = "DATE_OUTPUT")
    private Date dateOutput;
    @Column(name = "URL")
    private String url;
    @ManyToOne
    @JoinColumn(name = "VISITOR_ID", referencedColumnName = "VISITOR_ID")
    private Visitor visitor;
    @ManyToOne
    @JoinColumn(name = "DEVICE_ID", referencedColumnName = "DEVICE_ID")
    private Device device;
    @ManyToOne
    @JoinColumn(name = "BROWSER_ID", referencedColumnName = "BROWSER_ID")
    private Browser browser;
    @ManyToOne
    @JoinColumn(name = "OPERATING_SYSTEM_ID", referencedColumnName = "OPERATING_SYSTEM_ID")
    private OperatingSystem operatingSystem;

    public SessionVisitor() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateInput() {
        return dateInput;
    }

    public void setDateInput(Date dateInput) {
        this.dateInput = dateInput;
    }

    public Date getDateOutput() {
        return dateOutput;
    }

    public void setDateOutput(Date dateOutput) {
        this.dateOutput = dateOutput;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {this.operatingSystem = operatingSystem;


    }
}
