package org.csf.rm.webapp.jdo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Entity
@Table(name = "\"ROOMS\"")
public class Room implements Serializable {

    private Long id;
    private Integer number;
    private Integer capacity;
    private Hotel hotel;

    @Id
    @GeneratedValue
    @Column(name = "ROOM_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NUMBER")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Column(name = "CAPACITY")
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
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
