package org.csf.rm.webapp.jdo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Entity
@Table(name = "ACCOMMODATIONS")
public class Accommodation implements Serializable {

    private Long id;
    private Date from;
    private Date to;
    private Client client;
    private Room room;

    @Id
    @GeneratedValue
    @Column(name = "ACCOMMODATION_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FROM_DATE")
    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    @Column(name = "TO_DATE")
    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
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
    @JoinColumn(name = "ROOM_ID")
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
