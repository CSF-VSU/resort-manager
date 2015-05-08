package org.csf.rm.webapp.jdo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Entity
@Table(name = "\"CLIENTS\"")
public class Client implements Serializable {

    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String passport;
    private User user;

    @Id
    @GeneratedValue
    @Column(name = "CLIENT_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FULL_NAME")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "PASSPORT")
    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID", unique = true)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
