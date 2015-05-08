package org.csf.rm.webapp.jdo.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Entity
@Table(name = "\"HOTELS\"")
public class Hotel {

    private Long id;
    private String title;
    private String address;
    private String city;
    private String phone;
    private Set<Room> rooms;
    private Set<Manager> managers;

    public Hotel() {
        // stub
    }

    public Hotel(String title, String address, String city, String phone) {
        this.title = title;
        this.address = address;
        this.city = city;
        this.phone = phone;
    }

    @Id
    @GeneratedValue
    @Column(name = "HOTEL_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @OneToMany(mappedBy = "hotel")
    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    @OneToMany(mappedBy = "hotel")
    public Set<Manager> getManagers() {
        return managers;
    }

    public void setManagers(Set<Manager> managers) {
        this.managers = managers;
    }
}
