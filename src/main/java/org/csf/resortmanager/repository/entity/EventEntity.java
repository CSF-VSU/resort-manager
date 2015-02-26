package org.csf.resortmanager.repository.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by agpopikov on 25/02/15.
 */
@Entity
@Table(name = "events")
public class EventEntity {

    private Long id;
    private String name;
    private Date datetime;
    private String place;
    private String description;
    private Float price;

    public EventEntity() {
        //
    }

    public EventEntity(String name, Date datetime, String place, String description, Float price) {
        this.name = name;
        this.datetime = datetime;
        this.place = place;
        this.description = description;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "event_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "event_datetime")
    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Column(name = "event_place")
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Column(name = "event_description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "event_price")
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
