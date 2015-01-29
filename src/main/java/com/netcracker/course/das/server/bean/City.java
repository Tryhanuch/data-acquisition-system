package main.java.com.netcracker.course.das.server.bean;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

/**
 * Created by Vova on 23.01.2015.
 */
@Entity
@Table(name = "CITIES")
@Proxy(lazy=false)
public class City {
    @Id
    @Column(name = "CITY_ID")
    @GeneratedValue(generator = "CITIES_SEQ")
    @SequenceGenerator(name = "CITIES_SEQ", sequenceName = "CITIES_SEQ")
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
