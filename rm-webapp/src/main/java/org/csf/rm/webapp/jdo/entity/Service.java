package org.csf.rm.webapp.jdo.entity;

import javax.persistence.*;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Entity
@Table(name = "\"SERVICES\"")
public class Service {

    private Long id;
    private String title;
    private String description;
    private Hotel hotel;

    @Id
    @GeneratedValue
    @Column(name = "SERVICE_ID")
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

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne
    @JoinColumn(name = "HOTEL_ID")
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
