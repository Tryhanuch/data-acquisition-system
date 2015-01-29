package main.java.com.netcracker.course.das.server.bean;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

/**
 * Created by Vova on 23.01.2015.
 */
@Entity
@Table(name = "COUNTRIES")
@Proxy(lazy=false)
public class Country {
    @Id
    @Column(name = "COUNTRY_ID")
    @GeneratedValue(generator = "COUNTRIES_SEQ")
    @SequenceGenerator(name = "COUNTRIES_SEQ", sequenceName = "COUNTRIES_SEQ")
    private long id;
    @Column(name = "COUNTRY_NAME")
    private String name;

    public Country() {}

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
