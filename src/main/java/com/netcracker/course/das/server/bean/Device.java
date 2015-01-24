package main.java.com.netcracker.course.das.server.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Vova on 23.01.2015.
 */
@Entity
@Table(name = "DEVICES")
public class Device {
    @Id
    @Column(name = "DEVICE_ID")
    private long id;
    @Column(name = "DEVICE_TYPE")
    private int type;
    @Column(name = "INFORMATION")
    private String information;
    @Column(name = "SCREEN_RESOLUTION")
    private String screenResolution;

    public Device(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screen_resolution) {
        this.screenResolution = screen_resolution;
    }
}
