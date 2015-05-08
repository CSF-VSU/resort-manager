package org.csf.rm.webapp.jdo.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Entity
@Table(name = "\"EVENTS\"")
public class Event {

    private Long id;
    private String title;
    private String place;
    private String description;
    private BigDecimal price;

    @Id
    @GeneratedValue
    @Column(name = "EVENT_ID")
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

    @Column(name = "PLACE")
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
