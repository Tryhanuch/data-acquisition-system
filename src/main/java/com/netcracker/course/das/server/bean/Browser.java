package main.java.com.netcracker.course.das.server.bean;

import javafx.fxml.Initializable;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

/**
 * Created by Vova on 23.01.2015.
 */
@Entity
@Table(name = "BROWSERS")
@Proxy(lazy=false)
public class Browser {
    @Id
    @Column(name = "BROWSER_ID")
    @GeneratedValue(generator = "BROWSERS_SEQ")
    @SequenceGenerator(name = "BROWSERS_SEQ", sequenceName = "BROWSERS_SEQ")
    private Long id;
    @Column(name = "BROWSER_NAME")
    private String name;
    @Column(name = "BROWSER_VERSION")
    private String version;

    public Browser() {}

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Browser)) return false;

        Browser browser = (Browser) o;

        if (id != null ? !id.equals(browser.id) : browser.id != null) return false;
        if (name != null ? !name.equals(browser.name) : browser.name != null) return false;
        if (version != null ? !version.equals(browser.version) : browser.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
