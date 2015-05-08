package org.csf.rm.webapp.jdo.entity;

import javax.persistence.*;

/**
 * Created by apopikov on 07.05.15.
 */
@Entity
@Table(name = "ORDER_STATUSES")
public class OrderStatus {

    private Long id;
    private String title;
    private String description;

    public OrderStatus() {
    }

    public OrderStatus(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_STATUS_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "TITLE", unique = true, nullable = false)
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
}
