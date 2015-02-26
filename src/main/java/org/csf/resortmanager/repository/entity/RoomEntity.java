package org.csf.resortmanager.repository.entity;

import javax.persistence.*;

/**
 * Created by agpopikov on 25/02/15.
 */
@Entity
@Table(name = "rooms")
public class RoomEntity {

    private Long id;
    private Integer number;
    private Integer capacity;
    private RoomClassEntity roomClass;

    public RoomEntity() {
        //
    }

    public RoomEntity(Integer number, Integer capacity, RoomClassEntity roomClass) {
        this.number = number;
        this.capacity = capacity;
        this.roomClass = roomClass;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "room_number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Column(name = "room_capacity")
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @ManyToOne
    @JoinColumn(name = "room_class_id")
    public RoomClassEntity getRoomClass() {
        return roomClass;
    }

    public void setRoomClass(RoomClassEntity roomClass) {
        this.roomClass = roomClass;
    }
}
