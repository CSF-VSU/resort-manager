package org.csf.resortmanager.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by agpopikov on 25/02/15.
 */
public abstract class ClientEntity {

    private Long id;
    private String firstName;
    private String lastName;
    private String secondName;
    private String phone;
    private String email;

    public ClientEntity() {
        //
    }

    public ClientEntity(String firstName, String lastName, String secondName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.phone = phone;
        this.email = email;
    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
