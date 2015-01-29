package main.java.com.netcracker.course.das.server.bean;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

/**
 * Created by Vova on 23.01.2015.
 */
@Entity
@Table(name = "OPERATING_SYSTEMS")
@Proxy(lazy=false)
public class OperatingSystem {
    @Id
    @Column(name = "OPERATING_SYSTEM_ID")
    @GeneratedValue(generator = "OPERATING_SYSTEMS_SEQ")
    @SequenceGenerator(name = "OPERATING_SYSTEMS_SEQ", sequenceName = "OPERATING_SYSTEMS_SEQ")
    private long id;
    @Column(name = "OPERATING_SYSTEM_NAME")
    private String name;
    @Column(name = "OPERATING_SYSTEM_VERSION")
    private String version;

    public OperatingSystem(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
