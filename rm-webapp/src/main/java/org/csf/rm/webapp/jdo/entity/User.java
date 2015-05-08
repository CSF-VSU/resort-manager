package org.csf.rm.webapp.jdo.entity;

import javax.persistence.*;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Entity
@Table(name = "\"USERS\"")
public class User {

    private Long id;
    private String email;
    private String password;
    private String role;

    public User() {
        // stub
    }

    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "ROLE")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
