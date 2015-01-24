package main.java.com.netcracker.course.das.server.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Vova on 24.01.2015.
 */
@Entity
@Table(name = "SESSIONS")
public class SessionVisitor {
    @Id
    @Column(name = "SESSION_ID")
    private long id;
    @Column(name = "DATE_INPUT")
    private Date dateInput;
    @Column(name = "DATE_OUTPUT")
    private Date dateOutput;

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
}
