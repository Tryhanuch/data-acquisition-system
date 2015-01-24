package main.java.com.netcracker.course.das.server.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Vova on 23.01.2015.
 */
@Entity
@Table(name = "OPERATING_SYSTEMS")
public class OperatingSystem {
    @Id
    @Column(name = "OPERATING_SYSTEM_ID")
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
