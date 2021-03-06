package main.java.com.netcracker.course.das.server.bean;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

/**
 * Created by Vova on 23.01.2015.
 */
@Entity
@Table(name = "USERS")
@Proxy(lazy=false)
public class User {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(generator = "USERS_SEQ")
    @SequenceGenerator(name = "USERS_SEQ", sequenceName = "USERS_SEQ")
    private long id;
    @Column(name = "USERNAME")
    private String name;
    @Column(name = "PASSWORD")
    private String password;

    public User(){}

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
