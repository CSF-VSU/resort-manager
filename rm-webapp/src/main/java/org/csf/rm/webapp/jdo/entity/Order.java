package org.csf.rm.webapp.jdo.entity;

import javax.persistence.*;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Entity
@Table(name = "\"ORDERS\"")
public class Order {

    private Long id;
    private String comment;
    private Client client;
    private Service service;
    private OrderStatus status;

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "COMMENT")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @ManyToOne
    @JoinColumn(name = "SERVICE_ID")
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @ManyToOne
    @JoinColumn(name = "ORDER_STATUS_ID")
    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
