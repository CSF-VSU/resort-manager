package org.csf.rm.webapp.jdo.entity;

import javax.persistence.*;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Entity
@Table(name = "\"MANAGERS\"")
public class Manager {

    private Long id;
    private String fullName;
    private Hotel hotel;
    private User user;

    @Id
    @GeneratedValue
    @Column(name = "MANAGER_ID")
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

    @ManyToOne
    @JoinColumn(name = "HOTEL_ID")
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
