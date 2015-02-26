package org.csf.resortmanager.repository.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by agpopikov on 25/02/15.
 */
@Entity
@Table(name = "accommodations")
public class AccommodationEntity {

    private Long id;
    private Date from;
    private Date to;
    private ClientEntity client;
    private RoomEntity room;

    public AccommodationEntity() {
        // stub
    }

    public AccommodationEntity(Date from, Date to, ClientEntity client, RoomEntity room) {
        this.from = from;
        this.to = to;
        this.client = client;
        this.room = room;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accommodation_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "accommodation_from")
    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    @Column(name = "accommodation_to")
    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public RoomEntity getRoom() {
        return room;
    }

    public void setRoom(RoomEntity room) {
        this.room = room;
    }
}
