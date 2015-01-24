package main.java.com.netcracker.course.das.server.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Vova on 23.01.2015.
 */
@Entity
@Table(name = "CITIES")
public class City {
    @Id
    @Column(name = "CITY_ID")
    private long id;
    @Column(name = "CITY_NAME")
    private String name;

    public City() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
